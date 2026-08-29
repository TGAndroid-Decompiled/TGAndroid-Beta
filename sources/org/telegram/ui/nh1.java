package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class nh1 extends View {
    public final Paint f40810a;
    public final org.telegram.ui.Components.g9 f40811b;
    public org.telegram.ui.Components.zz0 f40812c;

    public nh1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f40810a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(this, false);
        this.f40811b = g9Var;
        g9Var.f28836p = AndroidUtilities.dp(100.0f);
        g9Var.f28835o = AndroidUtilities.dp(30.0f);
        g9Var.f28843x = false;
        g9Var.f28839s = AndroidUtilities.dp(24.0f);
        g9Var.j(AndroidUtilities.dp(18.0f));
        g9Var.f28840t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40812c == null) {
            return;
        }
        org.telegram.ui.Components.g9 g9Var = this.f40811b;
        float e10 = g9Var.e() + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(7.0f) + this.f40812c.f35462c + AndroidUtilities.dp(13.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - e10) / 2.0f, 0.0f, (getWidth() + e10) / 2.0f, getHeight());
        float dp = AndroidUtilities.dp(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, dp, dp, this.f40810a);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(4.0f), 0.0f);
        g9Var.i(canvas);
        canvas.translate(g9Var.A + AndroidUtilities.dp(7.0f), 0.0f);
        this.f40812c.c(0.0f, dp, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(30.0f));
    }
}
