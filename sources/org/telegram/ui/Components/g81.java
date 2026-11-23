package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class g81 extends View {
    public int E;
    public float F;
    public boolean G;
    public boolean H;
    public float I;
    public float J;
    public float K;
    public AnimatorSet L;
    public f81 M;
    public boolean N;
    public final org.telegram.ui.Cells.g2 O;
    public final Drawable f35357a;
    public final Drawable f35358b;
    public final Drawable f35359c;
    public final Drawable d;
    public final Drawable f35360e;
    public final Drawable f35361f;
    public int h;
    public int f35362n;
    public int f35363r;
    public int f35364s;
    public int f35365w;
    public int f35366x;
    public int f35367y;

    public g81(Context context) {
        super(context);
        this.N = true;
        this.O = new org.telegram.ui.Cells.g2(this);
        this.f35357a = context.getResources().getDrawable(2131232870);
        this.f35358b = context.getResources().getDrawable(2131232871);
        this.f35359c = context.getResources().getDrawable(2131232874);
        this.d = context.getResources().getDrawable(2131232875);
        this.f35360e = context.getResources().getDrawable(2131232872);
        this.f35361f = context.getResources().getDrawable(2131232873);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g81.b(boolean, float):void");
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
            this.f35362n = measuredHeight;
            this.f35363r = getMeasuredWidth() - org.telegram.messenger.g0.L(41.0f);
            this.f35364s = measuredHeight;
            this.f35365w = org.telegram.messenger.g0.L(18.0f) + this.h;
            this.f35366x = measuredHeight;
            this.f35367y = this.f35363r - org.telegram.messenger.g0.L(18.0f);
            this.E = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f35362n = org.telegram.messenger.g0.L(41.0f);
            this.f35363r = measuredWidth;
            this.f35364s = getMeasuredHeight() - org.telegram.messenger.g0.L(41.0f);
            this.f35365w = measuredWidth;
            this.f35366x = org.telegram.messenger.g0.L(18.0f) + this.f35362n;
            this.f35367y = measuredWidth;
            this.E = this.f35364s - org.telegram.messenger.g0.L(18.0f);
        }
        int L = this.h - org.telegram.messenger.g0.L(7.0f);
        int L2 = this.f35362n - org.telegram.messenger.g0.L(7.0f);
        int L3 = org.telegram.messenger.g0.L(7.0f) + this.h;
        int L4 = org.telegram.messenger.g0.L(7.0f) + this.f35362n;
        Drawable drawable2 = this.f35357a;
        drawable2.setBounds(L, L2, L3, L4);
        drawable2.draw(canvas);
        int L5 = this.f35363r - org.telegram.messenger.g0.L(7.0f);
        int L6 = this.f35364s - org.telegram.messenger.g0.L(7.0f);
        int L7 = org.telegram.messenger.g0.L(7.0f) + this.f35363r;
        int L8 = org.telegram.messenger.g0.L(7.0f) + this.f35364s;
        Drawable drawable3 = this.f35358b;
        drawable3.setBounds(L5, L6, L7, L8);
        drawable3.draw(canvas);
        int i7 = this.f35367y;
        int i10 = this.f35365w;
        int i11 = this.E;
        int i12 = this.f35366x;
        float f10 = this.F;
        int i13 = (int) (((i7 - i10) * f10) + i10);
        int i14 = (int) (((i11 - i12) * f10) + i12);
        Drawable drawable4 = this.d;
        Drawable drawable5 = this.f35359c;
        if (z10) {
            drawable5.setBounds(i10, i12 - org.telegram.messenger.g0.L(3.0f), this.f35367y, org.telegram.messenger.g0.L(3.0f) + this.f35366x);
            drawable4.setBounds(this.f35365w, this.f35366x - org.telegram.messenger.g0.L(3.0f), i13, org.telegram.messenger.g0.L(3.0f) + this.f35366x);
        } else {
            drawable5.setBounds(i12, 0, i11, org.telegram.messenger.g0.L(6.0f));
            drawable4.setBounds(this.f35366x, 0, i14, org.telegram.messenger.g0.L(6.0f));
            canvas.save();
            canvas.rotate(90.0f);
            canvas.translate(0.0f, (-this.f35365w) - org.telegram.messenger.g0.L(3.0f));
        }
        drawable5.draw(canvas);
        drawable4.draw(canvas);
        if (!z10) {
            canvas.restore();
        }
        if (this.H) {
            drawable = this.f35361f;
        } else {
            drawable = this.f35360e;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i13 - intrinsicWidth, i14 - intrinsicWidth, i13 + intrinsicWidth, i14 + intrinsicWidth);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g81.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(f81 f81Var) {
        this.M = f81Var;
    }
}
