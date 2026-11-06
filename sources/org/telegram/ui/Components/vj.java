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
    public static final int f38959g0 = 0;
    public final uj D;
    public final kg.c0 E;
    public final org.telegram.ui.ActionBar.r0 F;
    public final org.telegram.ui.ActionBar.r0 G;
    public final jg.q0 H;
    public AnimatorSet I;
    public final lz J;
    public boolean K;
    public final di.f5 L;
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
    public final boolean f38960a0;
    public boolean f38961b0;
    public boolean f38962c0;
    public boolean f38963d0;
    public final androidx.mediarouter.app.f f38964e0;
    public ValueAnimator f38965f0;
    public int f38966n;
    public final kj f38967r;
    public final kj f38968s;
    public final oj f38969w;
    public final oj f38970x;
    public final ly f38971y;

    public vj(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, di diVar) {
        super(context, f6Var, diVar);
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
        this.f38964e0 = new androidx.mediarouter.app.f(this, 8);
        oj ojVar = new oj(this, context);
        this.f38969w = ojVar;
        if (i7 == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f38960a0 = z9;
        int i11 = 2;
        if (i7 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38963d0 = z10;
        this.f38962c0 = org.telegram.messenger.iz.M0;
        try {
            if (z10) {
                try {
                    Cursor query = org.telegram.messenger.t0.f25555b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j3 = query.getLong(i11);
                            long j10 = query.getLong(3);
                            String string = query.getString(4);
                            cursor = query;
                            if (j3 <= org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).f24808k4 * 1000) {
                                try {
                                    if (j10 <= org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).f24816l4 && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        pj pjVar = new pj();
                                        pjVar.f37028b = file.getName();
                                        pjVar.f37031f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        pjVar.d = str;
                                        pjVar.f37029c = org.telegram.messenger.g0.i0(file.length(), false, false);
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            pjVar.f37030e = file.getAbsolutePath();
                                        }
                                        ((ArrayList) this.f38969w.h).add(pjVar);
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
        this.f38961b0 = false;
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
                org.telegram.messenger.t0.f25555b.registerReceiver(this.f38964e0, intentFilter, 4);
            } else {
                org.telegram.messenger.t0.f25555b.registerReceiver(this.f38964e0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.y q10 = this.f38951b.R2.q();
        org.telegram.ui.ActionBar.r0 a10 = q10.a(0, 2131232486);
        a10.N();
        a10.H = new kg.v1(this, 6);
        this.F = a10;
        a10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745837, null));
        a10.setContentDescription(org.telegram.messenger.hd.M0(2131745837, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i12 = org.telegram.ui.ActionBar.k6.f27956j5;
        org.telegram.ui.ActionBar.r6.V(searchField, i12, f6Var);
        org.telegram.ui.ActionBar.r6.w(searchField, i12, f6Var);
        org.telegram.ui.ActionBar.r6.E(searchField, org.telegram.ui.ActionBar.k6.Je, f6Var);
        if (this.f38962c0) {
            i10 = 2131232102;
        } else {
            i10 = 2131232101;
        }
        org.telegram.ui.ActionBar.r0 a11 = q10.a(6, i10);
        this.G = a11;
        a11.setContentDescription(org.telegram.messenger.hd.M0(2131754891, null));
        lz lzVar = new lz(context, f6Var);
        this.J = lzVar;
        addView(lzVar);
        di.f5 f5Var = new di.f5(this, context, lzVar, f6Var);
        this.L = f5Var;
        addView(f5Var, c8.ha.c(-1.0f, -1));
        f5Var.setVisibility(8);
        f5Var.setOnTouchListener(new ei.b(14));
        kj kjVar = new kj(this, context, f6Var, 0);
        this.f38968s = kjVar;
        kjVar.setSectionsType(2);
        kjVar.setVerticalScrollBarEnabled(false);
        ly lyVar = new ly(org.telegram.messenger.g0.L(56.0f), 0, kjVar);
        this.f38971y = lyVar;
        kjVar.setLayoutManager(lyVar);
        kjVar.setClipToPadding(false);
        oj ojVar2 = new oj(this, context);
        this.f38970x = ojVar2;
        kjVar.setAdapter(ojVar2);
        addView(kjVar, c8.ha.c(-1.0f, -1));
        kjVar.setVisibility(8);
        kj kjVar2 = new kj(this, context, f6Var, 1);
        this.f38967r = kjVar2;
        kjVar2.r1();
        setBlur3Capture(kjVar2);
        this.d = kjVar2;
        this.h = true;
        this.f38954f = true;
        kjVar2.setSectionsType(2);
        kjVar2.setVerticalScrollBarEnabled(false);
        kg.c0 c0Var = new kg.c0(this, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f22531m, kjVar2, 2);
        this.E = c0Var;
        kjVar2.setLayoutManager(c0Var);
        kjVar2.setClipToPadding(false);
        kjVar2.setAdapter(this.f38969w);
        addView(kjVar2, c8.ha.c(-1.0f, -1));
        this.D = new uj(this, context);
        kjVar2.setOnScrollListener(new ui(this, 1));
        kjVar2.setOnItemClickListener(new bj0(this) {
            public final vj f33979b;

            {
                this.f33979b = this;
            }

            @Override
            public final void c(int i13, View view) {
                jg.o0 o0Var;
                switch (r2) {
                    case 0:
                        vj.O(this.f33979b, view, i13);
                        return;
                    default:
                        vj vjVar = this.f33979b;
                        jg.q0 q0Var = vjVar.H;
                        q0Var.I0(true);
                        uj ujVar = vjVar.D;
                        ArrayList arrayList = q0Var.f16888e3;
                        if (arrayList.isEmpty()) {
                            o0Var = jg.q0.j3[i13];
                        } else {
                            o0Var = (jg.o0) arrayList.get(i13);
                        }
                        di diVar2 = ujVar.X.f38951b;
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
        jg.q0 q0Var = new jg.q0(context, f6Var);
        this.H = q0Var;
        q0Var.setOnItemClickListener(new bj0(this) {
            public final vj f33979b;

            {
                this.f33979b = this;
            }

            @Override
            public final void c(int i13, View view) {
                jg.o0 o0Var;
                switch (r2) {
                    case 0:
                        vj.O(this.f33979b, view, i13);
                        return;
                    default:
                        vj vjVar = this.f33979b;
                        jg.q0 q0Var2 = vjVar.H;
                        q0Var2.I0(true);
                        uj ujVar = vjVar.D;
                        ArrayList arrayList = q0Var2.f16888e3;
                        if (arrayList.isEmpty()) {
                            o0Var = jg.q0.j3[i13];
                        } else {
                            o0Var = (jg.o0) arrayList.get(i13);
                        }
                        di diVar2 = ujVar.X.f38951b;
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
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27921h5, q0Var, f6Var);
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
        di diVar = vjVar.f38951b;
        kj kjVar = vjVar.f38967r;
        v4.g0 adapter = kjVar.getAdapter();
        oj ojVar = vjVar.f38969w;
        if (adapter == ojVar) {
            O = ojVar.E(i7);
        } else {
            uj ujVar = vjVar.D;
            O = ujVar.O(ujVar.S(i7), ujVar.Q(i7));
        }
        if (O instanceof pj) {
            pj pjVar = (pj) O;
            File file = pjVar.f37031f;
            if (Build.VERSION.SDK_INT >= 30) {
                z9 = Environment.isExternalStorageManager();
            } else {
                z9 = false;
            }
            org.telegram.ui.an anVar = null;
            if (!org.telegram.messenger.r2.f25192b && (((i10 = pjVar.f37027a) == 2131231074 || i10 == 2131231072) && !z9)) {
                qh qhVar = diVar.f32917l3;
                int i11 = diVar.D3;
                if (diVar.B3 != null && diVar.B1 - diVar.C1 < 0) {
                    if (!org.telegram.messenger.qp.s1(i11).D3() && org.telegram.messenger.qp.s1(i11).U4 > diVar.C1) {
                        new hc(qhVar, diVar.I0).f(org.telegram.messenger.qp.s1(i11).U4, new qg(diVar, 3)).j();
                        return;
                    } else {
                        new hc(qhVar, diVar.I0).t(org.telegram.messenger.hd.M0(2131744042, null), diVar.I0).j();
                        return;
                    }
                }
                vjVar.Q.A();
                return;
            } else if (file == null) {
                int i12 = pjVar.f37027a;
                if (i12 == 2131231071) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
                    if (f2Var instanceof org.telegram.ui.an) {
                        anVar = (org.telegram.ui.an) f2Var;
                    }
                    org.telegram.ui.an anVar2 = anVar;
                    org.telegram.messenger.we weVar = MediaController.Z1;
                    if (anVar2 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.xm0 xm0Var = new org.telegram.ui.xm0(0, weVar, hashMap, arrayList, 0, z10, anVar2, false);
                    xm0Var.f51911l0 = true;
                    xm0Var.f51920s0 = new h6.m(vjVar, hashMap, arrayList, false, 25);
                    xm0Var.k0(vjVar.V, false);
                    org.telegram.ui.ActionBar.f2 f2Var2 = diVar.W1;
                    if (f2Var2 != null) {
                        f2Var2.presentFragment(xm0Var);
                    } else {
                        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            Q.presentFragment(xm0Var);
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
                    nj njVar = (nj) org.telegram.ui.Cells.f1.k(1, ojVar.f36735f);
                    diVar.R2.setTitle(njVar.f36425b);
                    File file2 = njVar.f36424a;
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
                    obj.f36424a = vjVar.O;
                    obj.f36425b = diVar.R2.getTitle();
                    vjVar.U();
                    ojVar.f36735f.add(obj);
                    if (!vjVar.R(file)) {
                        ojVar.f36735f.remove((Object) obj);
                        return;
                    }
                    vjVar.V(1);
                    diVar.R2.setTitle(pjVar.f37028b);
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
        kj kjVar = this.f38967r;
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
        oj ojVar = this.f38969w;
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
        this.f38969w.f36735f.clear();
        S();
        a0();
        X();
        this.f38951b.R2.setTitle(org.telegram.messenger.hd.M0(2131745658, null));
        this.G.setVisibility(0);
        this.E.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f38967r.y0(0);
    }

    @Override
    public final boolean L(final boolean z9, final int i7, int i10, final long j3, final boolean z10) {
        int size = this.R.size();
        HashMap hashMap = this.T;
        if ((size == 0 && hashMap.size() == 0) || this.Q == null || this.K) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (org.telegram.ui.rz rzVar : hashMap.keySet()) {
            arrayList.add((org.telegram.messenger.ij) hashMap.get(rzVar));
        }
        final ArrayList arrayList2 = new ArrayList(this.S);
        di diVar = this.f38951b;
        CharSequence[] charSequenceArr = {diVar.a1().getText()};
        final ArrayList W = org.telegram.messenger.ui.b0(diVar.D3).W(charSequenceArr, true, true);
        final String charSequence = charSequenceArr[0].toString();
        return v4.Y(diVar.D3, diVar.b1(), diVar.X0() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new org.telegram.messenger.c20() {
            @Override
            public final void a(Object obj) {
                vj vjVar = vj.this;
                vjVar.K = true;
                vjVar.Q.n(arrayList2, charSequence, W, arrayList, z9, i7, j3, z10, ((Long) obj).longValue());
                vjVar.f38951b.a(true);
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
                    pjVar.f37028b = file2.getName();
                    pjVar.f37031f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    pjVar.d = str;
                    pjVar.f37029c = org.telegram.messenger.g0.i0(file2.length(), false, false);
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        pjVar.f37030e = file2.getAbsolutePath();
                    }
                    ((ArrayList) this.f38969w.h).add(pjVar);
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
        if (file.length() != 0 && str != null && yf.c.f59289i.contains(str)) {
            if (file.length() > org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).f24816l4) {
                new hc(this.f38951b.f28618c, null).u(org.telegram.messenger.hd.a0("TooLargeError", null, 2131744043, new Object[0]), org.telegram.messenger.hd.a0("ErrorRingtoneSizeTooBig", null, 2131751103, Integer.valueOf(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).f24816l4 / 1024)), null).j();
                return false;
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(org.telegram.messenger.t0.f25555b, Uri.fromFile(file));
                i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                i7 = Integer.MAX_VALUE;
            }
            if (i7 <= org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).f24808k4 * 1000) {
                return true;
            }
            new hc(this.f38951b.f28618c, null).u(org.telegram.messenger.hd.a0("TooLongError", null, 2131744042, new Object[0]), org.telegram.messenger.hd.a0("ErrorRingtoneDurationTooLong", null, 2131751105, Integer.valueOf(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).f24808k4)), null).j();
            return false;
        }
        new hc(this.f38951b.f28618c, null).u(org.telegram.messenger.hd.a0("InvalidFormatError", null, 2131749180, new Object[0]), org.telegram.messenger.hd.M0(2131751104, null), null).j();
        return false;
    }

    public final boolean R(File file) {
        File file2;
        String str;
        oj ojVar;
        this.N = false;
        boolean canRead = file.canRead();
        kj kjVar = this.f38967r;
        String str2 = null;
        oj ojVar2 = this.f38969w;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.O = file;
                ojVar2.f36734e.clear();
                Environment.getExternalStorageState();
                org.telegram.messenger.g0.y(kjVar);
                this.U = true;
                ojVar2.f();
                return true;
            }
            W(org.telegram.messenger.hd.M0(2131754711, null));
            return false;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                W(org.telegram.messenger.hd.M0(2131743880, null));
                return false;
            }
            this.O = file;
            ArrayList arrayList = ojVar2.f36734e;
            ArrayList arrayList2 = ojVar2.f36735f;
            ArrayList arrayList3 = ojVar2.f36734e;
            arrayList.clear();
            File j3 = org.telegram.messenger.w7.j(6);
            int i7 = 0;
            while (i7 < listFiles.length) {
                File file3 = listFiles[i7];
                if (file3.getName().indexOf(46) == 0 || file3.equals(j3)) {
                    ojVar = ojVar2;
                } else {
                    pj pjVar = new pj();
                    pjVar.f37028b = file3.getName();
                    pjVar.f37031f = file3;
                    if (file3.isDirectory()) {
                        pjVar.f37027a = 2131231070;
                        pjVar.f37029c = org.telegram.messenger.hd.M0(2131750686, str2);
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
                        pjVar.f37029c = org.telegram.messenger.g0.i0(file3.length(), false, false);
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            pjVar.f37030e = file3.getAbsolutePath();
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
            pjVar2.f37028b = "..";
            if (arrayList2.size() > 0) {
                File file4 = ((nj) jg.g.i(1, arrayList2)).f36424a;
                if (file4 == null) {
                    file2 = null;
                    pjVar2.f37029c = org.telegram.messenger.hd.M0(2131750686, null);
                } else {
                    file2 = null;
                    pjVar2.f37029c = file4.toString();
                }
            } else {
                file2 = null;
                pjVar2.f37029c = org.telegram.messenger.hd.M0(2131750686, null);
            }
            pjVar2.f37027a = 2131231070;
            pjVar2.f37031f = file2;
            arrayList3.add(0, pjVar2);
            if (this.O != null) {
                Collections.sort(ojVar3.f36734e, new ij(this, 0));
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
        oj ojVar = this.f38970x;
        ojVar.f36735f.clear();
        ArrayList arrayList = ojVar.f36735f;
        oj ojVar2 = this.f38969w;
        arrayList.addAll(ojVar2.f36735f);
        ArrayList arrayList2 = ojVar.f36734e;
        arrayList2.clear();
        arrayList2.addAll(ojVar2.f36734e);
        ArrayList arrayList3 = (ArrayList) ojVar.h;
        arrayList3.clear();
        arrayList3.addAll((ArrayList) ojVar2.h);
        ojVar.f();
        kj kjVar = this.f38968s;
        kjVar.setVisibility(0);
        kj kjVar2 = this.f38967r;
        kjVar.setPadding(kjVar2.getPaddingLeft(), kjVar2.getPaddingTop(), kjVar2.getPaddingRight(), kjVar2.getPaddingBottom());
        kg.c0 c0Var = this.E;
        int L0 = c0Var.L0();
        if (L0 >= 0 && (m10 = c0Var.m(L0)) != null) {
            this.f38971y.h1(L0, m10.getTop() - kjVar.getPaddingTop());
        }
    }

    public final void V(int i7) {
        kj kjVar;
        float L;
        ValueAnimator valueAnimator = this.f38965f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f38966n = i7;
        int i10 = 0;
        while (true) {
            int childCount = getChildCount();
            kjVar = this.f38967r;
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
        kj kjVar2 = this.f38968s;
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
            this.f38965f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
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
            this.f38965f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f38965f0.addUpdateListener(new hj(this, i7, L, 0));
        this.f38965f0.addListener(new z5(this, 11));
        if (i7 == 1) {
            this.f38965f0.setDuration(220L);
        } else {
            this.f38965f0.setDuration(200L);
        }
        this.f38965f0.setInterpolator(xq.f40310f);
        this.f38965f0.start();
    }

    public final void W(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f38950a);
        String M0 = org.telegram.messenger.hd.M0(2131689472, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = M0;
        u1Var.T = str;
        jg.g.C(null, 2131747830, alertDialog$Builder, null);
    }

    public final void X() {
        v4.g0 adapter = this.f38967r.getAdapter();
        int i7 = 0;
        boolean z9 = true;
        uj ujVar = this.D;
        if (adapter != ujVar ? this.f38969w.b() != 1 : !ujVar.f38677s.isEmpty() || !ujVar.P.isEmpty()) {
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
        di.f5 f5Var = this.L;
        if (f5Var.getVisibility() != 0 || (childAt = this.f38967r.getChildAt(0)) == null) {
            return;
        }
        float translationY = f5Var.getTranslationY();
        this.M = (childAt.getTop() + (f5Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        f5Var.setTranslationY(translationY);
    }

    public final void a0() {
        int i7;
        org.telegram.ui.ActionBar.r0 r0Var = this.F;
        if (r0Var != null && !r0Var.v()) {
            if (!this.N && !this.f38969w.f36735f.isEmpty()) {
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
                    r0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27956j5, this.f38950a));
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
        kj kjVar = this.f38967r;
        if (kjVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i7 = 0;
        View childAt = kjVar.getChildAt(0);
        xi0 xi0Var = (xi0) kjVar.G(childAt);
        int y10 = ((((int) childAt.getY()) - org.telegram.messenger.g0.f22531m) - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(8.0f);
        if (y10 > 0 && xi0Var != null && xi0Var.b() == 0) {
            i7 = y10;
        }
        if (y10 < 0 || xi0Var == null || xi0Var.b() != 0) {
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
        return this.f38967r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.F.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27956j5));
        int i7 = org.telegram.ui.ActionBar.k6.A5;
        kj kjVar = this.f38967r;
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, 32, new Class[]{org.telegram.ui.Cells.y6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27812b7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, 48, new Class[]{org.telegram.ui.Cells.y6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27792a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27940i6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f27971k0, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27849d7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"dateTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27978k7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, 8, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, 40, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.oj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(kjVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"extTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.pj));
        return arrayList;
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final boolean k() {
        oj ojVar = this.f38969w;
        if (ojVar.f36735f.size() <= 0) {
            return false;
        }
        U();
        nj njVar = (nj) org.telegram.ui.Cells.f1.k(1, ojVar.f36735f);
        this.f38951b.R2.setTitle(njVar.f36425b);
        int topForScroll = getTopForScroll();
        File file = njVar.f36424a;
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
                org.telegram.messenger.t0.f25555b.unregisterReceiver(this.f38964e0);
                this.P = false;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.f38951b.R2.l(true);
        org.telegram.ui.ActionBar.y q10 = this.f38951b.R2.q();
        q10.removeView(this.G);
        q10.removeView(this.F);
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
        this.f38951b.f28615b.invalidate();
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
            this.f38962c0 = org.telegram.messenger.iz.M0;
            oj ojVar = this.f38969w;
            Collections.sort((ArrayList) ojVar.h, new ij(this, 1));
            if (this.O != null) {
                Collections.sort(ojVar.f36734e, new ij(this, 0));
            }
            ojVar.f();
            if (this.f38962c0) {
                i10 = 2131232102;
            } else {
                i10 = 2131232101;
            }
            this.G.setIcon(i10);
        }
    }
}
