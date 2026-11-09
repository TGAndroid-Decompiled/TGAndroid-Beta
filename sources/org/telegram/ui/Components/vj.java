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
public final class vj extends vh {
    public static final int f39105g0 = 0;
    public final uj D;
    public final kg.c0 E;
    public final org.telegram.ui.ActionBar.r0 F;
    public final org.telegram.ui.ActionBar.r0 G;
    public final jg.q0 H;
    public AnimatorSet I;
    public final mz J;
    public boolean K;
    public final di.g5 L;
    public float M;
    public boolean N;
    public File O;
    public boolean P;
    public mj Q;
    public final HashMap R;
    public final ArrayList S;
    public final HashMap T;
    public boolean U;
    public int V;
    public boolean W;
    public final boolean f39106a0;
    public boolean f39107b0;
    public boolean f39108c0;
    public boolean f39109d0;
    public final androidx.mediarouter.app.f f39110e0;
    public ValueAnimator f39111f0;
    public int f39112n;
    public final kj f39113r;
    public final kj f39114s;
    public final oj f39115w;
    public final oj f39116x;
    public final my f39117y;

    public vj(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var, di diVar) {
        super(context, g6Var, diVar);
        boolean z9;
        boolean z10;
        int i10;
        Cursor cursor;
        String str;
        this.P = false;
        this.R = new HashMap();
        this.S = new ArrayList();
        this.T = new HashMap();
        this.V = -1;
        this.f39110e0 = new androidx.mediarouter.app.f(this, 8);
        oj ojVar = new oj(this, context);
        this.f39115w = ojVar;
        if (i7 == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f39106a0 = z9;
        int i11 = 2;
        if (i7 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f39109d0 = z10;
        this.f39108c0 = org.telegram.messenger.iz.M0;
        try {
            if (z10) {
                try {
                    Cursor query = org.telegram.messenger.t0.f25566b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j3 = query.getLong(i11);
                            long j10 = query.getLong(3);
                            String string = query.getString(4);
                            cursor = query;
                            if (j3 <= org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).f24823k4 * 1000) {
                                try {
                                    if (j10 <= org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).f24831l4 && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        pj pjVar = new pj();
                                        pjVar.f37027b = file.getName();
                                        pjVar.f37030f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        pjVar.d = str;
                                        pjVar.f37028c = org.telegram.messenger.g0.i0(file.length(), false, false);
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            pjVar.f37029e = file.getAbsolutePath();
                                        }
                                        ((ArrayList) this.f39115w.h).add(pjVar);
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
                P(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort((ArrayList) ojVar.h, new ij(this, 1));
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        this.f39107b0 = false;
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
                org.telegram.messenger.t0.f25566b.registerReceiver(this.f39110e0, intentFilter, 4);
            } else {
                org.telegram.messenger.t0.f25566b.registerReceiver(this.f39110e0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.y r10 = this.f39071b.R2.r();
        org.telegram.ui.ActionBar.r0 a10 = r10.a(0, 2131232486);
        a10.N();
        a10.H = new kg.v1(this, 6);
        this.F = a10;
        a10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        a10.setContentDescription(org.telegram.messenger.id.M0(2131745836, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i12 = org.telegram.ui.ActionBar.l6.f27973j5;
        org.telegram.ui.ActionBar.s6.U(searchField, i12, g6Var);
        org.telegram.ui.ActionBar.s6.v(searchField, i12, g6Var);
        org.telegram.ui.ActionBar.s6.D(searchField, org.telegram.ui.ActionBar.l6.Je, g6Var);
        if (this.f39108c0) {
            i10 = 2131232102;
        } else {
            i10 = 2131232101;
        }
        org.telegram.ui.ActionBar.r0 a11 = r10.a(6, i10);
        this.G = a11;
        a11.setContentDescription(org.telegram.messenger.id.M0(2131754891, null));
        mz mzVar = new mz(context, g6Var);
        this.J = mzVar;
        addView(mzVar);
        di.g5 g5Var = new di.g5(this, context, mzVar, g6Var);
        this.L = g5Var;
        addView(g5Var, c8.ha.c(-1.0f, -1));
        g5Var.setVisibility(8);
        g5Var.setOnTouchListener(new ei.b(14));
        kj kjVar = new kj(this, context, g6Var, 0);
        this.f39114s = kjVar;
        kjVar.setSectionsType(2);
        kjVar.setVerticalScrollBarEnabled(false);
        my myVar = new my(org.telegram.messenger.g0.L(56.0f), 0, kjVar);
        this.f39117y = myVar;
        kjVar.setLayoutManager(myVar);
        kjVar.setClipToPadding(false);
        oj ojVar2 = new oj(this, context);
        this.f39116x = ojVar2;
        kjVar.setAdapter(ojVar2);
        addView(kjVar, c8.ha.c(-1.0f, -1));
        kjVar.setVisibility(8);
        kj kjVar2 = new kj(this, context, g6Var, 1);
        this.f39113r = kjVar2;
        kjVar2.r1();
        setBlur3Capture(kjVar2);
        this.d = kjVar2;
        this.h = true;
        this.f39074f = true;
        kjVar2.setSectionsType(2);
        kjVar2.setVerticalScrollBarEnabled(false);
        kg.c0 c0Var = new kg.c0(this, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f22557m, kjVar2, 2);
        this.E = c0Var;
        kjVar2.setLayoutManager(c0Var);
        kjVar2.setClipToPadding(false);
        kjVar2.setAdapter(this.f39115w);
        addView(kjVar2, c8.ha.c(-1.0f, -1));
        this.D = new uj(this, context);
        kjVar2.setOnScrollListener(new ui(this, 1));
        kjVar2.setOnItemClickListener(new cj0(this) {
            public final vj f33960b;

            {
                this.f33960b = this;
            }

            @Override
            public final void c(int i13, View view) {
                jg.o0 o0Var;
                switch (r2) {
                    case 0:
                        vj.O(this.f33960b, view, i13);
                        return;
                    default:
                        vj vjVar = this.f33960b;
                        jg.q0 q0Var = vjVar.H;
                        q0Var.I0(true);
                        uj ujVar = vjVar.D;
                        ArrayList arrayList = q0Var.f16891e3;
                        if (arrayList.isEmpty()) {
                            o0Var = jg.q0.j3[i13];
                        } else {
                            o0Var = (jg.o0) arrayList.get(i13);
                        }
                        di diVar2 = ujVar.X.f39071b;
                        ArrayList arrayList2 = ujVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (o0Var.b((jg.o0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        diVar2.R2.setSearchFilter(o0Var);
                        diVar2.R2.setSearchFieldText("");
                        ujVar.a0(null, null, true);
                        return;
                }
            }
        });
        kjVar2.setOnItemLongClickListener(new u(this, 20));
        jg.q0 q0Var = new jg.q0(context, g6Var);
        this.H = q0Var;
        q0Var.setOnItemClickListener(new cj0(this) {
            public final vj f33960b;

            {
                this.f33960b = this;
            }

            @Override
            public final void c(int i13, View view) {
                jg.o0 o0Var;
                switch (r2) {
                    case 0:
                        vj.O(this.f33960b, view, i13);
                        return;
                    default:
                        vj vjVar = this.f33960b;
                        jg.q0 q0Var2 = vjVar.H;
                        q0Var2.I0(true);
                        uj ujVar = vjVar.D;
                        ArrayList arrayList = q0Var2.f16891e3;
                        if (arrayList.isEmpty()) {
                            o0Var = jg.q0.j3[i13];
                        } else {
                            o0Var = (jg.o0) arrayList.get(i13);
                        }
                        di diVar2 = ujVar.X.f39071b;
                        ArrayList arrayList2 = ujVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (o0Var.b((jg.o0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        diVar2.R2.setSearchFilter(o0Var);
                        diVar2.R2.setSearchFieldText("");
                        ujVar.a0(null, null, true);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27938h5, q0Var, g6Var);
        addView(q0Var, c8.ha.e(-1, 44, 48));
        q0Var.setTranslationY(-org.telegram.messenger.g0.L(44.0f));
        q0Var.setVisibility(4);
        S();
        a0();
        X();
    }

    public static void O(vj vjVar, View view, int i7) {
        Object O;
        boolean z9;
        boolean z10;
        int i10;
        di diVar = vjVar.f39071b;
        kj kjVar = vjVar.f39113r;
        v4.g0 adapter = kjVar.getAdapter();
        oj ojVar = vjVar.f39115w;
        if (adapter == ojVar) {
            O = ojVar.E(i7);
        } else {
            uj ujVar = vjVar.D;
            O = ujVar.O(ujVar.S(i7), ujVar.Q(i7));
        }
        if (O instanceof pj) {
            pj pjVar = (pj) O;
            File file = pjVar.f37030f;
            if (Build.VERSION.SDK_INT >= 30) {
                z9 = Environment.isExternalStorageManager();
            } else {
                z9 = false;
            }
            org.telegram.ui.cn cnVar = null;
            if (!org.telegram.messenger.r2.f25213b && (((i10 = pjVar.f37026a) == 2131231074 || i10 == 2131231072) && !z9)) {
                qh qhVar = diVar.f33022l3;
                int i11 = diVar.D3;
                if (diVar.B3 != null && diVar.B1 - diVar.C1 < 0) {
                    if (!org.telegram.messenger.qp.s1(i11).D3() && org.telegram.messenger.qp.s1(i11).U4 > diVar.C1) {
                        new hc(qhVar, diVar.I0).f(org.telegram.messenger.qp.s1(i11).U4, new qg(diVar, 3)).j();
                        return;
                    } else {
                        new hc(qhVar, diVar.I0).t(org.telegram.messenger.id.M0(2131744041, null), diVar.I0).j();
                        return;
                    }
                }
                vjVar.Q.A();
                return;
            } else if (file == null) {
                int i12 = pjVar.f37026a;
                if (i12 == 2131231071) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
                    if (f2Var instanceof org.telegram.ui.cn) {
                        cnVar = (org.telegram.ui.cn) f2Var;
                    }
                    org.telegram.ui.cn cnVar2 = cnVar;
                    org.telegram.messenger.we weVar = MediaController.Z1;
                    if (cnVar2 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.zm0 zm0Var = new org.telegram.ui.zm0(0, weVar, hashMap, arrayList, 0, z10, cnVar2, false);
                    zm0Var.f52614l0 = true;
                    zm0Var.f52623s0 = new h6.m(vjVar, hashMap, arrayList, false, 25);
                    zm0Var.k0(vjVar.V, false);
                    org.telegram.ui.ActionBar.f2 f2Var2 = diVar.W1;
                    if (f2Var2 != null) {
                        f2Var2.presentFragment(zm0Var);
                    } else {
                        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            Q.presentFragment(zm0Var);
                        }
                    }
                    diVar.a(true);
                    return;
                } else if (i12 == 2131231073) {
                    mj mjVar = vjVar.Q;
                    if (mjVar != null) {
                        mjVar.S();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = vjVar.getTopForScroll();
                    vjVar.U();
                    nj njVar = (nj) org.telegram.ui.Cells.f1.k(1, ojVar.f36729f);
                    diVar.R2.setTitle(njVar.f36386b);
                    File file2 = njVar.f36385a;
                    if (file2 != null) {
                        vjVar.R(file2);
                    } else {
                        vjVar.S();
                    }
                    vjVar.a0();
                    vjVar.E.h1(0, topForScroll);
                    vjVar.V(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = kjVar.getChildAt(0);
                v4.d1 G = kjVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f36385a = vjVar.O;
                    obj.f36386b = diVar.R2.getTitle();
                    vjVar.U();
                    ojVar.f36729f.add(obj);
                    if (!vjVar.R(file)) {
                        ojVar.f36729f.remove((Object) obj);
                        return;
                    }
                    vjVar.V(1);
                    diVar.R2.setTitle(pjVar.f37027b);
                    return;
                }
                return;
            } else {
                vjVar.T(view, pjVar);
                return;
            }
        }
        vjVar.T(view, O);
    }

    private int getTopForScroll() {
        kj kjVar = this.f39113r;
        View childAt = kjVar.getChildAt(0);
        v4.d1 G = kjVar.G(childAt);
        int i7 = -kjVar.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i7;
        }
        return i7;
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vj.B(int, int):void");
    }

    @Override
    public final void C() {
        oj ojVar = this.f39115w;
        if (ojVar != null) {
            ojVar.f();
        }
        uj ujVar = this.D;
        if (ujVar != null) {
            ujVar.f();
        }
    }

    @Override
    public final void H(vh vhVar) {
        this.R.clear();
        this.T.clear();
        this.D.R.clear();
        this.S.clear();
        this.f39115w.f36729f.clear();
        S();
        a0();
        X();
        this.f39071b.R2.setTitle(org.telegram.messenger.id.M0(2131745657, null));
        this.G.setVisibility(0);
        this.E.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f39113r.y0(0);
    }

    @Override
    public final boolean L(final boolean z9, final int i7, int i10, final long j3, final boolean z10) {
        int size = this.R.size();
        HashMap hashMap = this.T;
        if ((size == 0 && hashMap.size() == 0) || this.Q == null || this.K) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (org.telegram.ui.tz tzVar : hashMap.keySet()) {
            arrayList.add((org.telegram.messenger.ij) hashMap.get(tzVar));
        }
        final ArrayList arrayList2 = new ArrayList(this.S);
        di diVar = this.f39071b;
        CharSequence[] charSequenceArr = {diVar.a1().getText()};
        final ArrayList W = org.telegram.messenger.ui.b0(diVar.D3).W(charSequenceArr, true, true);
        final String charSequence = charSequenceArr[0].toString();
        return v4.Y(diVar.D3, diVar.b1(), diVar.X0() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new org.telegram.messenger.c20() {
            @Override
            public final void a(Object obj) {
                vj vjVar = vj.this;
                vjVar.K = true;
                vjVar.Q.n(arrayList2, charSequence, W, arrayList, z9, i7, j3, z10, ((Long) obj).longValue());
                vjVar.f39071b.a(true);
            }
        }, 0L);
    }

    public final void P(File file) {
        String str;
        File[] listFiles = file.listFiles();
        File j3 = org.telegram.messenger.w7.j(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    P(file2);
                } else if (!file2.equals(j3)) {
                    pj pjVar = new pj();
                    pjVar.f37027b = file2.getName();
                    pjVar.f37030f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    pjVar.d = str;
                    pjVar.f37028c = org.telegram.messenger.g0.i0(file2.length(), false, false);
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        pjVar.f37029e = file2.getAbsolutePath();
                    }
                    ((ArrayList) this.f39115w.h).add(pjVar);
                }
            }
        }
    }

    public final boolean Q(File file) {
        String str;
        int i7;
        String D = org.telegram.messenger.w7.D(file);
        if (D != null) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(D);
        } else {
            str = null;
        }
        if (file.length() != 0 && str != null && yf.d.f59421i.contains(str)) {
            if (file.length() > org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).f24831l4) {
                new hc(this.f39071b.f28627c, null).u(org.telegram.messenger.id.a0("TooLargeError", null, 2131744042, new Object[0]), org.telegram.messenger.id.a0("ErrorRingtoneSizeTooBig", null, 2131751102, Integer.valueOf(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).f24831l4 / 1024)), null).j();
                return false;
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(org.telegram.messenger.t0.f25566b, Uri.fromFile(file));
                i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                i7 = Integer.MAX_VALUE;
            }
            if (i7 <= org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).f24823k4 * 1000) {
                return true;
            }
            new hc(this.f39071b.f28627c, null).u(org.telegram.messenger.id.a0("TooLongError", null, 2131744041, new Object[0]), org.telegram.messenger.id.a0("ErrorRingtoneDurationTooLong", null, 2131751104, Integer.valueOf(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).f24823k4)), null).j();
            return false;
        }
        new hc(this.f39071b.f28627c, null).u(org.telegram.messenger.id.a0("InvalidFormatError", null, 2131749181, new Object[0]), org.telegram.messenger.id.M0(2131751103, null), null).j();
        return false;
    }

    public final boolean R(File file) {
        File file2;
        String str;
        oj ojVar;
        this.N = false;
        boolean canRead = file.canRead();
        kj kjVar = this.f39113r;
        String str2 = null;
        oj ojVar2 = this.f39115w;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.O = file;
                ojVar2.f36728e.clear();
                Environment.getExternalStorageState();
                org.telegram.messenger.g0.y(kjVar);
                this.U = true;
                ojVar2.f();
                return true;
            }
            W(org.telegram.messenger.id.M0(2131754711, null));
            return false;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                W(org.telegram.messenger.id.M0(2131743879, null));
                return false;
            }
            this.O = file;
            ArrayList arrayList = ojVar2.f36728e;
            ArrayList arrayList2 = ojVar2.f36729f;
            ArrayList arrayList3 = ojVar2.f36728e;
            arrayList.clear();
            File j3 = org.telegram.messenger.w7.j(6);
            int i7 = 0;
            while (i7 < listFiles.length) {
                File file3 = listFiles[i7];
                if (file3.getName().indexOf(46) == 0 || file3.equals(j3)) {
                    ojVar = ojVar2;
                } else {
                    pj pjVar = new pj();
                    pjVar.f37027b = file3.getName();
                    pjVar.f37030f = file3;
                    if (file3.isDirectory()) {
                        pjVar.f37026a = 2131231070;
                        pjVar.f37028c = org.telegram.messenger.id.M0(2131750685, str2);
                        ojVar = ojVar2;
                    } else {
                        this.N = true;
                        String name = file3.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        pjVar.d = str;
                        ojVar = ojVar2;
                        pjVar.f37028c = org.telegram.messenger.g0.i0(file3.length(), false, false);
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            pjVar.f37029e = file3.getAbsolutePath();
                        }
                    }
                    arrayList3.add(pjVar);
                }
                i7++;
                ojVar2 = ojVar;
                str2 = null;
            }
            oj ojVar3 = ojVar2;
            pj pjVar2 = new pj();
            pjVar2.f37027b = "..";
            if (arrayList2.size() > 0) {
                File file4 = ((nj) jg.g.i(1, arrayList2)).f36385a;
                if (file4 == null) {
                    file2 = null;
                    pjVar2.f37028c = org.telegram.messenger.id.M0(2131750685, null);
                } else {
                    file2 = null;
                    pjVar2.f37028c = file4.toString();
                }
            } else {
                file2 = null;
                pjVar2.f37028c = org.telegram.messenger.id.M0(2131750685, null);
            }
            pjVar2.f37026a = 2131231070;
            pjVar2.f37030f = file2;
            arrayList3.add(0, pjVar2);
            if (this.O != null) {
                Collections.sort(ojVar3.f36728e, new ij(this, 0));
            }
            a0();
            org.telegram.messenger.g0.y(kjVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            ojVar3.f();
            this.E.h1(0, topForScroll);
            return true;
        } catch (Exception e10) {
            W(e10.getLocalizedMessage());
            return false;
        }
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vj.S():void");
    }

    public final boolean T(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vj.T(android.view.View, java.lang.Object):boolean");
    }

    public final void U() {
        View m10;
        oj ojVar = this.f39116x;
        ojVar.f36729f.clear();
        ArrayList arrayList = ojVar.f36729f;
        oj ojVar2 = this.f39115w;
        arrayList.addAll(ojVar2.f36729f);
        ArrayList arrayList2 = ojVar.f36728e;
        arrayList2.clear();
        arrayList2.addAll(ojVar2.f36728e);
        ArrayList arrayList3 = (ArrayList) ojVar.h;
        arrayList3.clear();
        arrayList3.addAll((ArrayList) ojVar2.h);
        ojVar.f();
        kj kjVar = this.f39114s;
        kjVar.setVisibility(0);
        kj kjVar2 = this.f39113r;
        kjVar.setPadding(kjVar2.getPaddingLeft(), kjVar2.getPaddingTop(), kjVar2.getPaddingRight(), kjVar2.getPaddingBottom());
        kg.c0 c0Var = this.E;
        int L0 = c0Var.L0();
        if (L0 >= 0 && (m10 = c0Var.m(L0)) != null) {
            this.f39117y.h1(L0, m10.getTop() - kjVar.getPaddingTop());
        }
    }

    public final void V(int i7) {
        kj kjVar;
        float L;
        ValueAnimator valueAnimator = this.f39111f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f39112n = i7;
        int i10 = 0;
        while (true) {
            int childCount = getChildCount();
            kjVar = this.f39113r;
            if (i10 < childCount) {
                if (getChildAt(i10) == kjVar) {
                    break;
                }
                i10++;
            } else {
                i10 = 0;
                break;
            }
        }
        kj kjVar2 = this.f39114s;
        if (i7 == 1) {
            L = org.telegram.messenger.g0.L(150.0f);
            kjVar2.setAlpha(1.0f);
            kjVar2.setScaleX(1.0f);
            kjVar2.setScaleY(1.0f);
            kjVar2.setTranslationX(0.0f);
            removeView(kjVar2);
            addView(kjVar2, i10);
            kjVar2.setVisibility(0);
            kjVar.setTranslationX(L);
            kjVar.setAlpha(0.0f);
            this.f39111f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            L = org.telegram.messenger.g0.L(150.0f);
            kjVar.setAlpha(0.0f);
            kjVar.setScaleX(0.95f);
            kjVar.setScaleY(0.95f);
            kjVar2.setScaleX(1.0f);
            kjVar2.setScaleY(1.0f);
            kjVar2.setTranslationX(0.0f);
            kjVar2.setAlpha(1.0f);
            removeView(kjVar2);
            addView(kjVar2, i10 + 1);
            kjVar2.setVisibility(0);
            this.f39111f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f39111f0.addUpdateListener(new hj(this, i7, L, 0));
        this.f39111f0.addListener(new z5(this, 11));
        if (i7 == 1) {
            this.f39111f0.setDuration(220L);
        } else {
            this.f39111f0.setDuration(200L);
        }
        this.f39111f0.setInterpolator(xq.f40458f);
        this.f39111f0.start();
    }

    public final void W(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f39070a);
        String M0 = org.telegram.messenger.id.M0(2131689472, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = M0;
        u1Var.T = str;
        jg.g.C(null, 2131747831, alertDialog$Builder, null);
    }

    public final void X() {
        v4.g0 adapter = this.f39113r.getAdapter();
        int i7 = 0;
        boolean z9 = true;
        uj ujVar = this.D;
        if (adapter != ujVar ? this.f39115w.b() != 1 : !ujVar.f38731s.isEmpty() || !ujVar.P.isEmpty()) {
            z9 = false;
        }
        if (!z9) {
            i7 = 8;
        }
        this.L.setVisibility(i7);
        Z();
    }

    public final void Z() {
        View childAt;
        di.g5 g5Var = this.L;
        if (g5Var.getVisibility() != 0 || (childAt = this.f39113r.getChildAt(0)) == null) {
            return;
        }
        float translationY = g5Var.getTranslationY();
        this.M = (childAt.getTop() + (g5Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        g5Var.setTranslationY(translationY);
    }

    public final void a0() {
        int i7;
        org.telegram.ui.ActionBar.r0 r0Var = this.F;
        if (r0Var != null && !r0Var.v()) {
            if (!this.N && !this.f39115w.f36729f.isEmpty()) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            r0Var.setVisibility(i7);
        }
    }

    @Override
    public final void d() {
        org.telegram.ui.ActionBar.r0 r0Var = this.F;
        if (r0Var != null) {
            try {
                if (r0Var.getSearchField() != null) {
                    r0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27973j5, this.f39070a));
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
        kj kjVar = this.f39113r;
        if (kjVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i7 = 0;
        View childAt = kjVar.getChildAt(0);
        yi0 yi0Var = (yi0) kjVar.G(childAt);
        int y10 = ((((int) childAt.getY()) - org.telegram.messenger.g0.f22557m) - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(8.0f);
        if (y10 > 0 && yi0Var != null && yi0Var.b() == 0) {
            i7 = y10;
        }
        if (y10 < 0 || yi0Var == null || yi0Var.b() != 0) {
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
        return this.f39113r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.u6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.u6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.F.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27973j5));
        int i7 = org.telegram.ui.ActionBar.l6.A5;
        kj kjVar = this.f39113r;
        arrayList.add(new org.telegram.ui.ActionBar.u6(kjVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(kjVar, 32, new Class[]{org.telegram.ui.Cells.y6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27829b7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(kjVar, 48, new Class[]{org.telegram.ui.Cells.y6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27809a7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(kjVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27957i6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(kjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.l6.f27988k0, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27866d7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(kjVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(kjVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"dateTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(kjVar, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(kjVar, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27995k7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(kjVar, 8, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.u6(kjVar, 40, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.oj));
        arrayList.add(new org.telegram.ui.ActionBar.u6(kjVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"extTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.pj));
        return arrayList;
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final boolean k() {
        oj ojVar = this.f39115w;
        if (ojVar.f36729f.size() <= 0) {
            return false;
        }
        U();
        nj njVar = (nj) org.telegram.ui.Cells.f1.k(1, ojVar.f36729f);
        this.f39071b.R2.setTitle(njVar.f36386b);
        int topForScroll = getTopForScroll();
        File file = njVar.f36385a;
        if (file != null) {
            R(file);
        } else {
            S();
        }
        a0();
        this.E.h1(0, topForScroll);
        V(2);
        return true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        Z();
    }

    @Override
    public final void p() {
        try {
            if (this.P) {
                org.telegram.messenger.t0.f25566b.unregisterReceiver(this.f39110e0);
                this.P = false;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.f39071b.R2.m(true);
        org.telegram.ui.ActionBar.y r10 = this.f39071b.R2.r();
        r10.removeView(this.G);
        r10.removeView(this.F);
    }

    public void setCanSelectOnlyImageFiles(boolean z9) {
        this.W = z9;
    }

    public void setDelegate(mj mjVar) {
        this.Q = mjVar;
    }

    public void setMaxSelectedFiles(int i7) {
        this.V = i7;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f39071b.f28624b.invalidate();
    }

    @Override
    public final void u() {
        this.G.setVisibility(8);
        this.F.setVisibility(8);
    }

    @Override
    public final void w(int i7) {
        int i10;
        if (i7 == 6) {
            org.telegram.messenger.iz.M0 = !org.telegram.messenger.iz.M0;
            SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
            edit.putBoolean("sortFilesByName", org.telegram.messenger.iz.M0);
            edit.apply();
            this.f39108c0 = org.telegram.messenger.iz.M0;
            oj ojVar = this.f39115w;
            Collections.sort((ArrayList) ojVar.h, new ij(this, 1));
            if (this.O != null) {
                Collections.sort(ojVar.f36728e, new ij(this, 0));
            }
            ojVar.f();
            if (this.f39108c0) {
                i10 = 2131232102;
            } else {
                i10 = 2131232101;
            }
            this.G.setIcon(i10);
        }
    }
}
