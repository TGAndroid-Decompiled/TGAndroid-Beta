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
public final class oo0 extends FrameLayout {
    public final View f38283a;
    public final org.telegram.ui.ActionBar.m5 f38284b;
    public final org.telegram.ui.ActionBar.m5 f38285c;
    public final bi.o3 d;
    public int f38286e;
    public AnimatorSet f38287f;
    public LinearGradient h;
    public final Paint f38288n;
    public final RectF f38289r;
    public final ap0 f38290s;

    public oo0(ap0 ap0Var, Context context) {
        super(context);
        this.f38290s = ap0Var;
        this.f38288n = new Paint(1);
        this.f38289r = new RectF();
        View view = new View(context);
        this.f38283a = view;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.m6.O5;
        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i7, ap0Var.J0));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        org.telegram.ui.ActionBar.h6 h6Var = ap0Var.J0;
        view.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(view, d02, M, null, h6Var);
        addView(view, c8.na.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        bi.o3 o3Var = new bi.o3(25, context, this);
        this.d = o3Var;
        addView(o3Var, c8.na.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f38285c = m5Var;
        int i10 = org.telegram.ui.ActionBar.m6.f29376eh;
        org.telegram.ui.ActionBar.t6.X(m5Var, i10, ap0Var.J0);
        m5Var.setTextSize(13);
        m5Var.setLeftDrawable(2131232398);
        m5Var.l(org.telegram.messenger.hd.N0(2131743132, null), false);
        m5Var.setGravity(17);
        addView(m5Var, c8.na.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        m5Var.setOnClickListener(new View.OnClickListener(this) {
            public final oo0 f42911b;

            {
                this.f42911b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f42911b.a(0);
                        return;
                    default:
                        this.f42911b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.f38284b = m5Var2;
        org.telegram.ui.ActionBar.t6.X(m5Var2, i10, ap0Var.J0);
        m5Var2.setTextSize(13);
        m5Var2.setLeftDrawable(2131232399);
        m5Var2.l(org.telegram.messenger.hd.N0(2131743131, null), false);
        m5Var2.setGravity(17);
        addView(m5Var2, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        m5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final oo0 f42911b;

            {
                this.f42911b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f42911b.a(0);
                        return;
                    default:
                        this.f42911b.a(1);
                        return;
                }
            }
        });
    }

    public final void a(int i7) {
        float measuredWidth;
        if (this.f38286e == i7) {
            return;
        }
        this.f38286e = i7;
        AnimatorSet animatorSet = this.f38287f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f38287f = animatorSet2;
        int i10 = this.f38286e;
        bi.o3 o3Var = this.d;
        if (i10 == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = o3Var.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(o3Var, View.TRANSLATION_X, measuredWidth));
        this.f38287f.setDuration(180L);
        this.f38287f.setInterpolator(nr.f37918g);
        this.f38287f.addListener(new s60(this, 19));
        this.f38287f.start();
        this.f38290s.b1();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int size = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f38285c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f38284b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = org.telegram.messenger.g0.L(14.0f) + size;
        bi.o3 o3Var = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) o3Var.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f38287f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.f38286e == 0) {
            f10 = 0.0f;
        } else {
            f10 = layoutParams2.width;
        }
        o3Var.setTranslationX(f10);
        super.onMeasure(i7, i10);
    }
}
