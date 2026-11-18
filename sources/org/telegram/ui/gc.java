package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
public final class gc extends View {
    public final Paint f47959a;
    public final Paint f47960b;
    public final Paint f47961c;
    public final Paint d;
    public final Path f47962e;
    public final Path f47963f;
    public boolean h;
    public boolean f47964n;
    public final org.telegram.ui.Components.mc f47965r;
    public boolean f47966s;
    public final org.telegram.ui.Components.c6 f47967w;
    public final hc f47968x;

    public gc(hc hcVar, Context context) {
        super(context);
        this.f47968x = hcVar;
        Paint paint = new Paint(1);
        this.f47959a = paint;
        this.f47960b = new Paint(1);
        this.f47961c = new Paint(1);
        this.d = new Paint(1);
        this.f47962e = new Path();
        this.f47963f = new Path();
        this.f47965r = new org.telegram.ui.Components.mc(this);
        this.f47967w = new org.telegram.ui.Components.c6(this, 0L, 320L, org.telegram.ui.Components.lr.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(org.telegram.messenger.bp r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gc.a(org.telegram.messenger.bp):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a10 = this.f47965r.a(0.05f);
        canvas.scale(a10, a10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.f47962e);
        canvas.drawPaint(this.f47960b);
        if (this.h) {
            canvas.drawPath(this.f47963f, this.f47961c);
        }
        canvas.restore();
        if (this.f47964n) {
            canvas.save();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((getMeasuredWidth() - org.telegram.messenger.g0.L(12.4f)) / 2.0f, (getMeasuredHeight() - org.telegram.messenger.g0.L(12.4f)) / 2.0f, (org.telegram.messenger.g0.L(12.4f) + getMeasuredWidth()) / 2.0f, (org.telegram.messenger.g0.L(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), this.d);
            canvas.restore();
        }
        float d = this.f47967w.d(this.f47966s);
        if (d > 0.0f) {
            float N = org.telegram.messenger.g0.N(2.0f);
            Paint paint = this.f47959a;
            paint.setStrokeWidth(N);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.T1((paint.getStrokeWidth() * 0.5f) + org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f) - (paint.getStrokeWidth() * 2.0f), d), paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f));
        Path path = this.f47962e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.L(20.0f), Path.Direction.CW);
        Path path2 = this.f47963f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i7) {
        this.f47959a.setColor(i7);
    }

    @Override
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f47965r.c(z10);
    }
}
