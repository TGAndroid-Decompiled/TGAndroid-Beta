package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
public abstract class r9 extends uk0 {
    public int f29962e3;
    public int f29963f3;
    public boolean f29964g3;
    public int f29965h3;
    public boolean f29966i3;

    public final void A1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (org.telegram.messenger.uz.f()) {
            this.f29962e3 = z1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.f29962e3;
            return;
        }
        this.f29962e3 = 0;
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        this.f29966i3 = true;
        super.d(canvas, rectF);
        this.f29966i3 = false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.f29962e3 != 0 && !Y0()) {
            canvas.clipRect(0, this.f29962e3, getMeasuredWidth(), getMeasuredHeight() + this.f29965h3);
            super.dispatchDraw(canvas);
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (view.getY() + view.getMeasuredHeight() < this.f29962e3 && !this.f29966i3 && !Y0()) {
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
    public void onMeasure(int i10, int i11) {
        this.f29964g3 = true;
        A1();
        super.setPadding(getPaddingLeft(), this.f29963f3 + this.f29962e3, getPaddingRight(), getPaddingBottom());
        this.f29964g3 = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public void requestLayout() {
        if (this.f29964g3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f29963f3 = i11;
        super.setPadding(i10, i11 + this.f29962e3, i12, i13);
    }

    public int z1() {
        return org.telegram.messenger.i0.L(203.0f);
    }
}
