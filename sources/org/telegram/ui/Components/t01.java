package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class t01 extends FrameLayout {
    public final Paint f39476a;
    public final RectF f39477b;
    public final u5 f39478c;
    public final String d;
    public final v01 f39479e;

    public t01(v01 v01Var, Context context) {
        super(context);
        this.f39479e = v01Var;
        this.f39476a = new Paint(1);
        this.f39477b = new RectF();
        this.f39478c = new u5(this, 0L, 260L, er.h);
        this.d = "";
        setWillNotDraw(false);
        c8.na.a(this);
        addView(new i9(context), c8.ja.d(20, 20.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e10 = this.f39478c.e(false, 0.0f);
        int i7 = org.telegram.ui.ActionBar.j6.tk;
        v01 v01Var = this.f39479e;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, v01Var.f40215e);
        float width = getWidth() - org.telegram.messenger.g0.L(3.0f);
        int height = getHeight();
        RectF rectF = this.f39477b;
        rectF.set(org.telegram.messenger.g0.L(3.0f), (getHeight() - org.telegram.messenger.g0.L(28.0f)) / 2.0f, width, (org.telegram.messenger.g0.L(28.0f) + height) / 2.0f);
        int f10 = i0.a.f(e10, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.O5, v01Var.f40215e), w02);
        Paint paint = this.f39476a;
        paint.setColor(f10);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
        v01Var.f40220h0.setColor(i0.a.f(e10, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, v01Var.f40215e), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.wk, v01Var.f40215e)));
        float centerY = rectF.centerY();
        float descent = v01Var.f40220h0.descent();
        canvas.drawText(this.d, org.telegram.messenger.g0.L(35.0f), centerY - ((v01Var.f40220h0.ascent() + descent) / 2.0f), v01Var.f40220h0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(org.telegram.messenger.i20.B(13.0f, org.telegram.messenger.g0.L(35.0f) + ((int) Math.ceil(this.f39479e.f40220h0.measureText(this.d))), 1073741824), i10);
    }
}
