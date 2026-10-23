package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class q2 extends View {
    public final r2 f40610a;

    public q2(r2 r2Var, Context context) {
        super(context);
        this.f40610a = r2Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        r2 r2Var = this.f40610a;
        if (r2Var.e == null) {
            return;
        }
        int b10 = r2Var.f40970c.b();
        int dp2 = AndroidUtilities.dp(4.0f) + org.telegram.messenger.v0.D(6.0f, b10 - 1, AndroidUtilities.dp(7.0f) * b10);
        float f7 = r2Var.f40975w + r2Var.v;
        if (dp2 < getMeasuredWidth()) {
            dp = (getMeasuredWidth() - dp2) / 2.0f;
        } else {
            int dp3 = AndroidUtilities.dp(13.0f);
            int measuredWidth = ((getMeasuredWidth() - AndroidUtilities.dp(8.0f)) / 2) / dp3;
            dp = AndroidUtilities.dp(4.0f) - (Utilities.clamp(f7 - measuredWidth, Math.max(0, (b10 - (measuredWidth * 2)) - 1), 0.0f) * dp3);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        for (int i10 = 0; i10 < r2Var.e.items.size(); i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f7));
            float dp4 = (AndroidUtilities.dp(1.0f) * max) + AndroidUtilities.dp(2.0f);
            k4.C1.setAlpha((int) ((max * 95.0f) + 160.0f));
            canvas.drawCircle(AndroidUtilities.dp(4.0f) + dp + (AndroidUtilities.dp(13.0f) * i10), getMeasuredHeight() / 2.0f, dp4, k4.C1);
        }
        canvas.restore();
    }
}
