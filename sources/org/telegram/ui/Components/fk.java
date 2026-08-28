package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public final class fk extends ci {
    public static final int f28455c0 = 0;
    public final dj A;
    public final org.telegram.ui.ActionBar.w0 B;
    public final org.telegram.ui.ActionBar.w0 C;
    public final of.o0 D;
    public AnimatorSet E;
    public final e00 F;
    public boolean G;
    public final ih.b5 H;
    public float I;
    public boolean J;
    public File K;
    public boolean L;
    public wj M;
    public final HashMap N;
    public final ArrayList O;
    public final HashMap P;
    public boolean Q;
    public int R;
    public boolean S;
    public final boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final androidx.mediarouter.app.h f28456a0;
    public ValueAnimator f28457b0;
    public int f28458n;
    public final uj f28459r;
    public final uj f28460s;
    public final yj v;
    public final yj f28461w;
    public final bz f28462x;
    public final ek f28463y;

    public fk(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, ki kiVar) {
        super(context, b6Var, kiVar);
        boolean z10;
        boolean z11;
        int i10;
        Cursor cursor;
        String str;
        this.L = false;
        this.N = new HashMap();
        this.O = new ArrayList();
        this.P = new HashMap();
        this.R = -1;
        this.f28456a0 = new androidx.mediarouter.app.h(this, 7);
        yj yjVar = new yj(this, context);
        this.v = yjVar;
        if (i9 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.T = z10;
        if (i9 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.W = z11;
        this.V = SharedConfig.sortFilesByName;
        try {
            if (z11) {
                try {
                    Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j10 = query.getLong(2);
                            long j11 = query.getLong(3);
                            String string = query.getString(4);
                            cursor = query;
                            if (j10 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax * 1000) {
                                try {
                                    if (j11 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        zj zjVar = new zj();
                                        zjVar.f35318b = file.getName();
                                        zjVar.f35321f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        zjVar.d = str;
                                        zjVar.f35319c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            zjVar.f35320e = file.getAbsolutePath();
                                        }
                                        this.v.f34981e.add(zjVar);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th2;
                                }
                            }
                            query = cursor;
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = query;
                        }
                    }
                    query.close();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else {
                K(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(yjVar.f34981e, new sj(this, 1));
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        this.U = false;
        if (!this.L) {
            this.L = true;
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
            if (Build.VERSION.SDK_INT >= 33) {
                ApplicationLoader.applicationContext.registerReceiver(this.f28456a0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.f28456a0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.z n10 = this.f27493b.T0.n();
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new org.telegram.ui.cb(this, 4);
        this.B = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.f6.f23108j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, this.f27492a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.f6.v0(i11, this.f27492a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Vd, this.f27492a));
        if (this.V) {
            i10 = R.drawable.msg_contacts_time;
        } else {
            i10 = R.drawable.msg_contacts_name;
        }
        org.telegram.ui.ActionBar.w0 a3 = n10.a(6, i10);
        this.C = a3;
        a3.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        e00 e00Var = new e00(context, b6Var);
        this.F = e00Var;
        addView(e00Var);
        ih.b5 b5Var = new ih.b5(this, context, e00Var, b6Var);
        this.H = b5Var;
        addView(b5Var, g7.e6.c(-1.0f, -1));
        b5Var.setVisibility(8);
        b5Var.setOnTouchListener(new jh.d(14));
        uj ujVar = new uj(this, context, b6Var, 0);
        this.f28460s = ujVar;
        ujVar.setSectionsType(2);
        ujVar.setVerticalScrollBarEnabled(false);
        bz bzVar = new bz(AndroidUtilities.dp(56.0f), 0, ujVar);
        this.f28462x = bzVar;
        ujVar.setLayoutManager(bzVar);
        ujVar.setClipToPadding(false);
        yj yjVar2 = new yj(this, context);
        this.f28461w = yjVar2;
        ujVar.setAdapter(yjVar2);
        addView(ujVar, g7.e6.c(-1.0f, -1));
        ujVar.setVisibility(8);
        uj ujVar2 = new uj(this, context, b6Var, 1);
        this.f28459r = ujVar2;
        ujVar2.p1();
        this.f27494c = ujVar2;
        this.d = ujVar2;
        this.h = true;
        this.f27496f = true;
        ujVar2.setSectionsType(2);
        ujVar2.setVerticalScrollBarEnabled(false);
        dj djVar = new dj(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, ujVar2, 1);
        this.A = djVar;
        ujVar2.setLayoutManager(djVar);
        ujVar2.setClipToPadding(false);
        ujVar2.setAdapter(this.v);
        addView(ujVar2, g7.e6.c(-1.0f, -1));
        this.f28463y = new ek(this, context);
        ujVar2.setOnScrollListener(new bg.o2(this, 26));
        ujVar2.setOnItemClickListener(new mk0(this) {
            public final fk f31978b;

            {
                this.f31978b = this;
            }

            @Override
            public final void a(int i12, View view) {
                of.m0 m0Var;
                switch (r2) {
                    case 0:
                        fk.J(this.f31978b, view, i12);
                        return;
                    default:
                        fk fkVar = this.f31978b;
                        of.o0 o0Var = fkVar.D;
                        o0Var.I0(true);
                        ek ekVar = fkVar.f28463y;
                        ArrayList arrayList = o0Var.T2;
                        if (arrayList.isEmpty()) {
                            m0Var = of.o0.Y2[i12];
                        } else {
                            m0Var = (of.m0) arrayList.get(i12);
                        }
                        ki kiVar2 = ekVar.T.f27493b;
                        ArrayList arrayList2 = ekVar.N;
                        if (!arrayList2.isEmpty()) {
                            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                if (m0Var.b((of.m0) arrayList2.get(i13))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(m0Var);
                        kiVar2.T0.setSearchFilter(m0Var);
                        kiVar2.T0.setSearchFieldText("");
                        ekVar.a0(null, null, true);
                        return;
                }
            }
        });
        ujVar2.setOnItemLongClickListener(new s(this, 20));
        of.o0 o0Var = new of.o0(context, b6Var);
        this.D = o0Var;
        o0Var.setOnItemClickListener(new mk0(this) {
            public final fk f31978b;

            {
                this.f31978b = this;
            }

            @Override
            public final void a(int i12, View view) {
                of.m0 m0Var;
                switch (r2) {
                    case 0:
                        fk.J(this.f31978b, view, i12);
                        return;
                    default:
                        fk fkVar = this.f31978b;
                        of.o0 o0Var2 = fkVar.D;
                        o0Var2.I0(true);
                        ek ekVar = fkVar.f28463y;
                        ArrayList arrayList = o0Var2.T2;
                        if (arrayList.isEmpty()) {
                            m0Var = of.o0.Y2[i12];
                        } else {
                            m0Var = (of.m0) arrayList.get(i12);
                        }
                        ki kiVar2 = ekVar.T.f27493b;
                        ArrayList arrayList2 = ekVar.N;
                        if (!arrayList2.isEmpty()) {
                            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                if (m0Var.b((of.m0) arrayList2.get(i13))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(m0Var);
                        kiVar2.T0.setSearchFilter(m0Var);
                        kiVar2.T0.setSearchFieldText("");
                        ekVar.a0(null, null, true);
                        return;
                }
            }
        });
        o0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, this.f27492a));
        addView(o0Var, g7.e6.e(-1, 44, 48));
        o0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        o0Var.setVisibility(4);
        N();
        U();
        S();
    }

    public static void J(fk fkVar, View view, int i9) {
        Object O;
        boolean z10;
        org.telegram.ui.qn qnVar;
        boolean z11;
        int i10;
        ki kiVar = fkVar.f27493b;
        uj ujVar = fkVar.f28459r;
        f2.r0 adapter = ujVar.getAdapter();
        yj yjVar = fkVar.v;
        if (adapter == yjVar) {
            O = yjVar.E(i9);
        } else {
            ek ekVar = fkVar.f28463y;
            O = ekVar.O(ekVar.S(i9), ekVar.Q(i9));
        }
        if (O instanceof zj) {
            zj zjVar = (zj) O;
            File file = zjVar.f35321f;
            if (Build.VERSION.SDK_INT >= 30) {
                z10 = Environment.isExternalStorageManager();
            } else {
                z10 = false;
            }
            if (!BuildVars.NO_SCOPED_STORAGE && (((i10 = zjVar.f35317a) == R.drawable.files_storage || i10 == R.drawable.files_internal) && !z10)) {
                fkVar.M.x();
                return;
            } else if (file == null) {
                int i11 = zjVar.f35317a;
                if (i11 == R.drawable.files_gallery) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
                    if (o2Var instanceof org.telegram.ui.qn) {
                        qnVar = (org.telegram.ui.qn) o2Var;
                    } else {
                        qnVar = null;
                    }
                    org.telegram.ui.qn qnVar2 = qnVar;
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbumEntry;
                    if (qnVar2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.zp0 zp0Var = new org.telegram.ui.zp0(0, albumEntry, hashMap, arrayList, 0, z11, qnVar2, false);
                    zp0Var.f45218h0 = true;
                    zp0Var.f45225o0 = new j4.c(fkVar, hashMap, arrayList, 19);
                    zp0Var.e0(fkVar.R, false);
                    org.telegram.ui.ActionBar.o2 o2Var2 = kiVar.f30099b0;
                    if (o2Var2 != null) {
                        o2Var2.presentFragment(zp0Var);
                    } else {
                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                        if (R != null) {
                            R.presentFragment(zp0Var);
                        }
                    }
                    kiVar.dismiss(true);
                    return;
                } else if (i11 == R.drawable.files_music) {
                    wj wjVar = fkVar.M;
                    if (wjVar != null) {
                        wjVar.N();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = fkVar.getTopForScroll();
                    fkVar.P();
                    xj xjVar = (xj) e2.c.k(1, yjVar.d);
                    kiVar.T0.setTitle(xjVar.f34687b);
                    File file2 = xjVar.f34686a;
                    if (file2 != null) {
                        fkVar.M(file2);
                    } else {
                        fkVar.N();
                    }
                    fkVar.U();
                    fkVar.A.h1(0, topForScroll);
                    fkVar.Q(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = ujVar.getChildAt(0);
                f2.q1 G = ujVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f34686a = fkVar.K;
                    obj.f34687b = kiVar.T0.getTitle();
                    fkVar.P();
                    yjVar.d.add(obj);
                    if (!fkVar.M(file)) {
                        yjVar.d.remove((Object) obj);
                        return;
                    }
                    fkVar.Q(1);
                    kiVar.T0.setTitle(zjVar.f35318b);
                    return;
                }
                return;
            } else {
                fkVar.O(view, zjVar);
                return;
            }
        }
        fkVar.O(view, O);
    }

    private int getTopForScroll() {
        uj ujVar = this.f28459r;
        View childAt = ujVar.getChildAt(0);
        f2.q1 G = ujVar.G(childAt);
        int i9 = -ujVar.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i9;
        }
        return i9;
    }

    @Override
    public final void D(ci ciVar) {
        this.N.clear();
        this.P.clear();
        this.f28463y.N.clear();
        this.O.clear();
        this.v.d.clear();
        N();
        U();
        S();
        this.f27493b.T0.setTitle(LocaleController.getString(R.string.SelectFile));
        this.C.setVisibility(0);
        this.A.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f28459r.x0(0);
    }

    @Override
    public final boolean H(final int i9, final boolean z10, int i10, final boolean z11, final long j10) {
        int size = this.N.size();
        HashMap hashMap = this.P;
        if ((size == 0 && hashMap.size() == 0) || this.M == null || this.G) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (org.telegram.ui.x00 x00Var : hashMap.keySet()) {
            arrayList.add((MessageObject) hashMap.get(x00Var));
        }
        final ArrayList arrayList2 = new ArrayList(this.O);
        ki kiVar = this.f27493b;
        CharSequence[] charSequenceArr = {kiVar.m1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(kiVar.F1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return y4.b0(kiVar.F1, kiVar.n1(), kiVar.j1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                fk fkVar = fk.this;
                fkVar.G = true;
                fkVar.M.l(arrayList2, charSequence, entities, arrayList, z10, i9, j10, z11, ((Long) obj).longValue());
                fkVar.f27493b.dismiss(true);
            }
        }, 0L);
    }

    public final void K(File file) {
        String str;
        File[] listFiles = file.listFiles();
        File checkDirectory = FileLoader.checkDirectory(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    K(file2);
                } else if (!file2.equals(checkDirectory)) {
                    zj zjVar = new zj();
                    zjVar.f35318b = file2.getName();
                    zjVar.f35321f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    zjVar.d = str;
                    zjVar.f35319c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        zjVar.f35320e = file2.getAbsolutePath();
                    }
                    this.v.f34981e.add(zjVar);
                }
            }
        }
    }

    public final boolean L(File file) {
        String str;
        int i9;
        String fileExtension = FileLoader.getFileExtension(file);
        if (fileExtension != null) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension);
        } else {
            str = null;
        }
        if (file.length() != 0 && str != null && bf.d.f1676i.contains(str)) {
            if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
                new oc(this.f27493b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
                return false;
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(ApplicationLoader.applicationContext, Uri.fromFile(file));
                i9 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                i9 = Integer.MAX_VALUE;
            }
            if (i9 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax * 1000) {
                return true;
            }
            new oc(this.f27493b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
            return false;
        }
        new oc(this.f27493b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
        return false;
    }

    public final boolean M(File file) {
        String str;
        this.J = false;
        boolean canRead = file.canRead();
        uj ujVar = this.f28459r;
        yj yjVar = this.v;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.K = file;
                yjVar.f34980c.clear();
                Environment.getExternalStorageState();
                AndroidUtilities.clearDrawableAnimation(ujVar);
                this.Q = true;
                yjVar.l();
                return true;
            }
            R(LocaleController.getString(R.string.AccessError));
            return false;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                R(LocaleController.getString(R.string.UnknownError));
                return false;
            }
            this.K = file;
            ArrayList arrayList = yjVar.f34980c;
            ArrayList arrayList2 = yjVar.d;
            ArrayList arrayList3 = yjVar.f34980c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    zj zjVar = new zj();
                    zjVar.f35318b = file2.getName();
                    zjVar.f35321f = file2;
                    if (file2.isDirectory()) {
                        zjVar.f35317a = R.drawable.files_folder;
                        zjVar.f35319c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.J = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        zjVar.d = str;
                        zjVar.f35319c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            zjVar.f35320e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(zjVar);
                }
            }
            zj zjVar2 = new zj();
            zjVar2.f35318b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((xj) j3.r0.j(1, arrayList2)).f34686a;
                if (file3 == null) {
                    zjVar2.f35319c = LocaleController.getString(R.string.Folder);
                } else {
                    zjVar2.f35319c = file3.toString();
                }
            } else {
                zjVar2.f35319c = LocaleController.getString(R.string.Folder);
            }
            zjVar2.f35317a = R.drawable.files_folder;
            zjVar2.f35321f = null;
            arrayList3.add(0, zjVar2);
            if (this.K != null) {
                Collections.sort(yjVar.f34980c, new sj(this, 0));
            }
            U();
            AndroidUtilities.clearDrawableAnimation(ujVar);
            this.Q = true;
            int topForScroll = getTopForScroll();
            yjVar.l();
            this.A.h1(0, topForScroll);
            return true;
        } catch (Exception e10) {
            R(e10.getLocalizedMessage());
            return false;
        }
    }

    public final void N() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fk.N():void");
    }

    public final boolean O(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fk.O(android.view.View, java.lang.Object):boolean");
    }

    public final void P() {
        View m10;
        yj yjVar = this.f28461w;
        yjVar.d.clear();
        ArrayList arrayList = yjVar.d;
        yj yjVar2 = this.v;
        arrayList.addAll(yjVar2.d);
        ArrayList arrayList2 = yjVar.f34980c;
        arrayList2.clear();
        arrayList2.addAll(yjVar2.f34980c);
        ArrayList arrayList3 = yjVar.f34981e;
        arrayList3.clear();
        arrayList3.addAll(yjVar2.f34981e);
        yjVar.l();
        uj ujVar = this.f28460s;
        ujVar.setVisibility(0);
        uj ujVar2 = this.f28459r;
        ujVar.setPadding(ujVar2.getPaddingLeft(), ujVar2.getPaddingTop(), ujVar2.getPaddingRight(), ujVar2.getPaddingBottom());
        dj djVar = this.A;
        int L0 = djVar.L0();
        if (L0 >= 0 && (m10 = djVar.m(L0)) != null) {
            this.f28462x.h1(L0, m10.getTop() - ujVar.getPaddingTop());
        }
    }

    public final void Q(int i9) {
        uj ujVar;
        float dp;
        ValueAnimator valueAnimator = this.f28457b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f28458n = i9;
        int i10 = 0;
        while (true) {
            int childCount = getChildCount();
            ujVar = this.f28459r;
            if (i10 < childCount) {
                if (getChildAt(i10) == ujVar) {
                    break;
                }
                i10++;
            } else {
                i10 = 0;
                break;
            }
        }
        uj ujVar2 = this.f28460s;
        if (i9 == 1) {
            dp = AndroidUtilities.dp(150.0f);
            ujVar2.setAlpha(1.0f);
            ujVar2.setScaleX(1.0f);
            ujVar2.setScaleY(1.0f);
            ujVar2.setTranslationX(0.0f);
            removeView(ujVar2);
            addView(ujVar2, i10);
            ujVar2.setVisibility(0);
            ujVar.setTranslationX(dp);
            ujVar.setAlpha(0.0f);
            this.f28457b0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            dp = AndroidUtilities.dp(150.0f);
            ujVar.setAlpha(0.0f);
            ujVar.setScaleX(0.95f);
            ujVar.setScaleY(0.95f);
            ujVar2.setScaleX(1.0f);
            ujVar2.setScaleY(1.0f);
            ujVar2.setTranslationX(0.0f);
            ujVar2.setAlpha(1.0f);
            removeView(ujVar2);
            addView(ujVar2, i10 + 1);
            ujVar2.setVisibility(0);
            this.f28457b0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f28457b0.addUpdateListener(new rj(this, i9, dp, 0));
        this.f28457b0.addListener(new org.telegram.ui.xp(this, 13));
        if (i9 == 1) {
            this.f28457b0.setDuration(220L);
        } else {
            this.f28457b0.setDuration(200L);
        }
        this.f28457b0.setInterpolator(gr.f28844f);
        this.f28457b0.start();
    }

    public final void R(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f27492a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = string;
        c2Var.P = str;
        org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
    }

    public final void S() {
        f2.r0 adapter = this.f28459r.getAdapter();
        int i9 = 0;
        boolean z10 = true;
        ek ekVar = this.f28463y;
        if (adapter != ekVar ? this.v.h() != 1 : !ekVar.f28049s.isEmpty() || !ekVar.L.isEmpty()) {
            z10 = false;
        }
        if (!z10) {
            i9 = 8;
        }
        this.H.setVisibility(i9);
        T();
    }

    public final void T() {
        View childAt;
        ih.b5 b5Var = this.H;
        if (b5Var.getVisibility() != 0 || (childAt = this.f28459r.getChildAt(0)) == null) {
            return;
        }
        float translationY = b5Var.getTranslationY();
        this.I = (childAt.getTop() + (b5Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        b5Var.setTranslationY(translationY);
    }

    public final void U() {
        int i9;
        org.telegram.ui.ActionBar.w0 w0Var = this.B;
        if (w0Var != null && !w0Var.s()) {
            if (!this.J && !this.v.d.isEmpty()) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            w0Var.setVisibility(i9);
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        uj ujVar = this.f28459r;
        if (ujVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i9 = 0;
        View childAt = ujVar.getChildAt(0);
        ik0 ik0Var = (ik0) ujVar.G(childAt);
        int y10 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y10 > 0 && ik0Var != null && ik0Var.b() == 0) {
            i9 = y10;
        }
        if (y10 < 0 || ik0Var == null || ik0Var.b() != 0) {
            y10 = i9;
        }
        return AndroidUtilities.dp(13.0f) + y10;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(5.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f28459r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.P.size() + this.N.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.h6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.f6.f23108j5));
        int i9 = org.telegram.ui.ActionBar.f6.A5;
        uj ujVar = this.f28459r;
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22966b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23093i7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23128k7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 40, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ujVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Bi));
        return arrayList;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final boolean i() {
        yj yjVar = this.v;
        if (yjVar.d.size() <= 0) {
            return false;
        }
        P();
        xj xjVar = (xj) e2.c.k(1, yjVar.d);
        this.f27493b.T0.setTitle(xjVar.f34687b);
        int topForScroll = getTopForScroll();
        File file = xjVar.f34686a;
        if (file != null) {
            M(file);
        } else {
            N();
        }
        U();
        this.A.h1(0, topForScroll);
        Q(2);
        return true;
    }

    @Override
    public final void m() {
        try {
            if (this.L) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.f28456a0);
                this.L = false;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.f27493b.T0.h(true);
        org.telegram.ui.ActionBar.z n10 = this.f27493b.T0.n();
        n10.removeView(this.C);
        n10.removeView(this.B);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        T();
    }

    @Override
    public final void r() {
        this.C.setVisibility(8);
        this.B.setVisibility(8);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.S = z10;
    }

    public void setDelegate(wj wjVar) {
        this.M = wjVar;
    }

    public void setMaxSelectedFiles(int i9) {
        this.R = i9;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f27493b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i9) {
        int i10;
        if (i9 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.V = SharedConfig.sortFilesByName;
            yj yjVar = this.v;
            Collections.sort(yjVar.f34981e, new sj(this, 1));
            if (this.K != null) {
                Collections.sort(yjVar.f34980c, new sj(this, 0));
            }
            yjVar.l();
            if (this.V) {
                i10 = R.drawable.msg_contacts_time;
            } else {
                i10 = R.drawable.msg_contacts_name;
            }
            this.C.setIcon(i10);
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fk.y(int, int):void");
    }

    @Override
    public final void z() {
        yj yjVar = this.v;
        if (yjVar != null) {
            yjVar.l();
        }
        ek ekVar = this.f28463y;
        if (ekVar != null) {
            ekVar.l();
        }
    }
}
