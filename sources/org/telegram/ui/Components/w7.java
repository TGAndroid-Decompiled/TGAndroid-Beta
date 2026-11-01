package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class w7 extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.vs, org.telegram.messenger.z5 {
    public static w7 P2;
    public static final float[] Q2 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final g7 A1;
    public long A2;
    public final h7 B1;
    public long B2;
    public final o7 C1;
    public boolean C2;
    public final org.telegram.ui.ActionBar.t0 D1;
    public float D2;
    public final org.telegram.ui.vr E1;
    public final mg.c2 E2;
    public org.telegram.ui.ActionBar.b1 F1;
    public org.telegram.ui.ij F2;
    public final i7 G1;
    public long G2;
    public final boolean H1;
    public float H2;
    public final a80 I1;
    public final org.telegram.ui.Cells.f2 I2;
    public final p7 J1;
    public ValueAnimator J2;
    public final org.telegram.ui.ActionBar.u5 K1;
    public int K2;
    public final org.telegram.ui.ActionBar.t0 L1;
    public boolean L2;
    public final jh.g M1;
    public int M2;
    public final org.telegram.ui.ActionBar.x0 N1;
    public int N2;
    public boolean O1;
    public int O2;
    public final org.telegram.ui.ActionBar.b1[] P1;
    public final TextView Q1;
    public final org.telegram.ui.ActionBar.t0 R1;
    public final org.telegram.ui.ActionBar.b1 S1;
    public final org.telegram.ui.ActionBar.b1 T1;
    public final org.telegram.ui.ActionBar.b1 U1;
    public final org.telegram.ui.ActionBar.b1 V1;
    public final ImageView W1;
    public final kf0 X1;
    public final e7 Y1;
    public final g9 Z1;
    public final org.telegram.ui.ActionBar.t0 a2;
    public final org.telegram.ui.ActionBar.t0 f32092b2;
    public boolean f32093c2;
    public final View[] f32094d2;
    public final o1.j f32095e2;
    public long f32096f2;
    public boolean f32097g2;
    public boolean f32098h2;
    public final View f32099i1;
    public int f32100i2;
    public final kg.g1 f32101j1;
    public int f32102j2;
    public final View f32103k1;
    public final boolean f32104k2;
    public final View l1;
    public final boolean f32105l2;
    public boolean f32106m1;
    public org.telegram.messenger.qp f32107m2;
    public boolean f32108n1;
    public ArrayList f32109n2;
    public final j7 f32110o1;
    public org.telegram.messenger.kj f32111o2;
    public final s4.a0 f32112p1;
    public boolean f32113p2;
    public final v7 f32114q1;
    public int f32115q2;
    public final LinearLayout f32116r1;
    public String f32117r2;
    public final TextView f32118s1;
    public AnimatorSet f32119s2;
    public final TextView f32120t1;
    public int f32121t2;
    public final e7 f32122u1;
    public int f32123u2;
    public final vh.d f32124v1;
    public final int f32125v2;
    public final vh.d f32126w1;
    public final LaunchActivity f32127w2;
    public final s4.x f32128x1;
    public int f32129x2;
    public final n7 f32130y1;
    public float f32131y2;
    public final o7 f32132z1;
    public int f32133z2;

    public w7(Activity activity, final org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, (Context) activity, p6Var, true);
        boolean z10;
        org.telegram.ui.ActionBar.y yVar;
        boolean z11;
        TLRPC.User Z1;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.b1[] b1VarArr = new org.telegram.ui.ActionBar.b1[6];
        this.P1 = b1VarArr;
        View[] viewArr = new View[5];
        this.f32094d2 = viewArr;
        this.f32098h2 = true;
        this.f32100i2 = -1;
        this.f32115q2 = Integer.MAX_VALUE;
        this.f32131y2 = -1.0f;
        this.D2 = -1.0f;
        this.E2 = new mg.c2(this, 23);
        this.I2 = new org.telegram.ui.Cells.f2(this);
        this.f21612r = true;
        O();
        org.telegram.messenger.kj kjVar = MediaController.B().f14483u0;
        if (kjVar != null) {
            this.f21584a = kjVar.I1;
        } else {
            this.f21584a = org.telegram.messenger.e20.f15506s0;
        }
        this.f32127w2 = (LaunchActivity) activity;
        this.f32125v2 = org.telegram.messenger.b6.q(this.f21584a).k();
        org.telegram.messenger.at.f(this.f21584a).c(this, org.telegram.messenger.at.f14706f2);
        org.telegram.messenger.at.f(this.f21584a).c(this, org.telegram.messenger.at.f14712g2);
        org.telegram.messenger.at.f(this.f21584a).c(this, org.telegram.messenger.at.f14718h2);
        org.telegram.messenger.at.f(this.f21584a).c(this, org.telegram.messenger.at.f14700e2);
        org.telegram.messenger.at.f(this.f21584a).c(this, org.telegram.messenger.at.Y1);
        org.telegram.messenger.at.f(this.f21584a).c(this, org.telegram.messenger.at.X1);
        org.telegram.messenger.at.f(this.f21584a).c(this, org.telegram.messenger.at.K0);
        org.telegram.messenger.at.f(this.f21584a).c(this, org.telegram.messenger.at.L0);
        org.telegram.messenger.at.f(this.f21584a).c(this, org.telegram.messenger.at.U3);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.J4);
        m7 m7Var = new m7(this, activity);
        this.f21587b = m7Var;
        m7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f21587b;
        int i12 = this.f21616t0;
        viewGroup.setPadding(i12, 0, i12, 0);
        kg.g1 g1Var = new kg.g1(this, activity, p6Var, 1);
        this.f32101j1 = g1Var;
        g1Var.setBackgroundColor(0);
        g1Var.setBackButtonImage(2131231241);
        int i13 = org.telegram.ui.ActionBar.t6.Cj;
        org.telegram.ui.ActionBar.a7.m(g1Var, 1, i13, p6Var);
        org.telegram.ui.ActionBar.a7.m(g1Var, 3, org.telegram.ui.ActionBar.t6.Bj, p6Var);
        org.telegram.ui.ActionBar.a7.m(g1Var, 5, i13, p6Var);
        org.telegram.ui.ActionBar.a7.m(g1Var, 6, org.telegram.ui.ActionBar.t6.Dj, p6Var);
        g1Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.y p5 = g1Var.p();
        p5.setLayoutParams(w7.b6.e(-1, -1, 119));
        View view = new View(activity);
        this.f32099i1 = view;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21002h5, view, p6Var);
        g1Var.addView(view, 0, w7.b6.e(-1, -1, 119));
        view.setAlpha(0.0f);
        g1Var.setAlpha(0.0f);
        g1Var.setActionBarMenuOnItemClick(new org.telegram.ui.ar(this, 1));
        View view2 = new View(activity);
        this.f32103k1 = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(2131231238);
        View view3 = new View(activity);
        this.l1 = view3;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.V5, view3, p6Var);
        e7 e7Var = new e7(this, activity, 2);
        this.f32122u1 = e7Var;
        n7 n7Var = new n7(this, activity);
        this.f32130y1 = n7Var;
        e7Var.addView(n7Var, w7.b6.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        o7 o7Var = new o7(this, activity, activity, 0);
        this.f32132z1 = o7Var;
        e7Var.addView(o7Var, w7.b6.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        o7 o7Var2 = new o7(this, activity, activity, 1);
        this.C1 = o7Var2;
        e7Var.addView(o7Var2, w7.b6.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        p7 p7Var = new p7(this, activity, p6Var);
        this.J1 = p7Var;
        p7Var.setLineWidth(4);
        p7Var.setDelegate(new l2.f(this, 14));
        p7Var.setReportChanges(true);
        e7Var.addView(p7Var, w7.b6.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        o1.j jVar = new o1.j(new o1.i(0.0f));
        o1.k kVar = new o1.k();
        kVar.b(750.0f);
        kVar.a(1.0f);
        jVar.f13958m = kVar;
        jVar.b(new a7(this, 0));
        this.f32095e2 = jVar;
        a80 a80Var = new a80(activity);
        this.I1 = a80Var;
        a80Var.setVisibility(4);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.Hj, a80Var, p6Var);
        a80Var.setProgressColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Jj, this.I0));
        e7Var.addView(a80Var, w7.b6.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(activity);
        this.K1 = u5Var;
        u5Var.setTextSize(12);
        u5Var.l("0:00", false);
        int i14 = org.telegram.ui.ActionBar.t6.Gj;
        org.telegram.ui.ActionBar.a7.Y(u5Var, i14, p6Var);
        u5Var.setImportantForAccessibility(2);
        e7Var.addView(u5Var, w7.b6.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.Q1 = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.a7.V(textView, i14, p6Var);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        e7Var.addView(textView, w7.b6.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(activity, null, 0, org.telegram.ui.ActionBar.t6.w0(i14, this.I0), false, p6Var);
        this.L1 = t0Var;
        t0Var.setLongClickEnabled(false);
        t0Var.setShowSubmenuByMove(false);
        t0Var.setAdditionalYOffset(-org.telegram.messenger.i0.L(224.0f));
        t0Var.setContentDescription(org.telegram.messenger.dd.L0(2131754805, null));
        t0Var.setDelegate(new p6(this, 0));
        jh.g gVar = new jh.g();
        this.M1 = gVar;
        t0Var.setIcon(gVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.x0 x0Var = new org.telegram.ui.ActionBar.x0(getContext(), p6Var);
        this.N1 = x0Var;
        x0Var.setRoundRadiusDp(6.0f);
        x0Var.setDrawShadow(true);
        x0Var.setOnValueChange(new q6(this, 0));
        b1VarArr[0] = t0Var.e(0, 2131232372, org.telegram.messenger.dd.L0(2131745284, null));
        b1VarArr[1] = t0Var.e(1, 2131232371, org.telegram.messenger.dd.L0(2131745285, null));
        b1VarArr[2] = t0Var.e(2, 2131232370, org.telegram.messenger.dd.L0(2131745286, null));
        b1VarArr[3] = t0Var.e(3, 2131232369, org.telegram.messenger.dd.L0(2131745288, null));
        b1VarArr[4] = t0Var.e(4, 2131232374, org.telegram.messenger.dd.L0(2131745282, null));
        b1VarArr[5] = t0Var.e(5, 2131232373, org.telegram.messenger.dd.L0(2131745283, null));
        if (org.telegram.messenger.i0.f16171p >= 3.0f) {
            t0Var.setPadding(0, 1, 0, 0);
        }
        t0Var.setAdditionalXOffset(org.telegram.messenger.i0.L(8.0f));
        t0Var.setAdditionalYOffset(-org.telegram.messenger.i0.L(400.0f));
        t0Var.setShowedFromBottom(true);
        e7Var.addView(t0Var, w7.b6.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        t0Var.setOnClickListener(new org.telegram.ui.ud(17, this, fArr));
        t0Var.setOnLongClickListener(new b0(1, this, p6Var));
        a1(false);
        e7 e7Var2 = new e7(this, activity, 0);
        e7Var.addView(e7Var2, w7.b6.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.t0 t0Var2 = new org.telegram.ui.ActionBar.t0(activity, null, 0, 0, false, p6Var);
        this.R1 = t0Var2;
        viewArr[0] = t0Var2;
        t0Var2.setLongClickEnabled(false);
        t0Var2.setShowSubmenuByMove(false);
        t0Var2.setAdditionalYOffset(-org.telegram.messenger.i0.L(166.0f));
        int i15 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i15, this.I0), 1, org.telegram.messenger.i0.L(18.0f));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
        t0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(t0Var2, h02, null, N, p6Var);
        e7Var2.addView(t0Var2, w7.b6.e(48, 48, 51));
        t0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final w7 f29897b;

            {
                this.f29897b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i16 = r2;
                w7 w7Var = this.f29897b;
                switch (i16) {
                    case 0:
                        w7Var.d1();
                        w7Var.R1.U(null, null);
                        return;
                    default:
                        i7 i7Var = w7Var.G1;
                        org.telegram.messenger.kj kjVar2 = MediaController.B().f14483u0;
                        if (kjVar2 != null) {
                            boolean z12 = true;
                            z60 G = z60.G(w7Var.f21590c, w7Var.I0, view4, true);
                            z60 J0 = w7Var.J0(G, kjVar2);
                            if (!w7Var.O0()) {
                                G.l(2131232389, org.telegram.messenger.dd.L0(2131753916, null), new bi.k(G, J0, 6), !w7Var.f32113p2);
                                if (!w7Var.f32113p2 && G.y() != null) {
                                    G.y().setRightIcon(2131232058);
                                }
                                G.k();
                            }
                            G.l(2131232164, org.telegram.messenger.dd.L0(2131750588, null), new w6(w7Var, G, 0), !w7Var.f32113p2);
                            G.l(2131232364, org.telegram.messenger.dd.L0(2131745477, null), new w6(w7Var, G, 1), !w7Var.f32113p2);
                            if (kjVar2.f1() <= 0) {
                                z12 = false;
                            }
                            G.l(2131232223, org.telegram.messenger.dd.L0(2131745360, null), new w6(w7Var, G, 2), z12);
                            if (w7Var.H1) {
                                org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, G.e, G.d, false, false);
                                G.d(b1Var);
                                w7Var.F1 = b1Var;
                                b1Var.j(org.telegram.messenger.dd.L0(2131743615, null), 2131231911, null);
                                w7Var.F1.setOnClickListener(new org.telegram.ui.ud(18, w7Var, G));
                                org.telegram.messenger.i0.E2(i7Var);
                                w7Var.F1.addView(i7Var, 0, w7.b6.c(-1.0f, -1));
                                w7Var.updateColors();
                            }
                            G.m(2131232107, new w6(w7Var, G, 3), org.telegram.messenger.dd.L0(2131746660, null), w7Var.O0(), true);
                            G.X(org.telegram.messenger.i0.L(64.0f));
                            G.Z();
                            return;
                        }
                        return;
                }
            }
        });
        this.S1 = t0Var2.e(3, 2131232553, org.telegram.messenger.dd.L0(2131746288, null));
        this.T1 = t0Var2.e(4, 2131232552, org.telegram.messenger.dd.L0(2131746291, null));
        t0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.i0.L(4.0f);
        this.U1 = t0Var2.e(2, 2131232554, org.telegram.messenger.dd.L0(2131745340, null));
        t0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.i0.L(4.0f);
        this.V1 = t0Var2.e(1, 2131232548, org.telegram.messenger.dd.L0(2131746044, null));
        t0Var2.setShowedFromBottom(true);
        t0Var2.setDelegate(new p6(this, 1));
        int i16 = org.telegram.ui.ActionBar.t6.Kj;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i16, this.I0);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        g7 g7Var = new g7(this, activity, scaledTouchSlop);
        this.A1 = g7Var;
        viewArr[1] = g7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        g7Var.setScaleType(scaleType);
        g7Var.f(2131624135, 20, 20, null);
        g7Var.h(w02, "Triangle 3");
        g7Var.h(w02, "Triangle 4");
        g7Var.h(w02, "Rectangle 4");
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i15, this.I0), 1, org.telegram.messenger.i0.L(22.0f));
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i15);
        g7Var.setBackground(h03);
        org.telegram.ui.ActionBar.a7.k(g7Var, h03, null, N2, p6Var);
        e7Var2.addView(g7Var, w7.b6.e(48, 48, 51));
        g7Var.setContentDescription(org.telegram.messenger.dd.L0(2131754800, null));
        ImageView imageView = new ImageView(activity);
        this.W1 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        kf0 kf0Var = new kf0(28);
        this.X1 = kf0Var;
        imageView.setImageDrawable(kf0Var);
        kf0Var.a(!MediaController.B().H(), false);
        org.telegram.ui.ActionBar.a7.t(imageView, i16, p6Var, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i15, this.I0), 1, org.telegram.messenger.i0.L(24.0f));
        org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i15);
        imageView.setBackground(h04);
        org.telegram.ui.ActionBar.a7.k(imageView, h04, null, N3, p6Var);
        e7Var2.addView(imageView, w7.b6.e(48, 48, 51));
        imageView.setOnClickListener(new bh.c(5));
        h7 h7Var = new h7(this, activity, scaledTouchSlop);
        this.B1 = h7Var;
        viewArr[3] = h7Var;
        h7Var.setScaleType(scaleType);
        h7Var.f(2131624135, 20, 20, null);
        h7Var.h(w02, "Triangle 3");
        h7Var.h(w02, "Triangle 4");
        h7Var.h(w02, "Rectangle 4");
        h7Var.setRotation(180.0f);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i15, this.I0), 1, org.telegram.messenger.i0.L(22.0f));
        org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i15);
        h7Var.setBackground(h05);
        org.telegram.ui.ActionBar.a7.k(h7Var, h05, null, N4, p6Var);
        e7Var2.addView(h7Var, w7.b6.e(48, 48, 51));
        h7Var.setContentDescription(org.telegram.messenger.dd.L0(2131748267, null));
        org.telegram.ui.ActionBar.t0 t0Var3 = new org.telegram.ui.ActionBar.t0(activity, null, 0, w02, false, p6Var);
        this.D1 = t0Var3;
        viewArr[4] = t0Var3;
        org.telegram.ui.vr vrVar = new org.telegram.ui.vr(2131231245, activity, p6Var);
        this.E1 = vrVar;
        t0Var3.setIcon(vrVar);
        t0Var3.setLongClickEnabled(false);
        t0Var3.setAdditionalYOffset(-org.telegram.messenger.i0.L(197.0f));
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i15, this.I0), 1, org.telegram.messenger.i0.L(18.0f));
        org.telegram.ui.ActionBar.w6 N5 = org.telegram.ui.ActionBar.a7.N(i15);
        t0Var3.setBackground(h06);
        org.telegram.ui.ActionBar.a7.k(t0Var3, h06, null, N5, p6Var);
        t0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final w7 f29897b;

            {
                this.f29897b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i162 = r2;
                w7 w7Var = this.f29897b;
                switch (i162) {
                    case 0:
                        w7Var.d1();
                        w7Var.R1.U(null, null);
                        return;
                    default:
                        i7 i7Var = w7Var.G1;
                        org.telegram.messenger.kj kjVar2 = MediaController.B().f14483u0;
                        if (kjVar2 != null) {
                            boolean z12 = true;
                            z60 G = z60.G(w7Var.f21590c, w7Var.I0, view4, true);
                            z60 J0 = w7Var.J0(G, kjVar2);
                            if (!w7Var.O0()) {
                                G.l(2131232389, org.telegram.messenger.dd.L0(2131753916, null), new bi.k(G, J0, 6), !w7Var.f32113p2);
                                if (!w7Var.f32113p2 && G.y() != null) {
                                    G.y().setRightIcon(2131232058);
                                }
                                G.k();
                            }
                            G.l(2131232164, org.telegram.messenger.dd.L0(2131750588, null), new w6(w7Var, G, 0), !w7Var.f32113p2);
                            G.l(2131232364, org.telegram.messenger.dd.L0(2131745477, null), new w6(w7Var, G, 1), !w7Var.f32113p2);
                            if (kjVar2.f1() <= 0) {
                                z12 = false;
                            }
                            G.l(2131232223, org.telegram.messenger.dd.L0(2131745360, null), new w6(w7Var, G, 2), z12);
                            if (w7Var.H1) {
                                org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, G.e, G.d, false, false);
                                G.d(b1Var);
                                w7Var.F1 = b1Var;
                                b1Var.j(org.telegram.messenger.dd.L0(2131743615, null), 2131231911, null);
                                w7Var.F1.setOnClickListener(new org.telegram.ui.ud(18, w7Var, G));
                                org.telegram.messenger.i0.E2(i7Var);
                                w7Var.F1.addView(i7Var, 0, w7.b6.c(-1.0f, -1));
                                w7Var.updateColors();
                            }
                            G.m(2131232107, new w6(w7Var, G, 3), org.telegram.messenger.dd.L0(2131746660, null), w7Var.O0(), true);
                            G.X(org.telegram.messenger.i0.L(64.0f));
                            G.Z();
                            return;
                        }
                        return;
                }
            }
        });
        e7Var2.addView(t0Var3, w7.b6.e(48, 48, 51));
        i7 i7Var = new i7(this, activity, 0);
        this.G1 = i7Var;
        this.H1 = true;
        try {
            i7Var.setRouteSelector(d6.a.c(activity).a());
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            this.H1 = false;
        }
        this.G1.setVisibility(4);
        org.telegram.ui.vr vrVar2 = this.E1;
        if (vrVar2 != null) {
            vrVar2.a(b5.d.u());
        }
        this.D1.setShowedFromBottom(true);
        this.D1.setDelegate(new p6(this, 2));
        this.D1.setContentDescription(org.telegram.messenger.dd.L0(2131754839, null));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f32116r1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i17 = 8;
        linearLayout.setVisibility(8);
        this.f21587b.addView(linearLayout, w7.b6.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new org.telegram.ui.ActionBar.n2(10));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(2131232440);
        org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.W5, p6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, w7.b6.o(-2, -2));
        TextView textView2 = new TextView(activity);
        this.f32118s1 = textView2;
        int i18 = org.telegram.ui.ActionBar.t6.X5;
        org.telegram.ui.ActionBar.a7.V(textView2, i18, p6Var);
        textView2.setGravity(17);
        textView2.setText(org.telegram.messenger.dd.L0(2131748260, null));
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(org.telegram.messenger.i0.L(40.0f), 0, org.telegram.messenger.i0.L(40.0f), 0);
        linearLayout.addView(textView2, w7.b6.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f32120t1 = textView3;
        org.telegram.ui.ActionBar.a7.V(textView3, i18, p6Var);
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(org.telegram.messenger.i0.L(40.0f), 0, org.telegram.messenger.i0.L(40.0f), 0);
        linearLayout.addView(textView3, w7.b6.t(-2, -2, 17, 0, 6, 0, 0));
        j7 j7Var = new j7(this, activity);
        this.f32110o1 = j7Var;
        j7Var.setClipToPadding(false);
        getContext();
        s4.a0 a0Var = new s4.a0(1, false);
        this.f32112p1 = a0Var;
        j7Var.setLayoutManager(a0Var);
        j7Var.setHorizontalScrollBarEnabled(false);
        j7Var.setVerticalScrollBarEnabled(false);
        this.f21587b.addView(j7Var, w7.b6.e(-1, -1, 51));
        v7 v7Var = new v7(this, activity);
        this.f32114q1 = v7Var;
        j7Var.setAdapter(v7Var);
        org.telegram.ui.ActionBar.a7.m(j7Var, 21, org.telegram.ui.ActionBar.t6.A5, p6Var);
        j7Var.setOnItemClickListener(new c7(0));
        j7Var.setOnItemLongClickListener(new p6(this, 3));
        j7Var.setOnScrollListener(new ag.u(this, 11));
        vh.d dVar = new vh.d(activity, p6Var, true);
        dVar.setRoundRadius(24);
        this.f32124v1 = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        spannableStringBuilder.setSpan(new dq(2131231178, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(2131753925, null));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final w7 f25423b;

            {
                this.f25423b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i19 = r3;
                org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                w7 w7Var = this.f25423b;
                switch (i19) {
                    case 0:
                        org.telegram.messenger.kj kjVar2 = MediaController.B().f14483u0;
                        if (kjVar2 != null && w7Var.f32127w2 != null) {
                            w7Var.R0(kjVar2, true, new org.telegram.messenger.sz(9), false);
                            w7Var.U0(true);
                            org.telegram.messenger.m5.n(null, 2131753912, new cc((FrameLayout) w7Var.f21587b, p6Var2), 2131624188, 36);
                            return;
                        }
                        return;
                    default:
                        org.telegram.messenger.kj kjVar3 = MediaController.B().f14483u0;
                        if (kjVar3 != null && w7Var.f32127w2 != null) {
                            w7Var.R0(kjVar3, false, new org.telegram.messenger.sz(9), false);
                            w7Var.U0(false);
                            org.telegram.messenger.m5.n(null, 2131753911, new cc((FrameLayout) w7Var.f21587b, p6Var2), 2131624050, 36);
                            return;
                        }
                        return;
                }
            }
        });
        this.f32122u1.addView(dVar, w7.b6.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        vh.d dVar2 = new vh.d(activity, p6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.e();
        this.f32126w1 = dVar2;
        dVar2.setText(org.telegram.messenger.dd.L0(2131753917, null));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final w7 f25423b;

            {
                this.f25423b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i19 = r3;
                org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                w7 w7Var = this.f25423b;
                switch (i19) {
                    case 0:
                        org.telegram.messenger.kj kjVar2 = MediaController.B().f14483u0;
                        if (kjVar2 != null && w7Var.f32127w2 != null) {
                            w7Var.R0(kjVar2, true, new org.telegram.messenger.sz(9), false);
                            w7Var.U0(true);
                            org.telegram.messenger.m5.n(null, 2131753912, new cc((FrameLayout) w7Var.f21587b, p6Var2), 2131624188, 36);
                            return;
                        }
                        return;
                    default:
                        org.telegram.messenger.kj kjVar3 = MediaController.B().f14483u0;
                        if (kjVar3 != null && w7Var.f32127w2 != null) {
                            w7Var.R0(kjVar3, false, new org.telegram.messenger.sz(9), false);
                            w7Var.U0(false);
                            org.telegram.messenger.m5.n(null, 2131753911, new cc((FrameLayout) w7Var.f21587b, p6Var2), 2131624050, 36);
                            return;
                        }
                        return;
                }
            }
        });
        this.f32122u1.addView(dVar2, w7.b6.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        org.telegram.messenger.qp qpVar = MediaController.B().Q0;
        this.f32107m2 = qpVar;
        if (qpVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32104k2 = z10;
        this.f32101j1.m0 = z10;
        this.f32105l2 = O0();
        this.f32109n2 = MediaController.B().R0;
        if (O0()) {
            yVar = p5;
            this.a2 = yVar.a(8, 2131232041);
        } else {
            yVar = p5;
        }
        org.telegram.ui.ActionBar.t0 a2 = yVar.a(0, 2131232485);
        a2.N();
        a2.H = new ag.l3(this, 5);
        this.f32092b2 = a2;
        a2.setContentDescription(org.telegram.messenger.dd.L0(2131745853, null));
        EditTextBoldCursor searchField = a2.getSearchField();
        searchField.setHint(org.telegram.messenger.dd.L0(2131745853, null));
        int i19 = org.telegram.ui.ActionBar.t6.Cj;
        org.telegram.ui.ActionBar.a7.V(searchField, i19, p6Var);
        org.telegram.ui.ActionBar.a7.E(searchField, org.telegram.ui.ActionBar.t6.Gj, p6Var);
        org.telegram.ui.ActionBar.a7.m(searchField, 30, i19, p6Var);
        if (z10) {
            j7Var.r1();
            v0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a7, p6Var));
            this.f32101j1.setAlpha(1.0f);
            this.f32099i1.setAlpha(0.0f);
            org.telegram.ui.Cells.f2 f2Var = this.I2;
            kg.g1 g1Var2 = this.f32101j1;
            Float valueOf = Float.valueOf(0.0f);
            f2Var.getClass();
            f2Var.a(g1Var2, valueOf);
        }
        if (this.f32109n2.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        v7Var.h = z11;
        if (z11) {
            j7Var.setVisibility(0);
            j7Var.setTranslationY(0.0f);
        } else {
            j7Var.setVisibility(8);
            j7Var.setTranslationY(org.telegram.messenger.i0.f16172q.y);
        }
        v7Var.f();
        this.f32101j1.setTitle(org.telegram.messenger.dd.L0(2131753952, null));
        org.telegram.messenger.qp qpVar2 = this.f32107m2;
        if (qpVar2 != null) {
            if (qpVar2.f17803b == org.telegram.messenger.e20.i(this.f21584a).e()) {
                this.f32101j1.setTitle(org.telegram.messenger.dd.L0(2131746658, null));
            } else {
                this.f32101j1.setTitle(org.telegram.messenger.dd.a0(null, null, 2131746659, org.telegram.messenger.o5.t(this.f32107m2.f17803b)));
            }
        } else if (kjVar != null && MediaController.B().C0 == null) {
            long B0 = org.telegram.messenger.kj.B0(kjVar.f16690k);
            if (org.telegram.messenger.o5.C(B0)) {
                TLRPC.EncryptedChat Z0 = org.telegram.messenger.wp.r1(this.f21584a).Z0(Integer.valueOf((int) (B0 & 4294967295L)));
                if (Z0 != null && (Z1 = org.telegram.messenger.wp.r1(this.f21584a).Z1(Long.valueOf(Z0.user_id))) != null) {
                    this.f32101j1.setTitle(org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name));
                }
            } else if (B0 == org.telegram.messenger.e20.i(this.f21584a).e()) {
                if (kjVar.Q1() == 2666000) {
                    this.f32101j1.setTitle(org.telegram.messenger.dd.L0(2131754252, null));
                } else {
                    this.f32101j1.setTitle(org.telegram.messenger.dd.L0(2131745918, null));
                }
            } else if (org.telegram.messenger.o5.E(B0)) {
                TLRPC.User Z12 = org.telegram.messenger.wp.r1(this.f21584a).Z1(Long.valueOf(B0));
                if (Z12 != null) {
                    this.f32101j1.setTitle(org.telegram.messenger.i5.m(0, Z12.first_name, Z12.last_name));
                }
            } else {
                TLRPC.Chat L0 = org.telegram.messenger.wp.r1(this.f21584a).L0(Long.valueOf(-B0));
                if (L0 != null) {
                    this.f32101j1.setTitle(L0.title);
                }
            }
        }
        if (O0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            s4.x xVar = new s4.x(new org.telegram.ui.ja(this, 2));
            this.f32128x1 = xVar;
            xVar.h(j7Var);
        }
        ViewGroup viewGroup2 = this.f21587b;
        e7 e7Var3 = this.f32122u1;
        int i20 = 52;
        if (!O0() && !this.f32113p2) {
            i10 = 52;
        } else {
            i10 = 0;
        }
        viewGroup2.addView(e7Var3, w7.b6.e(-1, i10 + 179, 83));
        this.f21587b.addView(this.l1, new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 83));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32122u1.getLayoutParams();
        if (!O0() && !this.f32113p2) {
            i11 = 52;
        } else {
            i11 = 0;
        }
        layoutParams.height = org.telegram.messenger.i0.L(i11 + 179);
        ((FrameLayout.LayoutParams) this.l1.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(179 + ((O0() || this.f32113p2) ? 0 : 0));
        this.f21587b.addView(this.f32103k1, w7.b6.c(3.0f, -1));
        this.f21587b.addView(this.f32101j1);
        e7 e7Var4 = new e7(this, activity, 1);
        this.Y1 = e7Var4;
        e7Var4.setAlpha(0.0f);
        e7Var4.setVisibility(4);
        this.f21590c.addView(e7Var4);
        g9 g9Var = new g9(activity);
        this.Z1 = g9Var;
        g9Var.setAspectFit(true);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(8.0f));
        g9Var.setScaleX(0.9f);
        g9Var.setScaleY(0.9f);
        e7Var4.addView(g9Var, w7.b6.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        f1(false);
        c1();
        if (this.f32108n1 && v7Var.b() == 0) {
            i17 = 0;
        }
        linearLayout.setVisibility(i17);
        Z0();
    }

    public static void I0(w7 w7Var) {
        int bottom;
        boolean z10;
        int translationY;
        Integer num;
        float f7;
        float f10;
        float f11;
        View view = w7Var.f32103k1;
        kg.g1 g1Var = w7Var.f32101j1;
        j7 j7Var = w7Var.f32110o1;
        if (j7Var.getChildCount() <= 0) {
            int paddingTop = j7Var.getPaddingTop();
            w7Var.f32115q2 = paddingTop;
            j7Var.setTopGlowOffset(paddingTop);
            w7Var.f21587b.invalidate();
            return;
        }
        boolean z11 = false;
        View childAt = j7Var.getChildAt(0);
        dk0 dk0Var = (dk0) j7Var.G(childAt);
        if (childAt instanceof org.telegram.ui.Cells.w) {
            bottom = childAt.getTop();
        } else {
            bottom = childAt.getBottom();
        }
        int L = org.telegram.messenger.i0.L(7.0f);
        if (bottom < org.telegram.messenger.i0.L(7.0f) || dk0Var == null || dk0Var.b() != 0) {
            bottom = L;
        }
        if (bottom <= org.telegram.messenger.i0.L(12.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f12 = 1.0f;
        if ((z10 && g1Var.getTag() == null) || (!z10 && g1Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            g1Var.setTag(num);
            AnimatorSet animatorSet = w7Var.f32119s2;
            if (animatorSet != null) {
                animatorSet.cancel();
                w7Var.f32119s2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            w7Var.f32119s2 = animatorSet2;
            float f13 = 0.0f;
            if (w7Var.f32104k2) {
                org.telegram.ui.Cells.f2 f2Var = w7Var.I2;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(g1Var, f2Var, f10);
                View view2 = w7Var.f32099i1;
                Property property = View.ALPHA;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, property, f11);
                if (z10) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property, f13));
            } else {
                Property property2 = View.ALPHA;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(g1Var, property2, f7);
                if (z10) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat3, ObjectAnimator.ofFloat(view, property2, f13));
            }
            w7Var.f32119s2.setDuration(320L);
            w7Var.f32119s2.setInterpolator(gr.h);
            w7Var.f32119s2.addListener(new l7(w7Var, 2));
            w7Var.f32119s2.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j7Var.getLayoutParams();
        int D = org.telegram.messenger.a30.D(11.0f, layoutParams.topMargin - org.telegram.messenger.i0.f16166m, bottom);
        if (w7Var.f32115q2 != D) {
            w7Var.f32115q2 = D;
            j7Var.setTopGlowOffset((D - layoutParams.topMargin) - org.telegram.messenger.i0.f16166m);
            w7Var.f21587b.invalidate();
        }
        int L2 = org.telegram.messenger.i0.L(13.0f);
        if (w7Var.f21615s0 + ((int) (j7Var.getTranslationY() + ((w7Var.f32115q2 - w7Var.f21615s0) - L2))) < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            f12 = 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - translationY) - w7Var.f21615s0) / (org.telegram.messenger.i0.L(4.0f) + L2));
        }
        w7Var.D2 = f12;
        if (f12 <= 0.5f && i0.b.h(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, w7Var.I0)) > 0.699999988079071d) {
            z11 = true;
        }
        if (z11 != w7Var.C2) {
            w7Var.C2 = z11;
            org.telegram.messenger.i0.p3(w7Var, z11);
        }
    }

    public static boolean L0(float f7, float f10) {
        if (Math.abs(f7 - f10) < 0.05f) {
            return true;
        }
        return false;
    }

    public static org.telegram.messenger.jc N0(org.telegram.messenger.kj kjVar) {
        TLRPC.PhotoSize photoSize;
        TLRPC.Document F0 = kjVar.F0();
        if (F0 != null) {
            photoSize = org.telegram.messenger.b8.w(F0.thumbs, 360, false, null, false);
        } else {
            photoSize = null;
        }
        if (!(photoSize instanceof TLRPC.TL_photoSize) && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            photoSize = null;
        }
        if (photoSize != null) {
            return org.telegram.messenger.jc.c(photoSize, F0);
        }
        String u02 = kjVar.u0(true);
        if (u02 == null) {
            return null;
        }
        return org.telegram.messenger.jc.g(u02);
    }

    @Override
    public final void F(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ij));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21331z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21046jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21027id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.We));
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final z60 J0(z60 z60Var, org.telegram.messenger.kj kjVar) {
        long j10;
        org.telegram.messenger.pp G1 = org.telegram.messenger.wp.r1(this.f21584a).G1();
        TLRPC.Document F0 = kjVar.F0();
        if (F0 != null) {
            j10 = F0.f19800id;
        } else {
            j10 = 0;
        }
        z60 J = z60Var.J();
        J.c(2131231241, org.telegram.messenger.dd.L0(2131753756, null), new org.telegram.ui.qr0(z60Var, 27), false);
        J.k();
        J.l(2131231622, org.telegram.messenger.dd.L0(2131753913, null), new v6(this, kjVar, z60Var, 6), !G1.f17623b.contains(Long.valueOf(j10)));
        J.c(2131232350, org.telegram.messenger.dd.L0(2131753910, null), new v6(this, kjVar, z60Var, 7), false);
        J.c(2131231788, org.telegram.messenger.dd.L0(2131753914, null), new v6(this, kjVar, z60Var, 8), false);
        J.k();
        J.p(12, org.telegram.messenger.i0.L(200.0f), org.telegram.messenger.dd.L0(2131753915, null));
        return J;
    }

    public final void K0() {
        org.telegram.ui.ActionBar.t0 t0Var = this.R1;
        int w02 = org.telegram.ui.ActionBar.t6.w0(((Integer) t0Var.getTag()).intValue(), this.I0);
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kj, this.I0);
        int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21021i6, this.I0);
        if (!this.L2 || w02 != this.M2) {
            this.M2 = w02;
            t0Var.setIconColor(w02);
        }
        boolean z10 = this.L2;
        org.telegram.ui.ActionBar.t0 t0Var2 = this.D1;
        if (!z10 || w03 != this.N2) {
            this.N2 = w03;
            t0Var2.setIconColor(w03);
        }
        if (!this.L2 || w04 != this.O2) {
            this.O2 = w04;
            org.telegram.ui.ActionBar.t6.H1(t0Var.getBackground(), w04, true);
            org.telegram.ui.ActionBar.t6.H1(t0Var2.getBackground(), w04, true);
        }
        this.L2 = true;
        this.I1.setProgressColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Jj, this.I0));
        d1();
        int i10 = org.telegram.ui.ActionBar.t6.G8;
        t0Var.H(org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
        int i11 = org.telegram.ui.ActionBar.t6.E8;
        t0Var2.O(org.telegram.ui.ActionBar.t6.w0(i11, this.I0), false);
        t0Var2.O(org.telegram.ui.ActionBar.t6.w0(i11, this.I0), true);
        t0Var2.H(org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
    }

    public final void M0(org.telegram.messenger.kj kjVar) {
        ArrayList j10;
        TLRPC.TL_document tL_document;
        int i10 = org.telegram.messenger.e20.f15506s0;
        int i11 = this.f21584a;
        LaunchActivity launchActivity = this.f32127w2;
        if (i10 != i11) {
            launchActivity.O0(i11);
        }
        Bundle j11 = org.telegram.ui.Cells.f1.j(3, "onlySelect", "dialogsType", true);
        j11.putBoolean("canSelectTopics", true);
        org.telegram.ui.zx zxVar = new org.telegram.ui.zx(j11);
        if (kjVar.f1() < 0) {
            if (!(kjVar.F0() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) kjVar.F0();
            j10 = null;
        } else {
            j10 = org.telegram.messenger.m5.j(kjVar);
            tL_document = null;
        }
        zxVar.C2 = new a1.d(this, j10, tL_document, kjVar, 5);
        launchActivity.t0(zxVar);
        dismiss();
    }

    public final boolean O0() {
        org.telegram.messenger.qp qpVar = this.f32107m2;
        if (qpVar != null && qpVar.f17803b == org.telegram.messenger.e20.i(this.f21584a).e()) {
            return true;
        }
        return false;
    }

    public final void P0(int i10) {
        LaunchActivity launchActivity;
        org.telegram.messenger.kj kjVar = MediaController.B().f14483u0;
        if (kjVar != null && (launchActivity = this.f32127w2) != null) {
            if (i10 == 1) {
                M0(kjVar);
            } else if (i10 == 2) {
                V0(kjVar);
            } else if (i10 == 4) {
                int i11 = org.telegram.messenger.e20.f15506s0;
                int i12 = this.f21584a;
                if (i11 != i12) {
                    launchActivity.O0(i12);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.kj.B0(kjVar.f16690k);
                if (org.telegram.messenger.o5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.o5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat L0 = org.telegram.messenger.wp.r1(this.f21584a).L0(Long.valueOf(-B0));
                    if (L0 != null && L0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -L0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", kjVar.f1());
                org.telegram.messenger.at.f(this.f21584a).k(org.telegram.messenger.at.f14786t, new Object[0]);
                launchActivity.u0(new org.telegram.ui.un(bundle), false, false);
                dismiss();
            } else if (i10 == 5) {
                Q0(kjVar);
            } else if (i10 == 6) {
                hf.b.e0().l0(MediaController.B().z());
                this.G1.performClick();
            } else if (i10 == 7) {
                R0(kjVar, false, new s6(this, kjVar, 0), false);
            } else if (i10 == 8) {
                vh.f5 f5Var = new vh.f5(getContext(), true, null, new u6(this, 0), null);
                f5Var.Z1 = true;
                f5Var.R1 = false;
                f5Var.f51159h2.O(true);
                f5Var.show();
            }
        }
    }

    public final void Q0(org.telegram.messenger.kj kjVar) {
        String str;
        if (Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.v2.f18579b) {
            LaunchActivity launchActivity = this.f32127w2;
            if (launchActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                launchActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        String B = org.telegram.messenger.b8.B(kjVar.F0());
        if (TextUtils.isEmpty(B)) {
            B = kjVar.S0();
        }
        String str2 = B;
        String str3 = kjVar.f16690k.attachPath;
        if (str3 != null && str3.length() > 0 && !sc.e.x(str3)) {
            str3 = null;
        }
        if (str3 == null || str3.length() == 0) {
            org.telegram.messenger.b8.G(this.f21584a);
            str3 = org.telegram.messenger.b8.N(kjVar.f16690k, false, true).toString();
        }
        String str4 = str3;
        if (kjVar.F0() != null) {
            str = kjVar.F0().mime_type;
        } else {
            str = "";
        }
        String str5 = str;
        MediaController.d0(str4, this.f32127w2, 3, str2, str5, new u6(this, 1));
    }

    public final void R0(org.telegram.messenger.kj kjVar, boolean z10, Runnable runnable, boolean z11) {
        TLRPC.Document F0 = kjVar.F0();
        if (F0 == null) {
            return;
        }
        long j10 = F0.f19800id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z10;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.f19822id = tL_inputDocument;
        tL_inputDocument.f19806id = j10;
        tL_inputDocument.access_hash = F0.access_hash;
        byte[] bArr = F0.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.f21584a).sendRequest(tL_account_saveMusic, new x6(this, z11, kjVar, z10, runnable, j10, F0));
    }

    @Override
    public final int S() {
        e7 e7Var = this.f32122u1;
        if (e7Var == null) {
            return 0;
        }
        if (this.f32109n2.size() <= 1) {
            return e7Var.getMeasuredHeight() + this.f21615s0;
        }
        int L = org.telegram.messenger.i0.L(13.0f);
        int translationY = (int) (this.f32110o1.getTranslationY() + ((this.f32115q2 - this.f21615s0) - L));
        if (this.f21615s0 + translationY < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            float L2 = org.telegram.messenger.i0.L(4.0f) + L;
            translationY -= (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - L2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - translationY) - this.f21615s0) / L2));
        }
        return this.f21590c.getMeasuredHeight() - (translationY + org.telegram.messenger.i0.f16166m);
    }

    public final boolean S0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w7.S0(boolean):boolean");
    }

    public final void T0(org.telegram.ui.ActionBar.b1 b1Var, boolean z10) {
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.t6.Lj;
            b1Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
            b1Var.setIconColor(org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.t6.E8;
        b1Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, this.I0));
        b1Var.setIconColor(org.telegram.ui.ActionBar.t6.w0(i11, this.I0));
    }

    public final void U0(final boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        boolean O0 = O0();
        vh.d dVar = this.f32126w1;
        vh.d dVar2 = this.f32124v1;
        if (!O0 && !this.f32113p2) {
            dVar2.setVisibility(0);
            dVar.setVisibility(0);
            ViewPropertyAnimator animate = dVar2.animate();
            float f13 = 0.0f;
            float f14 = 1.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (z10) {
                f10 = 0.8f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (z10) {
                f11 = 0.8f;
            } else {
                f11 = 1.0f;
            }
            ViewPropertyAnimator duration = scaleX.scaleY(f11).setDuration(420L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).withEndAction(new Runnable(this) {
                public final w7 f30537b;

                {
                    this.f30537b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    int i11;
                    switch (r3) {
                        case 0:
                            vh.d dVar3 = this.f30537b.f32124v1;
                            if (z10) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            dVar3.setVisibility(i10);
                            return;
                        default:
                            vh.d dVar4 = this.f30537b.f32126w1;
                            if (z10) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            dVar4.setVisibility(i11);
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = dVar.animate();
            if (z10) {
                f13 = 1.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f13);
            if (!z10) {
                f12 = 0.8f;
            } else {
                f12 = 1.0f;
            }
            ViewPropertyAnimator scaleX2 = alpha2.scaleX(f12);
            if (!z10) {
                f14 = 0.8f;
            }
            scaleX2.scaleY(f14).setDuration(420L).setInterpolator(grVar).withEndAction(new Runnable(this) {
                public final w7 f30537b;

                {
                    this.f30537b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    int i11;
                    switch (r3) {
                        case 0:
                            vh.d dVar3 = this.f30537b.f32124v1;
                            if (z10) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            dVar3.setVisibility(i10);
                            return;
                        default:
                            vh.d dVar4 = this.f30537b.f32126w1;
                            if (z10) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            dVar4.setVisibility(i11);
                            return;
                    }
                }
            }).start();
            return;
        }
        dVar2.setVisibility(8);
        dVar.setVisibility(8);
    }

    @Override
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        o6 o6Var = new o6(this, 0);
        int i10 = org.telegram.ui.ActionBar.t6.Cj;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f32101j1, 1024, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        int i11 = org.telegram.ui.ActionBar.t6.Gj;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f32101j1, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f21587b, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f21613r0}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21002h5));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.I1, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Jj));
        int i12 = org.telegram.ui.ActionBar.t6.f21279w7;
        org.telegram.ui.ActionBar.t0 t0Var = this.L1;
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21297x7));
        int i13 = org.telegram.ui.ActionBar.t6.Kj;
        org.telegram.ui.ActionBar.t0 t0Var2 = this.R1;
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, org.telegram.ui.ActionBar.t6.Lj));
        int i14 = org.telegram.ui.ActionBar.t6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, i14));
        int i15 = org.telegram.ui.ActionBar.t6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, i15));
        org.telegram.ui.ActionBar.t0 t0Var3 = this.D1;
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, i14));
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, i15));
        g7 g7Var = this.A1;
        arrayList.add(new org.telegram.ui.ActionBar.c7(g7Var, new ci0[]{g7Var.getAnimatedDrawable()}, "Triangle 3", i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(g7Var, new ci0[]{g7Var.getAnimatedDrawable()}, "Triangle 4", i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(g7Var, new ci0[]{g7Var.getAnimatedDrawable()}, "Rectangle 4", i13));
        int i16 = org.telegram.ui.ActionBar.t6.f21021i6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.A1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.W1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i16));
        h7 h7Var = this.B1;
        arrayList.add(new org.telegram.ui.ActionBar.c7(h7Var, new ci0[]{h7Var.getAnimatedDrawable()}, "Triangle 3", i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(h7Var, new ci0[]{h7Var.getAnimatedDrawable()}, "Triangle 4", i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(h7Var, new ci0[]{h7Var.getAnimatedDrawable()}, "Rectangle 4", i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.B1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i16));
        int i17 = org.telegram.ui.ActionBar.t6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f32118s1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f32120t1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.I1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20912c7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.I1, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21003h6));
        o7 o7Var = this.f32132z1;
        arrayList.add(new org.telegram.ui.ActionBar.c7(o7Var.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(o7Var.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        o7 o7Var2 = this.C1;
        arrayList.add(new org.telegram.ui.ActionBar.c7(o7Var2.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(o7Var2.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f21587b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.wj));
        return arrayList;
    }

    public final void V0(org.telegram.messenger.kj r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w7.V0(org.telegram.messenger.kj):void");
    }

    public final void W0(boolean z10, boolean z11) {
        g9 g9Var = this.Z1;
        e7 e7Var = this.Y1;
        if (z10) {
            if (e7Var.getVisibility() != 0 && !this.f32093c2) {
                e7Var.setTag(1);
                n7 n7Var = this.f32130y1;
                g9Var.setImageBitmap(n7Var.f28694a[n7Var.f28695b].getImageReceiver().n());
                this.f32093c2 = true;
                ol0.d(new q6(this, 1));
                e7Var.setVisibility(0);
                e7Var.animate().alpha(1.0f).setDuration(180L).setListener(new l7(this, 0)).start();
                g9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            }
        } else if (e7Var.getVisibility() != 0) {
        } else {
            e7Var.setTag(null);
            if (z11) {
                this.f32093c2 = true;
                e7Var.animate().alpha(0.0f).setDuration(180L).setListener(new l7(this, 1)).start();
                g9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
                return;
            }
            e7Var.setAlpha(0.0f);
            e7Var.setVisibility(4);
            g9Var.setImageBitmap(null);
            g9Var.setScaleX(0.9f);
            g9Var.setScaleY(0.9f);
        }
    }

    public final void X0(org.telegram.ui.Cells.w wVar, org.telegram.messenger.kj kjVar) {
        z60 G = z60.G(this.f21590c, this.I0, wVar, true);
        int i10 = 3;
        boolean z10 = false;
        if (O0()) {
            G.l(2131232164, org.telegram.messenger.dd.L0(2131750588, null), new v6(this, G, kjVar, 0), !this.f32113p2);
            G.l(2131232364, org.telegram.messenger.dd.L0(2131745477, null), new v6(this, G, kjVar, 1), !this.f32113p2);
            G.c(2131232107, org.telegram.messenger.dd.L0(2131751599, null), new v6(this, kjVar, G, 2), true);
        } else {
            G.l(2131232389, org.telegram.messenger.dd.L0(2131753916, null), new bi.k(G, J0(G, kjVar), 5), !this.f32113p2);
            if (!this.f32113p2 && G.y() != null) {
                G.y().setRightIcon(2131232058);
            }
            G.k();
            G.l(2131232164, org.telegram.messenger.dd.L0(2131750588, null), new v6(this, G, kjVar, 3), !this.f32113p2);
            G.l(2131232362, org.telegram.messenger.dd.L0(2131745477, null), new v6(this, G, kjVar, 4), !this.f32113p2);
            if (kjVar.f1() > 0) {
                z10 = true;
            }
            G.l(2131232419, org.telegram.messenger.dd.L0(2131745360, null), new s6(this, kjVar, 1), z10);
        }
        if (!org.telegram.messenger.dd.X) {
            i10 = 5;
        }
        G.V(i10);
        G.Z();
    }

    @Override
    public final boolean Y(float f7, float f10) {
        int i10;
        FrameLayout frameLayout = this.E;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.E.getChildAt(0);
            if (f10 >= childAt.getY() + this.E.getY()) {
                if (f10 <= childAt.getY() + this.E.getY() + childAt.getHeight()) {
                    if (f7 >= childAt.getX() + this.E.getX()) {
                        if (f7 <= childAt.getX() + this.E.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        int top = this.f21587b.getTop();
        Drawable drawable = this.f21613r0;
        if (drawable != null) {
            i10 = drawable.getBounds().top;
        } else {
            i10 = 0;
        }
        if (f10 >= top + i10 && f7 >= this.f21587b.getLeft() && f7 <= this.f21587b.getRight()) {
            return false;
        }
        return true;
    }

    public final void Y0() {
        if (this.f32129x2 == 1) {
            this.A2 = System.currentTimeMillis();
            this.f32131y2 = MediaController.B().f14483u0.f16652b0;
            mg.c2 c2Var = this.E2;
            org.telegram.messenger.i0.r(c2Var);
            org.telegram.messenger.i0.g3(c2Var);
        }
    }

    public final void Z0() {
        int i10;
        LinearLayout linearLayout = this.f32116r1;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        if (this.f32122u1.getVisibility() == 0) {
            i10 = org.telegram.messenger.i0.L(150.0f);
        } else {
            i10 = -org.telegram.messenger.i0.L(30.0f);
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.f21587b.getMeasuredHeight()) - i10) / 2);
    }

    public final void a1(boolean z10) {
        if (this.L1 != null) {
            float f7 = MediaController.B().f14473q0;
            this.M1.n(z10, f7);
            this.N1.e(z10, f7);
            updateColors();
            boolean z11 = this.O1;
            int i10 = 0;
            this.O1 = false;
            while (true) {
                org.telegram.ui.ActionBar.b1[] b1VarArr = this.P1;
                if (i10 < b1VarArr.length) {
                    if (!z11 && L0(f7, Q2[i10])) {
                        org.telegram.ui.ActionBar.b1 b1Var = b1VarArr[i10];
                        int i11 = org.telegram.ui.ActionBar.t6.Ei;
                        b1Var.d(org.telegram.ui.ActionBar.t6.w0(i11, this.I0), org.telegram.ui.ActionBar.t6.w0(i11, this.I0));
                    } else {
                        org.telegram.ui.ActionBar.b1 b1Var2 = b1VarArr[i10];
                        int i12 = org.telegram.ui.ActionBar.t6.E8;
                        b1Var2.d(org.telegram.ui.ActionBar.t6.w0(i12, this.I0), org.telegram.ui.ActionBar.t6.w0(i12, this.I0));
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b1(org.telegram.messenger.kj r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w7.b1(org.telegram.messenger.kj, boolean):void");
    }

    public final void c1() {
        int i10 = org.telegram.messenger.uz.S0;
        org.telegram.ui.ActionBar.t0 t0Var = this.R1;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                t0Var.setIcon(2131232553);
                int i11 = org.telegram.ui.ActionBar.t6.Lj;
                t0Var.setTag(Integer.valueOf(i11));
                t0Var.setIconColor(org.telegram.ui.ActionBar.t6.w0(i11, this.I0));
                org.telegram.ui.ActionBar.t6.H1(t0Var.getBackground(), org.telegram.ui.ActionBar.t6.w0(i11, this.I0) & 436207615, true);
                t0Var.setContentDescription(org.telegram.messenger.dd.L0(2131754785, null));
                return;
            }
            return;
        }
        if (org.telegram.messenger.uz.N0) {
            if (i10 == 0) {
                t0Var.setIcon(2131232554);
            } else {
                t0Var.setIcon(2131232551);
            }
        } else if (org.telegram.messenger.uz.O0) {
            if (i10 == 0) {
                t0Var.setIcon(2131232548);
            } else {
                t0Var.setIcon(2131232550);
            }
        } else {
            t0Var.setIcon(2131232552);
        }
        if (i10 == 0 && !org.telegram.messenger.uz.N0 && !org.telegram.messenger.uz.O0) {
            int i12 = org.telegram.ui.ActionBar.t6.Kj;
            t0Var.setTag(Integer.valueOf(i12));
            t0Var.setIconColor(org.telegram.ui.ActionBar.t6.w0(i12, this.I0));
            org.telegram.ui.ActionBar.t6.H1(t0Var.getBackground(), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21021i6, this.I0), true);
            t0Var.setContentDescription(org.telegram.messenger.dd.L0(2131754786, null));
            return;
        }
        int i13 = org.telegram.ui.ActionBar.t6.Lj;
        t0Var.setTag(Integer.valueOf(i13));
        t0Var.setIconColor(org.telegram.ui.ActionBar.t6.w0(i13, this.I0));
        org.telegram.ui.ActionBar.t6.H1(t0Var.getBackground(), 436207615 & org.telegram.ui.ActionBar.t6.w0(i13, this.I0), true);
        if (i10 == 0) {
            if (org.telegram.messenger.uz.N0) {
                t0Var.setContentDescription(org.telegram.messenger.dd.L0(2131745340, null));
                return;
            } else {
                t0Var.setContentDescription(org.telegram.messenger.dd.L0(2131746044, null));
                return;
            }
        }
        t0Var.setContentDescription(org.telegram.messenger.dd.L0(2131754787, null));
    }

    public final void d1() {
        boolean z10;
        T0(this.U1, org.telegram.messenger.uz.N0);
        T0(this.V1, org.telegram.messenger.uz.O0);
        boolean z11 = false;
        if (org.telegram.messenger.uz.S0 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        T0(this.T1, z10);
        if (org.telegram.messenger.uz.S0 == 2) {
            z11 = true;
        }
        T0(this.S1, z11);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        org.telegram.ui.Cells.w wVar;
        org.telegram.messenger.kj messageObject;
        org.telegram.ui.Cells.w wVar2;
        org.telegram.messenger.kj messageObject2;
        org.telegram.messenger.kj kjVar;
        int i12 = org.telegram.messenger.at.f14718h2;
        int i13 = org.telegram.messenger.at.f14706f2;
        int i14 = org.telegram.messenger.at.f14712g2;
        j7 j7Var = this.f32110o1;
        int i15 = 0;
        if (i10 != i12 && i10 != i14 && i10 != i13) {
            if (i10 == org.telegram.messenger.at.f14700e2) {
                org.telegram.messenger.kj kjVar2 = MediaController.B().f14483u0;
                if (kjVar2 != null && kjVar2.I3()) {
                    b1(kjVar2, false);
                    return;
                }
                return;
            } else if (i10 == org.telegram.messenger.at.J4) {
                a1(true);
                return;
            } else {
                int i16 = org.telegram.messenger.at.K0;
                v7 v7Var = this.f32114q1;
                if (i10 == i16) {
                    this.f32107m2 = MediaController.B().Q0;
                    this.f32109n2 = MediaController.B().R0;
                    v7Var.f();
                    return;
                } else if (i10 == org.telegram.messenger.at.L0) {
                    this.f32107m2 = MediaController.B().Q0;
                    this.f32109n2 = MediaController.B().R0;
                    v7Var.f();
                    if (org.telegram.messenger.uz.O0) {
                        j7Var.C0();
                        int intValue = ((Integer) objArr[0]).intValue();
                        s4.a0 a0Var = this.f32112p1;
                        a0Var.L0();
                        int N0 = a0Var.N0();
                        if (N0 != -1) {
                            View m10 = a0Var.m(N0);
                            if (m10 != null) {
                                i15 = m10.getTop();
                            }
                            a0Var.h1(N0 + intValue, i15);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == org.telegram.messenger.at.Y1) {
                    if (((String) objArr[0]).equals(this.f32117r2)) {
                        f1(false);
                        this.f32097g2 = true;
                        return;
                    }
                    return;
                } else if (i10 == org.telegram.messenger.at.X1) {
                    if (((String) objArr[0]).equals(this.f32117r2) && (kjVar = MediaController.B().f14483u0) != null) {
                        Long l4 = (Long) objArr[1];
                        Long l10 = (Long) objArr[2];
                        float f7 = 1.0f;
                        if (!this.f32097g2) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f32096f2) >= 500) {
                                if (MediaController.B().f14464l0) {
                                    f7 = org.telegram.messenger.b8.G(this.f21584a).t(this.f32117r2, kjVar.f16652b0);
                                }
                                this.f32096f2 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        if (f7 != -1.0f) {
                            o1.j jVar = this.f32095e2;
                            jVar.f13958m.f13965i = f7 * 1000.0f;
                            jVar.h();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == org.telegram.messenger.at.U3) {
                    f1(false);
                    return;
                } else {
                    return;
                }
            }
        }
        if (i10 == i13 && ((Boolean) objArr[1]).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        f1(z10);
        if (i10 != i13 && i10 != i14) {
            if (((org.telegram.messenger.kj) objArr[0]).T == 0) {
                int childCount = j7Var.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = j7Var.getChildAt(i17);
                    if ((childAt instanceof org.telegram.ui.Cells.w) && (messageObject2 = (wVar2 = (org.telegram.ui.Cells.w) childAt).getMessageObject()) != null && (org.telegram.messenger.kj.R4(messageObject2.f16690k) || messageObject2.I3())) {
                        wVar2.b(false, true);
                    }
                }
            } else {
                return;
            }
        } else {
            int childCount2 = j7Var.getChildCount();
            for (int i18 = 0; i18 < childCount2; i18++) {
                View childAt2 = j7Var.getChildAt(i18);
                if ((childAt2 instanceof org.telegram.ui.Cells.w) && (messageObject = (wVar = (org.telegram.ui.Cells.w) childAt2).getMessageObject()) != null && (org.telegram.messenger.kj.R4(messageObject.f16690k) || messageObject.I3())) {
                    wVar.b(false, true);
                }
            }
            if (i10 == i14 && MediaController.B().f14483u0 != null) {
                if (MediaController.B().H()) {
                    Y0();
                } else if (this.f32129x2 == 1 && this.f32131y2 != -1.0f) {
                    mg.c2 c2Var = this.E2;
                    org.telegram.messenger.i0.r(c2Var);
                    this.B2 = 0L;
                    c2Var.run();
                    this.f32131y2 = -1.0f;
                }
            }
        }
        org.telegram.ui.vr vrVar = this.E1;
        if (vrVar != null) {
            vrVar.a(b5.d.u());
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.at.f(this.f21584a).n(this, org.telegram.messenger.at.f14706f2);
        org.telegram.messenger.at.f(this.f21584a).n(this, org.telegram.messenger.at.f14712g2);
        org.telegram.messenger.at.f(this.f21584a).n(this, org.telegram.messenger.at.f14718h2);
        org.telegram.messenger.at.f(this.f21584a).n(this, org.telegram.messenger.at.f14700e2);
        org.telegram.messenger.at.f(this.f21584a).n(this, org.telegram.messenger.at.Y1);
        org.telegram.messenger.at.f(this.f21584a).n(this, org.telegram.messenger.at.X1);
        org.telegram.messenger.at.f(this.f21584a).n(this, org.telegram.messenger.at.K0);
        org.telegram.messenger.at.f(this.f21584a).n(this, org.telegram.messenger.at.L0);
        org.telegram.messenger.at.f(this.f21584a).n(this, org.telegram.messenger.at.U3);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.J4);
        org.telegram.messenger.b6.q(this.f21584a).v(this);
        if (P2 == this) {
            P2 = null;
        }
    }

    public final void e1() {
        int i10;
        int w02;
        int i11;
        int i12;
        if (this.f32104k2) {
            i10 = org.telegram.ui.ActionBar.t6.f20873a7;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.f21002h5;
        }
        int w03 = org.telegram.ui.ActionBar.t6.w0(i10, this.I0);
        if (w03 != this.K2) {
            this.K2 = w03;
            v0(w03);
        }
        int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kj, this.I0);
        g7 g7Var = this.A1;
        if (g7Var != null) {
            g7Var.h(w04, "Triangle 3");
            g7Var.h(w04, "Triangle 4");
            g7Var.h(w04, "Rectangle 4");
        }
        h7 h7Var = this.B1;
        if (h7Var != null) {
            h7Var.h(w04, "Triangle 3");
            h7Var.h(w04, "Triangle 4");
            h7Var.h(w04, "Rectangle 4");
        }
        p7 p7Var = this.J1;
        if (p7Var != null) {
            p7Var.setOuterColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Jj, this.I0));
        }
        boolean z10 = false;
        org.telegram.ui.ActionBar.t0 t0Var = this.L1;
        if (t0Var != null) {
            float f7 = MediaController.B().f14473q0;
            if (!L0(f7, 1.0f)) {
                i11 = org.telegram.ui.ActionBar.t6.Ei;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.f21297x7;
            }
            int w05 = org.telegram.ui.ActionBar.t6.w0(i11, this.I0);
            jh.g gVar = this.M1;
            if (gVar != null) {
                ((e6) gVar.f10415b).u(w05);
                Paint paint = (Paint) gVar.f10416c;
                if (paint != null) {
                    paint.setColor(w05);
                }
            }
            org.telegram.ui.ActionBar.t6.H1(t0Var.getBackground(), w05 & 436207615, true);
            int i13 = 0;
            while (true) {
                org.telegram.ui.ActionBar.b1[] b1VarArr = this.P1;
                if (i13 >= b1VarArr.length) {
                    break;
                }
                if (b1VarArr[i13] != null) {
                    if (L0(f7, Q2[i13])) {
                        i12 = org.telegram.ui.ActionBar.t6.Ei;
                    } else {
                        i12 = org.telegram.ui.ActionBar.t6.E8;
                    }
                    int w06 = org.telegram.ui.ActionBar.t6.w0(i12, this.I0);
                    b1VarArr[i13].d(w06, w06);
                }
                i13++;
            }
        }
        org.telegram.ui.ActionBar.b1 b1Var = this.F1;
        if (b1Var != null) {
            i7 i7Var = this.G1;
            if (i7Var != null && i7Var.b()) {
                z10 = true;
            }
            int w07 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, this.I0);
            int w08 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, this.I0);
            int i14 = org.telegram.ui.ActionBar.t6.Ci;
            b1Var.e(w07, w08, org.telegram.ui.ActionBar.t6.w0(i14, this.I0), z10);
            org.telegram.ui.ActionBar.b1 b1Var2 = this.F1;
            if (i7Var != null && i7Var.b()) {
                w02 = org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i14, this.I0));
            } else {
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21021i6, this.I0);
            }
            b1Var2.setSelectorColor(w02);
        }
    }

    public final void f1(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w7.f1(boolean):void");
    }

    @Override
    public final int getObserverTag() {
        return this.f32125v2;
    }

    @Override
    public final void i(long j10, long j11) {
        this.I1.a(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
    }

    @Override
    public final boolean k0(View view, int i10, int i11, int i12, int i13) {
        e7 e7Var = this.Y1;
        if (view != e7Var) {
            return false;
        }
        e7Var.layout(0, 0, e7Var.getMeasuredWidth(), e7Var.getMeasuredHeight());
        return true;
    }

    @Override
    public final boolean l0(View view, int i10, int i11) {
        e7 e7Var = this.Y1;
        if (view == e7Var) {
            org.telegram.ui.ActionBar.p2 p2Var = this.f21590c;
            e7Var.measure(View.MeasureSpec.makeMeasureSpec(p2Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(p2Var.getMeasuredHeight(), 1073741824));
            return true;
        }
        return false;
    }

    @Override
    public final void onBackPressed() {
        kg.g1 g1Var = this.f32101j1;
        if (g1Var != null && g1Var.f20498n0) {
            g1Var.k(true);
        } else if (this.Y1.getTag() != null) {
            W0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        boolean z10;
        super.s0();
        try {
            if (this.f32092b2 != null && this.R1 != null && this.D1 != null && this.I1 != null) {
                K0();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            e1();
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        try {
            float f7 = this.D2;
            if (f7 >= 0.0f) {
                if (f7 <= 0.5f && i0.b.h(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, this.I0)) > 0.699999988079071d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != this.C2) {
                    this.C2 = z10;
                    org.telegram.messenger.i0.p3(this, z10);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.f8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        P2 = this;
    }

    public final void updateColors() {
        int w02;
        int i10;
        boolean z10 = true;
        org.telegram.ui.ActionBar.t0 t0Var = this.L1;
        if (t0Var != null) {
            if (!L0(MediaController.B().f14473q0, 1.0f)) {
                i10 = org.telegram.ui.ActionBar.t6.Ei;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.f21297x7;
            }
            int w03 = org.telegram.ui.ActionBar.t6.w0(i10, this.I0);
            jh.g gVar = this.M1;
            if (gVar != null) {
                ((e6) gVar.f10415b).u(w03);
                Paint paint = (Paint) gVar.f10416c;
                if (paint != null) {
                    paint.setColor(w03);
                }
            }
            t0Var.setBackground(org.telegram.ui.ActionBar.t6.h0(w03 & 436207615, 1, org.telegram.messenger.i0.L(14.0f)));
        }
        org.telegram.ui.ActionBar.b1 b1Var = this.F1;
        if (b1Var != null) {
            i7 i7Var = this.G1;
            z10 = (i7Var == null || !i7Var.b()) ? false : false;
            int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, this.I0);
            int w05 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, this.I0);
            int i11 = org.telegram.ui.ActionBar.t6.Ci;
            b1Var.e(w04, w05, org.telegram.ui.ActionBar.t6.w0(i11, this.I0), z10);
            org.telegram.ui.ActionBar.b1 b1Var2 = this.F1;
            if (i7Var != null && i7Var.b()) {
                w02 = org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i11, this.I0));
            } else {
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21021i6, this.I0);
            }
            b1Var2.setSelectorColor(w02);
        }
    }

    @Override
    public final void D(boolean z10) {
    }

    @Override
    public final void N(String str) {
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
