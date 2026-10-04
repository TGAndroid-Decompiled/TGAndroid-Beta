package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ba1 extends View {
    public float E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public AnimatorSet K;
    public aa1 L;
    public boolean M;
    public final org.telegram.ui.Cells.d2 N;
    public final Drawable f24893a;
    public final Drawable f24894b;
    public final Drawable f24895c;
    public final Drawable d;
    public final Drawable f24896e;
    public final Drawable f24897f;
    public int h;
    public int f24898n;
    public int f24899r;
    public int f24900s;
    public int v;
    public int f24901w;
    public int f24902x;
    public int f24903y;

    public ba1(Context context) {
        super(context);
        this.M = true;
        this.N = new org.telegram.ui.Cells.d2(this);
        this.f24893a = context.getResources().getDrawable(R.drawable.zoom_minus);
        this.f24894b = context.getResources().getDrawable(R.drawable.zoom_plus);
        this.f24895c = context.getResources().getDrawable(R.drawable.zoom_slide);
        this.d = context.getResources().getDrawable(R.drawable.zoom_slide_a);
        this.f24896e = context.getResources().getDrawable(R.drawable.zoom_round);
        this.f24897f = context.getResources().getDrawable(R.drawable.zoom_round_b);
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
        this.K.addListener(new a91(this, 2));
        this.K.start();
        return true;
    }

    public final void b(float f7, boolean z10) {
        aa1 aa1Var;
        if (f7 == this.E) {
            return;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        this.E = f7;
        if (z10 && (aa1Var = this.L) != null) {
            aa1Var.a(f7);
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
            this.f24898n = measuredHeight;
            this.f24899r = getMeasuredWidth() - AndroidUtilities.dp(41.0f);
            this.f24900s = measuredHeight;
            this.v = AndroidUtilities.dp(18.0f) + this.h;
            this.f24901w = measuredHeight;
            this.f24902x = this.f24899r - AndroidUtilities.dp(18.0f);
            this.f24903y = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f24898n = AndroidUtilities.dp(41.0f);
            this.f24899r = measuredWidth;
            this.f24900s = getMeasuredHeight() - AndroidUtilities.dp(41.0f);
            this.v = measuredWidth;
            this.f24901w = AndroidUtilities.dp(18.0f) + this.f24898n;
            this.f24902x = measuredWidth;
            this.f24903y = this.f24900s - AndroidUtilities.dp(18.0f);
        }
        int dp = this.h - AndroidUtilities.dp(7.0f);
        int dp2 = this.f24898n - AndroidUtilities.dp(7.0f);
        int dp3 = AndroidUtilities.dp(7.0f) + this.h;
        int dp4 = AndroidUtilities.dp(7.0f) + this.f24898n;
        Drawable drawable2 = this.f24893a;
        drawable2.setBounds(dp, dp2, dp3, dp4);
        drawable2.draw(canvas);
        int dp5 = this.f24899r - AndroidUtilities.dp(7.0f);
        int dp6 = this.f24900s - AndroidUtilities.dp(7.0f);
        int dp7 = AndroidUtilities.dp(7.0f) + this.f24899r;
        int dp8 = AndroidUtilities.dp(7.0f) + this.f24900s;
        Drawable drawable3 = this.f24894b;
        drawable3.setBounds(dp5, dp6, dp7, dp8);
        drawable3.draw(canvas);
        int i10 = this.f24902x;
        int i11 = this.v;
        int i12 = this.f24903y;
        int i13 = this.f24901w;
        float f7 = this.E;
        int i14 = (int) (((i10 - i11) * f7) + i11);
        int i15 = (int) (((i12 - i13) * f7) + i13);
        Drawable drawable4 = this.d;
        Drawable drawable5 = this.f24895c;
        if (z10) {
            drawable5.setBounds(i11, i13 - AndroidUtilities.dp(3.0f), this.f24902x, AndroidUtilities.dp(3.0f) + this.f24901w);
            drawable4.setBounds(this.v, this.f24901w - AndroidUtilities.dp(3.0f), i14, AndroidUtilities.dp(3.0f) + this.f24901w);
        } else {
            drawable5.setBounds(i13, 0, i12, AndroidUtilities.dp(6.0f));
            drawable4.setBounds(this.f24901w, 0, i15, AndroidUtilities.dp(6.0f));
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
            drawable = this.f24897f;
        } else {
            drawable = this.f24896e;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i14 - intrinsicWidth, i15 - intrinsicWidth, i14 + intrinsicWidth, i15 + intrinsicWidth);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ba1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(aa1 aa1Var) {
        this.L = aa1Var;
    }
}
