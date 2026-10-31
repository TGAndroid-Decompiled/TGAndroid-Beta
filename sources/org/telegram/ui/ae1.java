package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class ae1 extends View {
    public final Paint f35635a;
    public final org.telegram.ui.Components.t8 f35636b;
    public org.telegram.ui.Components.qz0 f35637c;

    public ae1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f35635a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8(this, false);
        this.f35636b = t8Var;
        t8Var.f30491p = org.telegram.messenger.i0.L(100.0f);
        t8Var.f30490o = org.telegram.messenger.i0.L(30.0f);
        t8Var.f30498x = false;
        t8Var.f30494s = org.telegram.messenger.i0.L(24.0f);
        t8Var.h(org.telegram.messenger.i0.L(18.0f));
        t8Var.f30495t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35637c == null) {
            return;
        }
        org.telegram.ui.Components.t8 t8Var = this.f35636b;
        float c10 = t8Var.c() + org.telegram.messenger.i0.L(4.0f) + org.telegram.messenger.i0.L(7.0f) + this.f35637c.f29774c + org.telegram.messenger.i0.L(13.0f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set((getWidth() - c10) / 2.0f, 0.0f, (getWidth() + c10) / 2.0f, getHeight());
        float L = org.telegram.messenger.i0.L(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, L, L, this.f35635a);
        canvas.save();
        canvas.translate(rectF.left + org.telegram.messenger.i0.L(4.0f), 0.0f);
        t8Var.g(canvas);
        canvas.translate(t8Var.A + org.telegram.messenger.i0.L(7.0f), 0.0f);
        this.f35637c.c(0.0f, L, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(30.0f));
    }
}
