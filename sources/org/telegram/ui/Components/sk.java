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
public final class sk extends qi {
    public static final int f30761g0 = 0;
    public final hg.f0 E;
    public final org.telegram.ui.ActionBar.u0 F;
    public final org.telegram.ui.ActionBar.u0 G;
    public final gg.r0 H;
    public AnimatorSet I;
    public final k10 J;
    public boolean K;
    public final ai.e7 L;
    public float M;
    public boolean N;
    public File O;
    public boolean P;
    public jk Q;
    public final HashMap R;
    public final ArrayList S;
    public final HashMap T;
    public boolean U;
    public int V;
    public boolean W;
    public final boolean f30762a0;
    public boolean f30763b0;
    public boolean f30764c0;
    public boolean f30765d0;
    public final androidx.mediarouter.app.g f30766e0;
    public ValueAnimator f30767f0;
    public int f30768n;
    public final hk f30769r;
    public final hk f30770s;
    public final lk v;
    public final lk f30771w;
    public final g00 f30772x;
    public final rk f30773y;

    public sk(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, yi yiVar) {
        super(context, d6Var, yiVar);
        boolean z10;
        boolean z11;
        int i11;
        Cursor cursor;
        String str;
        this.P = false;
        this.R = new HashMap();
        this.S = new ArrayList();
        this.T = new HashMap();
        this.V = -1;
        this.f30766e0 = new androidx.mediarouter.app.g(this, 7);
        lk lkVar = new lk(this, context);
        this.v = lkVar;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30762a0 = z10;
        if (i10 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f30765d0 = z11;
        this.f30764c0 = SharedConfig.sortFilesByName;
        try {
            if (z11) {
                try {
                    Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j3 = query.getLong(2);
                            long j10 = query.getLong(3);
                            String string = query.getString(4);
                            cursor = query;
                            if (j3 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax * 1000) {
                                try {
                                    if (j10 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        mk mkVar = new mk();
                                        mkVar.f28733b = file.getName();
                                        mkVar.f28736f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        mkVar.d = str;
                                        mkVar.f28734c = AndroidUtilities.formatFileSize(file.length());
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            mkVar.f28735e = file.getAbsolutePath();
                                        }
                                        this.v.f28356e.add(mkVar);
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else {
                O(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(lkVar.f28356e, new fk(this, 1));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.f30763b0 = false;
        if (!this.P) {
            this.P = true;
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
                ApplicationLoader.applicationContext.registerReceiver(this.f30766e0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.f30766e0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.y o9 = this.f30161b.f33199a1.o();
        org.telegram.ui.ActionBar.u0 a2 = o9.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 5);
        this.F = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i12 = org.telegram.ui.ActionBar.h6.f20894j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, this.f30160a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.h6.w0(i12, this.f30160a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Vd, this.f30160a));
        if (this.f30764c0) {
            i11 = R.drawable.msg_contacts_time;
        } else {
            i11 = R.drawable.msg_contacts_name;
        }
        org.telegram.ui.ActionBar.u0 a10 = o9.a(6, i11);
        this.G = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        k10 k10Var = new k10(context, d6Var);
        this.J = k10Var;
        addView(k10Var);
        ai.e7 e7Var = new ai.e7(this, context, k10Var, d6Var);
        this.L = e7Var;
        addView(e7Var, w7.x5.d(-1.0f, -1));
        e7Var.setVisibility(8);
        e7Var.setOnTouchListener(new bi.d(14));
        hk hkVar = new hk(this, context, d6Var, 0);
        this.f30770s = hkVar;
        hkVar.setSectionsType(2);
        hkVar.setVerticalScrollBarEnabled(false);
        g00 g00Var = new g00(AndroidUtilities.dp(56.0f), 0, hkVar);
        this.f30772x = g00Var;
        hkVar.setLayoutManager(g00Var);
        hkVar.setClipToPadding(false);
        lk lkVar2 = new lk(this, context);
        this.f30771w = lkVar2;
        hkVar.setAdapter(lkVar2);
        addView(hkVar, w7.x5.d(-1.0f, -1));
        hkVar.setVisibility(8);
        hk hkVar2 = new hk(this, context, d6Var, 1);
        this.f30769r = hkVar2;
        hkVar2.p1();
        this.f30162c = hkVar2;
        this.d = hkVar2;
        this.h = true;
        this.f30164f = true;
        hkVar2.setSectionsType(2);
        hkVar2.setVerticalScrollBarEnabled(false);
        hg.f0 f0Var = new hg.f0(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, hkVar2, 2);
        this.E = f0Var;
        hkVar2.setLayoutManager(f0Var);
        hkVar2.setClipToPadding(false);
        hkVar2.setAdapter(this.v);
        addView(hkVar2, w7.x5.d(-1.0f, -1));
        this.f30773y = new rk(this, context);
        hkVar2.setOnScrollListener(new ai.r(this, 19));
        hkVar2.setOnItemClickListener(new gm0(this) {
            public final sk f25623b;

            {
                this.f25623b = this;
            }

            @Override
            public final void d(int i13, View view) {
                gg.p0 p0Var;
                switch (r2) {
                    case 0:
                        sk.N(this.f25623b, view, i13);
                        return;
                    default:
                        sk skVar = this.f25623b;
                        gg.r0 r0Var = skVar.H;
                        r0Var.I0(true);
                        rk rkVar = skVar.f30773y;
                        ArrayList arrayList = r0Var.V2;
                        if (arrayList.isEmpty()) {
                            p0Var = gg.r0.f10778a3[i13];
                        } else {
                            p0Var = (gg.p0) arrayList.get(i13);
                        }
                        yi yiVar2 = rkVar.X.f30161b;
                        ArrayList arrayList2 = rkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (p0Var.b((gg.p0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(p0Var);
                        yiVar2.f33199a1.setSearchFilter(p0Var);
                        yiVar2.f33199a1.setSearchFieldText("");
                        rkVar.a0(null, null, true);
                        return;
                }
            }
        });
        hkVar2.setOnItemLongClickListener(new s(this, 20));
        gg.r0 r0Var = new gg.r0(context, d6Var);
        this.H = r0Var;
        r0Var.setOnItemClickListener(new gm0(this) {
            public final sk f25623b;

            {
                this.f25623b = this;
            }

            @Override
            public final void d(int i13, View view) {
                gg.p0 p0Var;
                switch (r2) {
                    case 0:
                        sk.N(this.f25623b, view, i13);
                        return;
                    default:
                        sk skVar = this.f25623b;
                        gg.r0 r0Var2 = skVar.H;
                        r0Var2.I0(true);
                        rk rkVar = skVar.f30773y;
                        ArrayList arrayList = r0Var2.V2;
                        if (arrayList.isEmpty()) {
                            p0Var = gg.r0.f10778a3[i13];
                        } else {
                            p0Var = (gg.p0) arrayList.get(i13);
                        }
                        yi yiVar2 = rkVar.X.f30161b;
                        ArrayList arrayList2 = rkVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (p0Var.b((gg.p0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(p0Var);
                        yiVar2.f33199a1.setSearchFilter(p0Var);
                        yiVar2.f33199a1.setSearchFieldText("");
                        rkVar.a0(null, null, true);
                        return;
                }
            }
        });
        r0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20857h5, this.f30160a));
        addView(r0Var, w7.x5.e(-1, 44, 48));
        r0Var.setTranslationY(-AndroidUtilities.dp(44.0f));
        r0Var.setVisibility(4);
        R();
        Y();
        W();
    }

    public static void N(sk skVar, View view, int i10) {
        Object O;
        boolean z10;
        org.telegram.ui.zn znVar;
        boolean z11;
        int i11;
        yi yiVar = skVar.f30161b;
        hk hkVar = skVar.f30769r;
        s4.i0 adapter = hkVar.getAdapter();
        lk lkVar = skVar.v;
        if (adapter == lkVar) {
            O = lkVar.E(i10);
        } else {
            rk rkVar = skVar.f30773y;
            O = rkVar.O(rkVar.S(i10), rkVar.Q(i10));
        }
        if (O instanceof mk) {
            mk mkVar = (mk) O;
            File file = mkVar.f28736f;
            if (Build.VERSION.SDK_INT >= 30) {
                z10 = Environment.isExternalStorageManager();
            } else {
                z10 = false;
            }
            if (!BuildVars.NO_SCOPED_STORAGE && (((i11 = mkVar.f28732a) == R.drawable.files_storage || i11 == R.drawable.files_internal) && !z10)) {
                skVar.Q.x();
                return;
            } else if (file == null) {
                int i12 = mkVar.f28732a;
                if (i12 == R.drawable.files_gallery) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33216f0;
                    if (m2Var instanceof org.telegram.ui.zn) {
                        znVar = (org.telegram.ui.zn) m2Var;
                    } else {
                        znVar = null;
                    }
                    org.telegram.ui.zn znVar2 = znVar;
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbumEntry;
                    if (znVar2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.ar0 ar0Var = new org.telegram.ui.ar0(0, albumEntry, hashMap, arrayList, 0, z11, znVar2, false);
                    ar0Var.f36149l0 = true;
                    ar0Var.f36158s0 = new la.h(skVar, hashMap, arrayList, false, 13);
                    ar0Var.f0(skVar.V, false);
                    org.telegram.ui.ActionBar.m2 m2Var2 = yiVar.f33216f0;
                    if (m2Var2 != null) {
                        m2Var2.presentFragment(ar0Var);
                    } else {
                        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                        if (R != null) {
                            R.presentFragment(ar0Var);
                        }
                    }
                    yiVar.dismiss(true);
                    return;
                } else if (i12 == R.drawable.files_music) {
                    jk jkVar = skVar.Q;
                    if (jkVar != null) {
                        jkVar.O();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = skVar.getTopForScroll();
                    skVar.T();
                    kk kkVar = (kk) hg.c.x(1, lkVar.d);
                    yiVar.f33199a1.setTitle(kkVar.f28021b);
                    File file2 = kkVar.f28020a;
                    if (file2 != null) {
                        skVar.Q(file2);
                    } else {
                        skVar.R();
                    }
                    skVar.Y();
                    skVar.E.h1(0, topForScroll);
                    skVar.U(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = hkVar.getChildAt(0);
                s4.d1 G = hkVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f28020a = skVar.O;
                    obj.f28021b = yiVar.f33199a1.getTitle();
                    skVar.T();
                    lkVar.d.add(obj);
                    if (!skVar.Q(file)) {
                        lkVar.d.remove((Object) obj);
                        return;
                    }
                    skVar.U(1);
                    yiVar.f33199a1.setTitle(mkVar.f28733b);
                    return;
                }
                return;
            } else {
                skVar.S(view, mkVar);
                return;
            }
        }
        skVar.S(view, O);
    }

    private int getTopForScroll() {
        hk hkVar = this.f30769r;
        View childAt = hkVar.getChildAt(0);
        s4.d1 G = hkVar.G(childAt);
        int i10 = -hkVar.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i10;
        }
        return i10;
    }

    @Override
    public final void C(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sk.C(int, int):void");
    }

    @Override
    public final void D() {
        lk lkVar = this.v;
        if (lkVar != null) {
            lkVar.l();
        }
        rk rkVar = this.f30773y;
        if (rkVar != null) {
            rkVar.l();
        }
    }

    @Override
    public final void G(qi qiVar) {
        this.R.clear();
        this.T.clear();
        this.f30773y.R.clear();
        this.S.clear();
        this.v.d.clear();
        R();
        Y();
        W();
        this.f30161b.f33199a1.setTitle(LocaleController.getString(R.string.SelectFile));
        this.G.setVisibility(0);
        this.E.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f30769r.x0(0);
    }

    @Override
    public final boolean K(final int i10, final boolean z10, int i11, final boolean z11, final long j3) {
        int size = this.R.size();
        HashMap hashMap = this.T;
        if ((size == 0 && hashMap.size() == 0) || this.Q == null || this.K) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (org.telegram.ui.n10 n10Var : hashMap.keySet()) {
            arrayList.add((MessageObject) hashMap.get(n10Var));
        }
        final ArrayList arrayList2 = new ArrayList(this.S);
        yi yiVar = this.f30161b;
        CharSequence[] charSequenceArr = {yiVar.o1().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(yiVar.M1).getEntities(charSequenceArr, true);
        final String charSequence = charSequenceArr[0].toString();
        return g5.a0(yiVar.M1, yiVar.p1(), yiVar.l1() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                sk skVar = sk.this;
                skVar.K = true;
                skVar.Q.k(arrayList2, charSequence, entities, arrayList, z10, i10, j3, z11, ((Long) obj).longValue());
                skVar.f30161b.dismiss(true);
            }
        }, 0L);
    }

    public final void O(File file) {
        String str;
        File[] listFiles = file.listFiles();
        File checkDirectory = FileLoader.checkDirectory(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    O(file2);
                } else if (!file2.equals(checkDirectory)) {
                    mk mkVar = new mk();
                    mkVar.f28733b = file2.getName();
                    mkVar.f28736f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    mkVar.d = str;
                    mkVar.f28734c = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        mkVar.f28735e = file2.getAbsolutePath();
                    }
                    this.v.f28356e.add(mkVar);
                }
            }
        }
    }

    public final boolean P(File file) {
        String str;
        int i10;
        String fileExtension = FileLoader.getFileExtension(file);
        if (fileExtension != null) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension);
        } else {
            str = null;
        }
        if (file.length() != 0 && str != null && vf.c.f49641i.contains(str)) {
            if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
                new ad(this.f30161b.getContainer(), null).u(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).j();
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
            new ad(this.f30161b.getContainer(), null).u(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).j();
            return false;
        }
        new ad(this.f30161b.getContainer(), null).u(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).j();
        return false;
    }

    public final boolean Q(File file) {
        String str;
        this.N = false;
        boolean canRead = file.canRead();
        hk hkVar = this.f30769r;
        lk lkVar = this.v;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.O = file;
                lkVar.f28355c.clear();
                Environment.getExternalStorageState();
                AndroidUtilities.clearDrawableAnimation(hkVar);
                this.U = true;
                lkVar.l();
                return true;
            }
            V(LocaleController.getString(R.string.AccessError));
            return false;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                V(LocaleController.getString(R.string.UnknownError));
                return false;
            }
            this.O = file;
            ArrayList arrayList = lkVar.f28355c;
            ArrayList arrayList2 = lkVar.d;
            ArrayList arrayList3 = lkVar.f28355c;
            arrayList.clear();
            File checkDirectory = FileLoader.checkDirectory(6);
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0 && !file2.equals(checkDirectory)) {
                    mk mkVar = new mk();
                    mkVar.f28733b = file2.getName();
                    mkVar.f28736f = file2;
                    if (file2.isDirectory()) {
                        mkVar.f28732a = R.drawable.files_folder;
                        mkVar.f28734c = LocaleController.getString(R.string.Folder);
                    } else {
                        this.N = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        mkVar.d = str;
                        mkVar.f28734c = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            mkVar.f28735e = file2.getAbsolutePath();
                        }
                    }
                    arrayList3.add(mkVar);
                }
            }
            mk mkVar2 = new mk();
            mkVar2.f28733b = "..";
            if (arrayList2.size() > 0) {
                File file3 = ((kk) hg.c.g(1, arrayList2)).f28020a;
                if (file3 == null) {
                    mkVar2.f28734c = LocaleController.getString(R.string.Folder);
                } else {
                    mkVar2.f28734c = file3.toString();
                }
            } else {
                mkVar2.f28734c = LocaleController.getString(R.string.Folder);
            }
            mkVar2.f28732a = R.drawable.files_folder;
            mkVar2.f28736f = null;
            arrayList3.add(0, mkVar2);
            if (this.O != null) {
                Collections.sort(lkVar.f28355c, new fk(this, 0));
            }
            Y();
            AndroidUtilities.clearDrawableAnimation(hkVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            lkVar.l();
            this.E.h1(0, topForScroll);
            return true;
        } catch (Exception e7) {
            V(e7.getLocalizedMessage());
            return false;
        }
    }

    public final void R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sk.R():void");
    }

    public final boolean S(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sk.S(android.view.View, java.lang.Object):boolean");
    }

    public final void T() {
        View m10;
        lk lkVar = this.f30771w;
        lkVar.d.clear();
        ArrayList arrayList = lkVar.d;
        lk lkVar2 = this.v;
        arrayList.addAll(lkVar2.d);
        ArrayList arrayList2 = lkVar.f28355c;
        arrayList2.clear();
        arrayList2.addAll(lkVar2.f28355c);
        ArrayList arrayList3 = lkVar.f28356e;
        arrayList3.clear();
        arrayList3.addAll(lkVar2.f28356e);
        lkVar.l();
        hk hkVar = this.f30770s;
        hkVar.setVisibility(0);
        hk hkVar2 = this.f30769r;
        hkVar.setPadding(hkVar2.getPaddingLeft(), hkVar2.getPaddingTop(), hkVar2.getPaddingRight(), hkVar2.getPaddingBottom());
        hg.f0 f0Var = this.E;
        int L0 = f0Var.L0();
        if (L0 >= 0 && (m10 = f0Var.m(L0)) != null) {
            this.f30772x.h1(L0, m10.getTop() - hkVar.getPaddingTop());
        }
    }

    public final void U(int i10) {
        hk hkVar;
        float dp;
        ValueAnimator valueAnimator = this.f30767f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f30768n = i10;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            hkVar = this.f30769r;
            if (i11 < childCount) {
                if (getChildAt(i11) == hkVar) {
                    break;
                }
                i11++;
            } else {
                i11 = 0;
                break;
            }
        }
        hk hkVar2 = this.f30770s;
        if (i10 == 1) {
            dp = AndroidUtilities.dp(150.0f);
            hkVar2.setAlpha(1.0f);
            hkVar2.setScaleX(1.0f);
            hkVar2.setScaleY(1.0f);
            hkVar2.setTranslationX(0.0f);
            removeView(hkVar2);
            addView(hkVar2, i11);
            hkVar2.setVisibility(0);
            hkVar.setTranslationX(dp);
            hkVar.setAlpha(0.0f);
            this.f30767f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            dp = AndroidUtilities.dp(150.0f);
            hkVar.setAlpha(0.0f);
            hkVar.setScaleX(0.95f);
            hkVar.setScaleY(0.95f);
            hkVar2.setScaleX(1.0f);
            hkVar2.setScaleY(1.0f);
            hkVar2.setTranslationX(0.0f);
            hkVar2.setAlpha(1.0f);
            removeView(hkVar2);
            addView(hkVar2, i11 + 1);
            hkVar2.setVisibility(0);
            this.f30767f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f30767f0.addUpdateListener(new ek(this, i10, dp, 0));
        this.f30767f0.addListener(new t8(this, 7));
        if (i10 == 1) {
            this.f30767f0.setDuration(220L);
        } else {
            this.f30767f0.setDuration(200L);
        }
        this.f30767f0.setInterpolator(is.f27451f);
        this.f30767f0.start();
    }

    public final void V(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f30160a);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
        a2Var.R = string;
        a2Var.T = str;
        org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
    }

    public final void W() {
        s4.i0 adapter = this.f30769r.getAdapter();
        int i10 = 0;
        boolean z10 = true;
        rk rkVar = this.f30773y;
        if (adapter != rkVar ? this.v.h() != 1 : !rkVar.f30473s.isEmpty() || !rkVar.P.isEmpty()) {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        this.L.setVisibility(i10);
        X();
    }

    public final void X() {
        View childAt;
        ai.e7 e7Var = this.L;
        if (e7Var.getVisibility() != 0 || (childAt = this.f30769r.getChildAt(0)) == null) {
            return;
        }
        float translationY = e7Var.getTranslationY();
        this.M = (childAt.getTop() + (e7Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        e7Var.setTranslationY(translationY);
    }

    public final void Y() {
        int i10;
        org.telegram.ui.ActionBar.u0 u0Var = this.F;
        if (u0Var != null && !u0Var.s()) {
            if (!this.N && !this.v.d.isEmpty()) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            u0Var.setVisibility(i10);
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        hk hkVar = this.f30769r;
        if (hkVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = hkVar.getChildAt(0);
        cm0 cm0Var = (cm0) hkVar.G(childAt);
        int y3 = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y3 > 0 && cm0Var != null && cm0Var.b() == 0) {
            i10 = y3;
        }
        if (y3 < 0 || cm0Var == null || cm0Var.b() != 0) {
            y3 = i10;
        }
        return AndroidUtilities.dp(13.0f) + y3;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(5.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f30769r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F.getSearchField(), 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.f20894j5));
        int i10 = org.telegram.ui.ActionBar.h6.A5;
        hk hkVar = this.f30769r;
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20750b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20730a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20877i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20908k0, null, null, org.telegram.ui.ActionBar.h6.f20787d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20878i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20915k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar, 40, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ai));
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Bi));
        return arrayList;
    }

    @Override
    public final int i() {
        return 1;
    }

    @Override
    public final boolean j() {
        lk lkVar = this.v;
        if (lkVar.d.size() <= 0) {
            return false;
        }
        T();
        kk kkVar = (kk) hg.c.x(1, lkVar.d);
        this.f30161b.f33199a1.setTitle(kkVar.f28021b);
        int topForScroll = getTopForScroll();
        File file = kkVar.f28020a;
        if (file != null) {
            Q(file);
        } else {
            R();
        }
        Y();
        this.E.h1(0, topForScroll);
        U(2);
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        X();
    }

    @Override
    public final void p() {
        try {
            if (this.P) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.f30766e0);
                this.P = false;
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        this.f30161b.f33199a1.h(true);
        org.telegram.ui.ActionBar.y o9 = this.f30161b.f33199a1.o();
        o9.removeView(this.G);
        o9.removeView(this.F);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.W = z10;
    }

    public void setDelegate(jk jkVar) {
        this.Q = jkVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.V = i10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30161b.getSheetContainer().invalidate();
    }

    @Override
    public final void u() {
        this.G.setVisibility(8);
        this.F.setVisibility(8);
    }

    @Override
    public final void w(int i10) {
        int i11;
        if (i10 == 6) {
            SharedConfig.toggleSortFilesByName();
            this.f30764c0 = SharedConfig.sortFilesByName;
            lk lkVar = this.v;
            Collections.sort(lkVar.f28356e, new fk(this, 1));
            if (this.O != null) {
                Collections.sort(lkVar.f28355c, new fk(this, 0));
            }
            lkVar.l();
            if (this.f30764c0) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            this.G.setIcon(i11);
        }
    }
}
