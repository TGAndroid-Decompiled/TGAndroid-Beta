package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
public abstract class w9 extends tj0 {
    public int f39971f3;
    public int f39972g3;
    public boolean f39973h3;
    public int i3;
    public boolean f39974j3;

    public final void A1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (org.telegram.messenger.az.f()) {
            this.f39971f3 = z1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.f39971f3;
            return;
        }
        this.f39971f3 = 0;
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        this.f39974j3 = true;
        super.d(canvas, rectF);
        this.f39974j3 = false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.f39971f3 != 0 && !Y0()) {
            canvas.clipRect(0, this.f39971f3, getMeasuredWidth(), getMeasuredHeight() + this.i3);
            super.dispatchDraw(canvas);
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (view.getY() + view.getMeasuredHeight() < this.f39971f3 && !this.f39974j3 && !Y0()) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A1();
    }

    @Override
    public void onMeasure(int i3, int i10) {
        this.f39973h3 = true;
        A1();
        super.setPadding(getPaddingLeft(), this.f39972g3 + this.f39971f3, getPaddingRight(), getPaddingBottom());
        this.f39973h3 = false;
        super.onMeasure(i3, i10);
    }

    @Override
    public void requestLayout() {
        if (this.f39973h3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i3, int i10, int i11, int i12) {
        this.f39972g3 = i10;
        super.setPadding(i3, i10 + this.f39971f3, i11, i12);
    }

    public int z1() {
        return org.telegram.messenger.g0.L(203.0f);
    }
}
