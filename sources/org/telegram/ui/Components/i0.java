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
public final class i0 extends sa {
    public final FrameLayout T1;
    public final FrameLayout U1;
    public final q9 V1;
    public final org.telegram.ui.Cells.l3 W1;
    public final org.telegram.ui.Cells.l3 X1;
    public final FrameLayout Y1;
    public final op Z1;
    public final FrameLayout f36058a2;
    public final FrameLayout f36059b2;
    public final hi.e f36060c2;
    public Long d2;
    public h0 f36061e2;
    public TL_aicompose.TL_aiComposeTone f36062f2;
    public f f36063g2;
    public f f36064h2;
    public int f36065i2;
    public c51 f36066j2;
    public int f36067k2;

    public i0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, true, false, 2, h6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i7, this.J0)), 1, -1);
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.1f, i7);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, K, h6Var);
        this.f39533p1.addView(imageView, c8.ma.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        c8.ra.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f33684b;

            {
                this.f33684b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33684b.dismiss();
                        return;
                    case 1:
                        this.f33684b.e1();
                        return;
                    default:
                        op opVar = this.f33684b.Z1;
                        opVar.a(!opVar.f38321a.f32874q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.U1 = frameLayout2;
        int L = org.telegram.messenger.g0.L(100.0f);
        int i10 = org.telegram.ui.ActionBar.m6.f29381d6;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.t6.j(frameLayout2, L2, M, null, h6Var);
        c8.ra.a(frameLayout2);
        frameLayout.addView(frameLayout2, c8.ma.e(100, 100, 17));
        q9 q9Var = new q9(context);
        this.V1 = q9Var;
        g1();
        frameLayout2.addView(q9Var, c8.ma.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f33684b;

            {
                this.f33684b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33684b.dismiss();
                        return;
                    case 1:
                        this.f33684b.e1();
                        return;
                    default:
                        op opVar = this.f33684b.Z1;
                        opVar.a(!opVar.f38321a.f32874q, true);
                        return;
                }
            }
        });
        org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context, org.telegram.messenger.hd.N0(2131754965, null), false, false, ((org.telegram.messenger.j0) org.telegram.messenger.np.u1(this.f30173a).A7.V.f15508b).f24812c, h6Var);
        this.W1 = l3Var;
        l3Var.d.addTextChangedListener(new e0(this, 0));
        org.telegram.ui.Cells.l3 l3Var2 = new org.telegram.ui.Cells.l3(context, org.telegram.messenger.hd.N0(2131754972, null), true, false, ((org.telegram.messenger.j0) org.telegram.messenger.np.u1(this.f30173a).A7.W.f15508b).f24812c, h6Var);
        this.X1 = l3Var2;
        l3Var2.setShowLimitWhenNear(Math.max(100, ((org.telegram.messenger.j0) org.telegram.messenger.np.u1(this.f30173a).A7.W.f15508b).f24812c / 2));
        l3Var2.d.addTextChangedListener(new e0(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i11 = org.telegram.ui.ActionBar.m6.f29473i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), 24, 24);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i11);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.t6.j(linearLayout, a02, null, M2, h6Var);
        op opVar = new op(24, context, h6Var);
        this.Z1 = opVar;
        opVar.b(org.telegram.ui.ActionBar.m6.h7, org.telegram.ui.ActionBar.m6.f29491j7, org.telegram.ui.ActionBar.m6.f29511k7);
        opVar.setDrawUnchecked(true);
        opVar.a(false, false);
        opVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(opVar, c8.ma.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29620q5, h6Var);
        i5.c.r(14.0f, 1, 2131754982, textView, null);
        linearLayout.addView(textView, c8.ma.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f33684b;

            {
                this.f33684b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33684b.dismiss();
                        return;
                    case 1:
                        this.f33684b.e1();
                        return;
                    default:
                        op opVar2 = this.f33684b.Z1;
                        opVar2.a(!opVar2.f38321a.f32874q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Y1 = frameLayout3;
        frameLayout3.addView(linearLayout, c8.ma.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i12 = org.telegram.ui.ActionBar.m6.f29324a7;
        this.f30177b0 = i12;
        v0(org.telegram.ui.ActionBar.m6.w0(i12, this.J0));
        ek0 ek0Var = this.f39532o1;
        int i13 = this.f30211u0;
        ek0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(66.0f));
        this.f39532o1.setClipToPadding(false);
        this.f39532o1.r1();
        this.f39532o1.setOnItemClickListener(new fi.g4(8, this, h6Var));
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        this.f39539v1 = 0.35f;
        this.Q0 = true;
        this.J1 = true;
        f0 f0Var = new f0(this);
        f0Var.f59194m = false;
        f0Var.C = false;
        f0Var.o(nr.h);
        f0Var.n(350L);
        this.f39532o1.setItemAnimator(f0Var);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f36058a2 = frameLayout4;
        frameLayout4.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, org.telegram.ui.ActionBar.m6.w0(i12, this.J0)), org.telegram.ui.ActionBar.m6.w0(i12, this.J0), org.telegram.ui.ActionBar.m6.w0(i12, this.J0)}));
        FrameLayout.LayoutParams e10 = c8.ma.e(-1, -2, 80);
        int i14 = e10.leftMargin;
        int i15 = this.f30211u0;
        e10.leftMargin = i14 + i15;
        e10.rightMargin += i15;
        this.f30176b.addView(frameLayout4, e10);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f36059b2 = frameLayout5;
        FrameLayout.LayoutParams d = c8.ma.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i16 = d.leftMargin;
        int i17 = this.f30211u0;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.f30176b.addView(frameLayout5, d);
        hi.e g10 = org.telegram.messenger.o10.g(24, context, h6Var, true);
        this.f36060c2 = g10;
        g10.setText(org.telegram.messenger.hd.N0(2131754981, null));
        g10.setOnClickListener(new oi.i1(20, this, h6Var));
        frameLayout4.addView(g10, c8.ma.e(-1, 48, 119));
        f1();
        this.f36066j2.O(false);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(ek0Var, getContext(), this.f30173a, 0, true, new d(this, 2), this.J0);
        this.f36066j2 = c51Var;
        c51Var.f34062r = false;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        int i7;
        if (this.f36062f2 != null) {
            i7 = 2131754996;
        } else {
            i7 = 2131754988;
        }
        return org.telegram.messenger.hd.N0(i7, null);
    }

    public final void e1() {
        if (this.f36061e2 != null) {
            return;
        }
        g0 g0Var = new g0(this, getContext(), Integer.valueOf(org.telegram.messenger.g0.L(150.0f)), this.J0, r6);
        g0Var.setSelected(this.d2);
        g0Var.setSaveState(1);
        h0 h0Var = new h0(this, g0Var);
        this.f36061e2 = h0Var;
        org.telegram.ui.j11[] j11VarArr = {h0Var};
        h0Var.showAsDropDown(this.U1, org.telegram.messenger.g0.L(150.0f), -org.telegram.messenger.g0.L(390.0f), 80);
        j11VarArr[0].b();
    }

    public final void f1() {
        boolean z10;
        if (this.d2 != null && this.W1.getText().length() > 0 && this.X1.getText().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36060c2.setEnabled(z10);
    }

    public final void g1() {
        this.f36065i2 = 0;
        Long l10 = this.d2;
        q9 q9Var = this.V1;
        if (l10 == null) {
            q9Var.setImageResource(2131231888);
            q9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.W5, this.J0), PorterDuff.Mode.SRC_IN));
            return;
        }
        q9Var.setAnimatedEmojiDrawable(new p5(4, this.f30173a, this.d2.longValue()));
        q9Var.setColorFilter(null);
        q9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29489j5, this.J0), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void q0(float f10) {
        super.q0(f10);
        this.f36058a2.setTranslationY(f10);
    }

    @Override
    public final void s0() {
        int i7;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29324a7, this.J0);
            if (w02 != this.f36067k2) {
                this.f36067k2 = w02;
                v0(w02);
                this.f36058a2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        q9 q9Var = this.V1;
        if (q9Var != null) {
            try {
                if (this.d2 == null) {
                    i7 = org.telegram.ui.ActionBar.m6.W5;
                } else {
                    i7 = org.telegram.ui.ActionBar.m6.f29489j5;
                }
                int w03 = org.telegram.ui.ActionBar.m6.w0(i7, this.J0);
                if (w03 != this.f36065i2) {
                    this.f36065i2 = w03;
                    if (this.d2 == null) {
                        q9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                    } else {
                        q9Var.setEmojiColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                    }
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }
}
