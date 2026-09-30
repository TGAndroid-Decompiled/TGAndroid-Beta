package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class t91 extends View {
    public float E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public AnimatorSet K;
    public s91 L;
    public boolean M;
    public final org.telegram.ui.Cells.d2 N;
    public final Drawable f28454a;
    public final Drawable f28455b;
    public final Drawable f28456c;
    public final Drawable d;
    public final Drawable e;
    public final Drawable f28457f;
    public int h;
    public int f28458n;
    public int f28459r;
    public int f28460s;
    public int v;
    public int f28461w;
    public int f28462x;
    public int f28463y;

    public t91(Context context) {
        super(context);
        this.M = true;
        this.N = new org.telegram.ui.Cells.d2(this);
        this.f28454a = context.getResources().getDrawable(R.drawable.zoom_minus);
        this.f28455b = context.getResources().getDrawable(R.drawable.zoom_plus);
        this.f28456c = context.getResources().getDrawable(R.drawable.zoom_slide);
        this.d = context.getResources().getDrawable(R.drawable.zoom_slide_a);
        this.e = context.getResources().getDrawable(R.drawable.zoom_round);
        this.f28457f = context.getResources().getDrawable(R.drawable.zoom_round_b);
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
        this.K.addListener(new s81(this, 2));
        this.K.start();
        return true;
    }

    public final void b(float f7, boolean z10) {
        s91 s91Var;
        if (f7 == this.E) {
            return;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        this.E = f7;
        if (z10 && (s91Var = this.L) != null) {
            s91Var.a(f7);
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
            this.f28458n = measuredHeight;
            this.f28459r = getMeasuredWidth() - AndroidUtilities.dp(41.0f);
            this.f28460s = measuredHeight;
            this.v = AndroidUtilities.dp(18.0f) + this.h;
            this.f28461w = measuredHeight;
            this.f28462x = this.f28459r - AndroidUtilities.dp(18.0f);
            this.f28463y = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f28458n = AndroidUtilities.dp(41.0f);
            this.f28459r = measuredWidth;
            this.f28460s = getMeasuredHeight() - AndroidUtilities.dp(41.0f);
            this.v = measuredWidth;
            this.f28461w = AndroidUtilities.dp(18.0f) + this.f28458n;
            this.f28462x = measuredWidth;
            this.f28463y = this.f28460s - AndroidUtilities.dp(18.0f);
        }
        int dp = this.h - AndroidUtilities.dp(7.0f);
        int dp2 = this.f28458n - AndroidUtilities.dp(7.0f);
        int dp3 = AndroidUtilities.dp(7.0f) + this.h;
        int dp4 = AndroidUtilities.dp(7.0f) + this.f28458n;
        Drawable drawable2 = this.f28454a;
        drawable2.setBounds(dp, dp2, dp3, dp4);
        drawable2.draw(canvas);
        int dp5 = this.f28459r - AndroidUtilities.dp(7.0f);
        int dp6 = this.f28460s - AndroidUtilities.dp(7.0f);
        int dp7 = AndroidUtilities.dp(7.0f) + this.f28459r;
        int dp8 = AndroidUtilities.dp(7.0f) + this.f28460s;
        Drawable drawable3 = this.f28455b;
        drawable3.setBounds(dp5, dp6, dp7, dp8);
        drawable3.draw(canvas);
        int i10 = this.f28462x;
        int i11 = this.v;
        int i12 = this.f28463y;
        int i13 = this.f28461w;
        float f7 = this.E;
        int i14 = (int) (((i10 - i11) * f7) + i11);
        int i15 = (int) (((i12 - i13) * f7) + i13);
        Drawable drawable4 = this.d;
        Drawable drawable5 = this.f28456c;
        if (z10) {
            drawable5.setBounds(i11, i13 - AndroidUtilities.dp(3.0f), this.f28462x, AndroidUtilities.dp(3.0f) + this.f28461w);
            drawable4.setBounds(this.v, this.f28461w - AndroidUtilities.dp(3.0f), i14, AndroidUtilities.dp(3.0f) + this.f28461w);
        } else {
            drawable5.setBounds(i13, 0, i12, AndroidUtilities.dp(6.0f));
            drawable4.setBounds(this.f28461w, 0, i15, AndroidUtilities.dp(6.0f));
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
            drawable = this.f28457f;
        } else {
            drawable = this.e;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i14 - intrinsicWidth, i15 - intrinsicWidth, i14 + intrinsicWidth, i15 + intrinsicWidth);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t91.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(s91 s91Var) {
        this.L = s91Var;
    }
}
