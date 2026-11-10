package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class r71 extends View {
    public int D;
    public float E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public AnimatorSet K;
    public q71 L;
    public boolean M;
    public final org.telegram.ui.Cells.f2 N;
    public final Drawable f37545a;
    public final Drawable f37546b;
    public final Drawable f37547c;
    public final Drawable d;
    public final Drawable f37548e;
    public final Drawable f37549f;
    public int h;
    public int f37550n;
    public int f37551r;
    public int f37552s;
    public int f37553w;
    public int f37554x;
    public int f37555y;

    public r71(Context context) {
        super(context);
        this.M = true;
        this.N = new org.telegram.ui.Cells.f2(this);
        this.f37545a = context.getResources().getDrawable(2131232862);
        this.f37546b = context.getResources().getDrawable(2131232863);
        this.f37547c = context.getResources().getDrawable(2131232866);
        this.d = context.getResources().getDrawable(2131232867);
        this.f37548e = context.getResources().getDrawable(2131232864);
        this.f37549f = context.getResources().getDrawable(2131232865);
    }

    public final boolean a(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            return false;
        }
        AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.J = f10;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.K = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.N, f10));
        this.K.setDuration(180L);
        this.K.addListener(new f11(this, 8));
        this.K.start();
        return true;
    }

    public final void b(boolean r3, float r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r71.b(boolean, float):void");
    }

    public float getZoom() {
        if (this.K != null) {
            return this.J;
        }
        return this.E;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z9;
        Drawable drawable;
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        if (getMeasuredWidth() > getMeasuredHeight()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            this.h = org.telegram.messenger.g0.L(41.0f);
            this.f37550n = measuredHeight;
            this.f37551r = getMeasuredWidth() - org.telegram.messenger.g0.L(41.0f);
            this.f37552s = measuredHeight;
            this.f37553w = org.telegram.messenger.g0.L(18.0f) + this.h;
            this.f37554x = measuredHeight;
            this.f37555y = this.f37551r - org.telegram.messenger.g0.L(18.0f);
            this.D = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f37550n = org.telegram.messenger.g0.L(41.0f);
            this.f37551r = measuredWidth;
            this.f37552s = getMeasuredHeight() - org.telegram.messenger.g0.L(41.0f);
            this.f37553w = measuredWidth;
            this.f37554x = org.telegram.messenger.g0.L(18.0f) + this.f37550n;
            this.f37555y = measuredWidth;
            this.D = this.f37552s - org.telegram.messenger.g0.L(18.0f);
        }
        int L = this.h - org.telegram.messenger.g0.L(7.0f);
        int L2 = this.f37550n - org.telegram.messenger.g0.L(7.0f);
        int L3 = org.telegram.messenger.g0.L(7.0f) + this.h;
        int L4 = org.telegram.messenger.g0.L(7.0f) + this.f37550n;
        Drawable drawable2 = this.f37545a;
        drawable2.setBounds(L, L2, L3, L4);
        drawable2.draw(canvas);
        int L5 = this.f37551r - org.telegram.messenger.g0.L(7.0f);
        int L6 = this.f37552s - org.telegram.messenger.g0.L(7.0f);
        int L7 = org.telegram.messenger.g0.L(7.0f) + this.f37551r;
        int L8 = org.telegram.messenger.g0.L(7.0f) + this.f37552s;
        Drawable drawable3 = this.f37546b;
        drawable3.setBounds(L5, L6, L7, L8);
        drawable3.draw(canvas);
        int i7 = this.f37555y;
        int i10 = this.f37553w;
        int i11 = this.D;
        int i12 = this.f37554x;
        float f10 = this.E;
        int i13 = (int) (((i7 - i10) * f10) + i10);
        int i14 = (int) (((i11 - i12) * f10) + i12);
        Drawable drawable4 = this.d;
        Drawable drawable5 = this.f37547c;
        if (z9) {
            drawable5.setBounds(i10, i12 - org.telegram.messenger.g0.L(3.0f), this.f37555y, org.telegram.messenger.g0.L(3.0f) + this.f37554x);
            drawable4.setBounds(this.f37553w, this.f37554x - org.telegram.messenger.g0.L(3.0f), i13, org.telegram.messenger.g0.L(3.0f) + this.f37554x);
        } else {
            drawable5.setBounds(i12, 0, i11, org.telegram.messenger.g0.L(6.0f));
            drawable4.setBounds(this.f37554x, 0, i14, org.telegram.messenger.g0.L(6.0f));
            canvas.save();
            canvas.rotate(90.0f);
            canvas.translate(0.0f, (-this.f37553w) - org.telegram.messenger.g0.L(3.0f));
        }
        drawable5.draw(canvas);
        drawable4.draw(canvas);
        if (!z9) {
            canvas.restore();
        }
        if (this.G) {
            drawable = this.f37549f;
        } else {
            drawable = this.f37548e;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i13 - intrinsicWidth, i14 - intrinsicWidth, i13 + intrinsicWidth, i14 + intrinsicWidth);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r71.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(q71 q71Var) {
        this.L = q71Var;
    }
}
