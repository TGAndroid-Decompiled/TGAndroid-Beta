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
public final class r41 extends org.telegram.ui.ActionBar.v2 {
    public final Drawable f37612i1;
    public final q41 f37613j1;
    public AnimatorSet f37614k1;
    public final View l1;
    public final LinearLayout f37615m1;
    public int n1;
    public final int[] f37616o1;

    public r41(Context context, org.telegram.messenger.d1 d1Var) {
        super(context, false);
        this.f37616o1 = new int[2];
        setCanceledOnTouchOutside(false);
        this.f28646u0 = false;
        this.f28647v0 = false;
        Drawable h = jg.g.h(context, 2131232728);
        this.f37612i1 = h;
        h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27921h5, false), PorterDuff.Mode.MULTIPLY));
        p41 p41Var = new p41(0, context, this);
        p41Var.setWillNotDraw(false);
        this.f28615b = p41Var;
        q41 q41Var = new q41(this, context);
        this.f37613j1 = q41Var;
        q41Var.setFillViewport(true);
        q41Var.setWillNotDraw(false);
        q41Var.setClipToPadding(false);
        q41Var.setVerticalScrollBarEnabled(false);
        p41Var.addView(q41Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f37615m1 = linearLayout;
        linearLayout.setOrientation(1);
        q41Var.addView(linearLayout, c8.ha.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.k6.f27956j5;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(org.telegram.messenger.hd.M0(2131754229, null));
        linearLayout.addView(textView, c8.ha.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28106r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new org.telegram.messenger.c0(false));
        int i10 = org.telegram.ui.ActionBar.k6.f27976k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        textView2.setText(org.telegram.messenger.hd.a0(null, null, 2131754242, d1Var.f21939a, Integer.valueOf(d1Var.f21941c)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, c8.ha.t(-2, -2, 49, 23, 0, 23, 5));
        String str = d1Var.f21940b;
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new org.telegram.messenger.c0(false));
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            textView3.setText(org.telegram.messenger.i6.m(str, textView3.getPaint().getFontMetricsInt(), false, null, 0));
            org.telegram.messenger.qs.i(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, c8.ha.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams.bottomMargin = org.telegram.messenger.g0.L(130.0f);
        View view = new View(context);
        this.l1 = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        p41Var.addView(view, layoutParams);
        fi.d dVar = new fi.d(context, null, true);
        File g10 = org.telegram.messenger.t0.f25554a.g();
        if (g10 != null) {
            dVar.i(org.telegram.messenger.hd.a0(null, null, 2131754225, new Object[0]), false, true);
            dVar.setOnClickListener(new n41(0, this, g10));
        } else {
            dVar.i(org.telegram.messenger.hd.a0(null, null, 2131754227, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final r41 f36633b;

                {
                    this.f36633b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f25554a).q()) {
                                org.telegram.messenger.h1.e().b(false);
                            }
                            this.f36633b.dismiss();
                            return;
                        default:
                            this.f36633b.dismiss();
                            return;
                    }
                }
            });
        }
        p41Var.addView(dVar, c8.ha.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        fi.d dVar2 = new fi.d(context, null, false);
        dVar2.i(org.telegram.messenger.hd.M0(2131754224, null), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final r41 f36633b;

            {
                this.f36633b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f25554a).q()) {
                            org.telegram.messenger.h1.e().b(false);
                        }
                        this.f36633b.dismiss();
                        return;
                    default:
                        this.f36633b.dismiss();
                        return;
                }
            }
        });
        p41Var.addView(dVar2, c8.ha.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void I0(r41 r41Var) {
        LinearLayout linearLayout = r41Var.f37615m1;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = r41Var.f37616o1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - org.telegram.messenger.g0.L(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= r41Var.f28615b.getTranslationY() + (r41Var.f28618c.getMeasuredHeight() - org.telegram.messenger.g0.L(113.0f))) {
            r41Var.J0(false);
        } else {
            r41Var.J0(true);
        }
        if (r41Var.n1 != max) {
            r41Var.n1 = max;
            r41Var.f37613j1.invalidate();
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void J0(boolean z9) {
        Integer num;
        float f10;
        View view = this.l1;
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
            AnimatorSet animatorSet = this.f37614k1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f37614k1 = animatorSet2;
            Property property = View.ALPHA;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f37614k1.setDuration(150L);
            this.f37614k1.addListener(new t9(24, this, z9));
            this.f37614k1.start();
        }
    }
}
