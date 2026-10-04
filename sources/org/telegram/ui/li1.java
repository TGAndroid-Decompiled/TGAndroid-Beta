package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class li1 extends View {
    public final Paint f38275a;
    public final org.telegram.ui.Components.j9 f38276b;
    public org.telegram.ui.Components.e11 f38277c;

    public li1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f38275a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9(this, false);
        this.f38276b = j9Var;
        j9Var.f27674p = AndroidUtilities.dp(100.0f);
        j9Var.f27673o = AndroidUtilities.dp(30.0f);
        j9Var.f27681x = false;
        j9Var.f27677s = AndroidUtilities.dp(24.0f);
        j9Var.j(AndroidUtilities.dp(18.0f));
        j9Var.f27678t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f38277c == null) {
            return;
        }
        org.telegram.ui.Components.j9 j9Var = this.f38276b;
        float e7 = j9Var.e() + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(7.0f) + this.f38277c.f25879c + AndroidUtilities.dp(13.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - e7) / 2.0f, 0.0f, (getWidth() + e7) / 2.0f, getHeight());
        float dp = AndroidUtilities.dp(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, dp, dp, this.f38275a);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(4.0f), 0.0f);
        j9Var.i(canvas);
        canvas.translate(j9Var.A + AndroidUtilities.dp(7.0f), 0.0f);
        this.f38277c.c(0.0f, dp, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(30.0f));
    }
}
