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
public final class g01 extends org.telegram.ui.Components.ha {
    public final LinearLayout P1;
    public final org.telegram.ui.Components.dq Q1;
    public final org.telegram.ui.Components.p80 R1;
    public org.telegram.ui.Components.q51 S1;

    public g01(Context context, boolean z10, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.messenger.r20 r20Var) {
        super(context, null, false, false, p6Var);
        org.telegram.ui.ActionBar.p6 p6Var2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        O();
        this.f26730r1 = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i17 = org.telegram.ui.ActionBar.t6.Ci;
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(i17, p6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.P1 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.i0.L(6.0f) + this.f21616t0, 0, org.telegram.messenger.i0.L(6.0f) + this.f21616t0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231601);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable L = org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(80.0f), org.telegram.ui.ActionBar.t6.w0(i17, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i17);
        imageView.setBackground(L);
        org.telegram.ui.ActionBar.a7.k(imageView, L, N, null, p6Var);
        frameLayout.addView(imageView, w7.b6.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (r20Var != null) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageDrawable(context.getDrawable(2131231245));
            imageView2.setContentDescription(org.telegram.messenger.dd.L0(2131754839, null));
            imageView2.setScaleType(scaleType);
            org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.f21186r5, null, PorterDuff.Mode.SRC_ATOP);
            int i18 = org.telegram.ui.ActionBar.t6.f21021i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i18, false), 1, -1);
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i18);
            imageView2.setBackground(h02);
            org.telegram.ui.ActionBar.a7.k(imageView2, h02, null, N2, null);
            p6Var2 = p6Var;
            imageView2.setOnClickListener(new org.telegram.messenger.video.h(this, r20Var, p6Var, imageView2, 11));
            frameLayout.addView(imageView2, w7.b6.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            p6Var2 = p6Var;
        }
        linearLayout.addView(frameLayout, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.dd.L0(2131754943, null));
        textView.setTypeface(org.telegram.messenger.i0.o());
        int i19 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i19, p6Var2);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView f7 = org.telegram.messenger.a30.f(linearLayout, textView, w7.b6.t(-2, -2, 1, 22, 14, 22, 0), context);
        f7.setText(org.telegram.messenger.dd.L0(2131746061, null));
        org.telegram.ui.ActionBar.a7.V(f7, i19, p6Var2);
        f7.setTextSize(1, 14.0f);
        f7.setGravity(1);
        linearLayout.addView(f7, w7.b6.t(-2, -2, 1, 22, 8, 22, 0));
        if (z10) {
            i10 = 2131746057;
        } else {
            i10 = 2131746058;
        }
        String L0 = org.telegram.messenger.dd.L0(i10, null);
        if (z10) {
            i11 = 2131746059;
        } else {
            i11 = 2131746060;
        }
        linearLayout.addView(new bg0(this, context, 2131231859, L0, org.telegram.messenger.dd.L0(i11, null)), w7.b6.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        if (z10) {
            i12 = 2131746053;
        } else {
            i12 = 2131746054;
        }
        String L02 = org.telegram.messenger.dd.L0(i12, null);
        if (z10) {
            i13 = 2131746055;
        } else {
            i13 = 2131746056;
        }
        linearLayout.addView(new bg0(this, context, 2131231813, L02, org.telegram.messenger.dd.L0(i13, null)), w7.b6.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        if (z10) {
            i14 = 2131746051;
        } else {
            i14 = 2131746052;
        }
        String a02 = org.telegram.messenger.dd.a0(null, null, i14, Integer.valueOf(org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).A4));
        int i20 = org.telegram.ui.ActionBar.t6.Uc;
        linearLayout.addView(new bg0(this, context, 2131231806, org.telegram.messenger.dd.L0(2131746050, null), org.telegram.messenger.i0.R2(a02, i20, 0, new Runnable(this) {
            public final g01 f36953b;

            {
                this.f36953b = this;
            }

            @Override
            public final void run() {
                int i21 = r2;
                g01 g01Var = this.f36953b;
                switch (i21) {
                    case 0:
                        g01Var.getClass();
                        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                            g01Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        g01Var.dismiss();
                        gf.f.r(g01Var.getContext(), org.telegram.messenger.dd.L0(2131746633, null));
                        return;
                }
            }
        }, null)), w7.b6.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20931d7, view, p6Var2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        if (z10) {
            i15 = 2131746045;
        } else {
            i15 = 2131746046;
        }
        textView2.setText(org.telegram.messenger.dd.L0(i15, null));
        textView2.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.a7.V(textView2, i19, p6Var2);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, w7.b6.t(-2, -2, 1, 22, 0, 22, 0));
        if (z10) {
            i16 = 2131746048;
        } else {
            i16 = 2131746049;
        }
        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(i16, null));
        SpannableStringBuilder R2 = org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131746047, null), i20, 0, new Runnable(this) {
            public final g01 f36953b;

            {
                this.f36953b = this;
            }

            @Override
            public final void run() {
                int i21 = r2;
                g01 g01Var = this.f36953b;
                switch (i21) {
                    case 0:
                        g01Var.getClass();
                        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                            g01Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        g01Var.dismiss();
                        gf.f.r(g01Var.getContext(), org.telegram.messenger.dd.L0(2131746633, null));
                        return;
                }
            }
        }, null);
        SpannableString spannableString = new SpannableString(">");
        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(2131230875, 0);
        this.Q1 = dqVar;
        dqVar.f25572y = org.telegram.ui.ActionBar.t6.x0(null, i20, false);
        dqVar.H = 0.7f;
        dqVar.I = 0.7f;
        dqVar.E = org.telegram.messenger.i0.L(12.0f);
        dqVar.f25569s = 1.0f;
        spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder J2 = org.telegram.messenger.i0.J2(org.telegram.messenger.i0.J2(W2, R2, "%1$s"), spannableString, ">");
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, null);
        this.R1 = p80Var;
        p80Var.setText(J2);
        org.telegram.ui.ActionBar.a7.V(p80Var, i19, p6Var2);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setGravity(1);
        p80Var.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        linearLayout.addView(p80Var, w7.b6.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.Gi, p6Var2);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(org.telegram.messenger.dd.L0(2131746062, null));
        org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.j6.e(org.telegram.ui.ActionBar.t6.w0(i17, p6Var2), 6.0f);
        org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i17);
        org.telegram.ui.ActionBar.w6 f10 = org.telegram.ui.ActionBar.a7.f(i17);
        textView3.setBackground(e);
        org.telegram.ui.ActionBar.a7.k(textView3, e, N3, f10, p6Var2);
        textView3.setOnClickListener(new zz0(this, 1));
        linearLayout.addView(textView3, w7.b6.t(-1, 48, 0, 14, 22, 14, 14));
        this.S1.O(false);
    }

    public static g01 d1(Context context, org.telegram.ui.ActionBar.k2 k2Var, boolean z10, org.telegram.ui.ActionBar.p6 p6Var, ag.e0 e0Var) {
        g01 g01Var = new g01(context, z10, p6Var, e0Var);
        if (k2Var != null) {
            if (k2Var.getParentActivity() != null) {
                k2Var.showDialog(g01Var);
            }
            return g01Var;
        }
        g01Var.show();
        return g01Var;
    }

    public static void e1(Context context, org.telegram.ui.ActionBar.p6 p6Var, un unVar) {
        d1(context, unVar, false, p6Var, null);
    }

    @Override
    public final org.telegram.ui.Components.tk0 L0(org.telegram.ui.Components.uk0 uk0Var) {
        org.telegram.ui.Components.q51 q51Var = new org.telegram.ui.Components.q51(uk0Var, getContext(), this.f21584a, 0, true, new z4(this, 20), this.I0);
        this.S1 = q51Var;
        return q51Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.dd.L0(2131754943, null);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            org.telegram.ui.Components.dq dqVar = this.Q1;
            if (dqVar != null) {
                dqVar.f25572y = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Uc, false);
                org.telegram.ui.Components.p80 p80Var = this.R1;
                if (p80Var != null) {
                    p80Var.invalidate();
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
