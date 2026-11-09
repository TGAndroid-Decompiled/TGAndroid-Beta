package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public abstract class g01 extends View {
    public final h01 f33834a;
    public org.telegram.messenger.c20 f33835b;
    public final org.telegram.ui.ActionBar.g6 f33836c;
    public int d;

    public g01(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f33836c = g6Var;
        h01 h01Var = new h01(i7, this, g6Var, false);
        this.f33834a = h01Var;
        h01Var.f34130s = new kr0(this, 16);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.g6 g6Var = this.f33836c;
        if (g6Var != null) {
            g6Var.b(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.l6.r(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f33834a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33834a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33834a.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f33834a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(org.telegram.messenger.ij ijVar) {
        h01 h01Var = this.f33834a;
        h01Var.e(ijVar);
        if (isAttachedToWindow()) {
            h01Var.a();
        }
    }

    public void setBackgroundHeight(int i7) {
        this.d = i7;
    }

    public void setOnTopicClickListener(org.telegram.messenger.c20 c20Var) {
        this.f33835b = c20Var;
    }
}
