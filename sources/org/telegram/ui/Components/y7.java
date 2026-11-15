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
public final class y7 extends org.telegram.ui.ActionBar.u2 implements org.telegram.messenger.is, org.telegram.messenger.x5 {
    public static y7 T2;
    public static final float[] U2 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final hi.d A1;
    public final LaunchActivity A2;
    public final v4.y B1;
    public int B2;
    public final p7 C1;
    public float C2;
    public final q7 D1;
    public int D2;
    public final h7 E1;
    public long E2;
    public final i7 F1;
    public long F2;
    public final q7 G1;
    public boolean G2;
    public final org.telegram.ui.ActionBar.q0 H1;
    public float H2;
    public final org.telegram.ui.wq I1;
    public final j6.o I2;
    public org.telegram.ui.ActionBar.z0 J1;
    public l7 J2;
    public final j7 K1;
    public long K2;
    public final boolean L1;
    public float L2;
    public final k70 M1;
    public final org.telegram.ui.Cells.f2 M2;
    public final r7 N1;
    public ValueAnimator N2;
    public final org.telegram.ui.ActionBar.j5 O1;
    public int O2;
    public final org.telegram.ui.ActionBar.q0 P1;
    public boolean P2;
    public final eu0 Q1;
    public int Q2;
    public final org.telegram.ui.ActionBar.v0 R1;
    public int R2;
    public boolean S1;
    public int S2;
    public final org.telegram.ui.ActionBar.z0[] T1;
    public final TextView U1;
    public final org.telegram.ui.ActionBar.q0 V1;
    public final org.telegram.ui.ActionBar.z0 W1;
    public final org.telegram.ui.ActionBar.z0 X1;
    public final org.telegram.ui.ActionBar.z0 Y1;
    public final org.telegram.ui.ActionBar.z0 Z1;
    public final ImageView f41886a2;
    public final ke0 f41887b2;
    public final f7 f41888c2;
    public final i9 d2;
    public final org.telegram.ui.ActionBar.q0 f41889e2;
    public final org.telegram.ui.ActionBar.q0 f41890f2;
    public boolean f41891g2;
    public final View[] f41892h2;
    public final r1.g f41893i2;
    public long f41894j2;
    public boolean f41895k2;
    public boolean f41896l2;
    public final View f41897m1;
    public int f41898m2;
    public final o7 n1;
    public int f41899n2;
    public final View f41900o1;
    public final boolean f41901o2;
    public final View f41902p1;
    public final boolean f41903p2;
    public boolean f41904q1;
    public org.telegram.messenger.hp f41905q2;
    public boolean f41906r1;
    public ArrayList f41907r2;
    public final k7 f41908s1;
    public org.telegram.messenger.gj f41909s2;
    public final v4.b0 f41910t1;
    public boolean f41911t2;
    public final x7 f41912u1;
    public int f41913u2;
    public final LinearLayout f41914v1;
    public String f41915v2;
    public final TextView f41916w1;
    public AnimatorSet f41917w2;
    public final TextView f41918x1;
    public int f41919x2;
    public final f7 f41920y1;
    public int f41921y2;
    public final hi.d f41922z1;
    public final int f41923z2;

    public y7(Activity activity, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, (Context) activity, e6Var, true);
        boolean z10;
        org.telegram.ui.ActionBar.y yVar;
        boolean z11;
        TLRPC.User a22;
        int i7;
        int i10;
        org.telegram.ui.ActionBar.z0[] z0VarArr = new org.telegram.ui.ActionBar.z0[6];
        this.T1 = z0VarArr;
        View[] viewArr = new View[5];
        this.f41892h2 = viewArr;
        this.f41896l2 = true;
        this.f41898m2 = -1;
        this.f41913u2 = Integer.MAX_VALUE;
        this.C2 = -1.0f;
        this.H2 = -1.0f;
        this.I2 = new j6.o(this, 28);
        this.M2 = new org.telegram.ui.Cells.f2(this);
        this.f29712r = true;
        O();
        org.telegram.messenger.gj gjVar = MediaController.B().f22377v0;
        if (gjVar != null) {
            this.f29679a = gjVar.K1;
        } else {
            this.f29679a = org.telegram.messenger.m10.f24940t0;
        }
        this.A2 = (LaunchActivity) activity;
        this.f41923z2 = org.telegram.messenger.z5.q(this.f29679a).k();
        org.telegram.messenger.ns.f(this.f29679a).c(this, org.telegram.messenger.ns.f25495f2);
        org.telegram.messenger.ns.f(this.f29679a).c(this, org.telegram.messenger.ns.f25501g2);
        org.telegram.messenger.ns.f(this.f29679a).c(this, org.telegram.messenger.ns.f25507h2);
        org.telegram.messenger.ns.f(this.f29679a).c(this, org.telegram.messenger.ns.f25489e2);
        org.telegram.messenger.ns.f(this.f29679a).c(this, org.telegram.messenger.ns.Y1);
        org.telegram.messenger.ns.f(this.f29679a).c(this, org.telegram.messenger.ns.X1);
        org.telegram.messenger.ns.f(this.f29679a).c(this, org.telegram.messenger.ns.K0);
        org.telegram.messenger.ns.f(this.f29679a).c(this, org.telegram.messenger.ns.L0);
        org.telegram.messenger.ns.f(this.f29679a).c(this, org.telegram.messenger.ns.U3);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.J4);
        n7 n7Var = new n7(this, activity);
        this.f29682b = n7Var;
        n7Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f29682b;
        int i11 = this.f29717u0;
        viewGroup.setPadding(i11, 0, i11, 0);
        o7 o7Var = new o7(this, activity, e6Var, 0);
        this.n1 = o7Var;
        o7Var.setBackgroundColor(0);
        o7Var.setBackButtonImage(2131231240);
        int i12 = org.telegram.ui.ActionBar.j6.Fj;
        org.telegram.ui.ActionBar.q6.l(o7Var, 1, i12, e6Var);
        org.telegram.ui.ActionBar.q6.l(o7Var, 3, org.telegram.ui.ActionBar.j6.Ej, e6Var);
        org.telegram.ui.ActionBar.q6.l(o7Var, 5, i12, e6Var);
        org.telegram.ui.ActionBar.q6.l(o7Var, 6, org.telegram.ui.ActionBar.j6.Gj, e6Var);
        o7Var.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.y s5 = o7Var.s();
        s5.setLayoutParams(c8.ja.e(-1, -1, 119));
        View view = new View(activity);
        this.f41897m1 = view;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28922h5, view, e6Var);
        o7Var.addView(view, 0, c8.ja.e(-1, -1, 119));
        view.setAlpha(0.0f);
        o7Var.setAlpha(0.0f);
        o7Var.setActionBarMenuOnItemClick(new org.telegram.ui.p9(this, 11));
        View view2 = new View(activity);
        this.f41900o1 = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(2131231237);
        View view3 = new View(activity);
        this.f41902p1 = view3;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.V5, view3, e6Var);
        f7 f7Var = new f7(this, activity, 2);
        this.f41920y1 = f7Var;
        p7 p7Var = new p7(this, activity);
        this.C1 = p7Var;
        f7Var.addView(p7Var, c8.ja.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        q7 q7Var = new q7(this, activity, activity, 0);
        this.D1 = q7Var;
        f7Var.addView(q7Var, c8.ja.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        q7 q7Var2 = new q7(this, activity, activity, 1);
        this.G1 = q7Var2;
        f7Var.addView(q7Var2, c8.ja.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        r7 r7Var = new r7(this, activity, e6Var);
        this.N1 = r7Var;
        r7Var.setLineWidth(4);
        r7Var.setDelegate(new hi.l0(this, 29));
        r7Var.setReportChanges(true);
        f7Var.addView(r7Var, c8.ja.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        r1.g gVar = new r1.g(new r1.f(0.0f));
        r1.h hVar = new r1.h();
        hVar.b(750.0f);
        hVar.a(1.0f);
        gVar.f55748m = hVar;
        gVar.b(new c7(this, 0));
        this.f41893i2 = gVar;
        k70 k70Var = new k70(activity);
        this.M1 = k70Var;
        k70Var.setVisibility(4);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.Kj, k70Var, e6Var);
        k70Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Mj, this.J0));
        f7Var.addView(k70Var, c8.ja.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(activity);
        this.O1 = j5Var;
        j5Var.setTextSize(12);
        j5Var.l("0:00", false);
        int i13 = org.telegram.ui.ActionBar.j6.Jj;
        org.telegram.ui.ActionBar.q6.X(j5Var, i13, e6Var);
        j5Var.setImportantForAccessibility(2);
        f7Var.addView(j5Var, c8.ja.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.U1 = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.q6.U(textView, i13, e6Var);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        f7Var.addView(textView, c8.ja.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(activity, null, 0, org.telegram.ui.ActionBar.j6.w0(i13, this.J0), false, e6Var);
        this.P1 = q0Var;
        q0Var.setLongClickEnabled(false);
        q0Var.setShowSubmenuByMove(false);
        q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(224.0f));
        q0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754805, null));
        q0Var.setDelegate(new r6(this, 0));
        eu0 eu0Var = new eu0();
        this.Q1 = eu0Var;
        q0Var.setIcon(eu0Var);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(getContext(), e6Var);
        this.R1 = v0Var;
        v0Var.setRoundRadiusDp(6.0f);
        v0Var.setDrawShadow(true);
        v0Var.setOnValueChange(new s6(this, 0));
        z0VarArr[0] = q0Var.e(0, 2131232374, org.telegram.messenger.hd.M0(2131745266, null));
        z0VarArr[1] = q0Var.e(1, 2131232373, org.telegram.messenger.hd.M0(2131745267, null));
        z0VarArr[2] = q0Var.e(2, 2131232372, org.telegram.messenger.hd.M0(2131745268, null));
        z0VarArr[3] = q0Var.e(3, 2131232371, org.telegram.messenger.hd.M0(2131745270, null));
        z0VarArr[4] = q0Var.e(4, 2131232376, org.telegram.messenger.hd.M0(2131745264, null));
        z0VarArr[5] = q0Var.e(5, 2131232375, org.telegram.messenger.hd.M0(2131745265, null));
        if (org.telegram.messenger.g0.f23610p >= 3.0f) {
            q0Var.setPadding(0, 1, 0, 0);
        }
        q0Var.setAdditionalXOffset(org.telegram.messenger.g0.L(8.0f));
        q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(400.0f));
        q0Var.setShowedFromBottom(true);
        f7Var.addView(q0Var, c8.ja.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        q0Var.setOnClickListener(new n2(2, this, fArr));
        q0Var.setOnLongClickListener(new fi.b2(2, this, e6Var));
        a1(false);
        f7 f7Var2 = new f7(this, activity, 0);
        f7Var.addView(f7Var2, c8.ja.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(activity, null, 0, 0, false, e6Var);
        this.V1 = q0Var2;
        viewArr[0] = q0Var2;
        q0Var2.setLongClickEnabled(false);
        q0Var2.setShowSubmenuByMove(false);
        q0Var2.setAdditionalYOffset(-org.telegram.messenger.g0.L(166.0f));
        int i14 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i14);
        q0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(q0Var2, h02, null, M, e6Var);
        f7Var2.addView(q0Var2, c8.ja.e(48, 48, 51));
        q0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final y7 f39555b;

            {
                this.f39555b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i15 = r2;
                y7 y7Var = this.f39555b;
                switch (i15) {
                    case 0:
                        y7Var.d1();
                        y7Var.V1.V(null, null);
                        return;
                    default:
                        j7 j7Var = y7Var.K1;
                        org.telegram.messenger.gj gjVar2 = MediaController.B().f22377v0;
                        if (gjVar2 != null) {
                            boolean z12 = true;
                            m60 G = m60.G(y7Var.f29685c, y7Var.J0, view4, true);
                            m60 J0 = y7Var.J0(G, gjVar2);
                            if (!y7Var.O0()) {
                                G.l(2131232391, org.telegram.messenger.hd.M0(2131753916, null), new bi.n3(G, J0, 8), !y7Var.f41911t2);
                                if (!y7Var.f41911t2 && G.y() != null) {
                                    G.y().setRightIcon(2131232060);
                                }
                                G.k();
                            }
                            G.l(2131232166, org.telegram.messenger.hd.M0(2131750587, null), new y6(y7Var, G, 0), !y7Var.f41911t2);
                            G.l(2131232366, org.telegram.messenger.hd.M0(2131745459, null), new y6(y7Var, G, 1), !y7Var.f41911t2);
                            if (gjVar2.e1() <= 0) {
                                z12 = false;
                            }
                            G.l(2131232225, org.telegram.messenger.hd.M0(2131745342, null), new y6(y7Var, G, 2), z12);
                            if (y7Var.L1) {
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, G.f37086e, G.d, false, false);
                                G.d(z0Var);
                                y7Var.J1 = z0Var;
                                z0Var.j(org.telegram.messenger.hd.M0(2131743589, null), 2131231912, null);
                                y7Var.J1.setOnClickListener(new n2(3, y7Var, G));
                                org.telegram.messenger.g0.E2(j7Var);
                                y7Var.J1.addView(j7Var, 0, c8.ja.c(-1.0f, -1));
                                y7Var.updateColors();
                            }
                            G.m(2131232109, new y6(y7Var, G, 3), org.telegram.messenger.hd.M0(2131746645, null), y7Var.O0(), true);
                            G.X(org.telegram.messenger.g0.L(64.0f));
                            G.Z();
                            return;
                        }
                        return;
                }
            }
        });
        this.W1 = q0Var2.e(3, 2131232557, org.telegram.messenger.hd.M0(2131746273, null));
        this.X1 = q0Var2.e(4, 2131232556, org.telegram.messenger.hd.M0(2131746276, null));
        q0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.g0.L(4.0f);
        this.Y1 = q0Var2.e(2, 2131232558, org.telegram.messenger.hd.M0(2131745322, null));
        q0Var2.a(-1).getLayoutParams().height = org.telegram.messenger.g0.L(4.0f);
        this.Z1 = q0Var2.e(1, 2131232552, org.telegram.messenger.hd.M0(2131746027, null));
        q0Var2.setShowedFromBottom(true);
        q0Var2.setDelegate(new r6(this, 1));
        int i15 = org.telegram.ui.ActionBar.j6.Nj;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i15, this.J0);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        h7 h7Var = new h7(this, activity, scaledTouchSlop);
        this.E1 = h7Var;
        viewArr[1] = h7Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        h7Var.setScaleType(scaleType);
        h7Var.f(2131624138, 20, 20, null);
        h7Var.h(w02, "Triangle 3");
        h7Var.h(w02, "Triangle 4");
        h7Var.h(w02, "Rectangle 4");
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(22.0f));
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i14);
        h7Var.setBackground(h03);
        org.telegram.ui.ActionBar.q6.j(h7Var, h03, null, M2, e6Var);
        f7Var2.addView(h7Var, c8.ja.e(48, 48, 51));
        h7Var.setContentDescription(org.telegram.messenger.hd.M0(2131754800, null));
        ImageView imageView = new ImageView(activity);
        this.f41886a2 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        ke0 ke0Var = new ke0(28);
        this.f41887b2 = ke0Var;
        imageView.setImageDrawable(ke0Var);
        ke0Var.a(!MediaController.B().H(), false);
        org.telegram.ui.ActionBar.q6.s(imageView, i15, e6Var, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(24.0f));
        org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i14);
        imageView.setBackground(h04);
        org.telegram.ui.ActionBar.q6.j(imageView, h04, null, M3, e6Var);
        f7Var2.addView(imageView, c8.ja.e(48, 48, 51));
        imageView.setOnClickListener(new bi.o(12));
        i7 i7Var = new i7(this, activity, scaledTouchSlop);
        this.F1 = i7Var;
        viewArr[3] = i7Var;
        i7Var.setScaleType(scaleType);
        i7Var.f(2131624138, 20, 20, null);
        i7Var.h(w02, "Triangle 3");
        i7Var.h(w02, "Triangle 4");
        i7Var.h(w02, "Rectangle 4");
        i7Var.setRotation(180.0f);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(22.0f));
        org.telegram.ui.ActionBar.m6 M4 = org.telegram.ui.ActionBar.q6.M(i14);
        i7Var.setBackground(h05);
        org.telegram.ui.ActionBar.q6.j(i7Var, h05, null, M4, e6Var);
        f7Var2.addView(i7Var, c8.ja.e(48, 48, 51));
        i7Var.setContentDescription(org.telegram.messenger.hd.M0(2131748250, null));
        org.telegram.ui.ActionBar.q0 q0Var3 = new org.telegram.ui.ActionBar.q0(activity, null, 0, w02, false, e6Var);
        this.H1 = q0Var3;
        viewArr[4] = q0Var3;
        org.telegram.ui.wq wqVar = new org.telegram.ui.wq(2131231244, activity, e6Var);
        this.I1 = wqVar;
        q0Var3.setIcon(wqVar);
        q0Var3.setLongClickEnabled(false);
        q0Var3.setAdditionalYOffset(-org.telegram.messenger.g0.L(197.0f));
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i14, this.J0), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.m6 M5 = org.telegram.ui.ActionBar.q6.M(i14);
        q0Var3.setBackground(h06);
        org.telegram.ui.ActionBar.q6.j(q0Var3, h06, null, M5, e6Var);
        q0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final y7 f39555b;

            {
                this.f39555b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i152 = r2;
                y7 y7Var = this.f39555b;
                switch (i152) {
                    case 0:
                        y7Var.d1();
                        y7Var.V1.V(null, null);
                        return;
                    default:
                        j7 j7Var = y7Var.K1;
                        org.telegram.messenger.gj gjVar2 = MediaController.B().f22377v0;
                        if (gjVar2 != null) {
                            boolean z12 = true;
                            m60 G = m60.G(y7Var.f29685c, y7Var.J0, view4, true);
                            m60 J0 = y7Var.J0(G, gjVar2);
                            if (!y7Var.O0()) {
                                G.l(2131232391, org.telegram.messenger.hd.M0(2131753916, null), new bi.n3(G, J0, 8), !y7Var.f41911t2);
                                if (!y7Var.f41911t2 && G.y() != null) {
                                    G.y().setRightIcon(2131232060);
                                }
                                G.k();
                            }
                            G.l(2131232166, org.telegram.messenger.hd.M0(2131750587, null), new y6(y7Var, G, 0), !y7Var.f41911t2);
                            G.l(2131232366, org.telegram.messenger.hd.M0(2131745459, null), new y6(y7Var, G, 1), !y7Var.f41911t2);
                            if (gjVar2.e1() <= 0) {
                                z12 = false;
                            }
                            G.l(2131232225, org.telegram.messenger.hd.M0(2131745342, null), new y6(y7Var, G, 2), z12);
                            if (y7Var.L1) {
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, G.f37086e, G.d, false, false);
                                G.d(z0Var);
                                y7Var.J1 = z0Var;
                                z0Var.j(org.telegram.messenger.hd.M0(2131743589, null), 2131231912, null);
                                y7Var.J1.setOnClickListener(new n2(3, y7Var, G));
                                org.telegram.messenger.g0.E2(j7Var);
                                y7Var.J1.addView(j7Var, 0, c8.ja.c(-1.0f, -1));
                                y7Var.updateColors();
                            }
                            G.m(2131232109, new y6(y7Var, G, 3), org.telegram.messenger.hd.M0(2131746645, null), y7Var.O0(), true);
                            G.X(org.telegram.messenger.g0.L(64.0f));
                            G.Z();
                            return;
                        }
                        return;
                }
            }
        });
        f7Var2.addView(q0Var3, c8.ja.e(48, 48, 51));
        j7 j7Var = new j7(this, activity, 0);
        this.K1 = j7Var;
        this.L1 = true;
        try {
            j7Var.setRouteSelector(g6.a.c(activity).a());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            this.L1 = false;
        }
        this.K1.setVisibility(4);
        org.telegram.ui.wq wqVar2 = this.I1;
        if (wqVar2 != null) {
            wqVar2.a(d1.f.u());
        }
        this.H1.setShowedFromBottom(true);
        this.H1.setDelegate(new r6(this, 2));
        this.H1.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f41914v1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i16 = 8;
        linearLayout.setVisibility(8);
        this.f29682b.addView(linearLayout, c8.ja.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new gi.a(11));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(2131232442);
        org.telegram.ui.ActionBar.q6.s(imageView2, org.telegram.ui.ActionBar.j6.W5, e6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, c8.ja.o(-2, -2));
        TextView textView2 = new TextView(activity);
        this.f41916w1 = textView2;
        int i17 = org.telegram.ui.ActionBar.j6.X5;
        org.telegram.ui.ActionBar.q6.U(textView2, i17, e6Var);
        textView2.setGravity(17);
        textView2.setText(org.telegram.messenger.hd.M0(2131748243, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(textView2, c8.ja.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f41918x1 = textView3;
        org.telegram.ui.ActionBar.q6.U(textView3, i17, e6Var);
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(textView3, c8.ja.t(-2, -2, 17, 0, 6, 0, 0));
        k7 k7Var = new k7(this, activity);
        this.f41908s1 = k7Var;
        k7Var.setClipToPadding(false);
        getContext();
        v4.b0 b0Var = new v4.b0(1, false);
        this.f41910t1 = b0Var;
        k7Var.setLayoutManager(b0Var);
        k7Var.setHorizontalScrollBarEnabled(false);
        k7Var.setVerticalScrollBarEnabled(false);
        this.f29682b.addView(k7Var, c8.ja.e(-1, -1, 51));
        x7 x7Var = new x7(this, activity);
        this.f41912u1 = x7Var;
        k7Var.setAdapter(x7Var);
        org.telegram.ui.ActionBar.q6.l(k7Var, 21, org.telegram.ui.ActionBar.j6.A5, e6Var);
        k7Var.setOnItemClickListener(new bi.a(2));
        k7Var.setOnItemLongClickListener(new r6(this, 3));
        k7Var.setOnScrollListener(new bi.z4(this, 28));
        hi.d dVar = new hi.d(activity, e6Var, true);
        dVar.setRoundRadius(24);
        this.f41922z1 = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        spannableStringBuilder.setSpan(new eq(2131231178, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131753925, null));
        dVar.setText(spannableStringBuilder);
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final y7 f34226b;

            {
                this.f34226b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i18 = r3;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                y7 y7Var = this.f34226b;
                switch (i18) {
                    case 0:
                        org.telegram.messenger.gj gjVar2 = MediaController.B().f22377v0;
                        if (gjVar2 != null && y7Var.A2 != null) {
                            y7Var.R0(gjVar2, true, new org.telegram.messenger.c6(24), false);
                            y7Var.U0(true);
                            org.telegram.messenger.k5.n(null, 2131753912, new cc((FrameLayout) y7Var.f29682b, e6Var2), 2131624191, 36);
                            return;
                        }
                        return;
                    default:
                        org.telegram.messenger.gj gjVar3 = MediaController.B().f22377v0;
                        if (gjVar3 != null && y7Var.A2 != null) {
                            y7Var.R0(gjVar3, false, new org.telegram.messenger.c6(24), false);
                            y7Var.U0(false);
                            org.telegram.messenger.k5.n(null, 2131753911, new cc((FrameLayout) y7Var.f29682b, e6Var2), 2131624052, 36);
                            return;
                        }
                        return;
                }
            }
        });
        this.f41920y1.addView(dVar, c8.ja.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        hi.d dVar2 = new hi.d(activity, e6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.e();
        this.A1 = dVar2;
        dVar2.setText(org.telegram.messenger.hd.M0(2131753917, null));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final y7 f34226b;

            {
                this.f34226b = this;
            }

            @Override
            public final void onClick(View view4) {
                int i18 = r3;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                y7 y7Var = this.f34226b;
                switch (i18) {
                    case 0:
                        org.telegram.messenger.gj gjVar2 = MediaController.B().f22377v0;
                        if (gjVar2 != null && y7Var.A2 != null) {
                            y7Var.R0(gjVar2, true, new org.telegram.messenger.c6(24), false);
                            y7Var.U0(true);
                            org.telegram.messenger.k5.n(null, 2131753912, new cc((FrameLayout) y7Var.f29682b, e6Var2), 2131624191, 36);
                            return;
                        }
                        return;
                    default:
                        org.telegram.messenger.gj gjVar3 = MediaController.B().f22377v0;
                        if (gjVar3 != null && y7Var.A2 != null) {
                            y7Var.R0(gjVar3, false, new org.telegram.messenger.c6(24), false);
                            y7Var.U0(false);
                            org.telegram.messenger.k5.n(null, 2131753911, new cc((FrameLayout) y7Var.f29682b, e6Var2), 2131624052, 36);
                            return;
                        }
                        return;
                }
            }
        });
        this.f41920y1.addView(dVar2, c8.ja.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        org.telegram.messenger.hp hpVar = MediaController.B().R0;
        this.f41905q2 = hpVar;
        if (hpVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41901o2 = z10;
        this.n1.f29303n0 = z10;
        this.f41903p2 = O0();
        this.f41907r2 = MediaController.B().S0;
        if (O0()) {
            yVar = s5;
            this.f41889e2 = yVar.a(8, 2131232043);
        } else {
            yVar = s5;
        }
        org.telegram.ui.ActionBar.q0 a10 = yVar.a(0, 2131232487);
        a10.O();
        a10.I = new kg.x1(this, 5);
        this.f41890f2 = a10;
        a10.setContentDescription(org.telegram.messenger.hd.M0(2131745836, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        searchField.setHint(org.telegram.messenger.hd.M0(2131745836, null));
        int i18 = org.telegram.ui.ActionBar.j6.Fj;
        org.telegram.ui.ActionBar.q6.U(searchField, i18, e6Var);
        org.telegram.ui.ActionBar.q6.D(searchField, org.telegram.ui.ActionBar.j6.Jj, e6Var);
        org.telegram.ui.ActionBar.q6.l(searchField, 30, i18, e6Var);
        if (z10) {
            k7Var.r1();
            v0(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, e6Var));
            this.n1.setAlpha(1.0f);
            this.f41897m1.setAlpha(0.0f);
            org.telegram.ui.Cells.f2 f2Var = this.M2;
            o7 o7Var2 = this.n1;
            Float valueOf = Float.valueOf(0.0f);
            f2Var.getClass();
            f2Var.a(o7Var2, valueOf);
        }
        if (this.f41907r2.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        x7Var.h = z11;
        if (z11) {
            k7Var.setVisibility(0);
            k7Var.setTranslationY(0.0f);
        } else {
            k7Var.setVisibility(8);
            k7Var.setTranslationY(org.telegram.messenger.g0.f23611q.y);
        }
        x7Var.f();
        this.n1.setTitle(org.telegram.messenger.hd.M0(2131753952, null));
        org.telegram.messenger.hp hpVar2 = this.f41905q2;
        if (hpVar2 != null) {
            if (hpVar2.f24204b == org.telegram.messenger.m10.i(this.f29679a).e()) {
                this.n1.setTitle(org.telegram.messenger.hd.M0(2131746643, null));
            } else {
                this.n1.setTitle(org.telegram.messenger.hd.a0(null, null, 2131746644, org.telegram.messenger.m5.t(this.f41905q2.f24204b)));
            }
        } else if (gjVar != null && MediaController.B().D0 == null) {
            long B0 = org.telegram.messenger.gj.B0(gjVar.f23819k);
            if (org.telegram.messenger.m5.C(B0)) {
                TLRPC.EncryptedChat a12 = org.telegram.messenger.np.s1(this.f29679a).a1(Integer.valueOf((int) (B0 & 4294967295L)));
                if (a12 != null && (a22 = org.telegram.messenger.np.s1(this.f29679a).a2(Long.valueOf(a12.user_id))) != null) {
                    this.n1.setTitle(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                }
            } else if (B0 == org.telegram.messenger.m10.i(this.f29679a).e()) {
                if (gjVar.P1() == 2666000) {
                    this.n1.setTitle(org.telegram.messenger.hd.M0(2131754252, null));
                } else {
                    this.n1.setTitle(org.telegram.messenger.hd.M0(2131745901, null));
                }
            } else if (org.telegram.messenger.m5.E(B0)) {
                TLRPC.User a23 = org.telegram.messenger.np.s1(this.f29679a).a2(Long.valueOf(B0));
                if (a23 != null) {
                    this.n1.setTitle(org.telegram.messenger.g5.m(0, a23.first_name, a23.last_name));
                }
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.f29679a).M0(Long.valueOf(-B0));
                if (M0 != null) {
                    this.n1.setTitle(M0.title);
                }
            }
        }
        if (O0()) {
            dVar.setVisibility(8);
            dVar2.setVisibility(8);
            v4.y yVar2 = new v4.y(new gi.c(this, 3));
            this.B1 = yVar2;
            yVar2.h(k7Var);
        }
        ViewGroup viewGroup2 = this.f29682b;
        f7 f7Var3 = this.f41920y1;
        int i19 = 52;
        if (!O0() && !this.f41911t2) {
            i7 = 52;
        } else {
            i7 = 0;
        }
        viewGroup2.addView(f7Var3, c8.ja.e(-1, i7 + 179, 83));
        this.f29682b.addView(this.f41902p1, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f41920y1.getLayoutParams();
        if (!O0() && !this.f41911t2) {
            i10 = 52;
        } else {
            i10 = 0;
        }
        layoutParams.height = org.telegram.messenger.g0.L(i10 + 179);
        ((FrameLayout.LayoutParams) this.f41902p1.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(179 + ((O0() || this.f41911t2) ? 0 : 0));
        this.f29682b.addView(this.f41900o1, c8.ja.c(3.0f, -1));
        this.f29682b.addView(this.n1);
        f7 f7Var4 = new f7(this, activity, 1);
        this.f41888c2 = f7Var4;
        f7Var4.setAlpha(0.0f);
        f7Var4.setVisibility(4);
        this.f29685c.addView(f7Var4);
        i9 i9Var = new i9(activity);
        this.d2 = i9Var;
        i9Var.setAspectFit(true);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(8.0f));
        i9Var.setScaleX(0.9f);
        i9Var.setScaleY(0.9f);
        f7Var4.addView(i9Var, c8.ja.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        f1(false);
        c1();
        if (this.f41906r1 && x7Var.b() == 0) {
            i16 = 0;
        }
        linearLayout.setVisibility(i16);
        Z0();
    }

    public static void I0(y7 y7Var) {
        int bottom;
        boolean z10;
        int translationY;
        Integer num;
        float f10;
        float f11;
        float f12;
        View view = y7Var.f41900o1;
        o7 o7Var = y7Var.n1;
        k7 k7Var = y7Var.f41908s1;
        if (k7Var.getChildCount() <= 0) {
            int paddingTop = k7Var.getPaddingTop();
            y7Var.f41913u2 = paddingTop;
            k7Var.setTopGlowOffset(paddingTop);
            y7Var.f29682b.invalidate();
            return;
        }
        boolean z11 = false;
        View childAt = k7Var.getChildAt(0);
        cj0 cj0Var = (cj0) k7Var.G(childAt);
        if (childAt instanceof org.telegram.ui.Cells.w) {
            bottom = childAt.getTop();
        } else {
            bottom = childAt.getBottom();
        }
        int L = org.telegram.messenger.g0.L(7.0f);
        if (bottom < org.telegram.messenger.g0.L(7.0f) || cj0Var == null || cj0Var.b() != 0) {
            bottom = L;
        }
        if (bottom <= org.telegram.messenger.g0.L(12.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f13 = 1.0f;
        if ((z10 && o7Var.getTag() == null) || (!z10 && o7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            o7Var.setTag(num);
            AnimatorSet animatorSet = y7Var.f41917w2;
            if (animatorSet != null) {
                animatorSet.cancel();
                y7Var.f41917w2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            y7Var.f41917w2 = animatorSet2;
            float f14 = 0.0f;
            if (y7Var.f41901o2) {
                org.telegram.ui.Cells.f2 f2Var = y7Var.M2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o7Var, f2Var, f11);
                View view2 = y7Var.f41897m1;
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
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(o7Var, property2, f10);
                if (z10) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat3, ObjectAnimator.ofFloat(view, property2, f14));
            }
            y7Var.f41917w2.setDuration(320L);
            y7Var.f41917w2.setInterpolator(er.h);
            y7Var.f41917w2.addListener(new m7(y7Var, 2));
            y7Var.f41917w2.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k7Var.getLayoutParams();
        int D = org.telegram.messenger.i20.D(11.0f, layoutParams.topMargin - org.telegram.messenger.g0.f23605m, bottom);
        if (y7Var.f41913u2 != D) {
            y7Var.f41913u2 = D;
            k7Var.setTopGlowOffset((D - layoutParams.topMargin) - org.telegram.messenger.g0.f23605m);
            y7Var.f29682b.invalidate();
        }
        int L2 = org.telegram.messenger.g0.L(13.0f);
        if (y7Var.f29716t0 + ((int) (k7Var.getTranslationY() + ((y7Var.f41913u2 - y7Var.f29716t0) - L2))) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f13 = 1.0f - Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - y7Var.f29716t0) / (org.telegram.messenger.g0.L(4.0f) + L2));
        }
        y7Var.H2 = f13;
        if (f13 <= 0.5f && i0.a.h(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, y7Var.J0)) > 0.699999988079071d) {
            z11 = true;
        }
        if (z11 != y7Var.G2) {
            y7Var.G2 = z11;
            org.telegram.messenger.g0.q3(y7Var, z11);
        }
    }

    public static boolean L0(float f10, float f11) {
        if (Math.abs(f10 - f11) < 0.05f) {
            return true;
        }
        return false;
    }

    public static org.telegram.messenger.gc N0(org.telegram.messenger.gj gjVar) {
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
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ij));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Mj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Lj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28799ae));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29019md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29003ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28800af));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ze));
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final m60 J0(m60 m60Var, org.telegram.messenger.gj gjVar) {
        long j3;
        org.telegram.messenger.gp H1 = org.telegram.messenger.np.s1(this.f29679a).H1();
        TLRPC.Document F0 = gjVar.F0();
        if (F0 != null) {
            j3 = F0.f28057id;
        } else {
            j3 = 0;
        }
        m60 J = m60Var.J();
        J.c(2131231240, org.telegram.messenger.hd.M0(2131753756, null), new org.telegram.ui.fq0(m60Var, 27), false);
        J.k();
        J.l(2131231621, org.telegram.messenger.hd.M0(2131753913, null), new x6(this, gjVar, m60Var, 6), !H1.f23897b.contains(Long.valueOf(j3)));
        J.c(2131232352, org.telegram.messenger.hd.M0(2131753910, null), new x6(this, gjVar, m60Var, 7), false);
        J.c(2131231789, org.telegram.messenger.hd.M0(2131753914, null), new x6(this, gjVar, m60Var, 8), false);
        J.k();
        J.p(12, org.telegram.messenger.g0.L(200.0f), org.telegram.messenger.hd.M0(2131753915, null));
        return J;
    }

    public final void K0() {
        org.telegram.ui.ActionBar.q0 q0Var = this.V1;
        int w02 = org.telegram.ui.ActionBar.j6.w0(((Integer) q0Var.getTag()).intValue(), this.J0);
        int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Nj, this.J0);
        int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, this.J0);
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
            org.telegram.ui.ActionBar.j6.H1(q0Var.getBackground(), w04, true);
            org.telegram.ui.ActionBar.j6.H1(q0Var2.getBackground(), w04, true);
        }
        this.P2 = true;
        this.M1.setProgressColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Mj, this.J0));
        d1();
        int i7 = org.telegram.ui.ActionBar.j6.G8;
        q0Var.I(org.telegram.ui.ActionBar.j6.w0(i7, this.J0));
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        q0Var2.P(org.telegram.ui.ActionBar.j6.w0(i10, this.J0), false);
        q0Var2.P(org.telegram.ui.ActionBar.j6.w0(i10, this.J0), true);
        q0Var2.I(org.telegram.ui.ActionBar.j6.w0(i7, this.J0));
    }

    public final void M0(org.telegram.messenger.gj gjVar) {
        ArrayList j3;
        TLRPC.TL_document tL_document;
        int i7 = org.telegram.messenger.m10.f24940t0;
        int i10 = this.f29679a;
        LaunchActivity launchActivity = this.A2;
        if (i7 != i10) {
            launchActivity.O0(i10);
        }
        Bundle j10 = org.telegram.ui.Cells.y0.j(3, "onlySelect", "dialogsType", true);
        j10.putBoolean("canSelectTopics", true);
        org.telegram.ui.yw ywVar = new org.telegram.ui.yw(j10);
        if (gjVar.e1() < 0) {
            if (!(gjVar.F0() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) gjVar.F0();
            j3 = null;
        } else {
            j3 = org.telegram.messenger.k5.j(gjVar);
            tL_document = null;
        }
        ywVar.E2 = new a1.d(this, j3, tL_document, gjVar, 9);
        launchActivity.t0(ywVar);
        dismiss();
    }

    public final boolean O0() {
        org.telegram.messenger.hp hpVar = this.f41905q2;
        if (hpVar != null && hpVar.f24204b == org.telegram.messenger.m10.i(this.f29679a).e()) {
            return true;
        }
        return false;
    }

    public final void P0(int i7) {
        LaunchActivity launchActivity;
        org.telegram.messenger.gj gjVar = MediaController.B().f22377v0;
        if (gjVar != null && (launchActivity = this.A2) != null) {
            if (i7 == 1) {
                M0(gjVar);
            } else if (i7 == 2) {
                V0(gjVar);
            } else if (i7 == 4) {
                int i10 = org.telegram.messenger.m10.f24940t0;
                int i11 = this.f29679a;
                if (i10 != i11) {
                    launchActivity.O0(i11);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.gj.B0(gjVar.f23819k);
                if (org.telegram.messenger.m5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.m5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.f29679a).M0(Long.valueOf(-B0));
                    if (M0 != null && M0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -M0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", gjVar.e1());
                org.telegram.messenger.ns.f(this.f29679a).k(org.telegram.messenger.ns.f25573t, new Object[0]);
                launchActivity.u0(new org.telegram.ui.an(bundle), false, false);
                dismiss();
            } else if (i7 == 5) {
                Q0(gjVar);
            } else if (i7 == 6) {
                wf.b.I().P(MediaController.B().z());
                this.K1.performClick();
            } else if (i7 == 7) {
                R0(gjVar, false, new u6(this, gjVar, 0), false);
            } else if (i7 == 8) {
                hi.v6 v6Var = new hi.v6(getContext(), true, null, new w6(this, 0), null);
                v6Var.d2 = true;
                v6Var.V1 = false;
                v6Var.f15230l2.O(true);
                v6Var.show();
            }
        }
    }

    public final void Q0(org.telegram.messenger.gj gjVar) {
        String str;
        if (Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.f26207b) {
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
        String str3 = gjVar.f23819k.attachPath;
        if (str3 != null && str3.length() > 0 && !a8.p0.B(str3)) {
            str3 = null;
        }
        if (str3 == null || str3.length() == 0) {
            org.telegram.messenger.w7.G(this.f29679a);
            str3 = org.telegram.messenger.w7.M(gjVar.f23819k, false, true).toString();
        }
        String str4 = str3;
        if (gjVar.F0() != null) {
            str = gjVar.F0().mime_type;
        } else {
            str = "";
        }
        String str5 = str;
        MediaController.d0(str4, this.A2, 3, str2, str5, new w6(this, 1));
    }

    public final void R0(org.telegram.messenger.gj gjVar, boolean z10, Runnable runnable, boolean z11) {
        TLRPC.Document F0 = gjVar.F0();
        if (F0 == null) {
            return;
        }
        long j3 = F0.f28057id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z10;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.f28079id = tL_inputDocument;
        tL_inputDocument.f28063id = j3;
        tL_inputDocument.access_hash = F0.access_hash;
        byte[] bArr = F0.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.f29679a).sendRequest(tL_account_saveMusic, new z6(this, z11, gjVar, z10, runnable, j3, F0));
    }

    @Override
    public final int S() {
        f7 f7Var = this.f41920y1;
        if (f7Var == null) {
            return 0;
        }
        if (this.f41907r2.size() <= 1) {
            return f7Var.getMeasuredHeight() + this.f29716t0;
        }
        int L = org.telegram.messenger.g0.L(13.0f);
        int translationY = (int) (this.f41908s1.getTranslationY() + ((this.f41913u2 - this.f29716t0) - L));
        if (this.f29716t0 + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float L2 = org.telegram.messenger.g0.L(4.0f) + L;
            translationY -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L2) * Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - this.f29716t0) / L2));
        }
        return this.f29685c.getMeasuredHeight() - (translationY + org.telegram.messenger.g0.f23605m);
    }

    public final boolean S0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y7.S0(boolean):boolean");
    }

    public final void T0(org.telegram.ui.ActionBar.z0 z0Var, boolean z10) {
        if (z10) {
            int i7 = org.telegram.ui.ActionBar.j6.Oj;
            z0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(i7, this.J0));
            z0Var.setIconColor(org.telegram.ui.ActionBar.j6.w0(i7, this.J0));
            return;
        }
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        z0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(i10, this.J0));
        z0Var.setIconColor(org.telegram.ui.ActionBar.j6.w0(i10, this.J0));
    }

    public final void U0(final boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        boolean O0 = O0();
        hi.d dVar = this.A1;
        hi.d dVar2 = this.f41922z1;
        if (!O0 && !this.f41911t2) {
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
            er erVar = er.h;
            duration.setInterpolator(erVar).withEndAction(new Runnable(this) {
                public final y7 f40275b;

                {
                    this.f40275b = this;
                }

                @Override
                public final void run() {
                    int i7;
                    int i10;
                    switch (r3) {
                        case 0:
                            hi.d dVar3 = this.f40275b.f41922z1;
                            if (z10) {
                                i7 = 8;
                            } else {
                                i7 = 0;
                            }
                            dVar3.setVisibility(i7);
                            return;
                        default:
                            hi.d dVar4 = this.f40275b.A1;
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
            scaleX2.scaleY(f15).setDuration(420L).setInterpolator(erVar).withEndAction(new Runnable(this) {
                public final y7 f40275b;

                {
                    this.f40275b = this;
                }

                @Override
                public final void run() {
                    int i7;
                    int i10;
                    switch (r3) {
                        case 0:
                            hi.d dVar3 = this.f40275b.f41922z1;
                            if (z10) {
                                i7 = 8;
                            } else {
                                i7 = 0;
                            }
                            dVar3.setVisibility(i7);
                            return;
                        default:
                            hi.d dVar4 = this.f40275b.A1;
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

    @Override
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        q6 q6Var = new q6(this, 0);
        int i7 = org.telegram.ui.ActionBar.j6.Fj;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.n1, 1024, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        int i10 = org.telegram.ui.ActionBar.j6.Jj;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.n1, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f29682b, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f29715s0}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28922h5));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.M1, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Mj));
        int i11 = org.telegram.ui.ActionBar.j6.f29204w7;
        org.telegram.ui.ActionBar.q0 q0Var = this.P1;
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29223x7));
        int i12 = org.telegram.ui.ActionBar.j6.Nj;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.V1;
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.j6.Oj));
        int i13 = org.telegram.ui.ActionBar.j6.E8;
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i13));
        int i14 = org.telegram.ui.ActionBar.j6.G8;
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i14));
        org.telegram.ui.ActionBar.q0 q0Var3 = this.H1;
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i14));
        h7 h7Var = this.E1;
        arrayList.add(new org.telegram.ui.ActionBar.s6(h7Var, new ch0[]{h7Var.getAnimatedDrawable()}, "Triangle 3", i12));
        arrayList.add(new org.telegram.ui.ActionBar.s6(h7Var, new ch0[]{h7Var.getAnimatedDrawable()}, "Triangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.s6(h7Var, new ch0[]{h7Var.getAnimatedDrawable()}, "Rectangle 4", i12));
        int i15 = org.telegram.ui.ActionBar.j6.f28941i6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.E1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f41886a2, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i15));
        i7 i7Var = this.F1;
        arrayList.add(new org.telegram.ui.ActionBar.s6(i7Var, new ch0[]{i7Var.getAnimatedDrawable()}, "Triangle 3", i12));
        arrayList.add(new org.telegram.ui.ActionBar.s6(i7Var, new ch0[]{i7Var.getAnimatedDrawable()}, "Triangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.s6(i7Var, new ch0[]{i7Var.getAnimatedDrawable()}, "Rectangle 4", i12));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.F1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i15));
        int i16 = org.telegram.ui.ActionBar.j6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f41916w1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f41918x1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.M1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28832c7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.M1, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28923h6));
        q7 q7Var = this.D1;
        arrayList.add(new org.telegram.ui.ActionBar.s6(q7Var.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(q7Var.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        q7 q7Var2 = this.G1;
        arrayList.add(new org.telegram.ui.ActionBar.s6(q7Var2.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(q7Var2.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f29682b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.zj));
        return arrayList;
    }

    public final void V0(org.telegram.messenger.gj r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y7.V0(org.telegram.messenger.gj):void");
    }

    public final void W0(boolean z10, boolean z11) {
        i9 i9Var = this.d2;
        f7 f7Var = this.f41888c2;
        if (z10) {
            if (f7Var.getVisibility() != 0 && !this.f41891g2) {
                f7Var.setTag(1);
                p7 p7Var = this.C1;
                i9Var.setImageBitmap(p7Var.f38228a[p7Var.f38229b].getImageReceiver().n());
                this.f41891g2 = true;
                ok0.d(new s6(this, 1));
                f7Var.setVisibility(0);
                f7Var.animate().alpha(1.0f).setDuration(180L).setListener(new m7(this, 0)).start();
                i9Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            }
        } else if (f7Var.getVisibility() != 0) {
        } else {
            f7Var.setTag(null);
            if (z11) {
                this.f41891g2 = true;
                f7Var.animate().alpha(0.0f).setDuration(180L).setListener(new m7(this, 1)).start();
                i9Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
                return;
            }
            f7Var.setAlpha(0.0f);
            f7Var.setVisibility(4);
            i9Var.setImageBitmap(null);
            i9Var.setScaleX(0.9f);
            i9Var.setScaleY(0.9f);
        }
    }

    public final void X0(org.telegram.ui.Cells.w wVar, org.telegram.messenger.gj gjVar) {
        m60 G = m60.G(this.f29685c, this.J0, wVar, true);
        int i7 = 3;
        boolean z10 = false;
        if (O0()) {
            G.l(2131232166, org.telegram.messenger.hd.M0(2131750587, null), new x6(this, G, gjVar, 0), !this.f41911t2);
            G.l(2131232366, org.telegram.messenger.hd.M0(2131745459, null), new x6(this, G, gjVar, 1), !this.f41911t2);
            G.c(2131232109, org.telegram.messenger.hd.M0(2131751598, null), new x6(this, gjVar, G, 2), true);
        } else {
            G.l(2131232391, org.telegram.messenger.hd.M0(2131753916, null), new bi.n3(G, J0(G, gjVar), 7), !this.f41911t2);
            if (!this.f41911t2 && G.y() != null) {
                G.y().setRightIcon(2131232060);
            }
            G.k();
            G.l(2131232166, org.telegram.messenger.hd.M0(2131750587, null), new x6(this, G, gjVar, 3), !this.f41911t2);
            G.l(2131232364, org.telegram.messenger.hd.M0(2131745459, null), new x6(this, G, gjVar, 4), !this.f41911t2);
            if (gjVar.e1() > 0) {
                z10 = true;
            }
            G.l(2131232421, org.telegram.messenger.hd.M0(2131745342, null), new u6(this, gjVar, 1), z10);
        }
        if (!org.telegram.messenger.hd.f24104a0) {
            i7 = 5;
        }
        G.V(i7);
        G.Z();
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
        int top = this.f29682b.getTop();
        Drawable drawable = this.f29715s0;
        if (drawable != null) {
            i7 = drawable.getBounds().top;
        } else {
            i7 = 0;
        }
        if (f11 >= top + i7 && f10 >= this.f29682b.getLeft() && f10 <= this.f29682b.getRight()) {
            return false;
        }
        return true;
    }

    public final void Y0() {
        if (this.B2 == 1) {
            this.E2 = System.currentTimeMillis();
            this.C2 = MediaController.B().f22377v0.f23779b0;
            j6.o oVar = this.I2;
            org.telegram.messenger.g0.r(oVar);
            org.telegram.messenger.g0.h3(oVar);
        }
    }

    public final void Z0() {
        int i7;
        LinearLayout linearLayout = this.f41914v1;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        if (this.f41920y1.getVisibility() == 0) {
            i7 = org.telegram.messenger.g0.L(150.0f);
        } else {
            i7 = -org.telegram.messenger.g0.L(30.0f);
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.f29682b.getMeasuredHeight()) - i7) / 2);
    }

    public final void a1(boolean z10) {
        if (this.P1 != null) {
            float f10 = MediaController.B().f22368r0;
            this.Q1.b(z10, f10);
            this.R1.e(z10, f10);
            updateColors();
            boolean z11 = this.S1;
            int i7 = 0;
            this.S1 = false;
            while (true) {
                org.telegram.ui.ActionBar.z0[] z0VarArr = this.T1;
                if (i7 < z0VarArr.length) {
                    if (!z11 && L0(f10, U2[i7])) {
                        org.telegram.ui.ActionBar.z0 z0Var = z0VarArr[i7];
                        int i10 = org.telegram.ui.ActionBar.j6.Hi;
                        z0Var.d(org.telegram.ui.ActionBar.j6.w0(i10, this.J0), org.telegram.ui.ActionBar.j6.w0(i10, this.J0));
                    } else {
                        org.telegram.ui.ActionBar.z0 z0Var2 = z0VarArr[i7];
                        int i11 = org.telegram.ui.ActionBar.j6.E8;
                        z0Var2.d(org.telegram.ui.ActionBar.j6.w0(i11, this.J0), org.telegram.ui.ActionBar.j6.w0(i11, this.J0));
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b1(org.telegram.messenger.gj r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y7.b1(org.telegram.messenger.gj, boolean):void");
    }

    public final void c1() {
        int i7 = org.telegram.messenger.gz.S0;
        org.telegram.ui.ActionBar.q0 q0Var = this.V1;
        if (i7 != 0 && i7 != 1) {
            if (i7 == 2) {
                q0Var.setIcon(2131232557);
                int i10 = org.telegram.ui.ActionBar.j6.Oj;
                q0Var.setTag(Integer.valueOf(i10));
                q0Var.setIconColor(org.telegram.ui.ActionBar.j6.w0(i10, this.J0));
                org.telegram.ui.ActionBar.j6.H1(q0Var.getBackground(), org.telegram.ui.ActionBar.j6.w0(i10, this.J0) & 436207615, true);
                q0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754785, null));
                return;
            }
            return;
        }
        if (org.telegram.messenger.gz.N0) {
            if (i7 == 0) {
                q0Var.setIcon(2131232558);
            } else {
                q0Var.setIcon(2131232555);
            }
        } else if (org.telegram.messenger.gz.O0) {
            if (i7 == 0) {
                q0Var.setIcon(2131232552);
            } else {
                q0Var.setIcon(2131232554);
            }
        } else {
            q0Var.setIcon(2131232556);
        }
        if (i7 == 0 && !org.telegram.messenger.gz.N0 && !org.telegram.messenger.gz.O0) {
            int i11 = org.telegram.ui.ActionBar.j6.Nj;
            q0Var.setTag(Integer.valueOf(i11));
            q0Var.setIconColor(org.telegram.ui.ActionBar.j6.w0(i11, this.J0));
            org.telegram.ui.ActionBar.j6.H1(q0Var.getBackground(), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, this.J0), true);
            q0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754786, null));
            return;
        }
        int i12 = org.telegram.ui.ActionBar.j6.Oj;
        q0Var.setTag(Integer.valueOf(i12));
        q0Var.setIconColor(org.telegram.ui.ActionBar.j6.w0(i12, this.J0));
        org.telegram.ui.ActionBar.j6.H1(q0Var.getBackground(), 436207615 & org.telegram.ui.ActionBar.j6.w0(i12, this.J0), true);
        if (i7 == 0) {
            if (org.telegram.messenger.gz.N0) {
                q0Var.setContentDescription(org.telegram.messenger.hd.M0(2131745322, null));
                return;
            } else {
                q0Var.setContentDescription(org.telegram.messenger.hd.M0(2131746027, null));
                return;
            }
        }
        q0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754787, null));
    }

    public final void d1() {
        boolean z10;
        T0(this.Y1, org.telegram.messenger.gz.N0);
        T0(this.Z1, org.telegram.messenger.gz.O0);
        boolean z11 = false;
        if (org.telegram.messenger.gz.S0 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        T0(this.X1, z10);
        if (org.telegram.messenger.gz.S0 == 2) {
            z11 = true;
        }
        T0(this.W1, z11);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z10;
        org.telegram.ui.Cells.w wVar;
        org.telegram.messenger.gj messageObject;
        org.telegram.ui.Cells.w wVar2;
        org.telegram.messenger.gj messageObject2;
        org.telegram.messenger.gj gjVar;
        int i11 = org.telegram.messenger.ns.f25507h2;
        int i12 = org.telegram.messenger.ns.f25495f2;
        int i13 = org.telegram.messenger.ns.f25501g2;
        k7 k7Var = this.f41908s1;
        int i14 = 0;
        if (i7 != i11 && i7 != i13 && i7 != i12) {
            if (i7 == org.telegram.messenger.ns.f25489e2) {
                org.telegram.messenger.gj gjVar2 = MediaController.B().f22377v0;
                if (gjVar2 != null && gjVar2.I3()) {
                    b1(gjVar2, false);
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.ns.J4) {
                a1(true);
                return;
            } else {
                int i15 = org.telegram.messenger.ns.K0;
                x7 x7Var = this.f41912u1;
                if (i7 == i15) {
                    this.f41905q2 = MediaController.B().R0;
                    this.f41907r2 = MediaController.B().S0;
                    x7Var.f();
                    return;
                } else if (i7 == org.telegram.messenger.ns.L0) {
                    this.f41905q2 = MediaController.B().R0;
                    this.f41907r2 = MediaController.B().S0;
                    x7Var.f();
                    if (org.telegram.messenger.gz.O0) {
                        k7Var.C0();
                        int intValue = ((Integer) objArr[0]).intValue();
                        v4.b0 b0Var = this.f41910t1;
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
                } else if (i7 == org.telegram.messenger.ns.Y1) {
                    if (((String) objArr[0]).equals(this.f41915v2)) {
                        f1(false);
                        this.f41895k2 = true;
                        return;
                    }
                    return;
                } else if (i7 == org.telegram.messenger.ns.X1) {
                    if (((String) objArr[0]).equals(this.f41915v2) && (gjVar = MediaController.B().f22377v0) != null) {
                        Long l10 = (Long) objArr[1];
                        Long l11 = (Long) objArr[2];
                        float f10 = 1.0f;
                        if (!this.f41895k2) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f41894j2) >= 500) {
                                if (MediaController.B().m0) {
                                    f10 = org.telegram.messenger.w7.G(this.f29679a).t(this.f41915v2, gjVar.f23779b0);
                                }
                                this.f41894j2 = elapsedRealtime;
                            } else {
                                f10 = -1.0f;
                            }
                        }
                        if (f10 != -1.0f) {
                            r1.g gVar = this.f41893i2;
                            gVar.f55748m.f55756i = f10 * 1000.0f;
                            gVar.h();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == org.telegram.messenger.ns.U3) {
                    f1(false);
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
        f1(z10);
        if (i7 != i12 && i7 != i13) {
            if (((org.telegram.messenger.gj) objArr[0]).T == 0) {
                int childCount = k7Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = k7Var.getChildAt(i16);
                    if ((childAt instanceof org.telegram.ui.Cells.w) && (messageObject2 = (wVar2 = (org.telegram.ui.Cells.w) childAt).getMessageObject()) != null && (org.telegram.messenger.gj.R4(messageObject2.f23819k) || messageObject2.I3())) {
                        wVar2.b(false, true);
                    }
                }
            } else {
                return;
            }
        } else {
            int childCount2 = k7Var.getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = k7Var.getChildAt(i17);
                if ((childAt2 instanceof org.telegram.ui.Cells.w) && (messageObject = (wVar = (org.telegram.ui.Cells.w) childAt2).getMessageObject()) != null && (org.telegram.messenger.gj.R4(messageObject.f23819k) || messageObject.I3())) {
                    wVar.b(false, true);
                }
            }
            if (i7 == i13 && MediaController.B().f22377v0 != null) {
                if (MediaController.B().H()) {
                    Y0();
                } else if (this.B2 == 1 && this.C2 != -1.0f) {
                    j6.o oVar = this.I2;
                    org.telegram.messenger.g0.r(oVar);
                    this.F2 = 0L;
                    oVar.run();
                    this.C2 = -1.0f;
                }
            }
        }
        org.telegram.ui.wq wqVar = this.I1;
        if (wqVar != null) {
            wqVar.a(d1.f.u());
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.ns.f(this.f29679a).n(this, org.telegram.messenger.ns.f25495f2);
        org.telegram.messenger.ns.f(this.f29679a).n(this, org.telegram.messenger.ns.f25501g2);
        org.telegram.messenger.ns.f(this.f29679a).n(this, org.telegram.messenger.ns.f25507h2);
        org.telegram.messenger.ns.f(this.f29679a).n(this, org.telegram.messenger.ns.f25489e2);
        org.telegram.messenger.ns.f(this.f29679a).n(this, org.telegram.messenger.ns.Y1);
        org.telegram.messenger.ns.f(this.f29679a).n(this, org.telegram.messenger.ns.X1);
        org.telegram.messenger.ns.f(this.f29679a).n(this, org.telegram.messenger.ns.K0);
        org.telegram.messenger.ns.f(this.f29679a).n(this, org.telegram.messenger.ns.L0);
        org.telegram.messenger.ns.f(this.f29679a).n(this, org.telegram.messenger.ns.U3);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.J4);
        org.telegram.messenger.z5.q(this.f29679a).v(this);
        if (T2 == this) {
            T2 = null;
        }
    }

    public final void e1() {
        int i7;
        int w02;
        int i10;
        int i11;
        if (this.f41901o2) {
            i7 = org.telegram.ui.ActionBar.j6.f28792a7;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.f28922h5;
        }
        int w03 = org.telegram.ui.ActionBar.j6.w0(i7, this.J0);
        if (w03 != this.O2) {
            this.O2 = w03;
            v0(w03);
        }
        int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Nj, this.J0);
        h7 h7Var = this.E1;
        if (h7Var != null) {
            h7Var.h(w04, "Triangle 3");
            h7Var.h(w04, "Triangle 4");
            h7Var.h(w04, "Rectangle 4");
        }
        i7 i7Var = this.F1;
        if (i7Var != null) {
            i7Var.h(w04, "Triangle 3");
            i7Var.h(w04, "Triangle 4");
            i7Var.h(w04, "Rectangle 4");
        }
        r7 r7Var = this.N1;
        if (r7Var != null) {
            r7Var.setOuterColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Mj, this.J0));
        }
        boolean z10 = false;
        org.telegram.ui.ActionBar.q0 q0Var = this.P1;
        if (q0Var != null) {
            float f10 = MediaController.B().f22368r0;
            if (!L0(f10, 1.0f)) {
                i10 = org.telegram.ui.ActionBar.j6.Hi;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f29223x7;
            }
            int w05 = org.telegram.ui.ActionBar.j6.w0(i10, this.J0);
            eu0 eu0Var = this.Q1;
            if (eu0Var != null) {
                eu0Var.f34436a.u(w05);
                Paint paint = eu0Var.f34437b;
                if (paint != null) {
                    paint.setColor(w05);
                }
            }
            org.telegram.ui.ActionBar.j6.H1(q0Var.getBackground(), w05 & 436207615, true);
            int i12 = 0;
            while (true) {
                org.telegram.ui.ActionBar.z0[] z0VarArr = this.T1;
                if (i12 >= z0VarArr.length) {
                    break;
                }
                if (z0VarArr[i12] != null) {
                    if (L0(f10, U2[i12])) {
                        i11 = org.telegram.ui.ActionBar.j6.Hi;
                    } else {
                        i11 = org.telegram.ui.ActionBar.j6.E8;
                    }
                    int w06 = org.telegram.ui.ActionBar.j6.w0(i11, this.J0);
                    z0VarArr[i12].d(w06, w06);
                }
                i12++;
            }
        }
        org.telegram.ui.ActionBar.z0 z0Var = this.J1;
        if (z0Var != null) {
            j7 j7Var = this.K1;
            if (j7Var != null && j7Var.b()) {
                z10 = true;
            }
            int w07 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, this.J0);
            int w08 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.F8, this.J0);
            int i13 = org.telegram.ui.ActionBar.j6.Fi;
            z0Var.e(w07, w08, org.telegram.ui.ActionBar.j6.w0(i13, this.J0), z10);
            org.telegram.ui.ActionBar.z0 z0Var2 = this.J1;
            if (j7Var != null && j7Var.b()) {
                w02 = org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i13, this.J0));
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, this.J0);
            }
            z0Var2.setSelectorColor(w02);
        }
    }

    public final void f1(boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y7.f1(boolean):void");
    }

    @Override
    public final int getObserverTag() {
        return this.f41923z2;
    }

    @Override
    public final void i(long j3, long j10) {
        this.M1.a(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
    }

    @Override
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        f7 f7Var = this.f41888c2;
        if (view != f7Var) {
            return false;
        }
        f7Var.layout(0, 0, f7Var.getMeasuredWidth(), f7Var.getMeasuredHeight());
        return true;
    }

    @Override
    public final boolean l0(View view, int i7, int i10) {
        f7 f7Var = this.f41888c2;
        if (view == f7Var) {
            org.telegram.ui.ActionBar.k2 k2Var = this.f29685c;
            f7Var.measure(View.MeasureSpec.makeMeasureSpec(k2Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(k2Var.getMeasuredHeight(), 1073741824));
            return true;
        }
        return false;
    }

    @Override
    public final void onBackPressed() {
        o7 o7Var = this.n1;
        if (o7Var != null && o7Var.f29304o0) {
            o7Var.n(true);
        } else if (this.f41888c2.getTag() != null) {
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
            if (this.f41890f2 != null && this.V1 != null && this.H1 != null && this.M1 != null) {
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
            float f10 = this.H2;
            if (f10 >= 0.0f) {
                if (f10 <= 0.5f && i0.a.h(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.J0)) > 0.699999988079071d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != this.G2) {
                    this.G2 = z10;
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
        T2 = this;
    }

    public final void updateColors() {
        int w02;
        int i7;
        boolean z10 = true;
        org.telegram.ui.ActionBar.q0 q0Var = this.P1;
        if (q0Var != null) {
            if (!L0(MediaController.B().f22368r0, 1.0f)) {
                i7 = org.telegram.ui.ActionBar.j6.Hi;
            } else {
                i7 = org.telegram.ui.ActionBar.j6.f29223x7;
            }
            int w03 = org.telegram.ui.ActionBar.j6.w0(i7, this.J0);
            eu0 eu0Var = this.Q1;
            if (eu0Var != null) {
                eu0Var.f34436a.u(w03);
                Paint paint = eu0Var.f34437b;
                if (paint != null) {
                    paint.setColor(w03);
                }
            }
            q0Var.setBackground(org.telegram.ui.ActionBar.j6.h0(w03 & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        }
        org.telegram.ui.ActionBar.z0 z0Var = this.J1;
        if (z0Var != null) {
            j7 j7Var = this.K1;
            z10 = (j7Var == null || !j7Var.b()) ? false : false;
            int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, this.J0);
            int w05 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.F8, this.J0);
            int i10 = org.telegram.ui.ActionBar.j6.Fi;
            z0Var.e(w04, w05, org.telegram.ui.ActionBar.j6.w0(i10, this.J0), z10);
            org.telegram.ui.ActionBar.z0 z0Var2 = this.J1;
            if (j7Var != null && j7Var.b()) {
                w02 = org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i10, this.J0));
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, this.J0);
            }
            z0Var2.setSelectorColor(w02);
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
