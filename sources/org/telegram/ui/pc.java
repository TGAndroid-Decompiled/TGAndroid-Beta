package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
public final class pc extends View {
    public final Paint f40616a;
    public final Paint f40617b;
    public final Paint f40618c;
    public final Paint d;
    public final Path e;
    public final Path f40619f;
    public boolean h;
    public boolean f40620n;
    public final org.telegram.ui.Components.dc f40621r;
    public boolean f40622s;
    public final org.telegram.ui.Components.t5 f40623w;
    public final qc f40624x;

    public pc(qc qcVar, Context context) {
        super(context);
        this.f40624x = qcVar;
        Paint paint = new Paint(1);
        this.f40616a = paint;
        this.f40617b = new Paint(1);
        this.f40618c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Path();
        this.f40619f = new Path();
        this.f40621r = new org.telegram.ui.Components.dc(this);
        this.f40623w = new org.telegram.ui.Components.t5(this, 0L, 320L, org.telegram.ui.Components.gr.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(org.telegram.messenger.kp r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pc.a(org.telegram.messenger.kp):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.f40621r.a(0.05f);
        canvas.scale(a2, a2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.e);
        canvas.drawPaint(this.f40617b);
        if (this.h) {
            canvas.drawPath(this.f40619f, this.f40618c);
        }
        canvas.restore();
        if (this.f40620n) {
            canvas.save();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set((getMeasuredWidth() - org.telegram.messenger.i0.L(12.4f)) / 2.0f, (getMeasuredHeight() - org.telegram.messenger.i0.L(12.4f)) / 2.0f, (org.telegram.messenger.i0.L(12.4f) + getMeasuredWidth()) / 2.0f, (org.telegram.messenger.i0.L(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.33f), org.telegram.messenger.i0.L(2.33f), this.d);
            canvas.restore();
        }
        float d = this.f40623w.d(this.f40622s);
        if (d > 0.0f) {
            float N = org.telegram.messenger.i0.N(2.0f);
            Paint paint = this.f40616a;
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
        Path path2 = this.f40619f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i10) {
        this.f40616a.setColor(i10);
    }

    @Override
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f40621r.c(z10);
    }
}
