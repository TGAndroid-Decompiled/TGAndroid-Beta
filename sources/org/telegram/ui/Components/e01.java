package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public abstract class e01 extends View {
    public final f01 f33076a;
    public org.telegram.messenger.c20 f33077b;
    public final org.telegram.ui.ActionBar.f6 f33078c;
    public int d;

    public e01(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f33078c = f6Var;
        f01 f01Var = new f01(i7, this, f6Var, false);
        this.f33076a = f01Var;
        f01Var.f33439s = new ir0(this, 16);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.f6 f6Var = this.f33078c;
        if (f6Var != null) {
            f6Var.b(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.k6.r(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f33076a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33076a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33076a.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f33076a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(org.telegram.messenger.ij ijVar) {
        f01 f01Var = this.f33076a;
        f01Var.e(ijVar);
        if (isAttachedToWindow()) {
            f01Var.a();
        }
    }

    public void setBackgroundHeight(int i7) {
        this.d = i7;
    }

    public void setOnTopicClickListener(org.telegram.messenger.c20 c20Var) {
        this.f33077b = c20Var;
    }
}
