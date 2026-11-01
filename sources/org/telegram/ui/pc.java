package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
public final class pc extends View {
    public final Paint f40447a;
    public final Paint f40448b;
    public final Paint f40449c;
    public final Paint d;
    public final Path e;
    public final Path f40450f;
    public boolean h;
    public boolean f40451n;
    public final org.telegram.ui.Components.dc f40452r;
    public boolean f40453s;
    public final org.telegram.ui.Components.t5 f40454w;
    public final qc f40455x;

    public pc(qc qcVar, Context context) {
        super(context);
        this.f40455x = qcVar;
        Paint paint = new Paint(1);
        this.f40447a = paint;
        this.f40448b = new Paint(1);
        this.f40449c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Path();
        this.f40450f = new Path();
        this.f40452r = new org.telegram.ui.Components.dc(this);
        this.f40454w = new org.telegram.ui.Components.t5(this, 0L, 320L, org.telegram.ui.Components.gr.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(org.telegram.messenger.lp r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pc.a(org.telegram.messenger.lp):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.f40452r.a(0.05f);
        canvas.scale(a2, a2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.e);
        canvas.drawPaint(this.f40448b);
        if (this.h) {
            canvas.drawPath(this.f40450f, this.f40449c);
        }
        canvas.restore();
        if (this.f40451n) {
            canvas.save();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set((getMeasuredWidth() - org.telegram.messenger.i0.L(12.4f)) / 2.0f, (getMeasuredHeight() - org.telegram.messenger.i0.L(12.4f)) / 2.0f, (org.telegram.messenger.i0.L(12.4f) + getMeasuredWidth()) / 2.0f, (org.telegram.messenger.i0.L(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.33f), org.telegram.messenger.i0.L(2.33f), this.d);
            canvas.restore();
        }
        float d = this.f40454w.d(this.f40453s);
        if (d > 0.0f) {
            float N = org.telegram.messenger.i0.N(2.0f);
            Paint paint = this.f40447a;
            paint.setStrokeWidth(N);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.i0.T1((paint.getStrokeWidth() * 0.5f) + org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f) - (paint.getStrokeWidth() * 2.0f), d), paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(org.telegram.messenger.i0.L(56.0f), org.telegram.messenger.i0.L(56.0f));
        Path path = this.e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.i0.L(20.0f), Path.Direction.CW);
        Path path2 = this.f40450f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i10) {
        this.f40447a.setColor(i10);
    }

    @Override
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f40452r.c(z10);
    }
}
