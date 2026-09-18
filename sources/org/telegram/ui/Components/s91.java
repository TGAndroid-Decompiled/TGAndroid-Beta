package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class s91 extends View {
    public float E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public AnimatorSet K;
    public r91 L;
    public boolean M;
    public final org.telegram.ui.Cells.d2 N;
    public final Drawable f28096a;
    public final Drawable f28097b;
    public final Drawable f28098c;
    public final Drawable d;
    public final Drawable e;
    public final Drawable f28099f;
    public int h;
    public int f28100n;
    public int f28101r;
    public int f28102s;
    public int v;
    public int f28103w;
    public int f28104x;
    public int f28105y;

    public s91(Context context) {
        super(context);
        this.M = true;
        this.N = new org.telegram.ui.Cells.d2(this);
        this.f28096a = context.getResources().getDrawable(R.drawable.zoom_minus);
        this.f28097b = context.getResources().getDrawable(R.drawable.zoom_plus);
        this.f28098c = context.getResources().getDrawable(R.drawable.zoom_slide);
        this.d = context.getResources().getDrawable(R.drawable.zoom_slide_a);
        this.e = context.getResources().getDrawable(R.drawable.zoom_round);
        this.f28099f = context.getResources().getDrawable(R.drawable.zoom_round_b);
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
        this.K.addListener(new r81(this, 2));
        this.K.start();
        return true;
    }

    public final void b(float f7, boolean z10) {
        r91 r91Var;
        if (f7 == this.E) {
            return;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        this.E = f7;
        if (z10 && (r91Var = this.L) != null) {
            r91Var.a(f7);
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
            this.f28100n = measuredHeight;
            this.f28101r = getMeasuredWidth() - AndroidUtilities.dp(41.0f);
            this.f28102s = measuredHeight;
            this.v = AndroidUtilities.dp(18.0f) + this.h;
            this.f28103w = measuredHeight;
            this.f28104x = this.f28101r - AndroidUtilities.dp(18.0f);
            this.f28105y = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f28100n = AndroidUtilities.dp(41.0f);
            this.f28101r = measuredWidth;
            this.f28102s = getMeasuredHeight() - AndroidUtilities.dp(41.0f);
            this.v = measuredWidth;
            this.f28103w = AndroidUtilities.dp(18.0f) + this.f28100n;
            this.f28104x = measuredWidth;
            this.f28105y = this.f28102s - AndroidUtilities.dp(18.0f);
        }
        int dp = this.h - AndroidUtilities.dp(7.0f);
        int dp2 = this.f28100n - AndroidUtilities.dp(7.0f);
        int dp3 = AndroidUtilities.dp(7.0f) + this.h;
        int dp4 = AndroidUtilities.dp(7.0f) + this.f28100n;
        Drawable drawable2 = this.f28096a;
        drawable2.setBounds(dp, dp2, dp3, dp4);
        drawable2.draw(canvas);
        int dp5 = this.f28101r - AndroidUtilities.dp(7.0f);
        int dp6 = this.f28102s - AndroidUtilities.dp(7.0f);
        int dp7 = AndroidUtilities.dp(7.0f) + this.f28101r;
        int dp8 = AndroidUtilities.dp(7.0f) + this.f28102s;
        Drawable drawable3 = this.f28097b;
        drawable3.setBounds(dp5, dp6, dp7, dp8);
        drawable3.draw(canvas);
        int i10 = this.f28104x;
        int i11 = this.v;
        int i12 = this.f28105y;
        int i13 = this.f28103w;
        float f7 = this.E;
        int i14 = (int) (((i10 - i11) * f7) + i11);
        int i15 = (int) (((i12 - i13) * f7) + i13);
        Drawable drawable4 = this.d;
        Drawable drawable5 = this.f28098c;
        if (z10) {
            drawable5.setBounds(i11, i13 - AndroidUtilities.dp(3.0f), this.f28104x, AndroidUtilities.dp(3.0f) + this.f28103w);
            drawable4.setBounds(this.v, this.f28103w - AndroidUtilities.dp(3.0f), i14, AndroidUtilities.dp(3.0f) + this.f28103w);
        } else {
            drawable5.setBounds(i13, 0, i12, AndroidUtilities.dp(6.0f));
            drawable4.setBounds(this.f28103w, 0, i15, AndroidUtilities.dp(6.0f));
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
            drawable = this.f28099f;
        } else {
            drawable = this.e;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i14 - intrinsicWidth, i15 - intrinsicWidth, i14 + intrinsicWidth, i15 + intrinsicWidth);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s91.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(r91 r91Var) {
        this.L = r91Var;
    }
}
