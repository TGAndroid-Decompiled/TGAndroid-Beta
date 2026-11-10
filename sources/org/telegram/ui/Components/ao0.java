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
    public final View f31944a;
    public final org.telegram.ui.ActionBar.m5 f31945b;
    public final org.telegram.ui.ActionBar.m5 f31946c;
    public final bi.ec d;
    public int f31947e;
    public AnimatorSet f31948f;
    public LinearGradient h;
    public final Paint f31949n;
    public final RectF f31950r;
    public final mo0 f31951s;

    public ao0(mo0 mo0Var, Context context) {
        super(context);
        this.f31951s = mo0Var;
        this.f31949n = new Paint(1);
        this.f31950r = new RectF();
        View view = new View(context);
        this.f31944a = view;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.m6.O5;
        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i7, mo0Var.I0));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        org.telegram.ui.ActionBar.h6 h6Var = mo0Var.I0;
        view.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(view, d02, M, null, h6Var);
        addView(view, c8.ha.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        bi.ec ecVar = new bi.ec(24, context, this);
        this.d = ecVar;
        addView(ecVar, c8.ha.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f31946c = m5Var;
        int i10 = org.telegram.ui.ActionBar.m6.f27863bh;
        org.telegram.ui.ActionBar.t6.X(m5Var, i10, mo0Var.I0);
        m5Var.setTextSize(13);
        m5Var.setLeftDrawable(2131232396);
        m5Var.l(org.telegram.messenger.id.M0(2131743375, null), false);
        m5Var.setGravity(17);
        addView(m5Var, c8.ha.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        m5Var.setOnClickListener(new View.OnClickListener(this) {
            public final ao0 f35709b;

            {
                this.f35709b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f35709b.a(0);
                        return;
                    default:
                        this.f35709b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.f31945b = m5Var2;
        org.telegram.ui.ActionBar.t6.X(m5Var2, i10, mo0Var.I0);
        m5Var2.setTextSize(13);
        m5Var2.setLeftDrawable(2131232397);
        m5Var2.l(org.telegram.messenger.id.M0(2131743374, null), false);
        m5Var2.setGravity(17);
        addView(m5Var2, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        m5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final ao0 f35709b;

            {
                this.f35709b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f35709b.a(0);
                        return;
                    default:
                        this.f35709b.a(1);
                        return;
                }
            }
        });
    }

    public final void a(int i7) {
        float measuredWidth;
        if (this.f31947e == i7) {
            return;
        }
        this.f31947e = i7;
        AnimatorSet animatorSet = this.f31948f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31948f = animatorSet2;
        int i10 = this.f31947e;
        bi.ec ecVar = this.d;
        if (i10 == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = ecVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(ecVar, View.TRANSLATION_X, measuredWidth));
        this.f31948f.setDuration(180L);
        this.f31948f.setInterpolator(wq.f40047g);
        this.f31948f.addListener(new e60(this, 19));
        this.f31948f.start();
        this.f31951s.a1();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int size = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f31946c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31945b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = org.telegram.messenger.g0.L(14.0f) + size;
        bi.ec ecVar = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ecVar.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f31948f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.f31947e == 0) {
            f10 = 0.0f;
        } else {
            f10 = layoutParams2.width;
        }
        ecVar.setTranslationX(f10);
        super.onMeasure(i7, i10);
    }
}
