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
public final class uj extends uh {
    public static final int f38690g0 = 0;
    public final tj D;
    public final kg.c0 E;
    public final org.telegram.ui.ActionBar.r0 F;
    public final org.telegram.ui.ActionBar.r0 G;
    public final jg.q0 H;
    public AnimatorSet I;
    public final lz J;
    public boolean K;
    public final di.g5 L;
    public float M;
    public boolean N;
    public File O;
    public boolean P;
    public lj Q;
    public final HashMap R;
    public final ArrayList S;
    public final HashMap T;
    public boolean U;
    public int V;
    public boolean W;
    public final boolean f38691a0;
    public boolean f38692b0;
    public boolean f38693c0;
    public boolean f38694d0;
    public final androidx.mediarouter.app.f f38695e0;
    public ValueAnimator f38696f0;
    public int f38697n;
    public final jj f38698r;
    public final jj f38699s;
    public final nj f38700w;
    public final nj f38701x;
    public final ly f38702y;

    public uj(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, ci ciVar) {
        super(context, h6Var, ciVar);
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
        this.f38695e0 = new androidx.mediarouter.app.f(this, 8);
        nj njVar = new nj(this, context);
        this.f38700w = njVar;
        if (i7 == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f38691a0 = z9;
        int i11 = 2;
        if (i7 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38694d0 = z10;
        this.f38693c0 = org.telegram.messenger.iz.M0;
        try {
            if (z10) {
                try {
                    Cursor query = org.telegram.messenger.t0.f25570b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j3 = query.getLong(i11);
                            long j10 = query.getLong(3);
                            String string = query.getString(4);
                            cursor = query;
                            if (j3 <= org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).f24827k4 * 1000) {
                                try {
                                    if (j10 <= org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).f24835l4 && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        oj ojVar = new oj();
                                        ojVar.f36621b = file.getName();
                                        ojVar.f36624f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        ojVar.d = str;
                                        ojVar.f36622c = org.telegram.messenger.g0.i0(file.length(), false, false);
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            ojVar.f36623e = file.getAbsolutePath();
                                        }
                                        ((ArrayList) this.f38700w.h).add(ojVar);
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
                Collections.sort((ArrayList) njVar.h, new hj(this, 1));
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        this.f38692b0 = false;
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
                org.telegram.messenger.t0.f25570b.registerReceiver(this.f38695e0, intentFilter, 4);
            } else {
                org.telegram.messenger.t0.f25570b.registerReceiver(this.f38695e0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.y s5 = this.f38656b.U2.s();
        org.telegram.ui.ActionBar.r0 a10 = s5.a(0, 2131232486);
        a10.N();
        a10.H = new kg.v1(this, 6);
        this.F = a10;
        a10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        a10.setContentDescription(org.telegram.messenger.id.M0(2131745836, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i12 = org.telegram.ui.ActionBar.m6.f27998j5;
        org.telegram.ui.ActionBar.t6.U(searchField, i12, h6Var);
        org.telegram.ui.ActionBar.t6.v(searchField, i12, h6Var);
        org.telegram.ui.ActionBar.t6.D(searchField, org.telegram.ui.ActionBar.m6.Je, h6Var);
        if (this.f38693c0) {
            i10 = 2131232102;
        } else {
            i10 = 2131232101;
        }
        org.telegram.ui.ActionBar.r0 a11 = s5.a(6, i10);
        this.G = a11;
        a11.setContentDescription(org.telegram.messenger.id.M0(2131754891, null));
        lz lzVar = new lz(context, h6Var);
        this.J = lzVar;
        addView(lzVar);
        di.g5 g5Var = new di.g5(this, context, lzVar, h6Var);
        this.L = g5Var;
        addView(g5Var, c8.ha.c(-1.0f, -1));
        g5Var.setVisibility(8);
        g5Var.setOnTouchListener(new ei.b(14));
        jj jjVar = new jj(this, context, h6Var, 0);
        this.f38699s = jjVar;
        jjVar.setSectionsType(2);
        jjVar.setVerticalScrollBarEnabled(false);
        ly lyVar = new ly(org.telegram.messenger.g0.L(56.0f), 0, jjVar);
        this.f38702y = lyVar;
        jjVar.setLayoutManager(lyVar);
        jjVar.setClipToPadding(false);
        nj njVar2 = new nj(this, context);
        this.f38701x = njVar2;
        jjVar.setAdapter(njVar2);
        addView(jjVar, c8.ha.c(-1.0f, -1));
        jjVar.setVisibility(8);
        jj jjVar2 = new jj(this, context, h6Var, 1);
        this.f38698r = jjVar2;
        jjVar2.r1();
        setBlur3Capture(jjVar2);
        this.d = jjVar2;
        this.h = true;
        this.f38659f = true;
        jjVar2.setSectionsType(2);
        jjVar2.setVerticalScrollBarEnabled(false);
        kg.c0 c0Var = new kg.c0(this, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f22561m, jjVar2, 2);
        this.E = c0Var;
        jjVar2.setLayoutManager(c0Var);
        jjVar2.setClipToPadding(false);
        jjVar2.setAdapter(this.f38700w);
        addView(jjVar2, c8.ha.c(-1.0f, -1));
        this.D = new tj(this, context);
        jjVar2.setOnScrollListener(new ti(this, 1));
        jjVar2.setOnItemClickListener(new bj0(this) {
            public final uj f33555b;

            {
                this.f33555b = this;
            }

            @Override
            public final void c(int i13, View view) {
                jg.o0 o0Var;
                switch (r2) {
                    case 0:
                        uj.O(this.f33555b, view, i13);
                        return;
                    default:
                        uj ujVar = this.f33555b;
                        jg.q0 q0Var = ujVar.H;
                        q0Var.I0(true);
                        tj tjVar = ujVar.D;
                        ArrayList arrayList = q0Var.f16891e3;
                        if (arrayList.isEmpty()) {
                            o0Var = jg.q0.j3[i13];
                        } else {
                            o0Var = (jg.o0) arrayList.get(i13);
                        }
                        ci ciVar2 = tjVar.X.f38656b;
                        ArrayList arrayList2 = tjVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (o0Var.b((jg.o0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        ciVar2.U2.setSearchFilter(o0Var);
                        ciVar2.U2.setSearchFieldText("");
                        tjVar.a0(null, null, true);
                        return;
                }
            }
        });
        jjVar2.setOnItemLongClickListener(new t(this, 20));
        jg.q0 q0Var = new jg.q0(context, h6Var);
        this.H = q0Var;
        q0Var.setOnItemClickListener(new bj0(this) {
            public final uj f33555b;

            {
                this.f33555b = this;
            }

            @Override
            public final void c(int i13, View view) {
                jg.o0 o0Var;
                switch (r2) {
                    case 0:
                        uj.O(this.f33555b, view, i13);
                        return;
                    default:
                        uj ujVar = this.f33555b;
                        jg.q0 q0Var2 = ujVar.H;
                        q0Var2.I0(true);
                        tj tjVar = ujVar.D;
                        ArrayList arrayList = q0Var2.f16891e3;
                        if (arrayList.isEmpty()) {
                            o0Var = jg.q0.j3[i13];
                        } else {
                            o0Var = (jg.o0) arrayList.get(i13);
                        }
                        ci ciVar2 = tjVar.X.f38656b;
                        ArrayList arrayList2 = tjVar.R;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (o0Var.b((jg.o0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        ciVar2.U2.setSearchFilter(o0Var);
                        ciVar2.U2.setSearchFieldText("");
                        tjVar.a0(null, null, true);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27963h5, q0Var, h6Var);
        addView(q0Var, c8.ha.e(-1, 44, 48));
        q0Var.setTranslationY(-org.telegram.messenger.g0.L(44.0f));
        q0Var.setVisibility(4);
        S();
        a0();
        X();
    }

    public static void O(uj ujVar, View view, int i7) {
        Object O;
        boolean z9;
        boolean z10;
        int i10;
        ci ciVar = ujVar.f38656b;
        jj jjVar = ujVar.f38698r;
        v4.g0 adapter = jjVar.getAdapter();
        nj njVar = ujVar.f38700w;
        if (adapter == njVar) {
            O = njVar.E(i7);
        } else {
            tj tjVar = ujVar.D;
            O = tjVar.O(tjVar.S(i7), tjVar.Q(i7));
        }
        if (O instanceof oj) {
            oj ojVar = (oj) O;
            File file = ojVar.f36624f;
            if (Build.VERSION.SDK_INT >= 30) {
                z9 = Environment.isExternalStorageManager();
            } else {
                z9 = false;
            }
            org.telegram.ui.cn cnVar = null;
            if (!org.telegram.messenger.r2.f25217b && (((i10 = ojVar.f36620a) == 2131231074 || i10 == 2131231072) && !z9)) {
                ph phVar = ciVar.f32634o3;
                int i11 = ciVar.G3;
                if (ciVar.E3 != null && ciVar.E1 - ciVar.F1 < 0) {
                    if (!org.telegram.messenger.qp.s1(i11).D3() && org.telegram.messenger.qp.s1(i11).U4 > ciVar.F1) {
                        new gc(phVar, ciVar.I0).f(org.telegram.messenger.qp.s1(i11).U4, new pg(ciVar, 3)).j();
                        return;
                    } else {
                        new gc(phVar, ciVar.I0).t(org.telegram.messenger.id.M0(2131744041, null), ciVar.I0).j();
                        return;
                    }
                }
                ujVar.Q.A();
                return;
            } else if (file == null) {
                int i12 = ojVar.f36620a;
                if (i12 == 2131231071) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
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
                    org.telegram.ui.an0 an0Var = new org.telegram.ui.an0(0, weVar, hashMap, arrayList, 0, z10, cnVar2, false);
                    an0Var.f43764l0 = true;
                    an0Var.f43773s0 = new h6.m(ujVar, hashMap, arrayList, false, 25);
                    an0Var.k0(ujVar.V, false);
                    org.telegram.ui.ActionBar.f2 f2Var2 = ciVar.Z1;
                    if (f2Var2 != null) {
                        f2Var2.presentFragment(an0Var);
                    } else {
                        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            Q.presentFragment(an0Var);
                        }
                    }
                    ciVar.a(true);
                    return;
                } else if (i12 == 2131231073) {
                    lj ljVar = ujVar.Q;
                    if (ljVar != null) {
                        ljVar.S();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = ujVar.getTopForScroll();
                    ujVar.U();
                    mj mjVar = (mj) org.telegram.ui.Cells.f1.k(1, njVar.f36319f);
                    ciVar.U2.setTitle(mjVar.f35983b);
                    File file2 = mjVar.f35982a;
                    if (file2 != null) {
                        ujVar.R(file2);
                    } else {
                        ujVar.S();
                    }
                    ujVar.a0();
                    ujVar.E.h1(0, topForScroll);
                    ujVar.V(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = jjVar.getChildAt(0);
                v4.d1 G = jjVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f35982a = ujVar.O;
                    obj.f35983b = ciVar.U2.getTitle();
                    ujVar.U();
                    njVar.f36319f.add(obj);
                    if (!ujVar.R(file)) {
                        njVar.f36319f.remove((Object) obj);
                        return;
                    }
                    ujVar.V(1);
                    ciVar.U2.setTitle(ojVar.f36621b);
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
        jj jjVar = this.f38698r;
        View childAt = jjVar.getChildAt(0);
        v4.d1 G = jjVar.G(childAt);
        int i7 = -jjVar.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i7;
        }
        return i7;
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uj.B(int, int):void");
    }

    @Override
    public final void C() {
        nj njVar = this.f38700w;
        if (njVar != null) {
            njVar.f();
        }
        tj tjVar = this.D;
        if (tjVar != null) {
            tjVar.f();
        }
    }

    @Override
    public final void H(uh uhVar) {
        this.R.clear();
        this.T.clear();
        this.D.R.clear();
        this.S.clear();
        this.f38700w.f36319f.clear();
        S();
        a0();
        X();
        this.f38656b.U2.setTitle(org.telegram.messenger.id.M0(2131745657, null));
        this.G.setVisibility(0);
        this.E.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f38698r.y0(0);
    }

    @Override
    public final boolean L(final boolean z9, final int i7, int i10, final long j3, final boolean z10) {
        int size = this.R.size();
        HashMap hashMap = this.T;
        if ((size == 0 && hashMap.size() == 0) || this.Q == null || this.K) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (org.telegram.ui.uz uzVar : hashMap.keySet()) {
            arrayList.add((org.telegram.messenger.ij) hashMap.get(uzVar));
        }
        final ArrayList arrayList2 = new ArrayList(this.S);
        ci ciVar = this.f38656b;
        CharSequence[] charSequenceArr = {ciVar.a1().getText()};
        final ArrayList W = org.telegram.messenger.ui.b0(ciVar.G3).W(charSequenceArr, true, true);
        final String charSequence = charSequenceArr[0].toString();
        return u4.Y(ciVar.G3, ciVar.b1(), ciVar.X0() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new org.telegram.messenger.c20() {
            @Override
            public final void a(Object obj) {
                uj ujVar = uj.this;
                ujVar.K = true;
                ujVar.Q.n(arrayList2, charSequence, W, arrayList, z9, i7, j3, z10, ((Long) obj).longValue());
                ujVar.f38656b.a(true);
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
                    oj ojVar = new oj();
                    ojVar.f36621b = file2.getName();
                    ojVar.f36624f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    ojVar.d = str;
                    ojVar.f36622c = org.telegram.messenger.g0.i0(file2.length(), false, false);
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        ojVar.f36623e = file2.getAbsolutePath();
                    }
                    ((ArrayList) this.f38700w.h).add(ojVar);
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
        if (file.length() != 0 && str != null && yf.d.f59419i.contains(str)) {
            if (file.length() > org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).f24835l4) {
                new gc(this.f38656b.f28675c, null).u(org.telegram.messenger.id.a0("TooLargeError", null, 2131744042, new Object[0]), org.telegram.messenger.id.a0("ErrorRingtoneSizeTooBig", null, 2131751102, Integer.valueOf(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).f24835l4 / 1024)), null).j();
                return false;
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(org.telegram.messenger.t0.f25570b, Uri.fromFile(file));
                i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                i7 = Integer.MAX_VALUE;
            }
            if (i7 <= org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).f24827k4 * 1000) {
                return true;
            }
            new gc(this.f38656b.f28675c, null).u(org.telegram.messenger.id.a0("TooLongError", null, 2131744041, new Object[0]), org.telegram.messenger.id.a0("ErrorRingtoneDurationTooLong", null, 2131751104, Integer.valueOf(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).f24827k4)), null).j();
            return false;
        }
        new gc(this.f38656b.f28675c, null).u(org.telegram.messenger.id.a0("InvalidFormatError", null, 2131749181, new Object[0]), org.telegram.messenger.id.M0(2131751103, null), null).j();
        return false;
    }

    public final boolean R(File file) {
        File file2;
        String str;
        nj njVar;
        this.N = false;
        boolean canRead = file.canRead();
        jj jjVar = this.f38698r;
        String str2 = null;
        nj njVar2 = this.f38700w;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.O = file;
                njVar2.f36318e.clear();
                Environment.getExternalStorageState();
                org.telegram.messenger.g0.y(jjVar);
                this.U = true;
                njVar2.f();
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
            ArrayList arrayList = njVar2.f36318e;
            ArrayList arrayList2 = njVar2.f36319f;
            ArrayList arrayList3 = njVar2.f36318e;
            arrayList.clear();
            File j3 = org.telegram.messenger.w7.j(6);
            int i7 = 0;
            while (i7 < listFiles.length) {
                File file3 = listFiles[i7];
                if (file3.getName().indexOf(46) == 0 || file3.equals(j3)) {
                    njVar = njVar2;
                } else {
                    oj ojVar = new oj();
                    ojVar.f36621b = file3.getName();
                    ojVar.f36624f = file3;
                    if (file3.isDirectory()) {
                        ojVar.f36620a = 2131231070;
                        ojVar.f36622c = org.telegram.messenger.id.M0(2131750685, str2);
                        njVar = njVar2;
                    } else {
                        this.N = true;
                        String name = file3.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        ojVar.d = str;
                        njVar = njVar2;
                        ojVar.f36622c = org.telegram.messenger.g0.i0(file3.length(), false, false);
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            ojVar.f36623e = file3.getAbsolutePath();
                        }
                    }
                    arrayList3.add(ojVar);
                }
                i7++;
                njVar2 = njVar;
                str2 = null;
            }
            nj njVar3 = njVar2;
            oj ojVar2 = new oj();
            ojVar2.f36621b = "..";
            if (arrayList2.size() > 0) {
                File file4 = ((mj) jg.g.i(1, arrayList2)).f35982a;
                if (file4 == null) {
                    file2 = null;
                    ojVar2.f36622c = org.telegram.messenger.id.M0(2131750685, null);
                } else {
                    file2 = null;
                    ojVar2.f36622c = file4.toString();
                }
            } else {
                file2 = null;
                ojVar2.f36622c = org.telegram.messenger.id.M0(2131750685, null);
            }
            ojVar2.f36620a = 2131231070;
            ojVar2.f36624f = file2;
            arrayList3.add(0, ojVar2);
            if (this.O != null) {
                Collections.sort(njVar3.f36318e, new hj(this, 0));
            }
            a0();
            org.telegram.messenger.g0.y(jjVar);
            this.U = true;
            int topForScroll = getTopForScroll();
            njVar3.f();
            this.E.h1(0, topForScroll);
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
        nj njVar = this.f38701x;
        njVar.f36319f.clear();
        ArrayList arrayList = njVar.f36319f;
        nj njVar2 = this.f38700w;
        arrayList.addAll(njVar2.f36319f);
        ArrayList arrayList2 = njVar.f36318e;
        arrayList2.clear();
        arrayList2.addAll(njVar2.f36318e);
        ArrayList arrayList3 = (ArrayList) njVar.h;
        arrayList3.clear();
        arrayList3.addAll((ArrayList) njVar2.h);
        njVar.f();
        jj jjVar = this.f38699s;
        jjVar.setVisibility(0);
        jj jjVar2 = this.f38698r;
        jjVar.setPadding(jjVar2.getPaddingLeft(), jjVar2.getPaddingTop(), jjVar2.getPaddingRight(), jjVar2.getPaddingBottom());
        kg.c0 c0Var = this.E;
        int L0 = c0Var.L0();
        if (L0 >= 0 && (m10 = c0Var.m(L0)) != null) {
            this.f38702y.h1(L0, m10.getTop() - jjVar.getPaddingTop());
        }
    }

    public final void V(int i7) {
        jj jjVar;
        float L;
        ValueAnimator valueAnimator = this.f38696f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f38697n = i7;
        int i10 = 0;
        while (true) {
            int childCount = getChildCount();
            jjVar = this.f38698r;
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
        jj jjVar2 = this.f38699s;
        if (i7 == 1) {
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
            this.f38696f0 = ValueAnimator.ofFloat(1.0f, 0.0f);
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
            this.f38696f0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f38696f0.addUpdateListener(new gj(this, i7, L, 0));
        this.f38696f0.addListener(new y5(this, 11));
        if (i7 == 1) {
            this.f38696f0.setDuration(220L);
        } else {
            this.f38696f0.setDuration(200L);
        }
        this.f38696f0.setInterpolator(wq.f40046f);
        this.f38696f0.start();
    }

    public final void W(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f38655a);
        String M0 = org.telegram.messenger.id.M0(2131689472, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.R = M0;
        u1Var.T = str;
        jg.g.C(null, 2131747831, alertDialog$Builder, null);
    }

    public final void X() {
        v4.g0 adapter = this.f38698r.getAdapter();
        int i7 = 0;
        boolean z9 = true;
        tj tjVar = this.D;
        if (adapter != tjVar ? this.f38700w.b() != 1 : !tjVar.f38319s.isEmpty() || !tjVar.P.isEmpty()) {
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
        if (g5Var.getVisibility() != 0 || (childAt = this.f38698r.getChildAt(0)) == null) {
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
            if (!this.N && !this.f38700w.f36319f.isEmpty()) {
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
                    r0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27998j5, this.f38655a));
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
        jj jjVar = this.f38698r;
        if (jjVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i7 = 0;
        View childAt = jjVar.getChildAt(0);
        xi0 xi0Var = (xi0) jjVar.G(childAt);
        int y10 = ((((int) childAt.getY()) - org.telegram.messenger.g0.f22561m) - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(8.0f);
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
        return this.f38698r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.T.size() + this.R.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.v6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.v6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.F.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27998j5));
        int i7 = org.telegram.ui.ActionBar.m6.A5;
        jj jjVar = this.f38698r;
        arrayList.add(new org.telegram.ui.ActionBar.v6(jjVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(jjVar, 32, new Class[]{org.telegram.ui.Cells.y6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27854b7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(jjVar, 48, new Class[]{org.telegram.ui.Cells.y6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27834a7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(jjVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27982i6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(jjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.m6.f28013k0, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27891d7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(jjVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(jjVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"dateTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(jjVar, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(jjVar, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28020k7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(jjVar, 8, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(jjVar, 40, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.oj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(jjVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"extTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.pj));
        return arrayList;
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final boolean k() {
        nj njVar = this.f38700w;
        if (njVar.f36319f.size() <= 0) {
            return false;
        }
        U();
        mj mjVar = (mj) org.telegram.ui.Cells.f1.k(1, njVar.f36319f);
        this.f38656b.U2.setTitle(mjVar.f35983b);
        int topForScroll = getTopForScroll();
        File file = mjVar.f35982a;
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
                org.telegram.messenger.t0.f25570b.unregisterReceiver(this.f38695e0);
                this.P = false;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.f38656b.U2.n(true);
        org.telegram.ui.ActionBar.y s5 = this.f38656b.U2.s();
        s5.removeView(this.G);
        s5.removeView(this.F);
    }

    public void setCanSelectOnlyImageFiles(boolean z9) {
        this.W = z9;
    }

    public void setDelegate(lj ljVar) {
        this.Q = ljVar;
    }

    public void setMaxSelectedFiles(int i7) {
        this.V = i7;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38656b.f28672b.invalidate();
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
            this.f38693c0 = org.telegram.messenger.iz.M0;
            nj njVar = this.f38700w;
            Collections.sort((ArrayList) njVar.h, new hj(this, 1));
            if (this.O != null) {
                Collections.sort(njVar.f36318e, new hj(this, 0));
            }
            njVar.f();
            if (this.f38693c0) {
                i10 = 2131232102;
            } else {
                i10 = 2131232101;
            }
            this.G.setIcon(i10);
        }
    }
}
