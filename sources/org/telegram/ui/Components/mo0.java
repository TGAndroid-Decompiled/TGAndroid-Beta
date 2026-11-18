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
public final class mo0 extends FrameLayout {
    public final View f37590a;
    public final org.telegram.ui.ActionBar.n5 f37591b;
    public final org.telegram.ui.ActionBar.n5 f37592c;
    public final bi.i3 d;
    public int f37593e;
    public AnimatorSet f37594f;
    public LinearGradient h;
    public final Paint f37595n;
    public final RectF f37596r;
    public final yo0 f37597s;

    public mo0(yo0 yo0Var, Context context) {
        super(context);
        this.f37597s = yo0Var;
        this.f37595n = new Paint(1);
        this.f37596r = new RectF();
        View view = new View(context);
        this.f37590a = view;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.n6.O5;
        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, yo0Var.J0));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.i6 i6Var = yo0Var.J0;
        view.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(view, d02, M, null, i6Var);
        addView(view, c8.ma.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        bi.i3 i3Var = new bi.i3(25, context, this);
        this.d = i3Var;
        addView(i3Var, c8.ma.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f37592c = n5Var;
        int i10 = org.telegram.ui.ActionBar.n6.f29425eh;
        org.telegram.ui.ActionBar.u6.X(n5Var, i10, yo0Var.J0);
        n5Var.setTextSize(13);
        n5Var.setLeftDrawable(2131232398);
        n5Var.l(org.telegram.messenger.gd.M0(2131743138, null), false);
        n5Var.setGravity(17);
        addView(n5Var, c8.ma.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        n5Var.setOnClickListener(new View.OnClickListener(this) {
            public final mo0 f42155b;

            {
                this.f42155b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f42155b.a(0);
                        return;
                    default:
                        this.f42155b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.f37591b = n5Var2;
        org.telegram.ui.ActionBar.u6.X(n5Var2, i10, yo0Var.J0);
        n5Var2.setTextSize(13);
        n5Var2.setLeftDrawable(2131232399);
        n5Var2.l(org.telegram.messenger.gd.M0(2131743137, null), false);
        n5Var2.setGravity(17);
        addView(n5Var2, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        n5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final mo0 f42155b;

            {
                this.f42155b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f42155b.a(0);
                        return;
                    default:
                        this.f42155b.a(1);
                        return;
                }
            }
        });
    }

    public final void a(int i7) {
        float measuredWidth;
        if (this.f37593e == i7) {
            return;
        }
        this.f37593e = i7;
        AnimatorSet animatorSet = this.f37594f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f37594f = animatorSet2;
        int i10 = this.f37593e;
        bi.i3 i3Var = this.d;
        if (i10 == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = i3Var.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(i3Var, View.TRANSLATION_X, measuredWidth));
        this.f37594f.setDuration(180L);
        this.f37594f.setInterpolator(lr.f37209g);
        this.f37594f.addListener(new q60(this, 19));
        this.f37594f.start();
        this.f37597s.b1();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int size = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f37592c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f37591b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = org.telegram.messenger.g0.L(14.0f) + size;
        bi.i3 i3Var = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) i3Var.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f37594f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.f37593e == 0) {
            f10 = 0.0f;
        } else {
            f10 = layoutParams2.width;
        }
        i3Var.setTranslationX(f10);
        super.onMeasure(i7, i10);
    }
}
