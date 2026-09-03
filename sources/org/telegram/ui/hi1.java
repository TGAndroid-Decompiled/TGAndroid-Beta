package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class hi1 extends View {
    public final Paint f34681a;
    public final org.telegram.ui.Components.c9 f34682b;
    public org.telegram.ui.Components.k01 f34683c;

    public hi1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f34681a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.c9 c9Var = new org.telegram.ui.Components.c9(this, false);
        this.f34682b = c9Var;
        c9Var.f23887p = AndroidUtilities.dp(100.0f);
        c9Var.f23886o = AndroidUtilities.dp(30.0f);
        c9Var.f23894x = false;
        c9Var.f23890s = AndroidUtilities.dp(24.0f);
        c9Var.j(AndroidUtilities.dp(18.0f));
        c9Var.f23891t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f34683c == null) {
            return;
        }
        org.telegram.ui.Components.c9 c9Var = this.f34682b;
        float e = c9Var.e() + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(7.0f) + this.f34683c.f26124c + AndroidUtilities.dp(13.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - e) / 2.0f, 0.0f, (getWidth() + e) / 2.0f, getHeight());
        float dp = AndroidUtilities.dp(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, dp, dp, this.f34681a);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(4.0f), 0.0f);
        c9Var.i(canvas);
        canvas.translate(c9Var.A + AndroidUtilities.dp(7.0f), 0.0f);
        this.f34683c.c(0.0f, dp, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(30.0f));
    }
}
