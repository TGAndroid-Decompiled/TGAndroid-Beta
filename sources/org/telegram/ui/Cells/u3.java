package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
public final class u3 extends org.telegram.ui.Components.r6 {
    public final int f23484s;

    public u3(Context context, boolean z10, boolean z11, boolean z12, int i10) {
        super(context, z10, z11, z12);
        this.f23484s = i10;
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        switch (this.f23484s) {
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
        switch (this.f23484s) {
            case 5:
                return Math.round((getHeight() - getDrawable().f30068e) / 2.0f) - getPaint().getFontMetricsInt().ascent;
            default:
                return super.getBaseline();
        }
    }

    @Override
    public void invalidate() {
        switch (this.f23484s) {
            case 4:
                if (zg.d0.b(this)) {
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
        switch (this.f23484s) {
            case 2:
                canvas.save();
                canvas.translate(AndroidUtilities.dp(17.0f), 0.0f);
                super.onDraw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f23484s) {
            case 3:
                super.onMeasure(i10, i11);
                setPivotX(getMeasuredWidth());
                return;
            case 4:
            default:
                super.onMeasure(i10, i11);
                return;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), i11);
                setMeasuredDimension(View.resolveSize((int) Math.ceil(getDrawable().c()), i10), getMeasuredHeight());
                return;
        }
    }

    public u3(Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(context, z10, z11, z12, z13, z14);
        this.f23484s = 5;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f23484s) {
            case 4:
                if (zg.d0.b(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
        }
    }
}
