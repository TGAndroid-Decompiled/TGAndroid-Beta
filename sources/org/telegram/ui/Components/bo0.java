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
public final class bo0 extends FrameLayout {
    public final View f32341a;
    public final org.telegram.ui.ActionBar.l5 f32342b;
    public final org.telegram.ui.ActionBar.l5 f32343c;
    public final bi.ec d;
    public int f32344e;
    public AnimatorSet f32345f;
    public LinearGradient h;
    public final Paint f32346n;
    public final RectF f32347r;
    public final no0 f32348s;

    public bo0(no0 no0Var, Context context) {
        super(context);
        this.f32348s = no0Var;
        this.f32346n = new Paint(1);
        this.f32347r = new RectF();
        View view = new View(context);
        this.f32341a = view;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.l6.O5;
        Drawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.w0(i7, no0Var.I0));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i7);
        org.telegram.ui.ActionBar.g6 g6Var = no0Var.I0;
        view.setBackground(d02);
        org.telegram.ui.ActionBar.s6.j(view, d02, M, null, g6Var);
        addView(view, c8.ha.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        bi.ec ecVar = new bi.ec(24, context, this);
        this.d = ecVar;
        addView(ecVar, c8.ha.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f32343c = l5Var;
        int i10 = org.telegram.ui.ActionBar.l6.f27838bh;
        org.telegram.ui.ActionBar.s6.X(l5Var, i10, no0Var.I0);
        l5Var.setTextSize(13);
        l5Var.setLeftDrawable(2131232396);
        l5Var.l(org.telegram.messenger.id.M0(2131743375, null), false);
        l5Var.setGravity(17);
        addView(l5Var, c8.ha.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        l5Var.setOnClickListener(new View.OnClickListener(this) {
            public final bo0 f36125b;

            {
                this.f36125b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f36125b.a(0);
                        return;
                    default:
                        this.f36125b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.f32342b = l5Var2;
        org.telegram.ui.ActionBar.s6.X(l5Var2, i10, no0Var.I0);
        l5Var2.setTextSize(13);
        l5Var2.setLeftDrawable(2131232397);
        l5Var2.l(org.telegram.messenger.id.M0(2131743374, null), false);
        l5Var2.setGravity(17);
        addView(l5Var2, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        l5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final bo0 f36125b;

            {
                this.f36125b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f36125b.a(0);
                        return;
                    default:
                        this.f36125b.a(1);
                        return;
                }
            }
        });
    }

    public final void a(int i7) {
        float measuredWidth;
        if (this.f32344e == i7) {
            return;
        }
        this.f32344e = i7;
        AnimatorSet animatorSet = this.f32345f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f32345f = animatorSet2;
        int i10 = this.f32344e;
        bi.ec ecVar = this.d;
        if (i10 == 0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = ecVar.getMeasuredWidth();
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(ecVar, View.TRANSLATION_X, measuredWidth));
        this.f32345f.setDuration(180L);
        this.f32345f.setInterpolator(xq.f40459g);
        this.f32345f.addListener(new f60(this, 19));
        this.f32345f.start();
        this.f32348s.a1();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int size = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.f32343c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32342b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = org.telegram.messenger.g0.L(14.0f) + size;
        bi.ec ecVar = this.d;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ecVar.getLayoutParams();
        layoutParams2.width = size;
        AnimatorSet animatorSet = this.f32345f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.f32344e == 0) {
            f10 = 0.0f;
        } else {
            f10 = layoutParams2.width;
        }
        ecVar.setTranslationX(f10);
        super.onMeasure(i7, i10);
    }
}
