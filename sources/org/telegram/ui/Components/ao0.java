package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
public final class ao0 extends FrameLayout {
    public final View f31860a;
    public final org.telegram.ui.ActionBar.k5 f31861b;
    public final org.telegram.ui.ActionBar.k5 f31862c;
    public final bi.ec d;
    public int f31863e;
    public AnimatorSet f31864f;
    public LinearGradient h;
    public final Paint f31865n;
    public final RectF f31866r;
    public final mo0 f31867s;

    public ao0(mo0 mo0Var, Context context) {
        super(context);
        this.f31867s = mo0Var;
        this.f31865n = new Paint(1);
        this.f31866r = new RectF();
        View view = new View(context);
        this.f31860a = view;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.k6.O5;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i7, mo0Var.I0));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        org.telegram.ui.ActionBar.f6 f6Var = mo0Var.I0;
        view.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(view, d02, N, null, f6Var);
        addView(view, c8.ha.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        bi.ec ecVar = new bi.ec(24, context, this);
        this.d = ecVar;
        addView(ecVar, c8.ha.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f31862c = k5Var;
        int i10 = org.telegram.ui.ActionBar.k6.f27822bh;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i10, mo0Var.I0);
        k5Var.setTextSize(13);
        k5Var.setLeftDrawable(2131232396);
        k5Var.l(org.telegram.messenger.hd.M0(2131743376, null), false);
        k5Var.setGravity(17);
        addView(k5Var, c8.ha.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        k5Var.setOnClickListener(new View.OnClickListener(this) {
            public final ao0 f35710b;

            {
                this.f35710b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f35710b.a(0);
                        return;
                    default:
                        this.f35710b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f31861b = k5Var2;
        org.telegram.ui.ActionBar.r6.Y(k5Var2, i10, mo0Var.I0);
        k5Var2.setTextSize(13);
        k5Var2.setLeftDrawable(2131232397);
        k5Var2.l(org.telegram.messenger.hd.M0(2131743375, null), false);
        k5Var2.setGravity(17);
        addView(k5Var2, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        k5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final ao0 f35710b;

            {
                this.f35710b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f35710b.a(0);
                        return;
                    default:
                        this.f35710b.a(1);
                        return;
                }
            }
        });
    }

    public final void a(int i7) {
        float measuredWidth;
        if (this.f31863e == i7) {
            return;
        }
        this.f31863e = i7;
        AnimatorSet animatorSet = this.f31864f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31864f = animatorSet2;
        int i10 = this.f31863e;
        bi.ec ecVar = this.d;
        if (i10 == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = ecVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(ecVar, View.TRANSLATION_X, measuredWidth));
        this.f31864f.setDuration(180L);
        this.f31864f.setInterpolator(xq.f40346g);
        this.f31864f.addListener(new e60(this, 19));
        this.f31864f.start();
        this.f31867s.a1();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int size = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f31862c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31861b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = org.telegram.messenger.g0.L(14.0f) + size;
        bi.ec ecVar = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ecVar.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f31864f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.f31863e == 0) {
            f10 = 0.0f;
        } else {
            f10 = layoutParams2.width;
        }
        ecVar.setTranslationX(f10);
        super.onMeasure(i7, i10);
    }
}
