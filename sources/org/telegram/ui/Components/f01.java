package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public abstract class f01 extends View {
    public final g01 f33426a;
    public org.telegram.messenger.c20 f33427b;
    public final org.telegram.ui.ActionBar.f6 f33428c;
    public int d;

    public f01(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f33428c = f6Var;
        g01 g01Var = new g01(i7, this, f6Var, false);
        this.f33426a = g01Var;
        g01Var.f33780s = new ir0(this, 16);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.f6 f6Var = this.f33428c;
        if (f6Var != null) {
            f6Var.b(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.k6.r(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f33426a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33426a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33426a.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f33426a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(org.telegram.messenger.ij ijVar) {
        g01 g01Var = this.f33426a;
        g01Var.e(ijVar);
        if (isAttachedToWindow()) {
            g01Var.a();
        }
    }

    public void setBackgroundHeight(int i7) {
        this.d = i7;
    }

    public void setOnTopicClickListener(org.telegram.messenger.c20 c20Var) {
        this.f33427b = c20Var;
    }
}
