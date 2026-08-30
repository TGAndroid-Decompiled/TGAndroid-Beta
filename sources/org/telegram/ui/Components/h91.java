package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class h91 extends View {
    public float B;
    public boolean C;
    public boolean D;
    public float E;
    public float F;
    public float G;
    public AnimatorSet H;
    public g91 I;
    public boolean J;
    public final org.telegram.ui.Cells.c2 K;
    public final Drawable f25357a;
    public final Drawable f25358b;
    public final Drawable f25359c;
    public final Drawable d;
    public final Drawable e;
    public final Drawable f25360f;
    public int h;
    public int f25361n;
    public int f25362r;
    public int f25363s;
    public int v;
    public int f25364w;
    public int f25365x;
    public int f25366y;

    public h91(Context context) {
        super(context);
        this.J = true;
        this.K = new org.telegram.ui.Cells.c2(this);
        this.f25357a = context.getResources().getDrawable(R.drawable.zoom_minus);
        this.f25358b = context.getResources().getDrawable(R.drawable.zoom_plus);
        this.f25359c = context.getResources().getDrawable(R.drawable.zoom_slide);
        this.d = context.getResources().getDrawable(R.drawable.zoom_slide_a);
        this.e = context.getResources().getDrawable(R.drawable.zoom_round);
        this.f25360f = context.getResources().getDrawable(R.drawable.zoom_round_b);
    }

    public final boolean a(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            return false;
        }
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.G = f10;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.H = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.K, f10));
        this.H.setDuration(180L);
        this.H.addListener(new f91(this, 0));
        this.H.start();
        return true;
    }

    public final void b(float f10, boolean z4) {
        g91 g91Var;
        if (f10 == this.B) {
            return;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        this.B = f10;
        if (z4 && (g91Var = this.I) != null) {
            g91Var.a(f10);
        }
        invalidate();
    }

    public float getZoom() {
        if (this.H != null) {
            return this.G;
        }
        return this.B;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z4;
        Drawable drawable;
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        if (getMeasuredWidth() > getMeasuredHeight()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.h = AndroidUtilities.dp(41.0f);
            this.f25361n = measuredHeight;
            this.f25362r = getMeasuredWidth() - AndroidUtilities.dp(41.0f);
            this.f25363s = measuredHeight;
            this.v = AndroidUtilities.dp(18.0f) + this.h;
            this.f25364w = measuredHeight;
            this.f25365x = this.f25362r - AndroidUtilities.dp(18.0f);
            this.f25366y = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f25361n = AndroidUtilities.dp(41.0f);
            this.f25362r = measuredWidth;
            this.f25363s = getMeasuredHeight() - AndroidUtilities.dp(41.0f);
            this.v = measuredWidth;
            this.f25364w = AndroidUtilities.dp(18.0f) + this.f25361n;
            this.f25365x = measuredWidth;
            this.f25366y = this.f25363s - AndroidUtilities.dp(18.0f);
        }
        int dp = this.h - AndroidUtilities.dp(7.0f);
        int dp2 = this.f25361n - AndroidUtilities.dp(7.0f);
        int dp3 = AndroidUtilities.dp(7.0f) + this.h;
        int dp4 = AndroidUtilities.dp(7.0f) + this.f25361n;
        Drawable drawable2 = this.f25357a;
        drawable2.setBounds(dp, dp2, dp3, dp4);
        drawable2.draw(canvas);
        int dp5 = this.f25362r - AndroidUtilities.dp(7.0f);
        int dp6 = this.f25363s - AndroidUtilities.dp(7.0f);
        int dp7 = AndroidUtilities.dp(7.0f) + this.f25362r;
        int dp8 = AndroidUtilities.dp(7.0f) + this.f25363s;
        Drawable drawable3 = this.f25358b;
        drawable3.setBounds(dp5, dp6, dp7, dp8);
        drawable3.draw(canvas);
        int i10 = this.f25365x;
        int i11 = this.v;
        int i12 = this.f25366y;
        int i13 = this.f25364w;
        float f10 = this.B;
        int i14 = (int) (((i10 - i11) * f10) + i11);
        int i15 = (int) (((i12 - i13) * f10) + i13);
        Drawable drawable4 = this.d;
        Drawable drawable5 = this.f25359c;
        if (z4) {
            drawable5.setBounds(i11, i13 - AndroidUtilities.dp(3.0f), this.f25365x, AndroidUtilities.dp(3.0f) + this.f25364w);
            drawable4.setBounds(this.v, this.f25364w - AndroidUtilities.dp(3.0f), i14, AndroidUtilities.dp(3.0f) + this.f25364w);
        } else {
            drawable5.setBounds(i13, 0, i12, AndroidUtilities.dp(6.0f));
            drawable4.setBounds(this.f25364w, 0, i15, AndroidUtilities.dp(6.0f));
            canvas.save();
            canvas.rotate(90.0f);
            canvas.translate(0.0f, (-this.v) - AndroidUtilities.dp(3.0f));
        }
        drawable5.draw(canvas);
        drawable4.draw(canvas);
        if (!z4) {
            canvas.restore();
        }
        if (this.D) {
            drawable = this.f25360f;
        } else {
            drawable = this.e;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i14 - intrinsicWidth, i15 - intrinsicWidth, i14 + intrinsicWidth, i15 + intrinsicWidth);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h91.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(g91 g91Var) {
        this.I = g91Var;
    }
}
