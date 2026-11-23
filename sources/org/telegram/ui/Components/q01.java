package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public abstract class q01 extends View {
    public final r01 f38696a;
    public org.telegram.messenger.y10 f38697b;
    public final org.telegram.ui.ActionBar.h6 f38698c;
    public int d;

    public q01(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f38698c = h6Var;
        r01 r01Var = new r01(i7, this, h6Var, false);
        this.f38696a = r01Var;
        r01Var.f39000s = new cp0(this, 19);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.h6 h6Var = this.f38698c;
        if (h6Var != null) {
            h6Var.e(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.m6.r(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f38696a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38696a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38696a.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f38696a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(org.telegram.messenger.gj gjVar) {
        r01 r01Var = this.f38696a;
        r01Var.e(gjVar);
        if (isAttachedToWindow()) {
            r01Var.a();
        }
    }

    public void setBackgroundHeight(int i7) {
        this.d = i7;
    }

    public void setOnTopicClickListener(org.telegram.messenger.y10 y10Var) {
        this.f38697b = y10Var;
    }
}
