package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public abstract class fa extends jl0 {
    public int T2;
    public int U2;
    public int V2;
    public boolean W2;
    public int X2;
    public boolean Y2;

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.T2 != 0 && !Z0()) {
            canvas.clipRect(0, this.T2, getMeasuredWidth(), getMeasuredHeight() + this.X2);
            super.dispatchDraw(canvas);
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (view.getY() + view.getMeasuredHeight() < this.T2 && !this.Y2 && !Z0()) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        this.Y2 = true;
        super.e(canvas, rectF);
        this.Y2 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x1();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        this.W2 = true;
        x1();
        super.setPadding(getPaddingLeft(), this.U2 + this.T2, getPaddingRight(), getPaddingBottom());
        this.W2 = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public void requestLayout() {
        if (this.W2) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.U2 = i11;
        this.V2 = i13;
        super.setPadding(i10, i11 + this.T2, i12, i13);
    }

    public int w1() {
        return AndroidUtilities.dp(203.0f);
    }

    public final void x1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (SharedConfig.chatBlurEnabled()) {
            this.T2 = w1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.T2;
            return;
        }
        this.T2 = 0;
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
    }
}
