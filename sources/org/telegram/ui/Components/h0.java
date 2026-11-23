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
public final class h0 extends ra {
    public final FrameLayout T1;
    public final FrameLayout U1;
    public final p9 V1;
    public final org.telegram.ui.Cells.l3 W1;
    public final org.telegram.ui.Cells.l3 X1;
    public final FrameLayout Y1;
    public final lp Z1;
    public final FrameLayout f35582a2;
    public final FrameLayout f35583b2;
    public final hi.e f35584c2;
    public Long d2;
    public g0 f35585e2;
    public TL_aicompose.TL_aiComposeTone f35586f2;
    public f f35587g2;
    public f f35588h2;
    public int f35589i2;
    public b51 f35590j2;
    public int f35591k2;

    public h0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, true, false, 2, i6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231272);
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.s(imageView, i7, i6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(i7, this.J0)), 1, -1);
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.1f, i7);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, K, i6Var);
        this.f39247p1.addView(imageView, c8.na.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        c8.sa.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final h0 f33296b;

            {
                this.f33296b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33296b.dismiss();
                        return;
                    case 1:
                        this.f33296b.e1();
                        return;
                    default:
                        lp lpVar = this.f33296b.Z1;
                        lpVar.a(!lpVar.f37189a.f32938q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.U1 = frameLayout2;
        int L = org.telegram.messenger.g0.L(100.0f);
        int i10 = org.telegram.ui.ActionBar.n6.f29451d6;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(frameLayout2, L2, M, null, i6Var);
        c8.sa.a(frameLayout2);
        frameLayout.addView(frameLayout2, c8.na.e(100, 100, 17));
        p9 p9Var = new p9(context);
        this.V1 = p9Var;
        g1();
        frameLayout2.addView(p9Var, c8.na.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final h0 f33296b;

            {
                this.f33296b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33296b.dismiss();
                        return;
                    case 1:
                        this.f33296b.e1();
                        return;
                    default:
                        lp lpVar = this.f33296b.Z1;
                        lpVar.a(!lpVar.f37189a.f32938q, true);
                        return;
                }
            }
        });
        org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context, org.telegram.messenger.gd.N0(2131754965, null), false, false, ((org.telegram.messenger.j0) org.telegram.messenger.mp.u1(this.f30223a).A7.V.f15482b).f24899c, i6Var);
        this.W1 = l3Var;
        l3Var.d.addTextChangedListener(new d0(this, 0));
        org.telegram.ui.Cells.l3 l3Var2 = new org.telegram.ui.Cells.l3(context, org.telegram.messenger.gd.N0(2131754972, null), true, false, ((org.telegram.messenger.j0) org.telegram.messenger.mp.u1(this.f30223a).A7.W.f15482b).f24899c, i6Var);
        this.X1 = l3Var2;
        l3Var2.setShowLimitWhenNear(Math.max(100, ((org.telegram.messenger.j0) org.telegram.messenger.mp.u1(this.f30223a).A7.W.f15482b).f24899c / 2));
        l3Var2.d.addTextChangedListener(new d0(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i11 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), 24, 24);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i11);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.u6.j(linearLayout, a02, null, M2, i6Var);
        lp lpVar = new lp(24, context, i6Var);
        this.Z1 = lpVar;
        lpVar.b(org.telegram.ui.ActionBar.n6.h7, org.telegram.ui.ActionBar.n6.f29561j7, org.telegram.ui.ActionBar.n6.f29581k7);
        lpVar.setDrawUnchecked(true);
        lpVar.a(false, false);
        lpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(lpVar, c8.na.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29690q5, i6Var);
        i5.c.r(14.0f, 1, 2131754982, textView, null);
        linearLayout.addView(textView, c8.na.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final h0 f33296b;

            {
                this.f33296b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33296b.dismiss();
                        return;
                    case 1:
                        this.f33296b.e1();
                        return;
                    default:
                        lp lpVar2 = this.f33296b.Z1;
                        lpVar2.a(!lpVar2.f37189a.f32938q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Y1 = frameLayout3;
        frameLayout3.addView(linearLayout, c8.na.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i12 = org.telegram.ui.ActionBar.n6.f29394a7;
        this.f30227b0 = i12;
        v0(org.telegram.ui.ActionBar.n6.w0(i12, this.J0));
        ek0 ek0Var = this.f39246o1;
        int i13 = this.f30261u0;
        ek0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(66.0f));
        this.f39246o1.setClipToPadding(false);
        this.f39246o1.r1();
        this.f39246o1.setOnItemClickListener(new fi.g4(8, this, i6Var));
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        this.f39253v1 = 0.35f;
        this.Q0 = true;
        this.J1 = true;
        e0 e0Var = new e0(this);
        e0Var.f59274m = false;
        e0Var.C = false;
        e0Var.o(kr.h);
        e0Var.n(350L);
        this.f39246o1.setItemAnimator(e0Var);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f35582a2 = frameLayout4;
        frameLayout4.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.n6.r1(0.0f, org.telegram.ui.ActionBar.n6.w0(i12, this.J0)), org.telegram.ui.ActionBar.n6.w0(i12, this.J0), org.telegram.ui.ActionBar.n6.w0(i12, this.J0)}));
        FrameLayout.LayoutParams e10 = c8.na.e(-1, -2, 80);
        int i14 = e10.leftMargin;
        int i15 = this.f30261u0;
        e10.leftMargin = i14 + i15;
        e10.rightMargin += i15;
        this.f30226b.addView(frameLayout4, e10);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f35583b2 = frameLayout5;
        FrameLayout.LayoutParams d = c8.na.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i16 = d.leftMargin;
        int i17 = this.f30261u0;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.f30226b.addView(frameLayout5, d);
        hi.e g10 = org.telegram.messenger.m10.g(24, context, i6Var, true);
        this.f35584c2 = g10;
        g10.setText(org.telegram.messenger.gd.N0(2131754981, null));
        g10.setOnClickListener(new oi.i1(20, this, i6Var));
        frameLayout4.addView(g10, c8.na.e(-1, 48, 119));
        f1();
        this.f35590j2.O(false);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(ek0Var, getContext(), this.f30223a, 0, true, new d(this, 2), this.J0);
        this.f35590j2 = b51Var;
        b51Var.f33631r = false;
        return b51Var;
    }

    @Override
    public final CharSequence P0() {
        int i7;
        if (this.f35586f2 != null) {
            i7 = 2131754996;
        } else {
            i7 = 2131754988;
        }
        return org.telegram.messenger.gd.N0(i7, null);
    }

    public final void e1() {
        if (this.f35585e2 != null) {
            return;
        }
        f0 f0Var = new f0(this, getContext(), Integer.valueOf(org.telegram.messenger.g0.L(150.0f)), this.J0, r6);
        f0Var.setSelected(this.d2);
        f0Var.setSaveState(1);
        g0 g0Var = new g0(this, f0Var);
        this.f35585e2 = g0Var;
        org.telegram.ui.h11[] h11VarArr = {g0Var};
        g0Var.showAsDropDown(this.U1, org.telegram.messenger.g0.L(150.0f), -org.telegram.messenger.g0.L(390.0f), 80);
        h11VarArr[0].b();
    }

    public final void f1() {
        boolean z10;
        if (this.d2 != null && this.W1.getText().length() > 0 && this.X1.getText().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35584c2.setEnabled(z10);
    }

    public final void g1() {
        this.f35589i2 = 0;
        Long l10 = this.d2;
        p9 p9Var = this.V1;
        if (l10 == null) {
            p9Var.setImageResource(2131231891);
            p9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.W5, this.J0), PorterDuff.Mode.SRC_IN));
            return;
        }
        p9Var.setAnimatedEmojiDrawable(new o5(4, this.f30223a, this.d2.longValue()));
        p9Var.setColorFilter(null);
        p9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29559j5, this.J0), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void q0(float f10) {
        super.q0(f10);
        this.f35582a2.setTranslationY(f10);
    }

    @Override
    public final void s0() {
        int i7;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394a7, this.J0);
            if (w02 != this.f35591k2) {
                this.f35591k2 = w02;
                v0(w02);
                this.f35582a2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.n6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        p9 p9Var = this.V1;
        if (p9Var != null) {
            try {
                if (this.d2 == null) {
                    i7 = org.telegram.ui.ActionBar.n6.W5;
                } else {
                    i7 = org.telegram.ui.ActionBar.n6.f29559j5;
                }
                int w03 = org.telegram.ui.ActionBar.n6.w0(i7, this.J0);
                if (w03 != this.f35589i2) {
                    this.f35589i2 = w03;
                    if (this.d2 == null) {
                        p9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                    } else {
                        p9Var.setEmojiColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                    }
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }
}
