package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public class np extends Drawable {
    public static final u1.a h = new u1.a();
    public float f31104a;
    public final float f31105b;
    public long f31106c;
    public final float[] d;
    public final Paint f31107e;
    public float f31108f;
    public final RectF f31109g;

    public np(int i10) {
        this.f31104a = AndroidUtilities.dp(18.0f);
        this.f31105b = AndroidUtilities.dp(2.25f);
        this.f31106c = -1L;
        this.d = new float[2];
        Paint paint = new Paint();
        this.f31107e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f31109g = new RectF();
        b(i10);
    }

    public static void a(float[] fArr, float f9) {
        float f10 = (1520.0f * f9) / 5400.0f;
        fArr[0] = Math.max(0.0f, f10 - 20.0f);
        fArr[1] = f10;
        for (int i10 = 0; i10 < 4; i10++) {
            float f11 = fArr[1];
            int i11 = i10 * 1350;
            u1.a aVar = h;
            fArr[1] = (aVar.getInterpolation((f9 - i11) / 667.0f) * 250.0f) + f11;
            fArr[0] = (aVar.getInterpolation((f9 - (i11 + 667)) / 667.0f) * 250.0f) + fArr[0];
        }
    }

    public final void b(int i10) {
        this.f31107e.setColor(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f31106c < 0) {
            this.f31106c = SystemClock.elapsedRealtime();
        }
        float[] fArr = this.d;
        a(fArr, (float) ((SystemClock.elapsedRealtime() - this.f31106c) % 5400));
        float f9 = this.f31108f;
        float f10 = fArr[0];
        Paint paint = this.f31107e;
        canvas.drawArc(this.f31109g, f9 + f10, fArr[1] - f10, false, paint);
        invalidateSelf();
    }

    @Override
    public int getIntrinsicHeight() {
        return (int) (this.f31104a + this.f31105b);
    }

    @Override
    public int getIntrinsicWidth() {
        return (int) (this.f31104a + this.f31105b);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f31107e.setAlpha(i10);
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        float f9 = i10;
        float f10 = i12 - i10;
        float f11 = this.f31105b;
        float f12 = this.f31104a;
        float f13 = i11;
        float f14 = i13 - i11;
        this.f31109g.set(com.google.android.recaptcha.internal.a.A(f10 - (f11 / 2.0f), f12, 2.0f, f9), (((f14 - (f11 / 2.0f)) - f12) / 2.0f) + f13, ((((f11 / 2.0f) + f10) + f12) / 2.0f) + f9, ((((f11 / 2.0f) + f14) + f12) / 2.0f) + f13);
        super.setBounds(i10, i11, i12, i13);
        this.f31107e.setStrokeWidth(f11);
    }

    public np(float f9, float f10, int i10) {
        this.f31104a = AndroidUtilities.dp(18.0f);
        this.f31105b = AndroidUtilities.dp(2.25f);
        this.f31106c = -1L;
        this.d = new float[2];
        Paint paint = new Paint();
        this.f31107e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f31109g = new RectF();
        this.f31104a = f9;
        this.f31105b = f10;
        b(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
