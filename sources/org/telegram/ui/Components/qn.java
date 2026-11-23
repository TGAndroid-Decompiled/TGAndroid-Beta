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
public final class qn extends li implements org.telegram.ui.ActionBar.c6, bu0, org.telegram.messenger.fs {
    public static final int f38908s1 = 0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public final j30 E;
    public int E0;
    public qy F;
    public int F0;
    public final hi.x3 G;
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
    public final sh.o R;
    public int R0;
    public boolean S;
    public int S0;
    public boolean T;
    public final int T0;
    public boolean U;
    public final int[] U0;
    public int V;
    public final rc V0;
    public int W;
    public boolean W0;
    public int X0;
    public boolean Y0;
    public int Z0;
    public boolean f38909a0;
    public boolean f38910a1;
    public boolean f38911b0;
    public boolean f38912b1;
    public boolean f38913c0;
    public int f38914c1;
    public boolean f38915d0;
    public int f38916d1;
    public boolean f38917e0;
    public int f38918e1;
    public final boolean f38919f0;
    public boolean f38920f1;
    public boolean f38921g0;
    public boolean f38922g1;
    public boolean f38923h0;
    public org.telegram.ui.Cells.a6 f38924h1;
    public boolean f38925i0;
    public boolean f38926i1;
    public boolean f38927j0;
    public boolean f38928j1;
    public pn f38929k0;
    public final Paint f38930k1;
    public int f38931l0;
    public fi.n2 l1;
    public int m0;
    public int f38932m1;
    public final boolean f38933n;
    public int f38934n0;
    public final sh.d n1;
    public int f38935o0;
    public Drawable f38936o1;
    public int f38937p0;
    public Drawable f38938p1;
    public int f38939q0;
    public int f38940q1;
    public final org.telegram.ui.l4 f38941r;
    public int f38942r0;
    public int f38943r1;
    public final org.telegram.ui.d61 f38944s;
    public int f38945s0;
    public int f38946t0;
    public int f38947u0;
    public int f38948v0;
    public final fn f38949w;
    public int f38950w0;
    public final kg.d0 f38951x;
    public int f38952x0;
    public final hn f38953y;
    public int f38954y0;
    public int f38955z0;

    public qn(ti tiVar, Context context, boolean z10, org.telegram.ui.ActionBar.i6 i6Var, Boolean bool) {
        super(context, i6Var, tiVar);
        this.N = 1;
        this.S = true;
        this.T = true;
        this.U = true;
        this.f38913c0 = true;
        this.f38921g0 = true;
        this.f38923h0 = true;
        this.f38931l0 = -1;
        bg.w0 w0Var = new bg.w0(this);
        this.N0 = w0Var;
        bg.w0 w0Var2 = new bg.w0(this);
        this.O0 = w0Var2;
        this.P0 = new bg.w0[]{w0Var, w0Var2};
        ArrayList arrayList = new ArrayList();
        this.Q0 = arrayList;
        this.U0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.V0 = new rc(this, 3);
        this.W0 = false;
        this.X0 = -1;
        this.f38926i1 = false;
        this.f38928j1 = false;
        Paint paint = new Paint(1);
        this.f38930k1 = paint;
        this.n1 = new sh.d();
        this.f38933n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.K = answersMaxCount;
        this.L = new CharSequence[answersMaxCount];
        this.M = new boolean[answersMaxCount];
        boolean q10 = org.telegram.messenger.i10.i(org.telegram.messenger.c.a(this.f37135b.H3).f23343a).q();
        this.J = q10;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.f38915d0 = booleanValue;
            this.f38919f0 = booleanValue;
            boolean z11 = !booleanValue;
            this.U = z11;
            this.S = z11;
        }
        n0();
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Yl, this.f37134a));
        this.f37135b.f40002p3.setDelegate(this);
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(1, this, context);
        this.f38941r = l4Var;
        org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(5, context, null);
        this.f38944s = d61Var;
        setBlur3Capture(d61Var);
        this.d = d61Var;
        this.h = true;
        this.f37138f = true;
        fn fnVar = new fn(this);
        this.f38949w = fnVar;
        d61Var.setItemAnimator(fnVar);
        arrayList.clear();
        fnVar.f59274m = false;
        fnVar.C = false;
        fnVar.o(kr.h);
        fnVar.n(350L);
        d61Var.setClipToPadding(false);
        d61Var.setVerticalScrollBarEnabled(false);
        d61Var.setSections(true);
        kg.d0 d0Var = new kg.d0(this, org.telegram.messenger.g0.L(65.0f) + org.telegram.messenger.g0.f24220m, d61Var, 4);
        this.f38951x = d0Var;
        d61Var.setLayoutManager(d0Var);
        d0Var.O = true;
        new v4.z(new gi.c(this, 4)).h(d61Var);
        addView(d61Var, c8.na.e(-1, -1, 51));
        d61Var.setPreserveFocusAfterLayout(true);
        d61Var.setAdapter(l4Var);
        d61Var.setOnItemClickListener(new vm(this, i6Var, tiVar, context));
        d61Var.setOnScrollListener(new na(this, 6));
        j30 j30Var = new j30(context, 4);
        this.E = j30Var;
        j30Var.setAlpha(0.0f);
        j30Var.setVisibility(4);
        addView(j30Var, c8.na.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.T0 = ((org.telegram.messenger.j0) org.telegram.messenger.mp.u1(this.f37135b.H3).A7.O.f15482b).f24899c;
        this.R = new sh.o(this.f37135b.H3);
        org.telegram.messenger.ks.f(this.f37135b.H3).c(this, org.telegram.messenger.ks.f25310w0);
        if (q10) {
            org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25247l4);
            ?? zw0Var = new zw0(context, this.f37135b.H3, null, i6Var);
            this.f38953y = zw0Var;
            zw0Var.E = true;
            zw0Var.F = true;
            zw0Var.setHorizontalPadding(org.telegram.messenger.g0.L(24.0f));
            addView((View) zw0Var, c8.na.e(-2, 160, 51));
        }
        this.G = new hi.x3(this.f37135b.f40002p3, false, null);
        Y();
    }

    public static void P(qn qnVar, int i7) {
        j30 j30Var = qnVar.E;
        v4.f1 K = qnVar.f38944s.K(qnVar.f38947u0 + i7);
        if (K != null) {
            View view = K.f59245a;
            if (view instanceof org.telegram.ui.Cells.a6) {
                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f)) {
                    hn hnVar = qnVar.f38953y;
                    if (hnVar != null) {
                        hnVar.f();
                    }
                    j30Var.setText(org.telegram.messenger.gd.N0(2131746988, null));
                    j30Var.c(a6Var.getCheckBox());
                    ImageView imageView = j30Var.f36249b;
                    imageView.setTranslationX(imageView.getTranslationX() + org.telegram.messenger.g0.L(48.0f));
                    j30Var.setTranslationY(j30Var.getTranslationY() + org.telegram.messenger.g0.L(10.0f));
                }
            }
        }
    }

    public static void Q(org.telegram.ui.Components.qn r5, android.view.View r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qn.Q(org.telegram.ui.Components.qn, android.view.View, int):void");
    }

    public static void R(qn qnVar, org.telegram.ui.Cells.a6 a6Var, boolean z10) {
        v4.f1 T;
        if (qnVar.J && z10) {
            if (qnVar.f38924h1 == a6Var && qnVar.f38912b1 && qnVar.f38926i1) {
                qnVar.b0();
                qnVar.f38912b1 = false;
            }
            org.telegram.ui.Cells.a6 a6Var2 = qnVar.f38924h1;
            qnVar.f38924h1 = a6Var;
            a6Var.setEmojiButtonVisibility(true);
            zg emojiButton = a6Var.getEmojiButton();
            xg xgVar = xg.f41996e;
            emojiButton.j(xgVar, false);
            org.telegram.ui.d61 d61Var = qnVar.f38944s;
            View F = d61Var.F(a6Var);
            if (F == null) {
                T = null;
            } else {
                T = d61Var.T(F);
            }
            hn hnVar = qnVar.f38953y;
            if (hnVar != null) {
                hnVar.f();
                if (T != null) {
                    View view = T.f59245a;
                    if ((view instanceof org.telegram.ui.Cells.a6) && hnVar.getDelegate() != view) {
                        hnVar.setDelegate((org.telegram.ui.Cells.a6) view);
                    }
                }
            }
            if (a6Var2 != null && a6Var2 != a6Var) {
                if (qnVar.f38912b1) {
                    qnVar.b0();
                    qnVar.e0(false);
                    qnVar.h0();
                }
                a6Var2.setEmojiButtonVisibility(false);
                a6Var2.getEmojiButton().j(xgVar, false);
            }
        }
    }

    public static void S(qn qnVar, org.telegram.ui.Cells.a6 a6Var) {
        qnVar.f38924h1 = a6Var;
        if (qnVar.f38912b1) {
            qnVar.b0();
            qnVar.h0();
            return;
        }
        qnVar.k0(1);
    }

    public static void T(qn qnVar, int i7) {
        ti tiVar;
        org.telegram.ui.ActionBar.g2 g2Var;
        int i10;
        sh.d dVar = qnVar.n1;
        if (dVar.b(i7) != null) {
            sh.c b10 = dVar.b(i7);
            if (b10 != null && (tiVar = qnVar.f37135b) != null && (g2Var = tiVar.f39956a2) != null) {
                Activity parentActivity = g2Var.getParentActivity();
                if (b10 instanceof th.d) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((th.d) b10).f58340b);
                    PhotoViewer.p1().J2(parentActivity, null, null);
                    PhotoViewer.p1().g2(arrayList, 0, 14, false, new ym(qnVar, i7), null);
                    return;
                } else if (b10 instanceof th.h) {
                    th.h hVar = (th.h) b10;
                    org.telegram.ui.ns.p().v(parentActivity);
                    org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                    ?? obj = new Object();
                    obj.f33498b = qnVar;
                    obj.f33497a = i7;
                    p10.u(obj);
                    org.telegram.ui.ns p11 = org.telegram.ui.ns.p();
                    TLRPC.Document document = hVar.f58352b;
                    if (org.telegram.messenger.fj.H2(document)) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    p11.s(document, null, "", null, null, i10, false, hVar.f58353c, qnVar.f37134a, 200);
                    return;
                } else if (b10 instanceof th.c) {
                    th.c cVar = (th.c) b10;
                    String str = cVar.d;
                    qnVar.l0(i7, new org.telegram.ui.ef(1, str, org.telegram.messenger.g0.i0(cVar.f58337e, true, true) + " " + cVar.f58338f), org.telegram.messenger.g0.L(240.0f), org.telegram.messenger.g0.L(60.0f));
                    return;
                } else if (b10 instanceof th.g) {
                    th.g gVar = (th.g) b10;
                    TLRPC.Document F0 = gVar.f58350b.F0();
                    String x12 = org.telegram.messenger.fj.x1(F0);
                    qnVar.l0(i7, new hi.b5(x12, org.telegram.messenger.fj.v1(F0) + " - " + org.telegram.messenger.gd.R((int) org.telegram.messenger.fj.H0(F0)), gVar, 2), org.telegram.messenger.g0.L(240.0f), org.telegram.messenger.g0.L(60.0f));
                    return;
                } else if (b10 instanceof th.f) {
                    qnVar.l0(i7, new vi((th.f) b10, 1), org.telegram.messenger.g0.L(300.0f), (org.telegram.messenger.g0.L(300.0f) * 9) / 16);
                    return;
                } else if (b10 instanceof th.e) {
                    th.e eVar = (th.e) b10;
                    b5.d0(qnVar.getContext(), qnVar.f37134a, eVar.f58342b, eVar.f58346n, new qm(qnVar, i7, 1), new sm(qnVar, i7, 0));
                    return;
                } else {
                    qnVar.g0(i7);
                    return;
                }
            }
            return;
        }
        qnVar.g0(i7);
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
        if (this.f38933n) {
            return getMessagesController().U6;
        }
        return ((org.telegram.messenger.j0) getMessagesController().A7.L.f15482b).f24899c;
    }

    private int getCurrentAccount() {
        ti tiVar = this.f37135b;
        if (tiVar != null) {
            return tiVar.H3;
        }
        return org.telegram.messenger.i10.f24637t0;
    }

    private org.telegram.messenger.mp getMessagesController() {
        return org.telegram.messenger.mp.u1(getCurrentAccount());
    }

    public static fi.n2 i0(org.telegram.ui.ActionBar.g2 g2Var, int i7, org.telegram.messenger.w10 w10Var, ng ngVar) {
        if (g2Var == null) {
            return null;
        }
        fi.n2 n2Var = new fi.n2(g2Var.getContext(), g2Var, g2Var.getResourceProvider(), ngVar);
        n2Var.X3 = new cn(n2Var, w10Var, g2Var);
        n2Var.Y3 = new dn(w10Var, n2Var);
        n2Var.f39967e2.i0();
        n2Var.z1(1, true);
        n2Var.W0(i7);
        n2Var.f40023u4 = new tm(w10Var);
        n2Var.S1 = new en(n2Var, w10Var, g2Var);
        n2Var.T1 = new g2(14, w10Var, n2Var);
        n2Var.f1();
        n2Var.A0(true);
        n2Var.show();
        return n2Var;
    }

    @Override
    public final void A() {
        org.telegram.ui.l4 l4Var = this.f38941r;
        if (l4Var != null) {
            l4Var.f();
        }
        if (this.J) {
            e0(false);
            hn hnVar = this.f38953y;
            if (hnVar != null) {
                hnVar.f();
            }
            org.telegram.ui.Cells.a6 a6Var = this.f38924h1;
            if (a6Var != null) {
                a6Var.setEmojiButtonVisibility(false);
                this.f38924h1.getTextView().clearFocus();
                org.telegram.messenger.g0.v1(this.f38924h1.getEditField());
            }
        }
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qn.B(int, int):void");
    }

    @Override
    public final void H(li liVar) {
        ti tiVar = this.f37135b;
        try {
            tiVar.V2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.f38933n) {
            tiVar.V2.setTitle(org.telegram.messenger.gd.N0(2131743809, null));
        } else if (this.f38919f0) {
            tiVar.V2.setTitle(org.telegram.messenger.gd.N0(2131748071, null));
        } else {
            tiVar.V2.setTitle(org.telegram.messenger.gd.N0(2131748072, null));
        }
        tiVar.M1();
        this.f38951x.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f38944s.y0(1);
    }

    @Override
    public final void L(int i7, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        int L;
        if (this.J) {
            if (i7 > org.telegram.messenger.g0.L(50.0f) && this.f38920f1 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                if (z10) {
                    this.f38918e1 = i7;
                    org.telegram.messenger.mp.f1().edit().putInt("kbd_height_land3", this.f38918e1).commit();
                } else {
                    this.f38916d1 = i7;
                    org.telegram.messenger.mp.f1().edit().putInt("kbd_height", this.f38916d1).commit();
                }
            }
            boolean z13 = this.f38912b1;
            ti tiVar = this.f37135b;
            hi.x3 x3Var = this.G;
            if (z13) {
                if (z10) {
                    i10 = this.f38918e1;
                } else {
                    i10 = this.f38916d1;
                }
                if (this.f38926i1) {
                    i10 += org.telegram.messenger.g0.L(120.0f);
                }
                int i11 = i10 + org.telegram.messenger.g0.f24221n;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = org.telegram.messenger.g0.f24226q.x;
                if (i12 != i13 || layoutParams.height != i11 || this.f38928j1 != this.f38926i1) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.F.setLayoutParams(layoutParams);
                    this.f38914c1 = layoutParams.height;
                    x3Var.a();
                    tiVar.f40002p3.requestLayout();
                    boolean z14 = this.f38928j1;
                    if (z14 != this.f38926i1) {
                        if (z14) {
                            L = -org.telegram.messenger.g0.L(120.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(120.0f);
                        }
                        V(L);
                    }
                    this.f38928j1 = this.f38926i1;
                }
            }
            if (this.Z0 != i7 || this.f38910a1 != z10) {
                this.Z0 = i7;
                this.f38910a1 = z10;
                boolean z15 = this.f38920f1;
                org.telegram.ui.Cells.a6 a6Var = this.f38924h1;
                if (a6Var != null) {
                    if (a6Var.getEditField().isFocused() && x3Var.c() && i7 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f38920f1 = z12;
                } else {
                    this.f38920f1 = false;
                }
                if (this.f38920f1 && this.f38912b1) {
                    k0(0);
                }
                if (this.f38914c1 != 0 && !(z11 = this.f38920f1) && z11 != z15 && !this.f38912b1) {
                    this.f38914c1 = 0;
                    x3Var.a();
                    tiVar.f40002p3.requestLayout();
                }
                if (this.f38920f1 && this.H) {
                    this.H = false;
                    org.telegram.messenger.g0.r(this.V0);
                }
            }
        }
    }

    public final void U() {
        hn hnVar = this.f38953y;
        if (hnVar != null) {
            hnVar.setDelegate(null);
            hnVar.f();
        }
        this.f38944s.setItemAnimator(this.f38949w);
        int i7 = this.N;
        this.M[i7] = false;
        int i10 = i7 + 1;
        this.N = i10;
        int length = this.L.length;
        org.telegram.ui.l4 l4Var = this.f38941r;
        if (i10 == length) {
            l4Var.s(this.f38948v0);
        }
        l4Var.i(this.f38948v0);
        n0();
        this.f38931l0 = (this.f38947u0 + this.N) - 1;
        l4Var.g(this.f38950w0);
        l4Var.g(this.B0);
    }

    public final void V(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.rf(this, f10, 4));
        ofFloat.addListener(new xm(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f29066w);
        ofFloat.start();
    }

    public final void W() {
        boolean z10;
        if (!this.f38915d0 && !this.f38911b0) {
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
        v4.f1 K = this.f38944s.K(i7);
        if (K == null) {
            this.f38941r.g(this.D0);
            return;
        }
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) K.f59245a;
        if (!z10) {
            y5Var.setChecked(false);
        }
        y5Var.getCheckBox().f33232a.a(!z10, true);
    }

    public final boolean X() {
        boolean z10;
        int i7;
        int i10;
        if (TextUtils.isEmpty(d0(this.O)) && TextUtils.isEmpty(d0(this.P)) && TextUtils.isEmpty(d0(this.Q)) && this.n1.f57553a.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            for (int i11 = 0; i11 < this.N && (z10 = TextUtils.isEmpty(d0(this.L[i11]))); i11++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f37135b.f39956a2.getParentActivity());
            boolean z11 = this.f38933n;
            if (z11) {
                i7 = 2131752555;
            } else {
                i7 = 2131752561;
            }
            String N0 = org.telegram.messenger.gd.N0(i7, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            if (z11) {
                i10 = 2131752556;
            } else {
                i10 = 2131752562;
            }
            t1Var.U = org.telegram.messenger.gd.N0(i10, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747386, null), new b0(this, 22));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            alertDialog$Builder.p();
        }
        return z10;
    }

    public final void Y() {
        int i7;
        int i10;
        int i11;
        boolean z10;
        boolean z11 = this.f38915d0;
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
        boolean z12 = this.f38933n;
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
        if (i14 < 1 || (this.f38915d0 && i7 < 1)) {
            z10 = false;
        }
        if (TextUtils.isEmpty(this.Q) && TextUtils.isEmpty(this.O) && TextUtils.isEmpty(this.P) && !z13 && this.n1.f57553a.size() <= 0) {
            this.f38925i0 = true;
        } else {
            this.f38925i0 = false;
        }
        boolean z14 = this.f38925i0;
        ti tiVar = this.f37135b;
        tiVar.f30257r0 = z14;
        this.Y0 = z10;
        tiVar.M1();
    }

    public final void Z(org.telegram.ui.Cells.m8 m8Var, boolean z10) {
        if (this.W != 0) {
            m8Var.q(org.telegram.messenger.gd.N0(2131746936, null), org.telegram.messenger.gd.Q(this.W), z10, false);
        } else if (this.V != 0) {
            m8Var.q(org.telegram.messenger.gd.N0(2131746938, null), org.telegram.messenger.gd.G(this.V / 3600, "Hours", new Object[0]), z10, false);
        } else {
            m8Var.q(org.telegram.messenger.gd.N0(2131746936, null), null, z10, false);
        }
    }

    public final void a0(th.e eVar, boolean z10) {
        boolean z11;
        TLRPC.Photo photo;
        String str = eVar.f58342b;
        sh.o oVar = this.R;
        boolean containsKey = oVar.f57596c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) oVar.f57595b.get(eVar.f58342b);
        te.a aVar = eVar.f58348s;
        ImageReceiver imageReceiver = eVar.f57552a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z11 = false;
        } else {
            z11 = true;
        }
        eVar.f58347r.a(z11, z10);
        eVar.f58346n = webPage;
        if (webPage != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 40, false, null, false);
            imageReceiver.s0(org.telegram.messenger.fc.f(org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(36.0f), false, w10, true), webPage.photo), "48_48", org.telegram.messenger.fc.f(w10, webPage.photo), "48_48_b", null, 0L, null, webPage, 1);
            aVar.a(true, z10);
            return;
        }
        aVar.a(false, z10);
        imageReceiver.f();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Zl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29862z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Mi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29394a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29415b7));
    }

    public final void b0() {
        if (this.f38926i1) {
            this.F.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
            layoutParams.height -= org.telegram.messenger.g0.L(120.0f);
            this.F.setLayoutParams(layoutParams);
            this.f38914c1 = layoutParams.height;
            this.f38928j1 = this.f38926i1;
            this.f38926i1 = false;
            V(-org.telegram.messenger.g0.L(120.0f));
        }
    }

    public final void c0(android.view.View r10, org.telegram.ui.Cells.a6 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qn.c0(android.view.View, org.telegram.ui.Cells.a6, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i7 == org.telegram.messenger.ks.f25310w0) {
            a0.h hVar = (a0.h) objArr[0];
            for (Map.Entry entry : this.R.f57595b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) hVar.f(((TLRPC.WebPage) entry.getValue()).f28647id)) != null) {
                    entry.setValue(webPage);
                }
            }
            sh.d dVar = this.n1;
            int size = dVar.f57553a.size();
            for (int i11 = 0; i11 < size; i11++) {
                sh.c cVar = (sh.c) dVar.f57553a.get(i11);
                if (cVar instanceof th.e) {
                    a0((th.e) cVar, true);
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25247l4) {
            qy qyVar = this.F;
            if (qyVar != null) {
                qyVar.Q.g1();
            }
            org.telegram.ui.Cells.a6 a6Var = this.f38924h1;
            if (a6Var != null) {
                int currentTextColor = a6Var.getEditField().getCurrentTextColor();
                this.f38924h1.getEditField().setTextColor(-1);
                this.f38924h1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0(boolean z10) {
        if (this.J) {
            if (this.f38912b1) {
                qy qyVar = this.F;
                qyVar.Q.C0();
                qyVar.J.scrollTo(0, 0);
                qyVar.E(1);
                qyVar.R.h1(0, 0);
                this.F.t(false);
                if (z10) {
                    this.F.A();
                }
                this.f38926i1 = false;
                k0(0);
            }
            if (z10) {
                qy qyVar2 = this.F;
                if (qyVar2 != null && qyVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.F.getMeasuredHeight());
                    ofFloat.addUpdateListener(new um(this, 0));
                    this.f38922g1 = true;
                    ofFloat.addListener(new xm(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f29066w);
                    ofFloat.start();
                    return;
                }
                f0();
            }
        }
    }

    public final void f0() {
        qy qyVar;
        zg emojiButton;
        if (!this.f38912b1 && (qyVar = this.F) != null && qyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.a6 a6Var = this.f38924h1;
            if (a6Var != null && (emojiButton = a6Var.getEmojiButton()) != null) {
                emojiButton.j(xg.f41996e, false);
            }
            this.F.setVisibility(8);
        }
        int i7 = this.f38914c1;
        this.f38914c1 = 0;
        if (i7 != 0) {
            this.G.a();
        }
    }

    public final void g0(int i7) {
        int i10;
        this.f38932m1 = i7;
        org.telegram.ui.ActionBar.g2 g2Var = this.f37135b.f39956a2;
        this.n1.b(i7);
        if (i7 != -2 && i7 != -3) {
            i10 = 41026;
        } else {
            i10 = 74;
        }
        this.l1 = i0(g2Var, i10, new qm(this, i7, 0), new ng(this, 29));
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
        org.telegram.ui.d61 d61Var = this.f38944s;
        if (d61Var.getChildCount() <= 1 || (childAt = d61Var.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View F = d61Var.F(childAt);
        if (F == null) {
            T = null;
        } else {
            T = d61Var.T(F);
        }
        mj0 mj0Var = (mj0) T;
        int y10 = (((int) childAt.getY()) - org.telegram.messenger.g0.f24220m) - org.telegram.messenger.g0.L(20.0f);
        if (y10 > 0 && mj0Var != null && mj0Var.b() == 1) {
            i7 = y10;
        } else {
            i7 = 0;
        }
        if (y10 < 0 || mj0Var == null || mj0Var.b() != 1) {
            y10 = i7;
        }
        return org.telegram.messenger.g0.L(25.0f) + y10;
    }

    public int getEmojiPadding() {
        return this.f38914c1;
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
        org.telegram.ui.d61 d61Var = this.f38944s;
        arrayList.add(new org.telegram.ui.ActionBar.w6(d61Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(d61Var, 16, new Class[]{in.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29394a7));
        int i10 = org.telegram.ui.ActionBar.n6.f29672p7;
        arrayList.add(new org.telegram.ui.ActionBar.w6(d61Var, 262144, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        int i11 = org.telegram.ui.ActionBar.n6.f29616m6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(d61Var, 8388608, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"deleteImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(d61Var, 8388608, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"moveImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(d61Var, 262144, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(d61Var, 0, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        int i12 = org.telegram.ui.ActionBar.n6.f29581k7;
        arrayList.add(new org.telegram.ui.ActionBar.w6(d61Var, 0, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.w6(d61Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.M6));
        int i13 = org.telegram.ui.ActionBar.n6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(d61Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.w6(d61Var, 32, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.w6(d61Var, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i12));
        return arrayList;
    }

    public final void h0() {
        int i7;
        org.telegram.ui.Cells.a6 a6Var = this.f38924h1;
        if (a6Var != null) {
            this.G.f15711e = true;
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
        if (!org.telegram.messenger.g0.D && !this.f38920f1 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            this.H = true;
            rc rcVar = this.V0;
            org.telegram.messenger.g0.r(rcVar);
            org.telegram.messenger.g0.h3(rcVar, 100L);
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

    public final void j0(int i7, sh.c cVar) {
        int i10;
        sh.d dVar = this.n1;
        if (cVar != null) {
            dVar.f57553a.put(i7, cVar);
        } else {
            dVar.f57553a.remove(i7);
        }
        if (i7 == -2) {
            i10 = this.f38935o0;
        } else if (i7 == -3) {
            i10 = this.f38939q0;
        } else {
            int i11 = this.f38947u0;
            if (i11 >= 0 && i7 >= 0 && i7 < this.N) {
                i10 = i7 + i11;
            } else {
                i10 = -1;
            }
        }
        if (i10 >= 0) {
            v4.f1 K = this.f38944s.K(i10);
            if (K != null) {
                View view = K.f59245a;
                if (view instanceof org.telegram.ui.Cells.a6) {
                    ((org.telegram.ui.Cells.a6) view).f30476e.b(cVar, true);
                }
            }
            this.f38941r.g(i10);
        }
        if (cVar instanceof th.e) {
            th.e eVar = (th.e) cVar;
            String str = eVar.f58342b;
            bi.r6 r6Var = new bi.r6(18, this, cVar);
            sh.o oVar = this.R;
            HashMap hashMap = oVar.f57596c;
            HashMap hashMap2 = oVar.f57595b;
            if (hashMap2.containsKey(str)) {
                r6Var.a((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(r6Var);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(oVar.f57594a).sendRequestTyped(getwebpagepreview, new d3.b(1), new org.telegram.ui.Wallet.f0(8, oVar, str));
                }
            }
            a0(eVar, false);
        }
        Y();
    }

    @Override
    public final boolean k() {
        if (this.f38912b1) {
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
            hi.x3 x3Var = this.G;
            zg zgVar = null;
            ti tiVar = this.f37135b;
            if (i7 == 1) {
                qy qyVar = this.F;
                if (qyVar != null && qyVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qy qyVar2 = this.F;
                if (qyVar2 != null && qyVar2.f39047d1 != org.telegram.messenger.i10.f24637t0) {
                    tiVar.f40002p3.removeView(qyVar2);
                    this.F = null;
                }
                if (this.F == null) {
                    qy qyVar3 = new qy(null, true, false, false, getContext(), true, null, null, true, this.f37134a, false, false);
                    this.F = qyVar3;
                    qyVar3.f39042c = 3;
                    qyVar3.f39109x0 = false;
                    qyVar3.f39115y2 = false;
                    qyVar3.setShouldDrawBackground(false);
                    qy qyVar4 = this.F;
                    qyVar4.V0 = false;
                    qyVar4.setVisibility(8);
                    if (org.telegram.messenger.g0.Q1()) {
                        this.F.setForseMultiwindowLayout(true);
                    }
                    this.F.setDelegate(new wm(this));
                    tiVar.f40002p3.addView(this.F);
                    this.F.setBottomInset(org.telegram.messenger.g0.f24221n);
                }
                this.F.setVisibility(0);
                this.f38912b1 = true;
                qy qyVar5 = this.F;
                if (this.f38916d1 <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.f38916d1 = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.f38916d1 = org.telegram.messenger.mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                if (this.f38918e1 <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.f38918e1 = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.f38918e1 = org.telegram.messenger.mp.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                Point point = org.telegram.messenger.g0.f24226q;
                if (point.x > point.y) {
                    i10 = this.f38918e1;
                } else {
                    i10 = this.f38916d1;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qyVar5.getLayoutParams();
                layoutParams.height = org.telegram.messenger.g0.f24221n + i10;
                qyVar5.setLayoutParams(layoutParams);
                if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1() && (a6Var = this.f38924h1) != null) {
                    org.telegram.messenger.g0.v1(a6Var.getEditField());
                }
                this.f38914c1 = i10;
                x3Var.a();
                tiVar.f40002p3.requestLayout();
                org.telegram.ui.Cells.a6 a6Var2 = this.f38924h1;
                if (a6Var2 != null) {
                    zgVar = a6Var2.getEmojiButton();
                }
                if (zgVar != null) {
                    zgVar.j(xg.d, true);
                }
                if (!z10 && !this.f38920f1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38914c1, 0.0f);
                    ofFloat.addUpdateListener(new um(this, 1));
                    ofFloat.addListener(new xm(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f29066w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.a6 a6Var3 = this.f38924h1;
            if (a6Var3 != null) {
                zgVar = a6Var3.getEmojiButton();
            }
            if (zgVar != null) {
                zgVar.j(xg.f41996e, true);
            }
            qy qyVar6 = this.F;
            if (qyVar6 != null) {
                this.f38912b1 = false;
                this.f38926i1 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    qyVar6.setVisibility(8);
                }
            }
            if (i7 == 0) {
                this.f38914c1 = 0;
            }
            x3Var.a();
            tiVar.f40002p3.requestLayout();
        }
    }

    public final void l0(int i7, org.telegram.messenger.x10 x10Var, int i10, int i11) {
        x60 G = x60.G(this, null, new View(getContext()));
        G.f41892s = 0;
        G.f41894t = false;
        G.c(2131232336, org.telegram.messenger.gd.N0(2131746075, null), new sm(this, i7, 1), false);
        G.c(2131232113, org.telegram.messenger.gd.N0(2131751586, null), new sm(this, i7, 2), true);
        yk0 yk0Var = new yk0(getContext(), this.f37134a);
        G.f41886p = new org.telegram.ui.fe(yk0Var, 1);
        G.V = org.telegram.messenger.g0.L(185.0f);
        G.Z();
        yk0Var.e(G);
        fh.g c10 = yk0Var.f42508n.c(null, null, false);
        c10.p(c8.j0.l(yk0Var.f42504b));
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.R.f11633e = true;
        c10.r(org.telegram.messenger.g0.L(16.0f));
        yk0Var.G = c10;
        yk0Var.F = (Drawable) x10Var.a(yk0Var.f42510s);
        Point point = org.telegram.messenger.g0.f24226q;
        int i12 = (point.x - i10) / 2;
        int i13 = (point.y - i11) / 2;
        int i14 = i10 + i12;
        int i15 = i11 + i13;
        c10.setBounds(i12 - org.telegram.messenger.g0.L(8.0f), i13 - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + i14, org.telegram.messenger.g0.L(8.0f) + i15);
        yk0Var.F.setBounds(i12, i13, i14, i15);
        ((FrameLayout.LayoutParams) yk0Var.f42513y.getLayoutParams()).gravity = 1;
        yk0Var.M = true;
        yk0Var.show();
    }

    public final void m0() {
        org.telegram.ui.ActionBar.i6 i6Var = this.f37134a;
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.N6, i6Var);
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29581k7, i6Var);
            if (w02 != this.f38940q1 || w03 != this.f38943r1) {
                this.f38940q1 = w02;
                this.f38943r1 = w03;
                Drawable drawable = this.f38936o1;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = this.f38938p1;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.d61 d61Var = this.f38944s;
                if (d61Var != null) {
                    for (int i7 = 0; i7 < d61Var.getChildCount(); i7++) {
                        View childAt = d61Var.getChildAt(i7);
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
        this.f38937p0 = -1;
        this.f38939q0 = -1;
        this.f38942r0 = -1;
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
        w0Var.f3325b = -1;
        bg.w0 w0Var2 = this.O0;
        w0Var2.f3325b = -1;
        this.M0 = -1;
        this.f38955z0 = -1;
        this.A0 = -1;
        this.f38948v0 = -1;
        this.f38947u0 = -1;
        this.f38954y0 = -1;
        this.f38935o0 = -1;
        this.m0 = 1;
        this.R0 = 3;
        this.f38934n0 = 2;
        boolean z11 = this.f38933n;
        if (!z11) {
            this.R0 = 4;
            this.f38935o0 = 3;
        }
        int i7 = this.R0;
        int i10 = i7 + 1;
        this.f38945s0 = i7;
        int i11 = i7 + 2;
        this.R0 = i11;
        this.f38946t0 = i10;
        int i12 = this.N;
        if (i12 != 0) {
            this.f38947u0 = i11;
            this.R0 = i11 + i12;
        }
        if (i12 != this.L.length) {
            int i13 = this.R0;
            this.R0 = i13 + 1;
            this.f38948v0 = i13;
        }
        int i14 = this.R0;
        this.f38950w0 = i14;
        int i15 = i14 + 2;
        this.R0 = i15;
        this.f38952x0 = i14 + 1;
        if (z11) {
            int i16 = i14 + 3;
            this.R0 = i16;
            this.A0 = i15;
            if (this.f38923h0) {
                this.R0 = i14 + 4;
                this.f38955z0 = i16;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.bn) this.f37135b.f39956a2).f46173e;
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
                this.f38911b0 = true;
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
                w0Var.f3325b = i21;
                int i22 = i20 + 5;
                this.R0 = i22;
                w0Var2.f3325b = i20 + 4;
                if (w0Var2.f3324a) {
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
            this.f38954y0 = i25;
            if (this.f38915d0) {
                this.f38937p0 = i26;
                this.f38939q0 = i25 + 2;
                this.R0 = i25 + 4;
                this.f38942r0 = i25 + 3;
            }
        }
        int i27 = this.R0;
        this.R0 = i27 + 1;
        this.B0 = i27;
    }

    @Override
    public final void p() {
        this.I = true;
        ti tiVar = this.f37135b;
        org.telegram.messenger.ks.f(tiVar.H3).n(this, org.telegram.messenger.ks.f25310w0);
        if (this.J) {
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25247l4);
            qy qyVar = this.F;
            if (qyVar != null) {
                tiVar.f40002p3.removeView(qyVar);
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f38927j0) {
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

    public void setDelegate(pn pnVar) {
        this.f38929k0 = pnVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f37135b.f30226b.invalidate();
    }

    @Override
    public final void t() {
        this.f37135b.M1();
    }

    @Override
    public final void updateColors() {
        try {
            this.f38930k1.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Yl, this.f37134a));
            m0();
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void v(float f10) {
        this.f37135b.M1();
    }

    @Override
    public final void w(int i7) {
        int i10;
        boolean z10;
        if (i7 == 40) {
            boolean z11 = this.f38933n;
            int i11 = 0;
            int i12 = 1;
            ti tiVar = this.f37135b;
            CharSequence[] charSequenceArr = this.L;
            if (z11) {
                CharSequence[] charSequenceArr2 = {d0(this.O)};
                int i13 = tiVar.H3;
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
                boolean z12 = this.f38923h0;
                if (z12 && this.f38921g0) {
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
                        todoItem.f28639id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                b5.X(i13, tiVar.Y0() + 1, tiVar.c1(), new bi.j(this, (org.telegram.ui.bn) tiVar.f39956a2, tL_messageMediaToDo, 12));
                return;
            }
            boolean z13 = this.f38915d0;
            org.telegram.ui.d61 d61Var = this.f38944s;
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
                    for (int i18 = this.f38947u0; i18 < this.f38947u0 + this.N; i18++) {
                        v4.f1 K = d61Var.K(i18);
                        if (K != null) {
                            View view = K.f59245a;
                            if (view instanceof org.telegram.ui.Cells.a6) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                                if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f)) {
                                    hn hnVar = this.f38953y;
                                    if (hnVar != null) {
                                        hnVar.f();
                                    }
                                    String N0 = org.telegram.messenger.gd.N0(2131746961, null);
                                    j30 j30Var = this.E;
                                    j30Var.setText(N0);
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
                sh.d dVar = this.n1;
                if (i19 < length) {
                    if (TextUtils.isEmpty(d0(charSequenceArr[i19])) && dVar.b(i19) != null) {
                        this.W0 = true;
                        this.X0 = i19;
                        d61Var.y0(this.f38947u0 + i19);
                        return;
                    }
                    i19++;
                } else {
                    CharSequence[] charSequenceArr4 = {d0(this.O)};
                    int i20 = tiVar.H3;
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
                    tL_poll.multiple_choice = this.f38913c0;
                    tL_poll.quiz = this.f38915d0;
                    tL_poll.public_voters = !this.f38911b0;
                    tL_poll.open_answers = this.U;
                    tL_poll.revoting_disabled = !this.S;
                    tL_poll.shuffle_answers = this.T;
                    tL_poll.subscribers_only = this.N0.f3324a;
                    if (this.O0.f3324a) {
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
                        poll2.hide_results_until_close = this.f38909a0;
                        poll2.close_period = i22;
                        poll2.flags |= 16;
                    } else {
                        int i23 = this.W;
                        if (i23 != 0) {
                            poll2.hide_results_until_close = this.f38909a0;
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
                            dVar.h(tL_messageMediaPoll.poll.answers.size());
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
                            if ((this.f38913c0 || this.f38915d0) && zArr[i24]) {
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
                    b5.X(i20, tiVar.Y0() + 1, tiVar.c1(), new bi.o2(this, (org.telegram.ui.bn) tiVar.f39956a2, tL_messageMediaPoll, arrayList2, 9));
                    return;
                }
            }
        }
    }
}
