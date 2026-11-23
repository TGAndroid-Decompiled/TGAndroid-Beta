package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
public final class z extends ReplacementSpan {
    public final Paint f42594a;
    public final Path f42595b;
    public final Rect f42596c;
    public float d;
    public float f42597e;
    public float f42598f;
    public float h;
    public float f42599n;

    public z() {
        Paint paint = new Paint(1);
        this.f42594a = paint;
        this.f42595b = new Path();
        this.f42596c = new Rect();
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
        this.f42597e = 0.62f * textSize;
        this.f42598f = 0.1f * textSize;
        this.h = textSize * 0.3f;
        Rect rect = this.f42596c;
        paint.getTextBounds("x", 0, 1, rect);
        this.f42599n = rect.height();
        float f10 = this.f42597e;
        float f11 = 0.475f * f10;
        float f12 = f10 * 0.46f;
        Path path = this.f42595b;
        path.rewind();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(this.f42597e, 0.0f);
        path.moveTo(this.f42597e - f11, -f12);
        path.lineTo(this.f42597e, 0.0f);
        path.lineTo(this.f42597e - f11, f12);
        this.f42594a.setStrokeWidth(this.f42598f);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        a(paint);
        int color = paint.getColor();
        Paint paint2 = this.f42594a;
        paint2.setColor(color);
        canvas.save();
        float f11 = (this.f42598f / 2.0f) + f10;
        org.telegram.messenger.m10.k(this.f42599n, 2.0f, i12, f11, canvas);
        canvas.drawPath(this.f42595b, paint2);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        a(paint);
        return (int) Math.ceil(this.f42598f + this.f42597e + this.h);
    }
}
