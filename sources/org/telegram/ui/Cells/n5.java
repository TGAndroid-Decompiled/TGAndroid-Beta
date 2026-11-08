package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class n5 extends FrameLayout {
    public final int f29617a;
    public RectF f29618b;

    public n5(Context context, int i7) {
        super(context);
        this.f29617a = i7;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f29617a) {
            case 0:
                RectF rectF = this.f29618b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.f27940i2);
                return;
            default:
                RectF rectF2 = this.f29618b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.f27940i2);
                return;
        }
    }
}
