package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
public final class hc extends View {
    public final Paint f46298a;
    public final Paint f46299b;
    public final Paint f46300c;
    public final Paint d;
    public final Path f46301e;
    public final Path f46302f;
    public boolean h;
    public boolean f46303n;
    public final org.telegram.ui.Components.ic f46304r;
    public boolean f46305s;
    public final org.telegram.ui.Components.w5 f46306w;
    public final ic f46307x;

    public hc(ic icVar, Context context) {
        super(context);
        this.f46307x = icVar;
        Paint paint = new Paint(1);
        this.f46298a = paint;
        this.f46299b = new Paint(1);
        this.f46300c = new Paint(1);
        this.d = new Paint(1);
        this.f46301e = new Path();
        this.f46302f = new Path();
        this.f46304r = new org.telegram.ui.Components.ic(this);
        this.f46306w = new org.telegram.ui.Components.w5(this, 0L, 320L, org.telegram.ui.Components.xq.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(org.telegram.messenger.fp r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hc.a(org.telegram.messenger.fp):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a10 = this.f46304r.a(0.05f);
        canvas.scale(a10, a10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.f46301e);
        canvas.drawPaint(this.f46299b);
        if (this.h) {
            canvas.drawPath(this.f46302f, this.f46300c);
        }
        canvas.restore();
        if (this.f46303n) {
            canvas.save();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((getMeasuredWidth() - org.telegram.messenger.g0.L(12.4f)) / 2.0f, (getMeasuredHeight() - org.telegram.messenger.g0.L(12.4f)) / 2.0f, (org.telegram.messenger.g0.L(12.4f) + getMeasuredWidth()) / 2.0f, (org.telegram.messenger.g0.L(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), this.d);
            canvas.restore();
        }
        float d = this.f46306w.d(this.f46305s);
        if (d > 0.0f) {
            float N = org.telegram.messenger.g0.N(2.0f);
            Paint paint = this.f46298a;
            paint.setStrokeWidth(N);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.T1((paint.getStrokeWidth() * 0.5f) + org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f) - (paint.getStrokeWidth() * 2.0f), d), paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f));
        Path path = this.f46301e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.L(20.0f), Path.Direction.CW);
        Path path2 = this.f46302f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i7) {
        this.f46298a.setColor(i7);
    }

    @Override
    public final void setPressed(boolean z9) {
        super.setPressed(z9);
        this.f46304r.c(z9);
    }
}
