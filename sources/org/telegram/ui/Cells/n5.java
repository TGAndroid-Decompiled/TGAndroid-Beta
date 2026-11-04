package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class n5 extends FrameLayout {
    public final int f29674a;
    public RectF f29675b;

    public n5(Context context, int i3) {
        super(context);
        this.f29674a = i3;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f29674a) {
            case 0:
                RectF rectF = this.f29675b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.f27969i2);
                return;
            default:
                RectF rectF2 = this.f29675b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.f27969i2);
                return;
        }
    }
}
