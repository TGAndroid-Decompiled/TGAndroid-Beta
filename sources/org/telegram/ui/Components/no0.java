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
public final class no0 extends FrameLayout {
    public final View f37875a;
    public final org.telegram.ui.ActionBar.n5 f37876b;
    public final org.telegram.ui.ActionBar.n5 f37877c;
    public final bi.o3 d;
    public int f37878e;
    public AnimatorSet f37879f;
    public LinearGradient h;
    public final Paint f37880n;
    public final RectF f37881r;
    public final zo0 f37882s;

    public no0(zo0 zo0Var, Context context) {
        super(context);
        this.f37882s = zo0Var;
        this.f37880n = new Paint(1);
        this.f37881r = new RectF();
        View view = new View(context);
        this.f37875a = view;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.n6.O5;
        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, zo0Var.J0));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.i6 i6Var = zo0Var.J0;
        view.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(view, d02, M, null, i6Var);
        addView(view, c8.na.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        bi.o3 o3Var = new bi.o3(25, context, this);
        this.d = o3Var;
        addView(o3Var, c8.na.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f37877c = n5Var;
        int i10 = org.telegram.ui.ActionBar.n6.f29480eh;
        org.telegram.ui.ActionBar.u6.X(n5Var, i10, zo0Var.J0);
        n5Var.setTextSize(13);
        n5Var.setLeftDrawable(2131232401);
        n5Var.l(org.telegram.messenger.gd.N0(2131743125, null), false);
        n5Var.setGravity(17);
        addView(n5Var, c8.na.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        n5Var.setOnClickListener(new View.OnClickListener(this) {
            public final no0 f42532b;

            {
                this.f42532b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f42532b.a(0);
                        return;
                    default:
                        this.f42532b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.f37876b = n5Var2;
        org.telegram.ui.ActionBar.u6.X(n5Var2, i10, zo0Var.J0);
        n5Var2.setTextSize(13);
        n5Var2.setLeftDrawable(2131232402);
        n5Var2.l(org.telegram.messenger.gd.N0(2131743124, null), false);
        n5Var2.setGravity(17);
        addView(n5Var2, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        n5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final no0 f42532b;

            {
                this.f42532b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f42532b.a(0);
                        return;
                    default:
                        this.f42532b.a(1);
                        return;
                }
            }
        });
    }

    public final void a(int i7) {
        float measuredWidth;
        if (this.f37878e == i7) {
            return;
        }
        this.f37878e = i7;
        AnimatorSet animatorSet = this.f37879f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f37879f = animatorSet2;
        int i10 = this.f37878e;
        bi.o3 o3Var = this.d;
        if (i10 == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = o3Var.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(o3Var, View.TRANSLATION_X, measuredWidth));
        this.f37879f.setDuration(180L);
        this.f37879f.setInterpolator(kr.f36859g);
        this.f37879f.addListener(new p60(this, 19));
        this.f37879f.start();
        this.f37882s.b1();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int size = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f37877c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f37876b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = org.telegram.messenger.g0.L(14.0f) + size;
        bi.o3 o3Var = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) o3Var.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f37879f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.f37878e == 0) {
            f10 = 0.0f;
        } else {
            f10 = layoutParams2.width;
        }
        o3Var.setTranslationX(f10);
        super.onMeasure(i7, i10);
    }
}
