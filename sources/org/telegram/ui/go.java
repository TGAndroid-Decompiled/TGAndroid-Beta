package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class go extends org.telegram.ui.Cells.p8 {
    public go(Context context) {
        super(context);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i9;
        if (LocaleController.isRTL) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(20.0f);
        }
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (LocaleController.isRTL) {
            i9 = AndroidUtilities.dp(20.0f);
        } else {
            i9 = 0;
        }
        canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
    }
}
