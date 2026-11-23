package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
public class up extends Drawable {
    public static final x1.a h = new x1.a();
    public float f40499a;
    public final float f40500b;
    public long f40501c;
    public final float[] d;
    public final Paint f40502e;
    public float f40503f;
    public final RectF f40504g;

    public up(int i7) {
        this.f40499a = org.telegram.messenger.g0.L(18.0f);
        this.f40500b = org.telegram.messenger.g0.L(2.25f);
        this.f40501c = -1L;
        this.d = new float[2];
        Paint paint = new Paint();
        this.f40502e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f40504g = new RectF();
        b(i7);
    }

    public static void a(float f10, float[] fArr) {
        int i7;
        float f11 = (1520.0f * f10) / 5400.0f;
        fArr[0] = Math.max(0.0f, f11 - 20.0f);
        fArr[1] = f11;
        for (int i10 = 0; i10 < 4; i10++) {
            x1.a aVar = h;
            fArr[1] = (aVar.getInterpolation((f10 - (i10 * 1350)) / 667.0f) * 250.0f) + fArr[1];
            fArr[0] = (aVar.getInterpolation((f10 - (i7 + 667)) / 667.0f) * 250.0f) + fArr[0];
        }
    }

    public final void b(int i7) {
        this.f40502e.setColor(i7);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f40501c < 0) {
            this.f40501c = SystemClock.elapsedRealtime();
        }
        float[] fArr = this.d;
        a((float) ((SystemClock.elapsedRealtime() - this.f40501c) % 5400), fArr);
        float f10 = this.f40503f;
        float f11 = fArr[0];
        Paint paint = this.f40502e;
        canvas.drawArc(this.f40504g, f10 + f11, fArr[1] - f11, false, paint);
        invalidateSelf();
    }

    @Override
    public int getIntrinsicHeight() {
        return (int) (this.f40499a + this.f40500b);
    }

    @Override
    public int getIntrinsicWidth() {
        return (int) (this.f40499a + this.f40500b);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f40502e.setAlpha(i7);
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        float f10 = i7;
        float f11 = i11 - i7;
        float f12 = this.f40500b;
        float f13 = this.f40499a;
        float f14 = i10;
        float f15 = i12 - i10;
        this.f40504g.set(com.google.android.gms.internal.vision.e2.A(f11 - (f12 / 2.0f), f13, 2.0f, f10), (((f15 - (f12 / 2.0f)) - f13) / 2.0f) + f14, ((((f12 / 2.0f) + f11) + f13) / 2.0f) + f10, ((((f12 / 2.0f) + f15) + f13) / 2.0f) + f14);
        super.setBounds(i7, i10, i11, i12);
        this.f40502e.setStrokeWidth(f12);
    }

    public up(float f10, float f11, int i7) {
        this.f40499a = org.telegram.messenger.g0.L(18.0f);
        this.f40500b = org.telegram.messenger.g0.L(2.25f);
        this.f40501c = -1L;
        this.d = new float[2];
        Paint paint = new Paint();
        this.f40502e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f40504g = new RectF();
        this.f40499a = f10;
        this.f40500b = f11;
        b(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
