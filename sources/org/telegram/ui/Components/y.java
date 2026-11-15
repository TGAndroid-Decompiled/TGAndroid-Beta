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
public final class y extends ja {
    public final FrameLayout T1;
    public final FrameLayout U1;
    public final i9 V1;
    public final org.telegram.ui.Cells.k3 W1;
    public final org.telegram.ui.Cells.k3 X1;
    public final FrameLayout Y1;
    public final fp Z1;
    public final FrameLayout f41810a2;
    public final FrameLayout f41811b2;
    public final hi.d f41812c2;
    public Long d2;
    public x f41813e2;
    public TL_aicompose.TL_aiComposeTone f41814f2;
    public f f41815g2;
    public f f41816h2;
    public int f41817i2;
    public p41 f41818j2;
    public int f41819k2;

    public y(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, true, false, 2, e6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.s(imageView, i7, e6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i7, this.J0)), 1, -1);
        org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.1f, i7);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView, h02, null, K, e6Var);
        this.f35932p1.addView(imageView, c8.ja.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        c8.na.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final y f38795b;

            {
                this.f38795b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38795b.dismiss();
                        return;
                    case 1:
                        this.f38795b.d1();
                        return;
                    default:
                        fp fpVar = this.f38795b.Z1;
                        fpVar.a(!fpVar.f34667a.f32441q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.U1 = frameLayout2;
        int L = org.telegram.messenger.g0.L(100.0f);
        int i10 = org.telegram.ui.ActionBar.j6.f28849d6;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.q6.j(frameLayout2, L2, M, null, e6Var);
        c8.na.a(frameLayout2);
        frameLayout.addView(frameLayout2, c8.ja.e(100, 100, 17));
        i9 i9Var = new i9(context);
        this.V1 = i9Var;
        f1();
        frameLayout2.addView(i9Var, c8.ja.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final y f38795b;

            {
                this.f38795b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38795b.dismiss();
                        return;
                    case 1:
                        this.f38795b.d1();
                        return;
                    default:
                        fp fpVar = this.f38795b.Z1;
                        fpVar.a(!fpVar.f34667a.f32441q, true);
                        return;
                }
            }
        });
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.hd.M0(2131754965, null), false, false, ((org.telegram.messenger.j0) org.telegram.messenger.np.s1(this.f29679a).f25451y7.Q.f15881b).f24498c, e6Var);
        this.W1 = k3Var;
        k3Var.d.addTextChangedListener(new u(this, 0));
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.hd.M0(2131754972, null), true, false, ((org.telegram.messenger.j0) org.telegram.messenger.np.s1(this.f29679a).f25451y7.R.f15881b).f24498c, e6Var);
        this.X1 = k3Var2;
        k3Var2.setShowLimitWhenNear(Math.max(100, ((org.telegram.messenger.j0) org.telegram.messenger.np.s1(this.f29679a).f25451y7.R.f15881b).f24498c / 2));
        k3Var2.d.addTextChangedListener(new u(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i11 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i11, e6Var), 24, 24);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i11);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.q6.j(linearLayout, a02, null, M2, e6Var);
        fp fpVar = new fp(24, context, e6Var);
        this.Z1 = fpVar;
        fpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.f28959j7, org.telegram.ui.ActionBar.j6.f28979k7);
        fpVar.setDrawUnchecked(true);
        fpVar.a(false, false);
        fpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(fpVar, c8.ja.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29088q5, e6Var);
        i5.c.w(textView, 1, 14.0f, null, 2131754982);
        linearLayout.addView(textView, c8.ja.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final y f38795b;

            {
                this.f38795b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38795b.dismiss();
                        return;
                    case 1:
                        this.f38795b.d1();
                        return;
                    default:
                        fp fpVar2 = this.f38795b.Z1;
                        fpVar2.a(!fpVar2.f34667a.f32441q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Y1 = frameLayout3;
        frameLayout3.addView(linearLayout, c8.ja.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i12 = org.telegram.ui.ActionBar.j6.f28792a7;
        this.f29683b0 = i12;
        v0(org.telegram.ui.ActionBar.j6.w0(i12, this.J0));
        uj0 uj0Var = this.f35931o1;
        int i13 = this.f29717u0;
        uj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(66.0f));
        this.f35931o1.setClipToPadding(false);
        this.f35931o1.r1();
        this.f35931o1.setOnItemClickListener(new fi.i4(8, this, e6Var));
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        this.f35938v1 = 0.35f;
        this.Q0 = true;
        this.J1 = true;
        v vVar = new v(this);
        vVar.f58564m = false;
        vVar.C = false;
        vVar.o(er.h);
        vVar.n(350L);
        this.f35931o1.setItemAnimator(vVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f41810a2 = frameLayout4;
        frameLayout4.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, org.telegram.ui.ActionBar.j6.w0(i12, this.J0)), org.telegram.ui.ActionBar.j6.w0(i12, this.J0), org.telegram.ui.ActionBar.j6.w0(i12, this.J0)}));
        FrameLayout.LayoutParams e10 = c8.ja.e(-1, -2, 80);
        int i14 = e10.leftMargin;
        int i15 = this.f29717u0;
        e10.leftMargin = i14 + i15;
        e10.rightMargin += i15;
        this.f29682b.addView(frameLayout4, e10);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f41811b2 = frameLayout5;
        FrameLayout.LayoutParams d = c8.ja.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i16 = d.leftMargin;
        int i17 = this.f29717u0;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.f29682b.addView(frameLayout5, d);
        hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        this.f41812c2 = g10;
        g10.setText(org.telegram.messenger.hd.M0(2131754981, null));
        g10.setOnClickListener(new org.telegram.messenger.video.e(25, this, e6Var));
        frameLayout4.addView(g10, c8.ja.e(-1, 48, 119));
        e1();
        this.f41818j2.O(false);
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(uj0Var, getContext(), this.f29679a, 0, true, new d(this, 2), this.J0);
        this.f41818j2 = p41Var;
        p41Var.f38199r = false;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        int i7;
        if (this.f41814f2 != null) {
            i7 = 2131754996;
        } else {
            i7 = 2131754988;
        }
        return org.telegram.messenger.hd.M0(i7, null);
    }

    public final void d1() {
        if (this.f41813e2 != null) {
            return;
        }
        w wVar = new w(this, getContext(), Integer.valueOf(org.telegram.messenger.g0.L(150.0f)), this.J0, r6);
        wVar.setSelected(this.d2);
        wVar.setSaveState(1);
        x xVar = new x(this, wVar);
        this.f41813e2 = xVar;
        org.telegram.ui.e11[] e11VarArr = {xVar};
        xVar.showAsDropDown(this.U1, org.telegram.messenger.g0.L(150.0f), -org.telegram.messenger.g0.L(390.0f), 80);
        e11VarArr[0].b();
    }

    public final void e1() {
        boolean z10;
        if (this.d2 != null && this.W1.getText().length() > 0 && this.X1.getText().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41812c2.setEnabled(z10);
    }

    public final void f1() {
        this.f41817i2 = 0;
        Long l10 = this.d2;
        i9 i9Var = this.V1;
        if (l10 == null) {
            i9Var.setImageResource(2131231887);
            i9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.W5, this.J0), PorterDuff.Mode.SRC_IN));
            return;
        }
        i9Var.setAnimatedEmojiDrawable(new g5(4, this.f29679a, this.d2.longValue()));
        i9Var.setColorFilter(null);
        i9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28957j5, this.J0), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void q0(float f10) {
        super.q0(f10);
        this.f41810a2.setTranslationY(f10);
    }

    @Override
    public final void s0() {
        int i7;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, this.J0);
            if (w02 != this.f41819k2) {
                this.f41819k2 = w02;
                v0(w02);
                this.f41810a2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        i9 i9Var = this.V1;
        if (i9Var != null) {
            try {
                if (this.d2 == null) {
                    i7 = org.telegram.ui.ActionBar.j6.W5;
                } else {
                    i7 = org.telegram.ui.ActionBar.j6.f28957j5;
                }
                int w03 = org.telegram.ui.ActionBar.j6.w0(i7, this.J0);
                if (w03 != this.f41817i2) {
                    this.f41817i2 = w03;
                    if (this.d2 == null) {
                        i9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                    } else {
                        i9Var.setEmojiColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                    }
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }
}
