package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class l71 extends View {
    public int D;
    public float E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public AnimatorSet K;
    public k71 L;
    public boolean M;
    public final org.telegram.ui.Cells.f2 N;
    public final Drawable f35538a;
    public final Drawable f35539b;
    public final Drawable f35540c;
    public final Drawable d;
    public final Drawable f35541e;
    public final Drawable f35542f;
    public int h;
    public int f35543n;
    public int f35544r;
    public int f35545s;
    public int f35546w;
    public int f35547x;
    public int f35548y;

    public l71(Context context) {
        super(context);
        this.M = true;
        this.N = new org.telegram.ui.Cells.f2(this);
        this.f35538a = context.getResources().getDrawable(2131232862);
        this.f35539b = context.getResources().getDrawable(2131232863);
        this.f35540c = context.getResources().getDrawable(2131232866);
        this.d = context.getResources().getDrawable(2131232867);
        this.f35541e = context.getResources().getDrawable(2131232864);
        this.f35542f = context.getResources().getDrawable(2131232865);
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
        this.K.addListener(new j01(this, 9));
        this.K.start();
        return true;
    }

    public final void b(boolean r3, float r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l71.b(boolean, float):void");
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
            this.f35543n = measuredHeight;
            this.f35544r = getMeasuredWidth() - org.telegram.messenger.g0.L(41.0f);
            this.f35545s = measuredHeight;
            this.f35546w = org.telegram.messenger.g0.L(18.0f) + this.h;
            this.f35547x = measuredHeight;
            this.f35548y = this.f35544r - org.telegram.messenger.g0.L(18.0f);
            this.D = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f35543n = org.telegram.messenger.g0.L(41.0f);
            this.f35544r = measuredWidth;
            this.f35545s = getMeasuredHeight() - org.telegram.messenger.g0.L(41.0f);
            this.f35546w = measuredWidth;
            this.f35547x = org.telegram.messenger.g0.L(18.0f) + this.f35543n;
            this.f35548y = measuredWidth;
            this.D = this.f35545s - org.telegram.messenger.g0.L(18.0f);
        }
        int L = this.h - org.telegram.messenger.g0.L(7.0f);
        int L2 = this.f35543n - org.telegram.messenger.g0.L(7.0f);
        int L3 = org.telegram.messenger.g0.L(7.0f) + this.h;
        int L4 = org.telegram.messenger.g0.L(7.0f) + this.f35543n;
        Drawable drawable2 = this.f35538a;
        drawable2.setBounds(L, L2, L3, L4);
        drawable2.draw(canvas);
        int L5 = this.f35544r - org.telegram.messenger.g0.L(7.0f);
        int L6 = this.f35545s - org.telegram.messenger.g0.L(7.0f);
        int L7 = org.telegram.messenger.g0.L(7.0f) + this.f35544r;
        int L8 = org.telegram.messenger.g0.L(7.0f) + this.f35545s;
        Drawable drawable3 = this.f35539b;
        drawable3.setBounds(L5, L6, L7, L8);
        drawable3.draw(canvas);
        int i7 = this.f35548y;
        int i10 = this.f35546w;
        int i11 = this.D;
        int i12 = this.f35547x;
        float f10 = this.E;
        int i13 = (int) (((i7 - i10) * f10) + i10);
        int i14 = (int) (((i11 - i12) * f10) + i12);
        Drawable drawable4 = this.d;
        Drawable drawable5 = this.f35540c;
        if (z9) {
            drawable5.setBounds(i10, i12 - org.telegram.messenger.g0.L(3.0f), this.f35548y, org.telegram.messenger.g0.L(3.0f) + this.f35547x);
            drawable4.setBounds(this.f35546w, this.f35547x - org.telegram.messenger.g0.L(3.0f), i13, org.telegram.messenger.g0.L(3.0f) + this.f35547x);
        } else {
            drawable5.setBounds(i12, 0, i11, org.telegram.messenger.g0.L(6.0f));
            drawable4.setBounds(this.f35547x, 0, i14, org.telegram.messenger.g0.L(6.0f));
            canvas.save();
            canvas.rotate(90.0f);
            canvas.translate(0.0f, (-this.f35546w) - org.telegram.messenger.g0.L(3.0f));
        }
        drawable5.draw(canvas);
        drawable4.draw(canvas);
        if (!z9) {
            canvas.restore();
        }
        if (this.G) {
            drawable = this.f35542f;
        } else {
            drawable = this.f35541e;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i13 - intrinsicWidth, i14 - intrinsicWidth, i13 + intrinsicWidth, i14 + intrinsicWidth);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l71.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(k71 k71Var) {
        this.L = k71Var;
    }
}
