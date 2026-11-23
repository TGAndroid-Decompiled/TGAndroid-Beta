package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
public final class gc extends View {
    public final Paint f48213a;
    public final Paint f48214b;
    public final Paint f48215c;
    public final Paint d;
    public final Path f48216e;
    public final Path f48217f;
    public boolean h;
    public boolean f48218n;
    public final org.telegram.ui.Components.lc f48219r;
    public boolean f48220s;
    public final org.telegram.ui.Components.c6 f48221w;
    public final hc f48222x;

    public gc(hc hcVar, Context context) {
        super(context);
        this.f48222x = hcVar;
        Paint paint = new Paint(1);
        this.f48213a = paint;
        this.f48214b = new Paint(1);
        this.f48215c = new Paint(1);
        this.d = new Paint(1);
        this.f48216e = new Path();
        this.f48217f = new Path();
        this.f48219r = new org.telegram.ui.Components.lc(this);
        this.f48221w = new org.telegram.ui.Components.c6(this, 0L, 320L, org.telegram.ui.Components.kr.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(org.telegram.messenger.bp r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gc.a(org.telegram.messenger.bp):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a10 = this.f48219r.a(0.05f);
        canvas.scale(a10, a10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.f48216e);
        canvas.drawPaint(this.f48214b);
        if (this.h) {
            canvas.drawPath(this.f48217f, this.f48215c);
        }
        canvas.restore();
        if (this.f48218n) {
            canvas.save();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((getMeasuredWidth() - org.telegram.messenger.g0.L(12.4f)) / 2.0f, (getMeasuredHeight() - org.telegram.messenger.g0.L(12.4f)) / 2.0f, (org.telegram.messenger.g0.L(12.4f) + getMeasuredWidth()) / 2.0f, (org.telegram.messenger.g0.L(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), this.d);
            canvas.restore();
        }
        float d = this.f48221w.d(this.f48220s);
        if (d > 0.0f) {
            float N = org.telegram.messenger.g0.N(2.0f);
            Paint paint = this.f48213a;
            paint.setStrokeWidth(N);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.T1((paint.getStrokeWidth() * 0.5f) + org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f) - (paint.getStrokeWidth() * 2.0f), d), paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f));
        Path path = this.f48216e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.L(20.0f), Path.Direction.CW);
        Path path2 = this.f48217f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i7) {
        this.f48213a.setColor(i7);
    }

    @Override
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f48219r.c(z10);
    }
}
