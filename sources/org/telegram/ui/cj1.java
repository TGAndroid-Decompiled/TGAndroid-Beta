package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class cj1 extends View {
    public final Paint f34961a;
    public final org.telegram.ui.Components.m9 f34962b;
    public org.telegram.ui.Components.h11 f34963c;

    public cj1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f34961a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9(this, false);
        this.f34962b = m9Var;
        m9Var.f27318p = AndroidUtilities.dp(100.0f);
        m9Var.f27317o = AndroidUtilities.dp(30.0f);
        m9Var.f27325x = false;
        m9Var.f27321s = AndroidUtilities.dp(24.0f);
        m9Var.j(AndroidUtilities.dp(18.0f));
        m9Var.f27322t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f34963c == null) {
            return;
        }
        org.telegram.ui.Components.m9 m9Var = this.f34962b;
        float e = m9Var.e() + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(7.0f) + this.f34963c.f25473c + AndroidUtilities.dp(13.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - e) / 2.0f, 0.0f, (getWidth() + e) / 2.0f, getHeight());
        float dp = AndroidUtilities.dp(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, dp, dp, this.f34961a);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(4.0f), 0.0f);
        m9Var.i(canvas);
        canvas.translate(m9Var.A + AndroidUtilities.dp(7.0f), 0.0f);
        this.f34963c.c(0.0f, dp, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(30.0f));
    }
}
