package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
public final class gc extends View {
    public final Paint f48036a;
    public final Paint f48037b;
    public final Paint f48038c;
    public final Paint d;
    public final Path f48039e;
    public final Path f48040f;
    public boolean h;
    public boolean f48041n;
    public final org.telegram.ui.Components.mc f48042r;
    public boolean f48043s;
    public final org.telegram.ui.Components.d6 f48044w;
    public final hc f48045x;

    public gc(hc hcVar, Context context) {
        super(context);
        this.f48045x = hcVar;
        Paint paint = new Paint(1);
        this.f48036a = paint;
        this.f48037b = new Paint(1);
        this.f48038c = new Paint(1);
        this.d = new Paint(1);
        this.f48039e = new Path();
        this.f48040f = new Path();
        this.f48042r = new org.telegram.ui.Components.mc(this);
        this.f48044w = new org.telegram.ui.Components.d6(this, 0L, 320L, org.telegram.ui.Components.nr.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(org.telegram.messenger.cp r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gc.a(org.telegram.messenger.cp):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a10 = this.f48042r.a(0.05f);
        canvas.scale(a10, a10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.f48039e);
        canvas.drawPaint(this.f48037b);
        if (this.h) {
            canvas.drawPath(this.f48040f, this.f48038c);
        }
        canvas.restore();
        if (this.f48041n) {
            canvas.save();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((getMeasuredWidth() - org.telegram.messenger.g0.L(12.4f)) / 2.0f, (getMeasuredHeight() - org.telegram.messenger.g0.L(12.4f)) / 2.0f, (org.telegram.messenger.g0.L(12.4f) + getMeasuredWidth()) / 2.0f, (org.telegram.messenger.g0.L(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), this.d);
            canvas.restore();
        }
        float d = this.f48044w.d(this.f48043s);
        if (d > 0.0f) {
            float N = org.telegram.messenger.g0.N(2.0f);
            Paint paint = this.f48036a;
            paint.setStrokeWidth(N);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.T1((paint.getStrokeWidth() * 0.5f) + org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f) - (paint.getStrokeWidth() * 2.0f), d), paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f));
        Path path = this.f48039e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.L(20.0f), Path.Direction.CW);
        Path path2 = this.f48040f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i7) {
        this.f48036a.setColor(i7);
    }

    @Override
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f48042r.c(z10);
    }
}
