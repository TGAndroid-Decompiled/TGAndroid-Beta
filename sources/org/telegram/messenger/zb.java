package org.telegram.messenger;

import android.app.ActivityManager;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
public final class zb {
    public static Bitmap M;
    public final ConcurrentHashMap A;
    public final LinkedList B;
    public final HashMap C;
    public final HashMap D;
    public int E;
    public String F;
    public int G;
    public File H;
    public final db f26758b;
    public final db f26759c;
    public final db d;
    public final db f26760e;
    public final com.google.android.gms.internal.cast.c0 f26770p;
    public final p5 f26771q;
    public final p5 f26772r;
    public final p5 f26773s;
    public final HashMap f26774t;
    public final ConcurrentHashMap f26775u;
    public final HashMap v;
    public final HashMap f26776w;
    public int f26777x;
    public int f26778y;
    public final boolean f26779z;
    public static final ThreadLocal I = new ThreadLocal();
    public static final ThreadLocal J = new ThreadLocal();
    public static final byte[] K = new byte[12];
    public static final byte[] L = new byte[12];
    public static volatile zb N = null;
    public final HashMap f26757a = new HashMap();
    public final ArrayList f26761f = new ArrayList();
    public final HashMap f26762g = new HashMap();
    public final HashMap h = new HashMap();
    public final ConcurrentHashMap f26763i = new ConcurrentHashMap();
    public final HashSet f26764j = new HashSet();
    public final SparseArray f26765k = new SparseArray();
    public final HashMap f26766l = new HashMap();
    public final SparseArray f26767m = new SparseArray();
    public final LinkedList f26768n = new LinkedList();
    public final LinkedList f26769o = new LinkedList();

    public zb() {
        boolean z10;
        int i3;
        com.google.android.gms.internal.cast.c0 c0Var = new com.google.android.gms.internal.cast.c0(2);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c0Var.f6882b = new lf.a(c0Var, new PriorityBlockingQueue(10, new b5.b(4)));
        this.f26770p = c0Var;
        this.f26771q = new p5("cacheThumbOutQueue");
        p5 p5Var = new p5("thumbGeneratingQueue");
        this.f26772r = p5Var;
        this.f26773s = new p5("imageLoadQueue");
        this.f26774t = new HashMap();
        this.f26775u = new ConcurrentHashMap();
        this.v = new HashMap();
        this.f26776w = new HashMap();
        this.f26777x = 0;
        this.f26778y = 0;
        this.A = new ConcurrentHashMap();
        this.B = new LinkedList();
        this.C = new HashMap();
        this.D = new HashMap();
        this.E = 0;
        this.F = null;
        this.G = 0;
        this.H = null;
        p5Var.setPriority(1);
        int memoryClass = ((ActivityManager) t0.f25457b.getSystemService("activity")).getMemoryClass();
        if (memoryClass >= 192) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26779z = z10;
        if (z10) {
            i3 = 30;
        } else {
            i3 = 15;
        }
        int min = Math.min(i3, memoryClass / 7) * 1048576;
        float f10 = min;
        this.f26759c = new db(this, (int) (0.8f * f10), 0);
        this.f26758b = new db(this, (int) (f10 * 0.2f), 1);
        this.d = new db(this, min / 4, 2);
        this.f26760e = new db(this);
        SparseArray sparseArray = new SparseArray();
        File E0 = g0.E0();
        if (!E0.isDirectory()) {
            try {
                E0.mkdirs();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        g0.G(new File(E0, ".nomedia"));
        sparseArray.put(4, E0);
        for (int i10 = 0; i10 < 4; i10++) {
            w7.G(i10).F = new jb(this, i10);
        }
        w7.L = sparseArray;
        androidx.mediarouter.app.f fVar = new androidx.mediarouter.app.f(this, 8);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
        intentFilter.addAction("android.intent.action.MEDIA_CHECKING");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_NOFS");
        intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
        intentFilter.addAction("android.intent.action.MEDIA_SHARED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTABLE");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                t0.f25457b.registerReceiver(fVar, intentFilter, 4);
            } else {
                t0.f25457b.registerReceiver(fVar, intentFilter);
            }
        } catch (Throwable unused) {
        }
        i(null);
    }

    public static File A(String str) {
        String B = B(str, "jpg");
        File z10 = w7.z(4);
        return new File(z10, Utilities.a(str) + "." + B);
    }

    public static String B(String str, String str2) {
        String str3;
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.length() > 1) {
            str = lastPathSegment;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str3 = str.substring(lastIndexOf + 1);
        } else {
            str3 = null;
        }
        if (str3 != null && str3.length() != 0 && str3.length() <= 4) {
            return str3;
        }
        return str2;
    }

    public static zb D() {
        zb zbVar;
        zb zbVar2 = N;
        if (zbVar2 == null) {
            synchronized (zb.class) {
                try {
                    zbVar = N;
                    if (zbVar == null) {
                        zbVar = new zb();
                        N = zbVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zbVar;
        }
        return zbVar2;
    }

    public static File E() {
        File file = t0.f25457b.getExternalMediaDirs()[0];
        if (!TextUtils.isEmpty(az.f21632h0)) {
            for (int i3 = 0; i3 < t0.f25457b.getExternalMediaDirs().length; i3++) {
                File file2 = t0.f25457b.getExternalMediaDirs()[i3];
                if (file2 != null && file2.getPath().startsWith(az.f21632h0)) {
                    file = t0.f25457b.getExternalMediaDirs()[i3];
                }
            }
        }
        return file;
    }

    public static android.graphics.Bitmap F(java.lang.String r12, byte[] r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zb.F(java.lang.String, byte[]):android.graphics.Bitmap");
    }

    public static synchronized Bitmap G() {
        Bitmap bitmap;
        synchronized (zb.class) {
            try {
                Bitmap bitmap2 = M;
                if (bitmap2 != null) {
                    if (bitmap2.isRecycled()) {
                    }
                    bitmap = M;
                }
                Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                M = createBitmap;
                createBitmap.eraseColor(-16777216);
                bitmap = M;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bitmap;
    }

    public static boolean I(String str) {
        if (str != null && str.endsWith("avatar")) {
            return true;
        }
        return false;
    }

    public static android.graphics.Bitmap K(java.lang.String r18, android.net.Uri r19, float r20, float r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zb.K(java.lang.String, android.net.Uri, float, float, boolean):android.graphics.Bitmap");
    }

    public static void W(org.telegram.tgnet.TLRPC.Message r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zb.W(org.telegram.tgnet.TLRPC$Message):void");
    }

    public static void X(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                W((TLRPC.Message) arrayList.get(i3));
            }
        }
    }

    public static TLRPC.PhotoSize Y(Bitmap bitmap, float f10, float f11, int i3, int i10, int i11) {
        return b0(null, bitmap, Bitmap.CompressFormat.JPEG, f10, f11, i3, false, i10, i11, false);
    }

    public static TLRPC.PhotoSize Z(Bitmap bitmap, float f10, float f11, int i3, boolean z10) {
        return b0(null, bitmap, Bitmap.CompressFormat.JPEG, f10, f11, i3, z10, 0, 0, false);
    }

    public static TLRPC.PhotoSize a0(Bitmap bitmap, Bitmap.CompressFormat compressFormat, float f10, float f11, int i3) {
        return b0(null, bitmap, compressFormat, f10, f11, i3, false, 101, 101, false);
    }

    public static TLRPC.PhotoSize b0(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, float f10, float f11, int i3, boolean z10, int i10, int i11, boolean z11) {
        boolean z12;
        float f12;
        int i12;
        float max;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            if (width != 0.0f && height != 0.0f) {
                float max2 = Math.max(width / f10, height / f11);
                if (i10 != 0 && i11 != 0 && (width < i10 || height < i11)) {
                    if (i12 < 0 && height > i11) {
                        max = width / f12;
                    } else {
                        if (width > f12) {
                            float f13 = i11;
                            if (height < f13) {
                                max = height / f13;
                            }
                        }
                        max = Math.max(width / f12, height / i11);
                    }
                    max2 = max;
                    z12 = true;
                } else {
                    z12 = false;
                }
                float f14 = max2;
                int i13 = (int) (width / f14);
                int i14 = (int) (height / f14);
                if (i14 != 0 && i13 != 0) {
                    try {
                        return c0(photoSize, bitmap, compressFormat, i13, i14, f14, i3, z10, z12, z11);
                    } catch (Throwable th2) {
                        a8.g(th2, true);
                        D().j();
                        System.gc();
                        try {
                            return c0(photoSize, bitmap, compressFormat, i13, i14, f14, i3, z10, z12, z11);
                        } catch (Throwable th3) {
                            a8.g(th3, true);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static org.telegram.tgnet.TLRPC.PhotoSize c0(org.telegram.tgnet.TLRPC.PhotoSize r5, android.graphics.Bitmap r6, android.graphics.Bitmap.CompressFormat r7, int r8, int r9, float r10, int r11, boolean r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zb.c0(org.telegram.tgnet.TLRPC$PhotoSize, android.graphics.Bitmap, android.graphics.Bitmap$CompressFormat, int, int, float, int, boolean, boolean, boolean):org.telegram.tgnet.TLRPC$PhotoSize");
    }

    public static int d(zb zbVar, BitmapDrawable bitmapDrawable) {
        if (bitmapDrawable instanceof org.telegram.ui.Components.t5) {
            org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) bitmapDrawable;
            return Math.max(t5Var.getIntrinsicHeight() * t5Var.getIntrinsicWidth(), t5Var.f38267k0 * t5Var.f38266j0) * 12;
        } else if (bitmapDrawable instanceof ch0) {
            ch0 ch0Var = (ch0) bitmapDrawable;
            int i3 = ch0Var.f32720b * ch0Var.f32722c;
            if (ch0Var.H) {
                return i3 * 2;
            }
            return i3 * 8;
        } else {
            return bitmapDrawable.getBitmap().getByteCount();
        }
    }

    public static boolean d0(Uri uri, String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (str == null && uri != null && uri.getScheme() != null) {
            if (uri.getScheme().contains("file")) {
                str = uri.getPath();
            } else {
                try {
                    str = g0.T0(uri);
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
        }
        if (str != null) {
            BitmapFactory.decodeFile(str, options);
        } else if (uri != null) {
            try {
                InputStream openInputStream = t0.f25457b.getContentResolver().openInputStream(uri);
                BitmapFactory.decodeStream(openInputStream, null, options);
                openInputStream.close();
            } catch (Throwable th3) {
                a8.g(th3, true);
                return false;
            }
        }
        float f10 = options.outWidth;
        float f11 = options.outHeight;
        if (f10 / f11 > 10.0f || f11 / f10 > 10.0f) {
            return true;
        }
        return false;
    }

    public static boolean e0(ac acVar, String str) {
        if (!str.endsWith("_firstframe") && !str.endsWith("_lastframe")) {
            if ((acVar != null && (zi.L2(acVar.f21490i, true) || acVar.f21497p == 1 || zi.O4(acVar.f21490i))) || I(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean f(File file, File file2, int i3) {
        File file3;
        File file4;
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (i3 == 0) {
                    file3 = new File(file, "000000000_999999_temp.f");
                    file4 = new File(file2, "000000000_999999.f");
                } else {
                    if (i3 != 3 && i3 != 5 && i3 != 6) {
                        if (i3 == 1) {
                            file3 = new File(file, "000000000_999999_temp.f");
                            file4 = new File(file2, "000000000_999999.f");
                        } else if (i3 == 2) {
                            file3 = new File(file, "000000000_999999_temp.f");
                            file4 = new File(file2, "000000000_999999.f");
                        } else {
                            file4 = null;
                            file3 = null;
                        }
                    }
                    file3 = new File(file, "000000000_999999_temp.f");
                    file4 = new File(file2, "000000000_999999.f");
                }
                bArr = new byte[1024];
                file3.createNewFile();
                randomAccessFile = new RandomAccessFile(file3, "rws");
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            randomAccessFile.write(bArr);
            randomAccessFile.close();
            boolean renameTo = file3.renameTo(file4);
            file3.delete();
            file4.delete();
            if (renameTo) {
                return true;
            }
            return false;
        } catch (Exception e11) {
            e = e11;
            randomAccessFile2 = randomAccessFile;
            a8.g(e, true);
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                    return false;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return false;
                }
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
            }
            throw th;
        }
    }

    public static BitmapDrawable m(ArrayList arrayList) {
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (arrayList.get(i3) instanceof TLRPC.TL_photoStrippedSize) {
                return new BitmapDrawable(t0.f25457b.getResources(), F("b", ((TLRPC.TL_photoStrippedSize) arrayList.get(i3)).bytes));
            }
        }
        return null;
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(64);
        if (indexOf >= 0) {
            return str.substring(0, indexOf);
        }
        return str;
    }

    public static String o(File file) {
        StringBuilder sb2 = new StringBuilder();
        if (file == null) {
            return "";
        }
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(file));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb2.append(readLine);
                    } else {
                        String sb3 = sb2.toString();
                        bufferedReader.close();
                        gZIPInputStream.close();
                        return sb3;
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public static TLRPC.TL_photoSize_layer127 q(String str) {
        File z10;
        if (str == null) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i3 = options.outWidth;
            int i10 = options.outHeight;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
            tL_fileLocationToBeDeprecated.dc_id = Integer.MIN_VALUE;
            tL_fileLocationToBeDeprecated.local_id = az.p();
            tL_fileLocationToBeDeprecated.file_reference = new byte[0];
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tL_photoSize_layer127.f27026w = i3;
            tL_photoSize_layer127.h = i10;
            if (i3 <= 100 && i10 <= 100) {
                tL_photoSize_layer127.type = "s";
            } else if (i3 <= 320 && i10 <= 320) {
                tL_photoSize_layer127.type = "m";
            } else if (i3 <= 800 && i10 <= 800) {
                tL_photoSize_layer127.type = "x";
            } else if (i3 <= 1280 && i10 <= 1280) {
                tL_photoSize_layer127.type = "y";
            } else {
                tL_photoSize_layer127.type = "w";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_fileLocationToBeDeprecated.volume_id);
            sb2.append("_");
            String o10 = a1.g.o(tL_fileLocationToBeDeprecated.local_id, ".jpg", sb2);
            if (tL_fileLocationToBeDeprecated.volume_id != -2147483648L) {
                z10 = w7.z(0);
            } else {
                z10 = w7.z(4);
            }
            File file = new File(z10, o10);
            new File(str).renameTo(file);
            tL_photoSize_layer127.size = (int) file.length();
            return tL_photoSize_layer127;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static void r(TLRPC.PhotoSize photoSize) {
        if (photoSize != null) {
            byte[] bArr = photoSize.bytes;
            if (bArr == null || bArr.length == 0) {
                w7.G(h10.f22829t0);
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(w7.K(photoSize, null, true, true), "r");
                    if (((int) randomAccessFile.length()) < 20000) {
                        int length = (int) randomAccessFile.length();
                        byte[] bArr2 = new byte[length];
                        photoSize.bytes = bArr2;
                        randomAccessFile.readFully(bArr2, 0, length);
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
        }
    }

    public static Drawable s(String str, List list) {
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                ImageReceiver imageReceiver = (ImageReceiver) list.get(i3);
                if (str.equals(imageReceiver.R)) {
                    return imageReceiver.T;
                }
                if (str.equals(imageReceiver.f21248i0)) {
                    return imageReceiver.f21252k0;
                }
            }
            return null;
        }
        return null;
    }

    public static TLRPC.PhotoSize t(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia = message.media;
        int i3 = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia.photo.sizes.size();
            while (i3 < size) {
                TLRPC.PhotoSize photoSize = message.media.photo.sizes.get(i3);
                if (photoSize instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize;
                }
                i3++;
            }
            return null;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                int size2 = document.thumbs.size();
                while (i3 < size2) {
                    TLRPC.PhotoSize photoSize2 = message.media.document.thumbs.get(i3);
                    if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                        return photoSize2;
                    }
                    i3++;
                }
                return null;
            }
            return null;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.Photo photo = messageMedia.webpage.photo;
            if (photo != null) {
                int size3 = photo.sizes.size();
                while (i3 < size3) {
                    TLRPC.PhotoSize photoSize3 = message.media.webpage.photo.sizes.get(i3);
                    if (photoSize3 instanceof TLRPC.TL_photoCachedSize) {
                        return photoSize3;
                    }
                    i3++;
                }
                return null;
            }
            return null;
        } else if ((messageMedia instanceof TLRPC.TL_messageMediaInvoice) && !messageMedia.extended_media.isEmpty() && (message.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            return ((TLRPC.TL_messageExtendedMediaPreview) message.media.extended_media.get(0)).thumb;
        } else {
            return null;
        }
    }

    public static vb u(TLRPC.Message message) {
        int i3;
        int i10;
        float f10;
        Bitmap F;
        byte[] bArr;
        float f11;
        TLRPC.PhotoSize t10 = t(message);
        if (t10 != null && (bArr = t10.bytes) != null && bArr.length != 0) {
            w7.G(h10.f22829t0);
            File K2 = w7.K(t10, null, true, true);
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.f27026w = t10.f27026w;
            tL_photoSize_layer127.h = t10.h;
            tL_photoSize_layer127.location = t10.location;
            tL_photoSize_layer127.size = t10.size;
            tL_photoSize_layer127.type = t10.type;
            if (K2.exists() && message.grouped_id == 0) {
                PointF P1 = org.telegram.ui.Cells.q1.P1(t10.f27026w, t10.h, 0, 0);
                Locale locale = Locale.US;
                TLRPC.FileLocation fileLocation = t10.location;
                long j10 = fileLocation.volume_id;
                int i11 = fileLocation.local_id;
                float f12 = P1.x;
                String str = j10 + "_" + i11 + "@" + ((int) (f12 / f11)) + "_" + ((int) (P1.y / g0.f22607p)) + "_b";
                if (!D().J(str, false)) {
                    String path = K2.getPath();
                    float f13 = P1.x;
                    float f14 = g0.f22607p;
                    Bitmap K3 = K(path, null, (int) (f13 / f14), (int) (P1.y / f14), false);
                    if (K3 != null) {
                        Utilities.blurBitmap(K3, 3);
                        float f15 = P1.x;
                        float f16 = g0.f22607p;
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(K3, (int) (f15 / f16), (int) (P1.y / f16), true);
                        if (createScaledBitmap != K3) {
                            K3.recycle();
                            K3 = createScaledBitmap;
                        }
                        return new vb(str, new BitmapDrawable(K3));
                    }
                }
            }
        } else {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                int size = messageMedia.document.thumbs.size();
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.PhotoSize photoSize = message.media.document.thumbs.get(i12);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        TLRPC.PhotoSize w10 = w7.w(message.media.document.thumbs, 320, false, null, false);
                        if (w10 != null) {
                            i10 = w10.h;
                            i3 = w10.f27026w;
                        } else {
                            int i13 = 0;
                            while (true) {
                                if (i13 < message.media.document.attributes.size()) {
                                    if (message.media.document.attributes.get(i13) instanceof TLRPC.TL_documentAttributeVideo) {
                                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) message.media.document.attributes.get(i13);
                                        i10 = tL_documentAttributeVideo.h;
                                        i3 = tL_documentAttributeVideo.f27008w;
                                        break;
                                    }
                                    i13++;
                                } else {
                                    i3 = 0;
                                    i10 = 0;
                                    break;
                                }
                            }
                        }
                        PointF P12 = org.telegram.ui.Cells.q1.P1(i3, i10, 0, 0);
                        Locale locale2 = Locale.US;
                        String s6 = ac.s(message, message, photoSize);
                        float f17 = P12.x;
                        String str2 = s6 + "_false@" + ((int) (f17 / f10)) + "_" + ((int) (P12.y / g0.f22607p)) + "_b";
                        if (!D().J(str2, false) && (F = F(null, photoSize.bytes)) != null) {
                            Utilities.blurBitmap(F, 3);
                            float f18 = P12.x;
                            float f19 = g0.f22607p;
                            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(F, (int) (f18 / f19), (int) (P12.y / f19), true);
                            if (createScaledBitmap2 != F) {
                                F.recycle();
                                F = createScaledBitmap2;
                            }
                            return new vb(str2, new BitmapDrawable(F));
                        }
                    }
                }
            }
        }
        return null;
    }

    public final BitmapDrawable C(TLObject tLObject) {
        String str = null;
        if (tLObject == null) {
            return null;
        }
        if (tLObject instanceof TLRPC.FileLocation) {
            TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) tLObject;
            str = fileLocation.volume_id + "_" + fileLocation.local_id;
        } else if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            str = document.dc_id + "_" + document.f27007id;
        } else if (tLObject instanceof wv) {
            TLRPC.TL_secureFile tL_secureFile = ((wv) tLObject).f26263b;
            str = tL_secureFile.dc_id + "_" + tL_secureFile.f27138id;
        } else if (tLObject instanceof e20) {
            str = Utilities.a(((e20) tLObject).f22294a);
        }
        return z(str + "@50_50");
    }

    public final void H(String str) {
        HashMap hashMap = this.f26757a;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            hashMap.put(str, 1);
        } else {
            hashMap.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public final boolean J(String str, boolean z10) {
        if (z10) {
            if (y(str) != null) {
                return true;
            }
            return false;
        } else if (z(str) != null) {
            return true;
        } else {
            return false;
        }
    }

    public final void L(int i3, String str, String str2) {
        if (str != null && str.length() != 0) {
            HashMap hashMap = this.C;
            if (!hashMap.containsKey(str)) {
                String B = B(str, str2);
                File z10 = w7.z(4);
                File file = new File(z10, Utilities.a(str) + "_temp." + B);
                file.delete();
                qb qbVar = new qb(this, str, file, B, i3);
                this.B.add(qbVar);
                hashMap.put(str, qbVar);
                U(null, 0);
            }
        }
    }

    public final void M(org.telegram.messenger.ImageReceiver r38, java.util.List r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zb.M(org.telegram.messenger.ImageReceiver, java.util.List):void");
    }

    public final void N(String str, String str2) {
        db dbVar = this.f26759c;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) dbVar.f(str);
        if (bitmapDrawable == null) {
            dbVar = this.f26758b;
            bitmapDrawable = (BitmapDrawable) dbVar.f(str);
        }
        this.f26774t.put(str, str2);
        if (bitmapDrawable != null) {
            BitmapDrawable bitmapDrawable2 = (BitmapDrawable) dbVar.f(str2);
            if (bitmapDrawable2 != null && bitmapDrawable2.getBitmap() != null && bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap = bitmapDrawable2.getBitmap();
                Bitmap bitmap2 = bitmapDrawable.getBitmap();
                if (bitmap.getWidth() > bitmap2.getWidth() || bitmap.getHeight() > bitmap2.getHeight()) {
                    dbVar.n(str);
                }
            }
            this.F = str;
            dbVar.n(str);
            dbVar.l(str2, bitmapDrawable);
            this.F = null;
        }
        HashMap hashMap = this.f26757a;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            hashMap.put(str2, num);
            hashMap.remove(str);
        }
    }

    public final void O(BitmapDrawable bitmapDrawable, String str, boolean z10) {
        if (str.endsWith("_nocache")) {
            return;
        }
        if (z10) {
            this.f26758b.l(str, bitmapDrawable);
        } else {
            this.f26759c.l(str, bitmapDrawable);
        }
    }

    public final void P(ArrayList arrayList) {
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            O(((vb) arrayList.get(i3)).f25845a, ((vb) arrayList.get(i3)).f25846b, true);
        }
    }

    public final void Q(String str) {
        this.f26757a.remove(str);
        this.f26759c.n(str);
        this.f26758b.n(str);
    }

    public final void R(String str, String str2, ac acVar, boolean z10) {
        if (z10) {
            g0.h3(new ul(this, str, str2, acVar, 9));
        } else {
            S(str, str2, acVar);
        }
    }

    public final void S(String str, String str2, ac acVar) {
        for (int i3 = 0; i3 < 2; i3++) {
            ArrayList arrayList = null;
            if (i3 == 0) {
                ArrayList arrayList2 = (ArrayList) ((LinkedHashMap) this.f26759c.d).get(str);
                if (arrayList2 != null) {
                    arrayList = new ArrayList(arrayList2);
                }
            } else {
                ArrayList arrayList3 = (ArrayList) ((LinkedHashMap) this.f26758b.d).get(str);
                if (arrayList3 != null) {
                    arrayList = new ArrayList(arrayList3);
                }
            }
            int i10 = hs.f23267m4;
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    String str3 = (String) arrayList.get(i11);
                    String C = a1.g.C(str, "@", str3);
                    String str4 = str2 + "@" + str3;
                    N(C, str4);
                    hs.e().k(i10, C, str4, acVar);
                }
            } else {
                N(str, str2);
                hs.e().k(i10, str, str2, acVar);
            }
        }
    }

    public final void T(boolean z10) {
        if (z10) {
            this.f26778y--;
        }
        while (this.f26778y < 4) {
            LinkedList linkedList = this.f26769o;
            if (!linkedList.isEmpty()) {
                try {
                    ((mb) linkedList.poll()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    this.f26778y++;
                } catch (Throwable unused) {
                    T(false);
                }
            } else {
                return;
            }
        }
    }

    public final void U(qb qbVar, int i3) {
        g0.h3(new k7(this, qbVar, i3, 4));
    }

    public final void V(boolean z10) {
        if (z10) {
            this.f26777x--;
        }
        while (this.f26777x < 4) {
            LinkedList linkedList = this.f26768n;
            if (!linkedList.isEmpty()) {
                ub ubVar = (ub) linkedList.poll();
                if (ubVar != null) {
                    ubVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    this.f26777x++;
                }
            } else {
                return;
            }
        }
    }

    public final void e(String str, e20 e20Var) {
        if (str != null && e20Var != null) {
            this.A.put(str, e20Var);
        }
    }

    public final void g(String str) {
        HashMap hashMap = this.C;
        qb qbVar = (qb) hashMap.get(str);
        if (qbVar != null) {
            qbVar.cancel(true);
            hashMap.remove(str);
            this.B.remove(qbVar);
        }
        Runnable runnable = (Runnable) this.D.get(str);
        if (runnable != null) {
            g0.r(runnable);
        }
        U(null, 0);
    }

    public final void h(ImageReceiver imageReceiver, boolean z10) {
        ArrayList arrayList = imageReceiver.f21281x1;
        HashMap hashMap = org.telegram.ui.web.u1.f51045f;
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                ArrayList arrayList2 = (ArrayList) entry.getValue();
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList2.size()) {
                        break;
                    } else if (((Pair) arrayList2.get(i3)).first == imageReceiver) {
                        arrayList2.remove(i3);
                        break;
                    } else {
                        i3++;
                    }
                }
                if (arrayList2.isEmpty()) {
                    org.telegram.ui.web.u1.f51045f.remove(str);
                    break;
                }
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        p5 p5Var = this.f26773s;
        if (!isEmpty) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                p5Var.a((Runnable) arrayList.get(i10));
            }
            arrayList.clear();
        }
        arrayList.add(null);
        p5Var.c(new qf(this, z10, imageReceiver, 5));
    }

    public final void i(Runnable runnable) {
        ((lf.a) this.f26770p.f6882b).execute(new y4(15, this, runnable));
    }

    public final void j() {
        this.f26758b.r(-1, null);
        this.f26759c.r(-1, null);
        this.f26760e.r(-1, null);
    }

    public final void k(final ImageReceiver imageReceiver, final String str, final String str2, final String str3, final ac acVar, final String str4, final long j10, final int i3, final int i10, final int i11, final int i12) {
        final boolean z10;
        long j11;
        if (str2 != null && str != null && acVar != null) {
            int G = imageReceiver.G(i10);
            if (G == 0) {
                G = this.G;
                if (i10 == 1) {
                    imageReceiver.f21228a0 = G;
                } else if (i10 == 3) {
                    imageReceiver.f21250j0 = G;
                } else {
                    imageReceiver.S = G;
                }
                int i13 = G + 1;
                this.G = i13;
                if (i13 == Integer.MAX_VALUE) {
                    this.G = 0;
                }
            }
            final int i14 = G;
            final boolean z11 = imageReceiver.G0;
            final Object obj = imageReceiver.h;
            final TLRPC.Document document = imageReceiver.I0;
            final boolean z12 = imageReceiver.H0;
            final int i15 = imageReceiver.d;
            if (i10 == 0 && imageReceiver.J0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cb.run():void");
                }
            };
            if (imageReceiver.f21276w == 0) {
                j11 = 0;
            } else {
                j11 = 1;
            }
            this.f26773s.e(runnable, j11);
            imageReceiver.f21281x1.add(runnable);
        }
    }

    public final android.util.SparseArray l() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zb.l():android.util.SparseArray");
    }

    public final boolean p(String str) {
        HashMap hashMap = this.f26757a;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            return true;
        }
        if (num.intValue() == 1) {
            hashMap.remove(str);
            return true;
        }
        hashMap.put(str, Integer.valueOf(num.intValue() - 1));
        return false;
    }

    public final void v(int i3, File file, xb xbVar) {
        if ((i3 == 0 || i3 == 2 || i3 == 3) && file != null) {
            if (((yb) this.v.get(w7.r(null, xbVar.f26357a))) == null) {
                this.f26772r.c(new yb(this, i3, file, xbVar));
            }
        }
    }

    public final Float w(String str) {
        long[] jArr;
        if (str == null || (jArr = (long[]) this.f26775u.get(str)) == null) {
            return null;
        }
        long j10 = jArr[1];
        if (j10 == 0) {
            return Float.valueOf(0.0f);
        }
        return Float.valueOf(Math.min(1.0f, ((float) jArr[0]) / ((float) j10)));
    }

    public final long[] x(String str) {
        if (str == null) {
            return null;
        }
        return (long[]) this.f26775u.get(str);
    }

    public final BitmapDrawable y(String str) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) this.f26760e.f(str);
        if (bitmapDrawable instanceof org.telegram.ui.Components.t5) {
            org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) bitmapDrawable;
            if (!t5Var.f38258d0 && t5Var.H0 < 15) {
                return bitmapDrawable;
            }
            this.f26760e.n(str);
            return null;
        }
        return bitmapDrawable;
    }

    public final BitmapDrawable z(String str) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) this.f26759c.f(str);
        if (bitmapDrawable == null) {
            bitmapDrawable = (BitmapDrawable) this.f26758b.f(str);
        }
        if (bitmapDrawable == null) {
            bitmapDrawable = (BitmapDrawable) this.d.f(str);
        }
        if (bitmapDrawable == null) {
            return y(str);
        }
        return bitmapDrawable;
    }
}
