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
public final class dk extends ci {
    public static final int f33956h0 = 0;
    public final ck E;
    public final kg.c0 F;
    public final org.telegram.ui.ActionBar.q0 G;
    public final org.telegram.ui.ActionBar.q0 H;
    public final jg.q0 I;
    public AnimatorSet J;
    public final pz K;
    public boolean L;
    public final fi.x4 M;
    public float N;
    public boolean O;
    public File P;
    public boolean Q;
    public tj R;
    public final HashMap S;
    public final ArrayList T;
    public final HashMap U;
    public boolean V;
    public int W;
    public boolean f33957a0;
    public final boolean f33958b0;
    public boolean f33959c0;
    public boolean f33960d0;
    public boolean f33961e0;
    public final androidx.mediarouter.app.f f33962f0;
    public ValueAnimator f33963g0;
    public int f33964n;
    public final rj f33965r;
    public final rj f33966s;
    public final vj f33967w;
    public final vj f33968x;
    public final qy f33969y;

    public dk(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, ki kiVar) {
        super(context, e6Var, kiVar);
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
        this.f33962f0 = new androidx.mediarouter.app.f(this, 8);
        vj vjVar = new vj(this, context);
        this.f33967w = vjVar;
        if (i7 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33958b0 = z10;
        int i11 = 2;
        if (i7 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f33961e0 = z11;
        this.f33960d0 = org.telegram.messenger.gz.M0;
        int i12 = 3;
        try {
            if (z11) {
                try {
                    Cursor query = org.telegram.messenger.t0.f26600b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j3 = query.getLong(i11);
                            long j10 = query.getLong(i12);
                            String string = query.getString(4);
                            cursor = query;
                            if (j3 <= org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).f25327l4 * 1000) {
                                try {
                                    if (j10 <= org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).f25335m4 && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        wj wjVar = new wj();
                                        wjVar.f41363b = file.getName();
                                        wjVar.f41366f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        wjVar.d = str;
                                        wjVar.f41364c = org.telegram.messenger.g0.i0(file.length(), false, false);
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            wjVar.f41365e = file.getAbsolutePath();
                                        }
                                        ((ArrayList) this.f33967w.h).add(wjVar);
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
                            i12 = 3;
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
                Collections.sort((ArrayList) vjVar.h, new pj(this, 1));
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        this.f33959c0 = false;
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
                org.telegram.messenger.t0.f26600b.registerReceiver(this.f33962f0, intentFilter, 4);
            } else {
                org.telegram.messenger.t0.f26600b.registerReceiver(this.f33962f0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.y s5 = this.f33607b.V2.s();
        org.telegram.ui.ActionBar.q0 a10 = s5.a(0, 2131232487);
        a10.O();
        a10.I = new kg.x1(this, 6);
        this.G = a10;
        a10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        a10.setContentDescription(org.telegram.messenger.hd.M0(2131745836, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i13 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.q6.U(searchField, i13, e6Var);
        org.telegram.ui.ActionBar.q6.v(searchField, i13, e6Var);
        org.telegram.ui.ActionBar.q6.D(searchField, org.telegram.ui.ActionBar.j6.Me, e6Var);
        if (this.f33960d0) {
            i10 = 2131232103;
        } else {
            i10 = 2131232102;
        }
        org.telegram.ui.ActionBar.q0 a11 = s5.a(6, i10);
        this.H = a11;
        a11.setContentDescription(org.telegram.messenger.hd.M0(2131754891, null));
        pz pzVar = new pz(context, e6Var);
        this.K = pzVar;
        addView(pzVar);
        fi.x4 x4Var = new fi.x4(this, context, pzVar, e6Var);
        this.M = x4Var;
        addView(x4Var, c8.ja.c(-1.0f, -1));
        x4Var.setVisibility(8);
        x4Var.setOnTouchListener(new gi.a(15));
        rj rjVar = new rj(this, context, e6Var, 0);
        this.f33966s = rjVar;
        rjVar.setSectionsType(2);
        rjVar.setVerticalScrollBarEnabled(false);
        qy qyVar = new qy(org.telegram.messenger.g0.L(56.0f), 0, rjVar);
        this.f33969y = qyVar;
        rjVar.setLayoutManager(qyVar);
        rjVar.setClipToPadding(false);
        vj vjVar2 = new vj(this, context);
        this.f33968x = vjVar2;
        rjVar.setAdapter(vjVar2);
        addView(rjVar, c8.ja.c(-1.0f, -1));
        rjVar.setVisibility(8);
        rj rjVar2 = new rj(this, context, e6Var, 1);
        this.f33965r = rjVar2;
        rjVar2.r1();
        setBlur3Capture(rjVar2);
        this.d = rjVar2;
        this.h = true;
        this.f33610f = true;
        rjVar2.setSectionsType(2);
        rjVar2.setVerticalScrollBarEnabled(false);
        kg.c0 c0Var = new kg.c0(this, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f23603m, rjVar2, 2);
        this.F = c0Var;
        rjVar2.setLayoutManager(c0Var);
        rjVar2.setClipToPadding(false);
        rjVar2.setAdapter(this.f33967w);
        addView(rjVar2, c8.ja.c(-1.0f, -1));
        this.E = new ck(this, context);
        rjVar2.setOnScrollListener(new ri(this, 3));
        rjVar2.setOnItemClickListener(new gj0(this) {
            public final dk f37622b;

            {
                this.f37622b = this;
            }

            @Override
            public final void b(int i14, View view) {
                jg.o0 o0Var;
                switch (r2) {
                    case 0:
                        dk.P(this.f37622b, view, i14);
                        return;
                    default:
                        dk dkVar = this.f37622b;
                        jg.q0 q0Var = dkVar.I;
                        q0Var.I0(true);
                        ck ckVar = dkVar.E;
                        ArrayList arrayList = q0Var.f17244f3;
                        if (arrayList.isEmpty()) {
                            o0Var = jg.q0.f17237k3[i14];
                        } else {
                            o0Var = (jg.o0) arrayList.get(i14);
                        }
                        ki kiVar2 = ckVar.Y.f33607b;
                        ArrayList arrayList2 = ckVar.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                                if (o0Var.b((jg.o0) arrayList2.get(i15))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        kiVar2.V2.setSearchFilter(o0Var);
                        kiVar2.V2.setSearchFieldText("");
                        ckVar.a0(null, null, true);
                        return;
                }
            }
        });
        rjVar2.setOnItemLongClickListener(new s(this, 20));
        jg.q0 q0Var = new jg.q0(context, e6Var);
        this.I = q0Var;
        q0Var.setOnItemClickListener(new gj0(this) {
            public final dk f37622b;

            {
                this.f37622b = this;
            }

            @Override
            public final void b(int i14, View view) {
                jg.o0 o0Var;
                switch (r2) {
                    case 0:
                        dk.P(this.f37622b, view, i14);
                        return;
                    default:
                        dk dkVar = this.f37622b;
                        jg.q0 q0Var2 = dkVar.I;
                        q0Var2.I0(true);
                        ck ckVar = dkVar.E;
                        ArrayList arrayList = q0Var2.f17244f3;
                        if (arrayList.isEmpty()) {
                            o0Var = jg.q0.f17237k3[i14];
                        } else {
                            o0Var = (jg.o0) arrayList.get(i14);
                        }
                        ki kiVar2 = ckVar.Y.f33607b;
                        ArrayList arrayList2 = ckVar.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                                if (o0Var.b((jg.o0) arrayList2.get(i15))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        kiVar2.V2.setSearchFilter(o0Var);
                        kiVar2.V2.setSearchFieldText("");
                        ckVar.a0(null, null, true);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28922h5, q0Var, e6Var);
        addView(q0Var, c8.ja.e(-1, 44, 48));
        q0Var.setTranslationY(-org.telegram.messenger.g0.L(44.0f));
        q0Var.setVisibility(4);
        T();
        a0();
        Y();
    }

    public static void P(dk dkVar, View view, int i7) {
        Object O;
        boolean z10;
        boolean z11;
        int i10;
        ki kiVar = dkVar.f33607b;
        rj rjVar = dkVar.f33965r;
        v4.h0 adapter = rjVar.getAdapter();
        vj vjVar = dkVar.f33967w;
        if (adapter == vjVar) {
            O = vjVar.E(i7);
        } else {
            ck ckVar = dkVar.E;
            O = ckVar.O(ckVar.S(i7), ckVar.Q(i7));
        }
        if (O instanceof wj) {
            wj wjVar = (wj) O;
            File file = wjVar.f41366f;
            if (Build.VERSION.SDK_INT >= 30) {
                z10 = Environment.isExternalStorageManager();
            } else {
                z10 = false;
            }
            org.telegram.ui.an anVar = null;
            if (!org.telegram.messenger.r2.f26199b && (((i10 = wjVar.f41362a) == 2131231074 || i10 == 2131231072) && !z10)) {
                xh xhVar = kiVar.f36482p3;
                int i11 = kiVar.H3;
                if (kiVar.F3 != null && kiVar.F1 - kiVar.G1 < 0) {
                    if (!org.telegram.messenger.np.s1(i11).D3() && org.telegram.messenger.np.s1(i11).V4 > kiVar.G1) {
                        new cc(xhVar, kiVar.J0).f(org.telegram.messenger.np.s1(i11).V4, new vg(kiVar, 3)).j();
                        return;
                    } else {
                        new cc(xhVar, kiVar.J0).t(org.telegram.messenger.hd.M0(2131744041, null), kiVar.J0).j();
                        return;
                    }
                }
                dkVar.R.A();
                return;
            } else if (file == null) {
                int i12 = wjVar.f41362a;
                if (i12 == 2131231071) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36436a2;
                    if (e2Var instanceof org.telegram.ui.an) {
                        anVar = (org.telegram.ui.an) e2Var;
                    }
                    org.telegram.ui.an anVar2 = anVar;
                    org.telegram.messenger.ve veVar = MediaController.f22323a2;
                    if (anVar2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.ym0 ym0Var = new org.telegram.ui.ym0(0, veVar, hashMap, arrayList, 0, z11, anVar2, false);
                    ym0Var.m0 = true;
                    ym0Var.f53590t0 = new h6.m(dkVar, hashMap, arrayList, 26);
                    ym0Var.k0(dkVar.W, false);
                    org.telegram.ui.ActionBar.e2 e2Var2 = kiVar.f36436a2;
                    if (e2Var2 != null) {
                        e2Var2.presentFragment(ym0Var);
                    } else {
                        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            Q.presentFragment(ym0Var);
                        }
                    }
                    kiVar.a(true);
                    return;
                } else if (i12 == 2131231073) {
                    tj tjVar = dkVar.R;
                    if (tjVar != null) {
                        tjVar.T();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = dkVar.getTopForScroll();
                    dkVar.V();
                    uj ujVar = (uj) r.b.g(1, vjVar.f40445f);
                    kiVar.V2.setTitle(ujVar.f40037b);
                    File file2 = ujVar.f40036a;
                    if (file2 != null) {
                        dkVar.S(file2);
                    } else {
                        dkVar.T();
                    }
                    dkVar.a0();
                    dkVar.F.h1(0, topForScroll);
                    dkVar.W(2);
                    return;
                }
            } else if (file.isDirectory()) {
                ?? obj = new Object();
                View childAt = rjVar.getChildAt(0);
                v4.e1 G = rjVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f40036a = dkVar.P;
                    obj.f40037b = kiVar.V2.getTitle();
                    dkVar.V();
                    vjVar.f40445f.add(obj);
                    if (!dkVar.S(file)) {
                        vjVar.f40445f.remove((Object) obj);
                        return;
                    }
                    dkVar.W(1);
                    kiVar.V2.setTitle(wjVar.f41363b);
                    return;
                }
                return;
            } else {
                dkVar.U(view, wjVar);
                return;
            }
        }
        dkVar.U(view, O);
    }

    private int getTopForScroll() {
        rj rjVar = this.f33965r;
        View childAt = rjVar.getChildAt(0);
        v4.e1 G = rjVar.G(childAt);
        int i7 = -rjVar.getPaddingTop();
        if (G != null && G.b() == 0) {
            return childAt.getTop() + i7;
        }
        return i7;
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dk.B(int, int):void");
    }

    @Override
    public final void C() {
        vj vjVar = this.f33967w;
        if (vjVar != null) {
            vjVar.f();
        }
        ck ckVar = this.E;
        if (ckVar != null) {
            ckVar.f();
        }
    }

    @Override
    public final void I(ci ciVar) {
        this.S.clear();
        this.U.clear();
        this.E.S.clear();
        this.T.clear();
        this.f33967w.f40445f.clear();
        T();
        a0();
        Y();
        this.f33607b.V2.setTitle(org.telegram.messenger.hd.M0(2131745657, null));
        this.H.setVisibility(0);
        this.F.h1(0, 0);
    }

    @Override
    public final void K() {
        this.f33965r.y0(0);
    }

    @Override
    public final boolean M(final boolean z10, final int i7, int i10, final long j3, final boolean z11) {
        int size = this.S.size();
        HashMap hashMap = this.U;
        if ((size == 0 && hashMap.size() == 0) || this.R == null || this.L) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (org.telegram.ui.sz szVar : hashMap.keySet()) {
            arrayList.add((org.telegram.messenger.gj) hashMap.get(szVar));
        }
        final ArrayList arrayList2 = new ArrayList(this.T);
        ki kiVar = this.f33607b;
        CharSequence[] charSequenceArr = {kiVar.a1().getText()};
        final ArrayList W = org.telegram.messenger.si.b0(kiVar.H3).W(charSequenceArr, true, true);
        final String charSequence = charSequenceArr[0].toString();
        return t4.Y(kiVar.H3, kiVar.b1(), kiVar.X0() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new org.telegram.messenger.z10() {
            @Override
            public final void a(Object obj) {
                dk dkVar = dk.this;
                dkVar.L = true;
                dkVar.R.n(arrayList2, charSequence, W, arrayList, z10, i7, j3, z11, ((Long) obj).longValue());
                dkVar.f33607b.a(true);
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
                    wj wjVar = new wj();
                    wjVar.f41363b = file2.getName();
                    wjVar.f41366f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    wjVar.d = str;
                    wjVar.f41364c = org.telegram.messenger.g0.i0(file2.length(), false, false);
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        wjVar.f41365e = file2.getAbsolutePath();
                    }
                    ((ArrayList) this.f33967w.h).add(wjVar);
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
        if (file.length() != 0 && str != null && yf.c.f60623i.contains(str)) {
            if (file.length() > org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).f25335m4) {
                new cc(this.f33607b.f29685c, null).u(org.telegram.messenger.hd.a0("TooLargeError", null, 2131744042, new Object[0]), org.telegram.messenger.hd.a0("ErrorRingtoneSizeTooBig", null, 2131751102, Integer.valueOf(org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).f25335m4 / 1024)), null).j();
                return false;
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(org.telegram.messenger.t0.f26600b, Uri.fromFile(file));
                i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                i7 = Integer.MAX_VALUE;
            }
            if (i7 <= org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).f25327l4 * 1000) {
                return true;
            }
            new cc(this.f33607b.f29685c, null).u(org.telegram.messenger.hd.a0("TooLongError", null, 2131744041, new Object[0]), org.telegram.messenger.hd.a0("ErrorRingtoneDurationTooLong", null, 2131751104, Integer.valueOf(org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).f25327l4)), null).j();
            return false;
        }
        new cc(this.f33607b.f29685c, null).u(org.telegram.messenger.hd.a0("InvalidFormatError", null, 2131749181, new Object[0]), org.telegram.messenger.hd.M0(2131751103, null), null).j();
        return false;
    }

    public final boolean S(File file) {
        File file2;
        String str;
        vj vjVar;
        this.O = false;
        boolean canRead = file.canRead();
        rj rjVar = this.f33965r;
        String str2 = null;
        vj vjVar2 = this.f33967w;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.P = file;
                vjVar2.f40444e.clear();
                Environment.getExternalStorageState();
                org.telegram.messenger.g0.y(rjVar);
                this.V = true;
                vjVar2.f();
                return true;
            }
            X(org.telegram.messenger.hd.M0(2131754711, null));
            return false;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                X(org.telegram.messenger.hd.M0(2131743879, null));
                return false;
            }
            this.P = file;
            ArrayList arrayList = vjVar2.f40444e;
            ArrayList arrayList2 = vjVar2.f40445f;
            ArrayList arrayList3 = vjVar2.f40444e;
            arrayList.clear();
            File j3 = org.telegram.messenger.w7.j(6);
            int i7 = 0;
            while (i7 < listFiles.length) {
                File file3 = listFiles[i7];
                if (file3.getName().indexOf(46) == 0 || file3.equals(j3)) {
                    vjVar = vjVar2;
                } else {
                    wj wjVar = new wj();
                    wjVar.f41363b = file3.getName();
                    wjVar.f41366f = file3;
                    if (file3.isDirectory()) {
                        wjVar.f41362a = 2131231070;
                        wjVar.f41364c = org.telegram.messenger.hd.M0(2131750685, str2);
                        vjVar = vjVar2;
                    } else {
                        this.O = true;
                        String name = file3.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        wjVar.d = str;
                        vjVar = vjVar2;
                        wjVar.f41364c = org.telegram.messenger.g0.i0(file3.length(), false, false);
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            wjVar.f41365e = file3.getAbsolutePath();
                        }
                    }
                    arrayList3.add(wjVar);
                }
                i7++;
                vjVar2 = vjVar;
                str2 = null;
            }
            vj vjVar3 = vjVar2;
            wj wjVar2 = new wj();
            wjVar2.f41363b = "..";
            if (arrayList2.size() > 0) {
                File file4 = ((uj) i5.c.h(1, arrayList2)).f40036a;
                if (file4 == null) {
                    file2 = null;
                    wjVar2.f41364c = org.telegram.messenger.hd.M0(2131750685, null);
                } else {
                    file2 = null;
                    wjVar2.f41364c = file4.toString();
                }
            } else {
                file2 = null;
                wjVar2.f41364c = org.telegram.messenger.hd.M0(2131750685, null);
            }
            wjVar2.f41362a = 2131231070;
            wjVar2.f41366f = file2;
            arrayList3.add(0, wjVar2);
            if (this.P != null) {
                Collections.sort(vjVar3.f40444e, new pj(this, 0));
            }
            a0();
            org.telegram.messenger.g0.y(rjVar);
            this.V = true;
            int topForScroll = getTopForScroll();
            vjVar3.f();
            this.F.h1(0, topForScroll);
            return true;
        } catch (Exception e10) {
            X(e10.getLocalizedMessage());
            return false;
        }
    }

    public final void T() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dk.T():void");
    }

    public final boolean U(android.view.View r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dk.U(android.view.View, java.lang.Object):boolean");
    }

    public final void V() {
        View m10;
        vj vjVar = this.f33968x;
        vjVar.f40445f.clear();
        ArrayList arrayList = vjVar.f40445f;
        vj vjVar2 = this.f33967w;
        arrayList.addAll(vjVar2.f40445f);
        ArrayList arrayList2 = vjVar.f40444e;
        arrayList2.clear();
        arrayList2.addAll(vjVar2.f40444e);
        ArrayList arrayList3 = (ArrayList) vjVar.h;
        arrayList3.clear();
        arrayList3.addAll((ArrayList) vjVar2.h);
        vjVar.f();
        rj rjVar = this.f33966s;
        rjVar.setVisibility(0);
        rj rjVar2 = this.f33965r;
        rjVar.setPadding(rjVar2.getPaddingLeft(), rjVar2.getPaddingTop(), rjVar2.getPaddingRight(), rjVar2.getPaddingBottom());
        kg.c0 c0Var = this.F;
        int L0 = c0Var.L0();
        if (L0 >= 0 && (m10 = c0Var.m(L0)) != null) {
            this.f33969y.h1(L0, m10.getTop() - rjVar.getPaddingTop());
        }
    }

    public final void W(int i7) {
        rj rjVar;
        float L;
        ValueAnimator valueAnimator = this.f33963g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f33964n = i7;
        int i10 = 0;
        while (true) {
            int childCount = getChildCount();
            rjVar = this.f33965r;
            if (i10 < childCount) {
                if (getChildAt(i10) == rjVar) {
                    break;
                }
                i10++;
            } else {
                i10 = 0;
                break;
            }
        }
        rj rjVar2 = this.f33966s;
        if (i7 == 1) {
            L = org.telegram.messenger.g0.L(150.0f);
            rjVar2.setAlpha(1.0f);
            rjVar2.setScaleX(1.0f);
            rjVar2.setScaleY(1.0f);
            rjVar2.setTranslationX(0.0f);
            removeView(rjVar2);
            addView(rjVar2, i10);
            rjVar2.setVisibility(0);
            rjVar.setTranslationX(L);
            rjVar.setAlpha(0.0f);
            this.f33963g0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            L = org.telegram.messenger.g0.L(150.0f);
            rjVar.setAlpha(0.0f);
            rjVar.setScaleX(0.95f);
            rjVar.setScaleY(0.95f);
            rjVar2.setScaleX(1.0f);
            rjVar2.setScaleY(1.0f);
            rjVar2.setTranslationX(0.0f);
            rjVar2.setAlpha(1.0f);
            removeView(rjVar2);
            addView(rjVar2, i10 + 1);
            rjVar2.setVisibility(0);
            this.f33963g0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f33963g0.addUpdateListener(new oj(this, i7, L, 0));
        this.f33963g0.addListener(new x5(this, 11));
        if (i7 == 1) {
            this.f33963g0.setDuration(220L);
        } else {
            this.f33963g0.setDuration(200L);
        }
        this.f33963g0.setInterpolator(er.f34420f);
        this.f33963g0.start();
    }

    public final void X(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f33606a);
        String M0 = org.telegram.messenger.hd.M0(2131689472, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = str;
        i5.c.C(null, 2131747831, alertDialog$Builder, null);
    }

    public final void Y() {
        v4.h0 adapter = this.f33965r.getAdapter();
        int i7 = 0;
        boolean z10 = true;
        ck ckVar = this.E;
        if (adapter != ckVar ? this.f33967w.b() != 1 : !ckVar.f33615s.isEmpty() || !ckVar.Q.isEmpty()) {
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
        fi.x4 x4Var = this.M;
        if (x4Var.getVisibility() != 0 || (childAt = this.f33965r.getChildAt(0)) == null) {
            return;
        }
        float translationY = x4Var.getTranslationY();
        this.N = (childAt.getTop() + (x4Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        x4Var.setTranslationY(translationY);
    }

    public final void a0() {
        int i7;
        org.telegram.ui.ActionBar.q0 q0Var = this.G;
        if (q0Var != null && !q0Var.w()) {
            if (!this.O && !this.f33967w.f40445f.isEmpty()) {
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
                    q0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28957j5, this.f33606a));
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
        rj rjVar = this.f33965r;
        if (rjVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i7 = 0;
        View childAt = rjVar.getChildAt(0);
        cj0 cj0Var = (cj0) rjVar.G(childAt);
        int y10 = ((((int) childAt.getY()) - org.telegram.messenger.g0.f23603m) - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(8.0f);
        if (y10 > 0 && cj0Var != null && cj0Var.b() == 0) {
            i7 = y10;
        }
        if (y10 < 0 || cj0Var == null || cj0Var.b() != 0) {
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
        return this.f33965r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.U.size() + this.S.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.s6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.s6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.G.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28957j5));
        int i7 = org.telegram.ui.ActionBar.j6.A5;
        rj rjVar = this.f33965r;
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, 32, new Class[]{org.telegram.ui.Cells.x6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28813b7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, 48, new Class[]{org.telegram.ui.Cells.x6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28792a7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28941i6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f28972k0, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28850d7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"dateTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, 8192, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, 16384, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28979k7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, 8, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.qj));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, 40, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.s6(rjVar, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"extTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.sj));
        return arrayList;
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final boolean k() {
        vj vjVar = this.f33967w;
        if (vjVar.f40445f.size() <= 0) {
            return false;
        }
        V();
        uj ujVar = (uj) r.b.g(1, vjVar.f40445f);
        this.f33607b.V2.setTitle(ujVar.f40037b);
        int topForScroll = getTopForScroll();
        File file = ujVar.f40036a;
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
                org.telegram.messenger.t0.f26600b.unregisterReceiver(this.f33962f0);
                this.Q = false;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.f33607b.V2.n(true);
        org.telegram.ui.ActionBar.y s5 = this.f33607b.V2.s();
        s5.removeView(this.H);
        s5.removeView(this.G);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.f33957a0 = z10;
    }

    public void setDelegate(tj tjVar) {
        this.R = tjVar;
    }

    public void setMaxSelectedFiles(int i7) {
        this.W = i7;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f33607b.f29682b.invalidate();
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
            org.telegram.messenger.gz.M0 = !org.telegram.messenger.gz.M0;
            SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
            edit.putBoolean("sortFilesByName", org.telegram.messenger.gz.M0);
            edit.apply();
            this.f33960d0 = org.telegram.messenger.gz.M0;
            vj vjVar = this.f33967w;
            Collections.sort((ArrayList) vjVar.h, new pj(this, 1));
            if (this.P != null) {
                Collections.sort(vjVar.f40444e, new pj(this, 0));
            }
            vjVar.f();
            if (this.f33960d0) {
                i10 = 2131232103;
            } else {
                i10 = 2131232102;
            }
            this.H.setIcon(i10);
        }
    }
}
