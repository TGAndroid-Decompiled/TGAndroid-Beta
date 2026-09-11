package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public abstract class ia extends ll0 {
    public int X2;
    public int Y2;
    public int Z2;
    public boolean f27054a3;
    public int f27055b3;
    public boolean f27056c3;

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.X2 != 0 && !Y0()) {
            canvas.clipRect(0, this.X2, getMeasuredWidth(), getMeasuredHeight() + this.f27055b3);
            super.dispatchDraw(canvas);
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (view.getY() + view.getMeasuredHeight() < this.X2 && !this.f27056c3 && !Y0()) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        this.f27056c3 = true;
        super.f(canvas, rectF);
        this.f27056c3 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w1();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        this.f27054a3 = true;
        w1();
        super.setPadding(getPaddingLeft(), this.Y2 + this.X2, getPaddingRight(), getPaddingBottom());
        this.f27054a3 = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public void requestLayout() {
        if (this.f27054a3) {
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

    public int v1() {
        return AndroidUtilities.dp(203.0f);
    }

    public final void w1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (SharedConfig.chatBlurEnabled()) {
            this.X2 = v1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.X2;
            return;
        }
        this.X2 = 0;
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
    }
}
