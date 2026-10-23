package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public abstract class ia extends mm0 {
    public int Y2;
    public int Z2;
    public int f27257a3;
    public boolean f27258b3;
    public int f27259c3;
    public boolean f27260d3;

    public int C1() {
        return AndroidUtilities.dp(203.0f);
    }

    public final void D1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (SharedConfig.chatBlurEnabled()) {
            this.Y2 = C1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.Y2;
            return;
        }
        this.Y2 = 0;
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.Y2 != 0 && !a1()) {
            canvas.clipRect(0, this.Y2, getMeasuredWidth(), getMeasuredHeight() + this.f27259c3);
            super.dispatchDraw(canvas);
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (view.getY() + view.getMeasuredHeight() < this.Y2 && !this.f27260d3 && !a1()) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        this.f27260d3 = true;
        super.f(canvas, rectF);
        this.f27260d3 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        D1();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        this.f27258b3 = true;
        D1();
        super.setPadding(getPaddingLeft(), this.Z2 + this.Y2, getPaddingRight(), getPaddingBottom());
        this.f27258b3 = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public void requestLayout() {
        if (this.f27258b3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.Z2 = i11;
        this.f27257a3 = i13;
        super.setPadding(i10, i11 + this.Y2, i12, i13);
    }
}
