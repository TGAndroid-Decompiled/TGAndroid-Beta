package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
public final class t3 extends org.telegram.ui.Components.k6 {
    public final int f22343s;

    public t3(Context context, boolean z4, boolean z10, boolean z11, int i10) {
        super(context, z4, z10, z11);
        this.f22343s = i10;
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        switch (this.f22343s) {
            case 0:
                return Button.class.getName();
            case 1:
                return Button.class.getName();
            default:
                return super.getAccessibilityClassName();
        }
    }

    @Override
    public void invalidate() {
        switch (this.f22343s) {
            case 4:
                if (mg.g0.b(this)) {
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
        switch (this.f22343s) {
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
        switch (this.f22343s) {
            case 3:
                super.onMeasure(i10, i11);
                setPivotX(getMeasuredWidth());
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f22343s) {
            case 4:
                if (mg.g0.b(this)) {
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
