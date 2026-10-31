package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
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
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public final class xj extends uh {
    public static final int f32479g0 = 0;
    public final wj D;
    public final ag.d1 E;
    public final org.telegram.ui.ActionBar.t0 F;
    public final org.telegram.ui.ActionBar.t0 G;
    public final zf.g0 H;
    public AnimatorSet I;
    public final zz J;
    public boolean K;
    public final kj L;
    public float M;
    public boolean N;
    public File O;
    public boolean P;
    public nj Q;
    public final HashMap R;
    public final ArrayList S;
    public final HashMap T;
    public boolean U;
    public int V;
    public boolean W;
    public final boolean f32480a0;
    public boolean f32481b0;
    public boolean f32482c0;
    public boolean f32483d0;
    public final androidx.mediarouter.app.f f32484e0;
    public ValueAnimator f32485f0;
    public int f32486n;
    public final lj f32487r;
    public final lj f32488s;
    public final pj f32489w;
    public final pj f32490x;
    public final az f32491y;

    public xj(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, bi biVar) {
        super(context, p6Var, biVar);
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
        this.f32484e0 = new androidx.mediarouter.app.f(this, 11);
        pj pjVar = new pj(this, context);
        this.f32489w = pjVar;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32480a0 = z10;
        if (i10 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f32483d0 = z11;
        this.f32482c0 = org.telegram.messenger.tz.M0;
        try {
            if (z11) {
                try {
                    Cursor query = org.telegram.messenger.w0.f19025b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j10 = query.getLong(2);
                            long j11 = query.getLong(3);
                            String string = query.getString(4);
                            cursor = query;
                            if (j10 <= org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).l4 * 1000) {
                                try {
                                    if (j11 <= org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).f18843m4 && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        qj qjVar = new qj();
                                        qjVar.f29666b = file.getName();
                                        qjVar.f29668f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        qjVar.d = str;
                                        qjVar.f29667c = org.telegram.messenger.i0.i0(file.length(), false, false);
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            qjVar.e = file.getAbsolutePath();
                                        }
                                        ((ArrayList) this.f32489w.h).add(qjVar);
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
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            } else {
                O(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort((ArrayList) pjVar.h, new hj(this, 1));
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        this.f32481b0 = false;
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
                org.telegram.messenger.w0.f19025b.registerReceiver(this.f32484e0, intentFilter, 4);
            } else {
                org.telegram.messenger.w0.f19025b.registerReceiver(this.f32484e0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.y p5 = this.f30947b.R2.p();
        org.telegram.ui.ActionBar.t0 a2 = p5.a(0, 2131232485);
        a2.N();
        a2.H = new ag.l3(this, 6);
        this.F = a2;
        a2.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
        a2.setContentDescription(org.telegram.messenger.cd.L0(2131745853, null));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i12 = org.telegram.ui.ActionBar.t6.f21037j5;
        org.telegram.ui.ActionBar.a7.V(searchField, i12, p6Var);
        org.telegram.ui.ActionBar.a7.w(searchField, i12, p6Var);
        org.telegram.ui.ActionBar.a7.E(searchField, org.telegram.ui.ActionBar.t6.Je, p6Var);
        if (this.f32482c0) {
            i11 = 2131232101;
        } else {
            i11 = 2131232100;
        }
        org.telegram.ui.ActionBar.t0 a10 = p5.a(6, i11);
        this.G = a10;
        a10.setContentDescription(org.telegram.messenger.cd.L0(2131754891, null));
        zz zzVar = new zz(context, p6Var);
        this.J = zzVar;
        addView(zzVar);
        kj kjVar = new kj(this, context, zzVar, p6Var);
        this.L = kjVar;
        addView(kjVar, w7.b6.c(-1.0f, -1));
        kjVar.setVisibility(8);
        kjVar.setOnTouchListener(new org.telegram.ui.ActionBar.n2(13));
        lj ljVar = new lj(this, context, p6Var, 0);
        this.f32488s = ljVar;
        ljVar.setSectionsType(2);
        ljVar.setVerticalScrollBarEnabled(false);
        az azVar = new az(org.telegram.messenger.i0.L(56.0f), 0, ljVar);
        this.f32491y = azVar;
        ljVar.setLayoutManager(azVar);
        ljVar.setClipToPadding(false);
        pj pjVar2 = new pj(this, context);
        this.f32490x = pjVar2;
        ljVar.setAdapter(pjVar2);
        addView(ljVar, w7.b6.c(-1.0f, -1));
        ljVar.setVisibility(8);
        lj ljVar2 = new lj(this, context, p6Var, 1);
        this.f32487r = ljVar2;
        ljVar2.r1();
        setBlur3Capture(ljVar2);
        this.d = ljVar2;
        this.h = true;
        this.f30949f = true;
        ljVar2.setSectionsType(2);
        ljVar2.setVerticalScrollBarEnabled(false);
        ag.d1 d1Var = new ag.d1(this, org.telegram.messenger.i0.L(56.0f) + org.telegram.messenger.i0.f16020m, ljVar2, 2);
        this.E = d1Var;
        ljVar2.setLayoutManager(d1Var);
        ljVar2.setClipToPadding(false);
        ljVar2.setAdapter(this.f32489w);
        addView(ljVar2, w7.b6.c(-1.0f, -1));
        this.D = new wj(this, context);
        ljVar2.setOnScrollListener(new ag.u(this, 16));
        ljVar2.setOnItemClickListener(new gk0(this) {
            public final xj f26093b;

            {
                this.f26093b = this;
            }

            @Override
            public final void f(int i13, View view) {
                zf.e0 e0Var;
                switch (r2) {
                    case 0:
                        xj.N(this.f26093b, view, i13);
                        return;
                    default:
                        xj xjVar = this.f26093b;
                        zf.g0 g0Var = xjVar.H;
                        g0Var.I0(true);
                        wj wjVar = xjVar.D;
                        ArrayList arrayList = g0Var.f55500e3;
                        if (arrayList.isEmpty()) {
                            e0Var = zf.g0.f55493j3[i13];
                        } else {
                            e0Var = (zf.e0) arrayList.get(i13);
                        }
                        bi biVar2 = wjVar.X.f30947b;
                        ArrayList arrayList2 = wjVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (e0Var.b((zf.e0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(e0Var);
                        biVar2.R2.setSearchFilter(e0Var);
                        biVar2.R2.setSearchFieldText("");
                        wjVar.a0(null, null, true);
                        return;
                }
            }
        });
        ljVar2.setOnItemLongClickListener(new t(this, 20));
        zf.g0 g0Var = new zf.g0(context, p6Var);
        this.H = g0Var;
        g0Var.setOnItemClickListener(new gk0(this) {
            public final xj f26093b;

            {
                this.f26093b = this;
            }

            @Override
            public final void f(int i13, View view) {
                zf.e0 e0Var;
                switch (r2) {
                    case 0:
                        xj.N(this.f26093b, view, i13);
                        return;
                    default:
                        xj xjVar = this.f26093b;
                        zf.g0 g0Var2 = xjVar.H;
                        g0Var2.I0(true);
                        wj wjVar = xjVar.D;
                        ArrayList arrayList = g0Var2.f55500e3;
                        if (arrayList.isEmpty()) {
                            e0Var = zf.g0.f55493j3[i13];
                        } else {
                            e0Var = (zf.e0) arrayList.get(i13);
                        }
                        bi biVar2 = wjVar.X.f30947b;
                        ArrayList arrayList2 = wjVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (e0Var.b((zf.e0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(e0Var);
                        biVar2.R2.setSearchFilter(e0Var);
                        biVar2.R2.setSearchFieldText("");
                        wjVar.a0(null, null, true);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21001h5, g0Var, p6Var);
        addView(g0Var, w7.b6.e(-1, 44, 48));
        g0Var.setTranslationY(-org.telegram.messenger.i0.L(44.0f));
        g0Var.setVisibility(4);
        R();
        Y();
        W();
    }

    public static void N(xj xjVar, View view, int i10) {
        Object O;
        boolean z10;
        boolean z11;
        int i11;
        bi biVar = xjVar.f30947b;
        lj ljVar = xjVar.f32487r;
        s4.g0 adapter = ljVar.getAdapter();
        pj pjVar = xjVar.f32489w;
        if (adapter == pjVar) {
            O = pjVar.E(i10);
        } else {
            wj wjVar = xjVar.D;
            O = wjVar.O(wjVar.S(i10), wjVar.Q(i10));
        }
        if (O instanceof qj) {
            qj qjVar = (qj) O;
            File file = qjVar.f29668f;
            if (Build.VERSION.SDK_INT >= 30) {
                z10 = Environment.isExternalStorageManager();
            } else {
                z10 = false;
            }
            org.telegram.ui.un unVar = null;
            if (!org.telegram.messenger.v2.f18449b && (((i11 = qjVar.f29665a) == 2131231074 || i11 == 2131231072) && !z10)) {
                ph phVar = biVar.f24695l3;
                int i12 = biVar.D3;
                if (biVar.B3 != null && biVar.B1 - biVar.C1 < 0) {
                    if (!org.telegram.messenger.vp.r1(i12).A3() && org.telegram.messenger.vp.r1(i12).V4 > biVar.C1) {
                        new cc(phVar, biVar.I0).f(org.telegram.messenger.vp.r1(i12).V4, new mg(biVar, 3)).j();
                        return;
                    } else {
                        new cc(phVar, biVar.I0).t(org.telegram.messenger.cd.L0(2131744066, null), biVar.I0).j();
                        return;
                    }
                }
                xjVar.Q.A();
                return;
            } else if (file == null) {
                int i13 = qjVar.f29665a;
                if (i13 == 2131231071) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
                    if (k2Var instanceof org.telegram.ui.un) {
                        unVar = (org.telegram.ui.un) k2Var;
                    }
                    org.telegram.ui.un unVar2 = unVar;
                    org.telegram.messenger.we weVar = MediaController.Y1;
                    if (unVar2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.lo0 lo0Var = new org.telegram.ui.lo0(0, weVar, hashMap, arrayList, 0, z11, unVar2, false);
                    lo0Var.f39342l0 = true;
                    lo0Var.f39351s0 = new li.k(xjVar, hashMap, arrayList, false, 20);
                    lo0Var.j0(xjVar.V, false);
                    org.telegram.ui.ActionBar.k2 k2Var2 = biVar.W1;
                    if (k2Var2 != null) {
                        k2Var2.presentFragment(lo0Var);
                    } else {
                        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            Q.presentFragment(lo0Var);
                        }
                    }
                    biVar.a(true);
                    return;
                } else if (i13 == 2131231073) {
                    nj njVar = xjVar.Q;
                    if (njVar != null) {
                        njVar.S();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = xjVar.getTopForScroll();
                    xjVar.T();
                    oj ojVar = (oj) i0.a.v(1, pjVar.f29370f);
                    biVar.R2.setTitle(ojVar.f29083b);
                    File file2 = ojVar.f29082a;
                    if (file2 != null) {
                        xjVar.Q(file2);
                    } else {
                        xjVar.R();
                    }
                    xjVar.Y();
                    xjVar.E.h1(0, topForScroll);
                    xjVar.U(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = ljVar.getChildAt(0);
                s4.c1 G = ljVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f29082a = xjVar.O;
                    obj.f29083b = biVar.R2.getTitle();
                    xjVar.T();
                    pjVar.f29370f.add(obj);
                    if (!xjVar.Q(file)) {
                        pjVar.f29370f.remove((Object) obj);
                        return;
                    }
                    xjVar.U(1);
                    biVar.R2.setTitle(qjVar.f29666b);
                    return;
                }
                return;
            } else {
                xjVar.S(view, qjVar);
                return;
            }
        }
        xjVar.S(view, O);
    }

    private int getTopForScroll() {
        lj ljVar = this.f32487r;
        View childAt = ljVar.getChildAt(0);
        s4.c1 G = ljVar.G(childAt);
        int i10 = -ljVar.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i10;
        }
        return i10;
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xj.B(int, int):void");
    }

    @Override
    public final void C() {
        pj pjVar = this.f32489w;
        if (pjVar != null) {
            pjVar.f();
        }
        wj wjVar = this.D;
        if (wjVar != null) {
            wjVar.f();
        }
    }

    @Override
    public final void G(uh uhVar) {
        this.R.clear();
        this.T.clear();
        this.D.R.clear();
        this.S.clear();
        this.f32489w.f29370f.clear();
        R();
        Y();
        W();
        this.f30947b.R2.setTitle(org.telegram.messenger.cd.L0(2131745674, null));
        this.G.setVisibility(0);
        this.E.h1(0, 0);
    }

    @Override
    public final void I() {
        this.f32487r.y0(0);
    }

    @Override
    public final boolean J(final boolean z10, final int i10, int i11, final long j10, final boolean z11) {
        int size = this.R.size();
        HashMap hashMap = this.T;
        if ((size == 0 && hashMap.size() == 0) || this.Q == null || this.K) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (org.telegram.ui.s00 s00Var : hashMap.keySet()) {
            arrayList.add((org.telegram.messenger.jj) hashMap.get(s00Var));
        }
        final ArrayList arrayList2 = new ArrayList(this.S);
        bi biVar = this.f30947b;
        CharSequence[] charSequenceArr = {biVar.Z0().getText()};
        final ArrayList W = org.telegram.messenger.ui.b0(biVar.D3).W(charSequenceArr, true, true);
        final String charSequence = charSequenceArr[0].toString();
        return s4.a0(biVar.D3, biVar.a1(), biVar.W0() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new org.telegram.messenger.q20() {
            @Override
            public final void a(Object obj) {
                xj xjVar = xj.this;
                xjVar.K = true;
                xjVar.Q.m(arrayList2, charSequence, W, arrayList, z10, i10, j10, z11, ((Long) obj).longValue());
                xjVar.f30947b.a(true);
            }
        }, 0L);
    }

    public final void O(File file) {
        String str;
        File[] listFiles = file.listFiles();
        File j10 = org.telegram.messenger.b8.j(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    O(file2);
                } else if (!file2.equals(j10)) {
                    qj qjVar = new qj();
                    qjVar.f29666b = file2.getName();
                    qjVar.f29668f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    qjVar.d = str;
                    qjVar.f29667c = org.telegram.messenger.i0.i0(file2.length(), false, false);
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        qjVar.e = file2.getAbsolutePath();
                    }
                    ((ArrayList) this.f32489w.h).add(qjVar);
                }
            }
        }
    }

    public final boolean P(File file) {
        String str;
        int i10;
        String D = org.telegram.messenger.b8.D(file);
        if (D != null) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(D);
        } else {
            str = null;
        }
        if (file.length() != 0 && str != null && of.c.f14157i.contains(str)) {
            if (file.length() > org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).f18843m4) {
                new cc(this.f30947b.f21589c, null).u(org.telegram.messenger.cd.a0("TooLargeError", null, 2131744067, new Object[0]), org.telegram.messenger.cd.a0("ErrorRingtoneSizeTooBig", null, 2131751103, Integer.valueOf(org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).f18843m4 / 1024)), null).j();
                return false;
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(org.telegram.messenger.w0.f19025b, Uri.fromFile(file));
                i10 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                i10 = Integer.MAX_VALUE;
            }
            if (i10 <= org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).l4 * 1000) {
                return true;
            }
            new cc(this.f30947b.f21589c, null).u(org.telegram.messenger.cd.a0("TooLongError", null, 2131744066, new Object[0]), org.telegram.messenger.cd.a0("ErrorRingtoneDurationTooLong", null, 2131751105, Integer.valueOf(org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).l4)), null).j();
            return false;
        }
        new cc(this.f30947b.f21589c, null).u(org.telegram.messenger.cd.a0("InvalidFormatError", null, 2131749191, new Object[0]), org.telegram.messenger.cd.L0(2131751104, null), null).j();
        return false;
    }

    public final boolean Q(File file) {
        File file2;
        String str;
        pj pjVar;
        this.N = false;
        boolean canRead = file.canRead();
        lj ljVar = this.f32487r;
        String str2 = null;
        pj pjVar2 = this.f32489w;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.O = file;
                pjVar2.e.clear();
                Environment.getExternalStorageState();
                org.telegram.messenger.i0.y(ljVar);
                this.U = true;
                pjVar2.f();
                return true;
            }
            V(org.telegram.messenger.cd.L0(2131754711, null));
            return false;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                V(org.telegram.messenger.cd.L0(2131743904, null));
                return false;
            }
            this.O = file;
            ArrayList arrayList = pjVar2.e;
            ArrayList arrayList2 = pjVar2.f29370f;
            ArrayList arrayList3 = pjVar2.e;
            arrayList.clear();
            File j10 = org.telegram.messenger.b8.j(6);
            int i10 = 0;
            while (i10 < listFiles.length) {
                File file3 = listFiles[i10];
                if (file3.getName().indexOf(46) == 0 || file3.equals(j10)) {
                    pjVar = pjVar2;
                } else {
                    qj qjVar = new qj();
                    qjVar.f29666b = file3.getName();
                    qjVar.f29668f = file3;
                    if (file3.isDirectory()) {
                        qjVar.f29665a = 2131231070;
                        qjVar.f29667c = org.telegram.messenger.cd.L0(2131750686, str2);
                        pjVar = pjVar2;
                    } else {
                        this.N = true;
                        String name = file3.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        qjVar.d = str;
                        pjVar = pjVar2;
                        qjVar.f29667c = org.telegram.messenger.i0.i0(file3.length(), false, false);
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            qjVar.e = file3.getAbsolutePath();
                        }
                    }
                    arrayList3.add(qjVar);
                }
                i10++;
                pjVar2 = pjVar;
                str2 = null;
            }
            pj pjVar3 = pjVar2;
            qj qjVar2 = new qj();
            qjVar2.f29666b = "..";
            if (arrayList2.size() > 0) {
                File file4 = ((oj) i0.a.g(1, arrayList2)).f29082a;
                if (file4 == null) {
                    file2 = null;
                    qjVar2.f29667c = org.telegram.messenger.cd.L0(2131750686, null);
                } else {
                    file2 = null;
                    qjVar2.f29667c = file4.toString();
                }
            } else {
                file2 = null;
                qjVar2.f29667c = org.telegram.messenger.cd.L0(2131750686, null);
            }
            qjVar2.f29665a = 2131231070;
            qjVar2.f29668f = file2;
            arrayList3.add(0, qjVar2);
            if (this.O != null) {
                Collections.sort(pjVar3.e, new hj(this, 0));
            }
            Y();
            org.telegram.messenger.i0.y(ljVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            pjVar3.f();
            this.E.h1(0, topForScroll);
            return true;
        } catch (Exception e) {
            V(e.getLocalizedMessage());
            return false;
        }
    }

    public final void R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xj.R():void");
    }

    public final boolean S(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xj.S(android.view.View, java.lang.Object):boolean");
    }

    public final void T() {
        View m10;
        pj pjVar = this.f32490x;
        pjVar.f29370f.clear();
        ArrayList arrayList = pjVar.f29370f;
        pj pjVar2 = this.f32489w;
        arrayList.addAll(pjVar2.f29370f);
        ArrayList arrayList2 = pjVar.e;
        arrayList2.clear();
        arrayList2.addAll(pjVar2.e);
        ArrayList arrayList3 = (ArrayList) pjVar.h;
        arrayList3.clear();
        arrayList3.addAll((ArrayList) pjVar2.h);
        pjVar.f();
        lj ljVar = this.f32488s;
        ljVar.setVisibility(0);
        lj ljVar2 = this.f32487r;
        ljVar.setPadding(ljVar2.getPaddingLeft(), ljVar2.getPaddingTop(), ljVar2.getPaddingRight(), ljVar2.getPaddingBottom());
        ag.d1 d1Var = this.E;
        int L0 = d1Var.L0();
        if (L0 >= 0 && (m10 = d1Var.m(L0)) != null) {
            this.f32491y.h1(L0, m10.getTop() - ljVar.getPaddingTop());
        }
    }

    public final void U(int i10) {
        lj ljVar;
        float L;
        ValueAnimator valueAnimator = this.f32485f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f32486n = i10;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            ljVar = this.f32487r;
            if (i11 < childCount) {
                if (getChildAt(i11) == ljVar) {
                    break;
                }
                i11++;
            } else {
                i11 = 0;
                break;
            }
        }
        lj ljVar2 = this.f32488s;
        if (i10 == 1) {
            L = org.telegram.messenger.i0.L(150.0f);
            ljVar2.setAlpha(1.0f);
            ljVar2.setScaleX(1.0f);
            ljVar2.setScaleY(1.0f);
            ljVar2.setTranslationX(0.0f);
            removeView(ljVar2);
            addView(ljVar2, i11);
            ljVar2.setVisibility(0);
            ljVar.setTranslationX(L);
            ljVar.setAlpha(0.0f);
            this.f32485f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            L = org.telegram.messenger.i0.L(150.0f);
            ljVar.setAlpha(0.0f);
            ljVar.setScaleX(0.95f);
            ljVar.setScaleY(0.95f);
            ljVar2.setScaleX(1.0f);
            ljVar2.setScaleY(1.0f);
            ljVar2.setTranslationX(0.0f);
            ljVar2.setAlpha(1.0f);
            removeView(ljVar2);
            addView(ljVar2, i11 + 1);
            ljVar2.setVisibility(0);
            this.f32485f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f32485f0.addUpdateListener(new gj(this, i10, L, 0));
        this.f32485f0.addListener(new w5(this, 11));
        if (i10 == 1) {
            this.f32485f0.setDuration(220L);
        } else {
            this.f32485f0.setDuration(200L);
        }
        this.f32485f0.setInterpolator(gr.f26495f);
        this.f32485f0.start();
    }

    public final void V(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f30946a);
        String L0 = org.telegram.messenger.cd.L0(2131689472, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = str;
        i0.a.w(null, 2131747847, alertDialog$Builder, null);
    }

    public final void W() {
        s4.g0 adapter = this.f32487r.getAdapter();
        int i10 = 0;
        boolean z10 = true;
        wj wjVar = this.D;
        if (adapter != wjVar ? this.f32489w.b() != 1 : !wjVar.f32205s.isEmpty() || !wjVar.P.isEmpty()) {
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
        kj kjVar = this.L;
        if (kjVar.getVisibility() != 0 || (childAt = this.f32487r.getChildAt(0)) == null) {
            return;
        }
        float translationY = kjVar.getTranslationY();
        this.M = (childAt.getTop() + (kjVar.getMeasuredHeight() - getMeasuredHeight())) / 2;
        kjVar.setTranslationY(translationY);
    }

    public final void Y() {
        int i10;
        org.telegram.ui.ActionBar.t0 t0Var = this.F;
        if (t0Var != null && !t0Var.v()) {
            if (!this.N && !this.f32489w.f29370f.isEmpty()) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            t0Var.setVisibility(i10);
        }
    }

    @Override
    public final void d() {
        org.telegram.ui.ActionBar.t0 t0Var = this.F;
        if (t0Var != null) {
            try {
                if (t0Var.getSearchField() != null) {
                    t0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21037j5, this.f30946a));
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return org.telegram.messenger.i0.L(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        lj ljVar = this.f32487r;
        if (ljVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        View childAt = ljVar.getChildAt(0);
        ck0 ck0Var = (ck0) ljVar.G(childAt);
        int y3 = ((((int) childAt.getY()) - org.telegram.messenger.i0.f16020m) - org.telegram.messenger.i0.L(4.0f)) - org.telegram.messenger.i0.L(8.0f);
        if (y3 > 0 && ck0Var != null && ck0Var.b() == 0) {
            i10 = y3;
        }
        if (y3 < 0 || ck0Var == null || ck0Var.b() != 0) {
            y3 = i10;
        }
        return org.telegram.messenger.i0.L(13.0f) + y3;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(5.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f32487r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.c7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.c7> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.F.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21037j5));
        int i10 = org.telegram.ui.ActionBar.t6.A5;
        lj ljVar = this.f32487r;
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, 32, new Class[]{org.telegram.ui.Cells.c7.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20892b7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, 48, new Class[]{org.telegram.ui.Cells.c7.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20872a7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21020i6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.t6.f21052k0, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20930d7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, 4, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, 4, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"dateTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, 8192, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21021i7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, 16384, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21059k7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, 8, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, 40, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.oj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ljVar, 4, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"extTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.pj));
        return arrayList;
    }

    @Override
    public final int i() {
        return 1;
    }

    @Override
    public final boolean j() {
        pj pjVar = this.f32489w;
        if (pjVar.f29370f.size() <= 0) {
            return false;
        }
        T();
        oj ojVar = (oj) i0.a.v(1, pjVar.f29370f);
        this.f30947b.R2.setTitle(ojVar.f29083b);
        int topForScroll = getTopForScroll();
        File file = ojVar.f29082a;
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
    public final void o() {
        try {
            if (this.P) {
                org.telegram.messenger.w0.f19025b.unregisterReceiver(this.f32484e0);
                this.P = false;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        this.f30947b.R2.k(true);
        org.telegram.ui.ActionBar.y p5 = this.f30947b.R2.p();
        p5.removeView(this.G);
        p5.removeView(this.F);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        X();
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.W = z10;
    }

    public void setDelegate(nj njVar) {
        this.Q = njVar;
    }

    public void setMaxSelectedFiles(int i10) {
        this.V = i10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30947b.f21586b.invalidate();
    }

    @Override
    public final void t() {
        this.G.setVisibility(8);
        this.F.setVisibility(8);
    }

    @Override
    public final void w(int i10) {
        int i11;
        if (i10 == 6) {
            org.telegram.messenger.tz.M0 = !org.telegram.messenger.tz.M0;
            SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
            edit.putBoolean("sortFilesByName", org.telegram.messenger.tz.M0);
            edit.apply();
            this.f32482c0 = org.telegram.messenger.tz.M0;
            pj pjVar = this.f32489w;
            Collections.sort((ArrayList) pjVar.h, new hj(this, 1));
            if (this.O != null) {
                Collections.sort(pjVar.e, new hj(this, 0));
            }
            pjVar.f();
            if (this.f32482c0) {
                i11 = 2131232101;
            } else {
                i11 = 2131232100;
            }
            this.G.setIcon(i11);
        }
    }
}
