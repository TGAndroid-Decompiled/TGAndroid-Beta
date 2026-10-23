package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gh1 extends View {
    public final Paint f37336a;
    public final org.telegram.ui.Components.j9 f37337b;
    public org.telegram.ui.Components.f11 f37338c;

    public gh1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f37336a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9(this, false);
        this.f37337b = j9Var;
        j9Var.f27464p = AndroidUtilities.dp(100.0f);
        j9Var.f27463o = AndroidUtilities.dp(30.0f);
        j9Var.f27471x = false;
        j9Var.f27467s = AndroidUtilities.dp(24.0f);
        j9Var.j(AndroidUtilities.dp(18.0f));
        j9Var.f27468t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37338c == null) {
            return;
        }
        org.telegram.ui.Components.j9 j9Var = this.f37337b;
        float e = j9Var.e() + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(7.0f) + this.f37338c.f26025c + AndroidUtilities.dp(13.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - e) / 2.0f, 0.0f, (getWidth() + e) / 2.0f, getHeight());
        float dp = AndroidUtilities.dp(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, dp, dp, this.f37336a);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(4.0f), 0.0f);
        j9Var.i(canvas);
        canvas.translate(j9Var.A + AndroidUtilities.dp(7.0f), 0.0f);
        this.f37338c.c(0.0f, dp, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(30.0f));
    }
}
