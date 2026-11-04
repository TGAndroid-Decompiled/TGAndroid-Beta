package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
public final class fc extends View {
    public final Paint f45237a;
    public final Paint f45238b;
    public final Paint f45239c;
    public final Paint d;
    public final Path f45240e;
    public final Path f45241f;
    public boolean h;
    public boolean f45242n;
    public final org.telegram.ui.Components.gc f45243r;
    public boolean f45244s;
    public final org.telegram.ui.Components.u5 f45245w;
    public final gc f45246x;

    public fc(gc gcVar, Context context) {
        super(context);
        this.f45246x = gcVar;
        Paint paint = new Paint(1);
        this.f45237a = paint;
        this.f45238b = new Paint(1);
        this.f45239c = new Paint(1);
        this.d = new Paint(1);
        this.f45240e = new Path();
        this.f45241f = new Path();
        this.f45243r = new org.telegram.ui.Components.gc(this);
        this.f45245w = new org.telegram.ui.Components.u5(this, 0L, 320L, org.telegram.ui.Components.xq.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(org.telegram.messenger.wo r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fc.a(org.telegram.messenger.wo):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a10 = this.f45243r.a(0.05f);
        canvas.scale(a10, a10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.f45240e);
        canvas.drawPaint(this.f45238b);
        if (this.h) {
            canvas.drawPath(this.f45241f, this.f45239c);
        }
        canvas.restore();
        if (this.f45242n) {
            canvas.save();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((getMeasuredWidth() - org.telegram.messenger.g0.L(12.4f)) / 2.0f, (getMeasuredHeight() - org.telegram.messenger.g0.L(12.4f)) / 2.0f, (org.telegram.messenger.g0.L(12.4f) + getMeasuredWidth()) / 2.0f, (org.telegram.messenger.g0.L(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), this.d);
            canvas.restore();
        }
        float d = this.f45245w.d(this.f45244s);
        if (d > 0.0f) {
            float N = org.telegram.messenger.g0.N(2.0f);
            Paint paint = this.f45237a;
            paint.setStrokeWidth(N);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.T1((paint.getStrokeWidth() * 0.5f) + org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f) - (paint.getStrokeWidth() * 2.0f), d), paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f));
        Path path = this.f45240e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.L(20.0f), Path.Direction.CW);
        Path path2 = this.f45241f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i3) {
        this.f45237a.setColor(i3);
    }

    @Override
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f45243r.c(z10);
    }
}
