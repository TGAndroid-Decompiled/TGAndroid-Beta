package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class ec1 extends View {
    public final Paint f47503a;
    public final org.telegram.ui.Components.c9 f47504b;
    public org.telegram.ui.Components.wy0 f47505c;

    public ec1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f47503a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.c9 c9Var = new org.telegram.ui.Components.c9(this, false);
        this.f47504b = c9Var;
        c9Var.f33962p = org.telegram.messenger.g0.L(100.0f);
        c9Var.f33961o = org.telegram.messenger.g0.L(30.0f);
        c9Var.f33969x = false;
        c9Var.f33965s = org.telegram.messenger.g0.L(24.0f);
        c9Var.h(org.telegram.messenger.g0.L(18.0f));
        c9Var.f33966t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f47505c == null) {
            return;
        }
        org.telegram.ui.Components.c9 c9Var = this.f47504b;
        float c10 = c9Var.c() + org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(7.0f) + this.f47505c.f41763c + org.telegram.messenger.g0.L(13.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - c10) / 2.0f, 0.0f, (getWidth() + c10) / 2.0f, getHeight());
        float L = org.telegram.messenger.g0.L(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, L, L, this.f47503a);
        canvas.save();
        canvas.translate(rectF.left + org.telegram.messenger.g0.L(4.0f), 0.0f);
        c9Var.g(canvas);
        canvas.translate(c9Var.A + org.telegram.messenger.g0.L(7.0f), 0.0f);
        this.f47505c.c(0.0f, L, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(30.0f));
    }
}
