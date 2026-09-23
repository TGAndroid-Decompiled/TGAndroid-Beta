package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class d91 extends View {
    public float E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public AnimatorSet K;
    public c91 L;
    public boolean M;
    public final org.telegram.ui.Cells.c2 N;
    public final Drawable f23345a;
    public final Drawable f23346b;
    public final Drawable f23347c;
    public final Drawable d;
    public final Drawable e;
    public final Drawable f23348f;
    public int h;
    public int f23349n;
    public int f23350r;
    public int f23351s;
    public int v;
    public int f23352w;
    public int f23353x;
    public int f23354y;

    public d91(Context context) {
        super(context);
        this.M = true;
        this.N = new org.telegram.ui.Cells.c2(this);
        this.f23345a = context.getResources().getDrawable(R.drawable.zoom_minus);
        this.f23346b = context.getResources().getDrawable(R.drawable.zoom_plus);
        this.f23347c = context.getResources().getDrawable(R.drawable.zoom_slide);
        this.d = context.getResources().getDrawable(R.drawable.zoom_slide_a);
        this.e = context.getResources().getDrawable(R.drawable.zoom_round);
        this.f23348f = context.getResources().getDrawable(R.drawable.zoom_round_b);
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
        this.K.addListener(new u81(this, 1));
        this.K.start();
        return true;
    }

    public final void b(float f7, boolean z10) {
        c91 c91Var;
        if (f7 == this.E) {
            return;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        this.E = f7;
        if (z10 && (c91Var = this.L) != null) {
            c91Var.a(f7);
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
            this.f23349n = measuredHeight;
            this.f23350r = getMeasuredWidth() - AndroidUtilities.dp(41.0f);
            this.f23351s = measuredHeight;
            this.v = AndroidUtilities.dp(18.0f) + this.h;
            this.f23352w = measuredHeight;
            this.f23353x = this.f23350r - AndroidUtilities.dp(18.0f);
            this.f23354y = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f23349n = AndroidUtilities.dp(41.0f);
            this.f23350r = measuredWidth;
            this.f23351s = getMeasuredHeight() - AndroidUtilities.dp(41.0f);
            this.v = measuredWidth;
            this.f23352w = AndroidUtilities.dp(18.0f) + this.f23349n;
            this.f23353x = measuredWidth;
            this.f23354y = this.f23351s - AndroidUtilities.dp(18.0f);
        }
        int dp = this.h - AndroidUtilities.dp(7.0f);
        int dp2 = this.f23349n - AndroidUtilities.dp(7.0f);
        int dp3 = AndroidUtilities.dp(7.0f) + this.h;
        int dp4 = AndroidUtilities.dp(7.0f) + this.f23349n;
        Drawable drawable2 = this.f23345a;
        drawable2.setBounds(dp, dp2, dp3, dp4);
        drawable2.draw(canvas);
        int dp5 = this.f23350r - AndroidUtilities.dp(7.0f);
        int dp6 = this.f23351s - AndroidUtilities.dp(7.0f);
        int dp7 = AndroidUtilities.dp(7.0f) + this.f23350r;
        int dp8 = AndroidUtilities.dp(7.0f) + this.f23351s;
        Drawable drawable3 = this.f23346b;
        drawable3.setBounds(dp5, dp6, dp7, dp8);
        drawable3.draw(canvas);
        int i10 = this.f23353x;
        int i11 = this.v;
        int i12 = this.f23354y;
        int i13 = this.f23352w;
        float f7 = this.E;
        int i14 = (int) (((i10 - i11) * f7) + i11);
        int i15 = (int) (((i12 - i13) * f7) + i13);
        Drawable drawable4 = this.d;
        Drawable drawable5 = this.f23347c;
        if (z10) {
            drawable5.setBounds(i11, i13 - AndroidUtilities.dp(3.0f), this.f23353x, AndroidUtilities.dp(3.0f) + this.f23352w);
            drawable4.setBounds(this.v, this.f23352w - AndroidUtilities.dp(3.0f), i14, AndroidUtilities.dp(3.0f) + this.f23352w);
        } else {
            drawable5.setBounds(i13, 0, i12, AndroidUtilities.dp(6.0f));
            drawable4.setBounds(this.f23352w, 0, i15, AndroidUtilities.dp(6.0f));
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
            drawable = this.f23348f;
        } else {
            drawable = this.e;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i14 - intrinsicWidth, i15 - intrinsicWidth, i14 + intrinsicWidth, i15 + intrinsicWidth);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d91.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(c91 c91Var) {
        this.L = c91Var;
    }
}
