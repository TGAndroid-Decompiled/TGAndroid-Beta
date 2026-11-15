package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
public abstract class t9 extends uj0 {
    public int f39612f3;
    public int f39613g3;
    public boolean f39614h3;
    public int f39615i3;
    public boolean j3;

    public final void A1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (org.telegram.messenger.gz.f()) {
            this.f39612f3 = z1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.f39612f3;
            return;
        }
        this.f39612f3 = 0;
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
        if (this.f39612f3 != 0 && !Y0()) {
            canvas.clipRect(0, this.f39612f3, getMeasuredWidth(), getMeasuredHeight() + this.f39615i3);
            super.dispatchDraw(canvas);
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (view.getY() + view.getMeasuredHeight() < this.f39612f3 && !this.j3 && !Y0()) {
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
        this.f39614h3 = true;
        A1();
        super.setPadding(getPaddingLeft(), this.f39613g3 + this.f39612f3, getPaddingRight(), getPaddingBottom());
        this.f39614h3 = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public void requestLayout() {
        if (this.f39614h3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.f39613g3 = i10;
        super.setPadding(i7, i10 + this.f39612f3, i11, i12);
    }

    public int z1() {
        return org.telegram.messenger.g0.L(203.0f);
    }
}
