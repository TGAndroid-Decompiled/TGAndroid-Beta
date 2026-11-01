package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class s5 extends FrameLayout {
    public final int f23013a;
    public RectF f23014b;

    public s5(Context context, int i10) {
        super(context);
        this.f23013a = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f23013a) {
            case 0:
                RectF rectF = this.f23014b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.ui.ActionBar.t6.f21017i2);
                return;
            default:
                RectF rectF2 = this.f23014b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.ui.ActionBar.t6.f21017i2);
                return;
        }
    }
}
