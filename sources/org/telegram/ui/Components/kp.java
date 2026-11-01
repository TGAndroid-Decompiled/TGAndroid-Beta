package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
public class kp extends Drawable {
    public static final u1.a h = new u1.a();
    public float f27915a;
    public final float f27916b;
    public long f27917c;
    public final float[] d;
    public final Paint e;
    public float f27918f;
    public final RectF f27919g;

    public kp(int i10) {
        this.f27915a = org.telegram.messenger.i0.L(18.0f);
        this.f27916b = org.telegram.messenger.i0.L(2.25f);
        this.f27917c = -1L;
        this.d = new float[2];
        Paint paint = new Paint();
        this.e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f27919g = new RectF();
        b(i10);
    }

    public static void a(float f7, float[] fArr) {
        int i10;
        float f10 = (1520.0f * f7) / 5400.0f;
        fArr[0] = Math.max(0.0f, f10 - 20.0f);
        fArr[1] = f10;
        for (int i11 = 0; i11 < 4; i11++) {
            u1.a aVar = h;
            fArr[1] = (aVar.getInterpolation((f7 - (i11 * 1350)) / 667.0f) * 250.0f) + fArr[1];
            fArr[0] = (aVar.getInterpolation((f7 - (i10 + 667)) / 667.0f) * 250.0f) + fArr[0];
        }
    }

    public final void b(int i10) {
        this.e.setColor(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f27917c < 0) {
            this.f27917c = SystemClock.elapsedRealtime();
        }
        float[] fArr = this.d;
        a((float) ((SystemClock.elapsedRealtime() - this.f27917c) % 5400), fArr);
        float f7 = this.f27918f;
        float f10 = fArr[0];
        Paint paint = this.e;
        canvas.drawArc(this.f27919g, f7 + f10, fArr[1] - f10, false, paint);
        invalidateSelf();
    }

    @Override
    public int getIntrinsicHeight() {
        return (int) (this.f27915a + this.f27916b);
    }

    @Override
    public int getIntrinsicWidth() {
        return (int) (this.f27915a + this.f27916b);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.e.setAlpha(i10);
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        float f7 = i10;
        float f10 = i12 - i10;
        float f11 = this.f27916b;
        float f12 = this.f27915a;
        float f13 = i11;
        float f14 = i13 - i11;
        this.f27919g.set(c3.i0.B(f10 - (f11 / 2.0f), f12, 2.0f, f7), (((f14 - (f11 / 2.0f)) - f12) / 2.0f) + f13, ((((f11 / 2.0f) + f10) + f12) / 2.0f) + f7, ((((f11 / 2.0f) + f14) + f12) / 2.0f) + f13);
        super.setBounds(i10, i11, i12, i13);
        this.e.setStrokeWidth(f11);
    }

    public kp(float f7, float f10, int i10) {
        this.f27915a = org.telegram.messenger.i0.L(18.0f);
        this.f27916b = org.telegram.messenger.i0.L(2.25f);
        this.f27917c = -1L;
        this.d = new float[2];
        Paint paint = new Paint();
        this.e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f27919g = new RectF();
        this.f27915a = f7;
        this.f27916b = f10;
        b(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
