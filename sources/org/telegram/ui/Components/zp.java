package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public class zp extends Drawable {
    public static final u1.a h = new u1.a();
    public float f29781a;
    public final float f29782b;
    public long f29783c;
    public final float[] d;
    public final Paint e;
    public float f29784f;
    public final RectF f29785g;

    public zp(int i10) {
        this.f29781a = AndroidUtilities.dp(18.0f);
        this.f29782b = AndroidUtilities.dp(2.25f);
        this.f29783c = -1L;
        this.d = new float[2];
        Paint paint = new Paint();
        this.e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f29785g = new RectF();
        b(i10);
    }

    public static void a(float[] fArr, float f7) {
        float f10 = (1520.0f * f7) / 5400.0f;
        fArr[0] = Math.max(0.0f, f10 - 20.0f);
        fArr[1] = f10;
        for (int i10 = 0; i10 < 4; i10++) {
            float f11 = fArr[1];
            int i11 = i10 * 1350;
            u1.a aVar = h;
            fArr[1] = (aVar.getInterpolation((f7 - i11) / 667.0f) * 250.0f) + f11;
            fArr[0] = (aVar.getInterpolation((f7 - (i11 + 667)) / 667.0f) * 250.0f) + fArr[0];
        }
    }

    public final void b(int i10) {
        this.e.setColor(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f29783c < 0) {
            this.f29783c = SystemClock.elapsedRealtime();
        }
        float[] fArr = this.d;
        a(fArr, (float) ((SystemClock.elapsedRealtime() - this.f29783c) % 5400));
        float f7 = this.f29784f;
        float f10 = fArr[0];
        Paint paint = this.e;
        canvas.drawArc(this.f29785g, f7 + f10, fArr[1] - f10, false, paint);
        invalidateSelf();
    }

    @Override
    public int getIntrinsicHeight() {
        return (int) (this.f29781a + this.f29782b);
    }

    @Override
    public int getIntrinsicWidth() {
        return (int) (this.f29781a + this.f29782b);
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
        float f11 = this.f29782b;
        float f12 = this.f29781a;
        float f13 = i11;
        float f14 = i13 - i11;
        this.f29785g.set(com.google.android.gms.internal.vision.e2.A(f10 - (f11 / 2.0f), f12, 2.0f, f7), (((f14 - (f11 / 2.0f)) - f12) / 2.0f) + f13, ((((f11 / 2.0f) + f10) + f12) / 2.0f) + f7, ((((f11 / 2.0f) + f14) + f12) / 2.0f) + f13);
        super.setBounds(i10, i11, i12, i13);
        this.e.setStrokeWidth(f11);
    }

    public zp(float f7, float f10, int i10) {
        this.f29781a = AndroidUtilities.dp(18.0f);
        this.f29782b = AndroidUtilities.dp(2.25f);
        this.f29783c = -1L;
        this.d = new float[2];
        Paint paint = new Paint();
        this.e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f29785g = new RectF();
        this.f29781a = f7;
        this.f29782b = f10;
        b(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
