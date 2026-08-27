package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

public class hp extends Drawable {
    public static final u1.a h = new u1.a();

    public float f29070a;

    public final float f29071b;

    public long f29072c;
    public final float[] d;

    public final Paint f29073e;

    public float f29074f;

    public final RectF f29075g;

    public hp(int i10) {
        this.f29070a = AndroidUtilities.dp(18.0f);
        this.f29071b = AndroidUtilities.dp(2.25f);
        this.f29072c = -1L;
        this.d = new float[2];
        Paint paint = new Paint();
        this.f29073e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f29075g = new RectF();
        b(i10);
    }

    public static void a(float[] fArr, float f10) {
        float f11 = (1520.0f * f10) / 5400.0f;
        fArr[0] = Math.max(0.0f, f11 - 20.0f);
        fArr[1] = f11;
        for (int i10 = 0; i10 < 4; i10++) {
            float f12 = fArr[1];
            int i11 = i10 * 1350;
            u1.a aVar = h;
            fArr[1] = (aVar.getInterpolation((f10 - i11) / 667.0f) * 250.0f) + f12;
            fArr[0] = (aVar.getInterpolation((f10 - (i11 + 667)) / 667.0f) * 250.0f) + fArr[0];
        }
    }

    public final void b(int i10) {
        this.f29073e.setColor(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f29072c < 0) {
            this.f29072c = SystemClock.elapsedRealtime();
        }
        float fElapsedRealtime = (SystemClock.elapsedRealtime() - this.f29072c) % 5400;
        float[] fArr = this.d;
        a(fArr, fElapsedRealtime);
        float f10 = this.f29074f;
        float f11 = fArr[0];
        canvas.drawArc(this.f29075g, f10 + f11, fArr[1] - f11, false, this.f29073e);
        invalidateSelf();
    }

    @Override
    public int getIntrinsicHeight() {
        return (int) (this.f29070a + this.f29071b);
    }

    @Override
    public int getIntrinsicWidth() {
        return (int) (this.f29070a + this.f29071b);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f29073e.setAlpha(i10);
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        float f10 = i10;
        float f11 = i12 - i10;
        float f12 = this.f29071b;
        float f13 = this.f29070a;
        float f14 = i11;
        float f15 = i13 - i11;
        this.f29075g.set(com.google.android.recaptcha.internal.a.A(f11 - (f12 / 2.0f), f13, 2.0f, f10), (((f15 - (f12 / 2.0f)) - f13) / 2.0f) + f14, ((((f12 / 2.0f) + f11) + f13) / 2.0f) + f10, ((((f12 / 2.0f) + f15) + f13) / 2.0f) + f14);
        super.setBounds(i10, i11, i12, i13);
        this.f29073e.setStrokeWidth(f12);
    }

    public hp(float f10, float f11, int i10) {
        this.f29070a = AndroidUtilities.dp(18.0f);
        this.f29071b = AndroidUtilities.dp(2.25f);
        this.f29072c = -1L;
        this.d = new float[2];
        Paint paint = new Paint();
        this.f29073e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f29075g = new RectF();
        this.f29070a = f10;
        this.f29071b = f11;
        b(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
