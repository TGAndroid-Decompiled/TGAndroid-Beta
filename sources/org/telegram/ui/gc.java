package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
public final class gc extends View {
    public final Paint f47391a;
    public final Paint f47392b;
    public final Paint f47393c;
    public final Paint d;
    public final Path f47394e;
    public final Path f47395f;
    public boolean h;
    public boolean f47396n;
    public final org.telegram.ui.Components.dc f47397r;
    public boolean f47398s;
    public final org.telegram.ui.Components.u5 f47399w;
    public final hc f47400x;

    public gc(hc hcVar, Context context) {
        super(context);
        this.f47400x = hcVar;
        Paint paint = new Paint(1);
        this.f47391a = paint;
        this.f47392b = new Paint(1);
        this.f47393c = new Paint(1);
        this.d = new Paint(1);
        this.f47394e = new Path();
        this.f47395f = new Path();
        this.f47397r = new org.telegram.ui.Components.dc(this);
        this.f47399w = new org.telegram.ui.Components.u5(this, 0L, 320L, org.telegram.ui.Components.er.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(org.telegram.messenger.cp r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gc.a(org.telegram.messenger.cp):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a10 = this.f47397r.a(0.05f);
        canvas.scale(a10, a10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.f47394e);
        canvas.drawPaint(this.f47392b);
        if (this.h) {
            canvas.drawPath(this.f47395f, this.f47393c);
        }
        canvas.restore();
        if (this.f47396n) {
            canvas.save();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((getMeasuredWidth() - org.telegram.messenger.g0.L(12.4f)) / 2.0f, (getMeasuredHeight() - org.telegram.messenger.g0.L(12.4f)) / 2.0f, (org.telegram.messenger.g0.L(12.4f) + getMeasuredWidth()) / 2.0f, (org.telegram.messenger.g0.L(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), this.d);
            canvas.restore();
        }
        float d = this.f47399w.d(this.f47398s);
        if (d > 0.0f) {
            float N = org.telegram.messenger.g0.N(2.0f);
            Paint paint = this.f47391a;
            paint.setStrokeWidth(N);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.T1((paint.getStrokeWidth() * 0.5f) + org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f) - (paint.getStrokeWidth() * 2.0f), d), paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f));
        Path path = this.f47394e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.L(20.0f), Path.Direction.CW);
        Path path2 = this.f47395f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i7) {
        this.f47391a.setColor(i7);
    }

    @Override
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f47397r.c(z10);
    }
}
