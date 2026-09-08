package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class p2 extends View {
    public final q2 f39418a;

    public p2(q2 q2Var, Context context) {
        super(context);
        this.f39418a = q2Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        q2 q2Var = this.f39418a;
        if (q2Var.d == null) {
            return;
        }
        int b10 = q2Var.f39699b.b();
        int dp2 = AndroidUtilities.dp(4.0f) + org.telegram.messenger.w1.D(6.0f, b10 - 1, AndroidUtilities.dp(7.0f) * b10);
        float f7 = q2Var.v + q2Var.f39705s;
        if (dp2 < getMeasuredWidth()) {
            dp = (getMeasuredWidth() - dp2) / 2.0f;
        } else {
            int dp3 = AndroidUtilities.dp(13.0f);
            int measuredWidth = ((getMeasuredWidth() - AndroidUtilities.dp(8.0f)) / 2) / dp3;
            dp = AndroidUtilities.dp(4.0f) - (Utilities.clamp(f7 - measuredWidth, Math.max(0, (b10 - (measuredWidth * 2)) - 1), 0.0f) * dp3);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        for (int i10 = 0; i10 < q2Var.d.items.size(); i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f7));
            float dp4 = (AndroidUtilities.dp(1.0f) * max) + AndroidUtilities.dp(2.0f);
            i4.B1.setAlpha((int) ((max * 95.0f) + 160.0f));
            canvas.drawCircle(AndroidUtilities.dp(4.0f) + dp + (AndroidUtilities.dp(13.0f) * i10), getMeasuredHeight() / 2.0f, dp4, i4.B1);
        }
        canvas.restore();
    }
}
