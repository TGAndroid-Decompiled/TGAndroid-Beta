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
    public final Drawable f25341a;
    public final Drawable f25342b;
    public final Drawable f25343c;
    public final Drawable d;
    public final Drawable f25344e;
    public final Drawable f25345f;
    public int h;
    public int f25346n;
    public int f25347r;
    public int f25348s;
    public int v;
    public int f25349w;
    public int f25350x;
    public int f25351y;

    public d91(Context context) {
        super(context);
        this.M = true;
        this.N = new org.telegram.ui.Cells.c2(this);
        this.f25341a = context.getResources().getDrawable(R.drawable.zoom_minus);
        this.f25342b = context.getResources().getDrawable(R.drawable.zoom_plus);
        this.f25343c = context.getResources().getDrawable(R.drawable.zoom_slide);
        this.d = context.getResources().getDrawable(R.drawable.zoom_slide_a);
        this.f25344e = context.getResources().getDrawable(R.drawable.zoom_round);
        this.f25345f = context.getResources().getDrawable(R.drawable.zoom_round_b);
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
        this.K.addListener(new k61(this, 4));
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
            c91Var.b(f7);
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
            this.f25346n = measuredHeight;
            this.f25347r = getMeasuredWidth() - AndroidUtilities.dp(41.0f);
            this.f25348s = measuredHeight;
            this.v = AndroidUtilities.dp(18.0f) + this.h;
            this.f25349w = measuredHeight;
            this.f25350x = this.f25347r - AndroidUtilities.dp(18.0f);
            this.f25351y = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f25346n = AndroidUtilities.dp(41.0f);
            this.f25347r = measuredWidth;
            this.f25348s = getMeasuredHeight() - AndroidUtilities.dp(41.0f);
            this.v = measuredWidth;
            this.f25349w = AndroidUtilities.dp(18.0f) + this.f25346n;
            this.f25350x = measuredWidth;
            this.f25351y = this.f25348s - AndroidUtilities.dp(18.0f);
        }
        int dp = this.h - AndroidUtilities.dp(7.0f);
        int dp2 = this.f25346n - AndroidUtilities.dp(7.0f);
        int dp3 = AndroidUtilities.dp(7.0f) + this.h;
        int dp4 = AndroidUtilities.dp(7.0f) + this.f25346n;
        Drawable drawable2 = this.f25341a;
        drawable2.setBounds(dp, dp2, dp3, dp4);
        drawable2.draw(canvas);
        int dp5 = this.f25347r - AndroidUtilities.dp(7.0f);
        int dp6 = this.f25348s - AndroidUtilities.dp(7.0f);
        int dp7 = AndroidUtilities.dp(7.0f) + this.f25347r;
        int dp8 = AndroidUtilities.dp(7.0f) + this.f25348s;
        Drawable drawable3 = this.f25342b;
        drawable3.setBounds(dp5, dp6, dp7, dp8);
        drawable3.draw(canvas);
        int i10 = this.f25350x;
        int i11 = this.v;
        int i12 = this.f25351y;
        int i13 = this.f25349w;
        float f7 = this.E;
        int i14 = (int) (((i10 - i11) * f7) + i11);
        int i15 = (int) (((i12 - i13) * f7) + i13);
        Drawable drawable4 = this.d;
        Drawable drawable5 = this.f25343c;
        if (z10) {
            drawable5.setBounds(i11, i13 - AndroidUtilities.dp(3.0f), this.f25350x, AndroidUtilities.dp(3.0f) + this.f25349w);
            drawable4.setBounds(this.v, this.f25349w - AndroidUtilities.dp(3.0f), i14, AndroidUtilities.dp(3.0f) + this.f25349w);
        } else {
            drawable5.setBounds(i13, 0, i12, AndroidUtilities.dp(6.0f));
            drawable4.setBounds(this.f25349w, 0, i15, AndroidUtilities.dp(6.0f));
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
            drawable = this.f25345f;
        } else {
            drawable = this.f25344e;
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
