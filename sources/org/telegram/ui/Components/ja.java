package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public abstract class ja extends zl0 {
    public int f27773e3;
    public int f27774f3;
    public int f27775g3;
    public boolean f27776h3;
    public int f27777i3;
    public boolean j3;

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.f27773e3 != 0 && !Z0()) {
            canvas.clipRect(0, this.f27773e3, getMeasuredWidth(), getMeasuredHeight() + this.f27777i3);
            super.dispatchDraw(canvas);
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (view.getY() + view.getMeasuredHeight() < this.f27773e3 && !this.j3 && !Z0()) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        this.j3 = true;
        super.f(canvas, rectF);
        this.j3 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y1();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        this.f27776h3 = true;
        y1();
        super.setPadding(getPaddingLeft(), this.f27774f3 + this.f27773e3, getPaddingRight(), getPaddingBottom());
        this.f27776h3 = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public void requestLayout() {
        if (this.f27776h3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f27774f3 = i11;
        this.f27775g3 = i13;
        super.setPadding(i10, i11 + this.f27773e3, i12, i13);
    }

    public int x1() {
        return AndroidUtilities.dp(203.0f);
    }

    public final void y1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (SharedConfig.chatBlurEnabled()) {
            this.f27773e3 = x1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.f27773e3;
            return;
        }
        this.f27773e3 = 0;
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
    }
}
