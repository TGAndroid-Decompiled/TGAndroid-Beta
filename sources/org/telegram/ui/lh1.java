package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class lh1 extends View {
    public final Paint f40142a;
    public final org.telegram.ui.Components.b9 f40143b;
    public org.telegram.ui.Components.nz0 f40144c;

    public lh1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f40142a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9(this, false);
        this.f40143b = b9Var;
        b9Var.f27087p = AndroidUtilities.dp(100.0f);
        b9Var.f27086o = AndroidUtilities.dp(30.0f);
        b9Var.f27094x = false;
        b9Var.f27090s = AndroidUtilities.dp(24.0f);
        b9Var.j(AndroidUtilities.dp(18.0f));
        b9Var.f27091t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40144c == null) {
            return;
        }
        org.telegram.ui.Components.b9 b9Var = this.f40143b;
        float e10 = b9Var.e() + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(7.0f) + this.f40144c.f31223c + AndroidUtilities.dp(13.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - e10) / 2.0f, 0.0f, (getWidth() + e10) / 2.0f, getHeight());
        float dp = AndroidUtilities.dp(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, dp, dp, this.f40142a);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(4.0f), 0.0f);
        b9Var.i(canvas);
        canvas.translate(b9Var.A + AndroidUtilities.dp(7.0f), 0.0f);
        this.f40144c.c(0.0f, dp, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(30.0f));
    }
}
