package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class r01 extends FrameLayout {
    public final Paint f37521a;
    public final RectF f37522b;
    public final w5 f37523c;
    public final String d;
    public final t01 f37524e;

    public r01(t01 t01Var, Context context) {
        super(context);
        this.f37524e = t01Var;
        this.f37521a = new Paint(1);
        this.f37522b = new RectF();
        this.f37523c = new w5(this, 0L, 260L, xq.h);
        this.d = "";
        setWillNotDraw(false);
        c8.ka.a(this);
        addView(new l9(context), c8.ha.d(20, 20.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e10 = this.f37523c.e(false, 0.0f);
        int i7 = org.telegram.ui.ActionBar.l6.qk;
        t01 t01Var = this.f37524e;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i7, t01Var.f38214e);
        float width = getWidth() - org.telegram.messenger.g0.L(3.0f);
        int height = getHeight();
        RectF rectF = this.f37522b;
        rectF.set(org.telegram.messenger.g0.L(3.0f), (getHeight() - org.telegram.messenger.g0.L(28.0f)) / 2.0f, width, (org.telegram.messenger.g0.L(28.0f) + height) / 2.0f);
        int f10 = i0.a.f(e10, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.O5, t01Var.f38214e), w02);
        Paint paint = this.f37521a;
        paint.setColor(f10);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
        t01Var.f38218g0.setColor(i0.a.f(e10, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G6, t01Var.f38214e), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.tk, t01Var.f38214e)));
        float centerY = rectF.centerY();
        float descent = t01Var.f38218g0.descent();
        canvas.drawText(this.d, org.telegram.messenger.g0.L(35.0f), centerY - ((t01Var.f38218g0.ascent() + descent) / 2.0f), t01Var.f38218g0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(org.telegram.messenger.camera.q.B(13.0f, org.telegram.messenger.g0.L(35.0f) + ((int) Math.ceil(this.f37524e.f38218g0.measureText(this.d))), 1073741824), i10);
    }
}
