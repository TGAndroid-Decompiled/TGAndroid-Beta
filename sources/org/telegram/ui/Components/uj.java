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
public final class uj extends th {
    public static final int f38761h0 = 0;
    public final tj E;
    public final lg.d0 F;
    public final org.telegram.ui.ActionBar.q0 G;
    public final org.telegram.ui.ActionBar.q0 H;
    public final kg.n0 I;
    public AnimatorSet J;
    public final iz K;
    public boolean L;
    public final ei.f5 M;
    public float N;
    public boolean O;
    public File P;
    public boolean Q;
    public lj R;
    public final HashMap S;
    public final ArrayList T;
    public final HashMap U;
    public boolean V;
    public int W;
    public boolean f38762a0;
    public final boolean f38763b0;
    public boolean f38764c0;
    public boolean f38765d0;
    public boolean f38766e0;
    public final androidx.mediarouter.app.f f38767f0;
    public ValueAnimator f38768g0;
    public int f38769n;
    public final jj f38770r;
    public final jj f38771s;
    public final nj f38772w;
    public final nj f38773x;
    public final jy f38774y;

    public uj(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, bi biVar) {
        super(context, e6Var, biVar);
        boolean z10;
        boolean z11;
        int i10;
        String str;
        this.Q = false;
        this.S = new HashMap();
        this.T = new ArrayList();
        this.U = new HashMap();
        this.W = -1;
        this.f38767f0 = new androidx.mediarouter.app.f(this, 10);
        nj njVar = new nj(this, context);
        this.f38772w = njVar;
        if (i3 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38763b0 = z10;
        int i11 = 2;
        if (i3 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f38766e0 = z11;
        this.f38765d0 = org.telegram.messenger.az.M0;
        int i12 = 3;
        try {
            if (z11) {
                try {
                    Cursor query = org.telegram.messenger.t0.f25457b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        File file = new File(query.getString(1));
                        long j10 = query.getLong(i11);
                        long j11 = query.getLong(i12);
                        String string = query.getString(4);
                        if (j10 <= org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f23047k4 * 1000 && j11 <= org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f23056l4 && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                            oj ojVar = new oj();
                            ojVar.f36840b = file.getName();
                            ojVar.f36843f = file;
                            String name = file.getName();
                            String[] split = name.split("\\.");
                            if (split.length > 1) {
                                str = split[split.length - 1];
                            } else {
                                str = "?";
                            }
                            ojVar.d = str;
                            ojVar.f36841c = org.telegram.messenger.g0.i0(file.length(), false, false);
                            String lowerCase = name.toLowerCase();
                            if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                ojVar.f36842e = file.getAbsolutePath();
                            }
                            ((ArrayList) this.f38772w.h).add(ojVar);
                        }
                        i11 = 2;
                        i12 = 3;
                    }
                    query.close();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else {
                P(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort((ArrayList) njVar.h, new hj(this, 1));
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        this.f38764c0 = false;
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
                org.telegram.messenger.t0.f25457b.registerReceiver(this.f38767f0, intentFilter, 4);
            } else {
                org.telegram.messenger.t0.f25457b.registerReceiver(this.f38767f0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.x q10 = this.f38416b.S2.q();
        org.telegram.ui.ActionBar.q0 a10 = q10.a(0, 2131232486);
        a10.N();
        a10.I = new lg.w1(this, 6);
        this.G = a10;
        a10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        a10.setContentDescription(org.telegram.messenger.bd.M0(2131745846, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i13 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.V(searchField, i13, e6Var);
        org.telegram.ui.ActionBar.r6.w(searchField, i13, e6Var);
        org.telegram.ui.ActionBar.r6.E(searchField, org.telegram.ui.ActionBar.k6.Je, e6Var);
        if (this.f38765d0) {
            i10 = 2131232102;
        } else {
            i10 = 2131232101;
        }
        org.telegram.ui.ActionBar.q0 a11 = q10.a(6, i10);
        this.H = a11;
        a11.setContentDescription(org.telegram.messenger.bd.M0(2131754891, null));
        iz izVar = new iz(context, e6Var);
        this.K = izVar;
        addView(izVar);
        ei.f5 f5Var = new ei.f5(this, context, izVar, e6Var);
        this.M = f5Var;
        addView(f5Var, b8.mf.c(-1.0f, -1));
        f5Var.setVisibility(8);
        f5Var.setOnTouchListener(new fi.a(14));
        jj jjVar = new jj(this, context, e6Var, 0);
        this.f38771s = jjVar;
        jjVar.setSectionsType(2);
        jjVar.setVerticalScrollBarEnabled(false);
        jy jyVar = new jy(org.telegram.messenger.g0.L(56.0f), 0, jjVar);
        this.f38774y = jyVar;
        jjVar.setLayoutManager(jyVar);
        jjVar.setClipToPadding(false);
        nj njVar2 = new nj(this, context);
        this.f38773x = njVar2;
        jjVar.setAdapter(njVar2);
        addView(jjVar, b8.mf.c(-1.0f, -1));
        jjVar.setVisibility(8);
        jj jjVar2 = new jj(this, context, e6Var, 1);
        this.f38770r = jjVar2;
        jjVar2.r1();
        setBlur3Capture(jjVar2);
        this.d = jjVar2;
        this.h = true;
        this.f38419f = true;
        jjVar2.setSectionsType(2);
        jjVar2.setVerticalScrollBarEnabled(false);
        lg.d0 d0Var = new lg.d0(this, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f22602m, jjVar2, 2);
        this.F = d0Var;
        jjVar2.setLayoutManager(d0Var);
        jjVar2.setClipToPadding(false);
        jjVar2.setAdapter(this.f38772w);
        addView(jjVar2, b8.mf.c(-1.0f, -1));
        this.E = new tj(this, context);
        jjVar2.setOnScrollListener(new ji(this, 3));
        jjVar2.setOnItemClickListener(new fj0(this) {
            public final uj f33811b;

            {
                this.f33811b = this;
            }

            @Override
            public final void f(int i14, View view) {
                kg.l0 l0Var;
                switch (r2) {
                    case 0:
                        uj.O(this.f33811b, view, i14);
                        return;
                    default:
                        uj ujVar = this.f33811b;
                        kg.n0 n0Var = ujVar.I;
                        n0Var.I0(true);
                        tj tjVar = ujVar.E;
                        ArrayList arrayList = n0Var.f17112f3;
                        if (arrayList.isEmpty()) {
                            l0Var = kg.n0.f17105k3[i14];
                        } else {
                            l0Var = (kg.l0) arrayList.get(i14);
                        }
                        bi biVar2 = tjVar.Y.f38416b;
                        ArrayList arrayList2 = tjVar.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                                if (l0Var.b((kg.l0) arrayList2.get(i15))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(l0Var);
                        biVar2.S2.setSearchFilter(l0Var);
                        biVar2.S2.setSearchFieldText("");
                        tjVar.a0(null, null, true);
                        return;
                }
            }
        });
        jjVar2.setOnItemLongClickListener(new t(this, 20));
        kg.n0 n0Var = new kg.n0(context, e6Var);
        this.I = n0Var;
        n0Var.setOnItemClickListener(new fj0(this) {
            public final uj f33811b;

            {
                this.f33811b = this;
            }

            @Override
            public final void f(int i14, View view) {
                kg.l0 l0Var;
                switch (r2) {
                    case 0:
                        uj.O(this.f33811b, view, i14);
                        return;
                    default:
                        uj ujVar = this.f33811b;
                        kg.n0 n0Var2 = ujVar.I;
                        n0Var2.I0(true);
                        tj tjVar = ujVar.E;
                        ArrayList arrayList = n0Var2.f17112f3;
                        if (arrayList.isEmpty()) {
                            l0Var = kg.n0.f17105k3[i14];
                        } else {
                            l0Var = (kg.l0) arrayList.get(i14);
                        }
                        bi biVar2 = tjVar.Y.f38416b;
                        ArrayList arrayList2 = tjVar.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                                if (l0Var.b((kg.l0) arrayList2.get(i15))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(l0Var);
                        biVar2.S2.setSearchFilter(l0Var);
                        biVar2.S2.setSearchFieldText("");
                        tjVar.a0(null, null, true);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, n0Var, e6Var);
        addView(n0Var, b8.mf.e(-1, 44, 48));
        n0Var.setTranslationY(-org.telegram.messenger.g0.L(44.0f));
        n0Var.setVisibility(4);
        S();
        a0();
        X();
    }

    public static void O(uj ujVar, View view, int i3) {
        Object O;
        boolean z10;
        boolean z11;
        int i10;
        bi biVar = ujVar.f38416b;
        jj jjVar = ujVar.f38770r;
        u4.h0 adapter = jjVar.getAdapter();
        nj njVar = ujVar.f38772w;
        if (adapter == njVar) {
            O = njVar.E(i3);
        } else {
            tj tjVar = ujVar.E;
            O = tjVar.O(tjVar.S(i3), tjVar.Q(i3));
        }
        if (O instanceof oj) {
            oj ojVar = (oj) O;
            File file = ojVar.f36843f;
            if (Build.VERSION.SDK_INT >= 30) {
                z10 = Environment.isExternalStorageManager();
            } else {
                z10 = false;
            }
            org.telegram.ui.wm wmVar = null;
            if (!org.telegram.messenger.r2.f25041b && (((i10 = ojVar.f36839a) == 2131231074 || i10 == 2131231072) && !z10)) {
                oh ohVar = biVar.f32249m3;
                int i11 = biVar.E3;
                if (biVar.C3 != null && biVar.C1 - biVar.D1 < 0) {
                    if (!org.telegram.messenger.hp.s1(i11).D3() && org.telegram.messenger.hp.s1(i11).U4 > biVar.D1) {
                        new fc(ohVar, biVar.J0).f(org.telegram.messenger.hp.s1(i11).U4, new ng(biVar, 3)).j();
                        return;
                    } else {
                        new fc(ohVar, biVar.J0).t(org.telegram.messenger.bd.M0(2131744051, null), biVar.J0).j();
                        return;
                    }
                }
                ujVar.R.A();
                return;
            } else if (file == null) {
                int i12 = ojVar.f36839a;
                if (i12 == 2131231071) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
                    if (d2Var instanceof org.telegram.ui.wm) {
                        wmVar = (org.telegram.ui.wm) d2Var;
                    }
                    org.telegram.ui.wm wmVar2 = wmVar;
                    org.telegram.messenger.pe peVar = MediaController.f21294a2;
                    if (wmVar2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.sm0 sm0Var = new org.telegram.ui.sm0(0, peVar, hashMap, arrayList, 0, z11, wmVar2, false);
                    sm0Var.m0 = true;
                    sm0Var.f49564t0 = new k4.j(false, ujVar, hashMap, arrayList);
                    sm0Var.k0(ujVar.W, false);
                    org.telegram.ui.ActionBar.d2 d2Var2 = biVar.X1;
                    if (d2Var2 != null) {
                        d2Var2.presentFragment(sm0Var);
                    } else {
                        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            Q.presentFragment(sm0Var);
                        }
                    }
                    biVar.a(true);
                    return;
                } else if (i12 == 2131231073) {
                    lj ljVar = ujVar.R;
                    if (ljVar != null) {
                        ljVar.S();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = ujVar.getTopForScroll();
                    ujVar.U();
                    mj mjVar = (mj) org.telegram.ui.Cells.f1.o(1, njVar.f36568f);
                    biVar.S2.setTitle(mjVar.f36170b);
                    File file2 = mjVar.f36169a;
                    if (file2 != null) {
                        ujVar.R(file2);
                    } else {
                        ujVar.S();
                    }
                    ujVar.a0();
                    ujVar.F.h1(0, topForScroll);
                    ujVar.V(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = jjVar.getChildAt(0);
                u4.d1 G = jjVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f36169a = ujVar.P;
                    obj.f36170b = biVar.S2.getTitle();
                    ujVar.U();
                    njVar.f36568f.add(obj);
                    if (!ujVar.R(file)) {
                        njVar.f36568f.remove((Object) obj);
                        return;
                    }
                    ujVar.V(1);
                    biVar.S2.setTitle(ojVar.f36840b);
                    return;
                }
                return;
            } else {
                ujVar.T(view, ojVar);
                return;
            }
        }
        ujVar.T(view, O);
    }

    private int getTopForScroll() {
        jj jjVar = this.f38770r;
        View childAt = jjVar.getChildAt(0);
        u4.d1 G = jjVar.G(childAt);
        int i3 = -jjVar.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i3;
        }
        return i3;
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uj.B(int, int):void");
    }

    @Override
    public final void C() {
        nj njVar = this.f38772w;
        if (njVar != null) {
            njVar.f();
        }
        tj tjVar = this.E;
        if (tjVar != null) {
            tjVar.f();
        }
    }

    @Override
    public final void H(th thVar) {
        this.S.clear();
        this.U.clear();
        this.E.S.clear();
        this.T.clear();
        this.f38772w.f36568f.clear();
        S();
        a0();
        X();
        this.f38416b.S2.setTitle(org.telegram.messenger.bd.M0(2131745667, null));
        this.H.setVisibility(0);
        this.F.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f38770r.y0(0);
    }

    @Override
    public final boolean L(final boolean z10, final int i3, int i10, final long j10, final boolean z11) {
        int size = this.S.size();
        HashMap hashMap = this.U;
        if ((size == 0 && hashMap.size() == 0) || this.R == null || this.L) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (org.telegram.ui.pz pzVar : hashMap.keySet()) {
            arrayList.add((org.telegram.messenger.zi) hashMap.get(pzVar));
        }
        final ArrayList arrayList2 = new ArrayList(this.T);
        bi biVar = this.f38416b;
        CharSequence[] charSequenceArr = {biVar.a1().getText()};
        final ArrayList W = org.telegram.messenger.li.b0(biVar.E3).W(charSequenceArr, true, true);
        final String charSequence = charSequenceArr[0].toString();
        return t4.a0(biVar.E3, biVar.b1(), biVar.X0() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new org.telegram.messenger.u10() {
            @Override
            public final void a(Object obj) {
                uj ujVar = uj.this;
                ujVar.L = true;
                ujVar.R.n(arrayList2, charSequence, W, arrayList, z10, i3, j10, z11, ((Long) obj).longValue());
                ujVar.f38416b.a(true);
            }
        }, 0L);
    }

    public final void P(File file) {
        String str;
        File[] listFiles = file.listFiles();
        File j10 = org.telegram.messenger.w7.j(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    P(file2);
                } else if (!file2.equals(j10)) {
                    oj ojVar = new oj();
                    ojVar.f36840b = file2.getName();
                    ojVar.f36843f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    ojVar.d = str;
                    ojVar.f36841c = org.telegram.messenger.g0.i0(file2.length(), false, false);
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        ojVar.f36842e = file2.getAbsolutePath();
                    }
                    ((ArrayList) this.f38772w.h).add(ojVar);
                }
            }
        }
    }

    public final boolean Q(File file) {
        String str;
        int i3;
        String D = org.telegram.messenger.w7.D(file);
        if (D != null) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(D);
        } else {
            str = null;
        }
        if (file.length() != 0 && str != null && zf.c.f60452i.contains(str)) {
            if (file.length() > org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f23056l4) {
                new fc(this.f38416b.f28589c, null).u(org.telegram.messenger.bd.a0("TooLargeError", null, 2131744052, new Object[0]), org.telegram.messenger.bd.a0("ErrorRingtoneSizeTooBig", null, 2131751103, Integer.valueOf(org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f23056l4 / 1024)), null).j();
                return false;
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(org.telegram.messenger.t0.f25457b, Uri.fromFile(file));
                i3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                i3 = Integer.MAX_VALUE;
            }
            if (i3 <= org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f23047k4 * 1000) {
                return true;
            }
            new fc(this.f38416b.f28589c, null).u(org.telegram.messenger.bd.a0("TooLongError", null, 2131744051, new Object[0]), org.telegram.messenger.bd.a0("ErrorRingtoneDurationTooLong", null, 2131751105, Integer.valueOf(org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f23047k4)), null).j();
            return false;
        }
        new fc(this.f38416b.f28589c, null).u(org.telegram.messenger.bd.a0("InvalidFormatError", null, 2131749189, new Object[0]), org.telegram.messenger.bd.M0(2131751104, null), null).j();
        return false;
    }

    public final boolean R(File file) {
        File file2;
        String str;
        nj njVar;
        this.O = false;
        boolean canRead = file.canRead();
        jj jjVar = this.f38770r;
        String str2 = null;
        nj njVar2 = this.f38772w;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.P = file;
                njVar2.f36567e.clear();
                Environment.getExternalStorageState();
                org.telegram.messenger.g0.y(jjVar);
                this.V = true;
                njVar2.f();
                return true;
            }
            W(org.telegram.messenger.bd.M0(2131754711, null));
            return false;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                W(org.telegram.messenger.bd.M0(2131743889, null));
                return false;
            }
            this.P = file;
            ArrayList arrayList = njVar2.f36567e;
            ArrayList arrayList2 = njVar2.f36568f;
            ArrayList arrayList3 = njVar2.f36567e;
            arrayList.clear();
            File j10 = org.telegram.messenger.w7.j(6);
            int i3 = 0;
            while (i3 < listFiles.length) {
                File file3 = listFiles[i3];
                if (file3.getName().indexOf(46) == 0 || file3.equals(j10)) {
                    njVar = njVar2;
                } else {
                    oj ojVar = new oj();
                    ojVar.f36840b = file3.getName();
                    ojVar.f36843f = file3;
                    if (file3.isDirectory()) {
                        ojVar.f36839a = 2131231070;
                        ojVar.f36841c = org.telegram.messenger.bd.M0(2131750686, str2);
                        njVar = njVar2;
                    } else {
                        this.O = true;
                        String name = file3.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        ojVar.d = str;
                        njVar = njVar2;
                        ojVar.f36841c = org.telegram.messenger.g0.i0(file3.length(), false, false);
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            ojVar.f36842e = file3.getAbsolutePath();
                        }
                    }
                    arrayList3.add(ojVar);
                }
                i3++;
                njVar2 = njVar;
                str2 = null;
            }
            nj njVar3 = njVar2;
            oj ojVar2 = new oj();
            ojVar2.f36840b = "..";
            if (arrayList2.size() > 0) {
                File file4 = ((mj) k2.p1.h(1, arrayList2)).f36169a;
                if (file4 == null) {
                    file2 = null;
                    ojVar2.f36841c = org.telegram.messenger.bd.M0(2131750686, null);
                } else {
                    file2 = null;
                    ojVar2.f36841c = file4.toString();
                }
            } else {
                file2 = null;
                ojVar2.f36841c = org.telegram.messenger.bd.M0(2131750686, null);
            }
            ojVar2.f36839a = 2131231070;
            ojVar2.f36843f = file2;
            arrayList3.add(0, ojVar2);
            if (this.P != null) {
                Collections.sort(njVar3.f36567e, new hj(this, 0));
            }
            a0();
            org.telegram.messenger.g0.y(jjVar);
            this.V = true;
            int topForScroll = getTopForScroll();
            njVar3.f();
            this.F.h1(0, topForScroll);
            return true;
        } catch (Exception e10) {
            W(e10.getLocalizedMessage());
            return false;
        }
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uj.S():void");
    }

    public final boolean T(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uj.T(android.view.View, java.lang.Object):boolean");
    }

    public final void U() {
        View m10;
        nj njVar = this.f38773x;
        njVar.f36568f.clear();
        ArrayList arrayList = njVar.f36568f;
        nj njVar2 = this.f38772w;
        arrayList.addAll(njVar2.f36568f);
        ArrayList arrayList2 = njVar.f36567e;
        arrayList2.clear();
        arrayList2.addAll(njVar2.f36567e);
        ArrayList arrayList3 = (ArrayList) njVar.h;
        arrayList3.clear();
        arrayList3.addAll((ArrayList) njVar2.h);
        njVar.f();
        jj jjVar = this.f38771s;
        jjVar.setVisibility(0);
        jj jjVar2 = this.f38770r;
        jjVar.setPadding(jjVar2.getPaddingLeft(), jjVar2.getPaddingTop(), jjVar2.getPaddingRight(), jjVar2.getPaddingBottom());
        lg.d0 d0Var = this.F;
        int L0 = d0Var.L0();
        if (L0 >= 0 && (m10 = d0Var.m(L0)) != null) {
            this.f38774y.h1(L0, m10.getTop() - jjVar.getPaddingTop());
        }
    }

    public final void V(int i3) {
        jj jjVar;
        float L;
        ValueAnimator valueAnimator = this.f38768g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f38769n = i3;
        int i10 = 0;
        while (true) {
            int childCount = getChildCount();
            jjVar = this.f38770r;
            if (i10 < childCount) {
                if (getChildAt(i10) == jjVar) {
                    break;
                }
                i10++;
            } else {
                i10 = 0;
                break;
            }
        }
        jj jjVar2 = this.f38771s;
        if (i3 == 1) {
            L = org.telegram.messenger.g0.L(150.0f);
            jjVar2.setAlpha(1.0f);
            jjVar2.setScaleX(1.0f);
            jjVar2.setScaleY(1.0f);
            jjVar2.setTranslationX(0.0f);
            removeView(jjVar2);
            addView(jjVar2, i10);
            jjVar2.setVisibility(0);
            jjVar.setTranslationX(L);
            jjVar.setAlpha(0.0f);
            this.f38768g0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            L = org.telegram.messenger.g0.L(150.0f);
            jjVar.setAlpha(0.0f);
            jjVar.setScaleX(0.95f);
            jjVar.setScaleY(0.95f);
            jjVar2.setScaleX(1.0f);
            jjVar2.setScaleY(1.0f);
            jjVar2.setTranslationX(0.0f);
            jjVar2.setAlpha(1.0f);
            removeView(jjVar2);
            addView(jjVar2, i10 + 1);
            jjVar2.setVisibility(0);
            this.f38768g0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f38768g0.addUpdateListener(new gj(this, i3, L, 0));
        this.f38768g0.addListener(new x5(this, 11));
        if (i3 == 1) {
            this.f38768g0.setDuration(220L);
        } else {
            this.f38768g0.setDuration(200L);
        }
        this.f38768g0.setInterpolator(xq.f40452f);
        this.f38768g0.start();
    }

    public final void W(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f38415a);
        String M0 = org.telegram.messenger.bd.M0(2131689472, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = str;
        k2.p1.B(null, 2131747839, alertDialog$Builder, null);
    }

    public final void X() {
        u4.h0 adapter = this.f38770r.getAdapter();
        int i3 = 0;
        boolean z10 = true;
        tj tjVar = this.E;
        if (adapter != tjVar ? this.f38772w.b() != 1 : !tjVar.f38425s.isEmpty() || !tjVar.Q.isEmpty()) {
            z10 = false;
        }
        if (!z10) {
            i3 = 8;
        }
        this.M.setVisibility(i3);
        Z();
    }

    public final void Z() {
        View childAt;
        ei.f5 f5Var = this.M;
        if (f5Var.getVisibility() != 0 || (childAt = this.f38770r.getChildAt(0)) == null) {
            return;
        }
        float translationY = f5Var.getTranslationY();
        this.N = (childAt.getTop() + (f5Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        f5Var.setTranslationY(translationY);
    }

    public final void a0() {
        int i3;
        org.telegram.ui.ActionBar.q0 q0Var = this.G;
        if (q0Var != null && !q0Var.v()) {
            if (!this.O && !this.f38772w.f36568f.isEmpty()) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            q0Var.setVisibility(i3);
        }
    }

    @Override
    public final void d() {
        org.telegram.ui.ActionBar.q0 q0Var = this.G;
        if (q0Var != null) {
            try {
                if (q0Var.getSearchField() != null) {
                    q0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27988j5, this.f38415a));
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
        jj jjVar = this.f38770r;
        if (jjVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i3 = 0;
        View childAt = jjVar.getChildAt(0);
        bj0 bj0Var = (bj0) jjVar.G(childAt);
        int y9 = ((((int) childAt.getY()) - org.telegram.messenger.g0.f22602m) - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(8.0f);
        if (y9 > 0 && bj0Var != null && bj0Var.b() == 0) {
            i3 = y9;
        }
        if (y9 < 0 || bj0Var == null || bj0Var.b() != 0) {
            y9 = i3;
        }
        return org.telegram.messenger.g0.L(13.0f) + y9;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(5.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f38770r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.U.size() + this.S.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.G.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27988j5));
        int i3 = org.telegram.ui.ActionBar.k6.A5;
        jj jjVar = this.f38770r;
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, 32, new Class[]{org.telegram.ui.Cells.x6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27843b7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, 48, new Class[]{org.telegram.ui.Cells.x6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27824a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27972i6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f28002k0, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27879d7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"dateTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, 8192, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27973i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, 16384, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28008k7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, 8, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, 40, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.oj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(jjVar, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"extTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.pj));
        return arrayList;
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final boolean k() {
        nj njVar = this.f38772w;
        if (njVar.f36568f.size() <= 0) {
            return false;
        }
        U();
        mj mjVar = (mj) org.telegram.ui.Cells.f1.o(1, njVar.f36568f);
        this.f38416b.S2.setTitle(mjVar.f36170b);
        int topForScroll = getTopForScroll();
        File file = mjVar.f36169a;
        if (file != null) {
            R(file);
        } else {
            S();
        }
        a0();
        this.F.h1(0, topForScroll);
        V(2);
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        Z();
    }

    @Override
    public final void p() {
        try {
            if (this.Q) {
                org.telegram.messenger.t0.f25457b.unregisterReceiver(this.f38767f0);
                this.Q = false;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.f38416b.S2.l(true);
        org.telegram.ui.ActionBar.x q10 = this.f38416b.S2.q();
        q10.removeView(this.H);
        q10.removeView(this.G);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.f38762a0 = z10;
    }

    public void setDelegate(lj ljVar) {
        this.R = ljVar;
    }

    public void setMaxSelectedFiles(int i3) {
        this.W = i3;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38416b.f28586b.invalidate();
    }

    @Override
    public final void u() {
        this.H.setVisibility(8);
        this.G.setVisibility(8);
    }

    @Override
    public final void w(int i3) {
        int i10;
        if (i3 == 6) {
            org.telegram.messenger.az.M0 = !org.telegram.messenger.az.M0;
            SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
            edit.putBoolean("sortFilesByName", org.telegram.messenger.az.M0);
            edit.apply();
            this.f38765d0 = org.telegram.messenger.az.M0;
            nj njVar = this.f38772w;
            Collections.sort((ArrayList) njVar.h, new hj(this, 1));
            if (this.P != null) {
                Collections.sort(njVar.f36567e, new hj(this, 0));
            }
            njVar.f();
            if (this.f38765d0) {
                i10 = 2131232102;
            } else {
                i10 = 2131232101;
            }
            this.H.setIcon(i10);
        }
    }
}
