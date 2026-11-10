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
public final class a8 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.ls, org.telegram.messenger.x5 {
    public static a8 S2;
    public static final float[] T2 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final v4.y A1;
    public int A2;
    public final r7 B1;
    public float B2;
    public final s7 C1;
    public int C2;
    public final j7 D1;
    public long D2;
    public final k7 E1;
    public long E2;
    public final s7 F1;
    public boolean F2;
    public final org.telegram.ui.ActionBar.r0 G1;
    public float G2;
    public final org.telegram.ui.xq H1;
    public final m.f3 H2;
    public org.telegram.ui.ActionBar.z0 I1;
    public n7 I2;
    public final l7 J1;
    public long J2;
    public final boolean K1;
    public float K2;
    public final h70 L1;
    public final org.telegram.ui.Cells.f2 L2;
    public final t7 M1;
    public ValueAnimator M2;
    public final org.telegram.ui.ActionBar.m5 N1;
    public int N2;
    public final org.telegram.ui.ActionBar.r0 O1;
    public boolean O2;
    public final eu0 P1;
    public int P2;
    public final org.telegram.ui.ActionBar.v0 Q1;
    public int Q2;
    public boolean R1;
    public int R2;
    public final org.telegram.ui.ActionBar.z0[] S1;
    public final TextView T1;
    public final org.telegram.ui.ActionBar.r0 U1;
    public final org.telegram.ui.ActionBar.z0 V1;
    public final org.telegram.ui.ActionBar.z0 W1;
    public final org.telegram.ui.ActionBar.z0 X1;
    public final org.telegram.ui.ActionBar.z0 Y1;
    public final ImageView Z1;
    public final he0 f31734a2;
    public final h7 f31735b2;
    public final k9 f31736c2;
    public final org.telegram.ui.ActionBar.r0 d2;
    public final org.telegram.ui.ActionBar.r0 f31737e2;
    public boolean f31738f2;
    public final View[] f31739g2;
    public final r1.g f31740h2;
    public long f31741i2;
    public boolean f31742j2;
    public boolean f31743k2;
    public final View l1;
    public int f31744l2;
    public final q7 f31745m1;
    public int f31746m2;
    public final View n1;
    public final boolean f31747n2;
    public final View f31748o1;
    public final boolean f31749o2;
    public boolean f31750p1;
    public org.telegram.messenger.kp f31751p2;
    public boolean f31752q1;
    public ArrayList f31753q2;
    public final m7 f31754r1;
    public org.telegram.messenger.ij f31755r2;
    public final v4.b0 f31756s1;
    public boolean f31757s2;
    public final z7 f31758t1;
    public int f31759t2;
    public final LinearLayout f31760u1;
    public String f31761u2;
    public final TextView f31762v1;
    public AnimatorSet f31763v2;
    public final TextView f31764w1;
    public int f31765w2;
    public final h7 f31766x1;
    public int f31767x2;
    public final fi.d f31768y1;
    public final int f31769y2;
    public final fi.d f31770z1;
    public final LaunchActivity f31771z2;

    public a8(Activity activity, final org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, (Context) activity, h6Var, true);
        boolean z9;
        org.telegram.ui.ActionBar.y yVar;
        boolean z10;
        TLRPC.User a22;
        int i7;
        int i10;
        org.telegram.ui.ActionBar.z0[] z0VarArr = new org.telegram.ui.ActionBar.z0[6];
        this.S1 = z0VarArr;
        View[] viewArr = new View[5];
        this.f31739g2 = viewArr;
        this.f31743k2 = true;
        this.f31744l2 = -1;
        this.f31759t2 = Integer.MAX_VALUE;
        this.B2 = -1.0f;
        this.G2 = -1.0f;
        this.H2 = new m.f3(this, 25);
        this.L2 = new org.telegram.ui.Cells.f2(this);
        this.f28701r = true;
        N();
        org.telegram.messenger.ij ijVar = MediaController.B().f21300u0;
        if (ijVar != null) {
            this.f28669a = ijVar.I1;
        } else {
            this.f28669a = org.telegram.messenger.p10.f24474s0;
        }
        this.f31771z2 = (LaunchActivity) activity;
        this.f31769y2 = org.telegram.messenger.z5.q(this.f28669a).k();
        org.telegram.messenger.qs.f(this.f28669a).c(this, org.telegram.messenger.qs.f25002f2);
        org.telegram.messenger.qs.f(this.f28669a).c(this, org.telegram.messenger.qs.f25008g2);
        org.telegram.messenger.qs.f(this.f28669a).c(this, org.telegram.messenger.qs.f25014h2);
        org.telegram.messenger.qs.f(this.f28669a).c(this, org.telegram.messenger.qs.f24996e2);
        org.telegram.messenger.qs.f(this.f28669a).c(this, org.telegram.messenger.qs.Y1);
        org.telegram.messenger.qs.f(this.f28669a).c(this, org.telegram.messenger.qs.X1);
        org.telegram.messenger.qs.f(this.f28669a).c(this, org.telegram.messenger.qs.K0);
        org.telegram.messenger.qs.f(this.f28669a).c(this, org.telegram.messenger.qs.L0);
        org.telegram.messenger.qs.f(this.f28669a).c(this, org.telegram.messenger.qs.U3);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.J4);
        p7 p7Var = new p7(this, activity);
        this.f28672b = p7Var;
        p7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f28672b;
        int i11 = this.f28705t0;
        viewGroup.setPadding(i11, 0, i11, 0);
        q7 q7Var = new q7(this, activity, h6Var, 0);
        this.f31745m1 = q7Var;
        q7Var.setBackgroundColor(0);
        q7Var.setBackButtonImage(2131231240);
        int i12 = org.telegram.ui.ActionBar.m6.Cj;
        org.telegram.ui.ActionBar.t6.l(q7Var, 1, i12, h6Var);
        org.telegram.ui.ActionBar.t6.l(q7Var, 3, org.telegram.ui.ActionBar.m6.Bj, h6Var);
        org.telegram.ui.ActionBar.t6.l(q7Var, 5, i12, h6Var);
        org.telegram.ui.ActionBar.t6.l(q7Var, 6, org.telegram.ui.ActionBar.m6.Dj, h6Var);
        q7Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.y s5 = q7Var.s();
        s5.setLayoutParams(c8.ha.e(-1, -1, 119));
        View view = new View(activity);
        this.l1 = view;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27963h5, view, h6Var);
        q7Var.addView(view, 0, c8.ha.e(-1, -1, 119));
        view.setAlpha(0.0f);
        q7Var.setAlpha(0.0f);
        q7Var.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 10));
        View view2 = new View(activity);
        this.n1 = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(2131231237);
        View view3 = new View(activity);
        this.f31748o1 = view3;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.V5, view3, h6Var);
        h7 h7Var = new h7(this, activity, 2);
        this.f31766x1 = h7Var;
        r7 r7Var = new r7(this, activity);
        this.B1 = r7Var;
        h7Var.addView(r7Var, c8.ha.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        s7 s7Var = new s7(this, activity, activity, 0);
        this.C1 = s7Var;
        h7Var.addView(s7Var, c8.ha.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        s7 s7Var2 = new s7(this, activity, activity, 1);
        this.F1 = s7Var2;
        h7Var.addView(s7Var2, c8.ha.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        t7 t7Var = new t7(this, activity, h6Var);
        this.M1 = t7Var;
        t7Var.setLineWidth(4);
        t7Var.setDelegate(new gf.g(this, 28));
        t7Var.setReportChanges(true);
        h7Var.addView(t7Var, c8.ha.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        r1.g gVar = new r1.g(new r1.f(0.0f));
        r1.h hVar = new r1.h();
        hVar.b(750.0f);
        hVar.a(1.0f);
        gVar.f54279m = hVar;
        gVar.b(new d7(this, 0));
        this.f31740h2 = gVar;
        h70 h70Var = new h70(activity);
        this.L1 = h70Var;
        h70Var.setVisibility(4);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.Hj, h70Var, h6Var);
        h70Var.setProgressColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Jj, this.I0));
        h7Var.addView(h70Var, c8.ha.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(activity);
        this.N1 = m5Var;
        m5Var.setTextSize(12);
        m5Var.l("0:00", false);
        int i13 = org.telegram.ui.ActionBar.m6.Gj;
        org.telegram.ui.ActionBar.t6.X(m5Var, i13, h6Var);
        m5Var.setImportantForAccessibility(2);
        h7Var.addView(m5Var, c8.ha.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.T1 = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.t6.U(textView, i13, h6Var);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        h7Var.addView(textView, c8.ha.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(activity, null, 0, org.telegram.ui.ActionBar.m6.w0(i13, this.I0), false, h6Var);
        this.O1 = r0Var;
        r0Var.setLongClickEnabled(false);
        r0Var.setShowSubmenuByMove(false);
        r0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(224.0f));
        r0Var.setContentDescription(org.telegram.messenger.id.M0(2131754805, null));
        r0Var.setDelegate(new s6(this, 0));
        eu0 eu0Var = new eu0();
        this.P1 = eu0Var;
        r0Var.setIcon(eu0Var);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(getContext(), h6Var);
        this.Q1 = v0Var;
        v0Var.setRoundRadiusDp(6.0f);
        v0Var.setDrawShadow(true);
        v0Var.setOnValueChange(new t6(this, 0));
        z0VarArr[0] = r0Var.e(0, 2131232373, org.telegram.messenger.id.M0(2131745266, null));
        z0VarArr[1] = r0Var.e(1, 2131232372, org.telegram.messenger.id.M0(2131745267, null));
        z0VarArr[2] = r0Var.e(2, 2131232371, org.telegram.messenger.id.M0(2131745268, null));
        z0VarArr[3] = r0Var.e(3, 2131232370, org.telegram.messenger.id.M0(2131745270, null));
        z0VarArr[4] = r0Var.e(4, 2131232375, org.telegram.messenger.id.M0(2131745264, null));
        z0VarArr[5] = r0Var.e(5, 2131232374, org.telegram.messenger.id.M0(2131745265, null));
        if (org.telegram.messenger.g0.f22566p >= 3.0f) {
            r0Var.setPadding(0, 1, 0, 0);
        }
        r0Var.setAdditionalXOffset(org.telegram.messenger.g0.L(8.0f));
        r0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(400.0f));
        r0Var.setShowedFromBottom(true);
        h7Var.addView(r0Var, c8.ha.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        r0Var.setOnClickListener(new org.telegram.ui.ActionBar.l1(25, this, fArr));
        r0Var.setOnLongClickListener(new di.f2(2, this, h6Var));
        a1(false);
        h7 h7Var2 = new h7(this, activity, 0);
        h7Var.addView(h7Var2, c8.ha.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.r0 r0Var2 = new org.telegram.ui.ActionBar.r0(activity, null, 0, 0, false, h6Var);
        this.U1 = r0Var2;
        viewArr[0] = r0Var2;
        r0Var2.setLongClickEnabled(false);
        r0Var2.setShowSubmenuByMove(false);
        r0Var2.setAdditionalYOffset(-org.telegram.messenger.g0.L(166.0f));
        int i14 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, this.I0), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
        r0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(r0Var2, h02, null, M, h6Var);
        h7Var2.addView(r0Var2, c8.ha.e(48, 48, 51));
        r0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final a8 f38552b;

            {
                this.f38552b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i15 = r2;
                a8 a8Var = this.f38552b;
                switch (i15) {
                    case 0:
                        a8Var.d1();
                        a8Var.U1.U(null, null);
                        return;
                    default:
                        l7 l7Var = a8Var.J1;
                        org.telegram.messenger.ij ijVar2 = MediaController.B().f21300u0;
                        if (ijVar2 != null) {
                            boolean z11 = true;
                            k60 G = k60.G(a8Var.f28675c, a8Var.I0, view4, true);
                            k60 J0 = a8Var.J0(G, ijVar2);
                            if (!a8Var.O0()) {
                                G.l(2131232390, org.telegram.messenger.id.M0(2131753916, null), new hi.h2(G, J0, 7), !a8Var.f31757s2);
                                if (!a8Var.f31757s2 && G.y() != null) {
                                    G.y().setRightIcon(2131232059);
                                }
                                G.k();
                            }
                            G.l(2131232165, org.telegram.messenger.id.M0(2131750587, null), new z6(a8Var, G, 0), !a8Var.f31757s2);
                            G.l(2131232365, org.telegram.messenger.id.M0(2131745459, null), new z6(a8Var, G, 1), !a8Var.f31757s2);
                            if (ijVar2.e1() <= 0) {
                                z11 = false;
                            }
                            G.l(2131232224, org.telegram.messenger.id.M0(2131745342, null), new z6(a8Var, G, 2), z11);
                            if (a8Var.K1) {
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, G.f35194e, G.d, false, false);
                                G.d(z0Var);
                                a8Var.I1 = z0Var;
                                z0Var.j(org.telegram.messenger.id.M0(2131743589, null), 2131231912, null);
                                a8Var.I1.setOnClickListener(new org.telegram.ui.ActionBar.l1(26, a8Var, G));
                                org.telegram.messenger.g0.E2(l7Var);
                                a8Var.I1.addView(l7Var, 0, c8.ha.c(-1.0f, -1));
                                a8Var.updateColors();
                            }
                            G.m(2131232108, new z6(a8Var, G, 3), org.telegram.messenger.id.M0(2131746645, null), a8Var.O0(), true);
                            G.X(org.telegram.messenger.g0.L(64.0f));
                            G.Z();
                            return;
                        }
                        return;
                }
            }
        });
        this.V1 = r0Var2.e(3, 2131232556, org.telegram.messenger.id.M0(2131746273, null));
        this.W1 = r0Var2.e(4, 2131232555, org.telegram.messenger.id.M0(2131746276, null));
        r0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.g0.L(4.0f);
        this.X1 = r0Var2.e(2, 2131232557, org.telegram.messenger.id.M0(2131745322, null));
        r0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.g0.L(4.0f);
        this.Y1 = r0Var2.e(1, 2131232551, org.telegram.messenger.id.M0(2131746027, null));
        r0Var2.setShowedFromBottom(true);
        r0Var2.setDelegate(new s6(this, 1));
        int i15 = org.telegram.ui.ActionBar.m6.Kj;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i15, this.I0);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        j7 j7Var = new j7(this, activity, scaledTouchSlop);
        this.D1 = j7Var;
        viewArr[1] = j7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        j7Var.setScaleType(scaleType);
        j7Var.f(2131624137, 20, 20, null);
        j7Var.h(w02, "Triangle 3");
        j7Var.h(w02, "Triangle 4");
        j7Var.h(w02, "Rectangle 4");
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, this.I0), 1, org.telegram.messenger.g0.L(22.0f));
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i14);
        j7Var.setBackground(h03);
        org.telegram.ui.ActionBar.t6.j(j7Var, h03, null, M2, h6Var);
        h7Var2.addView(j7Var, c8.ha.e(48, 48, 51));
        j7Var.setContentDescription(org.telegram.messenger.id.M0(2131754800, null));
        ImageView imageView = new ImageView(activity);
        this.Z1 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        he0 he0Var = new he0(28);
        this.f31734a2 = he0Var;
        imageView.setImageDrawable(he0Var);
        he0Var.a(!MediaController.B().H(), false);
        org.telegram.ui.ActionBar.t6.s(imageView, i15, h6Var, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, this.I0), 1, org.telegram.messenger.g0.L(24.0f));
        org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i14);
        imageView.setBackground(h04);
        org.telegram.ui.ActionBar.t6.j(imageView, h04, null, M3, h6Var);
        h7Var2.addView(imageView, c8.ha.e(48, 48, 51));
        imageView.setOnClickListener(new bi.l1(9));
        k7 k7Var = new k7(this, activity, scaledTouchSlop);
        this.E1 = k7Var;
        viewArr[3] = k7Var;
        k7Var.setScaleType(scaleType);
        k7Var.f(2131624137, 20, 20, null);
        k7Var.h(w02, "Triangle 3");
        k7Var.h(w02, "Triangle 4");
        k7Var.h(w02, "Rectangle 4");
        k7Var.setRotation(180.0f);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, this.I0), 1, org.telegram.messenger.g0.L(22.0f));
        org.telegram.ui.ActionBar.p6 M4 = org.telegram.ui.ActionBar.t6.M(i14);
        k7Var.setBackground(h05);
        org.telegram.ui.ActionBar.t6.j(k7Var, h05, null, M4, h6Var);
        h7Var2.addView(k7Var, c8.ha.e(48, 48, 51));
        k7Var.setContentDescription(org.telegram.messenger.id.M0(2131748250, null));
        org.telegram.ui.ActionBar.r0 r0Var3 = new org.telegram.ui.ActionBar.r0(activity, null, 0, w02, false, h6Var);
        this.G1 = r0Var3;
        viewArr[4] = r0Var3;
        org.telegram.ui.xq xqVar = new org.telegram.ui.xq(2131231244, activity, h6Var);
        this.H1 = xqVar;
        r0Var3.setIcon(xqVar);
        r0Var3.setLongClickEnabled(false);
        r0Var3.setAdditionalYOffset(-org.telegram.messenger.g0.L(197.0f));
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, this.I0), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.p6 M5 = org.telegram.ui.ActionBar.t6.M(i14);
        r0Var3.setBackground(h06);
        org.telegram.ui.ActionBar.t6.j(r0Var3, h06, null, M5, h6Var);
        r0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final a8 f38552b;

            {
                this.f38552b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i152 = r2;
                a8 a8Var = this.f38552b;
                switch (i152) {
                    case 0:
                        a8Var.d1();
                        a8Var.U1.U(null, null);
                        return;
                    default:
                        l7 l7Var = a8Var.J1;
                        org.telegram.messenger.ij ijVar2 = MediaController.B().f21300u0;
                        if (ijVar2 != null) {
                            boolean z11 = true;
                            k60 G = k60.G(a8Var.f28675c, a8Var.I0, view4, true);
                            k60 J0 = a8Var.J0(G, ijVar2);
                            if (!a8Var.O0()) {
                                G.l(2131232390, org.telegram.messenger.id.M0(2131753916, null), new hi.h2(G, J0, 7), !a8Var.f31757s2);
                                if (!a8Var.f31757s2 && G.y() != null) {
                                    G.y().setRightIcon(2131232059);
                                }
                                G.k();
                            }
                            G.l(2131232165, org.telegram.messenger.id.M0(2131750587, null), new z6(a8Var, G, 0), !a8Var.f31757s2);
                            G.l(2131232365, org.telegram.messenger.id.M0(2131745459, null), new z6(a8Var, G, 1), !a8Var.f31757s2);
                            if (ijVar2.e1() <= 0) {
                                z11 = false;
                            }
                            G.l(2131232224, org.telegram.messenger.id.M0(2131745342, null), new z6(a8Var, G, 2), z11);
                            if (a8Var.K1) {
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, G.f35194e, G.d, false, false);
                                G.d(z0Var);
                                a8Var.I1 = z0Var;
                                z0Var.j(org.telegram.messenger.id.M0(2131743589, null), 2131231912, null);
                                a8Var.I1.setOnClickListener(new org.telegram.ui.ActionBar.l1(26, a8Var, G));
                                org.telegram.messenger.g0.E2(l7Var);
                                a8Var.I1.addView(l7Var, 0, c8.ha.c(-1.0f, -1));
                                a8Var.updateColors();
                            }
                            G.m(2131232108, new z6(a8Var, G, 3), org.telegram.messenger.id.M0(2131746645, null), a8Var.O0(), true);
                            G.X(org.telegram.messenger.g0.L(64.0f));
                            G.Z();
                            return;
                        }
                        return;
                }
            }
        });
        h7Var2.addView(r0Var3, c8.ha.e(48, 48, 51));
        l7 l7Var = new l7(this, activity, 0);
        this.J1 = l7Var;
        this.K1 = true;
        try {
            l7Var.setRouteSelector(g6.a.c(activity).a());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            this.K1 = false;
        }
        this.J1.setVisibility(4);
        org.telegram.ui.xq xqVar2 = this.H1;
        if (xqVar2 != null) {
            xqVar2.a(d1.f.u());
        }
        this.G1.setShowedFromBottom(true);
        this.G1.setDelegate(new s6(this, 2));
        this.G1.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f31760u1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i16 = 8;
        linearLayout.setVisibility(8);
        this.f28672b.addView(linearLayout, c8.ha.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new ei.b(11));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(2131232441);
        org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.W5, h6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, c8.ha.o(-2, -2));
        TextView textView2 = new TextView(activity);
        this.f31762v1 = textView2;
        int i17 = org.telegram.ui.ActionBar.m6.X5;
        org.telegram.ui.ActionBar.t6.U(textView2, i17, h6Var);
        textView2.setGravity(17);
        textView2.setText(org.telegram.messenger.id.M0(2131748243, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(textView2, c8.ha.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f31764w1 = textView3;
        org.telegram.ui.ActionBar.t6.U(textView3, i17, h6Var);
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(textView3, c8.ha.t(-2, -2, 17, 0, 6, 0, 0));
        m7 m7Var = new m7(this, activity);
        this.f31754r1 = m7Var;
        m7Var.setClipToPadding(false);
        getContext();
        v4.b0 b0Var = new v4.b0(1, false);
        this.f31756s1 = b0Var;
        m7Var.setLayoutManager(b0Var);
        m7Var.setHorizontalScrollBarEnabled(false);
        m7Var.setVerticalScrollBarEnabled(false);
        this.f28672b.addView(m7Var, c8.ha.e(-1, -1, 51));
        z7 z7Var = new z7(this, activity);
        this.f31758t1 = z7Var;
        m7Var.setAdapter(z7Var);
        org.telegram.ui.ActionBar.t6.l(m7Var, 21, org.telegram.ui.ActionBar.m6.A5, h6Var);
        m7Var.setOnItemClickListener(new f7(0));
        m7Var.setOnItemLongClickListener(new s6(this, 3));
        m7Var.setOnScrollListener(new ai.b(this, 26));
        fi.d dVar = new fi.d(activity, h6Var, true);
        dVar.setRoundRadius(24);
        this.f31768y1 = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        spannableStringBuilder.setSpan(new wp(2131231178, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131753925, null));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final a8 f33814b;

            {
                this.f33814b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i18 = r3;
                org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                a8 a8Var = this.f33814b;
                switch (i18) {
                    case 0:
                        org.telegram.messenger.ij ijVar2 = MediaController.B().f21300u0;
                        if (ijVar2 != null && a8Var.f31771z2 != null) {
                            a8Var.R0(ijVar2, true, new org.telegram.messenger.rc(20), false);
                            a8Var.U0(true);
                            org.telegram.messenger.k5.o(null, 2131753912, new gc((FrameLayout) a8Var.f28672b, h6Var2), 2131624190, 36);
                            return;
                        }
                        return;
                    default:
                        org.telegram.messenger.ij ijVar3 = MediaController.B().f21300u0;
                        if (ijVar3 != null && a8Var.f31771z2 != null) {
                            a8Var.R0(ijVar3, false, new org.telegram.messenger.rc(20), false);
                            a8Var.U0(false);
                            org.telegram.messenger.k5.o(null, 2131753911, new gc((FrameLayout) a8Var.f28672b, h6Var2), 2131624051, 36);
                            return;
                        }
                        return;
                }
            }
        });
        this.f31766x1.addView(dVar, c8.ha.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        fi.d dVar2 = new fi.d(activity, h6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.e();
        this.f31770z1 = dVar2;
        dVar2.setText(org.telegram.messenger.id.M0(2131753917, null));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final a8 f33814b;

            {
                this.f33814b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i18 = r3;
                org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                a8 a8Var = this.f33814b;
                switch (i18) {
                    case 0:
                        org.telegram.messenger.ij ijVar2 = MediaController.B().f21300u0;
                        if (ijVar2 != null && a8Var.f31771z2 != null) {
                            a8Var.R0(ijVar2, true, new org.telegram.messenger.rc(20), false);
                            a8Var.U0(true);
                            org.telegram.messenger.k5.o(null, 2131753912, new gc((FrameLayout) a8Var.f28672b, h6Var2), 2131624190, 36);
                            return;
                        }
                        return;
                    default:
                        org.telegram.messenger.ij ijVar3 = MediaController.B().f21300u0;
                        if (ijVar3 != null && a8Var.f31771z2 != null) {
                            a8Var.R0(ijVar3, false, new org.telegram.messenger.rc(20), false);
                            a8Var.U0(false);
                            org.telegram.messenger.k5.o(null, 2131753911, new gc((FrameLayout) a8Var.f28672b, h6Var2), 2131624051, 36);
                            return;
                        }
                        return;
                }
            }
        });
        this.f31766x1.addView(dVar2, c8.ha.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        org.telegram.messenger.kp kpVar = MediaController.B().Q0;
        this.f31751p2 = kpVar;
        if (kpVar != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f31747n2 = z9;
        this.f31745m1.m0 = z9;
        this.f31749o2 = O0();
        this.f31753q2 = MediaController.B().R0;
        if (O0()) {
            yVar = s5;
            this.d2 = yVar.a(8, 2131232042);
        } else {
            yVar = s5;
        }
        org.telegram.ui.ActionBar.r0 a10 = yVar.a(0, 2131232486);
        a10.N();
        a10.H = new kg.v1(this, 5);
        this.f31737e2 = a10;
        a10.setContentDescription(org.telegram.messenger.id.M0(2131745836, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        searchField.setHint(org.telegram.messenger.id.M0(2131745836, null));
        int i18 = org.telegram.ui.ActionBar.m6.Cj;
        org.telegram.ui.ActionBar.t6.U(searchField, i18, h6Var);
        org.telegram.ui.ActionBar.t6.D(searchField, org.telegram.ui.ActionBar.m6.Gj, h6Var);
        org.telegram.ui.ActionBar.t6.l(searchField, 30, i18, h6Var);
        if (z9) {
            m7Var.r1();
            v0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27834a7, h6Var));
            this.f31745m1.setAlpha(1.0f);
            this.l1.setAlpha(0.0f);
            org.telegram.ui.Cells.f2 f2Var = this.L2;
            q7 q7Var2 = this.f31745m1;
            Float valueOf = Float.valueOf(0.0f);
            f2Var.getClass();
            f2Var.a(q7Var2, valueOf);
        }
        if (this.f31753q2.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        z7Var.h = z10;
        if (z10) {
            m7Var.setVisibility(0);
            m7Var.setTranslationY(0.0f);
        } else {
            m7Var.setVisibility(8);
            m7Var.setTranslationY(org.telegram.messenger.g0.f22567q.y);
        }
        z7Var.f();
        this.f31745m1.setTitle(org.telegram.messenger.id.M0(2131753952, null));
        org.telegram.messenger.kp kpVar2 = this.f31751p2;
        if (kpVar2 != null) {
            if (kpVar2.f23744b == org.telegram.messenger.p10.i(this.f28669a).e()) {
                this.f31745m1.setTitle(org.telegram.messenger.id.M0(2131746643, null));
            } else {
                this.f31745m1.setTitle(org.telegram.messenger.id.a0(null, null, 2131746644, org.telegram.messenger.m5.t(this.f31751p2.f23744b)));
            }
        } else if (ijVar != null && MediaController.B().C0 == null) {
            long B0 = org.telegram.messenger.ij.B0(ijVar.f23266k);
            if (org.telegram.messenger.m5.C(B0)) {
                TLRPC.EncryptedChat a12 = org.telegram.messenger.qp.s1(this.f28669a).a1(Integer.valueOf((int) (B0 & 4294967295L)));
                if (a12 != null && (a22 = org.telegram.messenger.qp.s1(this.f28669a).a2(Long.valueOf(a12.user_id))) != null) {
                    this.f31745m1.setTitle(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                }
            } else if (B0 == org.telegram.messenger.p10.i(this.f28669a).e()) {
                if (ijVar.P1() == 2666000) {
                    this.f31745m1.setTitle(org.telegram.messenger.id.M0(2131754252, null));
                } else {
                    this.f31745m1.setTitle(org.telegram.messenger.id.M0(2131745901, null));
                }
            } else if (org.telegram.messenger.m5.E(B0)) {
                TLRPC.User a23 = org.telegram.messenger.qp.s1(this.f28669a).a2(Long.valueOf(B0));
                if (a23 != null) {
                    this.f31745m1.setTitle(org.telegram.messenger.g5.m(0, a23.first_name, a23.last_name));
                }
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.f28669a).M0(Long.valueOf(-B0));
                if (M0 != null) {
                    this.f31745m1.setTitle(M0.title);
                }
            }
        }
        if (O0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            v4.y yVar2 = new v4.y(new ei.d(this, 3));
            this.A1 = yVar2;
            yVar2.h(m7Var);
        }
        ViewGroup viewGroup2 = this.f28672b;
        h7 h7Var3 = this.f31766x1;
        int i19 = 52;
        if (!O0() && !this.f31757s2) {
            i7 = 52;
        } else {
            i7 = 0;
        }
        viewGroup2.addView(h7Var3, c8.ha.e(-1, i7 + 179, 83));
        this.f28672b.addView(this.f31748o1, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31766x1.getLayoutParams();
        if (!O0() && !this.f31757s2) {
            i10 = 52;
        } else {
            i10 = 0;
        }
        layoutParams.height = org.telegram.messenger.g0.L(i10 + 179);
        ((FrameLayout.LayoutParams) this.f31748o1.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(179 + ((O0() || this.f31757s2) ? 0 : 0));
        this.f28672b.addView(this.n1, c8.ha.c(3.0f, -1));
        this.f28672b.addView(this.f31745m1);
        h7 h7Var4 = new h7(this, activity, 1);
        this.f31735b2 = h7Var4;
        h7Var4.setAlpha(0.0f);
        h7Var4.setVisibility(4);
        this.f28675c.addView(h7Var4);
        k9 k9Var = new k9(activity);
        this.f31736c2 = k9Var;
        k9Var.setAspectFit(true);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(8.0f));
        k9Var.setScaleX(0.9f);
        k9Var.setScaleY(0.9f);
        h7Var4.addView(k9Var, c8.ha.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        f1(false);
        c1();
        if (this.f31752q1 && z7Var.b() == 0) {
            i16 = 0;
        }
        linearLayout.setVisibility(i16);
        Z0();
    }

    public static void I0(a8 a8Var) {
        int bottom;
        boolean z9;
        int translationY;
        Integer num;
        float f10;
        float f11;
        float f12;
        View view = a8Var.n1;
        q7 q7Var = a8Var.f31745m1;
        m7 m7Var = a8Var.f31754r1;
        if (m7Var.getChildCount() <= 0) {
            int paddingTop = m7Var.getPaddingTop();
            a8Var.f31759t2 = paddingTop;
            m7Var.setTopGlowOffset(paddingTop);
            a8Var.f28672b.invalidate();
            return;
        }
        boolean z10 = false;
        View childAt = m7Var.getChildAt(0);
        xi0 xi0Var = (xi0) m7Var.G(childAt);
        if (childAt instanceof org.telegram.ui.Cells.w) {
            bottom = childAt.getTop();
        } else {
            bottom = childAt.getBottom();
        }
        int L = org.telegram.messenger.g0.L(7.0f);
        if (bottom < org.telegram.messenger.g0.L(7.0f) || xi0Var == null || xi0Var.b() != 0) {
            bottom = L;
        }
        if (bottom <= org.telegram.messenger.g0.L(12.0f)) {
            z9 = true;
        } else {
            z9 = false;
        }
        float f13 = 1.0f;
        if ((z9 && q7Var.getTag() == null) || (!z9 && q7Var.getTag() != null)) {
            if (z9) {
                num = 1;
            } else {
                num = null;
            }
            q7Var.setTag(num);
            AnimatorSet animatorSet = a8Var.f31763v2;
            if (animatorSet != null) {
                animatorSet.cancel();
                a8Var.f31763v2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            a8Var.f31763v2 = animatorSet2;
            float f14 = 0.0f;
            if (a8Var.f31747n2) {
                org.telegram.ui.Cells.f2 f2Var = a8Var.L2;
                if (z9) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q7Var, f2Var, f11);
                View view2 = a8Var.l1;
                Property property = View.ALPHA;
                if (z9) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, property, f12);
                if (z9) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property, f14));
            } else {
                Property property2 = View.ALPHA;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(q7Var, property2, f10);
                if (z9) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat3, ObjectAnimator.ofFloat(view, property2, f14));
            }
            a8Var.f31763v2.setDuration(320L);
            a8Var.f31763v2.setInterpolator(wq.h);
            a8Var.f31763v2.addListener(new o7(a8Var, 2));
            a8Var.f31763v2.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) m7Var.getLayoutParams();
        int D = org.telegram.messenger.camera.q.D(11.0f, layoutParams.topMargin - org.telegram.messenger.g0.f22561m, bottom);
        if (a8Var.f31759t2 != D) {
            a8Var.f31759t2 = D;
            m7Var.setTopGlowOffset((D - layoutParams.topMargin) - org.telegram.messenger.g0.f22561m);
            a8Var.f28672b.invalidate();
        }
        int L2 = org.telegram.messenger.g0.L(13.0f);
        if (a8Var.f28704s0 + ((int) (m7Var.getTranslationY() + ((a8Var.f31759t2 - a8Var.f28704s0) - L2))) < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            f13 = 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - translationY) - a8Var.f28704s0) / (org.telegram.messenger.g0.L(4.0f) + L2));
        }
        a8Var.G2 = f13;
        if (f13 <= 0.5f && i0.a.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, a8Var.I0)) > 0.699999988079071d) {
            z10 = true;
        }
        if (z10 != a8Var.F2) {
            a8Var.F2 = z10;
            org.telegram.messenger.g0.q3(a8Var, z10);
        }
    }

    public static boolean L0(float f10, float f11) {
        if (Math.abs(f10 - f11) < 0.05f) {
            return true;
        }
        return false;
    }

    public static org.telegram.messenger.hc N0(org.telegram.messenger.ij ijVar) {
        TLRPC.PhotoSize photoSize;
        TLRPC.Document F0 = ijVar.F0();
        if (F0 != null) {
            photoSize = org.telegram.messenger.w7.w(F0.thumbs, 360, false, null, false);
        } else {
            photoSize = null;
        }
        if (!(photoSize instanceof TLRPC.TL_photoSize) && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            photoSize = null;
        }
        if (photoSize != null) {
            return org.telegram.messenger.hc.c(photoSize, F0);
        }
        String u02 = ijVar.u0(true);
        if (u02 == null) {
            return null;
        }
        return org.telegram.messenger.hc.g(u02);
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27891d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ij));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28300z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28006jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27988id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.We));
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final k60 J0(k60 k60Var, org.telegram.messenger.ij ijVar) {
        long j3;
        org.telegram.messenger.jp H1 = org.telegram.messenger.qp.s1(this.f28669a).H1();
        TLRPC.Document F0 = ijVar.F0();
        if (F0 != null) {
            j3 = F0.f26966id;
        } else {
            j3 = 0;
        }
        k60 J = k60Var.J();
        J.c(2131231240, org.telegram.messenger.id.M0(2131753756, null), new org.telegram.ui.jq0(k60Var, 27), false);
        J.k();
        J.l(2131231621, org.telegram.messenger.id.M0(2131753913, null), new y6(this, ijVar, k60Var, 6), !H1.f23593b.contains(Long.valueOf(j3)));
        J.c(2131232351, org.telegram.messenger.id.M0(2131753910, null), new y6(this, ijVar, k60Var, 7), false);
        J.c(2131231789, org.telegram.messenger.id.M0(2131753914, null), new y6(this, ijVar, k60Var, 8), false);
        J.k();
        J.p(12, org.telegram.messenger.g0.L(200.0f), org.telegram.messenger.id.M0(2131753915, null));
        return J;
    }

    public final void K0() {
        org.telegram.ui.ActionBar.r0 r0Var = this.U1;
        int w02 = org.telegram.ui.ActionBar.m6.w0(((Integer) r0Var.getTag()).intValue(), this.I0);
        int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Kj, this.I0);
        int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27982i6, this.I0);
        if (!this.O2 || w02 != this.P2) {
            this.P2 = w02;
            r0Var.setIconColor(w02);
        }
        boolean z9 = this.O2;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.G1;
        if (!z9 || w03 != this.Q2) {
            this.Q2 = w03;
            r0Var2.setIconColor(w03);
        }
        if (!this.O2 || w04 != this.R2) {
            this.R2 = w04;
            org.telegram.ui.ActionBar.m6.H1(r0Var.getBackground(), w04, true);
            org.telegram.ui.ActionBar.m6.H1(r0Var2.getBackground(), w04, true);
        }
        this.O2 = true;
        this.L1.setProgressColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Jj, this.I0));
        d1();
        int i7 = org.telegram.ui.ActionBar.m6.G8;
        r0Var.H(org.telegram.ui.ActionBar.m6.w0(i7, this.I0));
        int i10 = org.telegram.ui.ActionBar.m6.E8;
        r0Var2.O(org.telegram.ui.ActionBar.m6.w0(i10, this.I0), false);
        r0Var2.O(org.telegram.ui.ActionBar.m6.w0(i10, this.I0), true);
        r0Var2.H(org.telegram.ui.ActionBar.m6.w0(i7, this.I0));
    }

    public final void M0(org.telegram.messenger.ij ijVar) {
        ArrayList k10;
        TLRPC.TL_document tL_document;
        int i7 = org.telegram.messenger.p10.f24474s0;
        int i10 = this.f28669a;
        LaunchActivity launchActivity = this.f31771z2;
        if (i7 != i10) {
            launchActivity.O0(i10);
        }
        Bundle h = org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true);
        h.putBoolean("canSelectTopics", true);
        org.telegram.ui.zw zwVar = new org.telegram.ui.zw(h);
        if (ijVar.e1() < 0) {
            if (!(ijVar.F0() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) ijVar.F0();
            k10 = null;
        } else {
            k10 = org.telegram.messenger.k5.k(ijVar);
            tL_document = null;
        }
        zwVar.D2 = new a1.d(this, k10, tL_document, ijVar, 9);
        launchActivity.t0(zwVar);
        dismiss();
    }

    public final boolean O0() {
        org.telegram.messenger.kp kpVar = this.f31751p2;
        if (kpVar != null && kpVar.f23744b == org.telegram.messenger.p10.i(this.f28669a).e()) {
            return true;
        }
        return false;
    }

    public final void P0(int i7) {
        LaunchActivity launchActivity;
        org.telegram.messenger.ij ijVar = MediaController.B().f21300u0;
        if (ijVar != null && (launchActivity = this.f31771z2) != null) {
            if (i7 == 1) {
                M0(ijVar);
            } else if (i7 == 2) {
                V0(ijVar);
            } else if (i7 == 4) {
                int i10 = org.telegram.messenger.p10.f24474s0;
                int i11 = this.f28669a;
                if (i10 != i11) {
                    launchActivity.O0(i11);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.ij.B0(ijVar.f23266k);
                if (org.telegram.messenger.m5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.m5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.f28669a).M0(Long.valueOf(-B0));
                    if (M0 != null && M0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -M0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", ijVar.e1());
                org.telegram.messenger.qs.f(this.f28669a).k(org.telegram.messenger.qs.f25080t, new Object[0]);
                launchActivity.u0(new org.telegram.ui.cn(bundle), false, false);
                dismiss();
            } else if (i7 == 5) {
                Q0(ijVar);
            } else if (i7 == 6) {
                wf.b.Z().h0(MediaController.B().z());
                this.J1.performClick();
            } else if (i7 == 7) {
                R0(ijVar, false, new v6(this, ijVar, 0), false);
            } else if (i7 == 8) {
                fi.w6 w6Var = new fi.w6(getContext(), true, null, new x6(this, 0), null);
                w6Var.f13037c2 = true;
                w6Var.U1 = false;
                w6Var.f13044k2.O(true);
                w6Var.show();
            }
        }
    }

    public final void Q0(org.telegram.messenger.ij ijVar) {
        String str;
        if (Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.f25217b) {
            LaunchActivity launchActivity = this.f31771z2;
            if (launchActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                launchActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        String B = org.telegram.messenger.w7.B(ijVar.F0());
        if (TextUtils.isEmpty(B)) {
            B = ijVar.S0();
        }
        String str2 = B;
        String str3 = ijVar.f23266k.attachPath;
        if (str3 != null && str3.length() > 0 && !a8.p0.B(str3)) {
            str3 = null;
        }
        if (str3 == null || str3.length() == 0) {
            org.telegram.messenger.w7.G(this.f28669a);
            str3 = org.telegram.messenger.w7.M(ijVar.f23266k, false, true).toString();
        }
        String str4 = str3;
        if (ijVar.F0() != null) {
            str = ijVar.F0().mime_type;
        } else {
            str = "";
        }
        String str5 = str;
        MediaController.d0(str4, this.f31771z2, 3, str2, str5, new x6(this, 1));
    }

    @Override
    public final int R() {
        h7 h7Var = this.f31766x1;
        if (h7Var == null) {
            return 0;
        }
        if (this.f31753q2.size() <= 1) {
            return h7Var.getMeasuredHeight() + this.f28704s0;
        }
        int L = org.telegram.messenger.g0.L(13.0f);
        int translationY = (int) (this.f31754r1.getTranslationY() + ((this.f31759t2 - this.f28704s0) - L));
        if (this.f28704s0 + translationY < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            float L2 = org.telegram.messenger.g0.L(4.0f) + L;
            translationY -= (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - L2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - translationY) - this.f28704s0) / L2));
        }
        return this.f28675c.getMeasuredHeight() - (translationY + org.telegram.messenger.g0.f22561m);
    }

    public final void R0(org.telegram.messenger.ij ijVar, boolean z9, Runnable runnable, boolean z10) {
        TLRPC.Document F0 = ijVar.F0();
        if (F0 == null) {
            return;
        }
        long j3 = F0.f26966id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z9;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.f26988id = tL_inputDocument;
        tL_inputDocument.f26972id = j3;
        tL_inputDocument.access_hash = F0.access_hash;
        byte[] bArr = F0.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.f28669a).sendRequest(tL_account_saveMusic, new a7(this, z10, ijVar, z9, runnable, j3, F0));
    }

    public final boolean S0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a8.S0(boolean):boolean");
    }

    public final void T0(org.telegram.ui.ActionBar.z0 z0Var, boolean z9) {
        if (z9) {
            int i7 = org.telegram.ui.ActionBar.m6.Lj;
            z0Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, this.I0));
            z0Var.setIconColor(org.telegram.ui.ActionBar.m6.w0(i7, this.I0));
            return;
        }
        int i10 = org.telegram.ui.ActionBar.m6.E8;
        z0Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, this.I0));
        z0Var.setIconColor(org.telegram.ui.ActionBar.m6.w0(i10, this.I0));
    }

    @Override
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        r6 r6Var = new r6(this, 0);
        int i7 = org.telegram.ui.ActionBar.m6.Cj;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f31745m1, 1024, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        int i10 = org.telegram.ui.ActionBar.m6.Gj;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f31745m1, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f28672b, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f28702r0}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27963h5));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.L1, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Jj));
        int i11 = org.telegram.ui.ActionBar.m6.f28245w7;
        org.telegram.ui.ActionBar.r0 r0Var = this.O1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(r0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(r0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28264x7));
        int i12 = org.telegram.ui.ActionBar.m6.Kj;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.U1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(r0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(r0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, org.telegram.ui.ActionBar.m6.Lj));
        int i13 = org.telegram.ui.ActionBar.m6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.v6(r0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, i13));
        int i14 = org.telegram.ui.ActionBar.m6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.v6(r0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, i14));
        org.telegram.ui.ActionBar.r0 r0Var3 = this.G1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(r0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(r0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.v6(r0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, i14));
        j7 j7Var = this.D1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(j7Var, new zg0[]{j7Var.getAnimatedDrawable()}, "Triangle 3", i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(j7Var, new zg0[]{j7Var.getAnimatedDrawable()}, "Triangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(j7Var, new zg0[]{j7Var.getAnimatedDrawable()}, "Rectangle 4", i12));
        int i15 = org.telegram.ui.ActionBar.m6.f27982i6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.D1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.Z1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i15));
        k7 k7Var = this.E1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(k7Var, new zg0[]{k7Var.getAnimatedDrawable()}, "Triangle 3", i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(k7Var, new zg0[]{k7Var.getAnimatedDrawable()}, "Triangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(k7Var, new zg0[]{k7Var.getAnimatedDrawable()}, "Rectangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.E1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i15));
        int i16 = org.telegram.ui.ActionBar.m6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f31762v1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f31764w1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.L1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27873c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.L1, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27964h6));
        s7 s7Var = this.C1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(s7Var.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(s7Var.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        s7 s7Var2 = this.F1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(s7Var2.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(s7Var2.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f28672b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.wj));
        return arrayList;
    }

    public final void U0(final boolean z9) {
        float f10;
        float f11;
        float f12;
        float f13;
        boolean O0 = O0();
        fi.d dVar = this.f31770z1;
        fi.d dVar2 = this.f31768y1;
        if (!O0 && !this.f31757s2) {
            dVar2.setVisibility(0);
            dVar.setVisibility(0);
            ViewPropertyAnimator animate = dVar2.animate();
            float f14 = 0.0f;
            float f15 = 1.0f;
            if (z9) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z9) {
                f11 = 0.8f;
            } else {
                f11 = 1.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (z9) {
                f12 = 0.8f;
            } else {
                f12 = 1.0f;
            }
            ViewPropertyAnimator duration = scaleX.scaleY(f12).setDuration(420L);
            wq wqVar = wq.h;
            duration.setInterpolator(wqVar).withEndAction(new Runnable(this) {
                public final a8 f39892b;

                {
                    this.f39892b = this;
                }

                @Override
                public final void run() {
                    int i7;
                    int i10;
                    switch (r3) {
                        case 0:
                            fi.d dVar3 = this.f39892b.f31768y1;
                            if (z9) {
                                i7 = 8;
                            } else {
                                i7 = 0;
                            }
                            dVar3.setVisibility(i7);
                            return;
                        default:
                            fi.d dVar4 = this.f39892b.f31770z1;
                            if (z9) {
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
            if (z9) {
                f14 = 1.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f14);
            if (!z9) {
                f13 = 0.8f;
            } else {
                f13 = 1.0f;
            }
            ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
            if (!z9) {
                f15 = 0.8f;
            }
            scaleX2.scaleY(f15).setDuration(420L).setInterpolator(wqVar).withEndAction(new Runnable(this) {
                public final a8 f39892b;

                {
                    this.f39892b = this;
                }

                @Override
                public final void run() {
                    int i7;
                    int i10;
                    switch (r3) {
                        case 0:
                            fi.d dVar3 = this.f39892b.f31768y1;
                            if (z9) {
                                i7 = 8;
                            } else {
                                i7 = 0;
                            }
                            dVar3.setVisibility(i7);
                            return;
                        default:
                            fi.d dVar4 = this.f39892b.f31770z1;
                            if (z9) {
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

    public final void V0(org.telegram.messenger.ij r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a8.V0(org.telegram.messenger.ij):void");
    }

    public final void W0(boolean z9, boolean z10) {
        k9 k9Var = this.f31736c2;
        h7 h7Var = this.f31735b2;
        if (z9) {
            if (h7Var.getVisibility() != 0 && !this.f31738f2) {
                h7Var.setTag(1);
                r7 r7Var = this.B1;
                k9Var.setImageBitmap(r7Var.f37526a[r7Var.f37527b].getImageReceiver().n());
                this.f31738f2 = true;
                jk0.d(new t6(this, 1));
                h7Var.setVisibility(0);
                h7Var.animate().alpha(1.0f).setDuration(180L).setListener(new o7(this, 0)).start();
                k9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            }
        } else if (h7Var.getVisibility() != 0) {
        } else {
            h7Var.setTag(null);
            if (z10) {
                this.f31738f2 = true;
                h7Var.animate().alpha(0.0f).setDuration(180L).setListener(new o7(this, 1)).start();
                k9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
                return;
            }
            h7Var.setAlpha(0.0f);
            h7Var.setVisibility(4);
            k9Var.setImageBitmap(null);
            k9Var.setScaleX(0.9f);
            k9Var.setScaleY(0.9f);
        }
    }

    @Override
    public final boolean X(float f10, float f11) {
        int i7;
        FrameLayout frameLayout = this.E;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.E.getChildAt(0);
            if (f11 >= childAt.getY() + this.E.getY()) {
                if (f11 <= childAt.getY() + this.E.getY() + childAt.getHeight()) {
                    if (f10 >= childAt.getX() + this.E.getX()) {
                        if (f10 <= childAt.getX() + this.E.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        int top = this.f28672b.getTop();
        Drawable drawable = this.f28702r0;
        if (drawable != null) {
            i7 = drawable.getBounds().top;
        } else {
            i7 = 0;
        }
        if (f11 >= top + i7 && f10 >= this.f28672b.getLeft() && f10 <= this.f28672b.getRight()) {
            return false;
        }
        return true;
    }

    public final void X0(org.telegram.ui.Cells.w wVar, org.telegram.messenger.ij ijVar) {
        k60 G = k60.G(this.f28675c, this.I0, wVar, true);
        int i7 = 3;
        boolean z9 = false;
        if (O0()) {
            G.l(2131232165, org.telegram.messenger.id.M0(2131750587, null), new y6(this, G, ijVar, 0), !this.f31757s2);
            G.l(2131232365, org.telegram.messenger.id.M0(2131745459, null), new y6(this, G, ijVar, 1), !this.f31757s2);
            G.c(2131232108, org.telegram.messenger.id.M0(2131751598, null), new y6(this, ijVar, G, 2), true);
        } else {
            G.l(2131232390, org.telegram.messenger.id.M0(2131753916, null), new hi.h2(G, J0(G, ijVar), 6), !this.f31757s2);
            if (!this.f31757s2 && G.y() != null) {
                G.y().setRightIcon(2131232059);
            }
            G.k();
            G.l(2131232165, org.telegram.messenger.id.M0(2131750587, null), new y6(this, G, ijVar, 3), !this.f31757s2);
            G.l(2131232363, org.telegram.messenger.id.M0(2131745459, null), new y6(this, G, ijVar, 4), !this.f31757s2);
            if (ijVar.e1() > 0) {
                z9 = true;
            }
            G.l(2131232420, org.telegram.messenger.id.M0(2131745342, null), new v6(this, ijVar, 1), z9);
        }
        if (!org.telegram.messenger.id.f23161a0) {
            i7 = 5;
        }
        G.V(i7);
        G.Z();
    }

    public final void Y0() {
        if (this.A2 == 1) {
            this.D2 = System.currentTimeMillis();
            this.B2 = MediaController.B().f21300u0.f23226b0;
            m.f3 f3Var = this.H2;
            org.telegram.messenger.g0.r(f3Var);
            org.telegram.messenger.g0.h3(f3Var);
        }
    }

    public final void Z0() {
        int i7;
        LinearLayout linearLayout = this.f31760u1;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        if (this.f31766x1.getVisibility() == 0) {
            i7 = org.telegram.messenger.g0.L(150.0f);
        } else {
            i7 = -org.telegram.messenger.g0.L(30.0f);
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.f28672b.getMeasuredHeight()) - i7) / 2);
    }

    public final void a1(boolean z9) {
        if (this.O1 != null) {
            float f10 = MediaController.B().f21290q0;
            this.P1.b(z9, f10);
            this.Q1.e(z9, f10);
            updateColors();
            boolean z10 = this.R1;
            int i7 = 0;
            this.R1 = false;
            while (true) {
                org.telegram.ui.ActionBar.z0[] z0VarArr = this.S1;
                if (i7 < z0VarArr.length) {
                    if (!z10 && L0(f10, T2[i7])) {
                        org.telegram.ui.ActionBar.z0 z0Var = z0VarArr[i7];
                        int i10 = org.telegram.ui.ActionBar.m6.Ei;
                        z0Var.d(org.telegram.ui.ActionBar.m6.w0(i10, this.I0), org.telegram.ui.ActionBar.m6.w0(i10, this.I0));
                    } else {
                        org.telegram.ui.ActionBar.z0 z0Var2 = z0VarArr[i7];
                        int i11 = org.telegram.ui.ActionBar.m6.E8;
                        z0Var2.d(org.telegram.ui.ActionBar.m6.w0(i11, this.I0), org.telegram.ui.ActionBar.m6.w0(i11, this.I0));
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b1(org.telegram.messenger.ij r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a8.b1(org.telegram.messenger.ij, boolean):void");
    }

    public final void c1() {
        int i7 = org.telegram.messenger.iz.S0;
        org.telegram.ui.ActionBar.r0 r0Var = this.U1;
        if (i7 != 0 && i7 != 1) {
            if (i7 == 2) {
                r0Var.setIcon(2131232556);
                int i10 = org.telegram.ui.ActionBar.m6.Lj;
                r0Var.setTag(Integer.valueOf(i10));
                r0Var.setIconColor(org.telegram.ui.ActionBar.m6.w0(i10, this.I0));
                org.telegram.ui.ActionBar.m6.H1(r0Var.getBackground(), org.telegram.ui.ActionBar.m6.w0(i10, this.I0) & 436207615, true);
                r0Var.setContentDescription(org.telegram.messenger.id.M0(2131754785, null));
                return;
            }
            return;
        }
        if (org.telegram.messenger.iz.N0) {
            if (i7 == 0) {
                r0Var.setIcon(2131232557);
            } else {
                r0Var.setIcon(2131232554);
            }
        } else if (org.telegram.messenger.iz.O0) {
            if (i7 == 0) {
                r0Var.setIcon(2131232551);
            } else {
                r0Var.setIcon(2131232553);
            }
        } else {
            r0Var.setIcon(2131232555);
        }
        if (i7 == 0 && !org.telegram.messenger.iz.N0 && !org.telegram.messenger.iz.O0) {
            int i11 = org.telegram.ui.ActionBar.m6.Kj;
            r0Var.setTag(Integer.valueOf(i11));
            r0Var.setIconColor(org.telegram.ui.ActionBar.m6.w0(i11, this.I0));
            org.telegram.ui.ActionBar.m6.H1(r0Var.getBackground(), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27982i6, this.I0), true);
            r0Var.setContentDescription(org.telegram.messenger.id.M0(2131754786, null));
            return;
        }
        int i12 = org.telegram.ui.ActionBar.m6.Lj;
        r0Var.setTag(Integer.valueOf(i12));
        r0Var.setIconColor(org.telegram.ui.ActionBar.m6.w0(i12, this.I0));
        org.telegram.ui.ActionBar.m6.H1(r0Var.getBackground(), 436207615 & org.telegram.ui.ActionBar.m6.w0(i12, this.I0), true);
        if (i7 == 0) {
            if (org.telegram.messenger.iz.N0) {
                r0Var.setContentDescription(org.telegram.messenger.id.M0(2131745322, null));
                return;
            } else {
                r0Var.setContentDescription(org.telegram.messenger.id.M0(2131746027, null));
                return;
            }
        }
        r0Var.setContentDescription(org.telegram.messenger.id.M0(2131754787, null));
    }

    public final void d1() {
        boolean z9;
        T0(this.X1, org.telegram.messenger.iz.N0);
        T0(this.Y1, org.telegram.messenger.iz.O0);
        boolean z10 = false;
        if (org.telegram.messenger.iz.S0 == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        T0(this.W1, z9);
        if (org.telegram.messenger.iz.S0 == 2) {
            z10 = true;
        }
        T0(this.V1, z10);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z9;
        org.telegram.ui.Cells.w wVar;
        org.telegram.messenger.ij messageObject;
        org.telegram.ui.Cells.w wVar2;
        org.telegram.messenger.ij messageObject2;
        org.telegram.messenger.ij ijVar;
        int i11 = org.telegram.messenger.qs.f25014h2;
        int i12 = org.telegram.messenger.qs.f25002f2;
        int i13 = org.telegram.messenger.qs.f25008g2;
        m7 m7Var = this.f31754r1;
        int i14 = 0;
        if (i7 != i11 && i7 != i13 && i7 != i12) {
            if (i7 == org.telegram.messenger.qs.f24996e2) {
                org.telegram.messenger.ij ijVar2 = MediaController.B().f21300u0;
                if (ijVar2 != null && ijVar2.I3()) {
                    b1(ijVar2, false);
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.qs.J4) {
                a1(true);
                return;
            } else {
                int i15 = org.telegram.messenger.qs.K0;
                z7 z7Var = this.f31758t1;
                if (i7 == i15) {
                    this.f31751p2 = MediaController.B().Q0;
                    this.f31753q2 = MediaController.B().R0;
                    z7Var.f();
                    return;
                } else if (i7 == org.telegram.messenger.qs.L0) {
                    this.f31751p2 = MediaController.B().Q0;
                    this.f31753q2 = MediaController.B().R0;
                    z7Var.f();
                    if (org.telegram.messenger.iz.O0) {
                        m7Var.C0();
                        int intValue = ((Integer) objArr[0]).intValue();
                        v4.b0 b0Var = this.f31756s1;
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
                } else if (i7 == org.telegram.messenger.qs.Y1) {
                    if (((String) objArr[0]).equals(this.f31761u2)) {
                        f1(false);
                        this.f31742j2 = true;
                        return;
                    }
                    return;
                } else if (i7 == org.telegram.messenger.qs.X1) {
                    if (((String) objArr[0]).equals(this.f31761u2) && (ijVar = MediaController.B().f21300u0) != null) {
                        Long l10 = (Long) objArr[1];
                        Long l11 = (Long) objArr[2];
                        float f10 = 1.0f;
                        if (!this.f31742j2) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f31741i2) >= 500) {
                                if (MediaController.B().f21282l0) {
                                    f10 = org.telegram.messenger.w7.G(this.f28669a).t(this.f31761u2, ijVar.f23226b0);
                                }
                                this.f31741i2 = elapsedRealtime;
                            } else {
                                f10 = -1.0f;
                            }
                        }
                        if (f10 != -1.0f) {
                            r1.g gVar = this.f31740h2;
                            gVar.f54279m.f54287i = f10 * 1000.0f;
                            gVar.h();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == org.telegram.messenger.qs.U3) {
                    f1(false);
                    return;
                } else {
                    return;
                }
            }
        }
        if (i7 == i12 && ((Boolean) objArr[1]).booleanValue()) {
            z9 = true;
        } else {
            z9 = false;
        }
        f1(z9);
        if (i7 != i12 && i7 != i13) {
            if (((org.telegram.messenger.ij) objArr[0]).T == 0) {
                int childCount = m7Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = m7Var.getChildAt(i16);
                    if ((childAt instanceof org.telegram.ui.Cells.w) && (messageObject2 = (wVar2 = (org.telegram.ui.Cells.w) childAt).getMessageObject()) != null && (org.telegram.messenger.ij.R4(messageObject2.f23266k) || messageObject2.I3())) {
                        wVar2.b(false, true);
                    }
                }
            } else {
                return;
            }
        } else {
            int childCount2 = m7Var.getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = m7Var.getChildAt(i17);
                if ((childAt2 instanceof org.telegram.ui.Cells.w) && (messageObject = (wVar = (org.telegram.ui.Cells.w) childAt2).getMessageObject()) != null && (org.telegram.messenger.ij.R4(messageObject.f23266k) || messageObject.I3())) {
                    wVar.b(false, true);
                }
            }
            if (i7 == i13 && MediaController.B().f21300u0 != null) {
                if (MediaController.B().H()) {
                    Y0();
                } else if (this.A2 == 1 && this.B2 != -1.0f) {
                    m.f3 f3Var = this.H2;
                    org.telegram.messenger.g0.r(f3Var);
                    this.E2 = 0L;
                    f3Var.run();
                    this.B2 = -1.0f;
                }
            }
        }
        org.telegram.ui.xq xqVar = this.H1;
        if (xqVar != null) {
            xqVar.a(d1.f.u());
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.qs.f(this.f28669a).n(this, org.telegram.messenger.qs.f25002f2);
        org.telegram.messenger.qs.f(this.f28669a).n(this, org.telegram.messenger.qs.f25008g2);
        org.telegram.messenger.qs.f(this.f28669a).n(this, org.telegram.messenger.qs.f25014h2);
        org.telegram.messenger.qs.f(this.f28669a).n(this, org.telegram.messenger.qs.f24996e2);
        org.telegram.messenger.qs.f(this.f28669a).n(this, org.telegram.messenger.qs.Y1);
        org.telegram.messenger.qs.f(this.f28669a).n(this, org.telegram.messenger.qs.X1);
        org.telegram.messenger.qs.f(this.f28669a).n(this, org.telegram.messenger.qs.K0);
        org.telegram.messenger.qs.f(this.f28669a).n(this, org.telegram.messenger.qs.L0);
        org.telegram.messenger.qs.f(this.f28669a).n(this, org.telegram.messenger.qs.U3);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.J4);
        org.telegram.messenger.z5.q(this.f28669a).v(this);
        if (S2 == this) {
            S2 = null;
        }
    }

    public final void e1() {
        int i7;
        int w02;
        int i10;
        int i11;
        if (this.f31747n2) {
            i7 = org.telegram.ui.ActionBar.m6.f27834a7;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.f27963h5;
        }
        int w03 = org.telegram.ui.ActionBar.m6.w0(i7, this.I0);
        if (w03 != this.N2) {
            this.N2 = w03;
            v0(w03);
        }
        int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Kj, this.I0);
        j7 j7Var = this.D1;
        if (j7Var != null) {
            j7Var.h(w04, "Triangle 3");
            j7Var.h(w04, "Triangle 4");
            j7Var.h(w04, "Rectangle 4");
        }
        k7 k7Var = this.E1;
        if (k7Var != null) {
            k7Var.h(w04, "Triangle 3");
            k7Var.h(w04, "Triangle 4");
            k7Var.h(w04, "Rectangle 4");
        }
        t7 t7Var = this.M1;
        if (t7Var != null) {
            t7Var.setOuterColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Jj, this.I0));
        }
        boolean z9 = false;
        org.telegram.ui.ActionBar.r0 r0Var = this.O1;
        if (r0Var != null) {
            float f10 = MediaController.B().f21290q0;
            if (!L0(f10, 1.0f)) {
                i10 = org.telegram.ui.ActionBar.m6.Ei;
            } else {
                i10 = org.telegram.ui.ActionBar.m6.f28264x7;
            }
            int w05 = org.telegram.ui.ActionBar.m6.w0(i10, this.I0);
            eu0 eu0Var = this.P1;
            if (eu0Var != null) {
                eu0Var.f33334a.u(w05);
                Paint paint = eu0Var.f33335b;
                if (paint != null) {
                    paint.setColor(w05);
                }
            }
            org.telegram.ui.ActionBar.m6.H1(r0Var.getBackground(), w05 & 436207615, true);
            int i12 = 0;
            while (true) {
                org.telegram.ui.ActionBar.z0[] z0VarArr = this.S1;
                if (i12 >= z0VarArr.length) {
                    break;
                }
                if (z0VarArr[i12] != null) {
                    if (L0(f10, T2[i12])) {
                        i11 = org.telegram.ui.ActionBar.m6.Ei;
                    } else {
                        i11 = org.telegram.ui.ActionBar.m6.E8;
                    }
                    int w06 = org.telegram.ui.ActionBar.m6.w0(i11, this.I0);
                    z0VarArr[i12].d(w06, w06);
                }
                i12++;
            }
        }
        org.telegram.ui.ActionBar.z0 z0Var = this.I1;
        if (z0Var != null) {
            l7 l7Var = this.J1;
            if (l7Var != null && l7Var.b()) {
                z9 = true;
            }
            int w07 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, this.I0);
            int w08 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, this.I0);
            int i13 = org.telegram.ui.ActionBar.m6.Ci;
            z0Var.e(w07, w08, org.telegram.ui.ActionBar.m6.w0(i13, this.I0), z9);
            org.telegram.ui.ActionBar.z0 z0Var2 = this.I1;
            if (l7Var != null && l7Var.b()) {
                w02 = org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i13, this.I0));
            } else {
                w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27982i6, this.I0);
            }
            z0Var2.setSelectorColor(w02);
        }
    }

    public final void f1(boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a8.f1(boolean):void");
    }

    @Override
    public final int getObserverTag() {
        return this.f31769y2;
    }

    @Override
    public final void i(long j3, long j10) {
        this.L1.a(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
    }

    @Override
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        h7 h7Var = this.f31735b2;
        if (view != h7Var) {
            return false;
        }
        h7Var.layout(0, 0, h7Var.getMeasuredWidth(), h7Var.getMeasuredHeight());
        return true;
    }

    @Override
    public final boolean l0(View view, int i7, int i10) {
        h7 h7Var = this.f31735b2;
        if (view == h7Var) {
            org.telegram.ui.ActionBar.m2 m2Var = this.f28675c;
            h7Var.measure(View.MeasureSpec.makeMeasureSpec(m2Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(m2Var.getMeasuredHeight(), 1073741824));
            return true;
        }
        return false;
    }

    @Override
    public final void onBackPressed() {
        q7 q7Var = this.f31745m1;
        if (q7Var != null && q7Var.f27691n0) {
            q7Var.n(true);
        } else if (this.f31735b2.getTag() != null) {
            W0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        boolean z9;
        super.s0();
        try {
            if (this.f31737e2 != null && this.U1 != null && this.G1 != null && this.L1 != null) {
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
            float f10 = this.G2;
            if (f10 >= 0.0f) {
                if (f10 <= 0.5f && i0.a.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, this.I0)) > 0.699999988079071d) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 != this.F2) {
                    this.F2 = z9;
                    org.telegram.messenger.g0.q3(this, z9);
                }
            }
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        S2 = this;
    }

    public final void updateColors() {
        int w02;
        int i7;
        boolean z9 = true;
        org.telegram.ui.ActionBar.r0 r0Var = this.O1;
        if (r0Var != null) {
            if (!L0(MediaController.B().f21290q0, 1.0f)) {
                i7 = org.telegram.ui.ActionBar.m6.Ei;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.f28264x7;
            }
            int w03 = org.telegram.ui.ActionBar.m6.w0(i7, this.I0);
            eu0 eu0Var = this.P1;
            if (eu0Var != null) {
                eu0Var.f33334a.u(w03);
                Paint paint = eu0Var.f33335b;
                if (paint != null) {
                    paint.setColor(w03);
                }
            }
            r0Var.setBackground(org.telegram.ui.ActionBar.m6.h0(w03 & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        }
        org.telegram.ui.ActionBar.z0 z0Var = this.I1;
        if (z0Var != null) {
            l7 l7Var = this.J1;
            z9 = (l7Var == null || !l7Var.b()) ? false : false;
            int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, this.I0);
            int w05 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, this.I0);
            int i10 = org.telegram.ui.ActionBar.m6.Ci;
            z0Var.e(w04, w05, org.telegram.ui.ActionBar.m6.w0(i10, this.I0), z9);
            org.telegram.ui.ActionBar.z0 z0Var2 = this.I1;
            if (l7Var != null && l7Var.b()) {
                w02 = org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i10, this.I0));
            } else {
                w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27982i6, this.I0);
            }
            z0Var2.setSelectorColor(w02);
        }
    }

    @Override
    public final void C(boolean z9) {
    }

    @Override
    public final void M(String str) {
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
