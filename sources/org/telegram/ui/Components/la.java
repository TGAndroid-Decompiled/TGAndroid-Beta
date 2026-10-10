package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public abstract class la extends rm0 {
    public int V2;
    public int W2;
    public int X2;
    public boolean Y2;
    public int Z2;
    public boolean f28278a3;

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.V2 != 0 && !Z0()) {
            canvas.clipRect(0, this.V2, getMeasuredWidth(), getMeasuredHeight() + this.Z2);
            super.dispatchDraw(canvas);
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (view.getY() + view.getMeasuredHeight() < this.V2 && !this.f28278a3 && !Z0()) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        this.f28278a3 = true;
        super.f(canvas, rectF);
        this.f28278a3 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y1();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        this.Y2 = true;
        y1();
        super.setPadding(getPaddingLeft(), this.W2 + this.V2, getPaddingRight(), getPaddingBottom());
        this.Y2 = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public void requestLayout() {
        if (this.Y2) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.W2 = i11;
        this.X2 = i13;
        super.setPadding(i10, i11 + this.V2, i12, i13);
    }

    public int x1() {
        return AndroidUtilities.dp(203.0f);
    }

    public final void y1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (SharedConfig.chatBlurEnabled()) {
            this.V2 = x1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.V2;
            return;
        }
        this.V2 = 0;
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
    }
}
