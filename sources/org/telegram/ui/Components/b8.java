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
public final class b8 extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls, org.telegram.messenger.x5 {
    public static b8 P2;
    public static final float[] Q2 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final k7 A1;
    public long A2;
    public final l7 B1;
    public long B2;
    public final t7 C1;
    public boolean C2;
    public final org.telegram.ui.ActionBar.r0 D1;
    public float D2;
    public final org.telegram.ui.uq E1;
    public final m.f3 E2;
    public org.telegram.ui.ActionBar.z0 F1;
    public o7 F2;
    public final m7 G1;
    public long G2;
    public final boolean H1;
    public float H2;
    public final h70 I1;
    public final org.telegram.ui.Cells.f2 I2;
    public final u7 J1;
    public ValueAnimator J2;
    public final org.telegram.ui.ActionBar.k5 K1;
    public int K2;
    public final org.telegram.ui.ActionBar.r0 L1;
    public boolean L2;
    public final du0 M1;
    public int M2;
    public final org.telegram.ui.ActionBar.v0 N1;
    public int N2;
    public boolean O1;
    public int O2;
    public final org.telegram.ui.ActionBar.z0[] P1;
    public final TextView Q1;
    public final org.telegram.ui.ActionBar.r0 R1;
    public final org.telegram.ui.ActionBar.z0 S1;
    public final org.telegram.ui.ActionBar.z0 T1;
    public final org.telegram.ui.ActionBar.z0 U1;
    public final org.telegram.ui.ActionBar.z0 V1;
    public final ImageView W1;
    public final he0 X1;
    public final i7 Y1;
    public final l9 Z1;
    public final org.telegram.ui.ActionBar.r0 f32062a2;
    public final org.telegram.ui.ActionBar.r0 f32063b2;
    public boolean f32064c2;
    public final View[] d2;
    public final r1.g f32065e2;
    public long f32066f2;
    public boolean f32067g2;
    public boolean f32068h2;
    public final View f32069i1;
    public int f32070i2;
    public final r7 f32071j1;
    public int f32072j2;
    public final View f32073k1;
    public final boolean f32074k2;
    public final View l1;
    public final boolean f32075l2;
    public boolean f32076m1;
    public org.telegram.messenger.kp f32077m2;
    public boolean n1;
    public ArrayList f32078n2;
    public final n7 f32079o1;
    public org.telegram.messenger.ij f32080o2;
    public final v4.b0 f32081p1;
    public boolean f32082p2;
    public final a8 f32083q1;
    public int f32084q2;
    public final LinearLayout f32085r1;
    public String f32086r2;
    public final TextView f32087s1;
    public AnimatorSet f32088s2;
    public final TextView f32089t1;
    public int f32090t2;
    public final i7 f32091u1;
    public int f32092u2;
    public final fi.d f32093v1;
    public final int f32094v2;
    public final fi.d f32095w1;
    public final LaunchActivity f32096w2;
    public final v4.y f32097x1;
    public int f32098x2;
    public final s7 f32099y1;
    public float f32100y2;
    public final t7 f32101z1;
    public int f32102z2;

    public b8(Activity activity, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, (Context) activity, f6Var, true);
        boolean z9;
        org.telegram.ui.ActionBar.y yVar;
        boolean z10;
        TLRPC.User a22;
        int i7;
        int i10;
        org.telegram.ui.ActionBar.z0[] z0VarArr = new org.telegram.ui.ActionBar.z0[6];
        this.P1 = z0VarArr;
        View[] viewArr = new View[5];
        this.d2 = viewArr;
        this.f32068h2 = true;
        this.f32070i2 = -1;
        this.f32084q2 = Integer.MAX_VALUE;
        this.f32100y2 = -1.0f;
        this.D2 = -1.0f;
        this.E2 = new m.f3(this, 25);
        this.I2 = new org.telegram.ui.Cells.f2(this);
        this.f28642r = true;
        N();
        org.telegram.messenger.ij ijVar = MediaController.B().f21292u0;
        if (ijVar != null) {
            this.f28613a = ijVar.I1;
        } else {
            this.f28613a = org.telegram.messenger.p10.f24467s0;
        }
        this.f32096w2 = (LaunchActivity) activity;
        this.f32094v2 = org.telegram.messenger.z5.q(this.f28613a).k();
        org.telegram.messenger.qs.f(this.f28613a).c(this, org.telegram.messenger.qs.f24989f2);
        org.telegram.messenger.qs.f(this.f28613a).c(this, org.telegram.messenger.qs.f24995g2);
        org.telegram.messenger.qs.f(this.f28613a).c(this, org.telegram.messenger.qs.f25001h2);
        org.telegram.messenger.qs.f(this.f28613a).c(this, org.telegram.messenger.qs.f24983e2);
        org.telegram.messenger.qs.f(this.f28613a).c(this, org.telegram.messenger.qs.Y1);
        org.telegram.messenger.qs.f(this.f28613a).c(this, org.telegram.messenger.qs.X1);
        org.telegram.messenger.qs.f(this.f28613a).c(this, org.telegram.messenger.qs.K0);
        org.telegram.messenger.qs.f(this.f28613a).c(this, org.telegram.messenger.qs.L0);
        org.telegram.messenger.qs.f(this.f28613a).c(this, org.telegram.messenger.qs.U3);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.J4);
        q7 q7Var = new q7(this, activity);
        this.f28616b = q7Var;
        q7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f28616b;
        int i11 = this.f28646t0;
        viewGroup.setPadding(i11, 0, i11, 0);
        r7 r7Var = new r7(this, activity, f6Var, 0);
        this.f32071j1 = r7Var;
        r7Var.setBackgroundColor(0);
        r7Var.setBackButtonImage(2131231240);
        int i12 = org.telegram.ui.ActionBar.k6.Cj;
        org.telegram.ui.ActionBar.r6.m(r7Var, 1, i12, f6Var);
        org.telegram.ui.ActionBar.r6.m(r7Var, 3, org.telegram.ui.ActionBar.k6.Bj, f6Var);
        org.telegram.ui.ActionBar.r6.m(r7Var, 5, i12, f6Var);
        org.telegram.ui.ActionBar.r6.m(r7Var, 6, org.telegram.ui.ActionBar.k6.Dj, f6Var);
        r7Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.y q10 = r7Var.q();
        q10.setLayoutParams(c8.ha.e(-1, -1, 119));
        View view = new View(activity);
        this.f32069i1 = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27922h5, view, f6Var);
        r7Var.addView(view, 0, c8.ha.e(-1, -1, 119));
        view.setAlpha(0.0f);
        r7Var.setAlpha(0.0f);
        r7Var.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 10));
        View view2 = new View(activity);
        this.f32073k1 = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(2131231237);
        View view3 = new View(activity);
        this.l1 = view3;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view3, f6Var);
        i7 i7Var = new i7(this, activity, 2);
        this.f32091u1 = i7Var;
        s7 s7Var = new s7(this, activity);
        this.f32099y1 = s7Var;
        i7Var.addView(s7Var, c8.ha.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        t7 t7Var = new t7(this, activity, activity, 0);
        this.f32101z1 = t7Var;
        i7Var.addView(t7Var, c8.ha.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        t7 t7Var2 = new t7(this, activity, activity, 1);
        this.C1 = t7Var2;
        i7Var.addView(t7Var2, c8.ha.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        u7 u7Var = new u7(this, activity, f6Var);
        this.J1 = u7Var;
        u7Var.setLineWidth(4);
        u7Var.setDelegate(new gf.g(this, 28));
        u7Var.setReportChanges(true);
        i7Var.addView(u7Var, c8.ha.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        r1.g gVar = new r1.g(new r1.f(0.0f));
        r1.h hVar = new r1.h();
        hVar.b(750.0f);
        hVar.a(1.0f);
        gVar.f54174m = hVar;
        gVar.b(new e7(this, 0));
        this.f32065e2 = gVar;
        h70 h70Var = new h70(activity);
        this.I1 = h70Var;
        h70Var.setVisibility(4);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Hj, h70Var, f6Var);
        h70Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Jj, this.I0));
        i7Var.addView(h70Var, c8.ha.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(activity);
        this.K1 = k5Var;
        k5Var.setTextSize(12);
        k5Var.l("0:00", false);
        int i13 = org.telegram.ui.ActionBar.k6.Gj;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i13, f6Var);
        k5Var.setImportantForAccessibility(2);
        i7Var.addView(k5Var, c8.ha.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.Q1 = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i13, f6Var);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        i7Var.addView(textView, c8.ha.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(activity, null, 0, org.telegram.ui.ActionBar.k6.w0(i13, this.I0), false, f6Var);
        this.L1 = r0Var;
        r0Var.setLongClickEnabled(false);
        r0Var.setShowSubmenuByMove(false);
        r0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(224.0f));
        r0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754805, null));
        r0Var.setDelegate(new t6(this, 0));
        du0 du0Var = new du0();
        this.M1 = du0Var;
        r0Var.setIcon(du0Var);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(getContext(), f6Var);
        this.N1 = v0Var;
        v0Var.setRoundRadiusDp(6.0f);
        v0Var.setDrawShadow(true);
        v0Var.setOnValueChange(new u6(this, 0));
        z0VarArr[0] = r0Var.e(0, 2131232373, org.telegram.messenger.hd.M0(2131745267, null));
        z0VarArr[1] = r0Var.e(1, 2131232372, org.telegram.messenger.hd.M0(2131745268, null));
        z0VarArr[2] = r0Var.e(2, 2131232371, org.telegram.messenger.hd.M0(2131745269, null));
        z0VarArr[3] = r0Var.e(3, 2131232370, org.telegram.messenger.hd.M0(2131745271, null));
        z0VarArr[4] = r0Var.e(4, 2131232375, org.telegram.messenger.hd.M0(2131745265, null));
        z0VarArr[5] = r0Var.e(5, 2131232374, org.telegram.messenger.hd.M0(2131745266, null));
        if (org.telegram.messenger.g0.f22543p >= 3.0f) {
            r0Var.setPadding(0, 1, 0, 0);
        }
        r0Var.setAdditionalXOffset(org.telegram.messenger.g0.L(8.0f));
        r0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(400.0f));
        r0Var.setShowedFromBottom(true);
        i7Var.addView(r0Var, c8.ha.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        r0Var.setOnClickListener(new org.telegram.ui.ActionBar.l1(25, this, fArr));
        r0Var.setOnLongClickListener(new di.f2(2, this, f6Var));
        a1(false);
        i7 i7Var2 = new i7(this, activity, 0);
        i7Var.addView(i7Var2, c8.ha.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.r0 r0Var2 = new org.telegram.ui.ActionBar.r0(activity, null, 0, 0, false, f6Var);
        this.R1 = r0Var2;
        viewArr[0] = r0Var2;
        r0Var2.setLongClickEnabled(false);
        r0Var2.setShowSubmenuByMove(false);
        r0Var2.setAdditionalYOffset(-org.telegram.messenger.g0.L(166.0f));
        int i14 = org.telegram.ui.ActionBar.k6.f27941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, this.I0), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
        r0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(r0Var2, h02, null, N, f6Var);
        i7Var2.addView(r0Var2, c8.ha.e(48, 48, 51));
        r0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final b8 f38885b;

            {
                this.f38885b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i15 = r2;
                b8 b8Var = this.f38885b;
                switch (i15) {
                    case 0:
                        b8Var.d1();
                        b8Var.R1.U(null, null);
                        return;
                    default:
                        m7 m7Var = b8Var.G1;
                        org.telegram.messenger.ij ijVar2 = MediaController.B().f21292u0;
                        if (ijVar2 != null) {
                            boolean z11 = true;
                            k60 G = k60.G(b8Var.f28619c, b8Var.I0, view4, true);
                            k60 J0 = b8Var.J0(G, ijVar2);
                            if (!b8Var.O0()) {
                                G.l(2131232390, org.telegram.messenger.hd.M0(2131753916, null), new hi.h2(G, J0, 7), !b8Var.f32082p2);
                                if (!b8Var.f32082p2 && G.y() != null) {
                                    G.y().setRightIcon(2131232059);
                                }
                                G.k();
                            }
                            G.l(2131232165, org.telegram.messenger.hd.M0(2131750588, null), new a7(b8Var, G, 0), !b8Var.f32082p2);
                            G.l(2131232365, org.telegram.messenger.hd.M0(2131745460, null), new a7(b8Var, G, 1), !b8Var.f32082p2);
                            if (ijVar2.f1() <= 0) {
                                z11 = false;
                            }
                            G.l(2131232224, org.telegram.messenger.hd.M0(2131745343, null), new a7(b8Var, G, 2), z11);
                            if (b8Var.H1) {
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, G.f35180e, G.d, false, false);
                                G.d(z0Var);
                                b8Var.F1 = z0Var;
                                z0Var.j(org.telegram.messenger.hd.M0(2131743590, null), 2131231912, null);
                                b8Var.F1.setOnClickListener(new org.telegram.ui.ActionBar.l1(26, b8Var, G));
                                org.telegram.messenger.g0.E2(m7Var);
                                b8Var.F1.addView(m7Var, 0, c8.ha.c(-1.0f, -1));
                                b8Var.updateColors();
                            }
                            G.m(2131232108, new a7(b8Var, G, 3), org.telegram.messenger.hd.M0(2131746644, null), b8Var.O0(), true);
                            G.X(org.telegram.messenger.g0.L(64.0f));
                            G.Z();
                            return;
                        }
                        return;
                }
            }
        });
        this.S1 = r0Var2.e(3, 2131232556, org.telegram.messenger.hd.M0(2131746272, null));
        this.T1 = r0Var2.e(4, 2131232555, org.telegram.messenger.hd.M0(2131746275, null));
        r0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.g0.L(4.0f);
        this.U1 = r0Var2.e(2, 2131232557, org.telegram.messenger.hd.M0(2131745323, null));
        r0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.g0.L(4.0f);
        this.V1 = r0Var2.e(1, 2131232551, org.telegram.messenger.hd.M0(2131746028, null));
        r0Var2.setShowedFromBottom(true);
        r0Var2.setDelegate(new t6(this, 1));
        int i15 = org.telegram.ui.ActionBar.k6.Kj;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i15, this.I0);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        k7 k7Var = new k7(this, activity, scaledTouchSlop);
        this.A1 = k7Var;
        viewArr[1] = k7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        k7Var.setScaleType(scaleType);
        k7Var.f(2131624137, 20, 20, null);
        k7Var.h(w02, "Triangle 3");
        k7Var.h(w02, "Triangle 4");
        k7Var.h(w02, "Rectangle 4");
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, this.I0), 1, org.telegram.messenger.g0.L(22.0f));
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
        k7Var.setBackground(h03);
        org.telegram.ui.ActionBar.r6.k(k7Var, h03, null, N2, f6Var);
        i7Var2.addView(k7Var, c8.ha.e(48, 48, 51));
        k7Var.setContentDescription(org.telegram.messenger.hd.M0(2131754800, null));
        ImageView imageView = new ImageView(activity);
        this.W1 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        he0 he0Var = new he0(28);
        this.X1 = he0Var;
        imageView.setImageDrawable(he0Var);
        he0Var.a(!MediaController.B().H(), false);
        org.telegram.ui.ActionBar.r6.t(imageView, i15, f6Var, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, this.I0), 1, org.telegram.messenger.g0.L(24.0f));
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i14);
        imageView.setBackground(h04);
        org.telegram.ui.ActionBar.r6.k(imageView, h04, null, N3, f6Var);
        i7Var2.addView(imageView, c8.ha.e(48, 48, 51));
        imageView.setOnClickListener(new bi.l1(9));
        l7 l7Var = new l7(this, activity, scaledTouchSlop);
        this.B1 = l7Var;
        viewArr[3] = l7Var;
        l7Var.setScaleType(scaleType);
        l7Var.f(2131624137, 20, 20, null);
        l7Var.h(w02, "Triangle 3");
        l7Var.h(w02, "Triangle 4");
        l7Var.h(w02, "Rectangle 4");
        l7Var.setRotation(180.0f);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, this.I0), 1, org.telegram.messenger.g0.L(22.0f));
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i14);
        l7Var.setBackground(h05);
        org.telegram.ui.ActionBar.r6.k(l7Var, h05, null, N4, f6Var);
        i7Var2.addView(l7Var, c8.ha.e(48, 48, 51));
        l7Var.setContentDescription(org.telegram.messenger.hd.M0(2131748249, null));
        org.telegram.ui.ActionBar.r0 r0Var3 = new org.telegram.ui.ActionBar.r0(activity, null, 0, w02, false, f6Var);
        this.D1 = r0Var3;
        viewArr[4] = r0Var3;
        org.telegram.ui.uq uqVar = new org.telegram.ui.uq(2131231244, activity, f6Var);
        this.E1 = uqVar;
        r0Var3.setIcon(uqVar);
        r0Var3.setLongClickEnabled(false);
        r0Var3.setAdditionalYOffset(-org.telegram.messenger.g0.L(197.0f));
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, this.I0), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i14);
        r0Var3.setBackground(h06);
        org.telegram.ui.ActionBar.r6.k(r0Var3, h06, null, N5, f6Var);
        r0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final b8 f38885b;

            {
                this.f38885b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i152 = r2;
                b8 b8Var = this.f38885b;
                switch (i152) {
                    case 0:
                        b8Var.d1();
                        b8Var.R1.U(null, null);
                        return;
                    default:
                        m7 m7Var = b8Var.G1;
                        org.telegram.messenger.ij ijVar2 = MediaController.B().f21292u0;
                        if (ijVar2 != null) {
                            boolean z11 = true;
                            k60 G = k60.G(b8Var.f28619c, b8Var.I0, view4, true);
                            k60 J0 = b8Var.J0(G, ijVar2);
                            if (!b8Var.O0()) {
                                G.l(2131232390, org.telegram.messenger.hd.M0(2131753916, null), new hi.h2(G, J0, 7), !b8Var.f32082p2);
                                if (!b8Var.f32082p2 && G.y() != null) {
                                    G.y().setRightIcon(2131232059);
                                }
                                G.k();
                            }
                            G.l(2131232165, org.telegram.messenger.hd.M0(2131750588, null), new a7(b8Var, G, 0), !b8Var.f32082p2);
                            G.l(2131232365, org.telegram.messenger.hd.M0(2131745460, null), new a7(b8Var, G, 1), !b8Var.f32082p2);
                            if (ijVar2.f1() <= 0) {
                                z11 = false;
                            }
                            G.l(2131232224, org.telegram.messenger.hd.M0(2131745343, null), new a7(b8Var, G, 2), z11);
                            if (b8Var.H1) {
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, G.f35180e, G.d, false, false);
                                G.d(z0Var);
                                b8Var.F1 = z0Var;
                                z0Var.j(org.telegram.messenger.hd.M0(2131743590, null), 2131231912, null);
                                b8Var.F1.setOnClickListener(new org.telegram.ui.ActionBar.l1(26, b8Var, G));
                                org.telegram.messenger.g0.E2(m7Var);
                                b8Var.F1.addView(m7Var, 0, c8.ha.c(-1.0f, -1));
                                b8Var.updateColors();
                            }
                            G.m(2131232108, new a7(b8Var, G, 3), org.telegram.messenger.hd.M0(2131746644, null), b8Var.O0(), true);
                            G.X(org.telegram.messenger.g0.L(64.0f));
                            G.Z();
                            return;
                        }
                        return;
                }
            }
        });
        i7Var2.addView(r0Var3, c8.ha.e(48, 48, 51));
        m7 m7Var = new m7(this, activity, 0);
        this.G1 = m7Var;
        this.H1 = true;
        try {
            m7Var.setRouteSelector(g6.a.c(activity).a());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            this.H1 = false;
        }
        this.G1.setVisibility(4);
        org.telegram.ui.uq uqVar2 = this.E1;
        if (uqVar2 != null) {
            uqVar2.a(d1.f.u());
        }
        this.D1.setShowedFromBottom(true);
        this.D1.setDelegate(new t6(this, 2));
        this.D1.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f32085r1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i16 = 8;
        linearLayout.setVisibility(8);
        this.f28616b.addView(linearLayout, c8.ha.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new ei.b(11));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(2131232441);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.W5, f6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, c8.ha.o(-2, -2));
        TextView textView2 = new TextView(activity);
        this.f32087s1 = textView2;
        int i17 = org.telegram.ui.ActionBar.k6.X5;
        org.telegram.ui.ActionBar.r6.V(textView2, i17, f6Var);
        textView2.setGravity(17);
        textView2.setText(org.telegram.messenger.hd.M0(2131748242, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(textView2, c8.ha.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f32089t1 = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, i17, f6Var);
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(textView3, c8.ha.t(-2, -2, 17, 0, 6, 0, 0));
        n7 n7Var = new n7(this, activity);
        this.f32079o1 = n7Var;
        n7Var.setClipToPadding(false);
        getContext();
        v4.b0 b0Var = new v4.b0(1, false);
        this.f32081p1 = b0Var;
        n7Var.setLayoutManager(b0Var);
        n7Var.setHorizontalScrollBarEnabled(false);
        n7Var.setVerticalScrollBarEnabled(false);
        this.f28616b.addView(n7Var, c8.ha.e(-1, -1, 51));
        a8 a8Var = new a8(this, activity);
        this.f32083q1 = a8Var;
        n7Var.setAdapter(a8Var);
        org.telegram.ui.ActionBar.r6.m(n7Var, 21, org.telegram.ui.ActionBar.k6.A5, f6Var);
        n7Var.setOnItemClickListener(new g7(0));
        n7Var.setOnItemLongClickListener(new t6(this, 3));
        n7Var.setOnScrollListener(new ai.b(this, 26));
        fi.d dVar = new fi.d(activity, f6Var, true);
        dVar.setRoundRadius(24);
        this.f32093v1 = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        spannableStringBuilder.setSpan(new wp(2131231178, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131753925, null));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final b8 f34201b;

            {
                this.f34201b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i18 = r3;
                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                b8 b8Var = this.f34201b;
                switch (i18) {
                    case 0:
                        org.telegram.messenger.ij ijVar2 = MediaController.B().f21292u0;
                        if (ijVar2 != null && b8Var.f32096w2 != null) {
                            b8Var.R0(ijVar2, true, new org.telegram.messenger.pd(18), false);
                            b8Var.U0(true);
                            org.telegram.messenger.k5.o(null, 2131753912, new hc((FrameLayout) b8Var.f28616b, f6Var2), 2131624190, 36);
                            return;
                        }
                        return;
                    default:
                        org.telegram.messenger.ij ijVar3 = MediaController.B().f21292u0;
                        if (ijVar3 != null && b8Var.f32096w2 != null) {
                            b8Var.R0(ijVar3, false, new org.telegram.messenger.pd(18), false);
                            b8Var.U0(false);
                            org.telegram.messenger.k5.o(null, 2131753911, new hc((FrameLayout) b8Var.f28616b, f6Var2), 2131624051, 36);
                            return;
                        }
                        return;
                }
            }
        });
        this.f32091u1.addView(dVar, c8.ha.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        fi.d dVar2 = new fi.d(activity, f6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.e();
        this.f32095w1 = dVar2;
        dVar2.setText(org.telegram.messenger.hd.M0(2131753917, null));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final b8 f34201b;

            {
                this.f34201b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i18 = r3;
                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                b8 b8Var = this.f34201b;
                switch (i18) {
                    case 0:
                        org.telegram.messenger.ij ijVar2 = MediaController.B().f21292u0;
                        if (ijVar2 != null && b8Var.f32096w2 != null) {
                            b8Var.R0(ijVar2, true, new org.telegram.messenger.pd(18), false);
                            b8Var.U0(true);
                            org.telegram.messenger.k5.o(null, 2131753912, new hc((FrameLayout) b8Var.f28616b, f6Var2), 2131624190, 36);
                            return;
                        }
                        return;
                    default:
                        org.telegram.messenger.ij ijVar3 = MediaController.B().f21292u0;
                        if (ijVar3 != null && b8Var.f32096w2 != null) {
                            b8Var.R0(ijVar3, false, new org.telegram.messenger.pd(18), false);
                            b8Var.U0(false);
                            org.telegram.messenger.k5.o(null, 2131753911, new hc((FrameLayout) b8Var.f28616b, f6Var2), 2131624051, 36);
                            return;
                        }
                        return;
                }
            }
        });
        this.f32091u1.addView(dVar2, c8.ha.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        org.telegram.messenger.kp kpVar = MediaController.B().Q0;
        this.f32077m2 = kpVar;
        if (kpVar != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f32074k2 = z9;
        this.f32071j1.m0 = z9;
        this.f32075l2 = O0();
        this.f32078n2 = MediaController.B().R0;
        if (O0()) {
            yVar = q10;
            this.f32062a2 = yVar.a(8, 2131232042);
        } else {
            yVar = q10;
        }
        org.telegram.ui.ActionBar.r0 a10 = yVar.a(0, 2131232486);
        a10.N();
        a10.H = new kg.v1(this, 5);
        this.f32063b2 = a10;
        a10.setContentDescription(org.telegram.messenger.hd.M0(2131745837, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        searchField.setHint(org.telegram.messenger.hd.M0(2131745837, null));
        int i18 = org.telegram.ui.ActionBar.k6.Cj;
        org.telegram.ui.ActionBar.r6.V(searchField, i18, f6Var);
        org.telegram.ui.ActionBar.r6.E(searchField, org.telegram.ui.ActionBar.k6.Gj, f6Var);
        org.telegram.ui.ActionBar.r6.m(searchField, 30, i18, f6Var);
        if (z9) {
            n7Var.r1();
            v0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27793a7, f6Var));
            this.f32071j1.setAlpha(1.0f);
            this.f32069i1.setAlpha(0.0f);
            org.telegram.ui.Cells.f2 f2Var = this.I2;
            r7 r7Var2 = this.f32071j1;
            Float valueOf = Float.valueOf(0.0f);
            f2Var.getClass();
            f2Var.a(r7Var2, valueOf);
        }
        if (this.f32078n2.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        a8Var.h = z10;
        if (z10) {
            n7Var.setVisibility(0);
            n7Var.setTranslationY(0.0f);
        } else {
            n7Var.setVisibility(8);
            n7Var.setTranslationY(org.telegram.messenger.g0.f22544q.y);
        }
        a8Var.f();
        this.f32071j1.setTitle(org.telegram.messenger.hd.M0(2131753952, null));
        org.telegram.messenger.kp kpVar2 = this.f32077m2;
        if (kpVar2 != null) {
            if (kpVar2.f23740b == org.telegram.messenger.p10.i(this.f28613a).e()) {
                this.f32071j1.setTitle(org.telegram.messenger.hd.M0(2131746642, null));
            } else {
                this.f32071j1.setTitle(org.telegram.messenger.hd.a0(null, null, 2131746643, org.telegram.messenger.m5.t(this.f32077m2.f23740b)));
            }
        } else if (ijVar != null && MediaController.B().C0 == null) {
            long B0 = org.telegram.messenger.ij.B0(ijVar.f23244k);
            if (org.telegram.messenger.m5.C(B0)) {
                TLRPC.EncryptedChat a12 = org.telegram.messenger.qp.s1(this.f28613a).a1(Integer.valueOf((int) (B0 & 4294967295L)));
                if (a12 != null && (a22 = org.telegram.messenger.qp.s1(this.f28613a).a2(Long.valueOf(a12.user_id))) != null) {
                    this.f32071j1.setTitle(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                }
            } else if (B0 == org.telegram.messenger.p10.i(this.f28613a).e()) {
                if (ijVar.Q1() == 2666000) {
                    this.f32071j1.setTitle(org.telegram.messenger.hd.M0(2131754252, null));
                } else {
                    this.f32071j1.setTitle(org.telegram.messenger.hd.M0(2131745902, null));
                }
            } else if (org.telegram.messenger.m5.E(B0)) {
                TLRPC.User a23 = org.telegram.messenger.qp.s1(this.f28613a).a2(Long.valueOf(B0));
                if (a23 != null) {
                    this.f32071j1.setTitle(org.telegram.messenger.g5.m(0, a23.first_name, a23.last_name));
                }
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.f28613a).M0(Long.valueOf(-B0));
                if (M0 != null) {
                    this.f32071j1.setTitle(M0.title);
                }
            }
        }
        if (O0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            v4.y yVar2 = new v4.y(new ei.d(this, 3));
            this.f32097x1 = yVar2;
            yVar2.h(n7Var);
        }
        ViewGroup viewGroup2 = this.f28616b;
        i7 i7Var3 = this.f32091u1;
        int i19 = 52;
        if (!O0() && !this.f32082p2) {
            i7 = 52;
        } else {
            i7 = 0;
        }
        viewGroup2.addView(i7Var3, c8.ha.e(-1, i7 + 179, 83));
        this.f28616b.addView(this.l1, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32091u1.getLayoutParams();
        if (!O0() && !this.f32082p2) {
            i10 = 52;
        } else {
            i10 = 0;
        }
        layoutParams.height = org.telegram.messenger.g0.L(i10 + 179);
        ((FrameLayout.LayoutParams) this.l1.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(179 + ((O0() || this.f32082p2) ? 0 : 0));
        this.f28616b.addView(this.f32073k1, c8.ha.c(3.0f, -1));
        this.f28616b.addView(this.f32071j1);
        i7 i7Var4 = new i7(this, activity, 1);
        this.Y1 = i7Var4;
        i7Var4.setAlpha(0.0f);
        i7Var4.setVisibility(4);
        this.f28619c.addView(i7Var4);
        l9 l9Var = new l9(activity);
        this.Z1 = l9Var;
        l9Var.setAspectFit(true);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(8.0f));
        l9Var.setScaleX(0.9f);
        l9Var.setScaleY(0.9f);
        i7Var4.addView(l9Var, c8.ha.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        f1(false);
        c1();
        if (this.n1 && a8Var.b() == 0) {
            i16 = 0;
        }
        linearLayout.setVisibility(i16);
        Z0();
    }

    public static void I0(b8 b8Var) {
        int bottom;
        boolean z9;
        int translationY;
        Integer num;
        float f10;
        float f11;
        float f12;
        View view = b8Var.f32073k1;
        r7 r7Var = b8Var.f32071j1;
        n7 n7Var = b8Var.f32079o1;
        if (n7Var.getChildCount() <= 0) {
            int paddingTop = n7Var.getPaddingTop();
            b8Var.f32084q2 = paddingTop;
            n7Var.setTopGlowOffset(paddingTop);
            b8Var.f28616b.invalidate();
            return;
        }
        boolean z10 = false;
        View childAt = n7Var.getChildAt(0);
        xi0 xi0Var = (xi0) n7Var.G(childAt);
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
        if ((z9 && r7Var.getTag() == null) || (!z9 && r7Var.getTag() != null)) {
            if (z9) {
                num = 1;
            } else {
                num = null;
            }
            r7Var.setTag(num);
            AnimatorSet animatorSet = b8Var.f32088s2;
            if (animatorSet != null) {
                animatorSet.cancel();
                b8Var.f32088s2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            b8Var.f32088s2 = animatorSet2;
            float f14 = 0.0f;
            if (b8Var.f32074k2) {
                org.telegram.ui.Cells.f2 f2Var = b8Var.I2;
                if (z9) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r7Var, f2Var, f11);
                View view2 = b8Var.f32069i1;
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
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(r7Var, property2, f10);
                if (z9) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat3, ObjectAnimator.ofFloat(view, property2, f14));
            }
            b8Var.f32088s2.setDuration(320L);
            b8Var.f32088s2.setInterpolator(xq.h);
            b8Var.f32088s2.addListener(new p7(b8Var, 2));
            b8Var.f32088s2.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) n7Var.getLayoutParams();
        int D = org.telegram.messenger.camera.q.D(11.0f, layoutParams.topMargin - org.telegram.messenger.g0.f22538m, bottom);
        if (b8Var.f32084q2 != D) {
            b8Var.f32084q2 = D;
            n7Var.setTopGlowOffset((D - layoutParams.topMargin) - org.telegram.messenger.g0.f22538m);
            b8Var.f28616b.invalidate();
        }
        int L2 = org.telegram.messenger.g0.L(13.0f);
        if (b8Var.f28645s0 + ((int) (n7Var.getTranslationY() + ((b8Var.f32084q2 - b8Var.f28645s0) - L2))) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f13 = 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - b8Var.f28645s0) / (org.telegram.messenger.g0.L(4.0f) + L2));
        }
        b8Var.D2 = f13;
        if (f13 <= 0.5f && i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27922h5, b8Var.I0)) > 0.699999988079071d) {
            z10 = true;
        }
        if (z10 != b8Var.C2) {
            b8Var.C2 = z10;
            org.telegram.messenger.g0.q3(b8Var, z10);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ij));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28259z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27965jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27947id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.We));
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final k60 J0(k60 k60Var, org.telegram.messenger.ij ijVar) {
        long j3;
        org.telegram.messenger.jp H1 = org.telegram.messenger.qp.s1(this.f28613a).H1();
        TLRPC.Document F0 = ijVar.F0();
        if (F0 != null) {
            j3 = F0.f26959id;
        } else {
            j3 = 0;
        }
        k60 J = k60Var.J();
        J.c(2131231240, org.telegram.messenger.hd.M0(2131753756, null), new org.telegram.ui.gq0(k60Var, 27), false);
        J.k();
        J.l(2131231621, org.telegram.messenger.hd.M0(2131753913, null), new z6(this, ijVar, k60Var, 6), !H1.f23577b.contains(Long.valueOf(j3)));
        J.c(2131232351, org.telegram.messenger.hd.M0(2131753910, null), new z6(this, ijVar, k60Var, 7), false);
        J.c(2131231789, org.telegram.messenger.hd.M0(2131753914, null), new z6(this, ijVar, k60Var, 8), false);
        J.k();
        J.p(12, org.telegram.messenger.g0.L(200.0f), org.telegram.messenger.hd.M0(2131753915, null));
        return J;
    }

    public final void K0() {
        org.telegram.ui.ActionBar.r0 r0Var = this.R1;
        int w02 = org.telegram.ui.ActionBar.k6.w0(((Integer) r0Var.getTag()).intValue(), this.I0);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kj, this.I0);
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27941i6, this.I0);
        if (!this.L2 || w02 != this.M2) {
            this.M2 = w02;
            r0Var.setIconColor(w02);
        }
        boolean z9 = this.L2;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.D1;
        if (!z9 || w03 != this.N2) {
            this.N2 = w03;
            r0Var2.setIconColor(w03);
        }
        if (!this.L2 || w04 != this.O2) {
            this.O2 = w04;
            org.telegram.ui.ActionBar.k6.H1(r0Var.getBackground(), w04, true);
            org.telegram.ui.ActionBar.k6.H1(r0Var2.getBackground(), w04, true);
        }
        this.L2 = true;
        this.I1.setProgressColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Jj, this.I0));
        d1();
        int i7 = org.telegram.ui.ActionBar.k6.G8;
        r0Var.H(org.telegram.ui.ActionBar.k6.w0(i7, this.I0));
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        r0Var2.O(org.telegram.ui.ActionBar.k6.w0(i10, this.I0), false);
        r0Var2.O(org.telegram.ui.ActionBar.k6.w0(i10, this.I0), true);
        r0Var2.H(org.telegram.ui.ActionBar.k6.w0(i7, this.I0));
    }

    public final void M0(org.telegram.messenger.ij ijVar) {
        ArrayList k10;
        TLRPC.TL_document tL_document;
        int i7 = org.telegram.messenger.p10.f24467s0;
        int i10 = this.f28613a;
        LaunchActivity launchActivity = this.f32096w2;
        if (i7 != i10) {
            launchActivity.O0(i10);
        }
        Bundle h = org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true);
        h.putBoolean("canSelectTopics", true);
        org.telegram.ui.ww wwVar = new org.telegram.ui.ww(h);
        if (ijVar.f1() < 0) {
            if (!(ijVar.F0() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) ijVar.F0();
            k10 = null;
        } else {
            k10 = org.telegram.messenger.k5.k(ijVar);
            tL_document = null;
        }
        wwVar.C2 = new a1.d(this, k10, tL_document, ijVar, 9);
        launchActivity.t0(wwVar);
        dismiss();
    }

    public final boolean O0() {
        org.telegram.messenger.kp kpVar = this.f32077m2;
        if (kpVar != null && kpVar.f23740b == org.telegram.messenger.p10.i(this.f28613a).e()) {
            return true;
        }
        return false;
    }

    public final void P0(int i7) {
        LaunchActivity launchActivity;
        org.telegram.messenger.ij ijVar = MediaController.B().f21292u0;
        if (ijVar != null && (launchActivity = this.f32096w2) != null) {
            if (i7 == 1) {
                M0(ijVar);
            } else if (i7 == 2) {
                V0(ijVar);
            } else if (i7 == 4) {
                int i10 = org.telegram.messenger.p10.f24467s0;
                int i11 = this.f28613a;
                if (i10 != i11) {
                    launchActivity.O0(i11);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.ij.B0(ijVar.f23244k);
                if (org.telegram.messenger.m5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.m5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.f28613a).M0(Long.valueOf(-B0));
                    if (M0 != null && M0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -M0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", ijVar.f1());
                org.telegram.messenger.qs.f(this.f28613a).k(org.telegram.messenger.qs.f25067t, new Object[0]);
                launchActivity.u0(new org.telegram.ui.an(bundle), false, false);
                dismiss();
            } else if (i7 == 5) {
                Q0(ijVar);
            } else if (i7 == 6) {
                wf.b.Z().h0(MediaController.B().z());
                this.G1.performClick();
            } else if (i7 == 7) {
                R0(ijVar, false, new w6(this, ijVar, 0), false);
            } else if (i7 == 8) {
                fi.w6 w6Var = new fi.w6(getContext(), true, null, new y6(this, 0), null);
                w6Var.Z1 = true;
                w6Var.R1 = false;
                w6Var.f13039h2.O(true);
                w6Var.show();
            }
        }
    }

    public final void Q0(org.telegram.messenger.ij ijVar) {
        String str;
        if (Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.f25200b) {
            LaunchActivity launchActivity = this.f32096w2;
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
        String str3 = ijVar.f23244k.attachPath;
        if (str3 != null && str3.length() > 0 && !a8.p0.B(str3)) {
            str3 = null;
        }
        if (str3 == null || str3.length() == 0) {
            org.telegram.messenger.w7.G(this.f28613a);
            str3 = org.telegram.messenger.w7.M(ijVar.f23244k, false, true).toString();
        }
        String str4 = str3;
        if (ijVar.F0() != null) {
            str = ijVar.F0().mime_type;
        } else {
            str = "";
        }
        String str5 = str;
        MediaController.d0(str4, this.f32096w2, 3, str2, str5, new y6(this, 1));
    }

    @Override
    public final int R() {
        i7 i7Var = this.f32091u1;
        if (i7Var == null) {
            return 0;
        }
        if (this.f32078n2.size() <= 1) {
            return i7Var.getMeasuredHeight() + this.f28645s0;
        }
        int L = org.telegram.messenger.g0.L(13.0f);
        int translationY = (int) (this.f32079o1.getTranslationY() + ((this.f32084q2 - this.f28645s0) - L));
        if (this.f28645s0 + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float L2 = org.telegram.messenger.g0.L(4.0f) + L;
            translationY -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - this.f28645s0) / L2));
        }
        return this.f28619c.getMeasuredHeight() - (translationY + org.telegram.messenger.g0.f22538m);
    }

    public final void R0(org.telegram.messenger.ij ijVar, boolean z9, Runnable runnable, boolean z10) {
        TLRPC.Document F0 = ijVar.F0();
        if (F0 == null) {
            return;
        }
        long j3 = F0.f26959id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z9;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.f26981id = tL_inputDocument;
        tL_inputDocument.f26965id = j3;
        tL_inputDocument.access_hash = F0.access_hash;
        byte[] bArr = F0.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.f28613a).sendRequest(tL_account_saveMusic, new b7(this, z10, ijVar, z9, runnable, j3, F0));
    }

    public final boolean S0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b8.S0(boolean):boolean");
    }

    public final void T0(org.telegram.ui.ActionBar.z0 z0Var, boolean z9) {
        if (z9) {
            int i7 = org.telegram.ui.ActionBar.k6.Lj;
            z0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(i7, this.I0));
            z0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(i7, this.I0));
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        z0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, this.I0));
        z0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(i10, this.I0));
    }

    @Override
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        s6 s6Var = new s6(this, 0);
        int i7 = org.telegram.ui.ActionBar.k6.Cj;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f32071j1, 1024, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        int i10 = org.telegram.ui.ActionBar.k6.Gj;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f32071j1, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f28616b, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f28643r0}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27922h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.I1, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Jj));
        int i11 = org.telegram.ui.ActionBar.k6.f28204w7;
        org.telegram.ui.ActionBar.r0 r0Var = this.L1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28223x7));
        int i12 = org.telegram.ui.ActionBar.k6.Kj;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.R1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Lj));
        int i13 = org.telegram.ui.ActionBar.k6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, i13));
        int i14 = org.telegram.ui.ActionBar.k6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, i14));
        org.telegram.ui.ActionBar.r0 r0Var3 = this.D1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, i14));
        k7 k7Var = this.A1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(k7Var, new zg0[]{k7Var.getAnimatedDrawable()}, "Triangle 3", i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(k7Var, new zg0[]{k7Var.getAnimatedDrawable()}, "Triangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(k7Var, new zg0[]{k7Var.getAnimatedDrawable()}, "Rectangle 4", i12));
        int i15 = org.telegram.ui.ActionBar.k6.f27941i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.A1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.W1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
        l7 l7Var = this.B1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(l7Var, new zg0[]{l7Var.getAnimatedDrawable()}, "Triangle 3", i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(l7Var, new zg0[]{l7Var.getAnimatedDrawable()}, "Triangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(l7Var, new zg0[]{l7Var.getAnimatedDrawable()}, "Rectangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.B1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
        int i16 = org.telegram.ui.ActionBar.k6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f32087s1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f32089t1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.I1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27832c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.I1, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27923h6));
        t7 t7Var = this.f32101z1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(t7Var.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(t7Var.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        t7 t7Var2 = this.C1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(t7Var2.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(t7Var2.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f28616b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.wj));
        return arrayList;
    }

    public final void U0(final boolean z9) {
        float f10;
        float f11;
        float f12;
        float f13;
        boolean O0 = O0();
        fi.d dVar = this.f32095w1;
        fi.d dVar2 = this.f32093v1;
        if (!O0 && !this.f32082p2) {
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
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).withEndAction(new Runnable(this) {
                public final b8 f40211b;

                {
                    this.f40211b = this;
                }

                @Override
                public final void run() {
                    int i7;
                    int i10;
                    switch (r3) {
                        case 0:
                            fi.d dVar3 = this.f40211b.f32093v1;
                            if (z9) {
                                i7 = 8;
                            } else {
                                i7 = 0;
                            }
                            dVar3.setVisibility(i7);
                            return;
                        default:
                            fi.d dVar4 = this.f40211b.f32095w1;
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
            scaleX2.scaleY(f15).setDuration(420L).setInterpolator(xqVar).withEndAction(new Runnable(this) {
                public final b8 f40211b;

                {
                    this.f40211b = this;
                }

                @Override
                public final void run() {
                    int i7;
                    int i10;
                    switch (r3) {
                        case 0:
                            fi.d dVar3 = this.f40211b.f32093v1;
                            if (z9) {
                                i7 = 8;
                            } else {
                                i7 = 0;
                            }
                            dVar3.setVisibility(i7);
                            return;
                        default:
                            fi.d dVar4 = this.f40211b.f32095w1;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b8.V0(org.telegram.messenger.ij):void");
    }

    public final void W0(boolean z9, boolean z10) {
        l9 l9Var = this.Z1;
        i7 i7Var = this.Y1;
        if (z9) {
            if (i7Var.getVisibility() != 0 && !this.f32064c2) {
                i7Var.setTag(1);
                s7 s7Var = this.f32099y1;
                l9Var.setImageBitmap(s7Var.f37926a[s7Var.f37927b].getImageReceiver().n());
                this.f32064c2 = true;
                jk0.d(new u6(this, 1));
                i7Var.setVisibility(0);
                i7Var.animate().alpha(1.0f).setDuration(180L).setListener(new p7(this, 0)).start();
                l9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            }
        } else if (i7Var.getVisibility() != 0) {
        } else {
            i7Var.setTag(null);
            if (z10) {
                this.f32064c2 = true;
                i7Var.animate().alpha(0.0f).setDuration(180L).setListener(new p7(this, 1)).start();
                l9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
                return;
            }
            i7Var.setAlpha(0.0f);
            i7Var.setVisibility(4);
            l9Var.setImageBitmap(null);
            l9Var.setScaleX(0.9f);
            l9Var.setScaleY(0.9f);
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
        int top = this.f28616b.getTop();
        Drawable drawable = this.f28643r0;
        if (drawable != null) {
            i7 = drawable.getBounds().top;
        } else {
            i7 = 0;
        }
        if (f11 >= top + i7 && f10 >= this.f28616b.getLeft() && f10 <= this.f28616b.getRight()) {
            return false;
        }
        return true;
    }

    public final void X0(org.telegram.ui.Cells.w wVar, org.telegram.messenger.ij ijVar) {
        k60 G = k60.G(this.f28619c, this.I0, wVar, true);
        int i7 = 3;
        boolean z9 = false;
        if (O0()) {
            G.l(2131232165, org.telegram.messenger.hd.M0(2131750588, null), new z6(this, G, ijVar, 0), !this.f32082p2);
            G.l(2131232365, org.telegram.messenger.hd.M0(2131745460, null), new z6(this, G, ijVar, 1), !this.f32082p2);
            G.c(2131232108, org.telegram.messenger.hd.M0(2131751599, null), new z6(this, ijVar, G, 2), true);
        } else {
            G.l(2131232390, org.telegram.messenger.hd.M0(2131753916, null), new hi.h2(G, J0(G, ijVar), 6), !this.f32082p2);
            if (!this.f32082p2 && G.y() != null) {
                G.y().setRightIcon(2131232059);
            }
            G.k();
            G.l(2131232165, org.telegram.messenger.hd.M0(2131750588, null), new z6(this, G, ijVar, 3), !this.f32082p2);
            G.l(2131232363, org.telegram.messenger.hd.M0(2131745460, null), new z6(this, G, ijVar, 4), !this.f32082p2);
            if (ijVar.f1() > 0) {
                z9 = true;
            }
            G.l(2131232420, org.telegram.messenger.hd.M0(2131745343, null), new w6(this, ijVar, 1), z9);
        }
        if (!org.telegram.messenger.hd.f22878a0) {
            i7 = 5;
        }
        G.V(i7);
        G.Z();
    }

    public final void Y0() {
        if (this.f32098x2 == 1) {
            this.A2 = System.currentTimeMillis();
            this.f32100y2 = MediaController.B().f21292u0.f23204b0;
            m.f3 f3Var = this.E2;
            org.telegram.messenger.g0.r(f3Var);
            org.telegram.messenger.g0.h3(f3Var);
        }
    }

    public final void Z0() {
        int i7;
        LinearLayout linearLayout = this.f32085r1;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        if (this.f32091u1.getVisibility() == 0) {
            i7 = org.telegram.messenger.g0.L(150.0f);
        } else {
            i7 = -org.telegram.messenger.g0.L(30.0f);
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.f28616b.getMeasuredHeight()) - i7) / 2);
    }

    public final void a1(boolean z9) {
        if (this.L1 != null) {
            float f10 = MediaController.B().f21282q0;
            this.M1.b(z9, f10);
            this.N1.e(z9, f10);
            updateColors();
            boolean z10 = this.O1;
            int i7 = 0;
            this.O1 = false;
            while (true) {
                org.telegram.ui.ActionBar.z0[] z0VarArr = this.P1;
                if (i7 < z0VarArr.length) {
                    if (!z10 && L0(f10, Q2[i7])) {
                        org.telegram.ui.ActionBar.z0 z0Var = z0VarArr[i7];
                        int i10 = org.telegram.ui.ActionBar.k6.Ei;
                        z0Var.d(org.telegram.ui.ActionBar.k6.w0(i10, this.I0), org.telegram.ui.ActionBar.k6.w0(i10, this.I0));
                    } else {
                        org.telegram.ui.ActionBar.z0 z0Var2 = z0VarArr[i7];
                        int i11 = org.telegram.ui.ActionBar.k6.E8;
                        z0Var2.d(org.telegram.ui.ActionBar.k6.w0(i11, this.I0), org.telegram.ui.ActionBar.k6.w0(i11, this.I0));
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b1(org.telegram.messenger.ij r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b8.b1(org.telegram.messenger.ij, boolean):void");
    }

    public final void c1() {
        int i7 = org.telegram.messenger.iz.S0;
        org.telegram.ui.ActionBar.r0 r0Var = this.R1;
        if (i7 != 0 && i7 != 1) {
            if (i7 == 2) {
                r0Var.setIcon(2131232556);
                int i10 = org.telegram.ui.ActionBar.k6.Lj;
                r0Var.setTag(Integer.valueOf(i10));
                r0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(i10, this.I0));
                org.telegram.ui.ActionBar.k6.H1(r0Var.getBackground(), org.telegram.ui.ActionBar.k6.w0(i10, this.I0) & 436207615, true);
                r0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754785, null));
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
            int i11 = org.telegram.ui.ActionBar.k6.Kj;
            r0Var.setTag(Integer.valueOf(i11));
            r0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(i11, this.I0));
            org.telegram.ui.ActionBar.k6.H1(r0Var.getBackground(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27941i6, this.I0), true);
            r0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754786, null));
            return;
        }
        int i12 = org.telegram.ui.ActionBar.k6.Lj;
        r0Var.setTag(Integer.valueOf(i12));
        r0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(i12, this.I0));
        org.telegram.ui.ActionBar.k6.H1(r0Var.getBackground(), 436207615 & org.telegram.ui.ActionBar.k6.w0(i12, this.I0), true);
        if (i7 == 0) {
            if (org.telegram.messenger.iz.N0) {
                r0Var.setContentDescription(org.telegram.messenger.hd.M0(2131745323, null));
                return;
            } else {
                r0Var.setContentDescription(org.telegram.messenger.hd.M0(2131746028, null));
                return;
            }
        }
        r0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754787, null));
    }

    public final void d1() {
        boolean z9;
        T0(this.U1, org.telegram.messenger.iz.N0);
        T0(this.V1, org.telegram.messenger.iz.O0);
        boolean z10 = false;
        if (org.telegram.messenger.iz.S0 == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        T0(this.T1, z9);
        if (org.telegram.messenger.iz.S0 == 2) {
            z10 = true;
        }
        T0(this.S1, z10);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z9;
        org.telegram.ui.Cells.w wVar;
        org.telegram.messenger.ij messageObject;
        org.telegram.ui.Cells.w wVar2;
        org.telegram.messenger.ij messageObject2;
        org.telegram.messenger.ij ijVar;
        int i11 = org.telegram.messenger.qs.f25001h2;
        int i12 = org.telegram.messenger.qs.f24989f2;
        int i13 = org.telegram.messenger.qs.f24995g2;
        n7 n7Var = this.f32079o1;
        int i14 = 0;
        if (i7 != i11 && i7 != i13 && i7 != i12) {
            if (i7 == org.telegram.messenger.qs.f24983e2) {
                org.telegram.messenger.ij ijVar2 = MediaController.B().f21292u0;
                if (ijVar2 != null && ijVar2.J3()) {
                    b1(ijVar2, false);
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.qs.J4) {
                a1(true);
                return;
            } else {
                int i15 = org.telegram.messenger.qs.K0;
                a8 a8Var = this.f32083q1;
                if (i7 == i15) {
                    this.f32077m2 = MediaController.B().Q0;
                    this.f32078n2 = MediaController.B().R0;
                    a8Var.f();
                    return;
                } else if (i7 == org.telegram.messenger.qs.L0) {
                    this.f32077m2 = MediaController.B().Q0;
                    this.f32078n2 = MediaController.B().R0;
                    a8Var.f();
                    if (org.telegram.messenger.iz.O0) {
                        n7Var.C0();
                        int intValue = ((Integer) objArr[0]).intValue();
                        v4.b0 b0Var = this.f32081p1;
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
                    if (((String) objArr[0]).equals(this.f32086r2)) {
                        f1(false);
                        this.f32067g2 = true;
                        return;
                    }
                    return;
                } else if (i7 == org.telegram.messenger.qs.X1) {
                    if (((String) objArr[0]).equals(this.f32086r2) && (ijVar = MediaController.B().f21292u0) != null) {
                        Long l10 = (Long) objArr[1];
                        Long l11 = (Long) objArr[2];
                        float f10 = 1.0f;
                        if (!this.f32067g2) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f32066f2) >= 500) {
                                if (MediaController.B().f21274l0) {
                                    f10 = org.telegram.messenger.w7.G(this.f28613a).t(this.f32086r2, ijVar.f23204b0);
                                }
                                this.f32066f2 = elapsedRealtime;
                            } else {
                                f10 = -1.0f;
                            }
                        }
                        if (f10 != -1.0f) {
                            r1.g gVar = this.f32065e2;
                            gVar.f54174m.f54182i = f10 * 1000.0f;
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
                int childCount = n7Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = n7Var.getChildAt(i16);
                    if ((childAt instanceof org.telegram.ui.Cells.w) && (messageObject2 = (wVar2 = (org.telegram.ui.Cells.w) childAt).getMessageObject()) != null && (org.telegram.messenger.ij.S4(messageObject2.f23244k) || messageObject2.J3())) {
                        wVar2.b(false, true);
                    }
                }
            } else {
                return;
            }
        } else {
            int childCount2 = n7Var.getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = n7Var.getChildAt(i17);
                if ((childAt2 instanceof org.telegram.ui.Cells.w) && (messageObject = (wVar = (org.telegram.ui.Cells.w) childAt2).getMessageObject()) != null && (org.telegram.messenger.ij.S4(messageObject.f23244k) || messageObject.J3())) {
                    wVar.b(false, true);
                }
            }
            if (i7 == i13 && MediaController.B().f21292u0 != null) {
                if (MediaController.B().H()) {
                    Y0();
                } else if (this.f32098x2 == 1 && this.f32100y2 != -1.0f) {
                    m.f3 f3Var = this.E2;
                    org.telegram.messenger.g0.r(f3Var);
                    this.B2 = 0L;
                    f3Var.run();
                    this.f32100y2 = -1.0f;
                }
            }
        }
        org.telegram.ui.uq uqVar = this.E1;
        if (uqVar != null) {
            uqVar.a(d1.f.u());
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.qs.f(this.f28613a).n(this, org.telegram.messenger.qs.f24989f2);
        org.telegram.messenger.qs.f(this.f28613a).n(this, org.telegram.messenger.qs.f24995g2);
        org.telegram.messenger.qs.f(this.f28613a).n(this, org.telegram.messenger.qs.f25001h2);
        org.telegram.messenger.qs.f(this.f28613a).n(this, org.telegram.messenger.qs.f24983e2);
        org.telegram.messenger.qs.f(this.f28613a).n(this, org.telegram.messenger.qs.Y1);
        org.telegram.messenger.qs.f(this.f28613a).n(this, org.telegram.messenger.qs.X1);
        org.telegram.messenger.qs.f(this.f28613a).n(this, org.telegram.messenger.qs.K0);
        org.telegram.messenger.qs.f(this.f28613a).n(this, org.telegram.messenger.qs.L0);
        org.telegram.messenger.qs.f(this.f28613a).n(this, org.telegram.messenger.qs.U3);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.J4);
        org.telegram.messenger.z5.q(this.f28613a).v(this);
        if (P2 == this) {
            P2 = null;
        }
    }

    public final void e1() {
        int i7;
        int w02;
        int i10;
        int i11;
        if (this.f32074k2) {
            i7 = org.telegram.ui.ActionBar.k6.f27793a7;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.f27922h5;
        }
        int w03 = org.telegram.ui.ActionBar.k6.w0(i7, this.I0);
        if (w03 != this.K2) {
            this.K2 = w03;
            v0(w03);
        }
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kj, this.I0);
        k7 k7Var = this.A1;
        if (k7Var != null) {
            k7Var.h(w04, "Triangle 3");
            k7Var.h(w04, "Triangle 4");
            k7Var.h(w04, "Rectangle 4");
        }
        l7 l7Var = this.B1;
        if (l7Var != null) {
            l7Var.h(w04, "Triangle 3");
            l7Var.h(w04, "Triangle 4");
            l7Var.h(w04, "Rectangle 4");
        }
        u7 u7Var = this.J1;
        if (u7Var != null) {
            u7Var.setOuterColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Jj, this.I0));
        }
        boolean z9 = false;
        org.telegram.ui.ActionBar.r0 r0Var = this.L1;
        if (r0Var != null) {
            float f10 = MediaController.B().f21282q0;
            if (!L0(f10, 1.0f)) {
                i10 = org.telegram.ui.ActionBar.k6.Ei;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f28223x7;
            }
            int w05 = org.telegram.ui.ActionBar.k6.w0(i10, this.I0);
            du0 du0Var = this.M1;
            if (du0Var != null) {
                du0Var.f33074a.u(w05);
                Paint paint = du0Var.f33075b;
                if (paint != null) {
                    paint.setColor(w05);
                }
            }
            org.telegram.ui.ActionBar.k6.H1(r0Var.getBackground(), w05 & 436207615, true);
            int i12 = 0;
            while (true) {
                org.telegram.ui.ActionBar.z0[] z0VarArr = this.P1;
                if (i12 >= z0VarArr.length) {
                    break;
                }
                if (z0VarArr[i12] != null) {
                    if (L0(f10, Q2[i12])) {
                        i11 = org.telegram.ui.ActionBar.k6.Ei;
                    } else {
                        i11 = org.telegram.ui.ActionBar.k6.E8;
                    }
                    int w06 = org.telegram.ui.ActionBar.k6.w0(i11, this.I0);
                    z0VarArr[i12].d(w06, w06);
                }
                i12++;
            }
        }
        org.telegram.ui.ActionBar.z0 z0Var = this.F1;
        if (z0Var != null) {
            m7 m7Var = this.G1;
            if (m7Var != null && m7Var.b()) {
                z9 = true;
            }
            int w07 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.I0);
            int w08 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.I0);
            int i13 = org.telegram.ui.ActionBar.k6.Ci;
            z0Var.e(w07, w08, org.telegram.ui.ActionBar.k6.w0(i13, this.I0), z9);
            org.telegram.ui.ActionBar.z0 z0Var2 = this.F1;
            if (m7Var != null && m7Var.b()) {
                w02 = org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i13, this.I0));
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27941i6, this.I0);
            }
            z0Var2.setSelectorColor(w02);
        }
    }

    public final void f1(boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b8.f1(boolean):void");
    }

    @Override
    public final int getObserverTag() {
        return this.f32094v2;
    }

    @Override
    public final void i(long j3, long j10) {
        this.I1.a(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
    }

    @Override
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        i7 i7Var = this.Y1;
        if (view != i7Var) {
            return false;
        }
        i7Var.layout(0, 0, i7Var.getMeasuredWidth(), i7Var.getMeasuredHeight());
        return true;
    }

    @Override
    public final boolean l0(View view, int i7, int i10) {
        i7 i7Var = this.Y1;
        if (view == i7Var) {
            org.telegram.ui.ActionBar.l2 l2Var = this.f28619c;
            i7Var.measure(View.MeasureSpec.makeMeasureSpec(l2Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(l2Var.getMeasuredHeight(), 1073741824));
            return true;
        }
        return false;
    }

    @Override
    public final void onBackPressed() {
        r7 r7Var = this.f32071j1;
        if (r7Var != null && r7Var.f27677n0) {
            r7Var.l(true);
        } else if (this.Y1.getTag() != null) {
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
            if (this.f32063b2 != null && this.R1 != null && this.D1 != null && this.I1 != null) {
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
            float f10 = this.D2;
            if (f10 >= 0.0f) {
                if (f10 <= 0.5f && i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27922h5, this.I0)) > 0.699999988079071d) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 != this.C2) {
                    this.C2 = z9;
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
        P2 = this;
    }

    public final void updateColors() {
        int w02;
        int i7;
        boolean z9 = true;
        org.telegram.ui.ActionBar.r0 r0Var = this.L1;
        if (r0Var != null) {
            if (!L0(MediaController.B().f21282q0, 1.0f)) {
                i7 = org.telegram.ui.ActionBar.k6.Ei;
            } else {
                i7 = org.telegram.ui.ActionBar.k6.f28223x7;
            }
            int w03 = org.telegram.ui.ActionBar.k6.w0(i7, this.I0);
            du0 du0Var = this.M1;
            if (du0Var != null) {
                du0Var.f33074a.u(w03);
                Paint paint = du0Var.f33075b;
                if (paint != null) {
                    paint.setColor(w03);
                }
            }
            r0Var.setBackground(org.telegram.ui.ActionBar.k6.h0(w03 & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        }
        org.telegram.ui.ActionBar.z0 z0Var = this.F1;
        if (z0Var != null) {
            m7 m7Var = this.G1;
            z9 = (m7Var == null || !m7Var.b()) ? false : false;
            int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.I0);
            int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.I0);
            int i10 = org.telegram.ui.ActionBar.k6.Ci;
            z0Var.e(w04, w05, org.telegram.ui.ActionBar.k6.w0(i10, this.I0), z9);
            org.telegram.ui.ActionBar.z0 z0Var2 = this.F1;
            if (m7Var != null && m7Var.b()) {
                w02 = org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i10, this.I0));
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27941i6, this.I0);
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
