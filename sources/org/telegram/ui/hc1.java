package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class hc1 extends View {
    public final Paint f46289a;
    public final org.telegram.ui.Components.y8 f46290b;
    public org.telegram.ui.Components.ny0 f46291c;

    public hc1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f46289a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8(this, false);
        this.f46290b = y8Var;
        y8Var.f40657p = org.telegram.messenger.g0.L(100.0f);
        y8Var.f40656o = org.telegram.messenger.g0.L(30.0f);
        y8Var.f40664x = false;
        y8Var.f40660s = org.telegram.messenger.g0.L(24.0f);
        y8Var.h(org.telegram.messenger.g0.L(18.0f));
        y8Var.f40661t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f46291c == null) {
            return;
        }
        org.telegram.ui.Components.y8 y8Var = this.f46290b;
        float c10 = y8Var.c() + org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(7.0f) + this.f46291c.f36541c + org.telegram.messenger.g0.L(13.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - c10) / 2.0f, 0.0f, (getWidth() + c10) / 2.0f, getHeight());
        float L = org.telegram.messenger.g0.L(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, L, L, this.f46289a);
        canvas.save();
        canvas.translate(rectF.left + org.telegram.messenger.g0.L(4.0f), 0.0f);
        y8Var.g(canvas);
        canvas.translate(y8Var.A + org.telegram.messenger.g0.L(7.0f), 0.0f);
        this.f46291c.c(0.0f, L, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(30.0f));
    }
}
