package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class p5 extends FrameLayout {
    public final int f31248a;
    public RectF f31249b;

    public p5(Context context, int i7) {
        super(context);
        this.f31248a = i7;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f31248a) {
            case 0:
                RectF rectF = this.f31249b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.m6.f29469i2);
                return;
            default:
                RectF rectF2 = this.f31249b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.m6.f29469i2);
                return;
        }
    }
}
