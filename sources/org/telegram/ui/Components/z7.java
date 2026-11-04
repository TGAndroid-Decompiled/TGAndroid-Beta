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
public final class z7 extends org.telegram.ui.ActionBar.t2 implements org.telegram.messenger.cs, org.telegram.messenger.x5 {
    public static z7 Q2;
    public static final float[] R2 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final r7 A1;
    public int A2;
    public final i7 B1;
    public long B2;
    public final j7 C1;
    public long C2;
    public final r7 D1;
    public boolean D2;
    public final org.telegram.ui.ActionBar.q0 E1;
    public float E2;
    public final org.telegram.ui.tq F1;
    public final mi.b0 F2;
    public org.telegram.ui.ActionBar.y0 G1;
    public m7 G2;
    public final k7 H1;
    public long H2;
    public final boolean I1;
    public float I2;
    public final d70 J1;
    public final org.telegram.ui.Cells.f2 J2;
    public final s7 K1;
    public ValueAnimator K2;
    public final org.telegram.ui.ActionBar.k5 L1;
    public int L2;
    public final org.telegram.ui.ActionBar.q0 M1;
    public boolean M2;
    public final cu0 N1;
    public int N2;
    public final org.telegram.ui.ActionBar.u0 O1;
    public int O2;
    public boolean P1;
    public int P2;
    public final org.telegram.ui.ActionBar.y0[] Q1;
    public final TextView R1;
    public final org.telegram.ui.ActionBar.q0 S1;
    public final org.telegram.ui.ActionBar.y0 T1;
    public final org.telegram.ui.ActionBar.y0 U1;
    public final org.telegram.ui.ActionBar.y0 V1;
    public final org.telegram.ui.ActionBar.y0 W1;
    public final ImageView X1;
    public final je0 Y1;
    public final g7 Z1;
    public final k9 f40940a2;
    public final org.telegram.ui.ActionBar.q0 f40941b2;
    public final org.telegram.ui.ActionBar.q0 c2;
    public boolean f40942d2;
    public final View[] f40943e2;
    public final q1.g f40944f2;
    public long f40945g2;
    public boolean f40946h2;
    public boolean f40947i2;
    public final View f40948j1;
    public int f40949j2;
    public final p7 k1;
    public int f40950k2;
    public final View f40951l1;
    public final boolean f40952l2;
    public final View m1;
    public final boolean f40953m2;
    public boolean f40954n1;
    public org.telegram.messenger.bp f40955n2;
    public boolean f40956o1;
    public ArrayList f40957o2;
    public final l7 f40958p1;
    public org.telegram.messenger.zi f40959p2;
    public final u4.b0 f40960q1;
    public boolean f40961q2;
    public final y7 f40962r1;
    public int f40963r2;
    public final LinearLayout f40964s1;
    public String f40965s2;
    public final TextView f40966t1;
    public AnimatorSet f40967t2;
    public final TextView f40968u1;
    public int f40969u2;
    public final g7 f40970v1;
    public int f40971v2;
    public final gi.d f40972w1;
    public final int f40973w2;
    public final gi.d f40974x1;
    public final LaunchActivity f40975x2;
    public final u4.y f40976y1;
    public int f40977y2;
    public final q7 f40978z1;
    public float f40979z2;

    public z7(Activity activity, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, (Context) activity, e6Var, true);
        boolean z10;
        org.telegram.ui.ActionBar.x xVar;
        boolean z11;
        TLRPC.User a22;
        int i3;
        int i10;
        org.telegram.ui.ActionBar.y0[] y0VarArr = new org.telegram.ui.ActionBar.y0[6];
        this.Q1 = y0VarArr;
        View[] viewArr = new View[5];
        this.f40943e2 = viewArr;
        this.f40947i2 = true;
        this.f40949j2 = -1;
        this.f40963r2 = Integer.MAX_VALUE;
        this.f40979z2 = -1.0f;
        this.E2 = -1.0f;
        this.F2 = new mi.b0(this, 24);
        this.J2 = new org.telegram.ui.Cells.f2(this);
        this.f28613r = true;
        N();
        org.telegram.messenger.zi ziVar = MediaController.B().f21348v0;
        if (ziVar != null) {
            this.f28583a = ziVar.I1;
        } else {
            this.f28583a = org.telegram.messenger.h10.f22829t0;
        }
        this.f40975x2 = (LaunchActivity) activity;
        this.f40973w2 = org.telegram.messenger.z5.q(this.f28583a).k();
        org.telegram.messenger.hs.f(this.f28583a).c(this, org.telegram.messenger.hs.f23227f2);
        org.telegram.messenger.hs.f(this.f28583a).c(this, org.telegram.messenger.hs.f23233g2);
        org.telegram.messenger.hs.f(this.f28583a).c(this, org.telegram.messenger.hs.f23239h2);
        org.telegram.messenger.hs.f(this.f28583a).c(this, org.telegram.messenger.hs.f23221e2);
        org.telegram.messenger.hs.f(this.f28583a).c(this, org.telegram.messenger.hs.Y1);
        org.telegram.messenger.hs.f(this.f28583a).c(this, org.telegram.messenger.hs.X1);
        org.telegram.messenger.hs.f(this.f28583a).c(this, org.telegram.messenger.hs.K0);
        org.telegram.messenger.hs.f(this.f28583a).c(this, org.telegram.messenger.hs.L0);
        org.telegram.messenger.hs.f(this.f28583a).c(this, org.telegram.messenger.hs.U3);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.J4);
        o7 o7Var = new o7(this, activity);
        this.f28586b = o7Var;
        o7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f28586b;
        int i11 = this.f28618u0;
        viewGroup.setPadding(i11, 0, i11, 0);
        p7 p7Var = new p7(this, activity, e6Var, 0);
        this.k1 = p7Var;
        p7Var.setBackgroundColor(0);
        p7Var.setBackButtonImage(2131231240);
        int i12 = org.telegram.ui.ActionBar.k6.Cj;
        org.telegram.ui.ActionBar.r6.m(p7Var, 1, i12, e6Var);
        org.telegram.ui.ActionBar.r6.m(p7Var, 3, org.telegram.ui.ActionBar.k6.Bj, e6Var);
        org.telegram.ui.ActionBar.r6.m(p7Var, 5, i12, e6Var);
        org.telegram.ui.ActionBar.r6.m(p7Var, 6, org.telegram.ui.ActionBar.k6.Dj, e6Var);
        p7Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.x q10 = p7Var.q();
        q10.setLayoutParams(b8.mf.e(-1, -1, 119));
        View view = new View(activity);
        this.f40948j1 = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, view, e6Var);
        p7Var.addView(view, 0, b8.mf.e(-1, -1, 119));
        view.setAlpha(0.0f);
        p7Var.setAlpha(0.0f);
        p7Var.setActionBarMenuOnItemClick(new org.telegram.ui.o9(this, 11));
        View view2 = new View(activity);
        this.f40951l1 = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(2131231237);
        View view3 = new View(activity);
        this.m1 = view3;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view3, e6Var);
        g7 g7Var = new g7(this, activity, 2);
        this.f40970v1 = g7Var;
        q7 q7Var = new q7(this, activity);
        this.f40978z1 = q7Var;
        g7Var.addView(q7Var, b8.mf.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        r7 r7Var = new r7(this, activity, activity, 0);
        this.A1 = r7Var;
        g7Var.addView(r7Var, b8.mf.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        r7 r7Var2 = new r7(this, activity, activity, 1);
        this.D1 = r7Var2;
        g7Var.addView(r7Var2, b8.mf.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        s7 s7Var = new s7(this, activity, e6Var);
        this.K1 = s7Var;
        s7Var.setLineWidth(4);
        s7Var.setDelegate(new gi.v5(this, 28));
        s7Var.setReportChanges(true);
        g7Var.addView(s7Var, b8.mf.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        q1.g gVar = new q1.g(new q1.f(0.0f));
        q1.h hVar = new q1.h();
        hVar.b(750.0f);
        hVar.a(1.0f);
        gVar.f53653m = hVar;
        gVar.b(new c7(this, 0));
        this.f40944f2 = gVar;
        d70 d70Var = new d70(activity);
        this.J1 = d70Var;
        d70Var.setVisibility(4);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Hj, d70Var, e6Var);
        d70Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Jj, this.J0));
        g7Var.addView(d70Var, b8.mf.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(activity);
        this.L1 = k5Var;
        k5Var.setTextSize(12);
        k5Var.l("0:00", false);
        int i13 = org.telegram.ui.ActionBar.k6.Gj;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i13, e6Var);
        k5Var.setImportantForAccessibility(2);
        g7Var.addView(k5Var, b8.mf.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.R1 = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i13, e6Var);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        g7Var.addView(textView, b8.mf.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(activity, null, 0, org.telegram.ui.ActionBar.k6.w0(i13, this.J0), false, e6Var);
        this.M1 = q0Var;
        q0Var.setLongClickEnabled(false);
        q0Var.setShowSubmenuByMove(false);
        q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(224.0f));
        q0Var.setContentDescription(org.telegram.messenger.bd.M0(2131754805, null));
        q0Var.setDelegate(new r6(this, 0));
        cu0 cu0Var = new cu0();
        this.N1 = cu0Var;
        q0Var.setIcon(cu0Var);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(getContext(), e6Var);
        this.O1 = u0Var;
        u0Var.setRoundRadiusDp(6.0f);
        u0Var.setDrawShadow(true);
        u0Var.setOnValueChange(new s6(this, 0));
        y0VarArr[0] = q0Var.e(0, 2131232373, org.telegram.messenger.bd.M0(2131745276, null));
        y0VarArr[1] = q0Var.e(1, 2131232372, org.telegram.messenger.bd.M0(2131745277, null));
        y0VarArr[2] = q0Var.e(2, 2131232371, org.telegram.messenger.bd.M0(2131745278, null));
        y0VarArr[3] = q0Var.e(3, 2131232370, org.telegram.messenger.bd.M0(2131745280, null));
        y0VarArr[4] = q0Var.e(4, 2131232375, org.telegram.messenger.bd.M0(2131745274, null));
        y0VarArr[5] = q0Var.e(5, 2131232374, org.telegram.messenger.bd.M0(2131745275, null));
        if (org.telegram.messenger.g0.f22607p >= 3.0f) {
            q0Var.setPadding(0, 1, 0, 0);
        }
        q0Var.setAdditionalXOffset(org.telegram.messenger.g0.L(8.0f));
        q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(400.0f));
        q0Var.setShowedFromBottom(true);
        g7Var.addView(q0Var, b8.mf.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        q0Var.setOnClickListener(new q2(1, this, fArr));
        q0Var.setOnLongClickListener(new ei.j2(2, this, e6Var));
        a1(false);
        g7 g7Var2 = new g7(this, activity, 0);
        g7Var.addView(g7Var2, b8.mf.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(activity, null, 0, 0, false, e6Var);
        this.S1 = q0Var2;
        viewArr[0] = q0Var2;
        q0Var2.setLongClickEnabled(false);
        q0Var2.setShowSubmenuByMove(false);
        q0Var2.setAdditionalYOffset(-org.telegram.messenger.g0.L(166.0f));
        int i14 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
        q0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(q0Var2, h02, null, N, e6Var);
        g7Var2.addView(q0Var2, b8.mf.e(48, 48, 51));
        q0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final z7 f38309b;

            {
                this.f38309b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i15 = r2;
                z7 z7Var = this.f38309b;
                switch (i15) {
                    case 0:
                        z7Var.d1();
                        z7Var.S1.U(null, null);
                        return;
                    default:
                        k7 k7Var = z7Var.H1;
                        org.telegram.messenger.zi ziVar2 = MediaController.B().f21348v0;
                        if (ziVar2 != null) {
                            boolean z12 = true;
                            f60 G = f60.G(z7Var.f28589c, z7Var.J0, view4, true);
                            f60 J0 = z7Var.J0(G, ziVar2);
                            if (!z7Var.O0()) {
                                G.l(2131232390, org.telegram.messenger.bd.M0(2131753916, null), new ai.y3(G, J0, 8), !z7Var.f40961q2);
                                if (!z7Var.f40961q2 && G.y() != null) {
                                    G.y().setRightIcon(2131232059);
                                }
                                G.k();
                            }
                            G.l(2131232165, org.telegram.messenger.bd.M0(2131750588, null), new y6(z7Var, G, 0), !z7Var.f40961q2);
                            G.l(2131232365, org.telegram.messenger.bd.M0(2131745469, null), new y6(z7Var, G, 1), !z7Var.f40961q2);
                            if (ziVar2.f1() <= 0) {
                                z12 = false;
                            }
                            G.l(2131232224, org.telegram.messenger.bd.M0(2131745352, null), new y6(z7Var, G, 2), z12);
                            if (z7Var.I1) {
                                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, G.f33722e, G.d, false, false);
                                G.d(y0Var);
                                z7Var.G1 = y0Var;
                                y0Var.j(org.telegram.messenger.bd.M0(2131743599, null), 2131231912, null);
                                z7Var.G1.setOnClickListener(new q2(2, z7Var, G));
                                org.telegram.messenger.g0.E2(k7Var);
                                z7Var.G1.addView(k7Var, 0, b8.mf.c(-1.0f, -1));
                                z7Var.updateColors();
                            }
                            G.m(2131232108, new y6(z7Var, G, 3), org.telegram.messenger.bd.M0(2131746653, null), z7Var.O0(), true);
                            G.X(org.telegram.messenger.g0.L(64.0f));
                            G.Z();
                            return;
                        }
                        return;
                }
            }
        });
        this.T1 = q0Var2.e(3, 2131232554, org.telegram.messenger.bd.M0(2131746281, null));
        this.U1 = q0Var2.e(4, 2131232553, org.telegram.messenger.bd.M0(2131746284, null));
        q0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.g0.L(4.0f);
        this.V1 = q0Var2.e(2, 2131232555, org.telegram.messenger.bd.M0(2131745332, null));
        q0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.g0.L(4.0f);
        this.W1 = q0Var2.e(1, 2131232549, org.telegram.messenger.bd.M0(2131746037, null));
        q0Var2.setShowedFromBottom(true);
        q0Var2.setDelegate(new r6(this, 1));
        int i15 = org.telegram.ui.ActionBar.k6.Kj;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i15, this.J0);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        i7 i7Var = new i7(this, activity, scaledTouchSlop);
        this.B1 = i7Var;
        viewArr[1] = i7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        i7Var.setScaleType(scaleType);
        i7Var.f(2131624137, 20, 20, null);
        i7Var.h(w02, "Triangle 3");
        i7Var.h(w02, "Triangle 4");
        i7Var.h(w02, "Rectangle 4");
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(22.0f));
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
        i7Var.setBackground(h03);
        org.telegram.ui.ActionBar.r6.k(i7Var, h03, null, N2, e6Var);
        g7Var2.addView(i7Var, b8.mf.e(48, 48, 51));
        i7Var.setContentDescription(org.telegram.messenger.bd.M0(2131754800, null));
        ImageView imageView = new ImageView(activity);
        this.X1 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        je0 je0Var = new je0(28);
        this.Y1 = je0Var;
        imageView.setImageDrawable(je0Var);
        je0Var.a(!MediaController.B().H(), false);
        org.telegram.ui.ActionBar.r6.t(imageView, i15, e6Var, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(24.0f));
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i14);
        imageView.setBackground(h04);
        org.telegram.ui.ActionBar.r6.k(imageView, h04, null, N3, e6Var);
        g7Var2.addView(imageView, b8.mf.e(48, 48, 51));
        imageView.setOnClickListener(new ai.t(13));
        j7 j7Var = new j7(this, activity, scaledTouchSlop);
        this.C1 = j7Var;
        viewArr[3] = j7Var;
        j7Var.setScaleType(scaleType);
        j7Var.f(2131624137, 20, 20, null);
        j7Var.h(w02, "Triangle 3");
        j7Var.h(w02, "Triangle 4");
        j7Var.h(w02, "Rectangle 4");
        j7Var.setRotation(180.0f);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(22.0f));
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i14);
        j7Var.setBackground(h05);
        org.telegram.ui.ActionBar.r6.k(j7Var, h05, null, N4, e6Var);
        g7Var2.addView(j7Var, b8.mf.e(48, 48, 51));
        j7Var.setContentDescription(org.telegram.messenger.bd.M0(2131748258, null));
        org.telegram.ui.ActionBar.q0 q0Var3 = new org.telegram.ui.ActionBar.q0(activity, null, 0, w02, false, e6Var);
        this.E1 = q0Var3;
        viewArr[4] = q0Var3;
        org.telegram.ui.tq tqVar = new org.telegram.ui.tq(2131231244, activity, e6Var);
        this.F1 = tqVar;
        q0Var3.setIcon(tqVar);
        q0Var3.setLongClickEnabled(false);
        q0Var3.setAdditionalYOffset(-org.telegram.messenger.g0.L(197.0f));
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i14);
        q0Var3.setBackground(h06);
        org.telegram.ui.ActionBar.r6.k(q0Var3, h06, null, N5, e6Var);
        q0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final z7 f38309b;

            {
                this.f38309b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i152 = r2;
                z7 z7Var = this.f38309b;
                switch (i152) {
                    case 0:
                        z7Var.d1();
                        z7Var.S1.U(null, null);
                        return;
                    default:
                        k7 k7Var = z7Var.H1;
                        org.telegram.messenger.zi ziVar2 = MediaController.B().f21348v0;
                        if (ziVar2 != null) {
                            boolean z12 = true;
                            f60 G = f60.G(z7Var.f28589c, z7Var.J0, view4, true);
                            f60 J0 = z7Var.J0(G, ziVar2);
                            if (!z7Var.O0()) {
                                G.l(2131232390, org.telegram.messenger.bd.M0(2131753916, null), new ai.y3(G, J0, 8), !z7Var.f40961q2);
                                if (!z7Var.f40961q2 && G.y() != null) {
                                    G.y().setRightIcon(2131232059);
                                }
                                G.k();
                            }
                            G.l(2131232165, org.telegram.messenger.bd.M0(2131750588, null), new y6(z7Var, G, 0), !z7Var.f40961q2);
                            G.l(2131232365, org.telegram.messenger.bd.M0(2131745469, null), new y6(z7Var, G, 1), !z7Var.f40961q2);
                            if (ziVar2.f1() <= 0) {
                                z12 = false;
                            }
                            G.l(2131232224, org.telegram.messenger.bd.M0(2131745352, null), new y6(z7Var, G, 2), z12);
                            if (z7Var.I1) {
                                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, G.f33722e, G.d, false, false);
                                G.d(y0Var);
                                z7Var.G1 = y0Var;
                                y0Var.j(org.telegram.messenger.bd.M0(2131743599, null), 2131231912, null);
                                z7Var.G1.setOnClickListener(new q2(2, z7Var, G));
                                org.telegram.messenger.g0.E2(k7Var);
                                z7Var.G1.addView(k7Var, 0, b8.mf.c(-1.0f, -1));
                                z7Var.updateColors();
                            }
                            G.m(2131232108, new y6(z7Var, G, 3), org.telegram.messenger.bd.M0(2131746653, null), z7Var.O0(), true);
                            G.X(org.telegram.messenger.g0.L(64.0f));
                            G.Z();
                            return;
                        }
                        return;
                }
            }
        });
        g7Var2.addView(q0Var3, b8.mf.e(48, 48, 51));
        k7 k7Var = new k7(this, activity, 0);
        this.H1 = k7Var;
        this.I1 = true;
        try {
            k7Var.setRouteSelector(f6.a.c(activity).a());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            this.I1 = false;
        }
        this.H1.setVisibility(4);
        org.telegram.ui.tq tqVar2 = this.F1;
        if (tqVar2 != null) {
            tqVar2.a(d1.f.u());
        }
        this.E1.setShowedFromBottom(true);
        this.E1.setDelegate(new r6(this, 2));
        this.E1.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f40964s1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i16 = 8;
        linearLayout.setVisibility(8);
        this.f28586b.addView(linearLayout, b8.mf.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new fi.a(11));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(2131232441);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.W5, e6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, b8.mf.o(-2, -2));
        TextView textView2 = new TextView(activity);
        this.f40966t1 = textView2;
        int i17 = org.telegram.ui.ActionBar.k6.X5;
        org.telegram.ui.ActionBar.r6.V(textView2, i17, e6Var);
        textView2.setGravity(17);
        textView2.setText(org.telegram.messenger.bd.M0(2131748251, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(textView2, b8.mf.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f40968u1 = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, i17, e6Var);
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(textView3, b8.mf.t(-2, -2, 17, 0, 6, 0, 0));
        l7 l7Var = new l7(this, activity);
        this.f40958p1 = l7Var;
        l7Var.setClipToPadding(false);
        getContext();
        u4.b0 b0Var = new u4.b0(1, false);
        this.f40960q1 = b0Var;
        l7Var.setLayoutManager(b0Var);
        l7Var.setHorizontalScrollBarEnabled(false);
        l7Var.setVerticalScrollBarEnabled(false);
        this.f28586b.addView(l7Var, b8.mf.e(-1, -1, 51));
        y7 y7Var = new y7(this, activity);
        this.f40962r1 = y7Var;
        l7Var.setAdapter(y7Var);
        org.telegram.ui.ActionBar.r6.m(l7Var, 21, org.telegram.ui.ActionBar.k6.A5, e6Var);
        l7Var.setOnItemClickListener(new ai.a(2));
        l7Var.setOnItemLongClickListener(new r6(this, 3));
        l7Var.setOnScrollListener(new ai.j5(this, 28));
        gi.d dVar = new gi.d(activity, e6Var, true);
        dVar.setRoundRadius(24);
        this.f40972w1 = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        spannableStringBuilder.setSpan(new wp(2131231178, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131753925, null));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final z7 f33755b;

            {
                this.f33755b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i18 = r3;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                z7 z7Var = this.f33755b;
                switch (i18) {
                    case 0:
                        org.telegram.messenger.zi ziVar2 = MediaController.B().f21348v0;
                        if (ziVar2 != null && z7Var.f40975x2 != null) {
                            z7Var.R0(ziVar2, true, new org.telegram.messenger.hc(22), false);
                            z7Var.U0(true);
                            org.telegram.messenger.k5.o(null, 2131753912, new fc((FrameLayout) z7Var.f28586b, e6Var2), 2131624190, 36);
                            return;
                        }
                        return;
                    default:
                        org.telegram.messenger.zi ziVar3 = MediaController.B().f21348v0;
                        if (ziVar3 != null && z7Var.f40975x2 != null) {
                            z7Var.R0(ziVar3, false, new org.telegram.messenger.hc(22), false);
                            z7Var.U0(false);
                            org.telegram.messenger.k5.o(null, 2131753911, new fc((FrameLayout) z7Var.f28586b, e6Var2), 2131624051, 36);
                            return;
                        }
                        return;
                }
            }
        });
        this.f40970v1.addView(dVar, b8.mf.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        gi.d dVar2 = new gi.d(activity, e6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.e();
        this.f40974x1 = dVar2;
        dVar2.setText(org.telegram.messenger.bd.M0(2131753917, null));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final z7 f33755b;

            {
                this.f33755b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i18 = r3;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                z7 z7Var = this.f33755b;
                switch (i18) {
                    case 0:
                        org.telegram.messenger.zi ziVar2 = MediaController.B().f21348v0;
                        if (ziVar2 != null && z7Var.f40975x2 != null) {
                            z7Var.R0(ziVar2, true, new org.telegram.messenger.hc(22), false);
                            z7Var.U0(true);
                            org.telegram.messenger.k5.o(null, 2131753912, new fc((FrameLayout) z7Var.f28586b, e6Var2), 2131624190, 36);
                            return;
                        }
                        return;
                    default:
                        org.telegram.messenger.zi ziVar3 = MediaController.B().f21348v0;
                        if (ziVar3 != null && z7Var.f40975x2 != null) {
                            z7Var.R0(ziVar3, false, new org.telegram.messenger.hc(22), false);
                            z7Var.U0(false);
                            org.telegram.messenger.k5.o(null, 2131753911, new fc((FrameLayout) z7Var.f28586b, e6Var2), 2131624051, 36);
                            return;
                        }
                        return;
                }
            }
        });
        this.f40970v1.addView(dVar2, b8.mf.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        org.telegram.messenger.bp bpVar = MediaController.B().R0;
        this.f40955n2 = bpVar;
        if (bpVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40952l2 = z10;
        this.k1.f27726n0 = z10;
        this.f40953m2 = O0();
        this.f40957o2 = MediaController.B().S0;
        if (O0()) {
            xVar = q10;
            this.f40941b2 = xVar.a(8, 2131232042);
        } else {
            xVar = q10;
        }
        org.telegram.ui.ActionBar.q0 a10 = xVar.a(0, 2131232486);
        a10.N();
        a10.I = new lg.w1(this, 5);
        this.c2 = a10;
        a10.setContentDescription(org.telegram.messenger.bd.M0(2131745846, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        searchField.setHint(org.telegram.messenger.bd.M0(2131745846, null));
        int i18 = org.telegram.ui.ActionBar.k6.Cj;
        org.telegram.ui.ActionBar.r6.V(searchField, i18, e6Var);
        org.telegram.ui.ActionBar.r6.E(searchField, org.telegram.ui.ActionBar.k6.Gj, e6Var);
        org.telegram.ui.ActionBar.r6.m(searchField, 30, i18, e6Var);
        if (z10) {
            l7Var.r1();
            v0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, e6Var));
            this.k1.setAlpha(1.0f);
            this.f40948j1.setAlpha(0.0f);
            org.telegram.ui.Cells.f2 f2Var = this.J2;
            p7 p7Var2 = this.k1;
            Float valueOf = Float.valueOf(0.0f);
            f2Var.getClass();
            f2Var.a(p7Var2, valueOf);
        }
        if (this.f40957o2.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        y7Var.h = z11;
        if (z11) {
            l7Var.setVisibility(0);
            l7Var.setTranslationY(0.0f);
        } else {
            l7Var.setVisibility(8);
            l7Var.setTranslationY(org.telegram.messenger.g0.f22608q.y);
        }
        y7Var.f();
        this.k1.setTitle(org.telegram.messenger.bd.M0(2131753952, null));
        org.telegram.messenger.bp bpVar2 = this.f40955n2;
        if (bpVar2 != null) {
            if (bpVar2.f21865b == org.telegram.messenger.h10.i(this.f28583a).e()) {
                this.k1.setTitle(org.telegram.messenger.bd.M0(2131746651, null));
            } else {
                this.k1.setTitle(org.telegram.messenger.bd.a0(null, null, 2131746652, org.telegram.messenger.m5.t(this.f40955n2.f21865b)));
            }
        } else if (ziVar != null && MediaController.B().D0 == null) {
            long B0 = org.telegram.messenger.zi.B0(ziVar.f26868k);
            if (org.telegram.messenger.m5.C(B0)) {
                TLRPC.EncryptedChat a12 = org.telegram.messenger.hp.s1(this.f28583a).a1(Integer.valueOf((int) (B0 & 4294967295L)));
                if (a12 != null && (a22 = org.telegram.messenger.hp.s1(this.f28583a).a2(Long.valueOf(a12.user_id))) != null) {
                    this.k1.setTitle(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                }
            } else if (B0 == org.telegram.messenger.h10.i(this.f28583a).e()) {
                if (ziVar.Q1() == 2666000) {
                    this.k1.setTitle(org.telegram.messenger.bd.M0(2131754252, null));
                } else {
                    this.k1.setTitle(org.telegram.messenger.bd.M0(2131745911, null));
                }
            } else if (org.telegram.messenger.m5.E(B0)) {
                TLRPC.User a23 = org.telegram.messenger.hp.s1(this.f28583a).a2(Long.valueOf(B0));
                if (a23 != null) {
                    this.k1.setTitle(org.telegram.messenger.g5.m(0, a23.first_name, a23.last_name));
                }
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.f28583a).M0(Long.valueOf(-B0));
                if (M0 != null) {
                    this.k1.setTitle(M0.title);
                }
            }
        }
        if (O0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            u4.y yVar = new u4.y(new fi.c(this, 3));
            this.f40976y1 = yVar;
            yVar.h(l7Var);
        }
        ViewGroup viewGroup2 = this.f28586b;
        g7 g7Var3 = this.f40970v1;
        int i19 = 52;
        if (!O0() && !this.f40961q2) {
            i3 = 52;
        } else {
            i3 = 0;
        }
        viewGroup2.addView(g7Var3, b8.mf.e(-1, i3 + 179, 83));
        this.f28586b.addView(this.m1, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f40970v1.getLayoutParams();
        if (!O0() && !this.f40961q2) {
            i10 = 52;
        } else {
            i10 = 0;
        }
        layoutParams.height = org.telegram.messenger.g0.L(i10 + 179);
        ((FrameLayout.LayoutParams) this.m1.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(179 + ((O0() || this.f40961q2) ? 0 : 0));
        this.f28586b.addView(this.f40951l1, b8.mf.c(3.0f, -1));
        this.f28586b.addView(this.k1);
        g7 g7Var4 = new g7(this, activity, 1);
        this.Z1 = g7Var4;
        g7Var4.setAlpha(0.0f);
        g7Var4.setVisibility(4);
        this.f28589c.addView(g7Var4);
        k9 k9Var = new k9(activity);
        this.f40940a2 = k9Var;
        k9Var.setAspectFit(true);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(8.0f));
        k9Var.setScaleX(0.9f);
        k9Var.setScaleY(0.9f);
        g7Var4.addView(k9Var, b8.mf.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        f1(false);
        c1();
        if (this.f40956o1 && y7Var.b() == 0) {
            i16 = 0;
        }
        linearLayout.setVisibility(i16);
        Z0();
    }

    public static void I0(z7 z7Var) {
        int bottom;
        boolean z10;
        int translationY;
        Integer num;
        float f10;
        float f11;
        float f12;
        View view = z7Var.f40951l1;
        p7 p7Var = z7Var.k1;
        l7 l7Var = z7Var.f40958p1;
        if (l7Var.getChildCount() <= 0) {
            int paddingTop = l7Var.getPaddingTop();
            z7Var.f40963r2 = paddingTop;
            l7Var.setTopGlowOffset(paddingTop);
            z7Var.f28586b.invalidate();
            return;
        }
        boolean z11 = false;
        View childAt = l7Var.getChildAt(0);
        bj0 bj0Var = (bj0) l7Var.G(childAt);
        if (childAt instanceof org.telegram.ui.Cells.w) {
            bottom = childAt.getTop();
        } else {
            bottom = childAt.getBottom();
        }
        int L = org.telegram.messenger.g0.L(7.0f);
        if (bottom < org.telegram.messenger.g0.L(7.0f) || bj0Var == null || bj0Var.b() != 0) {
            bottom = L;
        }
        if (bottom <= org.telegram.messenger.g0.L(12.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f13 = 1.0f;
        if ((z10 && p7Var.getTag() == null) || (!z10 && p7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            p7Var.setTag(num);
            AnimatorSet animatorSet = z7Var.f40967t2;
            if (animatorSet != null) {
                animatorSet.cancel();
                z7Var.f40967t2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            z7Var.f40967t2 = animatorSet2;
            float f14 = 0.0f;
            if (z7Var.f40952l2) {
                org.telegram.ui.Cells.f2 f2Var = z7Var.J2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p7Var, f2Var, f11);
                View view2 = z7Var.f40948j1;
                Property property = View.ALPHA;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, property, f12);
                if (z10) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property, f14));
            } else {
                Property property2 = View.ALPHA;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(p7Var, property2, f10);
                if (z10) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat3, ObjectAnimator.ofFloat(view, property2, f14));
            }
            z7Var.f40967t2.setDuration(320L);
            z7Var.f40967t2.setInterpolator(xq.h);
            z7Var.f40967t2.addListener(new n7(z7Var, 2));
            z7Var.f40967t2.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) l7Var.getLayoutParams();
        int D = org.telegram.messenger.camera.q.D(11.0f, layoutParams.topMargin - org.telegram.messenger.g0.f22602m, bottom);
        if (z7Var.f40963r2 != D) {
            z7Var.f40963r2 = D;
            l7Var.setTopGlowOffset((D - layoutParams.topMargin) - org.telegram.messenger.g0.f22602m);
            z7Var.f28586b.invalidate();
        }
        int L2 = org.telegram.messenger.g0.L(13.0f);
        if (z7Var.f28617t0 + ((int) (l7Var.getTranslationY() + ((z7Var.f40963r2 - z7Var.f28617t0) - L2))) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f13 = 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - z7Var.f28617t0) / (org.telegram.messenger.g0.L(4.0f) + L2));
        }
        z7Var.E2 = f13;
        if (f13 <= 0.5f && i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, z7Var.J0)) > 0.699999988079071d) {
            z11 = true;
        }
        if (z11 != z7Var.D2) {
            z7Var.D2 = z11;
            org.telegram.messenger.g0.q3(z7Var, z11);
        }
    }

    public static boolean L0(float f10, float f11) {
        if (Math.abs(f10 - f11) < 0.05f) {
            return true;
        }
        return false;
    }

    public static org.telegram.messenger.ac N0(org.telegram.messenger.zi ziVar) {
        TLRPC.PhotoSize photoSize;
        TLRPC.Document F0 = ziVar.F0();
        if (F0 != null) {
            photoSize = org.telegram.messenger.w7.w(F0.thumbs, 360, false, null, false);
        } else {
            photoSize = null;
        }
        if (!(photoSize instanceof TLRPC.TL_photoSize) && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            photoSize = null;
        }
        if (photoSize != null) {
            return org.telegram.messenger.ac.c(photoSize, F0);
        }
        String u02 = ziVar.u0(true);
        if (u02 == null) {
            return null;
        }
        return org.telegram.messenger.ac.g(u02);
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ij));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27995jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27979id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.We));
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final f60 J0(f60 f60Var, org.telegram.messenger.zi ziVar) {
        long j10;
        org.telegram.messenger.ap H1 = org.telegram.messenger.hp.s1(this.f28583a).H1();
        TLRPC.Document F0 = ziVar.F0();
        if (F0 != null) {
            j10 = F0.f27007id;
        } else {
            j10 = 0;
        }
        f60 J = f60Var.J();
        J.c(2131231240, org.telegram.messenger.bd.M0(2131753756, null), new org.telegram.ui.xp0(f60Var, 27), false);
        J.k();
        J.l(2131231621, org.telegram.messenger.bd.M0(2131753913, null), new x6(this, ziVar, f60Var, 6), !H1.f21571b.contains(Long.valueOf(j10)));
        J.c(2131232351, org.telegram.messenger.bd.M0(2131753910, null), new x6(this, ziVar, f60Var, 7), false);
        J.c(2131231789, org.telegram.messenger.bd.M0(2131753914, null), new x6(this, ziVar, f60Var, 8), false);
        J.k();
        J.p(12, org.telegram.messenger.g0.L(200.0f), org.telegram.messenger.bd.M0(2131753915, null));
        return J;
    }

    public final void K0() {
        org.telegram.ui.ActionBar.q0 q0Var = this.S1;
        int w02 = org.telegram.ui.ActionBar.k6.w0(((Integer) q0Var.getTag()).intValue(), this.J0);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kj, this.J0);
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, this.J0);
        if (!this.M2 || w02 != this.N2) {
            this.N2 = w02;
            q0Var.setIconColor(w02);
        }
        boolean z10 = this.M2;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.E1;
        if (!z10 || w03 != this.O2) {
            this.O2 = w03;
            q0Var2.setIconColor(w03);
        }
        if (!this.M2 || w04 != this.P2) {
            this.P2 = w04;
            org.telegram.ui.ActionBar.k6.H1(q0Var.getBackground(), w04, true);
            org.telegram.ui.ActionBar.k6.H1(q0Var2.getBackground(), w04, true);
        }
        this.M2 = true;
        this.J1.setProgressColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Jj, this.J0));
        d1();
        int i3 = org.telegram.ui.ActionBar.k6.G8;
        q0Var.H(org.telegram.ui.ActionBar.k6.w0(i3, this.J0));
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        q0Var2.O(org.telegram.ui.ActionBar.k6.w0(i10, this.J0), false);
        q0Var2.O(org.telegram.ui.ActionBar.k6.w0(i10, this.J0), true);
        q0Var2.H(org.telegram.ui.ActionBar.k6.w0(i3, this.J0));
    }

    public final void M0(org.telegram.messenger.zi ziVar) {
        ArrayList k10;
        TLRPC.TL_document tL_document;
        int i3 = org.telegram.messenger.h10.f22829t0;
        int i10 = this.f28583a;
        LaunchActivity launchActivity = this.f40975x2;
        if (i3 != i10) {
            launchActivity.O0(i10);
        }
        Bundle l10 = org.telegram.ui.Cells.f1.l(3, "onlySelect", "dialogsType", true);
        l10.putBoolean("canSelectTopics", true);
        org.telegram.ui.uw uwVar = new org.telegram.ui.uw(l10);
        if (ziVar.f1() < 0) {
            if (!(ziVar.F0() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) ziVar.F0();
            k10 = null;
        } else {
            k10 = org.telegram.messenger.k5.k(ziVar);
            tL_document = null;
        }
        uwVar.D2 = new a1.d(this, k10, tL_document, ziVar, 8);
        launchActivity.t0(uwVar);
        dismiss();
    }

    public final boolean O0() {
        org.telegram.messenger.bp bpVar = this.f40955n2;
        if (bpVar != null && bpVar.f21865b == org.telegram.messenger.h10.i(this.f28583a).e()) {
            return true;
        }
        return false;
    }

    public final void P0(int i3) {
        LaunchActivity launchActivity;
        org.telegram.messenger.zi ziVar = MediaController.B().f21348v0;
        if (ziVar != null && (launchActivity = this.f40975x2) != null) {
            if (i3 == 1) {
                M0(ziVar);
            } else if (i3 == 2) {
                V0(ziVar);
            } else if (i3 == 4) {
                int i10 = org.telegram.messenger.h10.f22829t0;
                int i11 = this.f28583a;
                if (i10 != i11) {
                    launchActivity.O0(i11);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.zi.B0(ziVar.f26868k);
                if (org.telegram.messenger.m5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.m5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.f28583a).M0(Long.valueOf(-B0));
                    if (M0 != null && M0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -M0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", ziVar.f1());
                org.telegram.messenger.hs.f(this.f28583a).k(org.telegram.messenger.hs.f23305t, new Object[0]);
                launchActivity.u0(new org.telegram.ui.wm(bundle), false, false);
                dismiss();
            } else if (i3 == 5) {
                Q0(ziVar);
            } else if (i3 == 6) {
                tf.b.t().z(MediaController.B().z());
                this.H1.performClick();
            } else if (i3 == 7) {
                R0(ziVar, false, new u6(this, ziVar, 0), false);
            } else if (i3 == 8) {
                gi.x6 x6Var = new gi.x6(getContext(), true, null, new w6(this, 0), null);
                x6Var.f13844a2 = true;
                x6Var.S1 = false;
                x6Var.f13851i2.O(true);
                x6Var.show();
            }
        }
    }

    public final void Q0(org.telegram.messenger.zi ziVar) {
        String str;
        if (Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.f25041b) {
            LaunchActivity launchActivity = this.f40975x2;
            if (launchActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                launchActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        String B = org.telegram.messenger.w7.B(ziVar.F0());
        if (TextUtils.isEmpty(B)) {
            B = ziVar.S0();
        }
        String str2 = B;
        String str3 = ziVar.f26868k.attachPath;
        if (str3 != null && str3.length() > 0 && !t4.c.p(str3)) {
            str3 = null;
        }
        if (str3 == null || str3.length() == 0) {
            org.telegram.messenger.w7.G(this.f28583a);
            str3 = org.telegram.messenger.w7.N(ziVar.f26868k, false, true).toString();
        }
        String str4 = str3;
        if (ziVar.F0() != null) {
            str = ziVar.F0().mime_type;
        } else {
            str = "";
        }
        String str5 = str;
        MediaController.d0(str4, this.f40975x2, 3, str2, str5, new w6(this, 1));
    }

    @Override
    public final int R() {
        g7 g7Var = this.f40970v1;
        if (g7Var == null) {
            return 0;
        }
        if (this.f40957o2.size() <= 1) {
            return g7Var.getMeasuredHeight() + this.f28617t0;
        }
        int L = org.telegram.messenger.g0.L(13.0f);
        int translationY = (int) (this.f40958p1.getTranslationY() + ((this.f40963r2 - this.f28617t0) - L));
        if (this.f28617t0 + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float L2 = org.telegram.messenger.g0.L(4.0f) + L;
            translationY -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - this.f28617t0) / L2));
        }
        return this.f28589c.getMeasuredHeight() - (translationY + org.telegram.messenger.g0.f22602m);
    }

    public final void R0(org.telegram.messenger.zi ziVar, boolean z10, Runnable runnable, boolean z11) {
        TLRPC.Document F0 = ziVar.F0();
        if (F0 == null) {
            return;
        }
        long j10 = F0.f27007id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z10;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.f27029id = tL_inputDocument;
        tL_inputDocument.f27013id = j10;
        tL_inputDocument.access_hash = F0.access_hash;
        byte[] bArr = F0.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.f28583a).sendRequest(tL_account_saveMusic, new z6(this, z11, ziVar, z10, runnable, j10, F0));
    }

    public final boolean S0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z7.S0(boolean):boolean");
    }

    public final void T0(org.telegram.ui.ActionBar.y0 y0Var, boolean z10) {
        if (z10) {
            int i3 = org.telegram.ui.ActionBar.k6.Lj;
            y0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, this.J0));
            y0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(i3, this.J0));
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        y0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, this.J0));
        y0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(i10, this.J0));
    }

    @Override
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        q6 q6Var = new q6(this, 0);
        int i3 = org.telegram.ui.ActionBar.k6.Cj;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.k1, 1024, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        int i10 = org.telegram.ui.ActionBar.k6.Gj;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.k1, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f28586b, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f28616s0}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27954h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.J1, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Jj));
        int i11 = org.telegram.ui.ActionBar.k6.f28235w7;
        org.telegram.ui.ActionBar.q0 q0Var = this.M1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28255x7));
        int i12 = org.telegram.ui.ActionBar.k6.Kj;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.S1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.k6.Lj));
        int i13 = org.telegram.ui.ActionBar.k6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i13));
        int i14 = org.telegram.ui.ActionBar.k6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i14));
        org.telegram.ui.ActionBar.q0 q0Var3 = this.E1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i14));
        i7 i7Var = this.B1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(i7Var, new ch0[]{i7Var.getAnimatedDrawable()}, "Triangle 3", i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(i7Var, new ch0[]{i7Var.getAnimatedDrawable()}, "Triangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(i7Var, new ch0[]{i7Var.getAnimatedDrawable()}, "Rectangle 4", i12));
        int i15 = org.telegram.ui.ActionBar.k6.f27972i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.B1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.X1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
        j7 j7Var = this.C1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(j7Var, new ch0[]{j7Var.getAnimatedDrawable()}, "Triangle 3", i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(j7Var, new ch0[]{j7Var.getAnimatedDrawable()}, "Triangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(j7Var, new ch0[]{j7Var.getAnimatedDrawable()}, "Rectangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.C1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
        int i16 = org.telegram.ui.ActionBar.k6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40966t1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40968u1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.J1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27862c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.J1, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27955h6));
        r7 r7Var = this.A1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(r7Var.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(r7Var.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        r7 r7Var2 = this.D1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(r7Var2.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(r7Var2.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f28586b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.wj));
        return arrayList;
    }

    public final void U0(final boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        boolean O0 = O0();
        gi.d dVar = this.f40974x1;
        gi.d dVar2 = this.f40972w1;
        if (!O0 && !this.f40961q2) {
            dVar2.setVisibility(0);
            dVar.setVisibility(0);
            ViewPropertyAnimator animate = dVar2.animate();
            float f14 = 0.0f;
            float f15 = 1.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z10) {
                f11 = 0.8f;
            } else {
                f11 = 1.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (z10) {
                f12 = 0.8f;
            } else {
                f12 = 1.0f;
            }
            ViewPropertyAnimator duration = scaleX.scaleY(f12).setDuration(420L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).withEndAction(new Runnable(this) {
                public final z7 f39015b;

                {
                    this.f39015b = this;
                }

                @Override
                public final void run() {
                    int i3;
                    int i10;
                    switch (r3) {
                        case 0:
                            gi.d dVar3 = this.f39015b.f40972w1;
                            if (z10) {
                                i3 = 8;
                            } else {
                                i3 = 0;
                            }
                            dVar3.setVisibility(i3);
                            return;
                        default:
                            gi.d dVar4 = this.f39015b.f40974x1;
                            if (z10) {
                                i10 = 0;
                            } else {
                                i10 = 8;
                            }
                            dVar4.setVisibility(i10);
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = dVar.animate();
            if (z10) {
                f14 = 1.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f14);
            if (!z10) {
                f13 = 0.8f;
            } else {
                f13 = 1.0f;
            }
            ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
            if (!z10) {
                f15 = 0.8f;
            }
            scaleX2.scaleY(f15).setDuration(420L).setInterpolator(xqVar).withEndAction(new Runnable(this) {
                public final z7 f39015b;

                {
                    this.f39015b = this;
                }

                @Override
                public final void run() {
                    int i3;
                    int i10;
                    switch (r3) {
                        case 0:
                            gi.d dVar3 = this.f39015b.f40972w1;
                            if (z10) {
                                i3 = 8;
                            } else {
                                i3 = 0;
                            }
                            dVar3.setVisibility(i3);
                            return;
                        default:
                            gi.d dVar4 = this.f39015b.f40974x1;
                            if (z10) {
                                i10 = 0;
                            } else {
                                i10 = 8;
                            }
                            dVar4.setVisibility(i10);
                            return;
                    }
                }
            }).start();
            return;
        }
        dVar2.setVisibility(8);
        dVar.setVisibility(8);
    }

    public final void V0(org.telegram.messenger.zi r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z7.V0(org.telegram.messenger.zi):void");
    }

    public final void W0(boolean z10, boolean z11) {
        k9 k9Var = this.f40940a2;
        g7 g7Var = this.Z1;
        if (z10) {
            if (g7Var.getVisibility() != 0 && !this.f40942d2) {
                g7Var.setTag(1);
                q7 q7Var = this.f40978z1;
                k9Var.setImageBitmap(q7Var.f37365a[q7Var.f37366b].getImageReceiver().n());
                this.f40942d2 = true;
                nk0.d(new s6(this, 1));
                g7Var.setVisibility(0);
                g7Var.animate().alpha(1.0f).setDuration(180L).setListener(new n7(this, 0)).start();
                k9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            }
        } else if (g7Var.getVisibility() != 0) {
        } else {
            g7Var.setTag(null);
            if (z11) {
                this.f40942d2 = true;
                g7Var.animate().alpha(0.0f).setDuration(180L).setListener(new n7(this, 1)).start();
                k9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
                return;
            }
            g7Var.setAlpha(0.0f);
            g7Var.setVisibility(4);
            k9Var.setImageBitmap(null);
            k9Var.setScaleX(0.9f);
            k9Var.setScaleY(0.9f);
        }
    }

    @Override
    public final boolean X(float f10, float f11) {
        int i3;
        FrameLayout frameLayout = this.F;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.F.getChildAt(0);
            if (f11 >= childAt.getY() + this.F.getY()) {
                if (f11 <= childAt.getY() + this.F.getY() + childAt.getHeight()) {
                    if (f10 >= childAt.getX() + this.F.getX()) {
                        if (f10 <= childAt.getX() + this.F.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        int top = this.f28586b.getTop();
        Drawable drawable = this.f28616s0;
        if (drawable != null) {
            i3 = drawable.getBounds().top;
        } else {
            i3 = 0;
        }
        if (f11 >= top + i3 && f10 >= this.f28586b.getLeft() && f10 <= this.f28586b.getRight()) {
            return false;
        }
        return true;
    }

    public final void X0(org.telegram.ui.Cells.w wVar, org.telegram.messenger.zi ziVar) {
        f60 G = f60.G(this.f28589c, this.J0, wVar, true);
        int i3 = 3;
        boolean z10 = false;
        if (O0()) {
            G.l(2131232165, org.telegram.messenger.bd.M0(2131750588, null), new x6(this, G, ziVar, 0), !this.f40961q2);
            G.l(2131232365, org.telegram.messenger.bd.M0(2131745469, null), new x6(this, G, ziVar, 1), !this.f40961q2);
            G.c(2131232108, org.telegram.messenger.bd.M0(2131751599, null), new x6(this, ziVar, G, 2), true);
        } else {
            G.l(2131232390, org.telegram.messenger.bd.M0(2131753916, null), new ai.y3(G, J0(G, ziVar), 7), !this.f40961q2);
            if (!this.f40961q2 && G.y() != null) {
                G.y().setRightIcon(2131232059);
            }
            G.k();
            G.l(2131232165, org.telegram.messenger.bd.M0(2131750588, null), new x6(this, G, ziVar, 3), !this.f40961q2);
            G.l(2131232363, org.telegram.messenger.bd.M0(2131745469, null), new x6(this, G, ziVar, 4), !this.f40961q2);
            if (ziVar.f1() > 0) {
                z10 = true;
            }
            G.l(2131232420, org.telegram.messenger.bd.M0(2131745352, null), new u6(this, ziVar, 1), z10);
        }
        if (!org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        }
        G.V(i3);
        G.Z();
    }

    public final void Y0() {
        if (this.f40977y2 == 1) {
            this.B2 = System.currentTimeMillis();
            this.f40979z2 = MediaController.B().f21348v0.f26828b0;
            mi.b0 b0Var = this.F2;
            org.telegram.messenger.g0.r(b0Var);
            org.telegram.messenger.g0.h3(b0Var);
        }
    }

    public final void Z0() {
        int i3;
        LinearLayout linearLayout = this.f40964s1;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        if (this.f40970v1.getVisibility() == 0) {
            i3 = org.telegram.messenger.g0.L(150.0f);
        } else {
            i3 = -org.telegram.messenger.g0.L(30.0f);
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.f28586b.getMeasuredHeight()) - i3) / 2);
    }

    public final void a1(boolean z10) {
        if (this.M1 != null) {
            float f10 = MediaController.B().f21339r0;
            this.N1.b(z10, f10);
            this.O1.e(z10, f10);
            updateColors();
            boolean z11 = this.P1;
            int i3 = 0;
            this.P1 = false;
            while (true) {
                org.telegram.ui.ActionBar.y0[] y0VarArr = this.Q1;
                if (i3 < y0VarArr.length) {
                    if (!z11 && L0(f10, R2[i3])) {
                        org.telegram.ui.ActionBar.y0 y0Var = y0VarArr[i3];
                        int i10 = org.telegram.ui.ActionBar.k6.Ei;
                        y0Var.d(org.telegram.ui.ActionBar.k6.w0(i10, this.J0), org.telegram.ui.ActionBar.k6.w0(i10, this.J0));
                    } else {
                        org.telegram.ui.ActionBar.y0 y0Var2 = y0VarArr[i3];
                        int i11 = org.telegram.ui.ActionBar.k6.E8;
                        y0Var2.d(org.telegram.ui.ActionBar.k6.w0(i11, this.J0), org.telegram.ui.ActionBar.k6.w0(i11, this.J0));
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b1(org.telegram.messenger.zi r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z7.b1(org.telegram.messenger.zi, boolean):void");
    }

    public final void c1() {
        int i3 = org.telegram.messenger.az.S0;
        org.telegram.ui.ActionBar.q0 q0Var = this.S1;
        if (i3 != 0 && i3 != 1) {
            if (i3 == 2) {
                q0Var.setIcon(2131232554);
                int i10 = org.telegram.ui.ActionBar.k6.Lj;
                q0Var.setTag(Integer.valueOf(i10));
                q0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(i10, this.J0));
                org.telegram.ui.ActionBar.k6.H1(q0Var.getBackground(), org.telegram.ui.ActionBar.k6.w0(i10, this.J0) & 436207615, true);
                q0Var.setContentDescription(org.telegram.messenger.bd.M0(2131754785, null));
                return;
            }
            return;
        }
        if (org.telegram.messenger.az.N0) {
            if (i3 == 0) {
                q0Var.setIcon(2131232555);
            } else {
                q0Var.setIcon(2131232552);
            }
        } else if (org.telegram.messenger.az.O0) {
            if (i3 == 0) {
                q0Var.setIcon(2131232549);
            } else {
                q0Var.setIcon(2131232551);
            }
        } else {
            q0Var.setIcon(2131232553);
        }
        if (i3 == 0 && !org.telegram.messenger.az.N0 && !org.telegram.messenger.az.O0) {
            int i11 = org.telegram.ui.ActionBar.k6.Kj;
            q0Var.setTag(Integer.valueOf(i11));
            q0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(i11, this.J0));
            org.telegram.ui.ActionBar.k6.H1(q0Var.getBackground(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, this.J0), true);
            q0Var.setContentDescription(org.telegram.messenger.bd.M0(2131754786, null));
            return;
        }
        int i12 = org.telegram.ui.ActionBar.k6.Lj;
        q0Var.setTag(Integer.valueOf(i12));
        q0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(i12, this.J0));
        org.telegram.ui.ActionBar.k6.H1(q0Var.getBackground(), 436207615 & org.telegram.ui.ActionBar.k6.w0(i12, this.J0), true);
        if (i3 == 0) {
            if (org.telegram.messenger.az.N0) {
                q0Var.setContentDescription(org.telegram.messenger.bd.M0(2131745332, null));
                return;
            } else {
                q0Var.setContentDescription(org.telegram.messenger.bd.M0(2131746037, null));
                return;
            }
        }
        q0Var.setContentDescription(org.telegram.messenger.bd.M0(2131754787, null));
    }

    public final void d1() {
        boolean z10;
        T0(this.V1, org.telegram.messenger.az.N0);
        T0(this.W1, org.telegram.messenger.az.O0);
        boolean z11 = false;
        if (org.telegram.messenger.az.S0 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        T0(this.U1, z10);
        if (org.telegram.messenger.az.S0 == 2) {
            z11 = true;
        }
        T0(this.T1, z11);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        boolean z10;
        org.telegram.ui.Cells.w wVar;
        org.telegram.messenger.zi messageObject;
        org.telegram.ui.Cells.w wVar2;
        org.telegram.messenger.zi messageObject2;
        org.telegram.messenger.zi ziVar;
        int i11 = org.telegram.messenger.hs.f23239h2;
        int i12 = org.telegram.messenger.hs.f23227f2;
        int i13 = org.telegram.messenger.hs.f23233g2;
        l7 l7Var = this.f40958p1;
        int i14 = 0;
        if (i3 != i11 && i3 != i13 && i3 != i12) {
            if (i3 == org.telegram.messenger.hs.f23221e2) {
                org.telegram.messenger.zi ziVar2 = MediaController.B().f21348v0;
                if (ziVar2 != null && ziVar2.J3()) {
                    b1(ziVar2, false);
                    return;
                }
                return;
            } else if (i3 == org.telegram.messenger.hs.J4) {
                a1(true);
                return;
            } else {
                int i15 = org.telegram.messenger.hs.K0;
                y7 y7Var = this.f40962r1;
                if (i3 == i15) {
                    this.f40955n2 = MediaController.B().R0;
                    this.f40957o2 = MediaController.B().S0;
                    y7Var.f();
                    return;
                } else if (i3 == org.telegram.messenger.hs.L0) {
                    this.f40955n2 = MediaController.B().R0;
                    this.f40957o2 = MediaController.B().S0;
                    y7Var.f();
                    if (org.telegram.messenger.az.O0) {
                        l7Var.C0();
                        int intValue = ((Integer) objArr[0]).intValue();
                        u4.b0 b0Var = this.f40960q1;
                        b0Var.L0();
                        int N0 = b0Var.N0();
                        if (N0 != -1) {
                            View m10 = b0Var.m(N0);
                            if (m10 != null) {
                                i14 = m10.getTop();
                            }
                            b0Var.h1(N0 + intValue, i14);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i3 == org.telegram.messenger.hs.Y1) {
                    if (((String) objArr[0]).equals(this.f40965s2)) {
                        f1(false);
                        this.f40946h2 = true;
                        return;
                    }
                    return;
                } else if (i3 == org.telegram.messenger.hs.X1) {
                    if (((String) objArr[0]).equals(this.f40965s2) && (ziVar = MediaController.B().f21348v0) != null) {
                        Long l10 = (Long) objArr[1];
                        Long l11 = (Long) objArr[2];
                        float f10 = 1.0f;
                        if (!this.f40946h2) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f40945g2) >= 500) {
                                if (MediaController.B().m0) {
                                    f10 = org.telegram.messenger.w7.G(this.f28583a).t(this.f40965s2, ziVar.f26828b0);
                                }
                                this.f40945g2 = elapsedRealtime;
                            } else {
                                f10 = -1.0f;
                            }
                        }
                        if (f10 != -1.0f) {
                            q1.g gVar = this.f40944f2;
                            gVar.f53653m.f53661i = f10 * 1000.0f;
                            gVar.h();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i3 == org.telegram.messenger.hs.U3) {
                    f1(false);
                    return;
                } else {
                    return;
                }
            }
        }
        if (i3 == i12 && ((Boolean) objArr[1]).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        f1(z10);
        if (i3 != i12 && i3 != i13) {
            if (((org.telegram.messenger.zi) objArr[0]).T == 0) {
                int childCount = l7Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = l7Var.getChildAt(i16);
                    if ((childAt instanceof org.telegram.ui.Cells.w) && (messageObject2 = (wVar2 = (org.telegram.ui.Cells.w) childAt).getMessageObject()) != null && (org.telegram.messenger.zi.S4(messageObject2.f26868k) || messageObject2.J3())) {
                        wVar2.b(false, true);
                    }
                }
            } else {
                return;
            }
        } else {
            int childCount2 = l7Var.getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = l7Var.getChildAt(i17);
                if ((childAt2 instanceof org.telegram.ui.Cells.w) && (messageObject = (wVar = (org.telegram.ui.Cells.w) childAt2).getMessageObject()) != null && (org.telegram.messenger.zi.S4(messageObject.f26868k) || messageObject.J3())) {
                    wVar.b(false, true);
                }
            }
            if (i3 == i13 && MediaController.B().f21348v0 != null) {
                if (MediaController.B().H()) {
                    Y0();
                } else if (this.f40977y2 == 1 && this.f40979z2 != -1.0f) {
                    mi.b0 b0Var2 = this.F2;
                    org.telegram.messenger.g0.r(b0Var2);
                    this.C2 = 0L;
                    b0Var2.run();
                    this.f40979z2 = -1.0f;
                }
            }
        }
        org.telegram.ui.tq tqVar = this.F1;
        if (tqVar != null) {
            tqVar.a(d1.f.u());
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.hs.f(this.f28583a).n(this, org.telegram.messenger.hs.f23227f2);
        org.telegram.messenger.hs.f(this.f28583a).n(this, org.telegram.messenger.hs.f23233g2);
        org.telegram.messenger.hs.f(this.f28583a).n(this, org.telegram.messenger.hs.f23239h2);
        org.telegram.messenger.hs.f(this.f28583a).n(this, org.telegram.messenger.hs.f23221e2);
        org.telegram.messenger.hs.f(this.f28583a).n(this, org.telegram.messenger.hs.Y1);
        org.telegram.messenger.hs.f(this.f28583a).n(this, org.telegram.messenger.hs.X1);
        org.telegram.messenger.hs.f(this.f28583a).n(this, org.telegram.messenger.hs.K0);
        org.telegram.messenger.hs.f(this.f28583a).n(this, org.telegram.messenger.hs.L0);
        org.telegram.messenger.hs.f(this.f28583a).n(this, org.telegram.messenger.hs.U3);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.J4);
        org.telegram.messenger.z5.q(this.f28583a).v(this);
        if (Q2 == this) {
            Q2 = null;
        }
    }

    public final void e1() {
        int i3;
        int w02;
        int i10;
        int i11;
        if (this.f40952l2) {
            i3 = org.telegram.ui.ActionBar.k6.f27824a7;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.f27954h5;
        }
        int w03 = org.telegram.ui.ActionBar.k6.w0(i3, this.J0);
        if (w03 != this.L2) {
            this.L2 = w03;
            v0(w03);
        }
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kj, this.J0);
        i7 i7Var = this.B1;
        if (i7Var != null) {
            i7Var.h(w04, "Triangle 3");
            i7Var.h(w04, "Triangle 4");
            i7Var.h(w04, "Rectangle 4");
        }
        j7 j7Var = this.C1;
        if (j7Var != null) {
            j7Var.h(w04, "Triangle 3");
            j7Var.h(w04, "Triangle 4");
            j7Var.h(w04, "Rectangle 4");
        }
        s7 s7Var = this.K1;
        if (s7Var != null) {
            s7Var.setOuterColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Jj, this.J0));
        }
        boolean z10 = false;
        org.telegram.ui.ActionBar.q0 q0Var = this.M1;
        if (q0Var != null) {
            float f10 = MediaController.B().f21339r0;
            if (!L0(f10, 1.0f)) {
                i10 = org.telegram.ui.ActionBar.k6.Ei;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f28255x7;
            }
            int w05 = org.telegram.ui.ActionBar.k6.w0(i10, this.J0);
            cu0 cu0Var = this.N1;
            if (cu0Var != null) {
                cu0Var.f32835a.u(w05);
                Paint paint = cu0Var.f32836b;
                if (paint != null) {
                    paint.setColor(w05);
                }
            }
            org.telegram.ui.ActionBar.k6.H1(q0Var.getBackground(), w05 & 436207615, true);
            int i12 = 0;
            while (true) {
                org.telegram.ui.ActionBar.y0[] y0VarArr = this.Q1;
                if (i12 >= y0VarArr.length) {
                    break;
                }
                if (y0VarArr[i12] != null) {
                    if (L0(f10, R2[i12])) {
                        i11 = org.telegram.ui.ActionBar.k6.Ei;
                    } else {
                        i11 = org.telegram.ui.ActionBar.k6.E8;
                    }
                    int w06 = org.telegram.ui.ActionBar.k6.w0(i11, this.J0);
                    y0VarArr[i12].d(w06, w06);
                }
                i12++;
            }
        }
        org.telegram.ui.ActionBar.y0 y0Var = this.G1;
        if (y0Var != null) {
            k7 k7Var = this.H1;
            if (k7Var != null && k7Var.b()) {
                z10 = true;
            }
            int w07 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.J0);
            int w08 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.J0);
            int i13 = org.telegram.ui.ActionBar.k6.Ci;
            y0Var.e(w07, w08, org.telegram.ui.ActionBar.k6.w0(i13, this.J0), z10);
            org.telegram.ui.ActionBar.y0 y0Var2 = this.G1;
            if (k7Var != null && k7Var.b()) {
                w02 = org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i13, this.J0));
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, this.J0);
            }
            y0Var2.setSelectorColor(w02);
        }
    }

    public final void f1(boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z7.f1(boolean):void");
    }

    @Override
    public final int getObserverTag() {
        return this.f40973w2;
    }

    @Override
    public final void i(long j10, long j11) {
        this.J1.a(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
    }

    @Override
    public final boolean k0(View view, int i3, int i10, int i11, int i12) {
        g7 g7Var = this.Z1;
        if (view != g7Var) {
            return false;
        }
        g7Var.layout(0, 0, g7Var.getMeasuredWidth(), g7Var.getMeasuredHeight());
        return true;
    }

    @Override
    public final boolean l0(View view, int i3, int i10) {
        g7 g7Var = this.Z1;
        if (view == g7Var) {
            org.telegram.ui.ActionBar.j2 j2Var = this.f28589c;
            g7Var.measure(View.MeasureSpec.makeMeasureSpec(j2Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(j2Var.getMeasuredHeight(), 1073741824));
            return true;
        }
        return false;
    }

    @Override
    public final void onBackPressed() {
        p7 p7Var = this.k1;
        if (p7Var != null && p7Var.f27728o0) {
            p7Var.l(true);
        } else if (this.Z1.getTag() != null) {
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
            if (this.c2 != null && this.S1 != null && this.E1 != null && this.J1 != null) {
                K0();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            e1();
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        try {
            float f10 = this.E2;
            if (f10 >= 0.0f) {
                if (f10 <= 0.5f && i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.J0)) > 0.699999988079071d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != this.D2) {
                    this.D2 = z10;
                    org.telegram.messenger.g0.q3(this, z10);
                }
            }
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        Q2 = this;
    }

    public final void updateColors() {
        int w02;
        int i3;
        boolean z10 = true;
        org.telegram.ui.ActionBar.q0 q0Var = this.M1;
        if (q0Var != null) {
            if (!L0(MediaController.B().f21339r0, 1.0f)) {
                i3 = org.telegram.ui.ActionBar.k6.Ei;
            } else {
                i3 = org.telegram.ui.ActionBar.k6.f28255x7;
            }
            int w03 = org.telegram.ui.ActionBar.k6.w0(i3, this.J0);
            cu0 cu0Var = this.N1;
            if (cu0Var != null) {
                cu0Var.f32835a.u(w03);
                Paint paint = cu0Var.f32836b;
                if (paint != null) {
                    paint.setColor(w03);
                }
            }
            q0Var.setBackground(org.telegram.ui.ActionBar.k6.h0(w03 & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        }
        org.telegram.ui.ActionBar.y0 y0Var = this.G1;
        if (y0Var != null) {
            k7 k7Var = this.H1;
            z10 = (k7Var == null || !k7Var.b()) ? false : false;
            int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.J0);
            int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.J0);
            int i10 = org.telegram.ui.ActionBar.k6.Ci;
            y0Var.e(w04, w05, org.telegram.ui.ActionBar.k6.w0(i10, this.J0), z10);
            org.telegram.ui.ActionBar.y0 y0Var2 = this.G1;
            if (k7Var != null && k7Var.b()) {
                w02 = org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i10, this.J0));
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, this.J0);
            }
            y0Var2.setSelectorColor(w02);
        }
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void M(String str) {
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
