package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class c81 extends View {
    public int E;
    public float F;
    public boolean G;
    public boolean H;
    public float I;
    public float J;
    public float K;
    public AnimatorSet L;
    public b81 M;
    public boolean N;
    public final org.telegram.ui.Cells.g2 O;
    public final Drawable f33914a;
    public final Drawable f33915b;
    public final Drawable f33916c;
    public final Drawable d;
    public final Drawable f33917e;
    public final Drawable f33918f;
    public int h;
    public int f33919n;
    public int f33920r;
    public int f33921s;
    public int f33922w;
    public int f33923x;
    public int f33924y;

    public c81(Context context) {
        super(context);
        this.N = true;
        this.O = new org.telegram.ui.Cells.g2(this);
        this.f33914a = context.getResources().getDrawable(2131232867);
        this.f33915b = context.getResources().getDrawable(2131232868);
        this.f33916c = context.getResources().getDrawable(2131232871);
        this.d = context.getResources().getDrawable(2131232872);
        this.f33917e = context.getResources().getDrawable(2131232869);
        this.f33918f = context.getResources().getDrawable(2131232870);
    }

    public final boolean a(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            return false;
        }
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.K = f10;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.L = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.O, f10));
        this.L.setDuration(180L);
        this.L.addListener(new s11(this, 8));
        this.L.start();
        return true;
    }

    public final void b(boolean r3, float r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c81.b(boolean, float):void");
    }

    public float getZoom() {
        if (this.L != null) {
            return this.K;
        }
        return this.F;
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
            this.h = org.telegram.messenger.g0.L(41.0f);
            this.f33919n = measuredHeight;
            this.f33920r = getMeasuredWidth() - org.telegram.messenger.g0.L(41.0f);
            this.f33921s = measuredHeight;
            this.f33922w = org.telegram.messenger.g0.L(18.0f) + this.h;
            this.f33923x = measuredHeight;
            this.f33924y = this.f33920r - org.telegram.messenger.g0.L(18.0f);
            this.E = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f33919n = org.telegram.messenger.g0.L(41.0f);
            this.f33920r = measuredWidth;
            this.f33921s = getMeasuredHeight() - org.telegram.messenger.g0.L(41.0f);
            this.f33922w = measuredWidth;
            this.f33923x = org.telegram.messenger.g0.L(18.0f) + this.f33919n;
            this.f33924y = measuredWidth;
            this.E = this.f33921s - org.telegram.messenger.g0.L(18.0f);
        }
        int L = this.h - org.telegram.messenger.g0.L(7.0f);
        int L2 = this.f33919n - org.telegram.messenger.g0.L(7.0f);
        int L3 = org.telegram.messenger.g0.L(7.0f) + this.h;
        int L4 = org.telegram.messenger.g0.L(7.0f) + this.f33919n;
        Drawable drawable2 = this.f33914a;
        drawable2.setBounds(L, L2, L3, L4);
        drawable2.draw(canvas);
        int L5 = this.f33920r - org.telegram.messenger.g0.L(7.0f);
        int L6 = this.f33921s - org.telegram.messenger.g0.L(7.0f);
        int L7 = org.telegram.messenger.g0.L(7.0f) + this.f33920r;
        int L8 = org.telegram.messenger.g0.L(7.0f) + this.f33921s;
        Drawable drawable3 = this.f33915b;
        drawable3.setBounds(L5, L6, L7, L8);
        drawable3.draw(canvas);
        int i7 = this.f33924y;
        int i10 = this.f33922w;
        int i11 = this.E;
        int i12 = this.f33923x;
        float f10 = this.F;
        int i13 = (int) (((i7 - i10) * f10) + i10);
        int i14 = (int) (((i11 - i12) * f10) + i12);
        Drawable drawable4 = this.d;
        Drawable drawable5 = this.f33916c;
        if (z10) {
            drawable5.setBounds(i10, i12 - org.telegram.messenger.g0.L(3.0f), this.f33924y, org.telegram.messenger.g0.L(3.0f) + this.f33923x);
            drawable4.setBounds(this.f33922w, this.f33923x - org.telegram.messenger.g0.L(3.0f), i13, org.telegram.messenger.g0.L(3.0f) + this.f33923x);
        } else {
            drawable5.setBounds(i12, 0, i11, org.telegram.messenger.g0.L(6.0f));
            drawable4.setBounds(this.f33923x, 0, i14, org.telegram.messenger.g0.L(6.0f));
            canvas.save();
            canvas.rotate(90.0f);
            canvas.translate(0.0f, (-this.f33922w) - org.telegram.messenger.g0.L(3.0f));
        }
        drawable5.draw(canvas);
        drawable4.draw(canvas);
        if (!z10) {
            canvas.restore();
        }
        if (this.H) {
            drawable = this.f33918f;
        } else {
            drawable = this.f33917e;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i13 - intrinsicWidth, i14 - intrinsicWidth, i13 + intrinsicWidth, i14 + intrinsicWidth);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c81.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(b81 b81Var) {
        this.M = b81Var;
    }
}
