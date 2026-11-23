package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
public final class a0 extends ReplacementSpan {
    public final Paint f33197a;
    public final Path f33198b;
    public final Rect f33199c;
    public float d;
    public float f33200e;
    public float f33201f;
    public float h;
    public float f33202n;

    public a0() {
        Paint paint = new Paint(1);
        this.f33197a = paint;
        this.f33198b = new Path();
        this.f33199c = new Rect();
        this.d = -1.0f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    public final void a(Paint paint) {
        float textSize = paint.getTextSize();
        if (textSize == this.d) {
            return;
        }
        this.d = textSize;
        this.f33200e = 0.62f * textSize;
        this.f33201f = 0.1f * textSize;
        this.h = textSize * 0.3f;
        Rect rect = this.f33199c;
        paint.getTextBounds("x", 0, 1, rect);
        this.f33202n = rect.height();
        float f10 = this.f33200e;
        float f11 = 0.475f * f10;
        float f12 = f10 * 0.46f;
        Path path = this.f33198b;
        path.rewind();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(this.f33200e, 0.0f);
        path.moveTo(this.f33200e - f11, -f12);
        path.lineTo(this.f33200e, 0.0f);
        path.lineTo(this.f33200e - f11, f12);
        this.f33197a.setStrokeWidth(this.f33201f);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        a(paint);
        int color = paint.getColor();
        Paint paint2 = this.f33197a;
        paint2.setColor(color);
        canvas.save();
        float f11 = (this.f33201f / 2.0f) + f10;
        org.telegram.messenger.o10.k(this.f33202n, 2.0f, i12, f11, canvas);
        canvas.drawPath(this.f33198b, paint2);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        a(paint);
        return (int) Math.ceil(this.f33201f + this.f33200e + this.h);
    }
}
