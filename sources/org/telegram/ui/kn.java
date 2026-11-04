package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class kn extends org.telegram.ui.Cells.l8 {
    public kn(Context context) {
        super(context);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i3;
        if (org.telegram.messenger.bd.f21784a0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(20.0f);
        }
        float f10 = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = org.telegram.messenger.g0.L(20.0f);
        } else {
            i3 = 0;
        }
        canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
    }
}
