package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
public abstract class x9 extends qj0 {
    public int f40344e3;
    public int f40345f3;
    public boolean f40346g3;
    public int f40347h3;
    public boolean f40348i3;

    public final void A1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (org.telegram.messenger.iz.f()) {
            this.f40344e3 = z1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.f40344e3;
            return;
        }
        this.f40344e3 = 0;
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        this.f40348i3 = true;
        super.d(canvas, rectF);
        this.f40348i3 = false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.f40344e3 != 0 && !Y0()) {
            canvas.clipRect(0, this.f40344e3, getMeasuredWidth(), getMeasuredHeight() + this.f40347h3);
            super.dispatchDraw(canvas);
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (view.getY() + view.getMeasuredHeight() < this.f40344e3 && !this.f40348i3 && !Y0()) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A1();
    }

    @Override
    public void onMeasure(int i7, int i10) {
        this.f40346g3 = true;
        A1();
        super.setPadding(getPaddingLeft(), this.f40345f3 + this.f40344e3, getPaddingRight(), getPaddingBottom());
        this.f40346g3 = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public void requestLayout() {
        if (this.f40346g3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.f40345f3 = i10;
        super.setPadding(i7, i10 + this.f40344e3, i11, i12);
    }

    public int z1() {
        return org.telegram.messenger.g0.L(203.0f);
    }
}
