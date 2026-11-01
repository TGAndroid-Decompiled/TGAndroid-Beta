package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class t81 extends View {
    public int D;
    public float E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public AnimatorSet K;
    public s81 L;
    public boolean M;
    public final org.telegram.ui.Cells.f2 N;
    public final Drawable f30595a;
    public final Drawable f30596b;
    public final Drawable f30597c;
    public final Drawable d;
    public final Drawable e;
    public final Drawable f30598f;
    public int h;
    public int f30599n;
    public int f30600r;
    public int f30601s;
    public int f30602w;
    public int f30603x;
    public int f30604y;

    public t81(Context context) {
        super(context);
        this.M = true;
        this.N = new org.telegram.ui.Cells.f2(this);
        this.f30595a = context.getResources().getDrawable(2131232860);
        this.f30596b = context.getResources().getDrawable(2131232861);
        this.f30597c = context.getResources().getDrawable(2131232864);
        this.d = context.getResources().getDrawable(2131232865);
        this.e = context.getResources().getDrawable(2131232862);
        this.f30598f = context.getResources().getDrawable(2131232863);
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
        this.K.addListener(new q11(this, 9));
        this.K.start();
        return true;
    }

    public final void b(boolean r3, float r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t81.b(boolean, float):void");
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
            this.h = org.telegram.messenger.i0.L(41.0f);
            this.f30599n = measuredHeight;
            this.f30600r = getMeasuredWidth() - org.telegram.messenger.i0.L(41.0f);
            this.f30601s = measuredHeight;
            this.f30602w = org.telegram.messenger.i0.L(18.0f) + this.h;
            this.f30603x = measuredHeight;
            this.f30604y = this.f30600r - org.telegram.messenger.i0.L(18.0f);
            this.D = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.f30599n = org.telegram.messenger.i0.L(41.0f);
            this.f30600r = measuredWidth;
            this.f30601s = getMeasuredHeight() - org.telegram.messenger.i0.L(41.0f);
            this.f30602w = measuredWidth;
            this.f30603x = org.telegram.messenger.i0.L(18.0f) + this.f30599n;
            this.f30604y = measuredWidth;
            this.D = this.f30601s - org.telegram.messenger.i0.L(18.0f);
        }
        int L = this.h - org.telegram.messenger.i0.L(7.0f);
        int L2 = this.f30599n - org.telegram.messenger.i0.L(7.0f);
        int L3 = org.telegram.messenger.i0.L(7.0f) + this.h;
        int L4 = org.telegram.messenger.i0.L(7.0f) + this.f30599n;
        Drawable drawable2 = this.f30595a;
        drawable2.setBounds(L, L2, L3, L4);
        drawable2.draw(canvas);
        int L5 = this.f30600r - org.telegram.messenger.i0.L(7.0f);
        int L6 = this.f30601s - org.telegram.messenger.i0.L(7.0f);
        int L7 = org.telegram.messenger.i0.L(7.0f) + this.f30600r;
        int L8 = org.telegram.messenger.i0.L(7.0f) + this.f30601s;
        Drawable drawable3 = this.f30596b;
        drawable3.setBounds(L5, L6, L7, L8);
        drawable3.draw(canvas);
        int i10 = this.f30604y;
        int i11 = this.f30602w;
        int i12 = this.D;
        int i13 = this.f30603x;
        float f7 = this.E;
        int i14 = (int) (((i10 - i11) * f7) + i11);
        int i15 = (int) (((i12 - i13) * f7) + i13);
        Drawable drawable4 = this.d;
        Drawable drawable5 = this.f30597c;
        if (z10) {
            drawable5.setBounds(i11, i13 - org.telegram.messenger.i0.L(3.0f), this.f30604y, org.telegram.messenger.i0.L(3.0f) + this.f30603x);
            drawable4.setBounds(this.f30602w, this.f30603x - org.telegram.messenger.i0.L(3.0f), i14, org.telegram.messenger.i0.L(3.0f) + this.f30603x);
        } else {
            drawable5.setBounds(i13, 0, i12, org.telegram.messenger.i0.L(6.0f));
            drawable4.setBounds(this.f30603x, 0, i15, org.telegram.messenger.i0.L(6.0f));
            canvas.save();
            canvas.rotate(90.0f);
            canvas.translate(0.0f, (-this.f30602w) - org.telegram.messenger.i0.L(3.0f));
        }
        drawable5.draw(canvas);
        drawable4.draw(canvas);
        if (!z10) {
            canvas.restore();
        }
        if (this.G) {
            drawable = this.f30598f;
        } else {
            drawable = this.e;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i14 - intrinsicWidth, i15 - intrinsicWidth, i14 + intrinsicWidth, i15 + intrinsicWidth);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t81.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(s81 s81Var) {
        this.L = s81Var;
    }
}
