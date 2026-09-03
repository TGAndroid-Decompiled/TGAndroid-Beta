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
public final class jk extends ei {
    public static final int f28127d0 = 0;
    public final gj B;
    public final org.telegram.ui.ActionBar.w0 C;
    public final org.telegram.ui.ActionBar.w0 D;
    public final uf.g0 E;
    public AnimatorSet F;
    public final u00 G;
    public boolean H;
    public final oh.z4 I;
    public float J;
    public boolean K;
    public File L;
    public boolean M;
    public zj N;
    public final HashMap O;
    public final ArrayList P;
    public final HashMap Q;
    public boolean R;
    public int S;
    public boolean T;
    public final boolean U;
    public boolean V;
    public boolean W;
    public boolean f28128a0;
    public final androidx.mediarouter.app.h f28129b0;
    public ValueAnimator f28130c0;
    public int f28131n;
    public final xj f28132r;
    public final xj f28133s;
    public final bk v;
    public final bk f28134w;
    public final rz f28135x;
    public final ik f28136y;

    public jk(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, mi miVar) {
        super(context, g6Var, miVar);
        boolean z4;
        boolean z10;
        int i11;
        Cursor cursor;
        String str;
        this.M = false;
        this.O = new HashMap();
        this.P = new ArrayList();
        this.Q = new HashMap();
        this.S = -1;
        this.f28129b0 = new androidx.mediarouter.app.h(this, 8);
        bk bkVar = new bk(this, context);
        this.v = bkVar;
        if (i10 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.U = z4;
        if (i10 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28128a0 = z10;
        this.W = SharedConfig.sortFilesByName;
        try {
            if (z10) {
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
                                        ck ckVar = new ck();
                                        ckVar.f25967b = file.getName();
                                        ckVar.f25970f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        ckVar.d = str;
                                        ckVar.f25968c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            ckVar.f25969e = file.getAbsolutePath();
                                        }
                                        this.v.f25629e.add(ckVar);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    Throwable th3 = th;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th3;
                                }
                            }
                            query = cursor;
                        } catch (Throwable th4) {
                            th = th4;
                            cursor = query;
                        }
                    }
                    query.close();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            } else {
                K(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(bkVar.f25629e, new vj(this, 1));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.V = false;
        if (!this.M) {
            this.M = true;
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
                ApplicationLoader.applicationContext.registerReceiver(this.f28129b0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.f28129b0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.z n10 = this.f26590b.U0.n();
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new org.telegram.ui.fb(this, 4);
        this.C = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i12 = org.telegram.ui.ActionBar.k6.f21768j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.k6.v0(i12, this.f26589a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.k6.v0(i12, this.f26589a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Vd, this.f26589a));
        if (this.W) {
            i11 = R.drawable.msg_contacts_time;
        } else {
            i11 = R.drawable.msg_contacts_name;
        }
        org.telegram.ui.ActionBar.w0 a10 = n10.a(6, i11);
        this.D = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        u00 u00Var = new u00(context, g6Var);
        this.G = u00Var;
        addView(u00Var);
        oh.z4 z4Var = new oh.z4(this, context, u00Var, g6Var);
        this.I = z4Var;
        addView(z4Var, k7.c6.c(-1.0f, -1));
        z4Var.setVisibility(8);
        z4Var.setOnTouchListener(new org.telegram.ui.ActionBar.s2(13));
        xj xjVar = new xj(this, context, g6Var, 0);
        this.f28133s = xjVar;
        xjVar.setSectionsType(2);
        xjVar.setVerticalScrollBarEnabled(false);
        rz rzVar = new rz(AndroidUtilities.dp(56.0f), 0, xjVar);
        this.f28135x = rzVar;
        xjVar.setLayoutManager(rzVar);
        xjVar.setClipToPadding(false);
        bk bkVar2 = new bk(this, context);
        this.f28134w = bkVar2;
        xjVar.setAdapter(bkVar2);
        addView(xjVar, k7.c6.c(-1.0f, -1));
        xjVar.setVisibility(8);
        xj xjVar2 = new xj(this, context, g6Var, 1);
        this.f28132r = xjVar2;
        xjVar2.o1();
        this.f26591c = xjVar2;
        this.d = xjVar2;
        this.h = true;
        this.f26593f = true;
        xjVar2.setSectionsType(2);
        xjVar2.setVerticalScrollBarEnabled(false);
        gj gjVar = new gj(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, xjVar2, 1);
        this.B = gjVar;
        xjVar2.setLayoutManager(gjVar);
        xjVar2.setClipToPadding(false);
        xjVar2.setAdapter(this.v);
        addView(xjVar2, k7.c6.c(-1.0f, -1));
        this.f28136y = new ik(this, context);
        xjVar2.setOnScrollListener(new fg.e2(this, 20));
        xjVar2.setOnItemClickListener(new il0(this) {
            public final jk f31365b;

            {
                this.f31365b = this;
            }

            @Override
            public final void f(int i13, View view) {
                uf.e0 e0Var;
                switch (r2) {
                    case 0:
                        jk.J(this.f31365b, view, i13);
                        return;
                    default:
                        jk jkVar = this.f31365b;
                        uf.g0 g0Var = jkVar.E;
                        g0Var.I0(true);
                        ik ikVar = jkVar.f28136y;
                        ArrayList arrayList = g0Var.U2;
                        if (arrayList.isEmpty()) {
                            e0Var = uf.g0.Z2[i13];
                        } else {
                            e0Var = (uf.e0) arrayList.get(i13);
                        }
                        mi miVar2 = ikVar.U.f26590b;
                        ArrayList arrayList2 = ikVar.O;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (e0Var.b((uf.e0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(e0Var);
                        miVar2.U0.setSearchFilter(e0Var);
                        miVar2.U0.setSearchFieldText("");
                        ikVar.a0(null, null, true);
                        return;
                }
            }
        });
        xjVar2.setOnItemLongClickListener(new t(this, 20));
        uf.g0 g0Var = new uf.g0(context, g6Var);
        this.E = g0Var;
        g0Var.setOnItemClickListener(new il0(this) {
            public final jk f31365b;

            {
                this.f31365b = this;
            }

            @Override
            public final void f(int i13, View view) {
                uf.e0 e0Var;
                switch (r2) {
                    case 0:
                        jk.J(this.f31365b, view, i13);
                        return;
                    default:
                        jk jkVar = this.f31365b;
                        uf.g0 g0Var2 = jkVar.E;
                        g0Var2.I0(true);
                        ik ikVar = jkVar.f28136y;
                        ArrayList arrayList = g0Var2.U2;
                        if (arrayList.isEmpty()) {
                            e0Var = uf.g0.Z2[i13];
                        } else {
                            e0Var = (uf.e0) arrayList.get(i13);
                        }
                        mi miVar2 = ikVar.U.f26590b;
                        ArrayList arrayList2 = ikVar.O;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (e0Var.b((uf.e0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(e0Var);
                        miVar2.U0.setSearchFilter(e0Var);
                        miVar2.U0.setSearchFieldText("");
                        ikVar.a0(null, null, true);
                        return;
                }
            }
        });
        g0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21733h5, this.f26589a));
        addView(g0Var, k7.c6.e(-1, 44, 48));
        g0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        g0Var.setVisibility(4);
        O();
        V();
        T();
    }

    public static void J(jk jkVar, View view, int i10) {
        Object O;
        boolean z4;
        org.telegram.ui.xn xnVar;
        boolean z10;
        int i11;
        mi miVar = jkVar.f26590b;
        xj xjVar = jkVar.f28132r;
        f2.p0 adapter = xjVar.getAdapter();
        bk bkVar = jkVar.v;
        if (adapter == bkVar) {
            O = bkVar.E(i10);
        } else {
            ik ikVar = jkVar.f28136y;
            O = ikVar.O(ikVar.S(i10), ikVar.Q(i10));
        }
        if (O instanceof ck) {
            ck ckVar = (ck) O;
            File file = ckVar.f25970f;
            if (Build.VERSION.SDK_INT >= 30) {
                z4 = Environment.isExternalStorageManager();
            } else {
                z4 = false;
            }
            if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = ckVar.f25966a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !z4)) {
                jkVar.N.x();
                return;
            } else if (file == null) {
                int i12 = ckVar.f25966a;
                if (i12 == R.drawable.files_gallery) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.p2 p2Var = miVar.f29058c0;
                    if (p2Var instanceof org.telegram.ui.xn) {
                        xnVar = (org.telegram.ui.xn) p2Var;
                    } else {
                        xnVar = null;
                    }
                    org.telegram.ui.xn xnVar2 = xnVar;
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbumEntry;
                    if (xnVar2 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.mq0 mq0Var = new org.telegram.ui.mq0(0, albumEntry, hashMap, arrayList, 0, z10, xnVar2, false);
                    mq0Var.f39044i0 = true;
                    mq0Var.f39051p0 = new l7.w0(jkVar, hashMap, arrayList, 20);
                    mq0Var.f0(jkVar.S, false);
                    org.telegram.ui.ActionBar.p2 p2Var2 = miVar.f29058c0;
                    if (p2Var2 != null) {
                        p2Var2.presentFragment(mq0Var);
                    } else {
                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                        if (R != null) {
                            R.presentFragment(mq0Var);
                        }
                    }
                    miVar.dismiss(true);
                    return;
                } else if (i12 == R.drawable.files_music) {
                    zj zjVar = jkVar.N;
                    if (zjVar != null) {
                        zjVar.O();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = jkVar.getTopForScroll();
                    jkVar.Q();
                    ak akVar = (ak) e2.c.g(1, bkVar.d);
                    miVar.U0.setTitle(akVar.f25262b);
                    File file2 = akVar.f25261a;
                    if (file2 != null) {
                        jkVar.N(file2);
                    } else {
                        jkVar.O();
                    }
                    jkVar.V();
                    jkVar.B.h1(0, topForScroll);
                    jkVar.R(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = xjVar.getChildAt(0);
                f2.m1 G = xjVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f25261a = jkVar.L;
                    obj.f25262b = miVar.U0.getTitle();
                    jkVar.Q();
                    bkVar.d.add(obj);
                    if (!jkVar.N(file)) {
                        bkVar.d.remove((Object) obj);
                        return;
                    }
                    jkVar.R(1);
                    miVar.U0.setTitle(ckVar.f25967b);
                    return;
                }
                return;
            } else {
                jkVar.P(view, ckVar);
                return;
            }
        }
        jkVar.P(view, O);
    }

    private int getTopForScroll() {
        xj xjVar = this.f28132r;
        View childAt = xjVar.getChildAt(0);
        f2.m1 G = xjVar.G(childAt);
        int i10 = -xjVar.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i10;
        }
        return i10;
    }

    @Override
    public final void A() {
        bk bkVar = this.v;
        if (bkVar != null) {
            bkVar.l();
        }
        ik ikVar = this.f28136y;
        if (ikVar != null) {
            ikVar.l();
        }
    }

    @Override
    public final void D(ei eiVar) {
        this.O.clear();
        this.Q.clear();
        this.f28136y.O.clear();
        this.P.clear();
        this.v.d.clear();
        O();
        V();
        T();
        this.f26590b.U0.setTitle(LocaleController.getString(R.string.SelectFile));
        this.D.setVisibility(0);
        this.B.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f28132r.x0(0);
    }

    @Override
    public final boolean H(final int i10, final boolean z4, int i11, final boolean z10, final long j10) {
        int size = this.O.size();
        HashMap hashMap = this.Q;
        if ((size == 0 && hashMap.size() == 0) || this.N == null || this.H) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (org.telegram.ui.l10 l10Var : hashMap.keySet()) {
            arrayList.add((MessageObject) hashMap.get(l10Var));
        }
        final ArrayList arrayList2 = new ArrayList(this.P);
        mi miVar = this.f26590b;
        CharSequence[] charSequenceArr = {miVar.m1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(miVar.G1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return z4.b0(miVar.G1, miVar.n1(), miVar.j1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                jk jkVar = jk.this;
                jkVar.H = true;
                jkVar.N.l(arrayList2, charSequence, entities, arrayList, z4, i10, j10, z10, ((Long) obj).longValue());
                jkVar.f26590b.dismiss(true);
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
                    ck ckVar = new ck();
                    ckVar.f25967b = file2.getName();
                    ckVar.f25970f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    ckVar.d = str;
                    ckVar.f25968c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        ckVar.f25969e = file2.getAbsolutePath();
                    }
                    this.v.f25629e.add(ckVar);
                }
            }
        }
    }

    public final boolean M(File file) {
        String str;
        int i10;
        String fileExtension = FileLoader.getFileExtension(file);
        if (fileExtension != null) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension);
        } else {
            str = null;
        }
        if (file.length() != 0 && str != null && gf.e.f7037i.contains(str)) {
            if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
                new qc(this.f26590b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
                return false;
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(ApplicationLoader.applicationContext, Uri.fromFile(file));
                i10 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                i10 = Integer.MAX_VALUE;
            }
            if (i10 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax * 1000) {
                return true;
            }
            new qc(this.f26590b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
            return false;
        }
        new qc(this.f26590b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
        return false;
    }

    public final boolean N(File file) {
        String str;
        this.K = false;
        boolean canRead = file.canRead();
        xj xjVar = this.f28132r;
        bk bkVar = this.v;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.L = file;
                bkVar.f25628c.clear();
                Environment.getExternalStorageState();
                AndroidUtilities.clearDrawableAnimation(xjVar);
                this.R = true;
                bkVar.l();
                return true;
            }
            S(LocaleController.getString(R.string.AccessError));
            return false;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                S(LocaleController.getString(R.string.UnknownError));
                return false;
            }
            this.L = file;
            ArrayList arrayList = bkVar.f25628c;
            ArrayList arrayList2 = bkVar.d;
            ArrayList arrayList3 = bkVar.f25628c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    ck ckVar = new ck();
                    ckVar.f25967b = file2.getName();
                    ckVar.f25970f = file2;
                    if (file2.isDirectory()) {
                        ckVar.f25966a = R.drawable.files_folder;
                        ckVar.f25968c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.K = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        ckVar.d = str;
                        ckVar.f25968c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            ckVar.f25969e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(ckVar);
                }
            }
            ck ckVar2 = new ck();
            ckVar2.f25967b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((ak) l.d.i(1, arrayList2)).f25261a;
                if (file3 == null) {
                    ckVar2.f25968c = LocaleController.getString(R.string.Folder);
                } else {
                    ckVar2.f25968c = file3.toString();
                }
            } else {
                ckVar2.f25968c = LocaleController.getString(R.string.Folder);
            }
            ckVar2.f25966a = R.drawable.files_folder;
            ckVar2.f25970f = null;
            arrayList3.add(0, ckVar2);
            if (this.L != null) {
                Collections.sort(bkVar.f25628c, new vj(this, 0));
            }
            V();
            AndroidUtilities.clearDrawableAnimation(xjVar);
            this.R = true;
            int topForScroll = getTopForScroll();
            bkVar.l();
            this.B.h1(0, topForScroll);
            return true;
        } catch (Exception e6) {
            S(e6.getLocalizedMessage());
            return false;
        }
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jk.O():void");
    }

    public final boolean P(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jk.P(android.view.View, java.lang.Object):boolean");
    }

    public final void Q() {
        View m9;
        bk bkVar = this.f28134w;
        bkVar.d.clear();
        ArrayList arrayList = bkVar.d;
        bk bkVar2 = this.v;
        arrayList.addAll(bkVar2.d);
        ArrayList arrayList2 = bkVar.f25628c;
        arrayList2.clear();
        arrayList2.addAll(bkVar2.f25628c);
        ArrayList arrayList3 = bkVar.f25629e;
        arrayList3.clear();
        arrayList3.addAll(bkVar2.f25629e);
        bkVar.l();
        xj xjVar = this.f28133s;
        xjVar.setVisibility(0);
        xj xjVar2 = this.f28132r;
        xjVar.setPadding(xjVar2.getPaddingLeft(), xjVar2.getPaddingTop(), xjVar2.getPaddingRight(), xjVar2.getPaddingBottom());
        gj gjVar = this.B;
        int L0 = gjVar.L0();
        if (L0 >= 0 && (m9 = gjVar.m(L0)) != null) {
            this.f28135x.h1(L0, m9.getTop() - xjVar.getPaddingTop());
        }
    }

    public final void R(int i10) {
        xj xjVar;
        float dp;
        ValueAnimator valueAnimator = this.f28130c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f28131n = i10;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            xjVar = this.f28132r;
            if (i11 < childCount) {
                if (getChildAt(i11) == xjVar) {
                    break;
                }
                i11++;
            } else {
                i11 = 0;
                break;
            }
        }
        xj xjVar2 = this.f28133s;
        if (i10 == 1) {
            dp = AndroidUtilities.dp(150.0f);
            xjVar2.setAlpha(1.0f);
            xjVar2.setScaleX(1.0f);
            xjVar2.setScaleY(1.0f);
            xjVar2.setTranslationX(0.0f);
            removeView(xjVar2);
            addView(xjVar2, i11);
            xjVar2.setVisibility(0);
            xjVar.setTranslationX(dp);
            xjVar.setAlpha(0.0f);
            this.f28130c0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            dp = AndroidUtilities.dp(150.0f);
            xjVar.setAlpha(0.0f);
            xjVar.setScaleX(0.95f);
            xjVar.setScaleY(0.95f);
            xjVar2.setScaleX(1.0f);
            xjVar2.setScaleY(1.0f);
            xjVar2.setTranslationX(0.0f);
            xjVar2.setAlpha(1.0f);
            removeView(xjVar2);
            addView(xjVar2, i11 + 1);
            xjVar2.setVisibility(0);
            this.f28130c0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f28130c0.addUpdateListener(new uj(this, i10, dp, 0));
        this.f28130c0.addListener(new a9(this, 6));
        if (i10 == 1) {
            this.f28130c0.setDuration(220L);
        } else {
            this.f28130c0.setDuration(200L);
        }
        this.f28130c0.setInterpolator(pr.f30168f);
        this.f28130c0.start();
    }

    public final void S(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f26589a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
        d2Var.O = string;
        d2Var.Q = str;
        l.d.C(R.string.OK, alertDialog$Builder, null);
    }

    public final void T() {
        f2.p0 adapter = this.f28132r.getAdapter();
        int i10 = 0;
        boolean z4 = true;
        ik ikVar = this.f28136y;
        if (adapter != ikVar ? this.v.h() != 1 : !ikVar.f27845s.isEmpty() || !ikVar.M.isEmpty()) {
            z4 = false;
        }
        if (!z4) {
            i10 = 8;
        }
        this.I.setVisibility(i10);
        U();
    }

    public final void U() {
        View childAt;
        oh.z4 z4Var = this.I;
        if (z4Var.getVisibility() != 0 || (childAt = this.f28132r.getChildAt(0)) == null) {
            return;
        }
        float translationY = z4Var.getTranslationY();
        this.J = (childAt.getTop() + (z4Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        z4Var.setTranslationY(translationY);
    }

    public final void V() {
        int i10;
        org.telegram.ui.ActionBar.w0 w0Var = this.C;
        if (w0Var != null && !w0Var.s()) {
            if (!this.K && !this.v.d.isEmpty()) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            w0Var.setVisibility(i10);
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        xj xjVar = this.f28132r;
        if (xjVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = xjVar.getChildAt(0);
        el0 el0Var = (el0) xjVar.G(childAt);
        int y10 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y10 > 0 && el0Var != null && el0Var.b() == 0) {
            i10 = y10;
        }
        if (y10 < 0 || el0Var == null || el0Var.b() != 0) {
            y10 = i10;
        }
        return AndroidUtilities.dp(13.0f) + y10;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(5.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f28132r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.Q.size() + this.O.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.m6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.m6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.k6.f21768j5));
        int i10 = org.telegram.ui.ActionBar.k6.A5;
        xj xjVar = this.f28132r;
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21626b7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21607a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21781k0, null, null, org.telegram.ui.ActionBar.k6.f21662d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21753i7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21788k7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 40, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.m6(xjVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Bi));
        return arrayList;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final boolean i() {
        bk bkVar = this.v;
        if (bkVar.d.size() <= 0) {
            return false;
        }
        Q();
        ak akVar = (ak) e2.c.g(1, bkVar.d);
        this.f26590b.U0.setTitle(akVar.f25262b);
        int topForScroll = getTopForScroll();
        File file = akVar.f25261a;
        if (file != null) {
            N(file);
        } else {
            O();
        }
        V();
        this.B.h1(0, topForScroll);
        R(2);
        return true;
    }

    @Override
    public final void m() {
        try {
            if (this.M) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.f28129b0);
                this.M = false;
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        this.f26590b.U0.h(true);
        org.telegram.ui.ActionBar.z n10 = this.f26590b.U0.n();
        n10.removeView(this.D);
        n10.removeView(this.C);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        U();
    }

    @Override
    public final void r() {
        this.D.setVisibility(8);
        this.C.setVisibility(8);
    }

    public void setCanSelectOnlyImageFiles(boolean z4) {
        this.T = z4;
    }

    public void setDelegate(zj zjVar) {
        this.N = zjVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.S = i10;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f26590b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        int i11;
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.W = SharedConfig.sortFilesByName;
            bk bkVar = this.v;
            Collections.sort(bkVar.f25629e, new vj(this, 1));
            if (this.L != null) {
                Collections.sort(bkVar.f25628c, new vj(this, 0));
            }
            bkVar.l();
            if (this.W) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            this.D.setIcon(i11);
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jk.y(int, int):void");
    }
}
