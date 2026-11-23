package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class gc1 extends View {
    public final Paint f48048a;
    public final org.telegram.ui.Components.d9 f48049b;
    public org.telegram.ui.Components.xy0 f48050c;

    public gc1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f48048a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.d9 d9Var = new org.telegram.ui.Components.d9(this, false);
        this.f48049b = d9Var;
        d9Var.f34437p = org.telegram.messenger.g0.L(100.0f);
        d9Var.f34436o = org.telegram.messenger.g0.L(30.0f);
        d9Var.f34444x = false;
        d9Var.f34440s = org.telegram.messenger.g0.L(24.0f);
        d9Var.h(org.telegram.messenger.g0.L(18.0f));
        d9Var.f34441t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f48050c == null) {
            return;
        }
        org.telegram.ui.Components.d9 d9Var = this.f48049b;
        float c10 = d9Var.c() + org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(7.0f) + this.f48050c.f42247c + org.telegram.messenger.g0.L(13.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - c10) / 2.0f, 0.0f, (getWidth() + c10) / 2.0f, getHeight());
        float L = org.telegram.messenger.g0.L(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, L, L, this.f48048a);
        canvas.save();
        canvas.translate(rectF.left + org.telegram.messenger.g0.L(4.0f), 0.0f);
        d9Var.g(canvas);
        canvas.translate(d9Var.A + org.telegram.messenger.g0.L(7.0f), 0.0f);
        this.f48050c.c(0.0f, L, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(30.0f));
    }
}
