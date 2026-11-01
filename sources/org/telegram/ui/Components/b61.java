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
public final class b61 extends org.telegram.ui.ActionBar.z2 {
    public final Drawable f24665i1;
    public final a61 f24666j1;
    public AnimatorSet f24667k1;
    public final View l1;
    public final LinearLayout f24668m1;
    public int f24669n1;
    public final int[] f24670o1;

    public b61(Context context, org.telegram.messenger.g1 g1Var) {
        super(context, false);
        this.f24670o1 = new int[2];
        setCanceledOnTouchOutside(false);
        this.f21617u0 = false;
        this.f21618v0 = false;
        Drawable f7 = i0.a.f(context, 2131232725);
        this.f24665i1 = f7;
        f7.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h5, false), PorterDuff.Mode.MULTIPLY));
        jg.l0 l0Var = new jg.l0(this, context, 29);
        l0Var.setWillNotDraw(false);
        this.f21587b = l0Var;
        a61 a61Var = new a61(this, context);
        this.f24666j1 = a61Var;
        a61Var.setFillViewport(true);
        a61Var.setWillNotDraw(false);
        a61Var.setClipToPadding(false);
        a61Var.setVerticalScrollBarEnabled(false);
        l0Var.addView(a61Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f24668m1 = linearLayout;
        linearLayout.setOrientation(1);
        a61Var.addView(linearLayout, w7.b6.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.a30.n(textView, 1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.t6.f21038j5;
        textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(org.telegram.messenger.dd.L0(2131754229, null));
        linearLayout.addView(textView, w7.b6.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21186r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new org.telegram.messenger.e0(false));
        int i11 = org.telegram.ui.ActionBar.t6.f21058k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        textView2.setText(org.telegram.messenger.dd.a0(null, null, 2131754242, g1Var.f15837a, Integer.valueOf(g1Var.f15839c)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, w7.b6.t(-2, -2, 49, 23, 0, 23, 5));
        String str = g1Var.f15838b;
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new org.telegram.messenger.e0(false));
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
            textView3.setText(org.telegram.messenger.k6.m(str, textView3.getPaint().getFontMetricsInt(), false, null, 0));
            org.telegram.messenger.at.i(textView3);
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
        File g10 = org.telegram.messenger.w0.f18944a.g();
        if (g10 != null) {
            dVar.i(org.telegram.messenger.dd.a0(null, null, 2131754225, new Object[0]), false, true);
            dVar.setOnClickListener(new sr(23, this, g10));
        } else {
            dVar.i(org.telegram.messenger.dd.a0(null, null, 2131754227, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final b61 f33009b;

                {
                    this.f33009b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            if (((ApplicationLoaderImpl) org.telegram.messenger.w0.f18944a).q()) {
                                org.telegram.messenger.k1.e().b(false);
                            }
                            this.f33009b.dismiss();
                            return;
                        default:
                            this.f33009b.dismiss();
                            return;
                    }
                }
            });
        }
        l0Var.addView(dVar, w7.b6.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        vh.d dVar2 = new vh.d(context, null, false);
        dVar2.i(org.telegram.messenger.dd.L0(2131754224, null), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final b61 f33009b;

            {
                this.f33009b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        if (((ApplicationLoaderImpl) org.telegram.messenger.w0.f18944a).q()) {
                            org.telegram.messenger.k1.e().b(false);
                        }
                        this.f33009b.dismiss();
                        return;
                    default:
                        this.f33009b.dismiss();
                        return;
                }
            }
        });
        l0Var.addView(dVar2, w7.b6.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void I0(b61 b61Var) {
        LinearLayout linearLayout = b61Var.f24668m1;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = b61Var.f24670o1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - org.telegram.messenger.i0.L(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= b61Var.f21587b.getTranslationY() + (b61Var.f21590c.getMeasuredHeight() - org.telegram.messenger.i0.L(113.0f))) {
            b61Var.J0(false);
        } else {
            b61Var.J0(true);
        }
        if (b61Var.f24669n1 != max) {
            b61Var.f24669n1 = max;
            b61Var.f24666j1.invalidate();
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
            AnimatorSet animatorSet = this.f24667k1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f24667k1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.f24667k1.setDuration(150L);
            this.f24667k1.addListener(new ha0(10, this, z10));
            this.f24667k1.start();
        }
    }
}
