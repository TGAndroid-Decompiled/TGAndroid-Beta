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
public final class a0 extends na {
    public final FrameLayout P1;
    public final FrameLayout Q1;
    public final l9 R1;
    public final org.telegram.ui.Cells.k3 S1;
    public final org.telegram.ui.Cells.k3 T1;
    public final FrameLayout U1;
    public final wo V1;
    public final FrameLayout W1;
    public final FrameLayout X1;
    public final fi.d Y1;
    public Long Z1;
    public z f31614a2;
    public TL_aicompose.TL_aiComposeTone f31615b2;
    public g f31616c2;
    public g d2;
    public int f31617e2;
    public f41 f31618f2;
    public int f31619g2;

    public a0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, true, false, 2, f6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i7, f6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i7, this.I0)), 1, -1);
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.1f, i7);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, L, f6Var);
        this.l1.addView(imageView, c8.ha.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        c8.ka.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final a0 f38207b;

            {
                this.f38207b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38207b.dismiss();
                        return;
                    case 1:
                        this.f38207b.d1();
                        return;
                    default:
                        wo woVar = this.f38207b.V1;
                        woVar.a(!woVar.f40043a.f31258q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.P1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q1 = frameLayout2;
        int L2 = org.telegram.messenger.g0.L(100.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f27848d6;
        ShapeDrawable L3 = org.telegram.ui.ActionBar.k6.L(L2, org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        frameLayout2.setBackground(L3);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, L3, N, null, f6Var);
        c8.ka.a(frameLayout2);
        frameLayout.addView(frameLayout2, c8.ha.e(100, 100, 17));
        l9 l9Var = new l9(context);
        this.R1 = l9Var;
        f1();
        frameLayout2.addView(l9Var, c8.ha.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final a0 f38207b;

            {
                this.f38207b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38207b.dismiss();
                        return;
                    case 1:
                        this.f38207b.d1();
                        return;
                    default:
                        wo woVar = this.f38207b.V1;
                        woVar.a(!woVar.f40043a.f31258q, true);
                        return;
                }
            }
        });
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.hd.M0(2131754965, null), false, false, ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(this.f28612a).f24927x7.Q.f13555b).f23432c, f6Var);
        this.S1 = k3Var;
        k3Var.d.addTextChangedListener(new w(this, 0));
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.hd.M0(2131754972, null), true, false, ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(this.f28612a).f24927x7.R.f13555b).f23432c, f6Var);
        this.T1 = k3Var2;
        k3Var2.setShowLimitWhenNear(Math.max(100, ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(this.f28612a).f24927x7.R.f13555b).f23432c / 2));
        k3Var2.d.addTextChangedListener(new w(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i11 = org.telegram.ui.ActionBar.k6.f27940i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i11, f6Var), 24, 24);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(linearLayout, a02, null, N2, f6Var);
        wo woVar = new wo(24, context, f6Var);
        this.V1 = woVar;
        woVar.b(org.telegram.ui.ActionBar.k6.h7, org.telegram.ui.ActionBar.k6.f27958j7, org.telegram.ui.ActionBar.k6.f27978k7);
        woVar.setDrawUnchecked(true);
        woVar.a(false, false);
        woVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(woVar, c8.ha.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28087q5, f6Var);
        jg.g.v(textView, 1, 14.0f, null, 2131754982);
        linearLayout.addView(textView, c8.ha.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final a0 f38207b;

            {
                this.f38207b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38207b.dismiss();
                        return;
                    case 1:
                        this.f38207b.d1();
                        return;
                    default:
                        wo woVar2 = this.f38207b.V1;
                        woVar2.a(!woVar2.f40043a.f31258q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.U1 = frameLayout3;
        frameLayout3.addView(linearLayout, c8.ha.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i12 = org.telegram.ui.ActionBar.k6.f27792a7;
        this.f28613a0 = i12;
        v0(org.telegram.ui.ActionBar.k6.w0(i12, this.I0));
        pj0 pj0Var = this.f36328k1;
        int i13 = this.f28645t0;
        pj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(66.0f));
        this.f36328k1.setClipToPadding(false);
        this.f36328k1.r1();
        this.f36328k1.setOnItemClickListener(new di.p4(8, this, f6Var));
        this.C1 = false;
        this.B1 = org.telegram.messenger.g0.L(12.0f);
        this.f36333r1 = 0.35f;
        this.P0 = true;
        this.F1 = true;
        x xVar = new x(this);
        xVar.f56954m = false;
        xVar.C = false;
        xVar.o(xq.h);
        xVar.n(350L);
        this.f36328k1.setItemAnimator(xVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.W1 = frameLayout4;
        frameLayout4.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, org.telegram.ui.ActionBar.k6.w0(i12, this.I0)), org.telegram.ui.ActionBar.k6.w0(i12, this.I0), org.telegram.ui.ActionBar.k6.w0(i12, this.I0)}));
        FrameLayout.LayoutParams e10 = c8.ha.e(-1, -2, 80);
        int i14 = e10.leftMargin;
        int i15 = this.f28645t0;
        e10.leftMargin = i14 + i15;
        e10.rightMargin += i15;
        this.f28615b.addView(frameLayout4, e10);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.X1 = frameLayout5;
        FrameLayout.LayoutParams d = c8.ha.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i16 = d.leftMargin;
        int i17 = this.f28645t0;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.f28615b.addView(frameLayout5, d);
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        this.Y1 = h;
        h.setText(org.telegram.messenger.hd.M0(2131754981, null));
        h.setOnClickListener(new org.telegram.ui.ActionBar.l1(18, this, f6Var));
        frameLayout4.addView(h, c8.ha.e(-1, 48, 119));
        e1();
        this.f31618f2.O(false);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        f41 f41Var = new f41(pj0Var, getContext(), this.f28612a, 0, true, new d(this, 2), this.I0);
        this.f31618f2 = f41Var;
        f41Var.f33473r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        int i7;
        if (this.f31615b2 != null) {
            i7 = 2131754996;
        } else {
            i7 = 2131754988;
        }
        return org.telegram.messenger.hd.M0(i7, null);
    }

    public final void d1() {
        if (this.f31614a2 != null) {
            return;
        }
        y yVar = new y(this, getContext(), Integer.valueOf(org.telegram.messenger.g0.L(150.0f)), this.I0, r6);
        yVar.setSelected(this.Z1);
        yVar.setSaveState(1);
        z zVar = new z(this, yVar);
        this.f31614a2 = zVar;
        org.telegram.ui.h11[] h11VarArr = {zVar};
        zVar.showAsDropDown(this.Q1, org.telegram.messenger.g0.L(150.0f), -org.telegram.messenger.g0.L(390.0f), 80);
        h11VarArr[0].b();
    }

    public final void e1() {
        boolean z9;
        if (this.Z1 != null && this.S1.getText().length() > 0 && this.T1.getText().length() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.Y1.setEnabled(z9);
    }

    public final void f1() {
        this.f31617e2 = 0;
        Long l10 = this.Z1;
        l9 l9Var = this.R1;
        if (l10 == null) {
            l9Var.setImageResource(2131231887);
            l9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W5, this.I0), PorterDuff.Mode.SRC_IN));
            return;
        }
        l9Var.setAnimatedEmojiDrawable(new i5(4, this.f28612a, this.Z1.longValue()));
        l9Var.setColorFilter(null);
        l9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27956j5, this.I0), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void q0(float f10) {
        super.q0(f10);
        this.W1.setTranslationY(f10);
    }

    @Override
    public final void s0() {
        int i7;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27792a7, this.I0);
            if (w02 != this.f31619g2) {
                this.f31619g2 = w02;
                v0(w02);
                this.W1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        l9 l9Var = this.R1;
        if (l9Var != null) {
            try {
                if (this.Z1 == null) {
                    i7 = org.telegram.ui.ActionBar.k6.W5;
                } else {
                    i7 = org.telegram.ui.ActionBar.k6.f27956j5;
                }
                int w03 = org.telegram.ui.ActionBar.k6.w0(i7, this.I0);
                if (w03 != this.f31617e2) {
                    this.f31617e2 = w03;
                    if (this.Z1 == null) {
                        l9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                    } else {
                        l9Var.setEmojiColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                    }
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }
}
