package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class q91 extends View {
    public float E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public AnimatorSet K;
    public p91 L;
    public boolean M;
    public final org.telegram.ui.Cells.d2 N;
    public final Drawable f27539a;
    public final Drawable f27540b;
    public final Drawable f27541c;
    public final Drawable d;
    public final Drawable e;
    public final Drawable f27542f;
    public int h;
    public int f27543n;
    public int f27544r;
    public int f27545s;
    public int v;
    public int f27546w;
    public int f27547x;
    public int f27548y;

    public q91(Context context) {
        super(context);
        this.M = true;
        this.N = new org.telegram.ui.Cells.d2(this);
        this.f27539a = context.getResources().getDrawable(R.drawable.zoom_minus);
        this.f27540b = context.getResources().getDrawable(R.drawable.zoom_plus);
        this.f27541c = context.getResources().getDrawable(R.drawable.zoom_slide);
        this.d = context.getResources().getDrawable(R.drawable.zoom_slide_a);
        this.e = context.getResources().getDrawable(R.drawable.zoom_round);
        this.f27542f = context.getResources().getDrawable(R.drawable.zoom_round_b);
    }

    public final boolean a(float f7) {
        if (f7 < 0.0f || f7 > 1.0f) {
            return false;
        }
        AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.J = f7;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.K = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.N, f7));
        this.K.setDuration(180L);
        this.K.addListener(new q81(this, 2));
        this.K.start();
        return true;
    }

    public final void b(float f7, boolean z10) {
        p91 p91Var;
        if (f7 == this.E) {
            return;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        this.E = f7;
        if (z10 && (p91Var = this.L) != null) {
            p91Var.a(f7);
        }
        invalidate();
    }

    public float getZoom() {
        if (this.K != null) {
            return this.J;
        }
        return this.E;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        Drawable drawable;
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        if (getMeasuredWidth() > getMeasuredHeight()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.h = AndroidUtilities.dp(41.0f);
            this.f27543n = measuredHeight;
            this.f27544r = getMeasuredWidth() - AndroidUtilities.dp(41.0f);
            this.f27545s = measuredHeight;
            this.v = AndroidUtilities.dp(18.0f) + this.h;
            this.f27546w = measuredHeight;
            this.f27547x = this.f27544r - AndroidUtilities.dp(18.0f);
            this.f27548y = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f27543n = AndroidUtilities.dp(41.0f);
            this.f27544r = measuredWidth;
            this.f27545s = getMeasuredHeight() - AndroidUtilities.dp(41.0f);
            this.v = measuredWidth;
            this.f27546w = AndroidUtilities.dp(18.0f) + this.f27543n;
            this.f27547x = measuredWidth;
            this.f27548y = this.f27545s - AndroidUtilities.dp(18.0f);
        }
        int dp = this.h - AndroidUtilities.dp(7.0f);
        int dp2 = this.f27543n - AndroidUtilities.dp(7.0f);
        int dp3 = AndroidUtilities.dp(7.0f) + this.h;
        int dp4 = AndroidUtilities.dp(7.0f) + this.f27543n;
        Drawable drawable2 = this.f27539a;
        drawable2.setBounds(dp, dp2, dp3, dp4);
        drawable2.draw(canvas);
        int dp5 = this.f27544r - AndroidUtilities.dp(7.0f);
        int dp6 = this.f27545s - AndroidUtilities.dp(7.0f);
        int dp7 = AndroidUtilities.dp(7.0f) + this.f27544r;
        int dp8 = AndroidUtilities.dp(7.0f) + this.f27545s;
        Drawable drawable3 = this.f27540b;
        drawable3.setBounds(dp5, dp6, dp7, dp8);
        drawable3.draw(canvas);
        int i10 = this.f27547x;
        int i11 = this.v;
        int i12 = this.f27548y;
        int i13 = this.f27546w;
        float f7 = this.E;
        int i14 = (int) (((i10 - i11) * f7) + i11);
        int i15 = (int) (((i12 - i13) * f7) + i13);
        Drawable drawable4 = this.d;
        Drawable drawable5 = this.f27541c;
        if (z10) {
            drawable5.setBounds(i11, i13 - AndroidUtilities.dp(3.0f), this.f27547x, AndroidUtilities.dp(3.0f) + this.f27546w);
            drawable4.setBounds(this.v, this.f27546w - AndroidUtilities.dp(3.0f), i14, AndroidUtilities.dp(3.0f) + this.f27546w);
        } else {
            drawable5.setBounds(i13, 0, i12, AndroidUtilities.dp(6.0f));
            drawable4.setBounds(this.f27546w, 0, i15, AndroidUtilities.dp(6.0f));
            canvas.save();
            canvas.rotate(90.0f);
            canvas.translate(0.0f, (-this.v) - AndroidUtilities.dp(3.0f));
        }
        drawable5.draw(canvas);
        drawable4.draw(canvas);
        if (!z10) {
            canvas.restore();
        }
        if (this.G) {
            drawable = this.f27542f;
        } else {
            drawable = this.e;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i14 - intrinsicWidth, i15 - intrinsicWidth, i14 + intrinsicWidth, i15 + intrinsicWidth);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q91.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(p91 p91Var) {
        this.L = p91Var;
    }
}
