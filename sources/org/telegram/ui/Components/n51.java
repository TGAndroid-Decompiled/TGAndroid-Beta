package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.ApplicationLoaderImpl;
public final class n51 extends org.telegram.ui.ActionBar.w2 {
    public final Drawable f37782m1;
    public final m51 n1;
    public AnimatorSet f37783o1;
    public final View f37784p1;
    public final LinearLayout f37785q1;
    public int f37786r1;
    public final int[] f37787s1;

    public n51(Context context, org.telegram.messenger.d1 d1Var) {
        super(context, false);
        this.f37787s1 = new int[2];
        setCanceledOnTouchOutside(false);
        this.f30209v0 = false;
        this.f30211w0 = false;
        Drawable g10 = i5.c.g(context, 2131232730);
        this.f37782m1 = g10;
        g10.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29451h5, false), PorterDuff.Mode.MULTIPLY));
        y01 y01Var = new y01(1, context, this);
        y01Var.setWillNotDraw(false);
        this.f30173b = y01Var;
        m51 m51Var = new m51(this, context);
        this.n1 = m51Var;
        m51Var.setFillViewport(true);
        m51Var.setWillNotDraw(false);
        m51Var.setClipToPadding(false);
        m51Var.setVerticalScrollBarEnabled(false);
        y01Var.addView(m51Var, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f37785q1 = linearLayout;
        linearLayout.setOrientation(1);
        m51Var.addView(linearLayout, c8.ma.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.n10.p(textView, 1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.m6.f29486j5;
        textView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(org.telegram.messenger.gd.N0(2131754226, null));
        linearLayout.addView(textView, c8.ma.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29636r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new org.telegram.messenger.c0(false));
        int i10 = org.telegram.ui.ActionBar.m6.f29506k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        textView2.setText(org.telegram.messenger.gd.a0(null, null, 2131754239, d1Var.f23486b, Integer.valueOf(d1Var.f23485a)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, c8.ma.t(-2, -2, 49, 23, 0, 23, 5));
        String str = d1Var.f23487c;
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new org.telegram.messenger.c0(false));
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
            textView3.setText(org.telegram.messenger.j6.m(str, textView3.getPaint().getFontMetricsInt(), false, null, 0));
            org.telegram.messenger.ks.i(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, c8.ma.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams.bottomMargin = org.telegram.messenger.g0.L(130.0f);
        View view = new View(context);
        this.f37784p1 = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        y01Var.addView(view, layoutParams);
        hi.e eVar = new hi.e(context, null, true);
        File g11 = org.telegram.messenger.t0.f26940a.g();
        if (g11 != null) {
            eVar.i(org.telegram.messenger.gd.a0(null, null, 2131754222, new Object[0]), false, true);
            eVar.setOnClickListener(new q31(2, this, g11));
        } else {
            eVar.i(org.telegram.messenger.gd.a0(null, null, 2131754224, new Object[0]), false, true);
            eVar.setOnClickListener(new View.OnClickListener(this) {
                public final n51 f37113b;

                {
                    this.f37113b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f26940a).q()) {
                                org.telegram.messenger.h1.e().b(false);
                            }
                            this.f37113b.dismiss();
                            return;
                        default:
                            this.f37113b.dismiss();
                            return;
                    }
                }
            });
        }
        y01Var.addView(eVar, c8.ma.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        hi.e eVar2 = new hi.e(context, null, false);
        eVar2.i(org.telegram.messenger.gd.N0(2131754221, null), false, true);
        eVar2.setOnClickListener(new View.OnClickListener(this) {
            public final n51 f37113b;

            {
                this.f37113b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f26940a).q()) {
                            org.telegram.messenger.h1.e().b(false);
                        }
                        this.f37113b.dismiss();
                        return;
                    default:
                        this.f37113b.dismiss();
                        return;
                }
            }
        });
        y01Var.addView(eVar2, c8.ma.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void J0(n51 n51Var) {
        LinearLayout linearLayout = n51Var.f37785q1;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = n51Var.f37787s1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - org.telegram.messenger.g0.L(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= n51Var.f30173b.getTranslationY() + (n51Var.f30176c.getMeasuredHeight() - org.telegram.messenger.g0.L(113.0f))) {
            n51Var.K0(false);
        } else {
            n51Var.K0(true);
        }
        if (n51Var.f37786r1 != max) {
            n51Var.f37786r1 = max;
            n51Var.n1.invalidate();
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void K0(boolean z10) {
        Integer num;
        float f10;
        View view = this.f37784p1;
        if ((z10 && view.getTag() != null) || (!z10 && view.getTag() == null)) {
            if (z10) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            if (z10) {
                view.setVisibility(0);
            }
            AnimatorSet animatorSet = this.f37783o1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f37783o1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f37783o1.setDuration(150L);
            this.f37783o1.addListener(new org.telegram.ui.on(25, this, z10));
            this.f37783o1.start();
        }
    }
}
