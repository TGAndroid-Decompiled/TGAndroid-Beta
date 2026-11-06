package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.Button;
public final class w3 extends org.telegram.ui.Components.j6 {
    public final int f30720s;

    public w3(Context context, boolean z9, boolean z10, boolean z11, int i7) {
        super(context, z9, z10, z11);
        this.f30720s = i7;
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        switch (this.f30720s) {
            case 0:
                return Button.class.getName();
            case 1:
                return Button.class.getName();
            default:
                return super.getAccessibilityClassName();
        }
    }

    @Override
    public int getBaseline() {
        switch (this.f30720s) {
            case 5:
                return Math.round((getHeight() - getDrawable().f34511e) / 2.0f) - getPaint().getFontMetricsInt().ascent;
            default:
                return super.getBaseline();
        }
    }

    @Override
    public void invalidate() {
        switch (this.f30720s) {
            case 4:
                if (ch.e0.b(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f30720s) {
            case 2:
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.L(17.0f), 0.0f);
                super.onDraw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f30720s) {
            case 3:
                super.onMeasure(i7, i10);
                setPivotX(getMeasuredWidth());
                return;
            case 4:
            default:
                super.onMeasure(i7, i10);
                return;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f22544q.x, Integer.MIN_VALUE), i10);
                setMeasuredDimension(View.resolveSize((int) Math.ceil(getDrawable().c()), i7), getMeasuredHeight());
                return;
        }
    }

    public w3(Context context, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(context, z9, z10, z11, z12, z13);
        this.f30720s = 5;
    }

    @Override
    public void invalidate(int i7, int i10, int i11, int i12) {
        switch (this.f30720s) {
            case 4:
                if (ch.e0.b(this)) {
                    return;
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            default:
                super.invalidate(i7, i10, i11, i12);
                return;
        }
    }
}
