package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public abstract class r01 extends View {
    public final s01 f39036a;
    public org.telegram.messenger.x10 f39037b;
    public final org.telegram.ui.ActionBar.h6 f39038c;
    public int d;

    public r01(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f39038c = h6Var;
        s01 s01Var = new s01(i7, this, h6Var, false);
        this.f39036a = s01Var;
        s01Var.f39444s = new cp0(this, 19);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.h6 h6Var = this.f39038c;
        if (h6Var != null) {
            h6Var.e(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.m6.r(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f39036a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39036a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39036a.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f39036a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(org.telegram.messenger.fj fjVar) {
        s01 s01Var = this.f39036a;
        s01Var.e(fjVar);
        if (isAttachedToWindow()) {
            s01Var.a();
        }
    }

    public void setBackgroundHeight(int i7) {
        this.d = i7;
    }

    public void setOnTopicClickListener(org.telegram.messenger.x10 x10Var) {
        this.f39037b = x10Var;
    }
}
