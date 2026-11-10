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
public final class y41 extends org.telegram.ui.ActionBar.w2 {
    public final Drawable l1;
    public final x41 f40499m1;
    public AnimatorSet n1;
    public final View f40500o1;
    public final LinearLayout f40501p1;
    public int f40502q1;
    public final int[] f40503r1;

    public y41(Context context, org.telegram.messenger.d1 d1Var) {
        super(context, false);
        this.f40503r1 = new int[2];
        setCanceledOnTouchOutside(false);
        this.f28706u0 = false;
        this.f28707v0 = false;
        Drawable h = jg.g.h(context, 2131232728);
        this.l1 = h;
        h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27963h5, false), PorterDuff.Mode.MULTIPLY));
        w41 w41Var = new w41(0, context, this);
        w41Var.setWillNotDraw(false);
        this.f28672b = w41Var;
        x41 x41Var = new x41(this, context);
        this.f40499m1 = x41Var;
        x41Var.setFillViewport(true);
        x41Var.setWillNotDraw(false);
        x41Var.setClipToPadding(false);
        x41Var.setVerticalScrollBarEnabled(false);
        w41Var.addView(x41Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f40501p1 = linearLayout;
        linearLayout.setOrientation(1);
        x41Var.addView(linearLayout, c8.ha.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.m6.f27998j5;
        textView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(org.telegram.messenger.id.M0(2131754229, null));
        linearLayout.addView(textView, c8.ha.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28148r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new org.telegram.messenger.c0(false));
        int i10 = org.telegram.ui.ActionBar.m6.f28018k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        textView2.setText(org.telegram.messenger.id.a0(null, null, 2131754242, d1Var.f21974b, Integer.valueOf(d1Var.f21973a)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, c8.ha.t(-2, -2, 49, 23, 0, 23, 5));
        String str = d1Var.f21975c;
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new org.telegram.messenger.c0(false));
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
            textView3.setText(org.telegram.messenger.i6.m(str, textView3.getPaint().getFontMetricsInt(), false, null, 0));
            org.telegram.messenger.qs.i(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, c8.ha.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams.bottomMargin = org.telegram.messenger.g0.L(130.0f);
        View view = new View(context);
        this.f40500o1 = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        w41Var.addView(view, layoutParams);
        fi.d dVar = new fi.d(context, null, true);
        File g10 = org.telegram.messenger.t0.f25569a.g();
        if (g10 != null) {
            dVar.i(org.telegram.messenger.id.a0(null, null, 2131754225, new Object[0]), false, true);
            dVar.setOnClickListener(new u41(0, this, g10));
        } else {
            dVar.i(org.telegram.messenger.id.a0(null, null, 2131754227, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final y41 f38851b;

                {
                    this.f38851b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f25569a).q()) {
                                org.telegram.messenger.h1.e().b(false);
                            }
                            this.f38851b.dismiss();
                            return;
                        default:
                            this.f38851b.dismiss();
                            return;
                    }
                }
            });
        }
        w41Var.addView(dVar, c8.ha.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        fi.d dVar2 = new fi.d(context, null, false);
        dVar2.i(org.telegram.messenger.id.M0(2131754224, null), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final y41 f38851b;

            {
                this.f38851b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f25569a).q()) {
                            org.telegram.messenger.h1.e().b(false);
                        }
                        this.f38851b.dismiss();
                        return;
                    default:
                        this.f38851b.dismiss();
                        return;
                }
            }
        });
        w41Var.addView(dVar2, c8.ha.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void I0(y41 y41Var) {
        LinearLayout linearLayout = y41Var.f40501p1;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = y41Var.f40503r1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - org.telegram.messenger.g0.L(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= y41Var.f28672b.getTranslationY() + (y41Var.f28675c.getMeasuredHeight() - org.telegram.messenger.g0.L(113.0f))) {
            y41Var.J0(false);
        } else {
            y41Var.J0(true);
        }
        if (y41Var.f40502q1 != max) {
            y41Var.f40502q1 = max;
            y41Var.f40499m1.invalidate();
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void J0(boolean z9) {
        Integer num;
        float f10;
        View view = this.f40500o1;
        if ((z9 && view.getTag() != null) || (!z9 && view.getTag() == null)) {
            if (z9) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            if (z9) {
                view.setVisibility(0);
            }
            AnimatorSet animatorSet = this.n1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.n1 = animatorSet2;
            Property property = View.ALPHA;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.n1.setDuration(150L);
            this.n1.addListener(new s9(24, this, z9));
            this.n1.start();
        }
    }
}
