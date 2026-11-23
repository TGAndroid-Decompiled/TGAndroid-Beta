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
public final class kk extends li {
    public static final int f36757h0 = 0;
    public final jk E;
    public final kg.d0 F;
    public final org.telegram.ui.ActionBar.q0 G;
    public final org.telegram.ui.ActionBar.q0 H;
    public final jg.q0 I;
    public AnimatorSet J;
    public final vz K;
    public boolean L;
    public final fi.w4 M;
    public float N;
    public boolean O;
    public File P;
    public boolean Q;
    public bk R;
    public final HashMap S;
    public final ArrayList T;
    public final HashMap U;
    public boolean V;
    public int W;
    public boolean f36758a0;
    public final boolean f36759b0;
    public boolean f36760c0;
    public boolean f36761d0;
    public boolean f36762e0;
    public final androidx.mediarouter.app.f f36763f0;
    public ValueAnimator f36764g0;
    public int f36765n;
    public final zj f36766r;
    public final zj f36767s;
    public final dk f36768w;
    public final dk f36769x;
    public final vy f36770y;

    public kk(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, ti tiVar) {
        super(context, i6Var, tiVar);
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
        this.f36763f0 = new androidx.mediarouter.app.f(this, 8);
        dk dkVar = new dk(this, context);
        this.f36768w = dkVar;
        if (i7 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36759b0 = z10;
        int i11 = 2;
        if (i7 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f36762e0 = z11;
        this.f36761d0 = org.telegram.messenger.bz.M0;
        try {
            if (z11) {
                try {
                    Cursor query = org.telegram.messenger.t0.f27013b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j3 = query.getLong(i11);
                            long j10 = query.getLong(3);
                            String string = query.getString(4);
                            cursor = query;
                            if (j3 <= org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).f25808n4 * 1000) {
                                try {
                                    if (j10 <= org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).o4 && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        ek ekVar = new ek();
                                        ekVar.f34732b = file.getName();
                                        ekVar.f34735f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        if (split.length > 1) {
                                            str = split[split.length - 1];
                                        } else {
                                            str = "?";
                                        }
                                        ekVar.d = str;
                                        ekVar.f34733c = org.telegram.messenger.g0.i0(file.length(), false, false);
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            ekVar.f34734e = file.getAbsolutePath();
                                        }
                                        ((ArrayList) this.f36768w.h).add(ekVar);
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
                Collections.sort((ArrayList) dkVar.h, new xj(this, 1));
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        this.f36760c0 = false;
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
                org.telegram.messenger.t0.f27013b.registerReceiver(this.f36763f0, intentFilter, 4);
            } else {
                org.telegram.messenger.t0.f27013b.registerReceiver(this.f36763f0, intentFilter);
            }
        }
        org.telegram.ui.ActionBar.y s5 = this.f37135b.V2.s();
        org.telegram.ui.ActionBar.q0 a10 = s5.a(0, 2131232491);
        a10.O();
        a10.I = new bi.x1(this, 7);
        this.G = a10;
        a10.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, null));
        a10.setContentDescription(org.telegram.messenger.gd.N0(2131745640, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i12 = org.telegram.ui.ActionBar.n6.f29559j5;
        org.telegram.ui.ActionBar.u6.U(searchField, i12, i6Var);
        org.telegram.ui.ActionBar.u6.v(searchField, i12, i6Var);
        org.telegram.ui.ActionBar.u6.D(searchField, org.telegram.ui.ActionBar.n6.Me, i6Var);
        if (this.f36761d0) {
            i10 = 2131232107;
        } else {
            i10 = 2131232106;
        }
        org.telegram.ui.ActionBar.q0 a11 = s5.a(6, i10);
        this.H = a11;
        a11.setContentDescription(org.telegram.messenger.gd.N0(2131754891, null));
        vz vzVar = new vz(context, i6Var);
        this.K = vzVar;
        addView(vzVar);
        fi.w4 w4Var = new fi.w4(this, context, vzVar, i6Var);
        this.M = w4Var;
        addView(w4Var, c8.na.c(-1.0f, -1));
        w4Var.setVisibility(8);
        w4Var.setOnTouchListener(new gi.a(15));
        zj zjVar = new zj(this, context, i6Var, 0);
        this.f36767s = zjVar;
        zjVar.setSectionsType(2);
        zjVar.setVerticalScrollBarEnabled(false);
        vy vyVar = new vy(org.telegram.messenger.g0.L(56.0f), 0, zjVar);
        this.f36770y = vyVar;
        zjVar.setLayoutManager(vyVar);
        zjVar.setClipToPadding(false);
        dk dkVar2 = new dk(this, context);
        this.f36769x = dkVar2;
        zjVar.setAdapter(dkVar2);
        addView(zjVar, c8.na.c(-1.0f, -1));
        zjVar.setVisibility(8);
        zj zjVar2 = new zj(this, context, i6Var, 1);
        this.f36766r = zjVar2;
        zjVar2.r1();
        setBlur3Capture(zjVar2);
        this.d = zjVar2;
        this.h = true;
        this.f37138f = true;
        zjVar2.setSectionsType(2);
        zjVar2.setVerticalScrollBarEnabled(false);
        kg.d0 d0Var = new kg.d0(this, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f24220m, zjVar2, 2);
        this.F = d0Var;
        zjVar2.setLayoutManager(d0Var);
        zjVar2.setClipToPadding(false);
        zjVar2.setAdapter(this.f36768w);
        addView(zjVar2, c8.na.c(-1.0f, -1));
        this.E = new jk(this, context);
        zjVar2.setOnScrollListener(new na(this, 4));
        zjVar2.setOnItemClickListener(new qj0(this) {
            public final kk f40720b;

            {
                this.f40720b = this;
            }

            @Override
            public final void b(int i13, View view) {
                jg.o0 o0Var;
                switch (r2) {
                    case 0:
                        kk.P(this.f40720b, view, i13);
                        return;
                    default:
                        kk kkVar = this.f40720b;
                        jg.q0 q0Var = kkVar.I;
                        q0Var.I0(true);
                        jk jkVar = kkVar.E;
                        ArrayList arrayList = q0Var.f17723f3;
                        if (arrayList.isEmpty()) {
                            o0Var = jg.q0.f17716k3[i13];
                        } else {
                            o0Var = (jg.o0) arrayList.get(i13);
                        }
                        ti tiVar2 = jkVar.Y.f37135b;
                        ArrayList arrayList2 = jkVar.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (o0Var.b((jg.o0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        tiVar2.V2.setSearchFilter(o0Var);
                        tiVar2.V2.setSearchFieldText("");
                        jkVar.a0(null, null, true);
                        return;
                }
            }
        });
        zjVar2.setOnItemLongClickListener(new b0(this, 19));
        jg.q0 q0Var = new jg.q0(context, i6Var);
        this.I = q0Var;
        q0Var.setOnItemClickListener(new qj0(this) {
            public final kk f40720b;

            {
                this.f40720b = this;
            }

            @Override
            public final void b(int i13, View view) {
                jg.o0 o0Var;
                switch (r2) {
                    case 0:
                        kk.P(this.f40720b, view, i13);
                        return;
                    default:
                        kk kkVar = this.f40720b;
                        jg.q0 q0Var2 = kkVar.I;
                        q0Var2.I0(true);
                        jk jkVar = kkVar.E;
                        ArrayList arrayList = q0Var2.f17723f3;
                        if (arrayList.isEmpty()) {
                            o0Var = jg.q0.f17716k3[i13];
                        } else {
                            o0Var = (jg.o0) arrayList.get(i13);
                        }
                        ti tiVar2 = jkVar.Y.f37135b;
                        ArrayList arrayList2 = jkVar.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (o0Var.b((jg.o0) arrayList2.get(i14))) {
                                    return;
                                }
                            }
                        }
                        arrayList2.add(o0Var);
                        tiVar2.V2.setSearchFilter(o0Var);
                        tiVar2.V2.setSearchFieldText("");
                        jkVar.a0(null, null, true);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29524h5, q0Var, i6Var);
        addView(q0Var, c8.na.e(-1, 44, 48));
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
        ti tiVar = kkVar.f37135b;
        zj zjVar = kkVar.f36766r;
        v4.i0 adapter = zjVar.getAdapter();
        dk dkVar = kkVar.f36768w;
        if (adapter == dkVar) {
            O = dkVar.E(i7);
        } else {
            jk jkVar = kkVar.E;
            O = jkVar.O(jkVar.S(i7), jkVar.Q(i7));
        }
        if (O instanceof ek) {
            ek ekVar = (ek) O;
            File file = ekVar.f34735f;
            if (Build.VERSION.SDK_INT >= 30) {
                z10 = Environment.isExternalStorageManager();
            } else {
                z10 = false;
            }
            org.telegram.ui.bn bnVar = null;
            if (!org.telegram.messenger.s2.f26830b && (((i10 = ekVar.f34731a) == 2131231076 || i10 == 2131231074) && !z10)) {
                gi giVar = tiVar.f40002p3;
                int i11 = tiVar.H3;
                if (tiVar.F3 != null && tiVar.F1 - tiVar.G1 < 0) {
                    if (!org.telegram.messenger.mp.u1(i11).K3() && org.telegram.messenger.mp.u1(i11).X4 > tiVar.G1) {
                        new kc(giVar, tiVar.J0).f(org.telegram.messenger.mp.u1(i11).X4, new fh(tiVar, 3)).j();
                        return;
                    } else {
                        new kc(giVar, tiVar.J0).t(org.telegram.messenger.gd.N0(2131743796, null), tiVar.J0).j();
                        return;
                    }
                }
                kkVar.R.A();
                return;
            } else if (file == null) {
                int i12 = ekVar.f34731a;
                if (i12 == 2131231073) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.g2 g2Var = tiVar.f39956a2;
                    if (g2Var instanceof org.telegram.ui.bn) {
                        bnVar = (org.telegram.ui.bn) g2Var;
                    }
                    org.telegram.ui.bn bnVar2 = bnVar;
                    org.telegram.messenger.ue ueVar = MediaController.f22784a2;
                    if (bnVar2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.an0 an0Var = new org.telegram.ui.an0(0, ueVar, hashMap, arrayList, 0, z11, bnVar2, false);
                    an0Var.m0 = true;
                    an0Var.f45769t0 = new h6.m(kkVar, hashMap, arrayList, 27);
                    an0Var.k0(kkVar.W, false);
                    org.telegram.ui.ActionBar.g2 g2Var2 = tiVar.f39956a2;
                    if (g2Var2 != null) {
                        g2Var2.presentFragment(an0Var);
                    } else {
                        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            Q.presentFragment(an0Var);
                        }
                    }
                    tiVar.a(true);
                    return;
                } else if (i12 == 2131231075) {
                    bk bkVar = kkVar.R;
                    if (bkVar != null) {
                        bkVar.T();
                        return;
                    }
                    return;
                } else {
                    int topForScroll = kkVar.getTopForScroll();
                    kkVar.V();
                    ck ckVar = (ck) p5.c.g(1, dkVar.f34377f);
                    tiVar.V2.setTitle(ckVar.f34075b);
                    File file2 = ckVar.f34074a;
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
                View childAt = zjVar.getChildAt(0);
                v4.f1 G = zjVar.G(childAt);
                if (G != null) {
                    G.b();
                    childAt.getTop();
                    obj.f34074a = kkVar.P;
                    obj.f34075b = tiVar.V2.getTitle();
                    kkVar.V();
                    dkVar.f34377f.add(obj);
                    if (!kkVar.S(file)) {
                        dkVar.f34377f.remove((Object) obj);
                        return;
                    }
                    kkVar.W(1);
                    tiVar.V2.setTitle(ekVar.f34732b);
                    return;
                }
                return;
            } else {
                kkVar.U(view, ekVar);
                return;
            }
        }
        kkVar.U(view, O);
    }

    private int getTopForScroll() {
        zj zjVar = this.f36766r;
        View childAt = zjVar.getChildAt(0);
        v4.f1 G = zjVar.G(childAt);
        int i7 = -zjVar.getPaddingTop();
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
        dk dkVar = this.f36768w;
        if (dkVar != null) {
            dkVar.f();
        }
        jk jkVar = this.E;
        if (jkVar != null) {
            jkVar.f();
        }
    }

    @Override
    public final void H(li liVar) {
        this.S.clear();
        this.U.clear();
        this.E.S.clear();
        this.T.clear();
        this.f36768w.f34377f.clear();
        T();
        a0();
        Y();
        this.f37135b.V2.setTitle(org.telegram.messenger.gd.N0(2131745461, null));
        this.H.setVisibility(0);
        this.F.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f36766r.y0(0);
    }

    @Override
    public final boolean M(final boolean z10, final int i7, int i10, final long j3, final boolean z11) {
        int size = this.S.size();
        HashMap hashMap = this.U;
        if ((size == 0 && hashMap.size() == 0) || this.R == null || this.L) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        for (org.telegram.ui.uz uzVar : hashMap.keySet()) {
            arrayList.add((org.telegram.messenger.fj) hashMap.get(uzVar));
        }
        final ArrayList arrayList2 = new ArrayList(this.T);
        ti tiVar = this.f37135b;
        CharSequence[] charSequenceArr = {tiVar.b1().getText()};
        final ArrayList Y = org.telegram.messenger.ri.d0(tiVar.H3).Y(charSequenceArr, true, true);
        final String charSequence = charSequenceArr[0].toString();
        return b5.Y(tiVar.H3, tiVar.c1(), tiVar.Y0() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(charSequence) ? 1 : 0)), new org.telegram.messenger.w10() {
            @Override
            public final void a(Object obj) {
                kk kkVar = kk.this;
                kkVar.L = true;
                kkVar.R.n(arrayList2, charSequence, Y, arrayList, z10, i7, j3, z11, ((Long) obj).longValue());
                kkVar.f37135b.a(true);
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
                    ek ekVar = new ek();
                    ekVar.f34732b = file2.getName();
                    ekVar.f34735f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    if (split.length > 1) {
                        str = split[split.length - 1];
                    } else {
                        str = "?";
                    }
                    ekVar.d = str;
                    ekVar.f34733c = org.telegram.messenger.g0.i0(file2.length(), false, false);
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        ekVar.f34734e = file2.getAbsolutePath();
                    }
                    ((ArrayList) this.f36768w.h).add(ekVar);
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
        if (file.length() != 0 && str != null && yf.c.f61318i.contains(str)) {
            if (file.length() > org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).o4) {
                new kc(this.f37135b.f30229c, null).u(org.telegram.messenger.gd.a0("TooLargeError", null, 2131743797, new Object[0]), org.telegram.messenger.gd.a0("ErrorRingtoneSizeTooBig", null, 2131751090, Integer.valueOf(org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).o4 / 1024)), null).j();
                return false;
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(org.telegram.messenger.t0.f27013b, Uri.fromFile(file));
                i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                i7 = Integer.MAX_VALUE;
            }
            if (i7 <= org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).f25808n4 * 1000) {
                return true;
            }
            new kc(this.f37135b.f30229c, null).u(org.telegram.messenger.gd.a0("TooLongError", null, 2131743796, new Object[0]), org.telegram.messenger.gd.a0("ErrorRingtoneDurationTooLong", null, 2131751092, Integer.valueOf(org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).f25808n4)), null).j();
            return false;
        }
        new kc(this.f37135b.f30229c, null).u(org.telegram.messenger.gd.a0("InvalidFormatError", null, 2131748988, new Object[0]), org.telegram.messenger.gd.N0(2131751091, null), null).j();
        return false;
    }

    public final boolean S(File file) {
        File file2;
        String str;
        dk dkVar;
        this.O = false;
        boolean canRead = file.canRead();
        zj zjVar = this.f36766r;
        String str2 = null;
        dk dkVar2 = this.f36768w;
        if (!canRead) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.P = file;
                dkVar2.f34376e.clear();
                Environment.getExternalStorageState();
                org.telegram.messenger.g0.y(zjVar);
                this.V = true;
                dkVar2.f();
                return true;
            }
            X(org.telegram.messenger.gd.N0(2131754710, null));
            return false;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                X(org.telegram.messenger.gd.N0(2131743632, null));
                return false;
            }
            this.P = file;
            ArrayList arrayList = dkVar2.f34376e;
            ArrayList arrayList2 = dkVar2.f34377f;
            ArrayList arrayList3 = dkVar2.f34376e;
            arrayList.clear();
            File j3 = org.telegram.messenger.w7.j(6);
            int i7 = 0;
            while (i7 < listFiles.length) {
                File file3 = listFiles[i7];
                if (file3.getName().indexOf(46) == 0 || file3.equals(j3)) {
                    dkVar = dkVar2;
                } else {
                    ek ekVar = new ek();
                    ekVar.f34732b = file3.getName();
                    ekVar.f34735f = file3;
                    if (file3.isDirectory()) {
                        ekVar.f34731a = 2131231072;
                        ekVar.f34733c = org.telegram.messenger.gd.N0(2131750668, str2);
                        dkVar = dkVar2;
                    } else {
                        this.O = true;
                        String name = file3.getName();
                        String[] split = name.split("\\.");
                        if (split.length > 1) {
                            str = split[split.length - 1];
                        } else {
                            str = "?";
                        }
                        ekVar.d = str;
                        dkVar = dkVar2;
                        ekVar.f34733c = org.telegram.messenger.g0.i0(file3.length(), false, false);
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            ekVar.f34734e = file3.getAbsolutePath();
                        }
                    }
                    arrayList3.add(ekVar);
                }
                i7++;
                dkVar2 = dkVar;
                str2 = null;
            }
            dk dkVar3 = dkVar2;
            ek ekVar2 = new ek();
            ekVar2.f34732b = "..";
            if (arrayList2.size() > 0) {
                File file4 = ((ck) i5.c.h(1, arrayList2)).f34074a;
                if (file4 == null) {
                    file2 = null;
                    ekVar2.f34733c = org.telegram.messenger.gd.N0(2131750668, null);
                } else {
                    file2 = null;
                    ekVar2.f34733c = file4.toString();
                }
            } else {
                file2 = null;
                ekVar2.f34733c = org.telegram.messenger.gd.N0(2131750668, null);
            }
            ekVar2.f34731a = 2131231072;
            ekVar2.f34735f = file2;
            arrayList3.add(0, ekVar2);
            if (this.P != null) {
                Collections.sort(dkVar3.f34376e, new xj(this, 0));
            }
            a0();
            org.telegram.messenger.g0.y(zjVar);
            this.V = true;
            int topForScroll = getTopForScroll();
            dkVar3.f();
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
        dk dkVar = this.f36769x;
        dkVar.f34377f.clear();
        ArrayList arrayList = dkVar.f34377f;
        dk dkVar2 = this.f36768w;
        arrayList.addAll(dkVar2.f34377f);
        ArrayList arrayList2 = dkVar.f34376e;
        arrayList2.clear();
        arrayList2.addAll(dkVar2.f34376e);
        ArrayList arrayList3 = (ArrayList) dkVar.h;
        arrayList3.clear();
        arrayList3.addAll((ArrayList) dkVar2.h);
        dkVar.f();
        zj zjVar = this.f36767s;
        zjVar.setVisibility(0);
        zj zjVar2 = this.f36766r;
        zjVar.setPadding(zjVar2.getPaddingLeft(), zjVar2.getPaddingTop(), zjVar2.getPaddingRight(), zjVar2.getPaddingBottom());
        kg.d0 d0Var = this.F;
        int L0 = d0Var.L0();
        if (L0 >= 0 && (m10 = d0Var.m(L0)) != null) {
            this.f36770y.h1(L0, m10.getTop() - zjVar.getPaddingTop());
        }
    }

    public final void W(int i7) {
        zj zjVar;
        float L;
        ValueAnimator valueAnimator = this.f36764g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f36765n = i7;
        int i10 = 0;
        while (true) {
            int childCount = getChildCount();
            zjVar = this.f36766r;
            if (i10 < childCount) {
                if (getChildAt(i10) == zjVar) {
                    break;
                }
                i10++;
            } else {
                i10 = 0;
                break;
            }
        }
        zj zjVar2 = this.f36767s;
        if (i7 == 1) {
            L = org.telegram.messenger.g0.L(150.0f);
            zjVar2.setAlpha(1.0f);
            zjVar2.setScaleX(1.0f);
            zjVar2.setScaleY(1.0f);
            zjVar2.setTranslationX(0.0f);
            removeView(zjVar2);
            addView(zjVar2, i10);
            zjVar2.setVisibility(0);
            zjVar.setTranslationX(L);
            zjVar.setAlpha(0.0f);
            this.f36764g0 = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            L = org.telegram.messenger.g0.L(150.0f);
            zjVar.setAlpha(0.0f);
            zjVar.setScaleX(0.95f);
            zjVar.setScaleY(0.95f);
            zjVar2.setScaleX(1.0f);
            zjVar2.setScaleY(1.0f);
            zjVar2.setTranslationX(0.0f);
            zjVar2.setAlpha(1.0f);
            removeView(zjVar2);
            addView(zjVar2, i10 + 1);
            zjVar2.setVisibility(0);
            this.f36764g0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f36764g0.addUpdateListener(new wj(this, i7, L, 0));
        this.f36764g0.addListener(new x(this, 12));
        if (i7 == 1) {
            this.f36764g0.setDuration(220L);
        } else {
            this.f36764g0.setDuration(200L);
        }
        this.f36764g0.setInterpolator(kr.f36858f);
        this.f36764g0.start();
    }

    public final void X(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f37134a);
        String N0 = org.telegram.messenger.gd.N0(2131689472, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = str;
        org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
    }

    public final void Y() {
        v4.i0 adapter = this.f36766r.getAdapter();
        int i7 = 0;
        boolean z10 = true;
        jk jkVar = this.E;
        if (adapter != jkVar ? this.f36768w.b() != 1 : !jkVar.f36451s.isEmpty() || !jkVar.Q.isEmpty()) {
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
        fi.w4 w4Var = this.M;
        if (w4Var.getVisibility() != 0 || (childAt = this.f36766r.getChildAt(0)) == null) {
            return;
        }
        float translationY = w4Var.getTranslationY();
        this.N = (childAt.getTop() + (w4Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        w4Var.setTranslationY(translationY);
    }

    public final void a0() {
        int i7;
        org.telegram.ui.ActionBar.q0 q0Var = this.G;
        if (q0Var != null && !q0Var.w()) {
            if (!this.O && !this.f36768w.f34377f.isEmpty()) {
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
                    q0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29559j5, this.f37134a));
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
        zj zjVar = this.f36766r;
        if (zjVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i7 = 0;
        View childAt = zjVar.getChildAt(0);
        mj0 mj0Var = (mj0) zjVar.G(childAt);
        int y10 = ((((int) childAt.getY()) - org.telegram.messenger.g0.f24220m) - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(8.0f);
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
        return this.f36766r.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.U.size() + this.S.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.w6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.w6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.G.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29559j5));
        int i7 = org.telegram.ui.ActionBar.n6.A5;
        zj zjVar = this.f36766r;
        arrayList.add(new org.telegram.ui.ActionBar.w6(zjVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(zjVar, 32, new Class[]{org.telegram.ui.Cells.y6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29415b7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(zjVar, 48, new Class[]{org.telegram.ui.Cells.y6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29394a7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(zjVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29543i6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(zjVar, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.n6.f29574k0, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29452d7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(zjVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(zjVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"dateTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(zjVar, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(zjVar, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29581k7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(zjVar, 8, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.qj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(zjVar, 40, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(zjVar, 4, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"extTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.sj));
        return arrayList;
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final boolean k() {
        dk dkVar = this.f36768w;
        if (dkVar.f34377f.size() <= 0) {
            return false;
        }
        V();
        ck ckVar = (ck) p5.c.g(1, dkVar.f34377f);
        this.f37135b.V2.setTitle(ckVar.f34075b);
        int topForScroll = getTopForScroll();
        File file = ckVar.f34074a;
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
                org.telegram.messenger.t0.f27013b.unregisterReceiver(this.f36763f0);
                this.Q = false;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.f37135b.V2.n(true);
        org.telegram.ui.ActionBar.y s5 = this.f37135b.V2.s();
        s5.removeView(this.H);
        s5.removeView(this.G);
    }

    public void setCanSelectOnlyImageFiles(boolean z10) {
        this.f36758a0 = z10;
    }

    public void setDelegate(bk bkVar) {
        this.R = bkVar;
    }

    public void setMaxSelectedFiles(int i7) {
        this.W = i7;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f37135b.f30226b.invalidate();
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
            this.f36761d0 = org.telegram.messenger.bz.M0;
            dk dkVar = this.f36768w;
            Collections.sort((ArrayList) dkVar.h, new xj(this, 1));
            if (this.P != null) {
                Collections.sort(dkVar.f34376e, new xj(this, 0));
            }
            dkVar.f();
            if (this.f36761d0) {
                i10 = 2131232107;
            } else {
                i10 = 2131232106;
            }
            this.H.setIcon(i10);
        }
    }
}
