package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class fc1 extends View {
    public float E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public AnimatorSet K;
    public ec1 L;
    public boolean M;
    public final org.telegram.ui.Cells.b2 N;
    public final Drawable f28156a;
    public final Drawable f28157b;
    public final Drawable f28158c;
    public final Drawable d;
    public final Drawable e;
    public final Drawable f28159f;
    public int h;
    public int f28160n;
    public int f28161r;
    public int f28162s;
    public int v;
    public int f28163w;
    public int f28164x;
    public int f28165y;

    public fc1(Context context) {
        super(context);
        this.M = true;
        this.N = new org.telegram.ui.Cells.b2(this);
        this.f28156a = context.getResources().getDrawable(R.drawable.zoom_minus);
        this.f28157b = context.getResources().getDrawable(R.drawable.zoom_plus);
        this.f28158c = context.getResources().getDrawable(R.drawable.zoom_slide);
        this.d = context.getResources().getDrawable(R.drawable.zoom_slide_a);
        this.e = context.getResources().getDrawable(R.drawable.zoom_round);
        this.f28159f = context.getResources().getDrawable(R.drawable.zoom_round_b);
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
        this.K.addListener(new h31(this, 9));
        this.K.start();
        return true;
    }

    public final void b(float r3, boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fc1.b(float, boolean):void");
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
            this.f28160n = measuredHeight;
            this.f28161r = getMeasuredWidth() - AndroidUtilities.dp(41.0f);
            this.f28162s = measuredHeight;
            this.v = AndroidUtilities.dp(18.0f) + this.h;
            this.f28163w = measuredHeight;
            this.f28164x = this.f28161r - AndroidUtilities.dp(18.0f);
            this.f28165y = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f28160n = AndroidUtilities.dp(41.0f);
            this.f28161r = measuredWidth;
            this.f28162s = getMeasuredHeight() - AndroidUtilities.dp(41.0f);
            this.v = measuredWidth;
            this.f28163w = AndroidUtilities.dp(18.0f) + this.f28160n;
            this.f28164x = measuredWidth;
            this.f28165y = this.f28162s - AndroidUtilities.dp(18.0f);
        }
        int dp = this.h - AndroidUtilities.dp(7.0f);
        int dp2 = this.f28160n - AndroidUtilities.dp(7.0f);
        int dp3 = AndroidUtilities.dp(7.0f) + this.h;
        int dp4 = AndroidUtilities.dp(7.0f) + this.f28160n;
        Drawable drawable2 = this.f28156a;
        drawable2.setBounds(dp, dp2, dp3, dp4);
        drawable2.draw(canvas);
        int dp5 = this.f28161r - AndroidUtilities.dp(7.0f);
        int dp6 = this.f28162s - AndroidUtilities.dp(7.0f);
        int dp7 = AndroidUtilities.dp(7.0f) + this.f28161r;
        int dp8 = AndroidUtilities.dp(7.0f) + this.f28162s;
        Drawable drawable3 = this.f28157b;
        drawable3.setBounds(dp5, dp6, dp7, dp8);
        drawable3.draw(canvas);
        int i10 = this.f28164x;
        int i11 = this.v;
        int i12 = this.f28165y;
        int i13 = this.f28163w;
        float f7 = this.E;
        int i14 = (int) (((i10 - i11) * f7) + i11);
        int i15 = (int) (((i12 - i13) * f7) + i13);
        Drawable drawable4 = this.d;
        Drawable drawable5 = this.f28158c;
        if (z10) {
            drawable5.setBounds(i11, i13 - AndroidUtilities.dp(3.0f), this.f28164x, AndroidUtilities.dp(3.0f) + this.f28163w);
            drawable4.setBounds(this.v, this.f28163w - AndroidUtilities.dp(3.0f), i14, AndroidUtilities.dp(3.0f) + this.f28163w);
        } else {
            drawable5.setBounds(i13, 0, i12, AndroidUtilities.dp(6.0f));
            drawable4.setBounds(this.f28163w, 0, i15, AndroidUtilities.dp(6.0f));
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
            drawable = this.f28159f;
        } else {
            drawable = this.e;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i14 - intrinsicWidth, i15 - intrinsicWidth, i14 + intrinsicWidth, i15 + intrinsicWidth);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fc1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(ec1 ec1Var) {
        this.L = ec1Var;
    }
}
