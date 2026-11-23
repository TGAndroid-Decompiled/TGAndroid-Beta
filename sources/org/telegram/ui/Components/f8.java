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
public final class f8 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.gs, org.telegram.messenger.y5 {
    public static f8 T2;
    public static final float[] U2 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final hi.e A1;
    public final LaunchActivity A2;
    public final v4.z B1;
    public int B2;
    public final w7 C1;
    public float C2;
    public final x7 D1;
    public int D2;
    public final o7 E1;
    public long E2;
    public final p7 F1;
    public long F2;
    public final x7 G1;
    public boolean G2;
    public final org.telegram.ui.ActionBar.q0 H1;
    public float H2;
    public final org.telegram.ui.xq I1;
    public final j6.o I2;
    public org.telegram.ui.ActionBar.y0 J1;
    public s7 J2;
    public final q7 K1;
    public long K2;
    public final boolean L1;
    public float L2;
    public final x70 M1;
    public final org.telegram.ui.Cells.g2 M2;
    public final y7 N1;
    public ValueAnimator N2;
    public final org.telegram.ui.ActionBar.m5 O1;
    public int O2;
    public final org.telegram.ui.ActionBar.q0 P1;
    public boolean P2;
    public final pu0 Q1;
    public int Q2;
    public final org.telegram.ui.ActionBar.u0 R1;
    public int R2;
    public boolean S1;
    public int S2;
    public final org.telegram.ui.ActionBar.y0[] T1;
    public final TextView U1;
    public final org.telegram.ui.ActionBar.q0 V1;
    public final org.telegram.ui.ActionBar.y0 W1;
    public final org.telegram.ui.ActionBar.y0 X1;
    public final org.telegram.ui.ActionBar.y0 Y1;
    public final org.telegram.ui.ActionBar.y0 Z1;
    public final ImageView f35111a2;
    public final we0 f35112b2;
    public final m7 f35113c2;
    public final q9 d2;
    public final org.telegram.ui.ActionBar.q0 f35114e2;
    public final org.telegram.ui.ActionBar.q0 f35115f2;
    public boolean f35116g2;
    public final View[] f35117h2;
    public final r1.g f35118i2;
    public long f35119j2;
    public boolean f35120k2;
    public boolean f35121l2;
    public final View f35122m1;
    public int f35123m2;
    public final v7 n1;
    public int f35124n2;
    public final View f35125o1;
    public final boolean f35126o2;
    public final View f35127p1;
    public final boolean f35128p2;
    public boolean f35129q1;
    public org.telegram.messenger.hp f35130q2;
    public boolean f35131r1;
    public ArrayList f35132r2;
    public final r7 f35133s1;
    public org.telegram.messenger.gj f35134s2;
    public final v4.c0 f35135t1;
    public boolean f35136t2;
    public final e8 f35137u1;
    public int f35138u2;
    public final LinearLayout f35139v1;
    public String f35140v2;
    public final TextView f35141w1;
    public AnimatorSet f35142w2;
    public final TextView f35143x1;
    public int f35144x2;
    public final m7 f35145y1;
    public int f35146y2;
    public final hi.e f35147z1;
    public final int f35148z2;

    public f8(Activity activity, final org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, (Context) activity, h6Var, true);
        boolean z10;
        org.telegram.ui.ActionBar.y yVar;
        boolean z11;
        TLRPC.User c22;
        int i7;
        int i10;
        org.telegram.ui.ActionBar.y0[] y0VarArr = new org.telegram.ui.ActionBar.y0[6];
        this.T1 = y0VarArr;
        View[] viewArr = new View[5];
        this.f35117h2 = viewArr;
        this.f35121l2 = true;
        this.f35123m2 = -1;
        this.f35138u2 = Integer.MAX_VALUE;
        this.C2 = -1.0f;
        this.H2 = -1.0f;
        this.I2 = new j6.o(this, 28);
        this.M2 = new org.telegram.ui.Cells.g2(this);
        this.f30206r = true;
        O();
        org.telegram.messenger.gj gjVar = MediaController.B().f22771v0;
        if (gjVar != null) {
            this.f30173a = gjVar.K1;
        } else {
            this.f30173a = org.telegram.messenger.k10.f24968t0;
        }
        this.A2 = (LaunchActivity) activity;
        this.f35148z2 = org.telegram.messenger.a6.q(this.f30173a).k();
        org.telegram.messenger.ls.f(this.f30173a).c(this, org.telegram.messenger.ls.f25306f2);
        org.telegram.messenger.ls.f(this.f30173a).c(this, org.telegram.messenger.ls.f25312g2);
        org.telegram.messenger.ls.f(this.f30173a).c(this, org.telegram.messenger.ls.f25318h2);
        org.telegram.messenger.ls.f(this.f30173a).c(this, org.telegram.messenger.ls.f25300e2);
        org.telegram.messenger.ls.f(this.f30173a).c(this, org.telegram.messenger.ls.Y1);
        org.telegram.messenger.ls.f(this.f30173a).c(this, org.telegram.messenger.ls.X1);
        org.telegram.messenger.ls.f(this.f30173a).c(this, org.telegram.messenger.ls.K0);
        org.telegram.messenger.ls.f(this.f30173a).c(this, org.telegram.messenger.ls.L0);
        org.telegram.messenger.ls.f(this.f30173a).c(this, org.telegram.messenger.ls.X3);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.M4);
        u7 u7Var = new u7(this, activity);
        this.f30176b = u7Var;
        u7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f30176b;
        int i11 = this.f30211u0;
        viewGroup.setPadding(i11, 0, i11, 0);
        v7 v7Var = new v7(this, activity, h6Var, 0);
        this.n1 = v7Var;
        v7Var.setBackgroundColor(0);
        v7Var.setBackButtonImage(2131231240);
        int i12 = org.telegram.ui.ActionBar.m6.Fj;
        org.telegram.ui.ActionBar.t6.l(v7Var, 1, i12, h6Var);
        org.telegram.ui.ActionBar.t6.l(v7Var, 3, org.telegram.ui.ActionBar.m6.Ej, h6Var);
        org.telegram.ui.ActionBar.t6.l(v7Var, 5, i12, h6Var);
        org.telegram.ui.ActionBar.t6.l(v7Var, 6, org.telegram.ui.ActionBar.m6.Gj, h6Var);
        v7Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.y s5 = v7Var.s();
        s5.setLayoutParams(c8.ma.e(-1, -1, 119));
        View view = new View(activity);
        this.f35122m1 = view;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29454h5, view, h6Var);
        v7Var.addView(view, 0, c8.ma.e(-1, -1, 119));
        view.setAlpha(0.0f);
        v7Var.setAlpha(0.0f);
        v7Var.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 13));
        View view2 = new View(activity);
        this.f35125o1 = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(2131231237);
        View view3 = new View(activity);
        this.f35127p1 = view3;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.V5, view3, h6Var);
        m7 m7Var = new m7(this, activity, 2);
        this.f35145y1 = m7Var;
        w7 w7Var = new w7(this, activity);
        this.C1 = w7Var;
        m7Var.addView(w7Var, c8.ma.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        x7 x7Var = new x7(this, activity, activity, 0);
        this.D1 = x7Var;
        m7Var.addView(x7Var, c8.ma.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        x7 x7Var2 = new x7(this, activity, activity, 1);
        this.G1 = x7Var2;
        m7Var.addView(x7Var2, c8.ma.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        y7 y7Var = new y7(this, activity, h6Var);
        this.N1 = y7Var;
        y7Var.setLineWidth(4);
        y7Var.setDelegate(new h9.g1(this, 28));
        y7Var.setReportChanges(true);
        m7Var.addView(y7Var, c8.ma.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        r1.g gVar = new r1.g(new r1.f(0.0f));
        r1.h hVar = new r1.h();
        hVar.b(750.0f);
        hVar.a(1.0f);
        gVar.f56368m = hVar;
        gVar.b(new j7(this, 0));
        this.f35118i2 = gVar;
        x70 x70Var = new x70(activity);
        this.M1 = x70Var;
        x70Var.setVisibility(4);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.Kj, x70Var, h6Var);
        x70Var.setProgressColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Mj, this.J0));
        m7Var.addView(x70Var, c8.ma.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(activity);
        this.O1 = m5Var;
        m5Var.setTextSize(12);
        m5Var.l("0:00", false);
        int i13 = org.telegram.ui.ActionBar.m6.Jj;
        org.telegram.ui.ActionBar.t6.X(m5Var, i13, h6Var);
        m5Var.setImportantForAccessibility(2);
        m7Var.addView(m5Var, c8.ma.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.U1 = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.t6.U(textView, i13, h6Var);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        m7Var.addView(textView, c8.ma.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(activity, null, 0, org.telegram.ui.ActionBar.m6.w0(i13, this.J0), false, h6Var);
        this.P1 = q0Var;
        q0Var.setLongClickEnabled(false);
        q0Var.setShowSubmenuByMove(false);
        q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(224.0f));
        q0Var.setContentDescription(org.telegram.messenger.hd.N0(2131754804, null));
        q0Var.setDelegate(new y6(this, 0));
        pu0 pu0Var = new pu0();
        this.Q1 = pu0Var;
        q0Var.setIcon(pu0Var);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(getContext(), h6Var);
        this.R1 = u0Var;
        u0Var.setRoundRadiusDp(6.0f);
        u0Var.setDrawShadow(true);
        u0Var.setOnValueChange(new z6(this, 0));
        y0VarArr[0] = q0Var.e(0, 2131232375, org.telegram.messenger.hd.N0(2131745023, null));
        y0VarArr[1] = q0Var.e(1, 2131232374, org.telegram.messenger.hd.N0(2131745024, null));
        y0VarArr[2] = q0Var.e(2, 2131232373, org.telegram.messenger.hd.N0(2131745025, null));
        y0VarArr[3] = q0Var.e(3, 2131232372, org.telegram.messenger.hd.N0(2131745027, null));
        y0VarArr[4] = q0Var.e(4, 2131232377, org.telegram.messenger.hd.N0(2131745021, null));
        y0VarArr[5] = q0Var.e(5, 2131232376, org.telegram.messenger.hd.N0(2131745022, null));
        if (org.telegram.messenger.g0.f24045p >= 3.0f) {
            q0Var.setPadding(0, 1, 0, 0);
        }
        q0Var.setAdditionalXOffset(org.telegram.messenger.g0.L(8.0f));
        q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(400.0f));
        q0Var.setShowedFromBottom(true);
        m7Var.addView(q0Var, c8.ma.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        q0Var.setOnClickListener(new oi.i1(27, this, fArr));
        q0Var.setOnLongClickListener(new fi.z1(2, this, h6Var));
        b1(false);
        m7 m7Var2 = new m7(this, activity, 0);
        m7Var.addView(m7Var2, c8.ma.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(activity, null, 0, 0, false, h6Var);
        this.V1 = q0Var2;
        viewArr[0] = q0Var2;
        q0Var2.setLongClickEnabled(false);
        q0Var2.setShowSubmenuByMove(false);
        q0Var2.setAdditionalYOffset(-org.telegram.messenger.g0.L(166.0f));
        int i14 = org.telegram.ui.ActionBar.m6.f29473i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
        q0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(q0Var2, h02, null, M, h6Var);
        m7Var2.addView(q0Var2, c8.ma.e(48, 48, 51));
        q0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final f8 f33363b;

            {
                this.f33363b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i15 = r2;
                f8 f8Var = this.f33363b;
                switch (i15) {
                    case 0:
                        f8Var.e1();
                        f8Var.V1.V(null, null);
                        return;
                    default:
                        q7 q7Var = f8Var.K1;
                        org.telegram.messenger.gj gjVar2 = MediaController.B().f22771v0;
                        if (gjVar2 != null) {
                            boolean z12 = true;
                            a70 H = a70.H(f8Var.f30179c, f8Var.J0, view4, true);
                            a70 K0 = f8Var.K0(H, gjVar2);
                            if (!f8Var.P0()) {
                                H.l(2131232392, org.telegram.messenger.hd.N0(2131753913, null), new bi.x5(H, K0, 8), !f8Var.f35136t2);
                                if (!f8Var.f35136t2 && H.z() != null) {
                                    H.z().setRightIcon(2131232061);
                                }
                                H.k();
                            }
                            H.l(2131232167, org.telegram.messenger.hd.N0(2131750570, null), new f7(f8Var, H, 0), !f8Var.f35136t2);
                            H.l(2131232367, org.telegram.messenger.hd.N0(2131745263, null), new f7(f8Var, H, 1), !f8Var.f35136t2);
                            if (gjVar2.e1() <= 0) {
                                z12 = false;
                            }
                            H.l(2131232226, org.telegram.messenger.hd.N0(2131745146, null), new f7(f8Var, H, 2), z12);
                            if (f8Var.L1) {
                                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, H.f33371e, H.d, false, false);
                                H.d(y0Var);
                                f8Var.J1 = y0Var;
                                y0Var.j(org.telegram.messenger.hd.N0(2131743344, null), 2131231913, null);
                                f8Var.J1.setOnClickListener(new oi.i1(28, f8Var, H));
                                org.telegram.messenger.g0.E2(q7Var);
                                f8Var.J1.addView(q7Var, 0, c8.ma.c(-1.0f, -1));
                                f8Var.updateColors();
                            }
                            H.m(2131232110, new f7(f8Var, H, 3), org.telegram.messenger.hd.N0(2131746449, null), f8Var.P0(), true);
                            H.Y(org.telegram.messenger.g0.L(64.0f));
                            H.a0();
                            return;
                        }
                        return;
                }
            }
        });
        this.W1 = q0Var2.e(3, 2131232558, org.telegram.messenger.hd.N0(2131746077, null));
        this.X1 = q0Var2.e(4, 2131232557, org.telegram.messenger.hd.N0(2131746080, null));
        q0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.g0.L(4.0f);
        this.Y1 = q0Var2.e(2, 2131232559, org.telegram.messenger.hd.N0(2131745126, null));
        q0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.g0.L(4.0f);
        this.Z1 = q0Var2.e(1, 2131232553, org.telegram.messenger.hd.N0(2131745831, null));
        q0Var2.setShowedFromBottom(true);
        q0Var2.setDelegate(new y6(this, 1));
        int i15 = org.telegram.ui.ActionBar.m6.Nj;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i15, this.J0);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        o7 o7Var = new o7(this, activity, scaledTouchSlop);
        this.E1 = o7Var;
        viewArr[1] = o7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        o7Var.setScaleType(scaleType);
        o7Var.f(2131624138, 20, 20, null);
        o7Var.h(w02, "Triangle 3");
        o7Var.h(w02, "Triangle 4");
        o7Var.h(w02, "Rectangle 4");
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(22.0f));
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i14);
        o7Var.setBackground(h03);
        org.telegram.ui.ActionBar.t6.j(o7Var, h03, null, M2, h6Var);
        m7Var2.addView(o7Var, c8.ma.e(48, 48, 51));
        o7Var.setContentDescription(org.telegram.messenger.hd.N0(2131754799, null));
        ImageView imageView = new ImageView(activity);
        this.f35111a2 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        we0 we0Var = new we0(28);
        this.f35112b2 = we0Var;
        imageView.setImageDrawable(we0Var);
        we0Var.a(!MediaController.B().H(), false);
        org.telegram.ui.ActionBar.t6.s(imageView, i15, h6Var, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(24.0f));
        org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i14);
        imageView.setBackground(h04);
        org.telegram.ui.ActionBar.t6.j(imageView, h04, null, M3, h6Var);
        m7Var2.addView(imageView, c8.ma.e(48, 48, 51));
        imageView.setOnClickListener(new bi.o(14));
        p7 p7Var = new p7(this, activity, scaledTouchSlop);
        this.F1 = p7Var;
        viewArr[3] = p7Var;
        p7Var.setScaleType(scaleType);
        p7Var.f(2131624138, 20, 20, null);
        p7Var.h(w02, "Triangle 3");
        p7Var.h(w02, "Triangle 4");
        p7Var.h(w02, "Rectangle 4");
        p7Var.setRotation(180.0f);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(22.0f));
        org.telegram.ui.ActionBar.p6 M4 = org.telegram.ui.ActionBar.t6.M(i14);
        p7Var.setBackground(h05);
        org.telegram.ui.ActionBar.t6.j(p7Var, h05, null, M4, h6Var);
        m7Var2.addView(p7Var, c8.ma.e(48, 48, 51));
        p7Var.setContentDescription(org.telegram.messenger.hd.N0(2131748057, null));
        org.telegram.ui.ActionBar.q0 q0Var3 = new org.telegram.ui.ActionBar.q0(activity, null, 0, w02, false, h6Var);
        this.H1 = q0Var3;
        viewArr[4] = q0Var3;
        org.telegram.ui.xq xqVar = new org.telegram.ui.xq(2131231244, activity, h6Var);
        this.I1 = xqVar;
        q0Var3.setIcon(xqVar);
        q0Var3.setLongClickEnabled(false);
        q0Var3.setAdditionalYOffset(-org.telegram.messenger.g0.L(197.0f));
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.p6 M5 = org.telegram.ui.ActionBar.t6.M(i14);
        q0Var3.setBackground(h06);
        org.telegram.ui.ActionBar.t6.j(q0Var3, h06, null, M5, h6Var);
        q0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final f8 f33363b;

            {
                this.f33363b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i152 = r2;
                f8 f8Var = this.f33363b;
                switch (i152) {
                    case 0:
                        f8Var.e1();
                        f8Var.V1.V(null, null);
                        return;
                    default:
                        q7 q7Var = f8Var.K1;
                        org.telegram.messenger.gj gjVar2 = MediaController.B().f22771v0;
                        if (gjVar2 != null) {
                            boolean z12 = true;
                            a70 H = a70.H(f8Var.f30179c, f8Var.J0, view4, true);
                            a70 K0 = f8Var.K0(H, gjVar2);
                            if (!f8Var.P0()) {
                                H.l(2131232392, org.telegram.messenger.hd.N0(2131753913, null), new bi.x5(H, K0, 8), !f8Var.f35136t2);
                                if (!f8Var.f35136t2 && H.z() != null) {
                                    H.z().setRightIcon(2131232061);
                                }
                                H.k();
                            }
                            H.l(2131232167, org.telegram.messenger.hd.N0(2131750570, null), new f7(f8Var, H, 0), !f8Var.f35136t2);
                            H.l(2131232367, org.telegram.messenger.hd.N0(2131745263, null), new f7(f8Var, H, 1), !f8Var.f35136t2);
                            if (gjVar2.e1() <= 0) {
                                z12 = false;
                            }
                            H.l(2131232226, org.telegram.messenger.hd.N0(2131745146, null), new f7(f8Var, H, 2), z12);
                            if (f8Var.L1) {
                                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, H.f33371e, H.d, false, false);
                                H.d(y0Var);
                                f8Var.J1 = y0Var;
                                y0Var.j(org.telegram.messenger.hd.N0(2131743344, null), 2131231913, null);
                                f8Var.J1.setOnClickListener(new oi.i1(28, f8Var, H));
                                org.telegram.messenger.g0.E2(q7Var);
                                f8Var.J1.addView(q7Var, 0, c8.ma.c(-1.0f, -1));
                                f8Var.updateColors();
                            }
                            H.m(2131232110, new f7(f8Var, H, 3), org.telegram.messenger.hd.N0(2131746449, null), f8Var.P0(), true);
                            H.Y(org.telegram.messenger.g0.L(64.0f));
                            H.a0();
                            return;
                        }
                        return;
                }
            }
        });
        m7Var2.addView(q0Var3, c8.ma.e(48, 48, 51));
        q7 q7Var = new q7(this, activity, 0);
        this.K1 = q7Var;
        this.L1 = true;
        try {
            q7Var.setRouteSelector(g6.a.c(activity).a());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            this.L1 = false;
        }
        this.K1.setVisibility(4);
        org.telegram.ui.xq xqVar2 = this.I1;
        if (xqVar2 != null) {
            xqVar2.a(d1.f.u());
        }
        this.H1.setShowedFromBottom(true);
        this.H1.setDelegate(new y6(this, 2));
        this.H1.setContentDescription(org.telegram.messenger.hd.N0(2131754838, null));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f35139v1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i16 = 8;
        linearLayout.setVisibility(8);
        this.f30176b.addView(linearLayout, c8.ma.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new gi.a(11));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(2131232443);
        org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.W5, h6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, c8.ma.o(-2, -2));
        TextView textView2 = new TextView(activity);
        this.f35141w1 = textView2;
        int i17 = org.telegram.ui.ActionBar.m6.X5;
        org.telegram.ui.ActionBar.t6.U(textView2, i17, h6Var);
        textView2.setGravity(17);
        textView2.setText(org.telegram.messenger.hd.N0(2131748050, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(textView2, c8.ma.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f35143x1 = textView3;
        org.telegram.ui.ActionBar.t6.U(textView3, i17, h6Var);
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(textView3, c8.ma.t(-2, -2, 17, 0, 6, 0, 0));
        r7 r7Var = new r7(this, activity);
        this.f35133s1 = r7Var;
        r7Var.setClipToPadding(false);
        getContext();
        v4.c0 c0Var = new v4.c0(1, false);
        this.f35135t1 = c0Var;
        r7Var.setLayoutManager(c0Var);
        r7Var.setHorizontalScrollBarEnabled(false);
        r7Var.setVerticalScrollBarEnabled(false);
        this.f30176b.addView(r7Var, c8.ma.e(-1, -1, 51));
        e8 e8Var = new e8(this, activity);
        this.f35137u1 = e8Var;
        r7Var.setAdapter(e8Var);
        org.telegram.ui.ActionBar.t6.l(r7Var, 21, org.telegram.ui.ActionBar.m6.A5, h6Var);
        r7Var.setOnItemClickListener(new bi.a(2));
        r7Var.setOnItemLongClickListener(new y6(this, 3));
        r7Var.setOnScrollListener(new bi.u1(this, 29));
        hi.e eVar = new hi.e(activity, h6Var, true);
        eVar.setRoundRadius(24);
        this.f35147z1 = eVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        spannableStringBuilder.setSpan(new nq(2131231178, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131753922, null));
        eVar.setText(spannableStringBuilder);
        eVar.setOnClickListener(new View.OnClickListener(this) {
            public final f8 f37142b;

            {
                this.f37142b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i18 = r3;
                org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                f8 f8Var = this.f37142b;
                switch (i18) {
                    case 0:
                        org.telegram.messenger.gj gjVar2 = MediaController.B().f22771v0;
                        if (gjVar2 != null && f8Var.A2 != null) {
                            f8Var.S0(gjVar2, true, new org.telegram.messenger.j2(26), false);
                            f8Var.V0(true);
                            org.telegram.messenger.f3.n(null, 2131753909, new lc((FrameLayout) f8Var.f30176b, h6Var2), 2131624191, 36);
                            return;
                        }
                        return;
                    default:
                        org.telegram.messenger.gj gjVar3 = MediaController.B().f22771v0;
                        if (gjVar3 != null && f8Var.A2 != null) {
                            f8Var.S0(gjVar3, false, new org.telegram.messenger.j2(26), false);
                            f8Var.V0(false);
                            org.telegram.messenger.f3.n(null, 2131753908, new lc((FrameLayout) f8Var.f30176b, h6Var2), 2131624052, 36);
                            return;
                        }
                        return;
                }
            }
        });
        this.f35145y1.addView(eVar, c8.ma.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        hi.e eVar2 = new hi.e(activity, h6Var, true);
        eVar2.setRoundRadius(24);
        eVar2.e();
        this.A1 = eVar2;
        eVar2.setText(org.telegram.messenger.hd.N0(2131753914, null));
        eVar2.setOnClickListener(new View.OnClickListener(this) {
            public final f8 f37142b;

            {
                this.f37142b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i18 = r3;
                org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                f8 f8Var = this.f37142b;
                switch (i18) {
                    case 0:
                        org.telegram.messenger.gj gjVar2 = MediaController.B().f22771v0;
                        if (gjVar2 != null && f8Var.A2 != null) {
                            f8Var.S0(gjVar2, true, new org.telegram.messenger.j2(26), false);
                            f8Var.V0(true);
                            org.telegram.messenger.f3.n(null, 2131753909, new lc((FrameLayout) f8Var.f30176b, h6Var2), 2131624191, 36);
                            return;
                        }
                        return;
                    default:
                        org.telegram.messenger.gj gjVar3 = MediaController.B().f22771v0;
                        if (gjVar3 != null && f8Var.A2 != null) {
                            f8Var.S0(gjVar3, false, new org.telegram.messenger.j2(26), false);
                            f8Var.V0(false);
                            org.telegram.messenger.f3.n(null, 2131753908, new lc((FrameLayout) f8Var.f30176b, h6Var2), 2131624052, 36);
                            return;
                        }
                        return;
                }
            }
        });
        this.f35145y1.addView(eVar2, c8.ma.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        org.telegram.messenger.hp hpVar = MediaController.B().R0;
        this.f35130q2 = hpVar;
        if (hpVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35126o2 = z10;
        this.n1.f29149n0 = z10;
        this.f35128p2 = P0();
        this.f35132r2 = MediaController.B().S0;
        if (P0()) {
            yVar = s5;
            this.f35114e2 = yVar.a(8, 2131232044);
        } else {
            yVar = s5;
        }
        org.telegram.ui.ActionBar.q0 a10 = yVar.a(0, 2131232488);
        a10.O();
        a10.I = new bi.w1(this, 6);
        this.f35115f2 = a10;
        a10.setContentDescription(org.telegram.messenger.hd.N0(2131745640, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        searchField.setHint(org.telegram.messenger.hd.N0(2131745640, null));
        int i18 = org.telegram.ui.ActionBar.m6.Fj;
        org.telegram.ui.ActionBar.t6.U(searchField, i18, h6Var);
        org.telegram.ui.ActionBar.t6.D(searchField, org.telegram.ui.ActionBar.m6.Jj, h6Var);
        org.telegram.ui.ActionBar.t6.l(searchField, 30, i18, h6Var);
        if (z10) {
            r7Var.r1();
            v0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29324a7, h6Var));
            this.n1.setAlpha(1.0f);
            this.f35122m1.setAlpha(0.0f);
            org.telegram.ui.Cells.g2 g2Var = this.M2;
            v7 v7Var2 = this.n1;
            Float valueOf = Float.valueOf(0.0f);
            g2Var.getClass();
            g2Var.a(v7Var2, valueOf);
        }
        if (this.f35132r2.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        e8Var.h = z11;
        if (z11) {
            r7Var.setVisibility(0);
            r7Var.setTranslationY(0.0f);
        } else {
            r7Var.setVisibility(8);
            r7Var.setTranslationY(org.telegram.messenger.g0.f24046q.y);
        }
        e8Var.f();
        this.n1.setTitle(org.telegram.messenger.hd.N0(2131753949, null));
        org.telegram.messenger.hp hpVar2 = this.f35130q2;
        if (hpVar2 != null) {
            if (hpVar2.f24521b == org.telegram.messenger.k10.i(this.f30173a).e()) {
                this.n1.setTitle(org.telegram.messenger.hd.N0(2131746447, null));
            } else {
                this.n1.setTitle(org.telegram.messenger.hd.a0(null, null, 2131746448, org.telegram.messenger.n5.t(this.f35130q2.f24521b)));
            }
        } else if (gjVar != null && MediaController.B().D0 == null) {
            long B0 = org.telegram.messenger.gj.B0(gjVar.f24213k);
            if (org.telegram.messenger.n5.C(B0)) {
                TLRPC.EncryptedChat c12 = org.telegram.messenger.np.u1(this.f30173a).c1(Integer.valueOf((int) (B0 & 4294967295L)));
                if (c12 != null && (c22 = org.telegram.messenger.np.u1(this.f30173a).c2(Long.valueOf(c12.user_id))) != null) {
                    this.n1.setTitle(org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name));
                }
            } else if (B0 == org.telegram.messenger.k10.i(this.f30173a).e()) {
                if (gjVar.P1() == 2666000) {
                    this.n1.setTitle(org.telegram.messenger.hd.N0(2131754249, null));
                } else {
                    this.n1.setTitle(org.telegram.messenger.hd.N0(2131745705, null));
                }
            } else if (org.telegram.messenger.n5.E(B0)) {
                TLRPC.User c23 = org.telegram.messenger.np.u1(this.f30173a).c2(Long.valueOf(B0));
                if (c23 != null) {
                    this.n1.setTitle(org.telegram.messenger.i5.m(0, c23.first_name, c23.last_name));
                }
            } else {
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.f30173a).O0(Long.valueOf(-B0));
                if (O0 != null) {
                    this.n1.setTitle(O0.title);
                }
            }
        }
        if (P0()) {
            eVar.setVisibility(8);
            eVar2.setVisibility(8);
            v4.z zVar = new v4.z(new gi.c(this, 3));
            this.B1 = zVar;
            zVar.h(r7Var);
        }
        ViewGroup viewGroup2 = this.f30176b;
        m7 m7Var3 = this.f35145y1;
        int i19 = 52;
        if (!P0() && !this.f35136t2) {
            i7 = 52;
        } else {
            i7 = 0;
        }
        viewGroup2.addView(m7Var3, c8.ma.e(-1, i7 + 179, 83));
        this.f30176b.addView(this.f35127p1, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35145y1.getLayoutParams();
        if (!P0() && !this.f35136t2) {
            i10 = 52;
        } else {
            i10 = 0;
        }
        layoutParams.height = org.telegram.messenger.g0.L(i10 + 179);
        ((FrameLayout.LayoutParams) this.f35127p1.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(179 + ((P0() || this.f35136t2) ? 0 : 0));
        this.f30176b.addView(this.f35125o1, c8.ma.c(3.0f, -1));
        this.f30176b.addView(this.n1);
        m7 m7Var4 = new m7(this, activity, 1);
        this.f35113c2 = m7Var4;
        m7Var4.setAlpha(0.0f);
        m7Var4.setVisibility(4);
        this.f30179c.addView(m7Var4);
        q9 q9Var = new q9(activity);
        this.d2 = q9Var;
        q9Var.setAspectFit(true);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(8.0f));
        q9Var.setScaleX(0.9f);
        q9Var.setScaleY(0.9f);
        m7Var4.addView(q9Var, c8.ma.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        g1(false);
        d1();
        if (this.f35131r1 && e8Var.b() == 0) {
            i16 = 0;
        }
        linearLayout.setVisibility(i16);
        a1();
    }

    public static void J0(f8 f8Var) {
        int bottom;
        boolean z10;
        int translationY;
        Integer num;
        float f10;
        float f11;
        float f12;
        View view = f8Var.f35125o1;
        v7 v7Var = f8Var.n1;
        r7 r7Var = f8Var.f35133s1;
        if (r7Var.getChildCount() <= 0) {
            int paddingTop = r7Var.getPaddingTop();
            f8Var.f35138u2 = paddingTop;
            r7Var.setTopGlowOffset(paddingTop);
            f8Var.f30176b.invalidate();
            return;
        }
        boolean z11 = false;
        View childAt = r7Var.getChildAt(0);
        mj0 mj0Var = (mj0) r7Var.G(childAt);
        if (childAt instanceof org.telegram.ui.Cells.w) {
            bottom = childAt.getTop();
        } else {
            bottom = childAt.getBottom();
        }
        int L = org.telegram.messenger.g0.L(7.0f);
        if (bottom < org.telegram.messenger.g0.L(7.0f) || mj0Var == null || mj0Var.b() != 0) {
            bottom = L;
        }
        if (bottom <= org.telegram.messenger.g0.L(12.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f13 = 1.0f;
        if ((z10 && v7Var.getTag() == null) || (!z10 && v7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            v7Var.setTag(num);
            AnimatorSet animatorSet = f8Var.f35142w2;
            if (animatorSet != null) {
                animatorSet.cancel();
                f8Var.f35142w2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            f8Var.f35142w2 = animatorSet2;
            float f14 = 0.0f;
            if (f8Var.f35126o2) {
                org.telegram.ui.Cells.g2 g2Var = f8Var.M2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v7Var, g2Var, f11);
                View view2 = f8Var.f35122m1;
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
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(v7Var, property2, f10);
                if (z10) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat3, ObjectAnimator.ofFloat(view, property2, f14));
            }
            f8Var.f35142w2.setDuration(320L);
            f8Var.f35142w2.setInterpolator(nr.h);
            f8Var.f35142w2.addListener(new t7(f8Var, 2));
            f8Var.f35142w2.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r7Var.getLayoutParams();
        int i7 = org.telegram.ui.Cells.c0.i(11.0f, layoutParams.topMargin - org.telegram.messenger.g0.f24040m, bottom);
        if (f8Var.f35138u2 != i7) {
            f8Var.f35138u2 = i7;
            r7Var.setTopGlowOffset((i7 - layoutParams.topMargin) - org.telegram.messenger.g0.f24040m);
            f8Var.f30176b.invalidate();
        }
        int L2 = org.telegram.messenger.g0.L(13.0f);
        if (f8Var.f30210t0 + ((int) (r7Var.getTranslationY() + ((f8Var.f35138u2 - f8Var.f30210t0) - L2))) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f13 = 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - f8Var.f30210t0) / (org.telegram.messenger.g0.L(4.0f) + L2));
        }
        f8Var.H2 = f13;
        if (f13 <= 0.5f && i0.a.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, f8Var.J0)) > 0.699999988079071d) {
            z11 = true;
        }
        if (z11 != f8Var.G2) {
            f8Var.G2 = z11;
            org.telegram.messenger.g0.p3(f8Var, z11);
        }
    }

    public static boolean M0(float f10, float f11) {
        if (Math.abs(f10 - f11) < 0.05f) {
            return true;
        }
        return false;
    }

    public static org.telegram.messenger.gc O0(org.telegram.messenger.gj gjVar) {
        TLRPC.PhotoSize photoSize;
        TLRPC.Document F0 = gjVar.F0();
        if (F0 != null) {
            photoSize = org.telegram.messenger.w7.w(F0.thumbs, 360, false, null, false);
        } else {
            photoSize = null;
        }
        if (!(photoSize instanceof TLRPC.TL_photoSize) && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            photoSize = null;
        }
        if (photoSize != null) {
            return org.telegram.messenger.gc.c(photoSize, F0);
        }
        String u02 = gjVar.u0(true);
        if (u02 == null) {
            return null;
        }
        return org.telegram.messenger.gc.g(u02);
    }

    @Override
    public final void E(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29382d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ij));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Mj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Lj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29331ae));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29792z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29551md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29535ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29332af));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ze));
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final a70 K0(a70 a70Var, org.telegram.messenger.gj gjVar) {
        long j3;
        org.telegram.messenger.gp J1 = org.telegram.messenger.np.u1(this.f30173a).J1();
        TLRPC.Document F0 = gjVar.F0();
        if (F0 != null) {
            j3 = F0.f28440id;
        } else {
            j3 = 0;
        }
        a70 K = a70Var.K();
        K.c(2131231240, org.telegram.messenger.hd.N0(2131753753, null), new org.telegram.ui.hq0(a70Var, 27), false);
        K.k();
        K.l(2131231622, org.telegram.messenger.hd.N0(2131753910, null), new e7(this, gjVar, a70Var, 6), !J1.f24294b.contains(Long.valueOf(j3)));
        K.c(2131232353, org.telegram.messenger.hd.N0(2131753907, null), new e7(this, gjVar, a70Var, 7), false);
        K.c(2131231790, org.telegram.messenger.hd.N0(2131753911, null), new e7(this, gjVar, a70Var, 8), false);
        K.k();
        K.p(12, org.telegram.messenger.g0.L(200.0f), org.telegram.messenger.hd.N0(2131753912, null));
        return K;
    }

    public final void L0() {
        org.telegram.ui.ActionBar.q0 q0Var = this.V1;
        int w02 = org.telegram.ui.ActionBar.m6.w0(((Integer) q0Var.getTag()).intValue(), this.J0);
        int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Nj, this.J0);
        int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29473i6, this.J0);
        if (!this.P2 || w02 != this.Q2) {
            this.Q2 = w02;
            q0Var.setIconColor(w02);
        }
        boolean z10 = this.P2;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.H1;
        if (!z10 || w03 != this.R2) {
            this.R2 = w03;
            q0Var2.setIconColor(w03);
        }
        if (!this.P2 || w04 != this.S2) {
            this.S2 = w04;
            org.telegram.ui.ActionBar.m6.H1(q0Var.getBackground(), w04, true);
            org.telegram.ui.ActionBar.m6.H1(q0Var2.getBackground(), w04, true);
        }
        this.P2 = true;
        this.M1.setProgressColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Mj, this.J0));
        e1();
        int i7 = org.telegram.ui.ActionBar.m6.G8;
        q0Var.I(org.telegram.ui.ActionBar.m6.w0(i7, this.J0));
        int i10 = org.telegram.ui.ActionBar.m6.E8;
        q0Var2.P(org.telegram.ui.ActionBar.m6.w0(i10, this.J0), false);
        q0Var2.P(org.telegram.ui.ActionBar.m6.w0(i10, this.J0), true);
        q0Var2.I(org.telegram.ui.ActionBar.m6.w0(i7, this.J0));
    }

    public final void N0(org.telegram.messenger.gj gjVar) {
        ArrayList i7;
        TLRPC.TL_document tL_document;
        int i10 = org.telegram.messenger.k10.f24968t0;
        int i11 = this.f30173a;
        LaunchActivity launchActivity = this.A2;
        if (i10 != i11) {
            launchActivity.O0(i11);
        }
        Bundle l10 = org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true);
        l10.putBoolean("canSelectTopics", true);
        org.telegram.ui.cx cxVar = new org.telegram.ui.cx(l10);
        if (gjVar.e1() < 0) {
            if (!(gjVar.F0() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) gjVar.F0();
            i7 = null;
        } else {
            i7 = org.telegram.messenger.f3.i(gjVar);
            tL_document = null;
        }
        cxVar.E2 = new a1.d(this, i7, tL_document, gjVar, 9);
        launchActivity.t0(cxVar);
        dismiss();
    }

    public final boolean P0() {
        org.telegram.messenger.hp hpVar = this.f35130q2;
        if (hpVar != null && hpVar.f24521b == org.telegram.messenger.k10.i(this.f30173a).e()) {
            return true;
        }
        return false;
    }

    public final void Q0(int i7) {
        LaunchActivity launchActivity;
        org.telegram.messenger.gj gjVar = MediaController.B().f22771v0;
        if (gjVar != null && (launchActivity = this.A2) != null) {
            if (i7 == 1) {
                N0(gjVar);
            } else if (i7 == 2) {
                W0(gjVar);
            } else if (i7 == 4) {
                int i10 = org.telegram.messenger.k10.f24968t0;
                int i11 = this.f30173a;
                if (i10 != i11) {
                    launchActivity.O0(i11);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.gj.B0(gjVar.f24213k);
                if (org.telegram.messenger.n5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.n5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.f30173a).O0(Long.valueOf(-B0));
                    if (O0 != null && O0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -O0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", gjVar.e1());
                org.telegram.messenger.ls.f(this.f30173a).k(org.telegram.messenger.ls.f25384t, new Object[0]);
                launchActivity.u0(new org.telegram.ui.bn(bundle), false, false);
                dismiss();
            } else if (i7 == 5) {
                R0(gjVar);
            } else if (i7 == 6) {
                wf.b.J().Q(MediaController.B().z());
                this.K1.performClick();
            } else if (i7 == 7) {
                S0(gjVar, false, new b7(this, gjVar, 0), false);
            } else if (i7 == 8) {
                hi.u6 u6Var = new hi.u6(getContext(), true, null, new d7(this, 0), null);
                u6Var.d2 = true;
                u6Var.V1 = false;
                u6Var.f15557l2.O(true);
                u6Var.show();
            }
        }
    }

    public final void R0(org.telegram.messenger.gj gjVar) {
        String str;
        if (Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.s2.f26731b) {
            LaunchActivity launchActivity = this.A2;
            if (launchActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                launchActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        String B = org.telegram.messenger.w7.B(gjVar.F0());
        if (TextUtils.isEmpty(B)) {
            B = gjVar.S0();
        }
        String str2 = B;
        String str3 = gjVar.f24213k.attachPath;
        if (str3 != null && str3.length() > 0 && !a8.p0.B(str3)) {
            str3 = null;
        }
        if (str3 == null || str3.length() == 0) {
            org.telegram.messenger.w7.G(this.f30173a);
            str3 = org.telegram.messenger.w7.M(gjVar.f24213k, false, true).toString();
        }
        String str4 = str3;
        if (gjVar.F0() != null) {
            str = gjVar.F0().mime_type;
        } else {
            str = "";
        }
        String str5 = str;
        MediaController.d0(str4, this.A2, 3, str2, str5, new d7(this, 1));
    }

    @Override
    public final int S() {
        m7 m7Var = this.f35145y1;
        if (m7Var == null) {
            return 0;
        }
        if (this.f35132r2.size() <= 1) {
            return m7Var.getMeasuredHeight() + this.f30210t0;
        }
        int L = org.telegram.messenger.g0.L(13.0f);
        int translationY = (int) (this.f35133s1.getTranslationY() + ((this.f35138u2 - this.f30210t0) - L));
        if (this.f30210t0 + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float L2 = org.telegram.messenger.g0.L(4.0f) + L;
            translationY -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - this.f30210t0) / L2));
        }
        return this.f30179c.getMeasuredHeight() - (translationY + org.telegram.messenger.g0.f24040m);
    }

    public final void S0(org.telegram.messenger.gj gjVar, boolean z10, Runnable runnable, boolean z11) {
        TLRPC.Document F0 = gjVar.F0();
        if (F0 == null) {
            return;
        }
        long j3 = F0.f28440id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z10;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.f28462id = tL_inputDocument;
        tL_inputDocument.f28446id = j3;
        tL_inputDocument.access_hash = F0.access_hash;
        byte[] bArr = F0.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.f30173a).sendRequest(tL_account_saveMusic, new g7(this, z11, gjVar, z10, runnable, j3, F0));
    }

    public final boolean T0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f8.T0(boolean):boolean");
    }

    public final void U0(org.telegram.ui.ActionBar.y0 y0Var, boolean z10) {
        if (z10) {
            int i7 = org.telegram.ui.ActionBar.m6.Oj;
            y0Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, this.J0));
            y0Var.setIconColor(org.telegram.ui.ActionBar.m6.w0(i7, this.J0));
            return;
        }
        int i10 = org.telegram.ui.ActionBar.m6.E8;
        y0Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, this.J0));
        y0Var.setIconColor(org.telegram.ui.ActionBar.m6.w0(i10, this.J0));
    }

    @Override
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        x6 x6Var = new x6(this, 0);
        int i7 = org.telegram.ui.ActionBar.m6.Fj;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.n1, 1024, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        int i10 = org.telegram.ui.ActionBar.m6.Jj;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.n1, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f30176b, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f30209s0}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29454h5));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.M1, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Mj));
        int i11 = org.telegram.ui.ActionBar.m6.f29736w7;
        org.telegram.ui.ActionBar.q0 q0Var = this.P1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(q0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(q0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29755x7));
        int i12 = org.telegram.ui.ActionBar.m6.Nj;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.V1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, org.telegram.ui.ActionBar.m6.Oj));
        int i13 = org.telegram.ui.ActionBar.m6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.v6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, i13));
        int i14 = org.telegram.ui.ActionBar.m6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.v6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, i14));
        org.telegram.ui.ActionBar.q0 q0Var3 = this.H1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(q0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(q0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.v6(q0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, i14));
        o7 o7Var = this.E1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(o7Var, new oh0[]{o7Var.getAnimatedDrawable()}, "Triangle 3", i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(o7Var, new oh0[]{o7Var.getAnimatedDrawable()}, "Triangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(o7Var, new oh0[]{o7Var.getAnimatedDrawable()}, "Rectangle 4", i12));
        int i15 = org.telegram.ui.ActionBar.m6.f29473i6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.E1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f35111a2, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i15));
        p7 p7Var = this.F1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(p7Var, new oh0[]{p7Var.getAnimatedDrawable()}, "Triangle 3", i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(p7Var, new oh0[]{p7Var.getAnimatedDrawable()}, "Triangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(p7Var, new oh0[]{p7Var.getAnimatedDrawable()}, "Rectangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.F1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i15));
        int i16 = org.telegram.ui.ActionBar.m6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f35141w1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f35143x1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.M1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29364c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.M1, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29455h6));
        x7 x7Var = this.D1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(x7Var.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(x7Var.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        x7 x7Var2 = this.G1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(x7Var2.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(x7Var2.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f30176b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.zj));
        return arrayList;
    }

    public final void V0(final boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        boolean P0 = P0();
        hi.e eVar = this.A1;
        hi.e eVar2 = this.f35147z1;
        if (!P0 && !this.f35136t2) {
            eVar2.setVisibility(0);
            eVar.setVisibility(0);
            ViewPropertyAnimator animate = eVar2.animate();
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
            nr nrVar = nr.h;
            duration.setInterpolator(nrVar).withEndAction(new Runnable(this) {
                public final f8 f34104b;

                {
                    this.f34104b = this;
                }

                @Override
                public final void run() {
                    int i7;
                    int i10;
                    switch (r3) {
                        case 0:
                            hi.e eVar3 = this.f34104b.f35147z1;
                            if (z10) {
                                i7 = 8;
                            } else {
                                i7 = 0;
                            }
                            eVar3.setVisibility(i7);
                            return;
                        default:
                            hi.e eVar4 = this.f34104b.A1;
                            if (z10) {
                                i10 = 0;
                            } else {
                                i10 = 8;
                            }
                            eVar4.setVisibility(i10);
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = eVar.animate();
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
            scaleX2.scaleY(f15).setDuration(420L).setInterpolator(nrVar).withEndAction(new Runnable(this) {
                public final f8 f34104b;

                {
                    this.f34104b = this;
                }

                @Override
                public final void run() {
                    int i7;
                    int i10;
                    switch (r3) {
                        case 0:
                            hi.e eVar3 = this.f34104b.f35147z1;
                            if (z10) {
                                i7 = 8;
                            } else {
                                i7 = 0;
                            }
                            eVar3.setVisibility(i7);
                            return;
                        default:
                            hi.e eVar4 = this.f34104b.A1;
                            if (z10) {
                                i10 = 0;
                            } else {
                                i10 = 8;
                            }
                            eVar4.setVisibility(i10);
                            return;
                    }
                }
            }).start();
            return;
        }
        eVar2.setVisibility(8);
        eVar.setVisibility(8);
    }

    public final void W0(org.telegram.messenger.gj r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f8.W0(org.telegram.messenger.gj):void");
    }

    public final void X0(boolean z10, boolean z11) {
        q9 q9Var = this.d2;
        m7 m7Var = this.f35113c2;
        if (z10) {
            if (m7Var.getVisibility() != 0 && !this.f35116g2) {
                m7Var.setTag(1);
                w7 w7Var = this.C1;
                q9Var.setImageBitmap(w7Var.f41674a[w7Var.f41675b].getImageReceiver().n());
                this.f35116g2 = true;
                yk0.d(new z6(this, 1));
                m7Var.setVisibility(0);
                m7Var.animate().alpha(1.0f).setDuration(180L).setListener(new t7(this, 0)).start();
                q9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            }
        } else if (m7Var.getVisibility() != 0) {
        } else {
            m7Var.setTag(null);
            if (z11) {
                this.f35116g2 = true;
                m7Var.animate().alpha(0.0f).setDuration(180L).setListener(new t7(this, 1)).start();
                q9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
                return;
            }
            m7Var.setAlpha(0.0f);
            m7Var.setVisibility(4);
            q9Var.setImageBitmap(null);
            q9Var.setScaleX(0.9f);
            q9Var.setScaleY(0.9f);
        }
    }

    @Override
    public final boolean Y(float f10, float f11) {
        int i7;
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
        int top = this.f30176b.getTop();
        Drawable drawable = this.f30209s0;
        if (drawable != null) {
            i7 = drawable.getBounds().top;
        } else {
            i7 = 0;
        }
        if (f11 >= top + i7 && f10 >= this.f30176b.getLeft() && f10 <= this.f30176b.getRight()) {
            return false;
        }
        return true;
    }

    public final void Y0(org.telegram.ui.Cells.w wVar, org.telegram.messenger.gj gjVar) {
        a70 H = a70.H(this.f30179c, this.J0, wVar, true);
        int i7 = 3;
        boolean z10 = false;
        if (P0()) {
            H.l(2131232167, org.telegram.messenger.hd.N0(2131750570, null), new e7(this, H, gjVar, 0), !this.f35136t2);
            H.l(2131232367, org.telegram.messenger.hd.N0(2131745263, null), new e7(this, H, gjVar, 1), !this.f35136t2);
            H.c(2131232110, org.telegram.messenger.hd.N0(2131751586, null), new e7(this, gjVar, H, 2), true);
        } else {
            H.l(2131232392, org.telegram.messenger.hd.N0(2131753913, null), new bi.x5(H, K0(H, gjVar), 7), !this.f35136t2);
            if (!this.f35136t2 && H.z() != null) {
                H.z().setRightIcon(2131232061);
            }
            H.k();
            H.l(2131232167, org.telegram.messenger.hd.N0(2131750570, null), new e7(this, H, gjVar, 3), !this.f35136t2);
            H.l(2131232365, org.telegram.messenger.hd.N0(2131745263, null), new e7(this, H, gjVar, 4), !this.f35136t2);
            if (gjVar.e1() > 0) {
                z10 = true;
            }
            H.l(2131232422, org.telegram.messenger.hd.N0(2131745146, null), new b7(this, gjVar, 1), z10);
        }
        if (!org.telegram.messenger.hd.f24444a0) {
            i7 = 5;
        }
        H.W(i7);
        H.a0();
    }

    public final void Z0() {
        if (this.B2 == 1) {
            this.E2 = System.currentTimeMillis();
            this.C2 = MediaController.B().f22771v0.f24173b0;
            j6.o oVar = this.I2;
            org.telegram.messenger.g0.r(oVar);
            org.telegram.messenger.g0.g3(oVar);
        }
    }

    public final void a1() {
        int i7;
        LinearLayout linearLayout = this.f35139v1;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        if (this.f35145y1.getVisibility() == 0) {
            i7 = org.telegram.messenger.g0.L(150.0f);
        } else {
            i7 = -org.telegram.messenger.g0.L(30.0f);
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.f30176b.getMeasuredHeight()) - i7) / 2);
    }

    public final void b1(boolean z10) {
        if (this.P1 != null) {
            float f10 = MediaController.B().f22762r0;
            this.Q1.b(z10, f10);
            this.R1.e(z10, f10);
            updateColors();
            boolean z11 = this.S1;
            int i7 = 0;
            this.S1 = false;
            while (true) {
                org.telegram.ui.ActionBar.y0[] y0VarArr = this.T1;
                if (i7 < y0VarArr.length) {
                    if (!z11 && M0(f10, U2[i7])) {
                        org.telegram.ui.ActionBar.y0 y0Var = y0VarArr[i7];
                        int i10 = org.telegram.ui.ActionBar.m6.Hi;
                        y0Var.d(org.telegram.ui.ActionBar.m6.w0(i10, this.J0), org.telegram.ui.ActionBar.m6.w0(i10, this.J0));
                    } else {
                        org.telegram.ui.ActionBar.y0 y0Var2 = y0VarArr[i7];
                        int i11 = org.telegram.ui.ActionBar.m6.E8;
                        y0Var2.d(org.telegram.ui.ActionBar.m6.w0(i11, this.J0), org.telegram.ui.ActionBar.m6.w0(i11, this.J0));
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c1(org.telegram.messenger.gj r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f8.c1(org.telegram.messenger.gj, boolean):void");
    }

    public final void d1() {
        int i7 = org.telegram.messenger.cz.S0;
        org.telegram.ui.ActionBar.q0 q0Var = this.V1;
        if (i7 != 0 && i7 != 1) {
            if (i7 == 2) {
                q0Var.setIcon(2131232558);
                int i10 = org.telegram.ui.ActionBar.m6.Oj;
                q0Var.setTag(Integer.valueOf(i10));
                q0Var.setIconColor(org.telegram.ui.ActionBar.m6.w0(i10, this.J0));
                org.telegram.ui.ActionBar.m6.H1(q0Var.getBackground(), org.telegram.ui.ActionBar.m6.w0(i10, this.J0) & 436207615, true);
                q0Var.setContentDescription(org.telegram.messenger.hd.N0(2131754784, null));
                return;
            }
            return;
        }
        if (org.telegram.messenger.cz.N0) {
            if (i7 == 0) {
                q0Var.setIcon(2131232559);
            } else {
                q0Var.setIcon(2131232556);
            }
        } else if (org.telegram.messenger.cz.O0) {
            if (i7 == 0) {
                q0Var.setIcon(2131232553);
            } else {
                q0Var.setIcon(2131232555);
            }
        } else {
            q0Var.setIcon(2131232557);
        }
        if (i7 == 0 && !org.telegram.messenger.cz.N0 && !org.telegram.messenger.cz.O0) {
            int i11 = org.telegram.ui.ActionBar.m6.Nj;
            q0Var.setTag(Integer.valueOf(i11));
            q0Var.setIconColor(org.telegram.ui.ActionBar.m6.w0(i11, this.J0));
            org.telegram.ui.ActionBar.m6.H1(q0Var.getBackground(), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29473i6, this.J0), true);
            q0Var.setContentDescription(org.telegram.messenger.hd.N0(2131754785, null));
            return;
        }
        int i12 = org.telegram.ui.ActionBar.m6.Oj;
        q0Var.setTag(Integer.valueOf(i12));
        q0Var.setIconColor(org.telegram.ui.ActionBar.m6.w0(i12, this.J0));
        org.telegram.ui.ActionBar.m6.H1(q0Var.getBackground(), 436207615 & org.telegram.ui.ActionBar.m6.w0(i12, this.J0), true);
        if (i7 == 0) {
            if (org.telegram.messenger.cz.N0) {
                q0Var.setContentDescription(org.telegram.messenger.hd.N0(2131745126, null));
                return;
            } else {
                q0Var.setContentDescription(org.telegram.messenger.hd.N0(2131745831, null));
                return;
            }
        }
        q0Var.setContentDescription(org.telegram.messenger.hd.N0(2131754786, null));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z10;
        org.telegram.ui.Cells.w wVar;
        org.telegram.messenger.gj messageObject;
        org.telegram.ui.Cells.w wVar2;
        org.telegram.messenger.gj messageObject2;
        org.telegram.messenger.gj gjVar;
        int i11 = org.telegram.messenger.ls.f25318h2;
        int i12 = org.telegram.messenger.ls.f25306f2;
        int i13 = org.telegram.messenger.ls.f25312g2;
        r7 r7Var = this.f35133s1;
        int i14 = 0;
        if (i7 != i11 && i7 != i13 && i7 != i12) {
            if (i7 == org.telegram.messenger.ls.f25300e2) {
                org.telegram.messenger.gj gjVar2 = MediaController.B().f22771v0;
                if (gjVar2 != null && gjVar2.I3()) {
                    c1(gjVar2, false);
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.ls.M4) {
                b1(true);
                return;
            } else {
                int i15 = org.telegram.messenger.ls.K0;
                e8 e8Var = this.f35137u1;
                if (i7 == i15) {
                    this.f35130q2 = MediaController.B().R0;
                    this.f35132r2 = MediaController.B().S0;
                    e8Var.f();
                    return;
                } else if (i7 == org.telegram.messenger.ls.L0) {
                    this.f35130q2 = MediaController.B().R0;
                    this.f35132r2 = MediaController.B().S0;
                    e8Var.f();
                    if (org.telegram.messenger.cz.O0) {
                        r7Var.C0();
                        int intValue = ((Integer) objArr[0]).intValue();
                        v4.c0 c0Var = this.f35135t1;
                        c0Var.L0();
                        int N0 = c0Var.N0();
                        if (N0 != -1) {
                            View m10 = c0Var.m(N0);
                            if (m10 != null) {
                                i14 = m10.getTop();
                            }
                            c0Var.h1(N0 + intValue, i14);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == org.telegram.messenger.ls.Y1) {
                    if (((String) objArr[0]).equals(this.f35140v2)) {
                        g1(false);
                        this.f35120k2 = true;
                        return;
                    }
                    return;
                } else if (i7 == org.telegram.messenger.ls.X1) {
                    if (((String) objArr[0]).equals(this.f35140v2) && (gjVar = MediaController.B().f22771v0) != null) {
                        Long l10 = (Long) objArr[1];
                        Long l11 = (Long) objArr[2];
                        float f10 = 1.0f;
                        if (!this.f35120k2) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f35119j2) >= 500) {
                                if (MediaController.B().m0) {
                                    f10 = org.telegram.messenger.w7.G(this.f30173a).t(this.f35140v2, gjVar.f24173b0);
                                }
                                this.f35119j2 = elapsedRealtime;
                            } else {
                                f10 = -1.0f;
                            }
                        }
                        if (f10 != -1.0f) {
                            r1.g gVar = this.f35118i2;
                            gVar.f56368m.f56376i = f10 * 1000.0f;
                            gVar.h();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == org.telegram.messenger.ls.X3) {
                    g1(false);
                    return;
                } else {
                    return;
                }
            }
        }
        if (i7 == i12 && ((Boolean) objArr[1]).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        g1(z10);
        if (i7 != i12 && i7 != i13) {
            if (((org.telegram.messenger.gj) objArr[0]).T == 0) {
                int childCount = r7Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = r7Var.getChildAt(i16);
                    if ((childAt instanceof org.telegram.ui.Cells.w) && (messageObject2 = (wVar2 = (org.telegram.ui.Cells.w) childAt).getMessageObject()) != null && (org.telegram.messenger.gj.R4(messageObject2.f24213k) || messageObject2.I3())) {
                        wVar2.b(false, true);
                    }
                }
            } else {
                return;
            }
        } else {
            int childCount2 = r7Var.getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = r7Var.getChildAt(i17);
                if ((childAt2 instanceof org.telegram.ui.Cells.w) && (messageObject = (wVar = (org.telegram.ui.Cells.w) childAt2).getMessageObject()) != null && (org.telegram.messenger.gj.R4(messageObject.f24213k) || messageObject.I3())) {
                    wVar.b(false, true);
                }
            }
            if (i7 == i13 && MediaController.B().f22771v0 != null) {
                if (MediaController.B().H()) {
                    Z0();
                } else if (this.B2 == 1 && this.C2 != -1.0f) {
                    j6.o oVar = this.I2;
                    org.telegram.messenger.g0.r(oVar);
                    this.F2 = 0L;
                    oVar.run();
                    this.C2 = -1.0f;
                }
            }
        }
        org.telegram.ui.xq xqVar = this.I1;
        if (xqVar != null) {
            xqVar.a(d1.f.u());
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.ls.f(this.f30173a).n(this, org.telegram.messenger.ls.f25306f2);
        org.telegram.messenger.ls.f(this.f30173a).n(this, org.telegram.messenger.ls.f25312g2);
        org.telegram.messenger.ls.f(this.f30173a).n(this, org.telegram.messenger.ls.f25318h2);
        org.telegram.messenger.ls.f(this.f30173a).n(this, org.telegram.messenger.ls.f25300e2);
        org.telegram.messenger.ls.f(this.f30173a).n(this, org.telegram.messenger.ls.Y1);
        org.telegram.messenger.ls.f(this.f30173a).n(this, org.telegram.messenger.ls.X1);
        org.telegram.messenger.ls.f(this.f30173a).n(this, org.telegram.messenger.ls.K0);
        org.telegram.messenger.ls.f(this.f30173a).n(this, org.telegram.messenger.ls.L0);
        org.telegram.messenger.ls.f(this.f30173a).n(this, org.telegram.messenger.ls.X3);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.M4);
        org.telegram.messenger.a6.q(this.f30173a).v(this);
        if (T2 == this) {
            T2 = null;
        }
    }

    public final void e1() {
        boolean z10;
        U0(this.Y1, org.telegram.messenger.cz.N0);
        U0(this.Z1, org.telegram.messenger.cz.O0);
        boolean z11 = false;
        if (org.telegram.messenger.cz.S0 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        U0(this.X1, z10);
        if (org.telegram.messenger.cz.S0 == 2) {
            z11 = true;
        }
        U0(this.W1, z11);
    }

    public final void f1() {
        int i7;
        int w02;
        int i10;
        int i11;
        if (this.f35126o2) {
            i7 = org.telegram.ui.ActionBar.m6.f29324a7;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.f29454h5;
        }
        int w03 = org.telegram.ui.ActionBar.m6.w0(i7, this.J0);
        if (w03 != this.O2) {
            this.O2 = w03;
            v0(w03);
        }
        int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Nj, this.J0);
        o7 o7Var = this.E1;
        if (o7Var != null) {
            o7Var.h(w04, "Triangle 3");
            o7Var.h(w04, "Triangle 4");
            o7Var.h(w04, "Rectangle 4");
        }
        p7 p7Var = this.F1;
        if (p7Var != null) {
            p7Var.h(w04, "Triangle 3");
            p7Var.h(w04, "Triangle 4");
            p7Var.h(w04, "Rectangle 4");
        }
        y7 y7Var = this.N1;
        if (y7Var != null) {
            y7Var.setOuterColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Mj, this.J0));
        }
        boolean z10 = false;
        org.telegram.ui.ActionBar.q0 q0Var = this.P1;
        if (q0Var != null) {
            float f10 = MediaController.B().f22762r0;
            if (!M0(f10, 1.0f)) {
                i10 = org.telegram.ui.ActionBar.m6.Hi;
            } else {
                i10 = org.telegram.ui.ActionBar.m6.f29755x7;
            }
            int w05 = org.telegram.ui.ActionBar.m6.w0(i10, this.J0);
            pu0 pu0Var = this.Q1;
            if (pu0Var != null) {
                pu0Var.f38665a.u(w05);
                Paint paint = pu0Var.f38666b;
                if (paint != null) {
                    paint.setColor(w05);
                }
            }
            org.telegram.ui.ActionBar.m6.H1(q0Var.getBackground(), w05 & 436207615, true);
            int i12 = 0;
            while (true) {
                org.telegram.ui.ActionBar.y0[] y0VarArr = this.T1;
                if (i12 >= y0VarArr.length) {
                    break;
                }
                if (y0VarArr[i12] != null) {
                    if (M0(f10, U2[i12])) {
                        i11 = org.telegram.ui.ActionBar.m6.Hi;
                    } else {
                        i11 = org.telegram.ui.ActionBar.m6.E8;
                    }
                    int w06 = org.telegram.ui.ActionBar.m6.w0(i11, this.J0);
                    y0VarArr[i12].d(w06, w06);
                }
                i12++;
            }
        }
        org.telegram.ui.ActionBar.y0 y0Var = this.J1;
        if (y0Var != null) {
            q7 q7Var = this.K1;
            if (q7Var != null && q7Var.b()) {
                z10 = true;
            }
            int w07 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, this.J0);
            int w08 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, this.J0);
            int i13 = org.telegram.ui.ActionBar.m6.Fi;
            y0Var.e(w07, w08, org.telegram.ui.ActionBar.m6.w0(i13, this.J0), z10);
            org.telegram.ui.ActionBar.y0 y0Var2 = this.J1;
            if (q7Var != null && q7Var.b()) {
                w02 = org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i13, this.J0));
            } else {
                w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29473i6, this.J0);
            }
            y0Var2.setSelectorColor(w02);
        }
    }

    public final void g1(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f8.g1(boolean):void");
    }

    @Override
    public final int getObserverTag() {
        return this.f35148z2;
    }

    @Override
    public final void i(long j3, long j10) {
        this.M1.a(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
    }

    @Override
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        m7 m7Var = this.f35113c2;
        if (view != m7Var) {
            return false;
        }
        m7Var.layout(0, 0, m7Var.getMeasuredWidth(), m7Var.getMeasuredHeight());
        return true;
    }

    @Override
    public final boolean l0(View view, int i7, int i10) {
        m7 m7Var = this.f35113c2;
        if (view == m7Var) {
            org.telegram.ui.ActionBar.m2 m2Var = this.f30179c;
            m7Var.measure(View.MeasureSpec.makeMeasureSpec(m2Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(m2Var.getMeasuredHeight(), 1073741824));
            return true;
        }
        return false;
    }

    @Override
    public final void onBackPressed() {
        v7 v7Var = this.n1;
        if (v7Var != null && v7Var.f29150o0) {
            v7Var.n(true);
        } else if (this.f35113c2.getTag() != null) {
            X0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        boolean z10;
        super.s0();
        try {
            if (this.f35115f2 != null && this.V1 != null && this.H1 != null && this.M1 != null) {
                L0();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            f1();
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        try {
            float f10 = this.H2;
            if (f10 >= 0.0f) {
                if (f10 <= 0.5f && i0.a.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, this.J0)) > 0.699999988079071d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != this.G2) {
                    this.G2 = z10;
                    org.telegram.messenger.g0.p3(this, z10);
                }
            }
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        T2 = this;
    }

    public final void updateColors() {
        int w02;
        int i7;
        boolean z10 = true;
        org.telegram.ui.ActionBar.q0 q0Var = this.P1;
        if (q0Var != null) {
            if (!M0(MediaController.B().f22762r0, 1.0f)) {
                i7 = org.telegram.ui.ActionBar.m6.Hi;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.f29755x7;
            }
            int w03 = org.telegram.ui.ActionBar.m6.w0(i7, this.J0);
            pu0 pu0Var = this.Q1;
            if (pu0Var != null) {
                pu0Var.f38665a.u(w03);
                Paint paint = pu0Var.f38666b;
                if (paint != null) {
                    paint.setColor(w03);
                }
            }
            q0Var.setBackground(org.telegram.ui.ActionBar.m6.h0(w03 & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        }
        org.telegram.ui.ActionBar.y0 y0Var = this.J1;
        if (y0Var != null) {
            q7 q7Var = this.K1;
            z10 = (q7Var == null || !q7Var.b()) ? false : false;
            int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, this.J0);
            int w05 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, this.J0);
            int i10 = org.telegram.ui.ActionBar.m6.Fi;
            y0Var.e(w04, w05, org.telegram.ui.ActionBar.m6.w0(i10, this.J0), z10);
            org.telegram.ui.ActionBar.y0 y0Var2 = this.J1;
            if (q7Var != null && q7Var.b()) {
                w02 = org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i10, this.J0));
            } else {
                w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29473i6, this.J0);
            }
            y0Var2.setSelectorColor(w02);
        }
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void N(String str) {
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
