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
    public final View f38312a;
    public final org.telegram.ui.ActionBar.m5 f38313b;
    public final org.telegram.ui.ActionBar.m5 f38314c;
    public final bi.m3 d;
    public int f38315e;
    public AnimatorSet f38316f;
    public LinearGradient h;
    public final Paint f38317n;
    public final RectF f38318r;
    public final ap0 f38319s;

    public oo0(ap0 ap0Var, Context context) {
        super(context);
        this.f38319s = ap0Var;
        this.f38317n = new Paint(1);
        this.f38318r = new RectF();
        View view = new View(context);
        this.f38312a = view;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.m6.O5;
        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i7, ap0Var.J0));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        org.telegram.ui.ActionBar.h6 h6Var = ap0Var.J0;
        view.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(view, d02, M, null, h6Var);
        addView(view, c8.ma.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        bi.m3 m3Var = new bi.m3(25, context, this);
        this.d = m3Var;
        addView(m3Var, c8.ma.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f38314c = m5Var;
        int i10 = org.telegram.ui.ActionBar.m6.f29410eh;
        org.telegram.ui.ActionBar.t6.X(m5Var, i10, ap0Var.J0);
        m5Var.setTextSize(13);
        m5Var.setLeftDrawable(2131232398);
        m5Var.l(org.telegram.messenger.hd.N0(2131743130, null), false);
        m5Var.setGravity(17);
        addView(m5Var, c8.ma.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        m5Var.setOnClickListener(new View.OnClickListener(this) {
            public final oo0 f42954b;

            {
                this.f42954b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f42954b.a(0);
                        return;
                    default:
                        this.f42954b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.f38313b = m5Var2;
        org.telegram.ui.ActionBar.t6.X(m5Var2, i10, ap0Var.J0);
        m5Var2.setTextSize(13);
        m5Var2.setLeftDrawable(2131232399);
        m5Var2.l(org.telegram.messenger.hd.N0(2131743129, null), false);
        m5Var2.setGravity(17);
        addView(m5Var2, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        m5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final oo0 f42954b;

            {
                this.f42954b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f42954b.a(0);
                        return;
                    default:
                        this.f42954b.a(1);
                        return;
                }
            }
        });
    }

    public final void a(int i7) {
        float measuredWidth;
        if (this.f38315e == i7) {
            return;
        }
        this.f38315e = i7;
        AnimatorSet animatorSet = this.f38316f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f38316f = animatorSet2;
        int i10 = this.f38315e;
        bi.m3 m3Var = this.d;
        if (i10 == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = m3Var.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(m3Var, View.TRANSLATION_X, measuredWidth));
        this.f38316f.setDuration(180L);
        this.f38316f.setInterpolator(nr.f37961g);
        this.f38316f.addListener(new s60(this, 19));
        this.f38316f.start();
        this.f38319s.b1();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int size = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f38314c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f38313b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = org.telegram.messenger.g0.L(14.0f) + size;
        bi.m3 m3Var = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) m3Var.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f38316f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.f38315e == 0) {
            f10 = 0.0f;
        } else {
            f10 = layoutParams2.width;
        }
        m3Var.setTranslationX(f10);
        super.onMeasure(i7, i10);
    }
}
