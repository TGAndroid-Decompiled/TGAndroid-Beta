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
public final class mk extends mi {
    public static final int f37483h0 = 0;
    public final lk E;
    public final kg.d0 F;
    public final org.telegram.ui.ActionBar.q0 G;
    public final org.telegram.ui.ActionBar.q0 H;
    public final jg.q0 I;
    public AnimatorSet J;
    public final yz K;
    public boolean L;
    public final fi.v4 M;
    public float N;
    public boolean O;
    public File P;
    public boolean Q;
    public ck R;
    public final HashMap S;
    public final ArrayList T;
    public final HashMap U;
    public boolean V;
    public int W;
    public boolean f37484a0;
    public final boolean f37485b0;
    public boolean f37486c0;
    public boolean f37487d0;
    public boolean f37488e0;
    public final androidx.mediarouter.app.f f37489f0;
    public ValueAnimator f37490g0;
    public int f37491n;
    public final ak f37492r;
    public final ak f37493s;
    public final ek f37494w;
    public final ek f37495x;
    public final yy f37496y;

    public mk(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, ui uiVar) {
        super(context, h6Var, uiVar);
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
        this.f37489f0 = new androidx.mediarouter.app.f(this, 8);
        ek ekVar = new ek(this, context);
        this.f37494w = ekVar;
        if (i7 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37485b0 = z10;
        int i11 = 2;
        if (i7 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f37488e0 = z11;
        this.f37487d0 = org.telegram.messenger.cz.M0;
        try {
            if (z11) {
                try {
                    Cursor query = org.telegram.messenger.t0.f26895b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j3 = query.getLong(i11);
                            long j10 = query.getLong(3);
                            String string = query.getString(4);
                            cursor = query;
                            if (j3 <= org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24932t0).f25876n4 * 1000) {
                                try {
                                    if (j10 <= org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24932t0).o4 && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        fk fkVar = new fk();
                                        fkVar.f35226b = file.getName();
                                        fkVar.f35229f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        fkVar.d = str;
                                        fkVar.f35227c = org.telegram.messenger.g0.i0(file.length(), false, false);
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            fkVar.f35228e = file.getAbsolutePath();
                                        }
                                        ((ArrayList) this.f37494w.h).add(fkVar);
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
                Collections.sort((ArrayList) ekVar.h, new yj(this, 1));
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        this.f37486c0 = false;
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
                org.telegram.messenger.t0.f26895b.registerReceiver(this.f37489f0, intentFilter, 4);
            } else {
                org.telegram.messenger.t0.f26895b.registerReceiver(this.f37489f0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.y s5 = this.f37477b.V2.s();
        org.telegram.ui.ActionBar.q0 a10 = s5.a(0, 2131232488);
        a10.O();
        a10.I = new bi.x1(this, 7);
        this.G = a10;
        a10.setSearchFieldHint(org.telegram.messenger.hd.N0(2131745640, null));
        a10.setContentDescription(org.telegram.messenger.hd.N0(2131745640, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i12 = org.telegram.ui.ActionBar.m6.f29455j5;
        org.telegram.ui.ActionBar.t6.U(searchField, i12, h6Var);
        org.telegram.ui.ActionBar.t6.v(searchField, i12, h6Var);
        org.telegram.ui.ActionBar.t6.D(searchField, org.telegram.ui.ActionBar.m6.Me, h6Var);
        if (this.f37487d0) {
            i10 = 2131232104;
        } else {
            i10 = 2131232103;
        }
        org.telegram.ui.ActionBar.q0 a11 = s5.a(6, i10);
        this.H = a11;
        a11.setContentDescription(org.telegram.messenger.hd.N0(2131754891, null));
        yz yzVar = new yz(context, h6Var);
        this.K = yzVar;
        addView(yzVar);
        fi.v4 v4Var = new fi.v4(this, context, yzVar, h6Var);
        this.M = v4Var;
        addView(v4Var, c8.na.c(-1.0f, -1));
        v4Var.setVisibility(8);
        v4Var.setOnTouchListener(new gi.a(15));
        ak akVar = new ak(this, context, h6Var, 0);
        this.f37493s = akVar;
        akVar.setSectionsType(2);
        akVar.setVerticalScrollBarEnabled(false);
        yy yyVar = new yy(org.telegram.messenger.g0.L(56.0f), 0, akVar);
        this.f37496y = yyVar;
        akVar.setLayoutManager(yyVar);
        akVar.setClipToPadding(false);
        ek ekVar2 = new ek(this, context);
        this.f37495x = ekVar2;
        akVar.setAdapter(ekVar2);
        addView(akVar, c8.na.c(-1.0f, -1));
        akVar.setVisibility(8);
        ak akVar2 = new ak(this, context, h6Var, 1);
        this.f37492r = akVar2;
        akVar2.r1();
        setBlur3Capture(akVar2);
        this.d = akVar2;
        this.h = true;
        this.f37480f = true;
        akVar2.setSectionsType(2);
        akVar2.setVerticalScrollBarEnabled(false);
        kg.d0 d0Var = new kg.d0(this, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f24004m, akVar2, 2);
        this.F = d0Var;
        akVar2.setLayoutManager(d0Var);
        akVar2.setClipToPadding(false);
        akVar2.setAdapter(this.f37494w);
        addView(akVar2, c8.na.c(-1.0f, -1));
        this.E = new lk(this, context);
        akVar2.setOnScrollListener(new oa(this, 4));
        akVar2.setOnItemClickListener(new qj0(this) {
            public final mk f41808b;

            {
                this.f41808b = this;
            }

            @Override
            public final void c(int i13, View view) {
                jg.o0 o0Var;
                switch (r2) {
                    case 0:
                        mk.P(this.f41808b, view, i13);
                        return;
                    default:
                        mk mkVar = this.f41808b;
                        jg.q0 q0Var = mkVar.I;
                        q0Var.I0(true);
                        lk lkVar = mkVar.E;
                        ArrayList arrayList = q0Var.f17621f3;
                        if (arrayList.isEmpty()) {
                            o0Var = jg.q0.f17614k3[i13];
                        } else {
                            o0Var = (jg.o0) arrayList.get(i13);
                        }
                        ui uiVar2 = lkVar.Y.f37477b;
                        ArrayList arrayList2 = lkVar.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (o0Var.b((jg.o0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        uiVar2.V2.setSearchFilter(o0Var);
                        uiVar2.V2.setSearchFieldText("");
                        lkVar.a0(null, null, true);
                        return;
                }
            }
        });
        akVar2.setOnItemLongClickListener(new c0(this, 19));
        jg.q0 q0Var = new jg.q0(context, h6Var);
        this.I = q0Var;
        q0Var.setOnItemClickListener(new qj0(this) {
            public final mk f41808b;

            {
                this.f41808b = this;
            }

            @Override
            public final void c(int i13, View view) {
                jg.o0 o0Var;
                switch (r2) {
                    case 0:
                        mk.P(this.f41808b, view, i13);
                        return;
                    default:
                        mk mkVar = this.f41808b;
                        jg.q0 q0Var2 = mkVar.I;
                        q0Var2.I0(true);
                        lk lkVar = mkVar.E;
                        ArrayList arrayList = q0Var2.f17621f3;
                        if (arrayList.isEmpty()) {
                            o0Var = jg.q0.f17614k3[i13];
                        } else {
                            o0Var = (jg.o0) arrayList.get(i13);
                        }
                        ui uiVar2 = lkVar.Y.f37477b;
                        ArrayList arrayList2 = lkVar.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (o0Var.b((jg.o0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        uiVar2.V2.setSearchFilter(o0Var);
                        uiVar2.V2.setSearchFieldText("");
                        lkVar.a0(null, null, true);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29420h5, q0Var, h6Var);
        addView(q0Var, c8.na.e(-1, 44, 48));
        q0Var.setTranslationY(-org.telegram.messenger.g0.L(44.0f));
        q0Var.setVisibility(4);
        T();
        a0();
        Y();
    }

    public static void P(mk mkVar, View view, int i7) {
        Object O;
        boolean z10;
        boolean z11;
        int i10;
        ui uiVar = mkVar.f37477b;
        ak akVar = mkVar.f37492r;
        v4.h0 adapter = akVar.getAdapter();
        ek ekVar = mkVar.f37494w;
        if (adapter == ekVar) {
            O = ekVar.E(i7);
        } else {
            lk lkVar = mkVar.E;
            O = lkVar.O(lkVar.S(i7), lkVar.Q(i7));
        }
        if (O instanceof fk) {
            fk fkVar = (fk) O;
            File file = fkVar.f35229f;
            if (Build.VERSION.SDK_INT >= 30) {
                z10 = Environment.isExternalStorageManager();
            } else {
                z10 = false;
            }
            org.telegram.ui.bn bnVar = null;
            if (!org.telegram.messenger.s2.f26695b && (((i10 = fkVar.f35225a) == 2131231074 || i10 == 2131231072) && !z10)) {
                hi hiVar = uiVar.f40398p3;
                int i11 = uiVar.H3;
                if (uiVar.F3 != null && uiVar.F1 - uiVar.G1 < 0) {
                    if (!org.telegram.messenger.np.u1(i11).K3() && org.telegram.messenger.np.u1(i11).X4 > uiVar.G1) {
                        new lc(hiVar, uiVar.J0).f(org.telegram.messenger.np.u1(i11).X4, new gh(uiVar, 3)).j();
                        return;
                    } else {
                        new lc(hiVar, uiVar.J0).t(org.telegram.messenger.hd.N0(2131743800, null), uiVar.J0).j();
                        return;
                    }
                }
                mkVar.R.A();
                return;
            } else if (file == null) {
                int i12 = fkVar.f35225a;
                if (i12 == 2131231071) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40352a2;
                    if (g2Var instanceof org.telegram.ui.bn) {
                        bnVar = (org.telegram.ui.bn) g2Var;
                    }
                    org.telegram.ui.bn bnVar2 = bnVar;
                    org.telegram.messenger.ve veVar = MediaController.f22681a2;
                    if (bnVar2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.cn0 cn0Var = new org.telegram.ui.cn0(0, veVar, hashMap, arrayList, 0, z11, bnVar2, false);
                    cn0Var.m0 = true;
                    cn0Var.f46605t0 = new h6.m(mkVar, hashMap, arrayList, 26);
                    cn0Var.k0(mkVar.W, false);
                    org.telegram.ui.ActionBar.g2 g2Var2 = uiVar.f40352a2;
                    if (g2Var2 != null) {
                        g2Var2.presentFragment(cn0Var);
                    } else {
                        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            Q.presentFragment(cn0Var);
                        }
                    }
                    uiVar.a(true);
                    return;
                } else if (i12 == 2131231073) {
                    ck ckVar = mkVar.R;
                    if (ckVar != null) {
                        ckVar.T();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = mkVar.getTopForScroll();
                    mkVar.V();
                    dk dkVar = (dk) p5.c.g(1, ekVar.f34826f);
                    uiVar.V2.setTitle(dkVar.f34480b);
                    File file2 = dkVar.f34479a;
                    if (file2 != null) {
                        mkVar.S(file2);
                    } else {
                        mkVar.T();
                    }
                    mkVar.a0();
                    mkVar.F.h1(0, topForScroll);
                    mkVar.W(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = akVar.getChildAt(0);
                v4.e1 G = akVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f34479a = mkVar.P;
                    obj.f34480b = uiVar.V2.getTitle();
                    mkVar.V();
                    ekVar.f34826f.add(obj);
                    if (!mkVar.S(file)) {
                        ekVar.f34826f.remove((Object) obj);
                        return;
                    }
                    mkVar.W(1);
                    uiVar.V2.setTitle(fkVar.f35226b);
                    return;
                }
                return;
            } else {
                mkVar.U(view, fkVar);
                return;
            }
        }
        mkVar.U(view, O);
    }

    private int getTopForScroll() {
        ak akVar = this.f37492r;
        View childAt = akVar.getChildAt(0);
        v4.e1 G = akVar.G(childAt);
        int i7 = -akVar.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i7;
        }
        return i7;
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mk.B(int, int):void");
    }

    @Override
    public final void C() {
        ek ekVar = this.f37494w;
        if (ekVar != null) {
            ekVar.f();
        }
        lk lkVar = this.E;
        if (lkVar != null) {
            lkVar.f();
        }
    }

    @Override
    public final void I(mi miVar) {
        this.S.clear();
        this.U.clear();
        this.E.S.clear();
        this.T.clear();
        this.f37494w.f34826f.clear();
        T();
        a0();
        Y();
        this.f37477b.V2.setTitle(org.telegram.messenger.hd.N0(2131745461, null));
        this.H.setVisibility(0);
        this.F.h1(0, 0);
    }

    @Override
    public final void K() {
        this.f37492r.y0(0);
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
            arrayList.add((org.telegram.messenger.gj) hashMap.get(vzVar));
        }
        final ArrayList arrayList2 = new ArrayList(this.T);
        ui uiVar = this.f37477b;
        CharSequence[] charSequenceArr = {uiVar.b1().getText()};
        final ArrayList Y = org.telegram.messenger.si.d0(uiVar.H3).Y(charSequenceArr, true, true);
        final String charSequence = charSequenceArr[0].toString();
        return c5.Y(uiVar.H3, uiVar.c1(), uiVar.Y0() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new org.telegram.messenger.y10() {
            @Override
            public final void a(Object obj) {
                mk mkVar = mk.this;
                mkVar.L = true;
                mkVar.R.n(arrayList2, charSequence, Y, arrayList, z10, i7, j3, z11, ((Long) obj).longValue());
                mkVar.f37477b.a(true);
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
                    fk fkVar = new fk();
                    fkVar.f35226b = file2.getName();
                    fkVar.f35229f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    fkVar.d = str;
                    fkVar.f35227c = org.telegram.messenger.g0.i0(file2.length(), false, false);
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        fkVar.f35228e = file2.getAbsolutePath();
                    }
                    ((ArrayList) this.f37494w.h).add(fkVar);
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
        if (file.length() != 0 && str != null && yf.c.f61199i.contains(str)) {
            if (file.length() > org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24932t0).o4) {
                new lc(this.f37477b.f30145c, null).u(org.telegram.messenger.hd.a0("TooLargeError", null, 2131743801, new Object[0]), org.telegram.messenger.hd.a0("ErrorRingtoneSizeTooBig", null, 2131751090, Integer.valueOf(org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24932t0).o4 / 1024)), null).j();
                return false;
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(org.telegram.messenger.t0.f26895b, Uri.fromFile(file));
                i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                i7 = Integer.MAX_VALUE;
            }
            if (i7 <= org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24932t0).f25876n4 * 1000) {
                return true;
            }
            new lc(this.f37477b.f30145c, null).u(org.telegram.messenger.hd.a0("TooLongError", null, 2131743800, new Object[0]), org.telegram.messenger.hd.a0("ErrorRingtoneDurationTooLong", null, 2131751092, Integer.valueOf(org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24932t0).f25876n4)), null).j();
            return false;
        }
        new lc(this.f37477b.f30145c, null).u(org.telegram.messenger.hd.a0("InvalidFormatError", null, 2131748988, new Object[0]), org.telegram.messenger.hd.N0(2131751091, null), null).j();
        return false;
    }

    public final boolean S(File file) {
        File file2;
        String str;
        ek ekVar;
        this.O = false;
        boolean canRead = file.canRead();
        ak akVar = this.f37492r;
        String str2 = null;
        ek ekVar2 = this.f37494w;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.P = file;
                ekVar2.f34825e.clear();
                Environment.getExternalStorageState();
                org.telegram.messenger.g0.y(akVar);
                this.V = true;
                ekVar2.f();
                return true;
            }
            X(org.telegram.messenger.hd.N0(2131754710, null));
            return false;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                X(org.telegram.messenger.hd.N0(2131743636, null));
                return false;
            }
            this.P = file;
            ArrayList arrayList = ekVar2.f34825e;
            ArrayList arrayList2 = ekVar2.f34826f;
            ArrayList arrayList3 = ekVar2.f34825e;
            arrayList.clear();
            File j3 = org.telegram.messenger.w7.j(6);
            int i7 = 0;
            while (i7 < listFiles.length) {
                File file3 = listFiles[i7];
                if (file3.getName().indexOf(46) == 0 || file3.equals(j3)) {
                    ekVar = ekVar2;
                } else {
                    fk fkVar = new fk();
                    fkVar.f35226b = file3.getName();
                    fkVar.f35229f = file3;
                    if (file3.isDirectory()) {
                        fkVar.f35225a = 2131231070;
                        fkVar.f35227c = org.telegram.messenger.hd.N0(2131750668, str2);
                        ekVar = ekVar2;
                    } else {
                        this.O = true;
                        String name = file3.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        fkVar.d = str;
                        ekVar = ekVar2;
                        fkVar.f35227c = org.telegram.messenger.g0.i0(file3.length(), false, false);
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            fkVar.f35228e = file3.getAbsolutePath();
                        }
                    }
                    arrayList3.add(fkVar);
                }
                i7++;
                ekVar2 = ekVar;
                str2 = null;
            }
            ek ekVar3 = ekVar2;
            fk fkVar2 = new fk();
            fkVar2.f35226b = "..";
            if (arrayList2.size() > 0) {
                File file4 = ((dk) i5.c.h(1, arrayList2)).f34479a;
                if (file4 == null) {
                    file2 = null;
                    fkVar2.f35227c = org.telegram.messenger.hd.N0(2131750668, null);
                } else {
                    file2 = null;
                    fkVar2.f35227c = file4.toString();
                }
            } else {
                file2 = null;
                fkVar2.f35227c = org.telegram.messenger.hd.N0(2131750668, null);
            }
            fkVar2.f35225a = 2131231070;
            fkVar2.f35229f = file2;
            arrayList3.add(0, fkVar2);
            if (this.P != null) {
                Collections.sort(ekVar3.f34825e, new yj(this, 0));
            }
            a0();
            org.telegram.messenger.g0.y(akVar);
            this.V = true;
            int topForScroll = getTopForScroll();
            ekVar3.f();
            this.F.h1(0, topForScroll);
            return true;
        } catch (Exception e10) {
            X(e10.getLocalizedMessage());
            return false;
        }
    }

    public final void T() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mk.T():void");
    }

    public final boolean U(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mk.U(android.view.View, java.lang.Object):boolean");
    }

    public final void V() {
        View m10;
        ek ekVar = this.f37495x;
        ekVar.f34826f.clear();
        ArrayList arrayList = ekVar.f34826f;
        ek ekVar2 = this.f37494w;
        arrayList.addAll(ekVar2.f34826f);
        ArrayList arrayList2 = ekVar.f34825e;
        arrayList2.clear();
        arrayList2.addAll(ekVar2.f34825e);
        ArrayList arrayList3 = (ArrayList) ekVar.h;
        arrayList3.clear();
        arrayList3.addAll((ArrayList) ekVar2.h);
        ekVar.f();
        ak akVar = this.f37493s;
        akVar.setVisibility(0);
        ak akVar2 = this.f37492r;
        akVar.setPadding(akVar2.getPaddingLeft(), akVar2.getPaddingTop(), akVar2.getPaddingRight(), akVar2.getPaddingBottom());
        kg.d0 d0Var = this.F;
        int L0 = d0Var.L0();
        if (L0 >= 0 && (m10 = d0Var.m(L0)) != null) {
            this.f37496y.h1(L0, m10.getTop() - akVar.getPaddingTop());
        }
    }

    public final void W(int i7) {
        ak akVar;
        float L;
        ValueAnimator valueAnimator = this.f37490g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f37491n = i7;
        int i10 = 0;
        while (true) {
            int childCount = getChildCount();
            akVar = this.f37492r;
            if (i10 < childCount) {
                if (getChildAt(i10) == akVar) {
                    break;
                }
                i10++;
            } else {
                i10 = 0;
                break;
            }
        }
        ak akVar2 = this.f37493s;
        if (i7 == 1) {
            L = org.telegram.messenger.g0.L(150.0f);
            akVar2.setAlpha(1.0f);
            akVar2.setScaleX(1.0f);
            akVar2.setScaleY(1.0f);
            akVar2.setTranslationX(0.0f);
            removeView(akVar2);
            addView(akVar2, i10);
            akVar2.setVisibility(0);
            akVar.setTranslationX(L);
            akVar.setAlpha(0.0f);
            this.f37490g0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            L = org.telegram.messenger.g0.L(150.0f);
            akVar.setAlpha(0.0f);
            akVar.setScaleX(0.95f);
            akVar.setScaleY(0.95f);
            akVar2.setScaleX(1.0f);
            akVar2.setScaleY(1.0f);
            akVar2.setTranslationX(0.0f);
            akVar2.setAlpha(1.0f);
            removeView(akVar2);
            addView(akVar2, i10 + 1);
            akVar2.setVisibility(0);
            this.f37490g0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f37490g0.addUpdateListener(new xj(this, i7, L, 0));
        this.f37490g0.addListener(new y(this, 12));
        if (i7 == 1) {
            this.f37490g0.setDuration(220L);
        } else {
            this.f37490g0.setDuration(200L);
        }
        this.f37490g0.setInterpolator(nr.f37917f);
        this.f37490g0.start();
    }

    public final void X(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f37476a);
        String N0 = org.telegram.messenger.hd.N0(2131689472, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
        t1Var.S = N0;
        t1Var.U = str;
        org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
    }

    public final void Y() {
        v4.h0 adapter = this.f37492r.getAdapter();
        int i7 = 0;
        boolean z10 = true;
        lk lkVar = this.E;
        if (adapter != lkVar ? this.f37494w.b() != 1 : !lkVar.f37159s.isEmpty() || !lkVar.Q.isEmpty()) {
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
        if (v4Var.getVisibility() != 0 || (childAt = this.f37492r.getChildAt(0)) == null) {
            return;
        }
        float translationY = v4Var.getTranslationY();
        this.N = (childAt.getTop() + (v4Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        v4Var.setTranslationY(translationY);
    }

    public final void a0() {
        int i7;
        org.telegram.ui.ActionBar.q0 q0Var = this.G;
        if (q0Var != null && !q0Var.w()) {
            if (!this.O && !this.f37494w.f34826f.isEmpty()) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            q0Var.setVisibility(i7);
        }
    }

    @Override
    public final void d() {
        org.telegram.ui.ActionBar.q0 q0Var = this.G;
        if (q0Var != null) {
            try {
                if (q0Var.getSearchField() != null) {
                    q0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29455j5, this.f37476a));
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
        ak akVar = this.f37492r;
        if (akVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i7 = 0;
        View childAt = akVar.getChildAt(0);
        mj0 mj0Var = (mj0) akVar.G(childAt);
        int y10 = ((((int) childAt.getY()) - org.telegram.messenger.g0.f24004m) - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(8.0f);
        if (y10 > 0 && mj0Var != null && mj0Var.b() == 0) {
            i7 = y10;
        }
        if (y10 < 0 || mj0Var == null || mj0Var.b() != 0) {
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
        return this.f37492r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.U.size() + this.S.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.v6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.v6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.G.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29455j5));
        int i7 = org.telegram.ui.ActionBar.m6.A5;
        ak akVar = this.f37492r;
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, 32, new Class[]{org.telegram.ui.Cells.z6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29311b7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, 48, new Class[]{org.telegram.ui.Cells.z6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29290a7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29439i6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.m6.f29470k0, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29348d7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29477k7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.qj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, 40, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(akVar, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.sj));
        return arrayList;
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final boolean k() {
        ek ekVar = this.f37494w;
        if (ekVar.f34826f.size() <= 0) {
            return false;
        }
        V();
        dk dkVar = (dk) p5.c.g(1, ekVar.f34826f);
        this.f37477b.V2.setTitle(dkVar.f34480b);
        int topForScroll = getTopForScroll();
        File file = dkVar.f34479a;
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
                org.telegram.messenger.t0.f26895b.unregisterReceiver(this.f37489f0);
                this.Q = false;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.f37477b.V2.n(true);
        org.telegram.ui.ActionBar.y s5 = this.f37477b.V2.s();
        s5.removeView(this.H);
        s5.removeView(this.G);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.f37484a0 = z10;
    }

    public void setDelegate(ck ckVar) {
        this.R = ckVar;
    }

    public void setMaxSelectedFiles(int i7) {
        this.W = i7;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f37477b.f30142b.invalidate();
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
            org.telegram.messenger.cz.M0 = !org.telegram.messenger.cz.M0;
            SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
            edit.putBoolean("sortFilesByName", org.telegram.messenger.cz.M0);
            edit.apply();
            this.f37487d0 = org.telegram.messenger.cz.M0;
            ek ekVar = this.f37494w;
            Collections.sort((ArrayList) ekVar.h, new yj(this, 1));
            if (this.P != null) {
                Collections.sort(ekVar.f34825e, new yj(this, 0));
            }
            ekVar.f();
            if (this.f37487d0) {
                i10 = 2131232104;
            } else {
                i10 = 2131232103;
            }
            this.H.setIcon(i10);
        }
    }
}
