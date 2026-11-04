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
    public final FrameLayout Q1;
    public final FrameLayout R1;
    public final k9 S1;
    public final org.telegram.ui.Cells.k3 T1;
    public final org.telegram.ui.Cells.k3 U1;
    public final FrameLayout V1;
    public final wo W1;
    public final FrameLayout X1;
    public final FrameLayout Y1;
    public final gi.d Z1;
    public Long f40876a2;
    public y f40877b2;
    public TL_aicompose.TL_aiComposeTone c2;
    public g f40878d2;
    public g f40879e2;
    public int f40880f2;
    public f41 f40881g2;
    public int f40882h2;

    public z(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, true, false, 2, e6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i3, e6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i3, this.J0)), 1, -1);
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.1f, i3);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, L, e6Var);
        this.m1.addView(imageView, b8.mf.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        b8.pf.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final z f37870b;

            {
                this.f37870b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37870b.dismiss();
                        return;
                    case 1:
                        this.f37870b.d1();
                        return;
                    default:
                        wo woVar = this.f37870b.W1;
                        woVar.a(!woVar.f40035a.f31334q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R1 = frameLayout2;
        int L2 = org.telegram.messenger.g0.L(100.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f27878d6;
        ShapeDrawable L3 = org.telegram.ui.ActionBar.k6.L(L2, org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        frameLayout2.setBackground(L3);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, L3, N, null, e6Var);
        b8.pf.a(frameLayout2);
        frameLayout.addView(frameLayout2, b8.mf.e(100, 100, 17));
        k9 k9Var = new k9(context);
        this.S1 = k9Var;
        f1();
        frameLayout2.addView(k9Var, b8.mf.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final z f37870b;

            {
                this.f37870b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37870b.dismiss();
                        return;
                    case 1:
                        this.f37870b.d1();
                        return;
                    default:
                        wo woVar = this.f37870b.W1;
                        woVar.a(!woVar.f40035a.f31334q, true);
                        return;
                }
            }
        });
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.bd.M0(2131754965, null), false, false, ((org.telegram.messenger.j0) org.telegram.messenger.hp.s1(this.f28583a).f23167x7.Q.f13798b).f23620c, e6Var);
        this.T1 = k3Var;
        k3Var.d.addTextChangedListener(new v(this, 0));
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.bd.M0(2131754972, null), true, false, ((org.telegram.messenger.j0) org.telegram.messenger.hp.s1(this.f28583a).f23167x7.R.f13798b).f23620c, e6Var);
        this.U1 = k3Var2;
        k3Var2.setShowLimitWhenNear(Math.max(100, ((org.telegram.messenger.j0) org.telegram.messenger.hp.s1(this.f28583a).f23167x7.R.f13798b).f23620c / 2));
        k3Var2.d.addTextChangedListener(new v(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), 24, 24);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(linearLayout, a02, null, N2, e6Var);
        wo woVar = new wo(24, context, e6Var);
        this.W1 = woVar;
        woVar.b(org.telegram.ui.ActionBar.k6.h7, org.telegram.ui.ActionBar.k6.f27990j7, org.telegram.ui.ActionBar.k6.f28008k7);
        woVar.setDrawUnchecked(true);
        woVar.a(false, false);
        woVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(woVar, b8.mf.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28120q5, e6Var);
        k2.p1.u(textView, 1, 14.0f, null, 2131754982);
        linearLayout.addView(textView, b8.mf.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final z f37870b;

            {
                this.f37870b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37870b.dismiss();
                        return;
                    case 1:
                        this.f37870b.d1();
                        return;
                    default:
                        wo woVar2 = this.f37870b.W1;
                        woVar2.a(!woVar2.f40035a.f31334q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.V1 = frameLayout3;
        frameLayout3.addView(linearLayout, b8.mf.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i12 = org.telegram.ui.ActionBar.k6.f27824a7;
        this.f28587b0 = i12;
        v0(org.telegram.ui.ActionBar.k6.w0(i12, this.J0));
        tj0 tj0Var = this.f36102l1;
        int i13 = this.f28618u0;
        tj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(66.0f));
        this.f36102l1.setClipToPadding(false);
        this.f36102l1.r1();
        this.f36102l1.setOnItemClickListener(new ei.q4(8, this, e6Var));
        this.D1 = false;
        this.C1 = org.telegram.messenger.g0.L(12.0f);
        this.f36108s1 = 0.35f;
        this.Q0 = true;
        this.G1 = true;
        w wVar = new w(this);
        wVar.f55567m = false;
        wVar.C = false;
        wVar.o(xq.h);
        wVar.n(350L);
        this.f36102l1.setItemAnimator(wVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.X1 = frameLayout4;
        frameLayout4.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, org.telegram.ui.ActionBar.k6.w0(i12, this.J0)), org.telegram.ui.ActionBar.k6.w0(i12, this.J0), org.telegram.ui.ActionBar.k6.w0(i12, this.J0)}));
        FrameLayout.LayoutParams e10 = b8.mf.e(-1, -2, 80);
        int i14 = e10.leftMargin;
        int i15 = this.f28618u0;
        e10.leftMargin = i14 + i15;
        e10.rightMargin += i15;
        this.f28586b.addView(frameLayout4, e10);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.Y1 = frameLayout5;
        FrameLayout.LayoutParams d = b8.mf.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i16 = d.leftMargin;
        int i17 = this.f28618u0;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.f28586b.addView(frameLayout5, d);
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        this.Z1 = h;
        h.setText(org.telegram.messenger.bd.M0(2131754981, null));
        h.setOnClickListener(new org.telegram.messenger.video.g(24, this, e6Var));
        frameLayout4.addView(h, b8.mf.e(-1, 48, 119));
        e1();
        this.f40881g2.O(false);
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.f28583a, 0, true, new e(this, 2), this.J0);
        this.f40881g2 = f41Var;
        f41Var.f33698r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        int i3;
        if (this.c2 != null) {
            i3 = 2131754996;
        } else {
            i3 = 2131754988;
        }
        return org.telegram.messenger.bd.M0(i3, null);
    }

    public final void d1() {
        if (this.f40877b2 != null) {
            return;
        }
        x xVar = new x(this, getContext(), Integer.valueOf(org.telegram.messenger.g0.L(150.0f)), this.J0, r6);
        xVar.setSelected(this.f40876a2);
        xVar.setSaveState(1);
        y yVar = new y(this, xVar);
        this.f40877b2 = yVar;
        org.telegram.ui.x01[] x01VarArr = {yVar};
        yVar.showAsDropDown(this.R1, org.telegram.messenger.g0.L(150.0f), -org.telegram.messenger.g0.L(390.0f), 80);
        x01VarArr[0].b();
    }

    public final void e1() {
        boolean z10;
        if (this.f40876a2 != null && this.T1.getText().length() > 0 && this.U1.getText().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Z1.setEnabled(z10);
    }

    public final void f1() {
        this.f40880f2 = 0;
        Long l10 = this.f40876a2;
        k9 k9Var = this.S1;
        if (l10 == null) {
            k9Var.setImageResource(2131231887);
            k9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W5, this.J0), PorterDuff.Mode.SRC_IN));
            return;
        }
        k9Var.setAnimatedEmojiDrawable(new g5(4, this.f28583a, this.f40876a2.longValue()));
        k9Var.setColorFilter(null);
        k9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27988j5, this.J0), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void q0(float f10) {
        super.q0(f10);
        this.X1.setTranslationY(f10);
    }

    @Override
    public final void s0() {
        int i3;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, this.J0);
            if (w02 != this.f40882h2) {
                this.f40882h2 = w02;
                v0(w02);
                this.X1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        k9 k9Var = this.S1;
        if (k9Var != null) {
            try {
                if (this.f40876a2 == null) {
                    i3 = org.telegram.ui.ActionBar.k6.W5;
                } else {
                    i3 = org.telegram.ui.ActionBar.k6.f27988j5;
                }
                int w03 = org.telegram.ui.ActionBar.k6.w0(i3, this.J0);
                if (w03 != this.f40880f2) {
                    this.f40880f2 = w03;
                    if (this.f40876a2 == null) {
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
