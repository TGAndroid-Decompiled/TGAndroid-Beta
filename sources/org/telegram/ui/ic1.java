package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class ic1 extends View {
    public final Paint f46615a;
    public final org.telegram.ui.Components.x8 f46616b;
    public org.telegram.ui.Components.my0 f46617c;

    public ic1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f46615a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.x8 x8Var = new org.telegram.ui.Components.x8(this, false);
        this.f46616b = x8Var;
        x8Var.f40244p = org.telegram.messenger.g0.L(100.0f);
        x8Var.f40243o = org.telegram.messenger.g0.L(30.0f);
        x8Var.f40251x = false;
        x8Var.f40247s = org.telegram.messenger.g0.L(24.0f);
        x8Var.h(org.telegram.messenger.g0.L(18.0f));
        x8Var.f40248t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f46617c == null) {
            return;
        }
        org.telegram.ui.Components.x8 x8Var = this.f46616b;
        float c10 = x8Var.c() + org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(7.0f) + this.f46617c.f36133c + org.telegram.messenger.g0.L(13.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - c10) / 2.0f, 0.0f, (getWidth() + c10) / 2.0f, getHeight());
        float L = org.telegram.messenger.g0.L(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, L, L, this.f46615a);
        canvas.save();
        canvas.translate(rectF.left + org.telegram.messenger.g0.L(4.0f), 0.0f);
        x8Var.g(canvas);
        canvas.translate(x8Var.A + org.telegram.messenger.g0.L(7.0f), 0.0f);
        this.f46617c.c(0.0f, L, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(30.0f));
    }
}
