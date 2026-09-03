package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public abstract class aa extends sl0 {
    public int U2;
    public int V2;
    public int W2;
    public boolean X2;
    public int Y2;
    public boolean Z2;

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.U2 != 0 && !Y0()) {
            canvas.clipRect(0, this.U2, getMeasuredWidth(), getMeasuredHeight() + this.Y2);
            super.dispatchDraw(canvas);
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (view.getY() + view.getMeasuredHeight() < this.U2 && !this.Z2 && !Y0()) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        this.Z2 = true;
        super.e(canvas, rectF);
        this.Z2 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w1();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        this.X2 = true;
        w1();
        super.setPadding(getPaddingLeft(), this.V2 + this.U2, getPaddingRight(), getPaddingBottom());
        this.X2 = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public void requestLayout() {
        if (this.X2) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.V2 = i11;
        this.W2 = i13;
        super.setPadding(i10, i11 + this.U2, i12, i13);
    }

    public int v1() {
        return AndroidUtilities.dp(203.0f);
    }

    public final void w1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (SharedConfig.chatBlurEnabled()) {
            this.U2 = v1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.U2;
            return;
        }
        this.U2 = 0;
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
    }
}
