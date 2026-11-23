package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class f81 extends View {
    public int E;
    public float F;
    public boolean G;
    public boolean H;
    public float I;
    public float J;
    public float K;
    public AnimatorSet L;
    public e81 M;
    public boolean N;
    public final org.telegram.ui.Cells.g2 O;
    public final Drawable f35124a;
    public final Drawable f35125b;
    public final Drawable f35126c;
    public final Drawable d;
    public final Drawable f35127e;
    public final Drawable f35128f;
    public int h;
    public int f35129n;
    public int f35130r;
    public int f35131s;
    public int f35132w;
    public int f35133x;
    public int f35134y;

    public f81(Context context) {
        super(context);
        this.N = true;
        this.O = new org.telegram.ui.Cells.g2(this);
        this.f35124a = context.getResources().getDrawable(2131232867);
        this.f35125b = context.getResources().getDrawable(2131232868);
        this.f35126c = context.getResources().getDrawable(2131232871);
        this.d = context.getResources().getDrawable(2131232872);
        this.f35127e = context.getResources().getDrawable(2131232869);
        this.f35128f = context.getResources().getDrawable(2131232870);
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
        this.L.addListener(new t11(this, 8));
        this.L.start();
        return true;
    }

    public final void b(boolean r3, float r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f81.b(boolean, float):void");
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
            this.f35129n = measuredHeight;
            this.f35130r = getMeasuredWidth() - org.telegram.messenger.g0.L(41.0f);
            this.f35131s = measuredHeight;
            this.f35132w = org.telegram.messenger.g0.L(18.0f) + this.h;
            this.f35133x = measuredHeight;
            this.f35134y = this.f35130r - org.telegram.messenger.g0.L(18.0f);
            this.E = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f35129n = org.telegram.messenger.g0.L(41.0f);
            this.f35130r = measuredWidth;
            this.f35131s = getMeasuredHeight() - org.telegram.messenger.g0.L(41.0f);
            this.f35132w = measuredWidth;
            this.f35133x = org.telegram.messenger.g0.L(18.0f) + this.f35129n;
            this.f35134y = measuredWidth;
            this.E = this.f35131s - org.telegram.messenger.g0.L(18.0f);
        }
        int L = this.h - org.telegram.messenger.g0.L(7.0f);
        int L2 = this.f35129n - org.telegram.messenger.g0.L(7.0f);
        int L3 = org.telegram.messenger.g0.L(7.0f) + this.h;
        int L4 = org.telegram.messenger.g0.L(7.0f) + this.f35129n;
        Drawable drawable2 = this.f35124a;
        drawable2.setBounds(L, L2, L3, L4);
        drawable2.draw(canvas);
        int L5 = this.f35130r - org.telegram.messenger.g0.L(7.0f);
        int L6 = this.f35131s - org.telegram.messenger.g0.L(7.0f);
        int L7 = org.telegram.messenger.g0.L(7.0f) + this.f35130r;
        int L8 = org.telegram.messenger.g0.L(7.0f) + this.f35131s;
        Drawable drawable3 = this.f35125b;
        drawable3.setBounds(L5, L6, L7, L8);
        drawable3.draw(canvas);
        int i7 = this.f35134y;
        int i10 = this.f35132w;
        int i11 = this.E;
        int i12 = this.f35133x;
        float f10 = this.F;
        int i13 = (int) (((i7 - i10) * f10) + i10);
        int i14 = (int) (((i11 - i12) * f10) + i12);
        Drawable drawable4 = this.d;
        Drawable drawable5 = this.f35126c;
        if (z10) {
            drawable5.setBounds(i10, i12 - org.telegram.messenger.g0.L(3.0f), this.f35134y, org.telegram.messenger.g0.L(3.0f) + this.f35133x);
            drawable4.setBounds(this.f35132w, this.f35133x - org.telegram.messenger.g0.L(3.0f), i13, org.telegram.messenger.g0.L(3.0f) + this.f35133x);
        } else {
            drawable5.setBounds(i12, 0, i11, org.telegram.messenger.g0.L(6.0f));
            drawable4.setBounds(this.f35133x, 0, i14, org.telegram.messenger.g0.L(6.0f));
            canvas.save();
            canvas.rotate(90.0f);
            canvas.translate(0.0f, (-this.f35132w) - org.telegram.messenger.g0.L(3.0f));
        }
        drawable5.draw(canvas);
        drawable4.draw(canvas);
        if (!z10) {
            canvas.restore();
        }
        if (this.H) {
            drawable = this.f35128f;
        } else {
            drawable = this.f35127e;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i13 - intrinsicWidth, i14 - intrinsicWidth, i13 + intrinsicWidth, i14 + intrinsicWidth);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f81.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(e81 e81Var) {
        this.M = e81Var;
    }
}
