package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.PhotoViewer;
public final class rn extends ki implements org.telegram.ui.ActionBar.c6, zt0, org.telegram.messenger.fs {
    public static final int f39206s1 = 0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public final j30 E;
    public int E0;
    public ry F;
    public int F0;
    public final hi.p3 G;
    public int G0;
    public boolean H;
    public int H0;
    public boolean I;
    public int I0;
    public final boolean J;
    public int J0;
    public final int K;
    public int K0;
    public final CharSequence[] L;
    public int L0;
    public final boolean[] M;
    public int M0;
    public int N;
    public final bg.w0 N0;
    public Editable O;
    public final bg.w0 O0;
    public Editable P;
    public final bg.w0[] P0;
    public Editable Q;
    public final ArrayList Q0;
    public final sh.p R;
    public int R0;
    public boolean S;
    public int S0;
    public boolean T;
    public final int T0;
    public boolean U;
    public final int[] U0;
    public int V;
    public final gk V0;
    public int W;
    public boolean W0;
    public int X0;
    public boolean Y0;
    public int Z0;
    public boolean f39207a0;
    public boolean f39208a1;
    public boolean f39209b0;
    public boolean f39210b1;
    public boolean f39211c0;
    public int f39212c1;
    public boolean f39213d0;
    public int f39214d1;
    public boolean f39215e0;
    public int f39216e1;
    public final boolean f39217f0;
    public boolean f39218f1;
    public boolean f39219g0;
    public boolean f39220g1;
    public boolean f39221h0;
    public org.telegram.ui.Cells.a6 f39222h1;
    public boolean f39223i0;
    public boolean f39224i1;
    public boolean f39225j0;
    public boolean f39226j1;
    public qn f39227k0;
    public final Paint f39228k1;
    public int f39229l0;
    public fi.n2 l1;
    public int m0;
    public int f39230m1;
    public final boolean f39231n;
    public int f39232n0;
    public final sh.e n1;
    public int f39233o0;
    public Drawable f39234o1;
    public int f39235p0;
    public Drawable f39236p1;
    public int f39237q0;
    public int f39238q1;
    public final org.telegram.ui.l4 f39239r;
    public int f39240r0;
    public int f39241r1;
    public final org.telegram.ui.f61 f39242s;
    public int f39243s0;
    public int f39244t0;
    public int f39245u0;
    public int f39246v0;
    public final fn f39247w;
    public int f39248w0;
    public final kg.c0 f39249x;
    public int f39250x0;
    public final in f39251y;
    public int f39252y0;
    public int f39253z0;

    public rn(si siVar, Context context, boolean z10, org.telegram.ui.ActionBar.i6 i6Var, Boolean bool) {
        super(context, i6Var, siVar);
        this.N = 1;
        this.S = true;
        this.T = true;
        this.U = true;
        this.f39211c0 = true;
        this.f39219g0 = true;
        this.f39221h0 = true;
        this.f39229l0 = -1;
        bg.w0 w0Var = new bg.w0(this);
        this.N0 = w0Var;
        bg.w0 w0Var2 = new bg.w0(this);
        this.O0 = w0Var2;
        this.P0 = new bg.w0[]{w0Var, w0Var2};
        ArrayList arrayList = new ArrayList();
        this.Q0 = arrayList;
        this.U0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.V0 = new gk(this, 2);
        this.W0 = false;
        this.X0 = -1;
        this.f39224i1 = false;
        this.f39226j1 = false;
        Paint paint = new Paint(1);
        this.f39228k1 = paint;
        this.n1 = new sh.e();
        this.f39231n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.K = answersMaxCount;
        this.L = new CharSequence[answersMaxCount];
        this.M = new boolean[answersMaxCount];
        boolean q10 = org.telegram.messenger.j10.i(org.telegram.messenger.c.a(this.f36766b.H3).f23221a).q();
        this.J = q10;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.f39213d0 = booleanValue;
            this.f39217f0 = booleanValue;
            boolean z11 = !booleanValue;
            this.U = z11;
            this.S = z11;
        }
        n0();
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Yl, this.f36765a));
        this.f36766b.f39705p3.setDelegate(this);
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(1, this, context);
        this.f39239r = l4Var;
        org.telegram.ui.f61 f61Var = new org.telegram.ui.f61(5, context, null);
        this.f39242s = f61Var;
        setBlur3Capture(f61Var);
        this.d = f61Var;
        this.h = true;
        this.f36769f = true;
        fn fnVar = new fn(this);
        this.f39247w = fnVar;
        f61Var.setItemAnimator(fnVar);
        arrayList.clear();
        fnVar.f59151m = false;
        fnVar.C = false;
        fnVar.o(lr.h);
        fnVar.n(350L);
        f61Var.setClipToPadding(false);
        f61Var.setVerticalScrollBarEnabled(false);
        f61Var.setSections(true);
        kg.c0 c0Var = new kg.c0(this, org.telegram.messenger.g0.L(65.0f) + org.telegram.messenger.g0.f24115m, f61Var, 4);
        this.f39249x = c0Var;
        f61Var.setLayoutManager(c0Var);
        c0Var.O = true;
        new v4.z(new gi.c(this, 4)).h(f61Var);
        addView(f61Var, c8.ma.e(-1, -1, 51));
        f61Var.setPreserveFocusAfterLayout(true);
        f61Var.setAdapter(l4Var);
        f61Var.setOnItemClickListener(new vm(this, i6Var, siVar, context));
        f61Var.setOnScrollListener(new oa(this, 6));
        j30 j30Var = new j30(context, 4);
        this.E = j30Var;
        j30Var.setAlpha(0.0f);
        j30Var.setVisibility(4);
        addView(j30Var, c8.ma.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.T0 = ((org.telegram.messenger.j0) org.telegram.messenger.mp.u1(this.f36766b.H3).A7.O.f15539b).f24767c;
        this.R = new sh.p(this.f36766b.H3);
        org.telegram.messenger.ks.f(this.f36766b.H3).c(this, org.telegram.messenger.ks.f25213w0);
        if (q10) {
            org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25145k4);
            ?? yw0Var = new yw0(context, this.f36766b.H3, null, i6Var);
            this.f39251y = yw0Var;
            yw0Var.E = true;
            yw0Var.F = true;
            yw0Var.setHorizontalPadding(org.telegram.messenger.g0.L(24.0f));
            addView((View) yw0Var, c8.ma.e(-2, 160, 51));
        }
        this.G = new hi.p3(this.f36766b.f39705p3, false, null);
        Y();
    }

    public static void P(rn rnVar, int i7) {
        j30 j30Var = rnVar.E;
        v4.f1 K = rnVar.f39242s.K(rnVar.f39245u0 + i7);
        if (K != null) {
            View view = K.f59122a;
            if (view instanceof org.telegram.ui.Cells.a6) {
                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f)) {
                    in inVar = rnVar.f39251y;
                    if (inVar != null) {
                        inVar.f();
                    }
                    j30Var.setText(org.telegram.messenger.gd.M0(2131746989, null));
                    j30Var.c(a6Var.getCheckBox());
                    ImageView imageView = j30Var.f36310b;
                    imageView.setTranslationX(imageView.getTranslationX() + org.telegram.messenger.g0.L(48.0f));
                    j30Var.setTranslationY(j30Var.getTranslationY() + org.telegram.messenger.g0.L(10.0f));
                }
            }
        }
    }

    public static void Q(org.telegram.ui.Components.rn r5, android.view.View r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rn.Q(org.telegram.ui.Components.rn, android.view.View, int):void");
    }

    public static void R(rn rnVar, org.telegram.ui.Cells.a6 a6Var, boolean z10) {
        v4.f1 T;
        if (rnVar.J && z10) {
            if (rnVar.f39222h1 == a6Var && rnVar.f39210b1 && rnVar.f39224i1) {
                rnVar.b0();
                rnVar.f39210b1 = false;
            }
            org.telegram.ui.Cells.a6 a6Var2 = rnVar.f39222h1;
            rnVar.f39222h1 = a6Var;
            a6Var.setEmojiButtonVisibility(true);
            yg emojiButton = a6Var.getEmojiButton();
            wg wgVar = wg.f41711e;
            emojiButton.j(wgVar, false);
            org.telegram.ui.f61 f61Var = rnVar.f39242s;
            View F = f61Var.F(a6Var);
            if (F == null) {
                T = null;
            } else {
                T = f61Var.T(F);
            }
            in inVar = rnVar.f39251y;
            if (inVar != null) {
                inVar.f();
                if (T != null) {
                    View view = T.f59122a;
                    if ((view instanceof org.telegram.ui.Cells.a6) && inVar.getDelegate() != view) {
                        inVar.setDelegate((org.telegram.ui.Cells.a6) view);
                    }
                }
            }
            if (a6Var2 != null && a6Var2 != a6Var) {
                if (rnVar.f39210b1) {
                    rnVar.b0();
                    rnVar.e0(false);
                    rnVar.h0();
                }
                a6Var2.setEmojiButtonVisibility(false);
                a6Var2.getEmojiButton().j(wgVar, false);
            }
        }
    }

    public static void S(rn rnVar, org.telegram.ui.Cells.a6 a6Var) {
        rnVar.f39222h1 = a6Var;
        if (rnVar.f39210b1) {
            rnVar.b0();
            rnVar.h0();
            return;
        }
        rnVar.k0(1);
    }

    public static void T(rn rnVar, int i7) {
        si siVar;
        org.telegram.ui.ActionBar.h2 h2Var;
        int i10;
        sh.e eVar = rnVar.n1;
        if (eVar.b(i7) != null) {
            sh.d b10 = eVar.b(i7);
            if (b10 != null && (siVar = rnVar.f36766b) != null && (h2Var = siVar.f39659a2) != null) {
                Activity parentActivity = h2Var.getParentActivity();
                if (b10 instanceof th.d) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((th.d) b10).f58214b);
                    PhotoViewer.p1().I2(parentActivity, null, null);
                    PhotoViewer.p1().f2(arrayList, 0, 14, false, new ym(rnVar, i7), null);
                    return;
                } else if (b10 instanceof th.h) {
                    th.h hVar = (th.h) b10;
                    org.telegram.ui.ns.p().v(parentActivity);
                    org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                    ?? obj = new Object();
                    obj.f33367b = rnVar;
                    obj.f33366a = i7;
                    p10.u(obj);
                    org.telegram.ui.ns p11 = org.telegram.ui.ns.p();
                    TLRPC.Document document = hVar.f58226b;
                    if (org.telegram.messenger.fj.H2(document)) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    p11.s(document, null, "", null, null, i10, false, hVar.f58227c, rnVar.f36765a, 200);
                    return;
                } else if (b10 instanceof th.c) {
                    th.c cVar = (th.c) b10;
                    String str = cVar.d;
                    rnVar.l0(i7, new org.telegram.ui.ef(1, str, org.telegram.messenger.g0.i0(cVar.f58211e, true, true) + " " + cVar.f58212f), org.telegram.messenger.g0.L(240.0f), org.telegram.messenger.g0.L(60.0f));
                    return;
                } else if (b10 instanceof th.g) {
                    th.g gVar = (th.g) b10;
                    TLRPC.Document F0 = gVar.f58224b.F0();
                    String x12 = org.telegram.messenger.fj.x1(F0);
                    rnVar.l0(i7, new hi.q4(x12, org.telegram.messenger.fj.v1(F0) + " - " + org.telegram.messenger.gd.R((int) org.telegram.messenger.fj.H0(F0)), gVar, 2), org.telegram.messenger.g0.L(240.0f), org.telegram.messenger.g0.L(60.0f));
                    return;
                } else if (b10 instanceof th.f) {
                    rnVar.l0(i7, new ui((th.f) b10, 1), org.telegram.messenger.g0.L(300.0f), (org.telegram.messenger.g0.L(300.0f) * 9) / 16);
                    return;
                } else if (b10 instanceof th.e) {
                    th.e eVar2 = (th.e) b10;
                    b5.d0(rnVar.getContext(), rnVar.f36765a, eVar2.f58216b, eVar2.f58220n, new qm(rnVar, i7, 1), new sm(rnVar, i7, 0));
                    return;
                } else {
                    rnVar.g0(i7);
                    return;
                }
            }
            return;
        }
        rnVar.g0(i7);
    }

    public static CharSequence d0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        CharSequence n1 = org.telegram.messenger.g0.n1(charSequence);
        while (TextUtils.indexOf(n1, "\n\n\n") >= 0) {
            n1 = TextUtils.replace(n1, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        while (TextUtils.indexOf(n1, "\n\n\n") == 0) {
            n1 = TextUtils.replace(n1, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        return n1;
    }

    private int getAnswersMaxCount() {
        if (this.f39231n) {
            return getMessagesController().U6;
        }
        return ((org.telegram.messenger.j0) getMessagesController().A7.L.f15539b).f24767c;
    }

    private int getCurrentAccount() {
        si siVar = this.f36766b;
        if (siVar != null) {
            return siVar.H3;
        }
        return org.telegram.messenger.j10.f24773t0;
    }

    private org.telegram.messenger.mp getMessagesController() {
        return org.telegram.messenger.mp.u1(getCurrentAccount());
    }

    public static fi.n2 i0(org.telegram.ui.ActionBar.h2 h2Var, int i7, org.telegram.messenger.x10 x10Var, lg lgVar) {
        if (h2Var == null) {
            return null;
        }
        fi.n2 n2Var = new fi.n2(h2Var.getContext(), h2Var, h2Var.getResourceProvider(), lgVar);
        n2Var.X3 = new cn(n2Var, x10Var, h2Var);
        n2Var.Y3 = new dn(x10Var, n2Var);
        n2Var.f39670e2.i0();
        n2Var.z1(1, true);
        n2Var.W0(i7);
        n2Var.f39726u4 = new tm(x10Var);
        n2Var.S1 = new en(n2Var, x10Var, h2Var);
        n2Var.T1 = new g2(14, x10Var, n2Var);
        n2Var.f1();
        n2Var.A0(true);
        n2Var.show();
        return n2Var;
    }

    @Override
    public final void A() {
        org.telegram.ui.l4 l4Var = this.f39239r;
        if (l4Var != null) {
            l4Var.f();
        }
        if (this.J) {
            e0(false);
            in inVar = this.f39251y;
            if (inVar != null) {
                inVar.f();
            }
            org.telegram.ui.Cells.a6 a6Var = this.f39222h1;
            if (a6Var != null) {
                a6Var.setEmojiButtonVisibility(false);
                this.f39222h1.getTextView().clearFocus();
                org.telegram.messenger.g0.v1(this.f39222h1.getEditField());
            }
        }
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rn.B(int, int):void");
    }

    @Override
    public final void I(ki kiVar) {
        si siVar = this.f36766b;
        try {
            siVar.V2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.f39231n) {
            siVar.V2.setTitle(org.telegram.messenger.gd.M0(2131743819, null));
        } else if (this.f39217f0) {
            siVar.V2.setTitle(org.telegram.messenger.gd.M0(2131748072, null));
        } else {
            siVar.V2.setTitle(org.telegram.messenger.gd.M0(2131748073, null));
        }
        siVar.M1();
        this.f39249x.h1(0, 0);
    }

    @Override
    public final void K() {
        this.f39242s.y0(1);
    }

    @Override
    public final void L(int i7, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        int L;
        if (this.J) {
            if (i7 > org.telegram.messenger.g0.L(50.0f) && this.f39218f1 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                if (z10) {
                    this.f39216e1 = i7;
                    org.telegram.messenger.mp.f1().edit().putInt("kbd_height_land3", this.f39216e1).commit();
                } else {
                    this.f39214d1 = i7;
                    org.telegram.messenger.mp.f1().edit().putInt("kbd_height", this.f39214d1).commit();
                }
            }
            boolean z13 = this.f39210b1;
            si siVar = this.f36766b;
            hi.p3 p3Var = this.G;
            if (z13) {
                if (z10) {
                    i10 = this.f39216e1;
                } else {
                    i10 = this.f39214d1;
                }
                if (this.f39224i1) {
                    i10 += org.telegram.messenger.g0.L(120.0f);
                }
                int i11 = i10 + org.telegram.messenger.g0.f24116n;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = org.telegram.messenger.g0.f24121q.x;
                if (i12 != i13 || layoutParams.height != i11 || this.f39226j1 != this.f39224i1) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.F.setLayoutParams(layoutParams);
                    this.f39212c1 = layoutParams.height;
                    p3Var.a();
                    siVar.f39705p3.requestLayout();
                    boolean z14 = this.f39226j1;
                    if (z14 != this.f39224i1) {
                        if (z14) {
                            L = -org.telegram.messenger.g0.L(120.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(120.0f);
                        }
                        V(L);
                    }
                    this.f39226j1 = this.f39224i1;
                }
            }
            if (this.Z0 != i7 || this.f39208a1 != z10) {
                this.Z0 = i7;
                this.f39208a1 = z10;
                boolean z15 = this.f39218f1;
                org.telegram.ui.Cells.a6 a6Var = this.f39222h1;
                if (a6Var != null) {
                    if (a6Var.getEditField().isFocused() && p3Var.c() && i7 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f39218f1 = z12;
                } else {
                    this.f39218f1 = false;
                }
                if (this.f39218f1 && this.f39210b1) {
                    k0(0);
                }
                if (this.f39212c1 != 0 && !(z11 = this.f39218f1) && z11 != z15 && !this.f39210b1) {
                    this.f39212c1 = 0;
                    p3Var.a();
                    siVar.f39705p3.requestLayout();
                }
                if (this.f39218f1 && this.H) {
                    this.H = false;
                    org.telegram.messenger.g0.r(this.V0);
                }
            }
        }
    }

    public final void U() {
        in inVar = this.f39251y;
        if (inVar != null) {
            inVar.setDelegate(null);
            inVar.f();
        }
        this.f39242s.setItemAnimator(this.f39247w);
        int i7 = this.N;
        this.M[i7] = false;
        int i10 = i7 + 1;
        this.N = i10;
        int length = this.L.length;
        org.telegram.ui.l4 l4Var = this.f39239r;
        if (i10 == length) {
            l4Var.s(this.f39246v0);
        }
        l4Var.i(this.f39246v0);
        n0();
        this.f39229l0 = (this.f39245u0 + this.N) - 1;
        l4Var.g(this.f39248w0);
        l4Var.g(this.B0);
    }

    public final void V(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.rf(this, f10, 4));
        ofFloat.addListener(new xm(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.j1.f29019w);
        ofFloat.start();
    }

    public final void W() {
        boolean z10;
        if (!this.f39213d0 && !this.f39209b0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.U = false;
        }
        int i7 = this.D0;
        if (i7 < 0) {
            return;
        }
        v4.f1 K = this.f39242s.K(i7);
        if (K == null) {
            this.f39239r.g(this.D0);
            return;
        }
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) K.f59122a;
        if (!z10) {
            y5Var.setChecked(false);
        }
        y5Var.getCheckBox().f33132a.a(!z10, true);
    }

    public final boolean X() {
        boolean z10;
        int i7;
        int i10;
        if (TextUtils.isEmpty(d0(this.O)) && TextUtils.isEmpty(d0(this.P)) && TextUtils.isEmpty(d0(this.Q)) && this.n1.f57434a.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            for (int i11 = 0; i11 < this.N && (z10 = TextUtils.isEmpty(d0(this.L[i11]))); i11++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f36766b.f39659a2.getParentActivity());
            boolean z11 = this.f39231n;
            if (z11) {
                i7 = 2131752556;
            } else {
                i7 = 2131752562;
            }
            String M0 = org.telegram.messenger.gd.M0(i7, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
            u1Var.S = M0;
            if (z11) {
                i10 = 2131752557;
            } else {
                i10 = 2131752563;
            }
            u1Var.U = org.telegram.messenger.gd.M0(i10, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747387, null), new b0(this, 22));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            alertDialog$Builder.p();
        }
        return z10;
    }

    public final void Y() {
        int i7;
        int i10;
        int i11;
        boolean z10;
        boolean z11 = this.f39213d0;
        CharSequence[] charSequenceArr = this.L;
        if (z11) {
            int i12 = 0;
            i7 = 0;
            while (true) {
                boolean[] zArr = this.M;
                if (i12 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(d0(charSequenceArr[i12])) && zArr[i12]) {
                    i7++;
                }
                i12++;
            }
        } else {
            i7 = 0;
        }
        boolean z12 = this.f39231n;
        if (z12) {
            i10 = getMessagesController().V6;
        } else {
            i10 = 255;
        }
        if (z12) {
            i11 = getMessagesController().W6;
        } else {
            i11 = 100;
        }
        if ((!TextUtils.isEmpty(d0(this.P)) && this.P.length() > this.T0) || ((!TextUtils.isEmpty(d0(this.Q)) && this.Q.length() > 200) || TextUtils.isEmpty(d0(this.O)) || this.O.length() > i10)) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        while (true) {
            if (i13 >= charSequenceArr.length) {
                break;
            }
            if (!TextUtils.isEmpty(d0(charSequenceArr[i13]))) {
                if (charSequenceArr[i13].length() > i11) {
                    i14 = 0;
                    z13 = true;
                    break;
                }
                i14++;
                z13 = true;
            }
            i13++;
        }
        if (i14 < 1 || (this.f39213d0 && i7 < 1)) {
            z10 = false;
        }
        if (TextUtils.isEmpty(this.Q) && TextUtils.isEmpty(this.O) && TextUtils.isEmpty(this.P) && !z13 && this.n1.f57434a.size() <= 0) {
            this.f39223i0 = true;
        } else {
            this.f39223i0 = false;
        }
        boolean z14 = this.f39223i0;
        si siVar = this.f36766b;
        siVar.f30223r0 = z14;
        this.Y0 = z10;
        siVar.M1();
    }

    public final void Z(org.telegram.ui.Cells.m8 m8Var, boolean z10) {
        if (this.W != 0) {
            m8Var.q(org.telegram.messenger.gd.M0(2131746937, null), org.telegram.messenger.gd.Q(this.W), z10, false);
        } else if (this.V != 0) {
            m8Var.q(org.telegram.messenger.gd.M0(2131746939, null), org.telegram.messenger.gd.G(this.V / 3600, "Hours", new Object[0]), z10, false);
        } else {
            m8Var.q(org.telegram.messenger.gd.M0(2131746937, null), null, z10, false);
        }
    }

    public final void a0(th.e eVar, boolean z10) {
        boolean z11;
        TLRPC.Photo photo;
        String str = eVar.f58216b;
        sh.p pVar = this.R;
        boolean containsKey = pVar.f57477c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) pVar.f57476b.get(eVar.f58216b);
        te.a aVar = eVar.f58222s;
        ImageReceiver imageReceiver = eVar.f57433a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z11 = false;
        } else {
            z11 = true;
        }
        eVar.f58221r.a(z11, z10);
        eVar.f58220n = webPage;
        if (webPage != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 40, false, null, false);
            imageReceiver.r0(org.telegram.messenger.fc.f(org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(36.0f), false, w10, true), webPage.photo), "48_48", org.telegram.messenger.fc.f(w10, webPage.photo), "48_48_b", null, 0L, null, webPage, 1);
            aVar.a(true, z10);
            return;
        }
        aVar.a(false, z10);
        imageReceiver.f();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Zl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29397d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29488i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29807z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Mi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29339a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29360b7));
    }

    public final void b0() {
        if (this.f39224i1) {
            this.F.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
            layoutParams.height -= org.telegram.messenger.g0.L(120.0f);
            this.F.setLayoutParams(layoutParams);
            this.f39212c1 = layoutParams.height;
            this.f39226j1 = this.f39224i1;
            this.f39224i1 = false;
            V(-org.telegram.messenger.g0.L(120.0f));
        }
    }

    public final void c0(android.view.View r10, org.telegram.ui.Cells.a6 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rn.c0(android.view.View, org.telegram.ui.Cells.a6, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i7 == org.telegram.messenger.ks.f25213w0) {
            a0.h hVar = (a0.h) objArr[0];
            for (Map.Entry entry : this.R.f57476b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) hVar.f(((TLRPC.WebPage) entry.getValue()).f28560id)) != null) {
                    entry.setValue(webPage);
                }
            }
            sh.e eVar = this.n1;
            int size = eVar.f57434a.size();
            for (int i11 = 0; i11 < size; i11++) {
                sh.d dVar = (sh.d) eVar.f57434a.get(i11);
                if (dVar instanceof th.e) {
                    a0((th.e) dVar, true);
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25145k4) {
            ry ryVar = this.F;
            if (ryVar != null) {
                ryVar.Q.g1();
            }
            org.telegram.ui.Cells.a6 a6Var = this.f39222h1;
            if (a6Var != null) {
                int currentTextColor = a6Var.getEditField().getCurrentTextColor();
                this.f39222h1.getEditField().setTextColor(-1);
                this.f39222h1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0(boolean z10) {
        if (this.J) {
            if (this.f39210b1) {
                ry ryVar = this.F;
                ryVar.Q.C0();
                ryVar.J.scrollTo(0, 0);
                ryVar.F(1);
                ryVar.R.h1(0, 0);
                this.F.t(false);
                if (z10) {
                    this.F.A();
                }
                this.f39224i1 = false;
                k0(0);
            }
            if (z10) {
                ry ryVar2 = this.F;
                if (ryVar2 != null && ryVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.F.getMeasuredHeight());
                    ofFloat.addUpdateListener(new um(this, 0));
                    this.f39220g1 = true;
                    ofFloat.addListener(new xm(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.j1.f29019w);
                    ofFloat.start();
                    return;
                }
                f0();
            }
        }
    }

    public final void f0() {
        ry ryVar;
        yg emojiButton;
        if (!this.f39210b1 && (ryVar = this.F) != null && ryVar.getVisibility() != 8) {
            org.telegram.ui.Cells.a6 a6Var = this.f39222h1;
            if (a6Var != null && (emojiButton = a6Var.getEmojiButton()) != null) {
                emojiButton.j(wg.f41711e, false);
            }
            this.F.setVisibility(8);
        }
        int i7 = this.f39212c1;
        this.f39212c1 = 0;
        if (i7 != 0) {
            this.G.a();
        }
    }

    public final void g0(int i7) {
        int i10;
        this.f39230m1 = i7;
        org.telegram.ui.ActionBar.h2 h2Var = this.f36766b.f39659a2;
        this.n1.b(i7);
        if (i7 != -2 && i7 != -3) {
            i10 = 41026;
        } else {
            i10 = 74;
        }
        this.l1 = i0(h2Var, i10, new qm(this, i7, 0), new lg(this, 29));
    }

    @Override
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(70.0f);
    }

    @Override
    public int getCurrentItemTop() {
        View childAt;
        v4.f1 T;
        int i7;
        org.telegram.ui.f61 f61Var = this.f39242s;
        if (f61Var.getChildCount() <= 1 || (childAt = f61Var.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View F = f61Var.F(childAt);
        if (F == null) {
            T = null;
        } else {
            T = f61Var.T(F);
        }
        kj0 kj0Var = (kj0) T;
        int y10 = (((int) childAt.getY()) - org.telegram.messenger.g0.f24115m) - org.telegram.messenger.g0.L(20.0f);
        if (y10 > 0 && kj0Var != null && kj0Var.b() == 1) {
            i7 = y10;
        } else {
            i7 = 0;
        }
        if (y10 < 0 || kj0Var == null || kj0Var.b() != 1) {
            y10 = i7;
        }
        return org.telegram.messenger.g0.L(25.0f) + y10;
    }

    public int getEmojiPadding() {
        return this.f39212c1;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(17.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.S0;
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.w6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.w6> arrayList = new ArrayList<>();
        int i7 = org.telegram.ui.ActionBar.n6.A5;
        org.telegram.ui.f61 f61Var = this.f39242s;
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 16, new Class[]{jn.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29339a7));
        int i10 = org.telegram.ui.ActionBar.n6.f29617p7;
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 262144, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        int i11 = org.telegram.ui.ActionBar.n6.f29561m6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 8388608, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"deleteImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 8388608, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"moveImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 262144, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 0, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        int i12 = org.telegram.ui.ActionBar.n6.f29526k7;
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 0, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.M6));
        int i13 = org.telegram.ui.ActionBar.n6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 32, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.w6(f61Var, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i12));
        return arrayList;
    }

    public final void h0() {
        int i7;
        org.telegram.ui.Cells.a6 a6Var = this.f39222h1;
        if (a6Var != null) {
            this.G.f15221e = true;
            EditTextBoldCursor editField = a6Var.getEditField();
            editField.requestFocus();
            org.telegram.messenger.g0.I3(editField);
        }
        if (org.telegram.messenger.g0.D) {
            i7 = 0;
        } else {
            i7 = 2;
        }
        k0(i7);
        if (!org.telegram.messenger.g0.D && !this.f39218f1 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            this.H = true;
            gk gkVar = this.V0;
            org.telegram.messenger.g0.r(gkVar);
            org.telegram.messenger.g0.h3(gkVar, 100L);
        }
    }

    @Override
    public final boolean i() {
        return this.Y0;
    }

    @Override
    public final int j() {
        return 1;
    }

    public final void j0(int i7, sh.d dVar) {
        int i10;
        sh.e eVar = this.n1;
        if (dVar != null) {
            eVar.f57434a.put(i7, dVar);
        } else {
            eVar.f57434a.remove(i7);
        }
        if (i7 == -2) {
            i10 = this.f39233o0;
        } else if (i7 == -3) {
            i10 = this.f39237q0;
        } else {
            int i11 = this.f39245u0;
            if (i11 >= 0 && i7 >= 0 && i7 < this.N) {
                i10 = i7 + i11;
            } else {
                i10 = -1;
            }
        }
        if (i10 >= 0) {
            v4.f1 K = this.f39242s.K(i10);
            if (K != null) {
                View view = K.f59122a;
                if (view instanceof org.telegram.ui.Cells.a6) {
                    ((org.telegram.ui.Cells.a6) view).f30386e.b(dVar, true);
                }
            }
            this.f39239r.g(i10);
        }
        if (dVar instanceof th.e) {
            th.e eVar2 = (th.e) dVar;
            String str = eVar2.f58216b;
            bi.m6 m6Var = new bi.m6(18, this, dVar);
            sh.p pVar = this.R;
            HashMap hashMap = pVar.f57477c;
            HashMap hashMap2 = pVar.f57476b;
            if (hashMap2.containsKey(str)) {
                m6Var.a((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(m6Var);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(pVar.f57475a).sendRequestTyped(getwebpagepreview, new d3.b(1), new org.telegram.ui.Wallet.e0(8, pVar, str));
                }
            }
            a0(eVar2, false);
        }
        Y();
    }

    @Override
    public final boolean k() {
        if (this.f39210b1) {
            e0(true);
            return true;
        } else if (!X()) {
            return true;
        } else {
            return false;
        }
    }

    public final void k0(int i7) {
        boolean z10;
        int i10;
        org.telegram.ui.Cells.a6 a6Var;
        if (this.J) {
            hi.p3 p3Var = this.G;
            yg ygVar = null;
            si siVar = this.f36766b;
            if (i7 == 1) {
                ry ryVar = this.F;
                if (ryVar != null && ryVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ry ryVar2 = this.F;
                if (ryVar2 != null && ryVar2.f39345d1 != org.telegram.messenger.j10.f24773t0) {
                    siVar.f39705p3.removeView(ryVar2);
                    this.F = null;
                }
                if (this.F == null) {
                    ry ryVar3 = new ry(null, true, false, false, getContext(), true, null, null, true, this.f36765a, false, false);
                    this.F = ryVar3;
                    ryVar3.f39340c = 3;
                    ryVar3.f39407x0 = false;
                    ryVar3.f39413y2 = false;
                    ryVar3.setShouldDrawBackground(false);
                    ry ryVar4 = this.F;
                    ryVar4.V0 = false;
                    ryVar4.setVisibility(8);
                    if (org.telegram.messenger.g0.Q1()) {
                        this.F.setForseMultiwindowLayout(true);
                    }
                    this.F.setDelegate(new wm(this));
                    siVar.f39705p3.addView(this.F);
                    this.F.setBottomInset(org.telegram.messenger.g0.f24116n);
                }
                this.F.setVisibility(0);
                this.f39210b1 = true;
                ry ryVar5 = this.F;
                if (this.f39214d1 <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.f39214d1 = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.f39214d1 = org.telegram.messenger.mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                if (this.f39216e1 <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.f39216e1 = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.f39216e1 = org.telegram.messenger.mp.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                Point point = org.telegram.messenger.g0.f24121q;
                if (point.x > point.y) {
                    i10 = this.f39216e1;
                } else {
                    i10 = this.f39214d1;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ryVar5.getLayoutParams();
                layoutParams.height = org.telegram.messenger.g0.f24116n + i10;
                ryVar5.setLayoutParams(layoutParams);
                if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1() && (a6Var = this.f39222h1) != null) {
                    org.telegram.messenger.g0.v1(a6Var.getEditField());
                }
                this.f39212c1 = i10;
                p3Var.a();
                siVar.f39705p3.requestLayout();
                org.telegram.ui.Cells.a6 a6Var2 = this.f39222h1;
                if (a6Var2 != null) {
                    ygVar = a6Var2.getEmojiButton();
                }
                if (ygVar != null) {
                    ygVar.j(wg.d, true);
                }
                if (!z10 && !this.f39218f1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39212c1, 0.0f);
                    ofFloat.addUpdateListener(new um(this, 1));
                    ofFloat.addListener(new xm(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.j1.f29019w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.a6 a6Var3 = this.f39222h1;
            if (a6Var3 != null) {
                ygVar = a6Var3.getEmojiButton();
            }
            if (ygVar != null) {
                ygVar.j(wg.f41711e, true);
            }
            ry ryVar6 = this.F;
            if (ryVar6 != null) {
                this.f39210b1 = false;
                this.f39224i1 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    ryVar6.setVisibility(8);
                }
            }
            if (i7 == 0) {
                this.f39212c1 = 0;
            }
            p3Var.a();
            siVar.f39705p3.requestLayout();
        }
    }

    public final void l0(int i7, org.telegram.messenger.y10 y10Var, int i10, int i11) {
        y60 G = y60.G(this, null, new View(getContext()));
        G.f42375s = 0;
        G.f42377t = false;
        G.c(2131232333, org.telegram.messenger.gd.M0(2131746076, null), new sm(this, i7, 1), false);
        G.c(2131232110, org.telegram.messenger.gd.M0(2131751587, null), new sm(this, i7, 2), true);
        wk0 wk0Var = new wk0(getContext(), this.f36765a);
        G.f42369p = new org.telegram.ui.fe(wk0Var, 1);
        G.V = org.telegram.messenger.g0.L(185.0f);
        G.Z();
        wk0Var.e(G);
        fh.g c10 = wk0Var.f41729n.c(null, null, false);
        c10.p(c8.i0.l(wk0Var.f41725b));
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.R.f11642e = true;
        c10.r(org.telegram.messenger.g0.L(16.0f));
        wk0Var.G = c10;
        wk0Var.F = (Drawable) y10Var.a(wk0Var.f41731s);
        Point point = org.telegram.messenger.g0.f24121q;
        int i12 = (point.x - i10) / 2;
        int i13 = (point.y - i11) / 2;
        int i14 = i10 + i12;
        int i15 = i11 + i13;
        c10.setBounds(i12 - org.telegram.messenger.g0.L(8.0f), i13 - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + i14, org.telegram.messenger.g0.L(8.0f) + i15);
        wk0Var.F.setBounds(i12, i13, i14, i15);
        ((FrameLayout.LayoutParams) wk0Var.f41734y.getLayoutParams()).gravity = 1;
        wk0Var.M = true;
        wk0Var.show();
    }

    public final void m0() {
        org.telegram.ui.ActionBar.i6 i6Var = this.f36765a;
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.N6, i6Var);
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29526k7, i6Var);
            if (w02 != this.f39238q1 || w03 != this.f39241r1) {
                this.f39238q1 = w02;
                this.f39241r1 = w03;
                Drawable drawable = this.f39234o1;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = this.f39236p1;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.f61 f61Var = this.f39242s;
                if (f61Var != null) {
                    for (int i7 = 0; i7 < f61Var.getChildCount(); i7++) {
                        View childAt = f61Var.getChildAt(i7);
                        if (childAt instanceof org.telegram.ui.Cells.m8) {
                            childAt.invalidate();
                        }
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void n0() {
        boolean z10;
        this.f39235p0 = -1;
        this.f39237q0 = -1;
        this.f39240r0 = -1;
        this.G0 = -1;
        this.C0 = -1;
        this.I0 = -1;
        this.J0 = -1;
        this.K0 = -1;
        this.L0 = -1;
        this.D0 = -1;
        this.F0 = -1;
        this.E0 = -1;
        this.H0 = -1;
        bg.w0 w0Var = this.N0;
        w0Var.f3354b = -1;
        bg.w0 w0Var2 = this.O0;
        w0Var2.f3354b = -1;
        this.M0 = -1;
        this.f39253z0 = -1;
        this.A0 = -1;
        this.f39246v0 = -1;
        this.f39245u0 = -1;
        this.f39252y0 = -1;
        this.f39233o0 = -1;
        this.m0 = 1;
        this.R0 = 3;
        this.f39232n0 = 2;
        boolean z11 = this.f39231n;
        if (!z11) {
            this.R0 = 4;
            this.f39233o0 = 3;
        }
        int i7 = this.R0;
        int i10 = i7 + 1;
        this.f39243s0 = i7;
        int i11 = i7 + 2;
        this.R0 = i11;
        this.f39244t0 = i10;
        int i12 = this.N;
        if (i12 != 0) {
            this.f39245u0 = i11;
            this.R0 = i11 + i12;
        }
        if (i12 != this.L.length) {
            int i13 = this.R0;
            this.R0 = i13 + 1;
            this.f39246v0 = i13;
        }
        int i14 = this.R0;
        this.f39248w0 = i14;
        int i15 = i14 + 2;
        this.R0 = i15;
        this.f39250x0 = i14 + 1;
        if (z11) {
            int i16 = i14 + 3;
            this.R0 = i16;
            this.A0 = i15;
            if (this.f39221h0) {
                this.R0 = i14 + 4;
                this.f39253z0 = i16;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.bn) this.f36766b.f39659a2).f45987e;
            if (org.telegram.messenger.v3.T(chat) && !chat.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int i17 = this.R0;
                this.R0 = i17 + 1;
                this.C0 = i17;
            } else {
                this.f39209b0 = true;
            }
            int i18 = this.R0;
            int i19 = i18 + 1;
            this.R0 = i19;
            this.G0 = i18;
            if (!z10) {
                this.R0 = i18 + 2;
                this.D0 = i19;
            } else {
                this.U = false;
            }
            int i20 = this.R0;
            this.E0 = i20;
            this.F0 = i20 + 1;
            int i21 = i20 + 3;
            this.R0 = i21;
            this.H0 = i20 + 2;
            if (z10) {
                w0Var.f3354b = i21;
                int i22 = i20 + 5;
                this.R0 = i22;
                w0Var2.f3354b = i20 + 4;
                if (w0Var2.f3353a) {
                    this.R0 = i20 + 6;
                    this.M0 = i22;
                }
            }
            int i23 = this.R0;
            int i24 = i23 + 1;
            this.R0 = i24;
            this.I0 = i23;
            if (this.V != 0 || this.W != 0) {
                this.J0 = i24;
                this.K0 = i23 + 2;
                this.R0 = i23 + 4;
                this.L0 = i23 + 3;
            }
            int i25 = this.R0;
            int i26 = i25 + 1;
            this.R0 = i26;
            this.f39252y0 = i25;
            if (this.f39213d0) {
                this.f39235p0 = i26;
                this.f39237q0 = i25 + 2;
                this.R0 = i25 + 4;
                this.f39240r0 = i25 + 3;
            }
        }
        int i27 = this.R0;
        this.R0 = i27 + 1;
        this.B0 = i27;
    }

    @Override
    public final void p() {
        this.I = true;
        si siVar = this.f36766b;
        org.telegram.messenger.ks.f(siVar.H3).n(this, org.telegram.messenger.ks.f25213w0);
        if (this.J) {
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25145k4);
            ry ryVar = this.F;
            if (ryVar != null) {
                siVar.f39705p3.removeView(ryVar);
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f39225j0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final boolean s() {
        if (!X()) {
            return false;
        }
        return true;
    }

    public void setDelegate(qn qnVar) {
        this.f39227k0 = qnVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f36766b.f30192b.invalidate();
    }

    @Override
    public final void t() {
        this.f36766b.M1();
    }

    @Override
    public final void updateColors() {
        try {
            this.f39228k1.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Yl, this.f36765a));
            m0();
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void v(float f10) {
        this.f36766b.M1();
    }

    @Override
    public final void w(int i7) {
        int i10;
        boolean z10;
        if (i7 == 40) {
            boolean z11 = this.f39231n;
            int i11 = 0;
            int i12 = 1;
            si siVar = this.f36766b;
            CharSequence[] charSequenceArr = this.L;
            if (z11) {
                CharSequence[] charSequenceArr2 = {d0(this.O)};
                int i13 = siVar.H3;
                ArrayList<TLRPC.MessageEntity> Y = org.telegram.messenger.ri.d0(i13).Y(charSequenceArr2, true, true);
                CharSequence charSequence = charSequenceArr2[0];
                if (Y != null) {
                    int size = Y.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        TLRPC.MessageEntity messageEntity = Y.get(i14);
                        if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                            messageEntity.length = charSequence.length() - messageEntity.offset;
                        }
                    }
                }
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
                TLRPC.TodoList todoList = new TLRPC.TodoList();
                tL_messageMediaToDo.todo = todoList;
                boolean z12 = this.f39221h0;
                if (z12 && this.f39219g0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                todoList.others_can_append = z10;
                todoList.others_can_complete = z12;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = Y;
                for (int i15 = 0; i15 < charSequenceArr.length; i15++) {
                    if (!TextUtils.isEmpty(d0(charSequenceArr[i15]))) {
                        CharSequence[] charSequenceArr3 = {d0(charSequenceArr[i15])};
                        ArrayList<TLRPC.MessageEntity> Y2 = org.telegram.messenger.ri.d0(i13).Y(charSequenceArr3, true, true);
                        CharSequence charSequence2 = charSequenceArr3[0];
                        if (Y2 != null) {
                            int size2 = Y2.size();
                            for (int i16 = 0; i16 < size2; i16++) {
                                TLRPC.MessageEntity messageEntity2 = Y2.get(i16);
                                if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                    messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                                }
                            }
                        }
                        TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        todoItem.title = tL_textWithEntities;
                        tL_textWithEntities.text = charSequence2.toString();
                        todoItem.title.entities = Y2;
                        todoItem.f28552id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                b5.X(i13, siVar.Y0() + 1, siVar.c1(), new bi.j(this, (org.telegram.ui.bn) siVar.f39659a2, tL_messageMediaToDo, 12));
                return;
            }
            boolean z13 = this.f39213d0;
            org.telegram.ui.f61 f61Var = this.f39242s;
            boolean[] zArr = this.M;
            if (z13 && !this.Y0) {
                int i17 = 0;
                while (i11 < zArr.length) {
                    if (!TextUtils.isEmpty(d0(charSequenceArr[i11])) && zArr[i11]) {
                        i17++;
                    }
                    i11++;
                }
                if (i17 <= 0) {
                    for (int i18 = this.f39245u0; i18 < this.f39245u0 + this.N; i18++) {
                        v4.f1 K = f61Var.K(i18);
                        if (K != null) {
                            View view = K.f59122a;
                            if (view instanceof org.telegram.ui.Cells.a6) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                                if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f)) {
                                    in inVar = this.f39251y;
                                    if (inVar != null) {
                                        inVar.f();
                                    }
                                    String M0 = org.telegram.messenger.gd.M0(2131746962, null);
                                    j30 j30Var = this.E;
                                    j30Var.setText(M0);
                                    j30Var.c(a6Var.getCheckBox());
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            int i19 = 0;
            while (true) {
                int length = charSequenceArr.length;
                sh.e eVar = this.n1;
                if (i19 < length) {
                    if (TextUtils.isEmpty(d0(charSequenceArr[i19])) && eVar.b(i19) != null) {
                        this.W0 = true;
                        this.X0 = i19;
                        f61Var.y0(this.f39245u0 + i19);
                        return;
                    }
                    i19++;
                } else {
                    CharSequence[] charSequenceArr4 = {d0(this.O)};
                    int i20 = siVar.H3;
                    ArrayList<TLRPC.MessageEntity> Y3 = org.telegram.messenger.ri.d0(i20).Y(charSequenceArr4, true, true);
                    CharSequence charSequence3 = charSequenceArr4[0];
                    if (Y3 != null) {
                        int size3 = Y3.size();
                        for (int i21 = 0; i21 < size3; i21++) {
                            TLRPC.MessageEntity messageEntity3 = Y3.get(i21);
                            if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                                messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                            }
                        }
                    }
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                    TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                    tL_messageMediaPoll.poll = tL_poll;
                    tL_poll.multiple_choice = this.f39211c0;
                    tL_poll.quiz = this.f39213d0;
                    tL_poll.public_voters = !this.f39209b0;
                    tL_poll.open_answers = this.U;
                    tL_poll.revoting_disabled = !this.S;
                    tL_poll.shuffle_answers = this.T;
                    tL_poll.subscribers_only = this.N0.f3353a;
                    if (this.O0.f3353a) {
                        ArrayList arrayList = this.Q0;
                        if (!arrayList.isEmpty()) {
                            TLRPC.Poll poll = tL_messageMediaPoll.poll;
                            poll.flags |= 4096;
                            poll.countries_iso2.addAll(arrayList);
                        }
                    }
                    TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
                    poll2.creator = true;
                    int i22 = this.V;
                    if (i22 != 0) {
                        poll2.hide_results_until_close = this.f39207a0;
                        poll2.close_period = i22;
                        poll2.flags |= 16;
                    } else {
                        int i23 = this.W;
                        if (i23 != 0) {
                            poll2.hide_results_until_close = this.f39207a0;
                            poll2.close_date = i23;
                            poll2.flags |= 32;
                        }
                    }
                    poll2.question = new TLRPC.TL_textWithEntities();
                    tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                    tL_messageMediaPoll.poll.question.entities = Y3;
                    ArrayList arrayList2 = new ArrayList(this.K);
                    int i24 = 0;
                    while (i24 < charSequenceArr.length) {
                        if (TextUtils.isEmpty(d0(charSequenceArr[i24]))) {
                            eVar.h(tL_messageMediaPoll.poll.answers.size());
                            i10 = i11;
                        } else {
                            CharSequence[] charSequenceArr5 = new CharSequence[i12];
                            charSequenceArr5[i11] = d0(charSequenceArr[i24]);
                            ArrayList<TLRPC.MessageEntity> Y4 = org.telegram.messenger.ri.d0(i20).Y(charSequenceArr5, i12, i12);
                            CharSequence charSequence4 = charSequenceArr5[i11];
                            if (Y4 != null) {
                                int size4 = Y4.size();
                                int i25 = i11;
                                while (i25 < size4) {
                                    TLRPC.MessageEntity messageEntity4 = Y4.get(i25);
                                    int i26 = i11;
                                    if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                                        messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                                    }
                                    i25++;
                                    i11 = i26;
                                }
                            }
                            i10 = i11;
                            TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                            tL_pollAnswer.text = tL_textWithEntities2;
                            tL_textWithEntities2.text = charSequence4.toString();
                            tL_pollAnswer.text.entities = Y4;
                            byte[] bArr = new byte[1];
                            tL_pollAnswer.option = bArr;
                            bArr[i10] = (byte) (tL_messageMediaPoll.poll.answers.size() + 48);
                            if ((this.f39211c0 || this.f39213d0) && zArr[i24]) {
                                arrayList2.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                            }
                            tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                        }
                        i24++;
                        i11 = i10;
                        i12 = 1;
                    }
                    int i27 = i11;
                    tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                    CharSequence d02 = d0(this.Q);
                    if (d02 != null) {
                        tL_messageMediaPoll.results.solution = d02.toString();
                        CharSequence[] charSequenceArr6 = new CharSequence[1];
                        charSequenceArr6[i27] = d02;
                        ArrayList<TLRPC.MessageEntity> Y5 = org.telegram.messenger.ri.d0(i20).Y(charSequenceArr6, true, true);
                        if (Y5 != null && !Y5.isEmpty()) {
                            tL_messageMediaPoll.results.solution_entities = Y5;
                        }
                        if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                            tL_messageMediaPoll.results.flags |= 16;
                        }
                    }
                    b5.X(i20, siVar.Y0() + 1, siVar.c1(), new bi.i2(this, (org.telegram.ui.bn) siVar.f39659a2, tL_messageMediaPoll, arrayList2, 9));
                    return;
                }
            }
        }
    }
}
