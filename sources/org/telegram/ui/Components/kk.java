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
public final class kk extends ki {
    public static final int f36772h0 = 0;
    public final jk E;
    public final kg.c0 F;
    public final org.telegram.ui.ActionBar.r0 G;
    public final org.telegram.ui.ActionBar.r0 H;
    public final jg.q0 I;
    public AnimatorSet J;
    public final wz K;
    public boolean L;
    public final fi.v4 M;
    public float N;
    public boolean O;
    public File P;
    public boolean Q;
    public ak R;
    public final HashMap S;
    public final ArrayList T;
    public final HashMap U;
    public boolean V;
    public int W;
    public boolean f36773a0;
    public final boolean f36774b0;
    public boolean f36775c0;
    public boolean f36776d0;
    public boolean f36777e0;
    public final androidx.mediarouter.app.f f36778f0;
    public ValueAnimator f36779g0;
    public int f36780n;
    public final yj f36781r;
    public final yj f36782s;
    public final ck f36783w;
    public final ck f36784x;
    public final wy f36785y;

    public kk(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, si siVar) {
        super(context, i6Var, siVar);
        boolean z10;
        boolean z11;
        int i10;
        Cursor cursor;
        String str;
        this.Q = false;
        this.S = new HashMap();
        this.T = new ArrayList();
        this.U = new HashMap();
        this.W = -1;
        this.f36778f0 = new androidx.mediarouter.app.f(this, 8);
        ck ckVar = new ck(this, context);
        this.f36783w = ckVar;
        if (i7 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36774b0 = z10;
        int i11 = 2;
        if (i7 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f36777e0 = z11;
        this.f36776d0 = org.telegram.messenger.bz.M0;
        try {
            if (z11) {
                try {
                    Cursor query = org.telegram.messenger.t0.f26913b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j3 = query.getLong(i11);
                            long j10 = query.getLong(3);
                            String string = query.getString(4);
                            cursor = query;
                            if (j3 <= org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).f25713n4 * 1000) {
                                try {
                                    if (j10 <= org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).o4 && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        dk dkVar = new dk();
                                        dkVar.f34453b = file.getName();
                                        dkVar.f34456f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        dkVar.d = str;
                                        dkVar.f34454c = org.telegram.messenger.g0.i0(file.length(), false, false);
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            dkVar.f34455e = file.getAbsolutePath();
                                        }
                                        ((ArrayList) this.f36783w.h).add(dkVar);
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
                            i11 = 2;
                        } catch (Throwable th4) {
                            th = th4;
                            cursor = query;
                        }
                    }
                    query.close();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else {
                Q(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort((ArrayList) ckVar.h, new wj(this, 1));
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        this.f36775c0 = false;
        if (!this.Q) {
            this.Q = true;
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
                org.telegram.messenger.t0.f26913b.registerReceiver(this.f36778f0, intentFilter, 4);
            } else {
                org.telegram.messenger.t0.f26913b.registerReceiver(this.f36778f0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.z t6 = this.f36766b.V2.t();
        org.telegram.ui.ActionBar.r0 a10 = t6.a(0, 2131232488);
        a10.O();
        a10.I = new bi.s1(this, 7);
        this.G = a10;
        a10.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745641, null));
        a10.setContentDescription(org.telegram.messenger.gd.M0(2131745641, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i12 = org.telegram.ui.ActionBar.n6.f29502j5;
        org.telegram.ui.ActionBar.u6.U(searchField, i12, i6Var);
        org.telegram.ui.ActionBar.u6.v(searchField, i12, i6Var);
        org.telegram.ui.ActionBar.u6.D(searchField, org.telegram.ui.ActionBar.n6.Me, i6Var);
        if (this.f36776d0) {
            i10 = 2131232104;
        } else {
            i10 = 2131232103;
        }
        org.telegram.ui.ActionBar.r0 a11 = t6.a(6, i10);
        this.H = a11;
        a11.setContentDescription(org.telegram.messenger.gd.M0(2131754891, null));
        wz wzVar = new wz(context, i6Var);
        this.K = wzVar;
        addView(wzVar);
        fi.v4 v4Var = new fi.v4(this, context, wzVar, i6Var);
        this.M = v4Var;
        addView(v4Var, c8.ma.c(-1.0f, -1));
        v4Var.setVisibility(8);
        v4Var.setOnTouchListener(new gi.a(15));
        yj yjVar = new yj(this, context, i6Var, 0);
        this.f36782s = yjVar;
        yjVar.setSectionsType(2);
        yjVar.setVerticalScrollBarEnabled(false);
        wy wyVar = new wy(org.telegram.messenger.g0.L(56.0f), 0, yjVar);
        this.f36785y = wyVar;
        yjVar.setLayoutManager(wyVar);
        yjVar.setClipToPadding(false);
        ck ckVar2 = new ck(this, context);
        this.f36784x = ckVar2;
        yjVar.setAdapter(ckVar2);
        addView(yjVar, c8.ma.c(-1.0f, -1));
        yjVar.setVisibility(8);
        yj yjVar2 = new yj(this, context, i6Var, 1);
        this.f36781r = yjVar2;
        yjVar2.r1();
        setBlur3Capture(yjVar2);
        this.d = yjVar2;
        this.h = true;
        this.f36769f = true;
        yjVar2.setSectionsType(2);
        yjVar2.setVerticalScrollBarEnabled(false);
        kg.c0 c0Var = new kg.c0(this, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f24112m, yjVar2, 2);
        this.F = c0Var;
        yjVar2.setLayoutManager(c0Var);
        yjVar2.setClipToPadding(false);
        yjVar2.setAdapter(this.f36783w);
        addView(yjVar2, c8.ma.c(-1.0f, -1));
        this.E = new jk(this, context);
        yjVar2.setOnScrollListener(new oa(this, 4));
        yjVar2.setOnItemClickListener(new oj0(this) {
            public final kk f40367b;

            {
                this.f40367b = this;
            }

            @Override
            public final void c(int i13, View view) {
                jg.o0 o0Var;
                switch (r2) {
                    case 0:
                        kk.P(this.f40367b, view, i13);
                        return;
                    default:
                        kk kkVar = this.f40367b;
                        jg.q0 q0Var = kkVar.I;
                        q0Var.I0(true);
                        jk jkVar = kkVar.E;
                        ArrayList arrayList = q0Var.f17627f3;
                        if (arrayList.isEmpty()) {
                            o0Var = jg.q0.f17620k3[i13];
                        } else {
                            o0Var = (jg.o0) arrayList.get(i13);
                        }
                        si siVar2 = jkVar.Y.f36766b;
                        ArrayList arrayList2 = jkVar.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (o0Var.b((jg.o0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        siVar2.V2.setSearchFilter(o0Var);
                        siVar2.V2.setSearchFieldText("");
                        jkVar.a0(null, null, true);
                        return;
                }
            }
        });
        yjVar2.setOnItemLongClickListener(new b0(this, 19));
        jg.q0 q0Var = new jg.q0(context, i6Var);
        this.I = q0Var;
        q0Var.setOnItemClickListener(new oj0(this) {
            public final kk f40367b;

            {
                this.f40367b = this;
            }

            @Override
            public final void c(int i13, View view) {
                jg.o0 o0Var;
                switch (r2) {
                    case 0:
                        kk.P(this.f40367b, view, i13);
                        return;
                    default:
                        kk kkVar = this.f40367b;
                        jg.q0 q0Var2 = kkVar.I;
                        q0Var2.I0(true);
                        jk jkVar = kkVar.E;
                        ArrayList arrayList = q0Var2.f17627f3;
                        if (arrayList.isEmpty()) {
                            o0Var = jg.q0.f17620k3[i13];
                        } else {
                            o0Var = (jg.o0) arrayList.get(i13);
                        }
                        si siVar2 = jkVar.Y.f36766b;
                        ArrayList arrayList2 = jkVar.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (o0Var.b((jg.o0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        siVar2.V2.setSearchFilter(o0Var);
                        siVar2.V2.setSearchFieldText("");
                        jkVar.a0(null, null, true);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29467h5, q0Var, i6Var);
        addView(q0Var, c8.ma.e(-1, 44, 48));
        q0Var.setTranslationY(-org.telegram.messenger.g0.L(44.0f));
        q0Var.setVisibility(4);
        T();
        a0();
        Y();
    }

    public static void P(kk kkVar, View view, int i7) {
        Object O;
        boolean z10;
        boolean z11;
        int i10;
        si siVar = kkVar.f36766b;
        yj yjVar = kkVar.f36781r;
        v4.i0 adapter = yjVar.getAdapter();
        ck ckVar = kkVar.f36783w;
        if (adapter == ckVar) {
            O = ckVar.E(i7);
        } else {
            jk jkVar = kkVar.E;
            O = jkVar.O(jkVar.S(i7), jkVar.Q(i7));
        }
        if (O instanceof dk) {
            dk dkVar = (dk) O;
            File file = dkVar.f34456f;
            if (Build.VERSION.SDK_INT >= 30) {
                z10 = Environment.isExternalStorageManager();
            } else {
                z10 = false;
            }
            org.telegram.ui.bn bnVar = null;
            if (!org.telegram.messenger.s2.f26722b && (((i10 = dkVar.f34452a) == 2131231074 || i10 == 2131231072) && !z10)) {
                fi fiVar = siVar.f39705p3;
                int i11 = siVar.H3;
                if (siVar.F3 != null && siVar.F1 - siVar.G1 < 0) {
                    if (!org.telegram.messenger.mp.u1(i11).K3() && org.telegram.messenger.mp.u1(i11).X4 > siVar.G1) {
                        new lc(fiVar, siVar.J0).f(org.telegram.messenger.mp.u1(i11).X4, new eh(siVar, 3)).j();
                        return;
                    } else {
                        new lc(fiVar, siVar.J0).t(org.telegram.messenger.gd.M0(2131743806, null), siVar.J0).j();
                        return;
                    }
                }
                kkVar.R.A();
                return;
            } else if (file == null) {
                int i12 = dkVar.f34452a;
                if (i12 == 2131231071) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
                    if (h2Var instanceof org.telegram.ui.bn) {
                        bnVar = (org.telegram.ui.bn) h2Var;
                    }
                    org.telegram.ui.bn bnVar2 = bnVar;
                    org.telegram.messenger.ue ueVar = MediaController.f22686a2;
                    if (bnVar2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.cn0 cn0Var = new org.telegram.ui.cn0(0, ueVar, hashMap, arrayList, 0, z11, bnVar2, false);
                    cn0Var.m0 = true;
                    cn0Var.f46563t0 = new h6.m(kkVar, hashMap, arrayList, 26);
                    cn0Var.k0(kkVar.W, false);
                    org.telegram.ui.ActionBar.h2 h2Var2 = siVar.f39659a2;
                    if (h2Var2 != null) {
                        h2Var2.presentFragment(cn0Var);
                    } else {
                        org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            Q.presentFragment(cn0Var);
                        }
                    }
                    siVar.a(true);
                    return;
                } else if (i12 == 2131231073) {
                    ak akVar = kkVar.R;
                    if (akVar != null) {
                        akVar.T();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = kkVar.getTopForScroll();
                    kkVar.V();
                    bk bkVar = (bk) p5.c.g(1, ckVar.f34041f);
                    siVar.V2.setTitle(bkVar.f33708b);
                    File file2 = bkVar.f33707a;
                    if (file2 != null) {
                        kkVar.S(file2);
                    } else {
                        kkVar.T();
                    }
                    kkVar.a0();
                    kkVar.F.h1(0, topForScroll);
                    kkVar.W(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = yjVar.getChildAt(0);
                v4.f1 G = yjVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f33707a = kkVar.P;
                    obj.f33708b = siVar.V2.getTitle();
                    kkVar.V();
                    ckVar.f34041f.add(obj);
                    if (!kkVar.S(file)) {
                        ckVar.f34041f.remove((Object) obj);
                        return;
                    }
                    kkVar.W(1);
                    siVar.V2.setTitle(dkVar.f34453b);
                    return;
                }
                return;
            } else {
                kkVar.U(view, dkVar);
                return;
            }
        }
        kkVar.U(view, O);
    }

    private int getTopForScroll() {
        yj yjVar = this.f36781r;
        View childAt = yjVar.getChildAt(0);
        v4.f1 G = yjVar.G(childAt);
        int i7 = -yjVar.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i7;
        }
        return i7;
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kk.B(int, int):void");
    }

    @Override
    public final void C() {
        ck ckVar = this.f36783w;
        if (ckVar != null) {
            ckVar.f();
        }
        jk jkVar = this.E;
        if (jkVar != null) {
            jkVar.f();
        }
    }

    @Override
    public final void I(ki kiVar) {
        this.S.clear();
        this.U.clear();
        this.E.S.clear();
        this.T.clear();
        this.f36783w.f34041f.clear();
        T();
        a0();
        Y();
        this.f36766b.V2.setTitle(org.telegram.messenger.gd.M0(2131745462, null));
        this.H.setVisibility(0);
        this.F.h1(0, 0);
    }

    @Override
    public final void K() {
        this.f36781r.y0(0);
    }

    @Override
    public final boolean M(final boolean z10, final int i7, int i10, final long j3, final boolean z11) {
        int size = this.S.size();
        HashMap hashMap = this.U;
        if ((size == 0 && hashMap.size() == 0) || this.R == null || this.L) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (org.telegram.ui.vz vzVar : hashMap.keySet()) {
            arrayList.add((org.telegram.messenger.fj) hashMap.get(vzVar));
        }
        final ArrayList arrayList2 = new ArrayList(this.T);
        si siVar = this.f36766b;
        CharSequence[] charSequenceArr = {siVar.b1().getText()};
        final ArrayList Y = org.telegram.messenger.ri.d0(siVar.H3).Y(charSequenceArr, true, true);
        final String charSequence = charSequenceArr[0].toString();
        return b5.Y(siVar.H3, siVar.c1(), siVar.Y0() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new org.telegram.messenger.x10() {
            @Override
            public final void a(Object obj) {
                kk kkVar = kk.this;
                kkVar.L = true;
                kkVar.R.n(arrayList2, charSequence, Y, arrayList, z10, i7, j3, z11, ((Long) obj).longValue());
                kkVar.f36766b.a(true);
            }
        }, 0L);
    }

    public final void Q(File file) {
        String str;
        File[] listFiles = file.listFiles();
        File j3 = org.telegram.messenger.w7.j(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    Q(file2);
                } else if (!file2.equals(j3)) {
                    dk dkVar = new dk();
                    dkVar.f34453b = file2.getName();
                    dkVar.f34456f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    dkVar.d = str;
                    dkVar.f34454c = org.telegram.messenger.g0.i0(file2.length(), false, false);
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        dkVar.f34455e = file2.getAbsolutePath();
                    }
                    ((ArrayList) this.f36783w.h).add(dkVar);
                }
            }
        }
    }

    public final boolean R(File file) {
        String str;
        int i7;
        String D = org.telegram.messenger.w7.D(file);
        if (D != null) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(D);
        } else {
            str = null;
        }
        if (file.length() != 0 && str != null && yf.c.f61189i.contains(str)) {
            if (file.length() > org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).o4) {
                new lc(this.f36766b.f30193c, null).u(org.telegram.messenger.gd.a0("TooLargeError", null, 2131743807, new Object[0]), org.telegram.messenger.gd.a0("ErrorRingtoneSizeTooBig", null, 2131751091, Integer.valueOf(org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).o4 / 1024)), null).j();
                return false;
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(org.telegram.messenger.t0.f26913b, Uri.fromFile(file));
                i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                i7 = Integer.MAX_VALUE;
            }
            if (i7 <= org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).f25713n4 * 1000) {
                return true;
            }
            new lc(this.f36766b.f30193c, null).u(org.telegram.messenger.gd.a0("TooLongError", null, 2131743806, new Object[0]), org.telegram.messenger.gd.a0("ErrorRingtoneDurationTooLong", null, 2131751093, Integer.valueOf(org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).f25713n4)), null).j();
            return false;
        }
        new lc(this.f36766b.f30193c, null).u(org.telegram.messenger.gd.a0("InvalidFormatError", null, 2131748989, new Object[0]), org.telegram.messenger.gd.M0(2131751092, null), null).j();
        return false;
    }

    public final boolean S(File file) {
        File file2;
        String str;
        ck ckVar;
        this.O = false;
        boolean canRead = file.canRead();
        yj yjVar = this.f36781r;
        String str2 = null;
        ck ckVar2 = this.f36783w;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.P = file;
                ckVar2.f34040e.clear();
                Environment.getExternalStorageState();
                org.telegram.messenger.g0.y(yjVar);
                this.V = true;
                ckVar2.f();
                return true;
            }
            X(org.telegram.messenger.gd.M0(2131754711, null));
            return false;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                X(org.telegram.messenger.gd.M0(2131743642, null));
                return false;
            }
            this.P = file;
            ArrayList arrayList = ckVar2.f34040e;
            ArrayList arrayList2 = ckVar2.f34041f;
            ArrayList arrayList3 = ckVar2.f34040e;
            arrayList.clear();
            File j3 = org.telegram.messenger.w7.j(6);
            int i7 = 0;
            while (i7 < listFiles.length) {
                File file3 = listFiles[i7];
                if (file3.getName().indexOf(46) == 0 || file3.equals(j3)) {
                    ckVar = ckVar2;
                } else {
                    dk dkVar = new dk();
                    dkVar.f34453b = file3.getName();
                    dkVar.f34456f = file3;
                    if (file3.isDirectory()) {
                        dkVar.f34452a = 2131231070;
                        dkVar.f34454c = org.telegram.messenger.gd.M0(2131750669, str2);
                        ckVar = ckVar2;
                    } else {
                        this.O = true;
                        String name = file3.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        dkVar.d = str;
                        ckVar = ckVar2;
                        dkVar.f34454c = org.telegram.messenger.g0.i0(file3.length(), false, false);
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            dkVar.f34455e = file3.getAbsolutePath();
                        }
                    }
                    arrayList3.add(dkVar);
                }
                i7++;
                ckVar2 = ckVar;
                str2 = null;
            }
            ck ckVar3 = ckVar2;
            dk dkVar2 = new dk();
            dkVar2.f34453b = "..";
            if (arrayList2.size() > 0) {
                File file4 = ((bk) i5.c.h(1, arrayList2)).f33707a;
                if (file4 == null) {
                    file2 = null;
                    dkVar2.f34454c = org.telegram.messenger.gd.M0(2131750669, null);
                } else {
                    file2 = null;
                    dkVar2.f34454c = file4.toString();
                }
            } else {
                file2 = null;
                dkVar2.f34454c = org.telegram.messenger.gd.M0(2131750669, null);
            }
            dkVar2.f34452a = 2131231070;
            dkVar2.f34456f = file2;
            arrayList3.add(0, dkVar2);
            if (this.P != null) {
                Collections.sort(ckVar3.f34040e, new wj(this, 0));
            }
            a0();
            org.telegram.messenger.g0.y(yjVar);
            this.V = true;
            int topForScroll = getTopForScroll();
            ckVar3.f();
            this.F.h1(0, topForScroll);
            return true;
        } catch (Exception e10) {
            X(e10.getLocalizedMessage());
            return false;
        }
    }

    public final void T() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kk.T():void");
    }

    public final boolean U(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kk.U(android.view.View, java.lang.Object):boolean");
    }

    public final void V() {
        View m10;
        ck ckVar = this.f36784x;
        ckVar.f34041f.clear();
        ArrayList arrayList = ckVar.f34041f;
        ck ckVar2 = this.f36783w;
        arrayList.addAll(ckVar2.f34041f);
        ArrayList arrayList2 = ckVar.f34040e;
        arrayList2.clear();
        arrayList2.addAll(ckVar2.f34040e);
        ArrayList arrayList3 = (ArrayList) ckVar.h;
        arrayList3.clear();
        arrayList3.addAll((ArrayList) ckVar2.h);
        ckVar.f();
        yj yjVar = this.f36782s;
        yjVar.setVisibility(0);
        yj yjVar2 = this.f36781r;
        yjVar.setPadding(yjVar2.getPaddingLeft(), yjVar2.getPaddingTop(), yjVar2.getPaddingRight(), yjVar2.getPaddingBottom());
        kg.c0 c0Var = this.F;
        int L0 = c0Var.L0();
        if (L0 >= 0 && (m10 = c0Var.m(L0)) != null) {
            this.f36785y.h1(L0, m10.getTop() - yjVar.getPaddingTop());
        }
    }

    public final void W(int i7) {
        yj yjVar;
        float L;
        ValueAnimator valueAnimator = this.f36779g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f36780n = i7;
        int i10 = 0;
        while (true) {
            int childCount = getChildCount();
            yjVar = this.f36781r;
            if (i10 < childCount) {
                if (getChildAt(i10) == yjVar) {
                    break;
                }
                i10++;
            } else {
                i10 = 0;
                break;
            }
        }
        yj yjVar2 = this.f36782s;
        if (i7 == 1) {
            L = org.telegram.messenger.g0.L(150.0f);
            yjVar2.setAlpha(1.0f);
            yjVar2.setScaleX(1.0f);
            yjVar2.setScaleY(1.0f);
            yjVar2.setTranslationX(0.0f);
            removeView(yjVar2);
            addView(yjVar2, i10);
            yjVar2.setVisibility(0);
            yjVar.setTranslationX(L);
            yjVar.setAlpha(0.0f);
            this.f36779g0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            L = org.telegram.messenger.g0.L(150.0f);
            yjVar.setAlpha(0.0f);
            yjVar.setScaleX(0.95f);
            yjVar.setScaleY(0.95f);
            yjVar2.setScaleX(1.0f);
            yjVar2.setScaleY(1.0f);
            yjVar2.setTranslationX(0.0f);
            yjVar2.setAlpha(1.0f);
            removeView(yjVar2);
            addView(yjVar2, i10 + 1);
            yjVar2.setVisibility(0);
            this.f36779g0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f36779g0.addUpdateListener(new vj(this, i7, L, 0));
        this.f36779g0.addListener(new x(this, 12));
        if (i7 == 1) {
            this.f36779g0.setDuration(220L);
        } else {
            this.f36779g0.setDuration(200L);
        }
        this.f36779g0.setInterpolator(lr.f37208f);
        this.f36779g0.start();
    }

    public final void X(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f36765a);
        String M0 = org.telegram.messenger.gd.M0(2131689472, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = M0;
        u1Var.U = str;
        org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
    }

    public final void Y() {
        v4.i0 adapter = this.f36781r.getAdapter();
        int i7 = 0;
        boolean z10 = true;
        jk jkVar = this.E;
        if (adapter != jkVar ? this.f36783w.b() != 1 : !jkVar.f36452s.isEmpty() || !jkVar.Q.isEmpty()) {
            z10 = false;
        }
        if (!z10) {
            i7 = 8;
        }
        this.M.setVisibility(i7);
        Z();
    }

    public final void Z() {
        View childAt;
        fi.v4 v4Var = this.M;
        if (v4Var.getVisibility() != 0 || (childAt = this.f36781r.getChildAt(0)) == null) {
            return;
        }
        float translationY = v4Var.getTranslationY();
        this.N = (childAt.getTop() + (v4Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        v4Var.setTranslationY(translationY);
    }

    public final void a0() {
        int i7;
        org.telegram.ui.ActionBar.r0 r0Var = this.G;
        if (r0Var != null && !r0Var.w()) {
            if (!this.O && !this.f36783w.f34041f.isEmpty()) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            r0Var.setVisibility(i7);
        }
    }

    @Override
    public final void d() {
        org.telegram.ui.ActionBar.r0 r0Var = this.G;
        if (r0Var != null) {
            try {
                if (r0Var.getSearchField() != null) {
                    r0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29502j5, this.f36765a));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        yj yjVar = this.f36781r;
        if (yjVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i7 = 0;
        View childAt = yjVar.getChildAt(0);
        kj0 kj0Var = (kj0) yjVar.G(childAt);
        int y10 = ((((int) childAt.getY()) - org.telegram.messenger.g0.f24112m) - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(8.0f);
        if (y10 > 0 && kj0Var != null && kj0Var.b() == 0) {
            i7 = y10;
        }
        if (y10 < 0 || kj0Var == null || kj0Var.b() != 0) {
            y10 = i7;
        }
        return org.telegram.messenger.g0.L(13.0f) + y10;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(5.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f36781r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.U.size() + this.S.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.w6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.w6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.G.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29502j5));
        int i7 = org.telegram.ui.ActionBar.n6.A5;
        yj yjVar = this.f36781r;
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, 32, new Class[]{org.telegram.ui.Cells.z6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29358b7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, 48, new Class[]{org.telegram.ui.Cells.z6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29337a7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29486i6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.n6.f29517k0, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29395d7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29524k7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.qj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, 40, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(yjVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.sj));
        return arrayList;
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final boolean k() {
        ck ckVar = this.f36783w;
        if (ckVar.f34041f.size() <= 0) {
            return false;
        }
        V();
        bk bkVar = (bk) p5.c.g(1, ckVar.f34041f);
        this.f36766b.V2.setTitle(bkVar.f33708b);
        int topForScroll = getTopForScroll();
        File file = bkVar.f33707a;
        if (file != null) {
            S(file);
        } else {
            T();
        }
        a0();
        this.F.h1(0, topForScroll);
        W(2);
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        Z();
    }

    @Override
    public final void p() {
        try {
            if (this.Q) {
                org.telegram.messenger.t0.f26913b.unregisterReceiver(this.f36778f0);
                this.Q = false;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.f36766b.V2.o(true);
        org.telegram.ui.ActionBar.z t6 = this.f36766b.V2.t();
        t6.removeView(this.H);
        t6.removeView(this.G);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.f36773a0 = z10;
    }

    public void setDelegate(ak akVar) {
        this.R = akVar;
    }

    public void setMaxSelectedFiles(int i7) {
        this.W = i7;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f36766b.f30190b.invalidate();
    }

    @Override
    public final void u() {
        this.H.setVisibility(8);
        this.G.setVisibility(8);
    }

    @Override
    public final void w(int i7) {
        int i10;
        if (i7 == 6) {
            org.telegram.messenger.bz.M0 = !org.telegram.messenger.bz.M0;
            SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
            edit.putBoolean("sortFilesByName", org.telegram.messenger.bz.M0);
            edit.apply();
            this.f36776d0 = org.telegram.messenger.bz.M0;
            ck ckVar = this.f36783w;
            Collections.sort((ArrayList) ckVar.h, new wj(this, 1));
            if (this.P != null) {
                Collections.sort(ckVar.f34040e, new wj(this, 0));
            }
            ckVar.f();
            if (this.f36776d0) {
                i10 = 2131232104;
            } else {
                i10 = 2131232103;
            }
            this.H.setIcon(i10);
        }
    }
}
