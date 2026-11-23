package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
public final class gc extends View {
    public final Paint f47980a;
    public final Paint f47981b;
    public final Paint f47982c;
    public final Paint d;
    public final Path f47983e;
    public final Path f47984f;
    public boolean h;
    public boolean f47985n;
    public final org.telegram.ui.Components.mc f47986r;
    public boolean f47987s;
    public final org.telegram.ui.Components.d6 f47988w;
    public final hc f47989x;

    public gc(hc hcVar, Context context) {
        super(context);
        this.f47989x = hcVar;
        Paint paint = new Paint(1);
        this.f47980a = paint;
        this.f47981b = new Paint(1);
        this.f47982c = new Paint(1);
        this.d = new Paint(1);
        this.f47983e = new Path();
        this.f47984f = new Path();
        this.f47986r = new org.telegram.ui.Components.mc(this);
        this.f47988w = new org.telegram.ui.Components.d6(this, 0L, 320L, org.telegram.ui.Components.nr.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(org.telegram.messenger.cp r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gc.a(org.telegram.messenger.cp):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a10 = this.f47986r.a(0.05f);
        canvas.scale(a10, a10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.f47983e);
        canvas.drawPaint(this.f47981b);
        if (this.h) {
            canvas.drawPath(this.f47984f, this.f47982c);
        }
        canvas.restore();
        if (this.f47985n) {
            canvas.save();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((getMeasuredWidth() - org.telegram.messenger.g0.L(12.4f)) / 2.0f, (getMeasuredHeight() - org.telegram.messenger.g0.L(12.4f)) / 2.0f, (org.telegram.messenger.g0.L(12.4f) + getMeasuredWidth()) / 2.0f, (org.telegram.messenger.g0.L(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), this.d);
            canvas.restore();
        }
        float d = this.f47988w.d(this.f47987s);
        if (d > 0.0f) {
            float N = org.telegram.messenger.g0.N(2.0f);
            Paint paint = this.f47980a;
            paint.setStrokeWidth(N);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.T1((paint.getStrokeWidth() * 0.5f) + org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f) - (paint.getStrokeWidth() * 2.0f), d), paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f));
        Path path = this.f47983e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.L(20.0f), Path.Direction.CW);
        Path path2 = this.f47984f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i7) {
        this.f47980a.setColor(i7);
    }

    @Override
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f47986r.c(z10);
    }
}
