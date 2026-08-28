package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class i81 extends View {
    public float A;
    public boolean B;
    public boolean C;
    public float D;
    public float E;
    public float F;
    public AnimatorSet G;
    public h81 H;
    public boolean I;
    public final org.telegram.ui.Cells.c2 J;
    public final Drawable f29380a;
    public final Drawable f29381b;
    public final Drawable f29382c;
    public final Drawable d;
    public final Drawable f29383e;
    public final Drawable f29384f;
    public int h;
    public int f29385n;
    public int f29386r;
    public int f29387s;
    public int v;
    public int f29388w;
    public int f29389x;
    public int f29390y;

    public i81(Context context) {
        super(context);
        this.I = true;
        this.J = new org.telegram.ui.Cells.c2(this);
        this.f29380a = context.getResources().getDrawable(R.drawable.zoom_minus);
        this.f29381b = context.getResources().getDrawable(R.drawable.zoom_plus);
        this.f29382c = context.getResources().getDrawable(R.drawable.zoom_slide);
        this.d = context.getResources().getDrawable(R.drawable.zoom_slide_a);
        this.f29383e = context.getResources().getDrawable(R.drawable.zoom_round);
        this.f29384f = context.getResources().getDrawable(R.drawable.zoom_round_b);
    }

    public final boolean a(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            return false;
        }
        AnimatorSet animatorSet = this.G;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.F = f10;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.G = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.J, f10));
        this.G.setDuration(180L);
        this.G.addListener(new y11(this, 7));
        this.G.start();
        return true;
    }

    public final void b(float f10, boolean z10) {
        h81 h81Var;
        if (f10 == this.A) {
            return;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        this.A = f10;
        if (z10 && (h81Var = this.H) != null) {
            h81Var.b(f10);
        }
        invalidate();
    }

    public float getZoom() {
        if (this.G != null) {
            return this.F;
        }
        return this.A;
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
            this.f29385n = measuredHeight;
            this.f29386r = getMeasuredWidth() - AndroidUtilities.dp(41.0f);
            this.f29387s = measuredHeight;
            this.v = AndroidUtilities.dp(18.0f) + this.h;
            this.f29388w = measuredHeight;
            this.f29389x = this.f29386r - AndroidUtilities.dp(18.0f);
            this.f29390y = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f29385n = AndroidUtilities.dp(41.0f);
            this.f29386r = measuredWidth;
            this.f29387s = getMeasuredHeight() - AndroidUtilities.dp(41.0f);
            this.v = measuredWidth;
            this.f29388w = AndroidUtilities.dp(18.0f) + this.f29385n;
            this.f29389x = measuredWidth;
            this.f29390y = this.f29387s - AndroidUtilities.dp(18.0f);
        }
        int dp = this.h - AndroidUtilities.dp(7.0f);
        int dp2 = this.f29385n - AndroidUtilities.dp(7.0f);
        int dp3 = AndroidUtilities.dp(7.0f) + this.h;
        int dp4 = AndroidUtilities.dp(7.0f) + this.f29385n;
        Drawable drawable2 = this.f29380a;
        drawable2.setBounds(dp, dp2, dp3, dp4);
        drawable2.draw(canvas);
        int dp5 = this.f29386r - AndroidUtilities.dp(7.0f);
        int dp6 = this.f29387s - AndroidUtilities.dp(7.0f);
        int dp7 = AndroidUtilities.dp(7.0f) + this.f29386r;
        int dp8 = AndroidUtilities.dp(7.0f) + this.f29387s;
        Drawable drawable3 = this.f29381b;
        drawable3.setBounds(dp5, dp6, dp7, dp8);
        drawable3.draw(canvas);
        int i9 = this.f29389x;
        int i10 = this.v;
        int i11 = this.f29390y;
        int i12 = this.f29388w;
        float f10 = this.A;
        int i13 = (int) (((i9 - i10) * f10) + i10);
        int i14 = (int) (((i11 - i12) * f10) + i12);
        Drawable drawable4 = this.d;
        Drawable drawable5 = this.f29382c;
        if (z10) {
            drawable5.setBounds(i10, i12 - AndroidUtilities.dp(3.0f), this.f29389x, AndroidUtilities.dp(3.0f) + this.f29388w);
            drawable4.setBounds(this.v, this.f29388w - AndroidUtilities.dp(3.0f), i13, AndroidUtilities.dp(3.0f) + this.f29388w);
        } else {
            drawable5.setBounds(i12, 0, i11, AndroidUtilities.dp(6.0f));
            drawable4.setBounds(this.f29388w, 0, i14, AndroidUtilities.dp(6.0f));
            canvas.save();
            canvas.rotate(90.0f);
            canvas.translate(0.0f, (-this.v) - AndroidUtilities.dp(3.0f));
        }
        drawable5.draw(canvas);
        drawable4.draw(canvas);
        if (!z10) {
            canvas.restore();
        }
        if (this.C) {
            drawable = this.f29384f;
        } else {
            drawable = this.f29383e;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i13 - intrinsicWidth, i14 - intrinsicWidth, i13 + intrinsicWidth, i14 + intrinsicWidth);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i81.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(h81 h81Var) {
        this.H = h81Var;
    }
}
