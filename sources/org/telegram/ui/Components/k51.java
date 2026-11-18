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
public final class k51 extends org.telegram.ui.ActionBar.x2 {
    public final Drawable f36684m1;
    public final j51 n1;
    public AnimatorSet f36685o1;
    public final View f36686p1;
    public final LinearLayout f36687q1;
    public int f36688r1;
    public final int[] f36689s1;

    public k51(Context context, org.telegram.messenger.d1 d1Var) {
        super(context, false);
        this.f36689s1 = new int[2];
        setCanceledOnTouchOutside(false);
        this.f30228v0 = false;
        this.f30230w0 = false;
        Drawable g10 = i5.c.g(context, 2131232730);
        this.f36684m1 = g10;
        g10.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29469h5, false), PorterDuff.Mode.MULTIPLY));
        w01 w01Var = new w01(1, context, this);
        w01Var.setWillNotDraw(false);
        this.f30192b = w01Var;
        j51 j51Var = new j51(this, context);
        this.n1 = j51Var;
        j51Var.setFillViewport(true);
        j51Var.setWillNotDraw(false);
        j51Var.setClipToPadding(false);
        j51Var.setVerticalScrollBarEnabled(false);
        w01Var.addView(j51Var, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f36687q1 = linearLayout;
        linearLayout.setOrientation(1);
        j51Var.addView(linearLayout, c8.ma.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.n10.p(textView, 1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29504j5;
        textView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(org.telegram.messenger.gd.M0(2131754227, null));
        linearLayout.addView(textView, c8.ma.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29654r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new org.telegram.messenger.c0(false));
        int i10 = org.telegram.ui.ActionBar.n6.f29524k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        textView2.setText(org.telegram.messenger.gd.a0(null, null, 2131754240, d1Var.f23461b, Integer.valueOf(d1Var.f23460a)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, c8.ma.t(-2, -2, 49, 23, 0, 23, 5));
        String str = d1Var.f23462c;
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new org.telegram.messenger.c0(false));
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
            textView3.setText(org.telegram.messenger.j6.m(str, textView3.getPaint().getFontMetricsInt(), false, null, 0));
            org.telegram.messenger.ks.i(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, c8.ma.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams.bottomMargin = org.telegram.messenger.g0.L(130.0f);
        View view = new View(context);
        this.f36686p1 = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        w01Var.addView(view, layoutParams);
        hi.d dVar = new hi.d(context, null, true);
        File g11 = org.telegram.messenger.t0.f26914a.g();
        if (g11 != null) {
            dVar.i(org.telegram.messenger.gd.a0(null, null, 2131754223, new Object[0]), false, true);
            dVar.setOnClickListener(new c31(4, this, g11));
        } else {
            dVar.i(org.telegram.messenger.gd.a0(null, null, 2131754225, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final k51 f36059b;

                {
                    this.f36059b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f26914a).q()) {
                                org.telegram.messenger.h1.e().b(false);
                            }
                            this.f36059b.dismiss();
                            return;
                        default:
                            this.f36059b.dismiss();
                            return;
                    }
                }
            });
        }
        w01Var.addView(dVar, c8.ma.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        hi.d dVar2 = new hi.d(context, null, false);
        dVar2.i(org.telegram.messenger.gd.M0(2131754222, null), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final k51 f36059b;

            {
                this.f36059b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f26914a).q()) {
                            org.telegram.messenger.h1.e().b(false);
                        }
                        this.f36059b.dismiss();
                        return;
                    default:
                        this.f36059b.dismiss();
                        return;
                }
            }
        });
        w01Var.addView(dVar2, c8.ma.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void J0(k51 k51Var) {
        LinearLayout linearLayout = k51Var.f36687q1;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = k51Var.f36689s1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - org.telegram.messenger.g0.L(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= k51Var.f30192b.getTranslationY() + (k51Var.f30195c.getMeasuredHeight() - org.telegram.messenger.g0.L(113.0f))) {
            k51Var.K0(false);
        } else {
            k51Var.K0(true);
        }
        if (k51Var.f36688r1 != max) {
            k51Var.f36688r1 = max;
            k51Var.n1.invalidate();
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void K0(boolean z10) {
        Integer num;
        float f10;
        View view = this.f36686p1;
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
            AnimatorSet animatorSet = this.f36685o1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f36685o1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f36685o1.setDuration(150L);
            this.f36685o1.addListener(new org.telegram.ui.on(25, this, z10));
            this.f36685o1.start();
        }
    }
}
