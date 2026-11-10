package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_aicompose;
public final class z extends ma {
    public final FrameLayout S1;
    public final FrameLayout T1;
    public final k9 U1;
    public final org.telegram.ui.Cells.k3 V1;
    public final org.telegram.ui.Cells.k3 W1;
    public final FrameLayout X1;
    public final wo Y1;
    public final FrameLayout Z1;
    public final FrameLayout f40778a2;
    public final fi.d f40779b2;
    public Long f40780c2;
    public y d2;
    public TL_aicompose.TL_aiComposeTone f40781e2;
    public f f40782f2;
    public f f40783g2;
    public int f40784h2;
    public m41 f40785i2;
    public int f40786j2;

    public z(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, true, false, 2, h6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i7, this.I0)), 1, -1);
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.1f, i7);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, K, h6Var);
        this.f35902o1.addView(imageView, c8.ha.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        c8.ka.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final z f37788b;

            {
                this.f37788b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37788b.dismiss();
                        return;
                    case 1:
                        this.f37788b.d1();
                        return;
                    default:
                        wo woVar = this.f37788b.Y1;
                        woVar.a(!woVar.f40026a.f31279q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.T1 = frameLayout2;
        int L = org.telegram.messenger.g0.L(100.0f);
        int i10 = org.telegram.ui.ActionBar.m6.f27890d6;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.t6.j(frameLayout2, L2, M, null, h6Var);
        c8.ka.a(frameLayout2);
        frameLayout.addView(frameLayout2, c8.ha.e(100, 100, 17));
        k9 k9Var = new k9(context);
        this.U1 = k9Var;
        f1();
        frameLayout2.addView(k9Var, c8.ha.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final z f37788b;

            {
                this.f37788b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37788b.dismiss();
                        return;
                    case 1:
                        this.f37788b.d1();
                        return;
                    default:
                        wo woVar = this.f37788b.Y1;
                        woVar.a(!woVar.f40026a.f31279q, true);
                        return;
                }
            }
        });
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.id.M0(2131754965, null), false, false, ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(this.f28669a).f24946x7.Q.f13557b).f23464c, h6Var);
        this.V1 = k3Var;
        k3Var.d.addTextChangedListener(new v(this, 0));
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.id.M0(2131754972, null), true, false, ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(this.f28669a).f24946x7.R.f13557b).f23464c, h6Var);
        this.W1 = k3Var2;
        k3Var2.setShowLimitWhenNear(Math.max(100, ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(this.f28669a).f24946x7.R.f13557b).f23464c / 2));
        k3Var2.d.addTextChangedListener(new v(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i11 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), 24, 24);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i11);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.t6.j(linearLayout, a02, null, M2, h6Var);
        wo woVar = new wo(24, context, h6Var);
        this.Y1 = woVar;
        woVar.b(org.telegram.ui.ActionBar.m6.h7, org.telegram.ui.ActionBar.m6.f28000j7, org.telegram.ui.ActionBar.m6.f28020k7);
        woVar.setDrawUnchecked(true);
        woVar.a(false, false);
        woVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(woVar, c8.ha.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28129q5, h6Var);
        jg.g.v(textView, 1, 14.0f, null, 2131754982);
        linearLayout.addView(textView, c8.ha.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final z f37788b;

            {
                this.f37788b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37788b.dismiss();
                        return;
                    case 1:
                        this.f37788b.d1();
                        return;
                    default:
                        wo woVar2 = this.f37788b.Y1;
                        woVar2.a(!woVar2.f40026a.f31279q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.X1 = frameLayout3;
        frameLayout3.addView(linearLayout, c8.ha.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i12 = org.telegram.ui.ActionBar.m6.f27834a7;
        this.f28670a0 = i12;
        v0(org.telegram.ui.ActionBar.m6.w0(i12, this.I0));
        pj0 pj0Var = this.n1;
        int i13 = this.f28705t0;
        pj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(66.0f));
        this.n1.setClipToPadding(false);
        this.n1.r1();
        this.n1.setOnItemClickListener(new di.q4(8, this, h6Var));
        this.F1 = false;
        this.E1 = org.telegram.messenger.g0.L(12.0f);
        this.f35908u1 = 0.35f;
        this.P0 = true;
        this.I1 = true;
        w wVar = new w(this);
        wVar.f57079m = false;
        wVar.C = false;
        wVar.o(wq.h);
        wVar.n(350L);
        this.n1.setItemAnimator(wVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Z1 = frameLayout4;
        frameLayout4.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, org.telegram.ui.ActionBar.m6.w0(i12, this.I0)), org.telegram.ui.ActionBar.m6.w0(i12, this.I0), org.telegram.ui.ActionBar.m6.w0(i12, this.I0)}));
        FrameLayout.LayoutParams e10 = c8.ha.e(-1, -2, 80);
        int i14 = e10.leftMargin;
        int i15 = this.f28705t0;
        e10.leftMargin = i14 + i15;
        e10.rightMargin += i15;
        this.f28672b.addView(frameLayout4, e10);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f40778a2 = frameLayout5;
        FrameLayout.LayoutParams d = c8.ha.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i16 = d.leftMargin;
        int i17 = this.f28705t0;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.f28672b.addView(frameLayout5, d);
        fi.d h = org.telegram.messenger.k5.h(24, context, h6Var, true);
        this.f40779b2 = h;
        h.setText(org.telegram.messenger.id.M0(2131754981, null));
        h.setOnClickListener(new org.telegram.ui.ActionBar.l1(18, this, h6Var));
        frameLayout4.addView(h, c8.ha.e(-1, 48, 119));
        e1();
        this.f40785i2.O(false);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(pj0Var, getContext(), this.f28669a, 0, true, new d(this, 2), this.I0);
        this.f40785i2 = m41Var;
        m41Var.f35845r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        int i7;
        if (this.f40781e2 != null) {
            i7 = 2131754996;
        } else {
            i7 = 2131754988;
        }
        return org.telegram.messenger.id.M0(i7, null);
    }

    public final void d1() {
        if (this.d2 != null) {
            return;
        }
        x xVar = new x(this, getContext(), Integer.valueOf(org.telegram.messenger.g0.L(150.0f)), this.I0, r6);
        xVar.setSelected(this.f40780c2);
        xVar.setSaveState(1);
        y yVar = new y(this, xVar);
        this.d2 = yVar;
        org.telegram.ui.k11[] k11VarArr = {yVar};
        yVar.showAsDropDown(this.T1, org.telegram.messenger.g0.L(150.0f), -org.telegram.messenger.g0.L(390.0f), 80);
        k11VarArr[0].b();
    }

    public final void e1() {
        boolean z9;
        if (this.f40780c2 != null && this.V1.getText().length() > 0 && this.W1.getText().length() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f40779b2.setEnabled(z9);
    }

    public final void f1() {
        this.f40784h2 = 0;
        Long l10 = this.f40780c2;
        k9 k9Var = this.U1;
        if (l10 == null) {
            k9Var.setImageResource(2131231887);
            k9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.W5, this.I0), PorterDuff.Mode.SRC_IN));
            return;
        }
        k9Var.setAnimatedEmojiDrawable(new h5(4, this.f28669a, this.f40780c2.longValue()));
        k9Var.setColorFilter(null);
        k9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27998j5, this.I0), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void q0(float f10) {
        super.q0(f10);
        this.Z1.setTranslationY(f10);
    }

    @Override
    public final void s0() {
        int i7;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27834a7, this.I0);
            if (w02 != this.f40786j2) {
                this.f40786j2 = w02;
                v0(w02);
                this.Z1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        k9 k9Var = this.U1;
        if (k9Var != null) {
            try {
                if (this.f40780c2 == null) {
                    i7 = org.telegram.ui.ActionBar.m6.W5;
                } else {
                    i7 = org.telegram.ui.ActionBar.m6.f27998j5;
                }
                int w03 = org.telegram.ui.ActionBar.m6.w0(i7, this.I0);
                if (w03 != this.f40784h2) {
                    this.f40784h2 = w03;
                    if (this.f40780c2 == null) {
                        k9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                    } else {
                        k9Var.setEmojiColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                    }
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }
}
