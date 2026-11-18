package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
public abstract class ba extends ck0 {
    public int f33614f3;
    public int f33615g3;
    public boolean f33616h3;
    public int f33617i3;
    public boolean j3;

    public final void A1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (org.telegram.messenger.bz.f()) {
            this.f33614f3 = z1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.f33614f3;
            return;
        }
        this.f33614f3 = 0;
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        this.j3 = true;
        super.d(canvas, rectF);
        this.j3 = false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.f33614f3 != 0 && !Y0()) {
            canvas.clipRect(0, this.f33614f3, getMeasuredWidth(), getMeasuredHeight() + this.f33617i3);
            super.dispatchDraw(canvas);
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (view.getY() + view.getMeasuredHeight() < this.f33614f3 && !this.j3 && !Y0()) {
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
        this.f33616h3 = true;
        A1();
        super.setPadding(getPaddingLeft(), this.f33615g3 + this.f33614f3, getPaddingRight(), getPaddingBottom());
        this.f33616h3 = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public void requestLayout() {
        if (this.f33616h3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.f33615g3 = i10;
        super.setPadding(i7, i10 + this.f33614f3, i11, i12);
    }

    public int z1() {
        return org.telegram.messenger.g0.L(203.0f);
    }
}
