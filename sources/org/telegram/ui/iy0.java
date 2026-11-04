package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class iy0 extends org.telegram.ui.Components.ma {
    public final LinearLayout Q1;
    public final org.telegram.ui.Components.wp R1;
    public final org.telegram.ui.Components.s70 S1;
    public org.telegram.ui.Components.f41 T1;

    public iy0(Context context, boolean z10, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.messenger.u10 u10Var) {
        super(context, null, false, false, e6Var);
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        N();
        this.f36108s1 = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i16 = org.telegram.ui.ActionBar.k6.Ci;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i16, e6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q1 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + this.f28618u0, 0, org.telegram.messenger.g0.L(6.0f) + this.f28618u0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231600);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable L = org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(80.0f), org.telegram.ui.ActionBar.k6.w0(i16, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i16);
        imageView.setBackground(L);
        org.telegram.ui.ActionBar.r6.k(imageView, L, N, null, e6Var);
        frameLayout.addView(imageView, b8.mf.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (u10Var != null) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageDrawable(context.getDrawable(2131231244));
            imageView2.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
            imageView2.setScaleType(scaleType);
            org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.r5, null, PorterDuff.Mode.SRC_ATOP);
            int i17 = org.telegram.ui.ActionBar.k6.f27972i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i17, false), 1, -1);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i17);
            imageView2.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N2, null);
            e6Var2 = e6Var;
            imageView2.setOnClickListener(new ai.r4(this, u10Var, e6Var, imageView2, 16));
            frameLayout.addView(imageView2, b8.mf.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            e6Var2 = e6Var;
        }
        linearLayout.addView(frameLayout, b8.mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.bd.M0(2131754943, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i18 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i18, e6Var2);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, b8.mf.t(-2, -2, 1, 22, 14, 22, 0), context);
        f10.setText(org.telegram.messenger.bd.M0(2131746054, null));
        org.telegram.ui.ActionBar.r6.V(f10, i18, e6Var2);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        linearLayout.addView(f10, b8.mf.t(-2, -2, 1, 22, 8, 22, 0));
        if (z10) {
            i3 = 2131746050;
        } else {
            i3 = 2131746051;
        }
        String M0 = org.telegram.messenger.bd.M0(i3, null);
        if (z10) {
            i10 = 2131746052;
        } else {
            i10 = 2131746053;
        }
        linearLayout.addView(new yg0(this, context, 2131231860, M0, org.telegram.messenger.bd.M0(i10, null)), b8.mf.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        if (z10) {
            i11 = 2131746046;
        } else {
            i11 = 2131746047;
        }
        String M02 = org.telegram.messenger.bd.M0(i11, null);
        if (z10) {
            i12 = 2131746048;
        } else {
            i12 = 2131746049;
        }
        linearLayout.addView(new yg0(this, context, 2131231814, M02, org.telegram.messenger.bd.M0(i12, null)), b8.mf.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        if (z10) {
            i13 = 2131746044;
        } else {
            i13 = 2131746045;
        }
        String a02 = org.telegram.messenger.bd.a0(null, null, i13, Integer.valueOf(org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f23183z4));
        int i19 = org.telegram.ui.ActionBar.k6.Uc;
        linearLayout.addView(new yg0(this, context, 2131231807, org.telegram.messenger.bd.M0(2131746043, null), org.telegram.messenger.g0.S2(a02, i19, 0, new Runnable(this) {
            public final iy0 f46009b;

            {
                this.f46009b = this;
            }

            @Override
            public final void run() {
                int i20 = r2;
                iy0 iy0Var = this.f46009b;
                switch (i20) {
                    case 0:
                        iy0Var.getClass();
                        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                            iy0Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        iy0Var.dismiss();
                        sf.c.t(iy0Var.getContext(), org.telegram.messenger.bd.M0(2131746626, null));
                        return;
                }
            }
        }, null)), b8.mf.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27879d7, view, e6Var2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        if (z10) {
            i14 = 2131746038;
        } else {
            i14 = 2131746039;
        }
        textView2.setText(org.telegram.messenger.bd.M0(i14, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(textView2, i18, e6Var2);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, b8.mf.t(-2, -2, 1, 22, 0, 22, 0));
        if (z10) {
            i15 = 2131746041;
        } else {
            i15 = 2131746042;
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(i15, null));
        SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131746040, null), i19, 0, new Runnable(this) {
            public final iy0 f46009b;

            {
                this.f46009b = this;
            }

            @Override
            public final void run() {
                int i20 = r2;
                iy0 iy0Var = this.f46009b;
                switch (i20) {
                    case 0:
                        iy0Var.getClass();
                        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                            iy0Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        iy0Var.dismiss();
                        sf.c.t(iy0Var.getContext(), org.telegram.messenger.bd.M0(2131746626, null));
                        return;
                }
            }
        }, null);
        SpannableString spannableString = new SpannableString(">");
        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131230875, 0);
        this.R1 = wpVar;
        wpVar.f40049y = org.telegram.ui.ActionBar.k6.x0(null, i19, false);
        wpVar.I = 0.7f;
        wpVar.J = 0.7f;
        wpVar.F = org.telegram.messenger.g0.L(12.0f);
        wpVar.f40046s = 1.0f;
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(X2, S2, "%1$s"), spannableString, ">");
        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(context, null);
        this.S1 = s70Var;
        s70Var.setText(K2);
        org.telegram.ui.ActionBar.r6.V(s70Var, i18, e6Var2);
        s70Var.setTextSize(1, 14.0f);
        s70Var.setGravity(1);
        s70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(s70Var, b8.mf.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.Gi, e6Var2);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(org.telegram.messenger.bd.M0(2131746055, null));
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.k6.w0(i16, e6Var2), 6.0f);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i16);
        org.telegram.ui.ActionBar.n6 f11 = org.telegram.ui.ActionBar.r6.f(i16);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.r6.k(textView3, e10, N3, f11, e6Var2);
        textView3.setOnClickListener(new cy0(this, 1));
        linearLayout.addView(textView3, b8.mf.t(-1, 48, 0, 14, 22, 14, 14));
        this.T1.O(false);
    }

    public static iy0 d1(Context context, org.telegram.ui.ActionBar.d2 d2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var, mi.f fVar) {
        iy0 iy0Var = new iy0(context, z10, e6Var, fVar);
        if (d2Var != null) {
            if (d2Var.getParentActivity() != null) {
                d2Var.showDialog(iy0Var);
            }
            return iy0Var;
        }
        iy0Var.show();
        return iy0Var;
    }

    public static void e1(Context context, org.telegram.ui.ActionBar.e6 e6Var, wm wmVar) {
        d1(context, wmVar, false, e6Var, null);
    }

    @Override
    public final org.telegram.ui.Components.sj0 L0(org.telegram.ui.Components.tj0 tj0Var) {
        org.telegram.ui.Components.f41 f41Var = new org.telegram.ui.Components.f41(tj0Var, getContext(), this.f28583a, 0, true, new c5(this, 20), this.J0);
        this.T1 = f41Var;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.bd.M0(2131754943, null);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            org.telegram.ui.Components.wp wpVar = this.R1;
            if (wpVar != null) {
                wpVar.f40049y = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false);
                org.telegram.ui.Components.s70 s70Var = this.S1;
                if (s70Var != null) {
                    s70Var.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
