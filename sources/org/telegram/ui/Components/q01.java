package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class q01 extends FrameLayout {
    public final Paint f37119a;
    public final RectF f37120b;
    public final w5 f37121c;
    public final String d;
    public final s01 f37122e;

    public q01(s01 s01Var, Context context) {
        super(context);
        this.f37122e = s01Var;
        this.f37119a = new Paint(1);
        this.f37120b = new RectF();
        this.f37121c = new w5(this, 0L, 260L, xq.h);
        this.d = "";
        setWillNotDraw(false);
        c8.ka.a(this);
        addView(new l9(context), c8.ha.d(20, 20.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e10 = this.f37121c.e(false, 0.0f);
        int i7 = org.telegram.ui.ActionBar.k6.qk;
        s01 s01Var = this.f37122e;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, s01Var.f37820e);
        float width = getWidth() - org.telegram.messenger.g0.L(3.0f);
        int height = getHeight();
        RectF rectF = this.f37120b;
        rectF.set(org.telegram.messenger.g0.L(3.0f), (getHeight() - org.telegram.messenger.g0.L(28.0f)) / 2.0f, width, (org.telegram.messenger.g0.L(28.0f) + height) / 2.0f);
        int f10 = i0.a.f(e10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.O5, s01Var.f37820e), w02);
        Paint paint = this.f37119a;
        paint.setColor(f10);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
        s01Var.f37824g0.setColor(i0.a.f(e10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, s01Var.f37820e), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tk, s01Var.f37820e)));
        float centerY = rectF.centerY();
        float descent = s01Var.f37824g0.descent();
        canvas.drawText(this.d, org.telegram.messenger.g0.L(35.0f), centerY - ((s01Var.f37824g0.ascent() + descent) / 2.0f), s01Var.f37824g0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(org.telegram.messenger.camera.q.B(13.0f, org.telegram.messenger.g0.L(35.0f) + ((int) Math.ceil(this.f37122e.f37824g0.measureText(this.d))), 1073741824), i10);
    }
}
