package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
public final class u3 extends org.telegram.ui.Components.j6 {
    public final int f25733s;

    public u3(Context context, boolean z10, boolean z11, boolean z12, int i9) {
        super(context, z10, z11, z12);
        this.f25733s = i9;
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        switch (this.f25733s) {
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
        switch (this.f25733s) {
            case 4:
                if (hg.h0.b(this)) {
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
        switch (this.f25733s) {
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
    public void onMeasure(int i9, int i10) {
        switch (this.f25733s) {
            case 3:
                super.onMeasure(i9, i10);
                setPivotX(getMeasuredWidth());
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public void invalidate(int i9, int i10, int i11, int i12) {
        switch (this.f25733s) {
            case 4:
                if (hg.h0.b(this)) {
                    return;
                }
                super.invalidate(i9, i10, i11, i12);
                return;
            default:
                super.invalidate(i9, i10, i11, i12);
                return;
        }
    }
}
