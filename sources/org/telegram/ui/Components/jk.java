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
public final class jk extends fi {
    public static final int f29674c0 = 0;
    public final gj A;
    public final org.telegram.ui.ActionBar.w0 B;
    public final org.telegram.ui.ActionBar.w0 C;
    public final rf.h0 D;
    public AnimatorSet E;
    public final p00 F;
    public boolean G;
    public final lh.x4 H;
    public float I;
    public boolean J;
    public File K;
    public boolean L;
    public zj M;
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
    public final af.c f29675a0;
    public ValueAnimator f29676b0;
    public int f29677n;
    public final xj f29678r;
    public final xj f29679s;
    public final bk v;
    public final bk f29680w;
    public final kz f29681x;
    public final ik f29682y;

    public jk(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, ni niVar) {
        super(context, c6Var, niVar);
        boolean z10;
        boolean z11;
        int i11;
        Cursor cursor;
        String str;
        this.L = false;
        this.N = new HashMap();
        this.O = new ArrayList();
        this.P = new HashMap();
        this.R = -1;
        this.f29675a0 = new af.c(this, 8);
        bk bkVar = new bk(this, context);
        this.v = bkVar;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.T = z10;
        if (i10 == 2) {
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
                                        ck ckVar = new ck();
                                        ckVar.f27497b = file.getName();
                                        ckVar.f27500f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        ckVar.d = str;
                                        ckVar.f27498c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            ckVar.f27499e = file.getAbsolutePath();
                                        }
                                        this.v.f27149e.add(ckVar);
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else {
                K(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(bkVar.f27149e, new vj(this, 1));
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
                ApplicationLoader.applicationContext.registerReceiver(this.f29675a0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.f29675a0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.a0 n10 = this.f28403b.T0.n();
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new org.telegram.ui.bb(this, 4);
        this.B = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i12 = org.telegram.ui.ActionBar.g6.f23169j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, this.f28402a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i12, this.f28402a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Vd, this.f28402a));
        if (this.V) {
            i11 = R.drawable.msg_contacts_time;
        } else {
            i11 = R.drawable.msg_contacts_name;
        }
        org.telegram.ui.ActionBar.w0 a10 = n10.a(6, i11);
        this.C = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        p00 p00Var = new p00(context, c6Var);
        this.F = p00Var;
        addView(p00Var);
        lh.x4 x4Var = new lh.x4(this, context, p00Var, c6Var);
        this.H = x4Var;
        addView(x4Var, i7.f6.c(-1.0f, -1));
        x4Var.setVisibility(8);
        x4Var.setOnTouchListener(new mh.d(14));
        xj xjVar = new xj(this, context, c6Var, 0);
        this.f29679s = xjVar;
        xjVar.setSectionsType(2);
        xjVar.setVerticalScrollBarEnabled(false);
        kz kzVar = new kz(AndroidUtilities.dp(56.0f), 0, xjVar);
        this.f29681x = kzVar;
        xjVar.setLayoutManager(kzVar);
        xjVar.setClipToPadding(false);
        bk bkVar2 = new bk(this, context);
        this.f29680w = bkVar2;
        xjVar.setAdapter(bkVar2);
        addView(xjVar, i7.f6.c(-1.0f, -1));
        xjVar.setVisibility(8);
        xj xjVar2 = new xj(this, context, c6Var, 1);
        this.f29678r = xjVar2;
        xjVar2.p1();
        this.f28404c = xjVar2;
        this.d = xjVar2;
        this.h = true;
        this.f28406f = true;
        xjVar2.setSectionsType(2);
        xjVar2.setVerticalScrollBarEnabled(false);
        gj gjVar = new gj(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, xjVar2, 1);
        this.A = gjVar;
        xjVar2.setLayoutManager(gjVar);
        xjVar2.setClipToPadding(false);
        xjVar2.setAdapter(this.v);
        addView(xjVar2, i7.f6.c(-1.0f, -1));
        this.f29682y = new ik(this, context);
        xjVar2.setOnScrollListener(new cg.g2(this, 22));
        xjVar2.setOnItemClickListener(new zk0(this) {
            public final jk f32964b;

            {
                this.f32964b = this;
            }

            @Override
            public final void c(int i13, View view) {
                rf.f0 f0Var;
                switch (r2) {
                    case 0:
                        jk.J(this.f32964b, view, i13);
                        return;
                    default:
                        jk jkVar = this.f32964b;
                        rf.h0 h0Var = jkVar.D;
                        h0Var.I0(true);
                        ik ikVar = jkVar.f29682y;
                        ArrayList arrayList = h0Var.T2;
                        if (arrayList.isEmpty()) {
                            f0Var = rf.h0.Y2[i13];
                        } else {
                            f0Var = (rf.f0) arrayList.get(i13);
                        }
                        ni niVar2 = ikVar.T.f28403b;
                        ArrayList arrayList2 = ikVar.N;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (f0Var.b((rf.f0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(f0Var);
                        niVar2.T0.setSearchFilter(f0Var);
                        niVar2.T0.setSearchFieldText("");
                        ikVar.a0(null, null, true);
                        return;
                }
            }
        });
        xjVar2.setOnItemLongClickListener(new u(this, 20));
        rf.h0 h0Var = new rf.h0(context, c6Var);
        this.D = h0Var;
        h0Var.setOnItemClickListener(new zk0(this) {
            public final jk f32964b;

            {
                this.f32964b = this;
            }

            @Override
            public final void c(int i13, View view) {
                rf.f0 f0Var;
                switch (r2) {
                    case 0:
                        jk.J(this.f32964b, view, i13);
                        return;
                    default:
                        jk jkVar = this.f32964b;
                        rf.h0 h0Var2 = jkVar.D;
                        h0Var2.I0(true);
                        ik ikVar = jkVar.f29682y;
                        ArrayList arrayList = h0Var2.T2;
                        if (arrayList.isEmpty()) {
                            f0Var = rf.h0.Y2[i13];
                        } else {
                            f0Var = (rf.f0) arrayList.get(i13);
                        }
                        ni niVar2 = ikVar.T.f28403b;
                        ArrayList arrayList2 = ikVar.N;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (f0Var.b((rf.f0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(f0Var);
                        niVar2.T0.setSearchFilter(f0Var);
                        niVar2.T0.setSearchFieldText("");
                        ikVar.a0(null, null, true);
                        return;
                }
            }
        });
        h0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, this.f28402a));
        addView(h0Var, i7.f6.e(-1, 44, 48));
        h0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        h0Var.setVisibility(4);
        O();
        V();
        T();
    }

    public static void J(jk jkVar, View view, int i10) {
        Object O;
        boolean z10;
        org.telegram.ui.tn tnVar;
        boolean z11;
        int i11;
        ni niVar = jkVar.f28403b;
        xj xjVar = jkVar.f29678r;
        f2.p0 adapter = xjVar.getAdapter();
        bk bkVar = jkVar.v;
        if (adapter == bkVar) {
            O = bkVar.E(i10);
        } else {
            ik ikVar = jkVar.f29682y;
            O = ikVar.O(ikVar.S(i10), ikVar.Q(i10));
        }
        if (O instanceof ck) {
            ck ckVar = (ck) O;
            File file = ckVar.f27500f;
            if (Build.VERSION.SDK_INT >= 30) {
                z10 = Environment.isExternalStorageManager();
            } else {
                z10 = false;
            }
            if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = ckVar.f27496a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !z10)) {
                jkVar.M.x();
                return;
            } else if (file == null) {
                int i12 = ckVar.f27496a;
                if (i12 == R.drawable.files_gallery) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
                    if (o2Var instanceof org.telegram.ui.tn) {
                        tnVar = (org.telegram.ui.tn) o2Var;
                    } else {
                        tnVar = null;
                    }
                    org.telegram.ui.tn tnVar2 = tnVar;
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbumEntry;
                    if (tnVar2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.zp0 zp0Var = new org.telegram.ui.zp0(0, albumEntry, hashMap, arrayList, 0, z11, tnVar2, false);
                    zp0Var.f45283h0 = true;
                    zp0Var.f45290o0 = new l3.g0(jkVar, hashMap, arrayList, 17);
                    zp0Var.f0(jkVar.R, false);
                    org.telegram.ui.ActionBar.o2 o2Var2 = niVar.f30990b0;
                    if (o2Var2 != null) {
                        o2Var2.presentFragment(zp0Var);
                    } else {
                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                        if (R != null) {
                            R.presentFragment(zp0Var);
                        }
                    }
                    niVar.dismiss(true);
                    return;
                } else if (i12 == R.drawable.files_music) {
                    zj zjVar = jkVar.M;
                    if (zjVar != null) {
                        zjVar.O();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = jkVar.getTopForScroll();
                    jkVar.Q();
                    ak akVar = (ak) com.google.android.recaptcha.internal.a.j(1, bkVar.d);
                    niVar.T0.setTitle(akVar.f26794b);
                    File file2 = akVar.f26793a;
                    if (file2 != null) {
                        jkVar.M(file2);
                    } else {
                        jkVar.O();
                    }
                    jkVar.V();
                    jkVar.A.h1(0, topForScroll);
                    jkVar.R(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = xjVar.getChildAt(0);
                f2.n1 G = xjVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f26793a = jkVar.K;
                    obj.f26794b = niVar.T0.getTitle();
                    jkVar.Q();
                    bkVar.d.add(obj);
                    if (!jkVar.M(file)) {
                        bkVar.d.remove((Object) obj);
                        return;
                    }
                    jkVar.R(1);
                    niVar.T0.setTitle(ckVar.f27497b);
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
        xj xjVar = this.f29678r;
        View childAt = xjVar.getChildAt(0);
        f2.n1 G = xjVar.G(childAt);
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
        ik ikVar = this.f29682y;
        if (ikVar != null) {
            ikVar.l();
        }
    }

    @Override
    public final void D(fi fiVar) {
        this.N.clear();
        this.P.clear();
        this.f29682y.N.clear();
        this.O.clear();
        this.v.d.clear();
        O();
        V();
        T();
        this.f28403b.T0.setTitle(LocaleController.getString(R.string.SelectFile));
        this.C.setVisibility(0);
        this.A.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f29678r.x0(0);
    }

    @Override
    public final boolean H(final int i10, final boolean z10, int i11, final boolean z11, final long j10) {
        int size = this.N.size();
        HashMap hashMap = this.P;
        if ((size == 0 && hashMap.size() == 0) || this.M == null || this.G) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (org.telegram.ui.z00 z00Var : hashMap.keySet()) {
            arrayList.add((MessageObject) hashMap.get(z00Var));
        }
        final ArrayList arrayList2 = new ArrayList(this.O);
        ni niVar = this.f28403b;
        CharSequence[] charSequenceArr = {niVar.m1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(niVar.F1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return c5.b0(niVar.F1, niVar.n1(), niVar.j1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                jk jkVar = jk.this;
                jkVar.G = true;
                jkVar.M.l(arrayList2, charSequence, entities, arrayList, z10, i10, j10, z11, ((Long) obj).longValue());
                jkVar.f28403b.dismiss(true);
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
                    ckVar.f27497b = file2.getName();
                    ckVar.f27500f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    ckVar.d = str;
                    ckVar.f27498c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        ckVar.f27499e = file2.getAbsolutePath();
                    }
                    this.v.f27149e.add(ckVar);
                }
            }
        }
    }

    public final boolean L(File file) {
        String str;
        int i10;
        String fileExtension = FileLoader.getFileExtension(file);
        if (fileExtension != null) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension);
        } else {
            str = null;
        }
        if (file.length() != 0 && str != null && ef.e.f5897i.contains(str)) {
            if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
                new tc(this.f28403b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
            new tc(this.f28403b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
            return false;
        }
        new tc(this.f28403b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
        return false;
    }

    public final boolean M(File file) {
        String str;
        this.J = false;
        boolean canRead = file.canRead();
        xj xjVar = this.f29678r;
        bk bkVar = this.v;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.K = file;
                bkVar.f27148c.clear();
                Environment.getExternalStorageState();
                AndroidUtilities.clearDrawableAnimation(xjVar);
                this.Q = true;
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
            this.K = file;
            ArrayList arrayList = bkVar.f27148c;
            ArrayList arrayList2 = bkVar.d;
            ArrayList arrayList3 = bkVar.f27148c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    ck ckVar = new ck();
                    ckVar.f27497b = file2.getName();
                    ckVar.f27500f = file2;
                    if (file2.isDirectory()) {
                        ckVar.f27496a = R.drawable.files_folder;
                        ckVar.f27498c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.J = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        ckVar.d = str;
                        ckVar.f27498c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            ckVar.f27499e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(ckVar);
                }
            }
            ck ckVar2 = new ck();
            ckVar2.f27497b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((ak) j7.l1.i(1, arrayList2)).f26793a;
                if (file3 == null) {
                    ckVar2.f27498c = LocaleController.getString(R.string.Folder);
                } else {
                    ckVar2.f27498c = file3.toString();
                }
            } else {
                ckVar2.f27498c = LocaleController.getString(R.string.Folder);
            }
            ckVar2.f27496a = R.drawable.files_folder;
            ckVar2.f27500f = null;
            arrayList3.add(0, ckVar2);
            if (this.K != null) {
                Collections.sort(bkVar.f27148c, new vj(this, 0));
            }
            V();
            AndroidUtilities.clearDrawableAnimation(xjVar);
            this.Q = true;
            int topForScroll = getTopForScroll();
            bkVar.l();
            this.A.h1(0, topForScroll);
            return true;
        } catch (Exception e10) {
            S(e10.getLocalizedMessage());
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
        View m10;
        bk bkVar = this.f29680w;
        bkVar.d.clear();
        ArrayList arrayList = bkVar.d;
        bk bkVar2 = this.v;
        arrayList.addAll(bkVar2.d);
        ArrayList arrayList2 = bkVar.f27148c;
        arrayList2.clear();
        arrayList2.addAll(bkVar2.f27148c);
        ArrayList arrayList3 = bkVar.f27149e;
        arrayList3.clear();
        arrayList3.addAll(bkVar2.f27149e);
        bkVar.l();
        xj xjVar = this.f29679s;
        xjVar.setVisibility(0);
        xj xjVar2 = this.f29678r;
        xjVar.setPadding(xjVar2.getPaddingLeft(), xjVar2.getPaddingTop(), xjVar2.getPaddingRight(), xjVar2.getPaddingBottom());
        gj gjVar = this.A;
        int L0 = gjVar.L0();
        if (L0 >= 0 && (m10 = gjVar.m(L0)) != null) {
            this.f29681x.h1(L0, m10.getTop() - xjVar.getPaddingTop());
        }
    }

    public final void R(int i10) {
        xj xjVar;
        float dp;
        ValueAnimator valueAnimator = this.f29676b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f29677n = i10;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            xjVar = this.f29678r;
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
        xj xjVar2 = this.f29679s;
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
            this.f29676b0 = ValueAnimator.ofFloat(1.0f, 0.0f);
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
            this.f29676b0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f29676b0.addUpdateListener(new uj(this, i10, dp, 0));
        this.f29676b0.addListener(new org.telegram.ui.bm(this, 15));
        if (i10 == 1) {
            this.f29676b0.setDuration(220L);
        } else {
            this.f29676b0.setDuration(200L);
        }
        this.f29676b0.setInterpolator(jr.f29800f);
        this.f29676b0.start();
    }

    public final void S(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f28402a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = string;
        c2Var.P = str;
        j7.l1.C(R.string.OK, alertDialog$Builder, null);
    }

    public final void T() {
        f2.p0 adapter = this.f29678r.getAdapter();
        int i10 = 0;
        boolean z10 = true;
        ik ikVar = this.f29682y;
        if (adapter != ikVar ? this.v.h() != 1 : !ikVar.f29401s.isEmpty() || !ikVar.L.isEmpty()) {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        this.H.setVisibility(i10);
        U();
    }

    public final void U() {
        View childAt;
        lh.x4 x4Var = this.H;
        if (x4Var.getVisibility() != 0 || (childAt = this.f29678r.getChildAt(0)) == null) {
            return;
        }
        float translationY = x4Var.getTranslationY();
        this.I = (childAt.getTop() + (x4Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        x4Var.setTranslationY(translationY);
    }

    public final void V() {
        int i10;
        org.telegram.ui.ActionBar.w0 w0Var = this.B;
        if (w0Var != null && !w0Var.s()) {
            if (!this.J && !this.v.d.isEmpty()) {
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
        xj xjVar = this.f29678r;
        if (xjVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = xjVar.getChildAt(0);
        vk0 vk0Var = (vk0) xjVar.G(childAt);
        int y8 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y8 > 0 && vk0Var != null && vk0Var.b() == 0) {
            i10 = y8;
        }
        if (y8 < 0 || vk0Var == null || vk0Var.b() != 0) {
            y8 = i10;
        }
        return AndroidUtilities.dp(13.0f) + y8;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(5.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f29678r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.P.size() + this.N.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.f23169j5));
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        xj xjVar = this.f29678r;
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23028b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 48, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 8192, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23153i7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 16384, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23190k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 8, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 40, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.i6(xjVar, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Bi));
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
        ak akVar = (ak) com.google.android.recaptcha.internal.a.j(1, bkVar.d);
        this.f28403b.T0.setTitle(akVar.f26794b);
        int topForScroll = getTopForScroll();
        File file = akVar.f26793a;
        if (file != null) {
            M(file);
        } else {
            O();
        }
        V();
        this.A.h1(0, topForScroll);
        R(2);
        return true;
    }

    @Override
    public final void m() {
        try {
            if (this.L) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.f29675a0);
                this.L = false;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.f28403b.T0.h(true);
        org.telegram.ui.ActionBar.a0 n10 = this.f28403b.T0.n();
        n10.removeView(this.C);
        n10.removeView(this.B);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        U();
    }

    @Override
    public final void r() {
        this.C.setVisibility(8);
        this.B.setVisibility(8);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.S = z10;
    }

    public void setDelegate(zj zjVar) {
        this.M = zjVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.R = i10;
    }

    @Override
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        this.f28403b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        int i11;
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.V = SharedConfig.sortFilesByName;
            bk bkVar = this.v;
            Collections.sort(bkVar.f27149e, new vj(this, 1));
            if (this.K != null) {
                Collections.sort(bkVar.f27148c, new vj(this, 0));
            }
            bkVar.l();
            if (this.V) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            this.C.setIcon(i11);
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jk.y(int, int):void");
    }
}
