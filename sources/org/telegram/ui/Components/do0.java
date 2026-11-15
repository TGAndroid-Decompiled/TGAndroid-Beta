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
public final class do0 extends FrameLayout {
    public final View f34014a;
    public final org.telegram.ui.ActionBar.j5 f34015b;
    public final org.telegram.ui.ActionBar.j5 f34016c;
    public final bi.o2 d;
    public int f34017e;
    public AnimatorSet f34018f;
    public LinearGradient h;
    public final Paint f34019n;
    public final RectF f34020r;
    public final po0 f34021s;

    public do0(po0 po0Var, Context context) {
        super(context);
        this.f34021s = po0Var;
        this.f34019n = new Paint(1);
        this.f34020r = new RectF();
        View view = new View(context);
        this.f34014a = view;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.j6.O5;
        Drawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i7, po0Var.J0));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        org.telegram.ui.ActionBar.e6 e6Var = po0Var.J0;
        view.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(view, d02, M, null, e6Var);
        addView(view, c8.ja.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        bi.o2 o2Var = new bi.o2(25, context, this);
        this.d = o2Var;
        addView(o2Var, c8.ja.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f34016c = j5Var;
        int i10 = org.telegram.ui.ActionBar.j6.f28878eh;
        org.telegram.ui.ActionBar.q6.X(j5Var, i10, po0Var.J0);
        j5Var.setTextSize(13);
        j5Var.setLeftDrawable(2131232397);
        j5Var.l(org.telegram.messenger.hd.M0(2131743375, null), false);
        j5Var.setGravity(17);
        addView(j5Var, c8.ja.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        j5Var.setOnClickListener(new View.OnClickListener(this) {
            public final do0 f38035b;

            {
                this.f38035b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f38035b.a(0);
                        return;
                    default:
                        this.f38035b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.f34015b = j5Var2;
        org.telegram.ui.ActionBar.q6.X(j5Var2, i10, po0Var.J0);
        j5Var2.setTextSize(13);
        j5Var2.setLeftDrawable(2131232398);
        j5Var2.l(org.telegram.messenger.hd.M0(2131743374, null), false);
        j5Var2.setGravity(17);
        addView(j5Var2, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        j5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final do0 f38035b;

            {
                this.f38035b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f38035b.a(0);
                        return;
                    default:
                        this.f38035b.a(1);
                        return;
                }
            }
        });
    }

    public final void a(int i7) {
        float measuredWidth;
        if (this.f34017e == i7) {
            return;
        }
        this.f34017e = i7;
        AnimatorSet animatorSet = this.f34018f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f34018f = animatorSet2;
        int i10 = this.f34017e;
        bi.o2 o2Var = this.d;
        if (i10 == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = o2Var.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(o2Var, View.TRANSLATION_X, measuredWidth));
        this.f34018f.setDuration(180L);
        this.f34018f.setInterpolator(er.f34421g);
        this.f34018f.addListener(new h60(this, 19));
        this.f34018f.start();
        this.f34021s.a1();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int size = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f34016c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f34015b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = org.telegram.messenger.g0.L(14.0f) + size;
        bi.o2 o2Var = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) o2Var.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f34018f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.f34017e == 0) {
            f10 = 0.0f;
        } else {
            f10 = layoutParams2.width;
        }
        o2Var.setTranslationX(f10);
        super.onMeasure(i7, i10);
    }
}
