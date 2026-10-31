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
public final class a61 extends org.telegram.ui.ActionBar.z2 {
    public final Drawable f24310i1;
    public final z51 f24311j1;
    public AnimatorSet f24312k1;
    public final View l1;
    public final LinearLayout f24313m1;
    public int f24314n1;
    public final int[] f24315o1;

    public a61(Context context, org.telegram.messenger.g1 g1Var) {
        super(context, false);
        this.f24315o1 = new int[2];
        setCanceledOnTouchOutside(false);
        this.f21616u0 = false;
        this.f21617v0 = false;
        Drawable f7 = i0.a.f(context, 2131232725);
        this.f24310i1 = f7;
        f7.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21001h5, false), PorterDuff.Mode.MULTIPLY));
        jg.l0 l0Var = new jg.l0(this, context, 29);
        l0Var.setWillNotDraw(false);
        this.f21586b = l0Var;
        z51 z51Var = new z51(this, context);
        this.f24311j1 = z51Var;
        z51Var.setFillViewport(true);
        z51Var.setWillNotDraw(false);
        z51Var.setClipToPadding(false);
        z51Var.setVerticalScrollBarEnabled(false);
        l0Var.addView(z51Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f24313m1 = linearLayout;
        linearLayout.setOrientation(1);
        z51Var.addView(linearLayout, w7.b6.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.z20.n(textView, 1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.t6.f21037j5;
        textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(org.telegram.messenger.cd.L0(2131754229, null));
        linearLayout.addView(textView, w7.b6.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21185r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new org.telegram.messenger.e0(false));
        int i11 = org.telegram.ui.ActionBar.t6.f21057k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        textView2.setText(org.telegram.messenger.cd.a0(null, null, 2131754242, g1Var.f15653a, Integer.valueOf(g1Var.f15655c)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, w7.b6.t(-2, -2, 49, 23, 0, 23, 5));
        String str = g1Var.f15654b;
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new org.telegram.messenger.e0(false));
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
            textView3.setText(org.telegram.messenger.k6.m(str, textView3.getPaint().getFontMetricsInt(), false, null, 0));
            org.telegram.messenger.zs.i(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, w7.b6.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 83);
        layoutParams.bottomMargin = org.telegram.messenger.i0.L(130.0f);
        View view = new View(context);
        this.l1 = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        l0Var.addView(view, layoutParams);
        vh.d dVar = new vh.d(context, null, true);
        File g10 = org.telegram.messenger.w0.f19024a.g();
        if (g10 != null) {
            dVar.i(org.telegram.messenger.cd.a0(null, null, 2131754225, new Object[0]), false, true);
            dVar.setOnClickListener(new sr(23, this, g10));
        } else {
            dVar.i(org.telegram.messenger.cd.a0(null, null, 2131754227, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final a61 f32641b;

                {
                    this.f32641b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            if (((ApplicationLoaderImpl) org.telegram.messenger.w0.f19024a).q()) {
                                org.telegram.messenger.k1.e().b(false);
                            }
                            this.f32641b.dismiss();
                            return;
                        default:
                            this.f32641b.dismiss();
                            return;
                    }
                }
            });
        }
        l0Var.addView(dVar, w7.b6.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        vh.d dVar2 = new vh.d(context, null, false);
        dVar2.i(org.telegram.messenger.cd.L0(2131754224, null), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final a61 f32641b;

            {
                this.f32641b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        if (((ApplicationLoaderImpl) org.telegram.messenger.w0.f19024a).q()) {
                            org.telegram.messenger.k1.e().b(false);
                        }
                        this.f32641b.dismiss();
                        return;
                    default:
                        this.f32641b.dismiss();
                        return;
                }
            }
        });
        l0Var.addView(dVar2, w7.b6.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void I0(a61 a61Var) {
        LinearLayout linearLayout = a61Var.f24313m1;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = a61Var.f24315o1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - org.telegram.messenger.i0.L(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= a61Var.f21586b.getTranslationY() + (a61Var.f21589c.getMeasuredHeight() - org.telegram.messenger.i0.L(113.0f))) {
            a61Var.J0(false);
        } else {
            a61Var.J0(true);
        }
        if (a61Var.f24314n1 != max) {
            a61Var.f24314n1 = max;
            a61Var.f24311j1.invalidate();
        }
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final void J0(boolean z10) {
        Integer num;
        float f7;
        View view = this.l1;
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
            AnimatorSet animatorSet = this.f24312k1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f24312k1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.f24312k1.setDuration(150L);
            this.f24312k1.addListener(new ha0(10, this, z10));
            this.f24312k1.start();
        }
    }
}
