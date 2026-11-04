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
public final class co0 extends FrameLayout {
    public final View f32778a;
    public final org.telegram.ui.ActionBar.k5 f32779b;
    public final org.telegram.ui.ActionBar.k5 f32780c;
    public final ai.x2 d;
    public int f32781e;
    public AnimatorSet f32782f;
    public LinearGradient h;
    public final Paint f32783n;
    public final RectF f32784r;
    public final oo0 f32785s;

    public co0(oo0 oo0Var, Context context) {
        super(context);
        this.f32785s = oo0Var;
        this.f32783n = new Paint(1);
        this.f32784r = new RectF();
        View view = new View(context);
        this.f32778a = view;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i3 = org.telegram.ui.ActionBar.k6.O5;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i3, oo0Var.J0));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        org.telegram.ui.ActionBar.e6 e6Var = oo0Var.J0;
        view.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(view, d02, N, null, e6Var);
        addView(view, b8.mf.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        ai.x2 x2Var = new ai.x2(25, context, this);
        this.d = x2Var;
        addView(x2Var, b8.mf.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f32780c = k5Var;
        int i10 = org.telegram.ui.ActionBar.k6.f27853bh;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i10, oo0Var.J0);
        k5Var.setTextSize(13);
        k5Var.setLeftDrawable(2131232396);
        k5Var.l(org.telegram.messenger.bd.M0(2131743385, null), false);
        k5Var.setGravity(17);
        addView(k5Var, b8.mf.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        k5Var.setOnClickListener(new View.OnClickListener(this) {
            public final co0 f36597b;

            {
                this.f36597b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f36597b.a(0);
                        return;
                    default:
                        this.f36597b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f32779b = k5Var2;
        org.telegram.ui.ActionBar.r6.Y(k5Var2, i10, oo0Var.J0);
        k5Var2.setTextSize(13);
        k5Var2.setLeftDrawable(2131232397);
        k5Var2.l(org.telegram.messenger.bd.M0(2131743384, null), false);
        k5Var2.setGravity(17);
        addView(k5Var2, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        k5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final co0 f36597b;

            {
                this.f36597b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f36597b.a(0);
                        return;
                    default:
                        this.f36597b.a(1);
                        return;
                }
            }
        });
    }

    public final void a(int i3) {
        float measuredWidth;
        if (this.f32781e == i3) {
            return;
        }
        this.f32781e = i3;
        AnimatorSet animatorSet = this.f32782f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f32782f = animatorSet2;
        int i10 = this.f32781e;
        ai.x2 x2Var = this.d;
        if (i10 == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = x2Var.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(x2Var, View.TRANSLATION_X, measuredWidth));
        this.f32782f.setDuration(180L);
        this.f32782f.setInterpolator(xq.f40453g);
        this.f32782f.addListener(new a60(this, 19));
        this.f32782f.start();
        this.f32785s.a1();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        int size = (View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f32780c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32779b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = org.telegram.messenger.g0.L(14.0f) + size;
        ai.x2 x2Var = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) x2Var.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f32782f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.f32781e == 0) {
            f10 = 0.0f;
        } else {
            f10 = layoutParams2.width;
        }
        x2Var.setTranslationX(f10);
        super.onMeasure(i3, i10);
    }
}
