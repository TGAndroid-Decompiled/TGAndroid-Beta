package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class q91 extends View {
    public float E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public AnimatorSet K;
    public p91 L;
    public boolean M;
    public final org.telegram.ui.Cells.c2 N;
    public final Drawable f26367a;
    public final Drawable f26368b;
    public final Drawable f26369c;
    public final Drawable d;
    public final Drawable e;
    public final Drawable f26370f;
    public int h;
    public int f26371n;
    public int f26372r;
    public int f26373s;
    public int v;
    public int f26374w;
    public int f26375x;
    public int f26376y;

    public q91(Context context) {
        super(context);
        this.M = true;
        this.N = new org.telegram.ui.Cells.c2(this);
        this.f26367a = context.getResources().getDrawable(R.drawable.zoom_minus);
        this.f26368b = context.getResources().getDrawable(R.drawable.zoom_plus);
        this.f26369c = context.getResources().getDrawable(R.drawable.zoom_slide);
        this.d = context.getResources().getDrawable(R.drawable.zoom_slide_a);
        this.e = context.getResources().getDrawable(R.drawable.zoom_round);
        this.f26370f = context.getResources().getDrawable(R.drawable.zoom_round_b);
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
        this.K.addListener(new zn0(this, 21));
        this.K.start();
        return true;
    }

    public final void b(float f7, boolean z10) {
        p91 p91Var;
        if (f7 == this.E) {
            return;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        this.E = f7;
        if (z10 && (p91Var = this.L) != null) {
            p91Var.a(f7);
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
            this.f26371n = measuredHeight;
            this.f26372r = getMeasuredWidth() - AndroidUtilities.dp(41.0f);
            this.f26373s = measuredHeight;
            this.v = AndroidUtilities.dp(18.0f) + this.h;
            this.f26374w = measuredHeight;
            this.f26375x = this.f26372r - AndroidUtilities.dp(18.0f);
            this.f26376y = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f26371n = AndroidUtilities.dp(41.0f);
            this.f26372r = measuredWidth;
            this.f26373s = getMeasuredHeight() - AndroidUtilities.dp(41.0f);
            this.v = measuredWidth;
            this.f26374w = AndroidUtilities.dp(18.0f) + this.f26371n;
            this.f26375x = measuredWidth;
            this.f26376y = this.f26373s - AndroidUtilities.dp(18.0f);
        }
        int dp = this.h - AndroidUtilities.dp(7.0f);
        int dp2 = this.f26371n - AndroidUtilities.dp(7.0f);
        int dp3 = AndroidUtilities.dp(7.0f) + this.h;
        int dp4 = AndroidUtilities.dp(7.0f) + this.f26371n;
        Drawable drawable2 = this.f26367a;
        drawable2.setBounds(dp, dp2, dp3, dp4);
        drawable2.draw(canvas);
        int dp5 = this.f26372r - AndroidUtilities.dp(7.0f);
        int dp6 = this.f26373s - AndroidUtilities.dp(7.0f);
        int dp7 = AndroidUtilities.dp(7.0f) + this.f26372r;
        int dp8 = AndroidUtilities.dp(7.0f) + this.f26373s;
        Drawable drawable3 = this.f26368b;
        drawable3.setBounds(dp5, dp6, dp7, dp8);
        drawable3.draw(canvas);
        int i10 = this.f26375x;
        int i11 = this.v;
        int i12 = this.f26376y;
        int i13 = this.f26374w;
        float f7 = this.E;
        int i14 = (int) (((i10 - i11) * f7) + i11);
        int i15 = (int) (((i12 - i13) * f7) + i13);
        Drawable drawable4 = this.d;
        Drawable drawable5 = this.f26369c;
        if (z10) {
            drawable5.setBounds(i11, i13 - AndroidUtilities.dp(3.0f), this.f26375x, AndroidUtilities.dp(3.0f) + this.f26374w);
            drawable4.setBounds(this.v, this.f26374w - AndroidUtilities.dp(3.0f), i14, AndroidUtilities.dp(3.0f) + this.f26374w);
        } else {
            drawable5.setBounds(i13, 0, i12, AndroidUtilities.dp(6.0f));
            drawable4.setBounds(this.f26374w, 0, i15, AndroidUtilities.dp(6.0f));
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
            drawable = this.f26370f;
        } else {
            drawable = this.e;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i14 - intrinsicWidth, i15 - intrinsicWidth, i14 + intrinsicWidth, i15 + intrinsicWidth);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q91.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(p91 p91Var) {
        this.L = p91Var;
    }
}
