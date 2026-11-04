package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class j71 extends View {
    public int E;
    public float F;
    public boolean G;
    public boolean H;
    public float I;
    public float J;
    public float K;
    public AnimatorSet L;
    public i71 M;
    public boolean N;
    public final org.telegram.ui.Cells.f2 O;
    public final Drawable f34980a;
    public final Drawable f34981b;
    public final Drawable f34982c;
    public final Drawable d;
    public final Drawable f34983e;
    public final Drawable f34984f;
    public int h;
    public int f34985n;
    public int f34986r;
    public int f34987s;
    public int f34988w;
    public int f34989x;
    public int f34990y;

    public j71(Context context) {
        super(context);
        this.N = true;
        this.O = new org.telegram.ui.Cells.f2(this);
        this.f34980a = context.getResources().getDrawable(2131232860);
        this.f34981b = context.getResources().getDrawable(2131232861);
        this.f34982c = context.getResources().getDrawable(2131232864);
        this.d = context.getResources().getDrawable(2131232865);
        this.f34983e = context.getResources().getDrawable(2131232862);
        this.f34984f = context.getResources().getDrawable(2131232863);
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
        this.L.addListener(new j01(this, 9));
        this.L.start();
        return true;
    }

    public final void b(boolean r3, float r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j71.b(boolean, float):void");
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
            this.f34985n = measuredHeight;
            this.f34986r = getMeasuredWidth() - org.telegram.messenger.g0.L(41.0f);
            this.f34987s = measuredHeight;
            this.f34988w = org.telegram.messenger.g0.L(18.0f) + this.h;
            this.f34989x = measuredHeight;
            this.f34990y = this.f34986r - org.telegram.messenger.g0.L(18.0f);
            this.E = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f34985n = org.telegram.messenger.g0.L(41.0f);
            this.f34986r = measuredWidth;
            this.f34987s = getMeasuredHeight() - org.telegram.messenger.g0.L(41.0f);
            this.f34988w = measuredWidth;
            this.f34989x = org.telegram.messenger.g0.L(18.0f) + this.f34985n;
            this.f34990y = measuredWidth;
            this.E = this.f34987s - org.telegram.messenger.g0.L(18.0f);
        }
        int L = this.h - org.telegram.messenger.g0.L(7.0f);
        int L2 = this.f34985n - org.telegram.messenger.g0.L(7.0f);
        int L3 = org.telegram.messenger.g0.L(7.0f) + this.h;
        int L4 = org.telegram.messenger.g0.L(7.0f) + this.f34985n;
        Drawable drawable2 = this.f34980a;
        drawable2.setBounds(L, L2, L3, L4);
        drawable2.draw(canvas);
        int L5 = this.f34986r - org.telegram.messenger.g0.L(7.0f);
        int L6 = this.f34987s - org.telegram.messenger.g0.L(7.0f);
        int L7 = org.telegram.messenger.g0.L(7.0f) + this.f34986r;
        int L8 = org.telegram.messenger.g0.L(7.0f) + this.f34987s;
        Drawable drawable3 = this.f34981b;
        drawable3.setBounds(L5, L6, L7, L8);
        drawable3.draw(canvas);
        int i3 = this.f34990y;
        int i10 = this.f34988w;
        int i11 = this.E;
        int i12 = this.f34989x;
        float f10 = this.F;
        int i13 = (int) (((i3 - i10) * f10) + i10);
        int i14 = (int) (((i11 - i12) * f10) + i12);
        Drawable drawable4 = this.d;
        Drawable drawable5 = this.f34982c;
        if (z10) {
            drawable5.setBounds(i10, i12 - org.telegram.messenger.g0.L(3.0f), this.f34990y, org.telegram.messenger.g0.L(3.0f) + this.f34989x);
            drawable4.setBounds(this.f34988w, this.f34989x - org.telegram.messenger.g0.L(3.0f), i13, org.telegram.messenger.g0.L(3.0f) + this.f34989x);
        } else {
            drawable5.setBounds(i12, 0, i11, org.telegram.messenger.g0.L(6.0f));
            drawable4.setBounds(this.f34989x, 0, i14, org.telegram.messenger.g0.L(6.0f));
            canvas.save();
            canvas.rotate(90.0f);
            canvas.translate(0.0f, (-this.f34988w) - org.telegram.messenger.g0.L(3.0f));
        }
        drawable5.draw(canvas);
        drawable4.draw(canvas);
        if (!z10) {
            canvas.restore();
        }
        if (this.H) {
            drawable = this.f34984f;
        } else {
            drawable = this.f34983e;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i13 - intrinsicWidth, i14 - intrinsicWidth, i13 + intrinsicWidth, i14 + intrinsicWidth);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j71.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(i71 i71Var) {
        this.M = i71Var;
    }
}
