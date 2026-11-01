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
public final class z extends ha {
    public final FrameLayout P1;
    public final FrameLayout Q1;
    public final g9 R1;
    public final org.telegram.ui.Cells.m3 S1;
    public final org.telegram.ui.Cells.m3 T1;
    public final FrameLayout U1;
    public final ep V1;
    public final FrameLayout W1;
    public final FrameLayout X1;
    public final vh.d Y1;
    public Long Z1;
    public y a2;
    public TL_aicompose.TL_aiComposeTone f32948b2;
    public f f32949c2;
    public f f32950d2;
    public int f32951e2;
    public q51 f32952f2;
    public int f32953g2;

    public z(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, true, false, 2, p6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231270);
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.t(imageView, i10, p6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i10, this.I0)), 1, -1);
        org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.1f, i10);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, L, p6Var);
        this.l1.addView(imageView, w7.b6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.e6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final z f30142b;

            {
                this.f30142b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30142b.dismiss();
                        return;
                    case 1:
                        this.f30142b.d1();
                        return;
                    default:
                        ep epVar = this.f30142b.V1;
                        epVar.a(!epVar.f25895a.f23920q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.P1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q1 = frameLayout2;
        int L2 = org.telegram.messenger.i0.L(100.0f);
        int i11 = org.telegram.ui.ActionBar.t6.f20930d6;
        ShapeDrawable L3 = org.telegram.ui.ActionBar.t6.L(L2, org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        frameLayout2.setBackground(L3);
        org.telegram.ui.ActionBar.a7.k(frameLayout2, L3, N, null, p6Var);
        w7.e6.a(frameLayout2);
        frameLayout.addView(frameLayout2, w7.b6.e(100, 100, 17));
        g9 g9Var = new g9(context);
        this.R1 = g9Var;
        f1();
        frameLayout2.addView(g9Var, w7.b6.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final z f30142b;

            {
                this.f30142b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30142b.dismiss();
                        return;
                    case 1:
                        this.f30142b.d1();
                        return;
                    default:
                        ep epVar = this.f30142b.V1;
                        epVar.a(!epVar.f25895a.f23920q, true);
                        return;
                }
            }
        });
        org.telegram.ui.Cells.m3 m3Var = new org.telegram.ui.Cells.m3(context, org.telegram.messenger.dd.L0(2131754965, null), false, false, ((org.telegram.messenger.l0) org.telegram.messenger.wp.r1(this.f21584a).f19300y7.Q.f10701a).f16855c, p6Var);
        this.S1 = m3Var;
        m3Var.d.addTextChangedListener(new v(this, 0));
        org.telegram.ui.Cells.m3 m3Var2 = new org.telegram.ui.Cells.m3(context, org.telegram.messenger.dd.L0(2131754972, null), true, false, ((org.telegram.messenger.l0) org.telegram.messenger.wp.r1(this.f21584a).f19300y7.R.f10701a).f16855c, p6Var);
        this.T1 = m3Var2;
        m3Var2.setShowLimitWhenNear(Math.max(100, ((org.telegram.messenger.l0) org.telegram.messenger.wp.r1(this.f21584a).f19300y7.R.f10701a).f16855c / 2));
        m3Var2.d.addTextChangedListener(new v(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i12 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), 24, 24);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i12);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.a7.k(linearLayout, a02, null, N2, p6Var);
        ep epVar = new ep(24, context, p6Var);
        this.V1 = epVar;
        epVar.b(org.telegram.ui.ActionBar.t6.f21004h7, org.telegram.ui.ActionBar.t6.f21040j7, org.telegram.ui.ActionBar.t6.f21060k7);
        epVar.setDrawUnchecked(true);
        epVar.a(false, false);
        epVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(epVar, w7.b6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q5, p6Var);
        sc.e.u(textView, 1, 14.0f, null, 2131754982);
        linearLayout.addView(textView, w7.b6.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final z f30142b;

            {
                this.f30142b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f30142b.dismiss();
                        return;
                    case 1:
                        this.f30142b.d1();
                        return;
                    default:
                        ep epVar2 = this.f30142b.V1;
                        epVar2.a(!epVar2.f25895a.f23920q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.U1 = frameLayout3;
        frameLayout3.addView(linearLayout, w7.b6.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i13 = org.telegram.ui.ActionBar.t6.f20873a7;
        this.f21585a0 = i13;
        v0(org.telegram.ui.ActionBar.t6.w0(i13, this.I0));
        uk0 uk0Var = this.f26724k1;
        int i14 = this.f21616t0;
        uk0Var.setPadding(i14, 0, i14, org.telegram.messenger.i0.L(66.0f));
        this.f26724k1.setClipToPadding(false);
        this.f26724k1.r1();
        this.f26724k1.setOnItemClickListener(new mg.q0(7, this, p6Var));
        this.C1 = false;
        this.B1 = org.telegram.messenger.i0.L(12.0f);
        this.f26730r1 = 0.35f;
        this.P0 = true;
        this.F1 = true;
        w wVar = new w(this);
        wVar.f47938m = false;
        wVar.C = false;
        wVar.o(gr.h);
        wVar.n(350L);
        this.f26724k1.setItemAnimator(wVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.W1 = frameLayout4;
        frameLayout4.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, org.telegram.ui.ActionBar.t6.w0(i13, this.I0)), org.telegram.ui.ActionBar.t6.w0(i13, this.I0), org.telegram.ui.ActionBar.t6.w0(i13, this.I0)}));
        FrameLayout.LayoutParams e = w7.b6.e(-1, -2, 80);
        int i15 = e.leftMargin;
        int i16 = this.f21616t0;
        e.leftMargin = i15 + i16;
        e.rightMargin += i16;
        this.f21587b.addView(frameLayout4, e);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.X1 = frameLayout5;
        FrameLayout.LayoutParams d = w7.b6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i17 = d.leftMargin;
        int i18 = this.f21616t0;
        d.leftMargin = i17 + i18;
        d.rightMargin += i18;
        this.f21587b.addView(frameLayout5, d);
        vh.d i19 = org.telegram.messenger.a30.i(24, context, p6Var, true);
        this.Y1 = i19;
        i19.setText(org.telegram.messenger.dd.L0(2131754981, null));
        i19.setOnClickListener(new org.telegram.ui.ud(10, this, p6Var));
        frameLayout4.addView(i19, w7.b6.e(-1, 48, 119));
        e1();
        this.f32952f2.O(false);
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        q51 q51Var = new q51(uk0Var, getContext(), this.f21584a, 0, true, new d(this, 2), this.I0);
        this.f32952f2 = q51Var;
        q51Var.f29638r = false;
        return q51Var;
    }

    @Override
    public final CharSequence O0() {
        int i10;
        if (this.f32948b2 != null) {
            i10 = 2131754996;
        } else {
            i10 = 2131754988;
        }
        return org.telegram.messenger.dd.L0(i10, null);
    }

    public final void d1() {
        if (this.a2 != null) {
            return;
        }
        x xVar = new x(this, getContext(), Integer.valueOf(org.telegram.messenger.i0.L(150.0f)), this.I0, r6);
        xVar.setSelected(this.Z1);
        xVar.setSaveState(1);
        y yVar = new y(this, xVar);
        this.a2 = yVar;
        org.telegram.ui.x21[] x21VarArr = {yVar};
        yVar.showAsDropDown(this.Q1, org.telegram.messenger.i0.L(150.0f), -org.telegram.messenger.i0.L(390.0f), 80);
        x21VarArr[0].b();
    }

    public final void e1() {
        boolean z10;
        if (this.Z1 != null && this.S1.getText().length() > 0 && this.T1.getText().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Y1.setEnabled(z10);
    }

    public final void f1() {
        this.f32951e2 = 0;
        Long l4 = this.Z1;
        g9 g9Var = this.R1;
        if (l4 == null) {
            g9Var.setImageResource(2131231886);
            g9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.W5, this.I0), PorterDuff.Mode.SRC_IN));
            return;
        }
        g9Var.setAnimatedEmojiDrawable(new f5(4, this.f21584a, this.Z1.longValue()));
        g9Var.setColorFilter(null);
        g9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21038j5, this.I0), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void q0(float f7) {
        super.q0(f7);
        this.W1.setTranslationY(f7);
    }

    @Override
    public final void s0() {
        int i10;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a7, this.I0);
            if (w02 != this.f32953g2) {
                this.f32953g2 = w02;
                v0(w02);
                this.W1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        g9 g9Var = this.R1;
        if (g9Var != null) {
            try {
                if (this.Z1 == null) {
                    i10 = org.telegram.ui.ActionBar.t6.W5;
                } else {
                    i10 = org.telegram.ui.ActionBar.t6.f21038j5;
                }
                int w03 = org.telegram.ui.ActionBar.t6.w0(i10, this.I0);
                if (w03 != this.f32951e2) {
                    this.f32951e2 = w03;
                    if (this.Z1 == null) {
                        g9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                    } else {
                        g9Var.setEmojiColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                    }
                }
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
        }
    }
}
