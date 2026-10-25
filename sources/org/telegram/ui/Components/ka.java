package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public abstract class ka extends mm0 {
    public int f29884f3;
    public int f29885g3;
    public boolean f29886h3;
    public int f29887i3;
    public boolean f29888j3;

    public int C1() {
        return AndroidUtilities.dp(203.0f);
    }

    public final void D1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (SharedConfig.chatBlurEnabled()) {
            this.f29884f3 = C1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.f29884f3;
            return;
        }
        this.f29884f3 = 0;
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.f29884f3 != 0 && !Z0()) {
            canvas.clipRect(0, this.f29884f3, getMeasuredWidth(), getMeasuredHeight() + this.f29887i3);
            super.dispatchDraw(canvas);
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (view.getY() + view.getMeasuredHeight() < this.f29884f3 && !this.f29888j3 && !Z0()) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        this.f29888j3 = true;
        super.f(canvas, rectF);
        this.f29888j3 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        D1();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        this.f29886h3 = true;
        D1();
        super.setPadding(getPaddingLeft(), this.f29885g3 + this.f29884f3, getPaddingRight(), getPaddingBottom());
        this.f29886h3 = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public void requestLayout() {
        if (this.f29886h3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f29885g3 = i11;
        super.setPadding(i10, i11 + this.f29884f3, i12, i13);
    }
}
