package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class dc1 extends View {
    public final Paint f45049a;
    public final org.telegram.ui.Components.y8 f45050b;
    public org.telegram.ui.Components.ly0 f45051c;

    public dc1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f45049a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8(this, false);
        this.f45050b = y8Var;
        y8Var.f40577p = org.telegram.messenger.g0.L(100.0f);
        y8Var.f40576o = org.telegram.messenger.g0.L(30.0f);
        y8Var.f40584x = false;
        y8Var.f40580s = org.telegram.messenger.g0.L(24.0f);
        y8Var.h(org.telegram.messenger.g0.L(18.0f));
        y8Var.f40581t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f45051c == null) {
            return;
        }
        org.telegram.ui.Components.y8 y8Var = this.f45050b;
        float c10 = y8Var.c() + org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(7.0f) + this.f45051c.f35782c + org.telegram.messenger.g0.L(13.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - c10) / 2.0f, 0.0f, (getWidth() + c10) / 2.0f, getHeight());
        float L = org.telegram.messenger.g0.L(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, L, L, this.f45049a);
        canvas.save();
        canvas.translate(rectF.left + org.telegram.messenger.g0.L(4.0f), 0.0f);
        y8Var.g(canvas);
        canvas.translate(y8Var.A + org.telegram.messenger.g0.L(7.0f), 0.0f);
        this.f45051c.c(0.0f, L, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(30.0f));
    }
}
