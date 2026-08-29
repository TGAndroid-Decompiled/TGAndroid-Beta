package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class u81 extends View {
    public float A;
    public boolean B;
    public boolean C;
    public float D;
    public float E;
    public float F;
    public AnimatorSet G;
    public t81 H;
    public boolean I;
    public final org.telegram.ui.Cells.b2 J;
    public final Drawable f33160a;
    public final Drawable f33161b;
    public final Drawable f33162c;
    public final Drawable d;
    public final Drawable f33163e;
    public final Drawable f33164f;
    public int h;
    public int f33165n;
    public int f33166r;
    public int f33167s;
    public int v;
    public int f33168w;
    public int f33169x;
    public int f33170y;

    public u81(Context context) {
        super(context);
        this.I = true;
        this.J = new org.telegram.ui.Cells.b2(this);
        this.f33160a = context.getResources().getDrawable(R.drawable.zoom_minus);
        this.f33161b = context.getResources().getDrawable(R.drawable.zoom_plus);
        this.f33162c = context.getResources().getDrawable(R.drawable.zoom_slide);
        this.d = context.getResources().getDrawable(R.drawable.zoom_slide_a);
        this.f33163e = context.getResources().getDrawable(R.drawable.zoom_round);
        this.f33164f = context.getResources().getDrawable(R.drawable.zoom_round_b);
    }

    public final boolean a(float f9) {
        if (f9 < 0.0f || f9 > 1.0f) {
            return false;
        }
        AnimatorSet animatorSet = this.G;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.F = f9;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.G = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.J, f9));
        this.G.setDuration(180L);
        this.G.addListener(new p11(this, 9));
        this.G.start();
        return true;
    }

    public final void b(float f9, boolean z10) {
        t81 t81Var;
        if (f9 == this.A) {
            return;
        }
        if (f9 < 0.0f) {
            f9 = 0.0f;
        } else if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        this.A = f9;
        if (z10 && (t81Var = this.H) != null) {
            t81Var.a(f9);
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
            this.f33165n = measuredHeight;
            this.f33166r = getMeasuredWidth() - AndroidUtilities.dp(41.0f);
            this.f33167s = measuredHeight;
            this.v = AndroidUtilities.dp(18.0f) + this.h;
            this.f33168w = measuredHeight;
            this.f33169x = this.f33166r - AndroidUtilities.dp(18.0f);
            this.f33170y = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f33165n = AndroidUtilities.dp(41.0f);
            this.f33166r = measuredWidth;
            this.f33167s = getMeasuredHeight() - AndroidUtilities.dp(41.0f);
            this.v = measuredWidth;
            this.f33168w = AndroidUtilities.dp(18.0f) + this.f33165n;
            this.f33169x = measuredWidth;
            this.f33170y = this.f33167s - AndroidUtilities.dp(18.0f);
        }
        int dp = this.h - AndroidUtilities.dp(7.0f);
        int dp2 = this.f33165n - AndroidUtilities.dp(7.0f);
        int dp3 = AndroidUtilities.dp(7.0f) + this.h;
        int dp4 = AndroidUtilities.dp(7.0f) + this.f33165n;
        Drawable drawable2 = this.f33160a;
        drawable2.setBounds(dp, dp2, dp3, dp4);
        drawable2.draw(canvas);
        int dp5 = this.f33166r - AndroidUtilities.dp(7.0f);
        int dp6 = this.f33167s - AndroidUtilities.dp(7.0f);
        int dp7 = AndroidUtilities.dp(7.0f) + this.f33166r;
        int dp8 = AndroidUtilities.dp(7.0f) + this.f33167s;
        Drawable drawable3 = this.f33161b;
        drawable3.setBounds(dp5, dp6, dp7, dp8);
        drawable3.draw(canvas);
        int i10 = this.f33169x;
        int i11 = this.v;
        int i12 = this.f33170y;
        int i13 = this.f33168w;
        float f9 = this.A;
        int i14 = (int) (((i10 - i11) * f9) + i11);
        int i15 = (int) (((i12 - i13) * f9) + i13);
        Drawable drawable4 = this.d;
        Drawable drawable5 = this.f33162c;
        if (z10) {
            drawable5.setBounds(i11, i13 - AndroidUtilities.dp(3.0f), this.f33169x, AndroidUtilities.dp(3.0f) + this.f33168w);
            drawable4.setBounds(this.v, this.f33168w - AndroidUtilities.dp(3.0f), i14, AndroidUtilities.dp(3.0f) + this.f33168w);
        } else {
            drawable5.setBounds(i13, 0, i12, AndroidUtilities.dp(6.0f));
            drawable4.setBounds(this.f33168w, 0, i15, AndroidUtilities.dp(6.0f));
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
            drawable = this.f33164f;
        } else {
            drawable = this.f33163e;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i14 - intrinsicWidth, i15 - intrinsicWidth, i14 + intrinsicWidth, i15 + intrinsicWidth);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u81.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(t81 t81Var) {
        this.H = t81Var;
    }
}
