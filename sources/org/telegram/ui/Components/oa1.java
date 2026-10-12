package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class oa1 extends View {
    public float E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public AnimatorSet K;
    public na1 L;
    public boolean M;
    public final org.telegram.ui.Cells.d2 N;
    public final Drawable f29129a;
    public final Drawable f29130b;
    public final Drawable f29131c;
    public final Drawable d;
    public final Drawable f29132e;
    public final Drawable f29133f;
    public int h;
    public int f29134n;
    public int f29135r;
    public int f29136s;
    public int v;
    public int f29137w;
    public int f29138x;
    public int f29139y;

    public oa1(Context context) {
        super(context);
        this.M = true;
        this.N = new org.telegram.ui.Cells.d2(this);
        this.f29129a = context.getResources().getDrawable(R.drawable.zoom_minus);
        this.f29130b = context.getResources().getDrawable(R.drawable.zoom_plus);
        this.f29131c = context.getResources().getDrawable(R.drawable.zoom_slide);
        this.d = context.getResources().getDrawable(R.drawable.zoom_slide_a);
        this.f29132e = context.getResources().getDrawable(R.drawable.zoom_round);
        this.f29133f = context.getResources().getDrawable(R.drawable.zoom_round_b);
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
        this.K.addListener(new o91(this, 2));
        this.K.start();
        return true;
    }

    public final void b(float r3, boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oa1.b(float, boolean):void");
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
            this.f29134n = measuredHeight;
            this.f29135r = getMeasuredWidth() - AndroidUtilities.dp(41.0f);
            this.f29136s = measuredHeight;
            this.v = AndroidUtilities.dp(18.0f) + this.h;
            this.f29137w = measuredHeight;
            this.f29138x = this.f29135r - AndroidUtilities.dp(18.0f);
            this.f29139y = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f29134n = AndroidUtilities.dp(41.0f);
            this.f29135r = measuredWidth;
            this.f29136s = getMeasuredHeight() - AndroidUtilities.dp(41.0f);
            this.v = measuredWidth;
            this.f29137w = AndroidUtilities.dp(18.0f) + this.f29134n;
            this.f29138x = measuredWidth;
            this.f29139y = this.f29136s - AndroidUtilities.dp(18.0f);
        }
        int dp = this.h - AndroidUtilities.dp(7.0f);
        int dp2 = this.f29134n - AndroidUtilities.dp(7.0f);
        int dp3 = AndroidUtilities.dp(7.0f) + this.h;
        int dp4 = AndroidUtilities.dp(7.0f) + this.f29134n;
        Drawable drawable2 = this.f29129a;
        drawable2.setBounds(dp, dp2, dp3, dp4);
        drawable2.draw(canvas);
        int dp5 = this.f29135r - AndroidUtilities.dp(7.0f);
        int dp6 = this.f29136s - AndroidUtilities.dp(7.0f);
        int dp7 = AndroidUtilities.dp(7.0f) + this.f29135r;
        int dp8 = AndroidUtilities.dp(7.0f) + this.f29136s;
        Drawable drawable3 = this.f29130b;
        drawable3.setBounds(dp5, dp6, dp7, dp8);
        drawable3.draw(canvas);
        int i10 = this.f29138x;
        int i11 = this.v;
        int i12 = this.f29139y;
        int i13 = this.f29137w;
        float f7 = this.E;
        int i14 = (int) (((i10 - i11) * f7) + i11);
        int i15 = (int) (((i12 - i13) * f7) + i13);
        Drawable drawable4 = this.d;
        Drawable drawable5 = this.f29131c;
        if (z10) {
            drawable5.setBounds(i11, i13 - AndroidUtilities.dp(3.0f), this.f29138x, AndroidUtilities.dp(3.0f) + this.f29137w);
            drawable4.setBounds(this.v, this.f29137w - AndroidUtilities.dp(3.0f), i14, AndroidUtilities.dp(3.0f) + this.f29137w);
        } else {
            drawable5.setBounds(i13, 0, i12, AndroidUtilities.dp(6.0f));
            drawable4.setBounds(this.f29137w, 0, i15, AndroidUtilities.dp(6.0f));
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
            drawable = this.f29133f;
        } else {
            drawable = this.f29132e;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i14 - intrinsicWidth, i15 - intrinsicWidth, i14 + intrinsicWidth, i15 + intrinsicWidth);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oa1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(na1 na1Var) {
        this.L = na1Var;
    }
}
