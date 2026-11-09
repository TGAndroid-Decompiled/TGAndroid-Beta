package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
public final class hc extends View {
    public final Paint f46277a;
    public final Paint f46278b;
    public final Paint f46279c;
    public final Paint d;
    public final Path f46280e;
    public final Path f46281f;
    public boolean h;
    public boolean f46282n;
    public final org.telegram.ui.Components.ic f46283r;
    public boolean f46284s;
    public final org.telegram.ui.Components.w5 f46285w;
    public final ic f46286x;

    public hc(ic icVar, Context context) {
        super(context);
        this.f46286x = icVar;
        Paint paint = new Paint(1);
        this.f46277a = paint;
        this.f46278b = new Paint(1);
        this.f46279c = new Paint(1);
        this.d = new Paint(1);
        this.f46280e = new Path();
        this.f46281f = new Path();
        this.f46283r = new org.telegram.ui.Components.ic(this);
        this.f46285w = new org.telegram.ui.Components.w5(this, 0L, 320L, org.telegram.ui.Components.xq.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(org.telegram.messenger.fp r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hc.a(org.telegram.messenger.fp):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a10 = this.f46283r.a(0.05f);
        canvas.scale(a10, a10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.f46280e);
        canvas.drawPaint(this.f46278b);
        if (this.h) {
            canvas.drawPath(this.f46281f, this.f46279c);
        }
        canvas.restore();
        if (this.f46282n) {
            canvas.save();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((getMeasuredWidth() - org.telegram.messenger.g0.L(12.4f)) / 2.0f, (getMeasuredHeight() - org.telegram.messenger.g0.L(12.4f)) / 2.0f, (org.telegram.messenger.g0.L(12.4f) + getMeasuredWidth()) / 2.0f, (org.telegram.messenger.g0.L(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), this.d);
            canvas.restore();
        }
        float d = this.f46285w.d(this.f46284s);
        if (d > 0.0f) {
            float N = org.telegram.messenger.g0.N(2.0f);
            Paint paint = this.f46277a;
            paint.setStrokeWidth(N);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.T1((paint.getStrokeWidth() * 0.5f) + org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f) - (paint.getStrokeWidth() * 2.0f), d), paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f));
        Path path = this.f46280e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.L(20.0f), Path.Direction.CW);
        Path path2 = this.f46281f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i7) {
        this.f46277a.setColor(i7);
    }

    @Override
    public final void setPressed(boolean z9) {
        super.setPressed(z9);
        this.f46283r.c(z9);
    }
}
