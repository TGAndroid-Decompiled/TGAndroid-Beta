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
public final class cp0 extends FrameLayout {
    public final View f25126a;
    public final org.telegram.ui.ActionBar.u5 f25127b;
    public final org.telegram.ui.ActionBar.u5 f25128c;
    public final bi.t0 d;
    public int e;
    public AnimatorSet f25129f;
    public LinearGradient h;
    public final Paint f25130n;
    public final RectF f25131r;
    public final op0 f25132s;

    public cp0(op0 op0Var, Context context) {
        super(context);
        this.f25132s = op0Var;
        this.f25130n = new Paint(1);
        this.f25131r = new RectF();
        View view = new View(context);
        this.f25126a = view;
        int L = org.telegram.messenger.i0.L(18.0f);
        int i10 = org.telegram.ui.ActionBar.t6.O5;
        Drawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i10, op0Var.I0));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        org.telegram.ui.ActionBar.p6 p6Var = op0Var.I0;
        view.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(view, d02, N, null, p6Var);
        addView(view, w7.b6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        bi.t0 t0Var = new bi.t0(this, context, 19);
        this.d = t0Var;
        addView(t0Var, w7.b6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f25128c = u5Var;
        int i11 = org.telegram.ui.ActionBar.t6.f20901bh;
        org.telegram.ui.ActionBar.a7.Y(u5Var, i11, op0Var.I0);
        u5Var.setTextSize(13);
        u5Var.setLeftDrawable(2131232395);
        u5Var.l(org.telegram.messenger.cd.L0(2131743401, null), false);
        u5Var.setGravity(17);
        addView(u5Var, w7.b6.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        u5Var.setOnClickListener(new View.OnClickListener(this) {
            public final cp0 f28861b;

            {
                this.f28861b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f28861b.a(0);
                        return;
                    default:
                        this.f28861b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.f25127b = u5Var2;
        org.telegram.ui.ActionBar.a7.Y(u5Var2, i11, op0Var.I0);
        u5Var2.setTextSize(13);
        u5Var2.setLeftDrawable(2131232396);
        u5Var2.l(org.telegram.messenger.cd.L0(2131743400, null), false);
        u5Var2.setGravity(17);
        addView(u5Var2, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        u5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final cp0 f28861b;

            {
                this.f28861b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f28861b.a(0);
                        return;
                    default:
                        this.f28861b.a(1);
                        return;
                }
            }
        });
    }

    public final void a(int i10) {
        float measuredWidth;
        if (this.e == i10) {
            return;
        }
        this.e = i10;
        AnimatorSet animatorSet = this.f25129f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f25129f = animatorSet2;
        int i11 = this.e;
        bi.t0 t0Var = this.d;
        if (i11 == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = t0Var.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(t0Var, View.TRANSLATION_X, measuredWidth));
        this.f25129f.setDuration(180L);
        this.f25129f.setInterpolator(gr.f26496g);
        this.f25129f.addListener(new t60(this, 19));
        this.f25129f.start();
        this.f25132s.a1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f25128c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25127b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = org.telegram.messenger.i0.L(14.0f) + size;
        bi.t0 t0Var = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) t0Var.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f25129f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.e == 0) {
            f7 = 0.0f;
        } else {
            f7 = layoutParams2.width;
        }
        t0Var.setTranslationX(f7);
        super.onMeasure(i10, i11);
    }
}
