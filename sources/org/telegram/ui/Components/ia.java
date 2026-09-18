package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public abstract class ia extends wl0 {
    public int X2;
    public int Y2;
    public int Z2;
    public boolean f24882a3;
    public int f24883b3;
    public boolean f24884c3;

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.X2 != 0 && !a1()) {
            canvas.clipRect(0, this.X2, getMeasuredWidth(), getMeasuredHeight() + this.f24883b3);
            super.dispatchDraw(canvas);
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (view.getY() + view.getMeasuredHeight() < this.X2 && !this.f24884c3 && !a1()) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        this.f24884c3 = true;
        super.f(canvas, rectF);
        this.f24884c3 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y1();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        this.f24882a3 = true;
        y1();
        super.setPadding(getPaddingLeft(), this.Y2 + this.X2, getPaddingRight(), getPaddingBottom());
        this.f24882a3 = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public void requestLayout() {
        if (this.f24882a3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.Y2 = i11;
        this.Z2 = i13;
        super.setPadding(i10, i11 + this.X2, i12, i13);
    }

    public int x1() {
        return AndroidUtilities.dp(203.0f);
    }

    public final void y1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (SharedConfig.chatBlurEnabled()) {
            this.X2 = x1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.X2;
            return;
        }
        this.X2 = 0;
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
    }
}
