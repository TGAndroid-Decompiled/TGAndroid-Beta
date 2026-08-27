package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class kh1 extends View {

    public final Paint f39762a;

    public final org.telegram.ui.Components.a9 f39763b;

    public org.telegram.ui.Components.pz0 f39764c;

    public kh1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f39762a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9(this, false);
        this.f39763b = a9Var;
        a9Var.f26675p = AndroidUtilities.dp(100.0f);
        a9Var.f26674o = AndroidUtilities.dp(30.0f);
        a9Var.f26682x = false;
        a9Var.f26678s = AndroidUtilities.dp(24.0f);
        a9Var.j(AndroidUtilities.dp(18.0f));
        a9Var.f26679t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f39764c == null) {
            return;
        }
        float fDp = AndroidUtilities.dp(4.0f);
        org.telegram.ui.Components.a9 a9Var = this.f39763b;
        float fE = a9Var.e() + fDp + AndroidUtilities.dp(7.0f) + this.f39764c.f31697c + AndroidUtilities.dp(13.0f);
        float fDp2 = AndroidUtilities.dp(30.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - fE) / 2.0f, 0.0f, (getWidth() + fE) / 2.0f, getHeight());
        float f10 = fDp2 / 2.0f;
        canvas.drawRoundRect(rectF, f10, f10, this.f39762a);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(4.0f), 0.0f);
        a9Var.i(canvas);
        canvas.translate(a9Var.A + AndroidUtilities.dp(7.0f), 0.0f);
        this.f39764c.c(0.0f, f10, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(30.0f));
    }
}
