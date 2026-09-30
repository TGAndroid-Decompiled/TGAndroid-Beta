package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public abstract class ja extends zl0 {
    public int f25382e3;
    public int f25383f3;
    public int f25384g3;
    public boolean f25385h3;
    public int f25386i3;
    public boolean j3;

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.f25382e3 != 0 && !a1()) {
            canvas.clipRect(0, this.f25382e3, getMeasuredWidth(), getMeasuredHeight() + this.f25386i3);
            super.dispatchDraw(canvas);
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (view.getY() + view.getMeasuredHeight() < this.f25382e3 && !this.j3 && !a1()) {
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
        z1();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        this.f25385h3 = true;
        z1();
        super.setPadding(getPaddingLeft(), this.f25383f3 + this.f25382e3, getPaddingRight(), getPaddingBottom());
        this.f25385h3 = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public void requestLayout() {
        if (this.f25385h3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f25383f3 = i11;
        this.f25384g3 = i13;
        super.setPadding(i10, i11 + this.f25382e3, i12, i13);
    }

    public int y1() {
        return AndroidUtilities.dp(203.0f);
    }

    public final void z1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (SharedConfig.chatBlurEnabled()) {
            this.f25382e3 = y1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.f25382e3;
            return;
        }
        this.f25382e3 = 0;
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
    }
}
