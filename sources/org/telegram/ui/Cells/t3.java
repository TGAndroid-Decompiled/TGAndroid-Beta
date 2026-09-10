package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
public final class t3 extends org.telegram.ui.Components.o6 {
    public final int f20429s;

    public t3(Context context, boolean z10, boolean z11, boolean z12, int i10) {
        super(context, z10, z11, z12);
        this.f20429s = i10;
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        switch (this.f20429s) {
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
        switch (this.f20429s) {
            case 4:
                if (yg.f0.b(this)) {
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
        switch (this.f20429s) {
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
        switch (this.f20429s) {
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
        switch (this.f20429s) {
            case 4:
                if (yg.f0.b(this)) {
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
