package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class n5 extends FrameLayout {
    public final int f29621a;
    public RectF f29622b;

    public n5(Context context, int i7) {
        super(context);
        this.f29621a = i7;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f29621a) {
            case 0:
                RectF rectF = this.f29622b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.l6.f27953i2);
                return;
            default:
                RectF rectF2 = this.f29622b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.l6.f27953i2);
                return;
        }
    }
}
