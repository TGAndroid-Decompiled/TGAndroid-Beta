package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class f91 extends View {
    public float E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public AnimatorSet K;
    public e91 L;
    public boolean M;
    public final org.telegram.ui.Cells.c2 N;
    public final Drawable f23849a;
    public final Drawable f23850b;
    public final Drawable f23851c;
    public final Drawable d;
    public final Drawable e;
    public final Drawable f23852f;
    public int h;
    public int f23853n;
    public int f23854r;
    public int f23855s;
    public int v;
    public int f23856w;
    public int f23857x;
    public int f23858y;

    public f91(Context context) {
        super(context);
        this.M = true;
        this.N = new org.telegram.ui.Cells.c2(this);
        this.f23849a = context.getResources().getDrawable(R.drawable.zoom_minus);
        this.f23850b = context.getResources().getDrawable(R.drawable.zoom_plus);
        this.f23851c = context.getResources().getDrawable(R.drawable.zoom_slide);
        this.d = context.getResources().getDrawable(R.drawable.zoom_slide_a);
        this.e = context.getResources().getDrawable(R.drawable.zoom_round);
        this.f23852f = context.getResources().getDrawable(R.drawable.zoom_round_b);
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
        this.K.addListener(new w81(this, 1));
        this.K.start();
        return true;
    }

    public final void b(float f7, boolean z10) {
        e91 e91Var;
        if (f7 == this.E) {
            return;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        this.E = f7;
        if (z10 && (e91Var = this.L) != null) {
            e91Var.a(f7);
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
            this.f23853n = measuredHeight;
            this.f23854r = getMeasuredWidth() - AndroidUtilities.dp(41.0f);
            this.f23855s = measuredHeight;
            this.v = AndroidUtilities.dp(18.0f) + this.h;
            this.f23856w = measuredHeight;
            this.f23857x = this.f23854r - AndroidUtilities.dp(18.0f);
            this.f23858y = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f23853n = AndroidUtilities.dp(41.0f);
            this.f23854r = measuredWidth;
            this.f23855s = getMeasuredHeight() - AndroidUtilities.dp(41.0f);
            this.v = measuredWidth;
            this.f23856w = AndroidUtilities.dp(18.0f) + this.f23853n;
            this.f23857x = measuredWidth;
            this.f23858y = this.f23855s - AndroidUtilities.dp(18.0f);
        }
        int dp = this.h - AndroidUtilities.dp(7.0f);
        int dp2 = this.f23853n - AndroidUtilities.dp(7.0f);
        int dp3 = AndroidUtilities.dp(7.0f) + this.h;
        int dp4 = AndroidUtilities.dp(7.0f) + this.f23853n;
        Drawable drawable2 = this.f23849a;
        drawable2.setBounds(dp, dp2, dp3, dp4);
        drawable2.draw(canvas);
        int dp5 = this.f23854r - AndroidUtilities.dp(7.0f);
        int dp6 = this.f23855s - AndroidUtilities.dp(7.0f);
        int dp7 = AndroidUtilities.dp(7.0f) + this.f23854r;
        int dp8 = AndroidUtilities.dp(7.0f) + this.f23855s;
        Drawable drawable3 = this.f23850b;
        drawable3.setBounds(dp5, dp6, dp7, dp8);
        drawable3.draw(canvas);
        int i10 = this.f23857x;
        int i11 = this.v;
        int i12 = this.f23858y;
        int i13 = this.f23856w;
        float f7 = this.E;
        int i14 = (int) (((i10 - i11) * f7) + i11);
        int i15 = (int) (((i12 - i13) * f7) + i13);
        Drawable drawable4 = this.d;
        Drawable drawable5 = this.f23851c;
        if (z10) {
            drawable5.setBounds(i11, i13 - AndroidUtilities.dp(3.0f), this.f23857x, AndroidUtilities.dp(3.0f) + this.f23856w);
            drawable4.setBounds(this.v, this.f23856w - AndroidUtilities.dp(3.0f), i14, AndroidUtilities.dp(3.0f) + this.f23856w);
        } else {
            drawable5.setBounds(i13, 0, i12, AndroidUtilities.dp(6.0f));
            drawable4.setBounds(this.f23856w, 0, i15, AndroidUtilities.dp(6.0f));
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
            drawable = this.f23852f;
        } else {
            drawable = this.e;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i14 - intrinsicWidth, i15 - intrinsicWidth, i14 + intrinsicWidth, i15 + intrinsicWidth);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f91.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(e91 e91Var) {
        this.L = e91Var;
    }
}
