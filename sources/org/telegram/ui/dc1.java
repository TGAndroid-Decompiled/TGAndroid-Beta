package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class dc1 extends View {
    public final Paint f46339a;
    public final org.telegram.ui.Components.v8 f46340b;
    public org.telegram.ui.Components.oy0 f46341c;

    public dc1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f46339a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8(this, false);
        this.f46340b = v8Var;
        v8Var.f40336p = org.telegram.messenger.g0.L(100.0f);
        v8Var.f40335o = org.telegram.messenger.g0.L(30.0f);
        v8Var.f40343x = false;
        v8Var.f40339s = org.telegram.messenger.g0.L(24.0f);
        v8Var.h(org.telegram.messenger.g0.L(18.0f));
        v8Var.f40340t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f46341c == null) {
            return;
        }
        org.telegram.ui.Components.v8 v8Var = this.f46340b;
        float c10 = v8Var.c() + org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(7.0f) + this.f46341c.f38103c + org.telegram.messenger.g0.L(13.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - c10) / 2.0f, 0.0f, (getWidth() + c10) / 2.0f, getHeight());
        float L = org.telegram.messenger.g0.L(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, L, L, this.f46339a);
        canvas.save();
        canvas.translate(rectF.left + org.telegram.messenger.g0.L(4.0f), 0.0f);
        v8Var.g(canvas);
        canvas.translate(v8Var.A + org.telegram.messenger.g0.L(7.0f), 0.0f);
        this.f46341c.c(0.0f, L, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(30.0f));
    }
}
