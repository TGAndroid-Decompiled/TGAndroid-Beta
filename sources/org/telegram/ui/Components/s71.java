package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class s71 extends View {
    public int E;
    public float F;
    public boolean G;
    public boolean H;
    public float I;
    public float J;
    public float K;
    public AnimatorSet L;
    public r71 M;
    public boolean N;
    public final org.telegram.ui.Cells.f2 O;
    public final Drawable f39194a;
    public final Drawable f39195b;
    public final Drawable f39196c;
    public final Drawable d;
    public final Drawable f39197e;
    public final Drawable f39198f;
    public int h;
    public int f39199n;
    public int f39200r;
    public int f39201s;
    public int f39202w;
    public int f39203x;
    public int f39204y;

    public s71(Context context) {
        super(context);
        this.N = true;
        this.O = new org.telegram.ui.Cells.f2(this);
        this.f39194a = context.getResources().getDrawable(2131232863);
        this.f39195b = context.getResources().getDrawable(2131232864);
        this.f39196c = context.getResources().getDrawable(2131232867);
        this.d = context.getResources().getDrawable(2131232868);
        this.f39197e = context.getResources().getDrawable(2131232865);
        this.f39198f = context.getResources().getDrawable(2131232866);
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
        this.L.addListener(new i11(this, 8));
        this.L.start();
        return true;
    }

    public final void b(boolean r3, float r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s71.b(boolean, float):void");
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
            this.f39199n = measuredHeight;
            this.f39200r = getMeasuredWidth() - org.telegram.messenger.g0.L(41.0f);
            this.f39201s = measuredHeight;
            this.f39202w = org.telegram.messenger.g0.L(18.0f) + this.h;
            this.f39203x = measuredHeight;
            this.f39204y = this.f39200r - org.telegram.messenger.g0.L(18.0f);
            this.E = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f39199n = org.telegram.messenger.g0.L(41.0f);
            this.f39200r = measuredWidth;
            this.f39201s = getMeasuredHeight() - org.telegram.messenger.g0.L(41.0f);
            this.f39202w = measuredWidth;
            this.f39203x = org.telegram.messenger.g0.L(18.0f) + this.f39199n;
            this.f39204y = measuredWidth;
            this.E = this.f39201s - org.telegram.messenger.g0.L(18.0f);
        }
        int L = this.h - org.telegram.messenger.g0.L(7.0f);
        int L2 = this.f39199n - org.telegram.messenger.g0.L(7.0f);
        int L3 = org.telegram.messenger.g0.L(7.0f) + this.h;
        int L4 = org.telegram.messenger.g0.L(7.0f) + this.f39199n;
        Drawable drawable2 = this.f39194a;
        drawable2.setBounds(L, L2, L3, L4);
        drawable2.draw(canvas);
        int L5 = this.f39200r - org.telegram.messenger.g0.L(7.0f);
        int L6 = this.f39201s - org.telegram.messenger.g0.L(7.0f);
        int L7 = org.telegram.messenger.g0.L(7.0f) + this.f39200r;
        int L8 = org.telegram.messenger.g0.L(7.0f) + this.f39201s;
        Drawable drawable3 = this.f39195b;
        drawable3.setBounds(L5, L6, L7, L8);
        drawable3.draw(canvas);
        int i7 = this.f39204y;
        int i10 = this.f39202w;
        int i11 = this.E;
        int i12 = this.f39203x;
        float f10 = this.F;
        int i13 = (int) (((i7 - i10) * f10) + i10);
        int i14 = (int) (((i11 - i12) * f10) + i12);
        Drawable drawable4 = this.d;
        Drawable drawable5 = this.f39196c;
        if (z10) {
            drawable5.setBounds(i10, i12 - org.telegram.messenger.g0.L(3.0f), this.f39204y, org.telegram.messenger.g0.L(3.0f) + this.f39203x);
            drawable4.setBounds(this.f39202w, this.f39203x - org.telegram.messenger.g0.L(3.0f), i13, org.telegram.messenger.g0.L(3.0f) + this.f39203x);
        } else {
            drawable5.setBounds(i12, 0, i11, org.telegram.messenger.g0.L(6.0f));
            drawable4.setBounds(this.f39203x, 0, i14, org.telegram.messenger.g0.L(6.0f));
            canvas.save();
            canvas.rotate(90.0f);
            canvas.translate(0.0f, (-this.f39202w) - org.telegram.messenger.g0.L(3.0f));
        }
        drawable5.draw(canvas);
        drawable4.draw(canvas);
        if (!z10) {
            canvas.restore();
        }
        if (this.H) {
            drawable = this.f39198f;
        } else {
            drawable = this.f39197e;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i13 - intrinsicWidth, i14 - intrinsicWidth, i13 + intrinsicWidth, i14 + intrinsicWidth);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s71.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(r71 r71Var) {
        this.M = r71Var;
    }
}
