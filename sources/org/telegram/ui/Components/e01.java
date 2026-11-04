package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public abstract class e01 extends View {
    public final f01 f33259a;
    public org.telegram.messenger.u10 f33260b;
    public final org.telegram.ui.ActionBar.e6 f33261c;
    public int d;

    public e01(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f33261c = e6Var;
        f01 f01Var = new f01(i3, this, e6Var, false);
        this.f33259a = f01Var;
        f01Var.f33636s = new sp0(this, 18);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.e6 e6Var = this.f33261c;
        if (e6Var != null) {
            e6Var.b(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.k6.r(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f33259a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33259a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33259a.b();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f33259a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(org.telegram.messenger.zi ziVar) {
        f01 f01Var = this.f33259a;
        f01Var.e(ziVar);
        if (isAttachedToWindow()) {
            f01Var.a();
        }
    }

    public void setBackgroundHeight(int i3) {
        this.d = i3;
    }

    public void setOnTopicClickListener(org.telegram.messenger.u10 u10Var) {
        this.f33260b = u10Var;
    }
}
