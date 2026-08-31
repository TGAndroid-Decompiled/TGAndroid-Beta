package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class bi1 extends View {
    public final Paint f35532a;
    public final org.telegram.ui.Components.c9 f35533b;
    public org.telegram.ui.Components.l01 f35534c;

    public bi1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f35532a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.c9 c9Var = new org.telegram.ui.Components.c9(this, false);
        this.f35533b = c9Var;
        c9Var.f25877p = AndroidUtilities.dp(100.0f);
        c9Var.f25876o = AndroidUtilities.dp(30.0f);
        c9Var.f25884x = false;
        c9Var.f25880s = AndroidUtilities.dp(24.0f);
        c9Var.j(AndroidUtilities.dp(18.0f));
        c9Var.f25881t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35534c == null) {
            return;
        }
        org.telegram.ui.Components.c9 c9Var = this.f35533b;
        float e6 = c9Var.e() + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(7.0f) + this.f35534c.f28521c + AndroidUtilities.dp(13.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - e6) / 2.0f, 0.0f, (getWidth() + e6) / 2.0f, getHeight());
        float dp = AndroidUtilities.dp(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, dp, dp, this.f35532a);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(4.0f), 0.0f);
        c9Var.i(canvas);
        canvas.translate(c9Var.A + AndroidUtilities.dp(7.0f), 0.0f);
        this.f35534c.c(0.0f, dp, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(30.0f));
    }
}
