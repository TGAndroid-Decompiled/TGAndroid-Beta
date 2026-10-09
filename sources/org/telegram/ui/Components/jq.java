package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public class jq extends Drawable {
    public static final u1.a h = new u1.a();
    public float f27755a;
    public final float f27756b;
    public long f27757c;
    public final float[] d;
    public final Paint f27758e;
    public float f27759f;
    public final RectF f27760g;

    public jq(int i10) {
        this.f27755a = AndroidUtilities.dp(18.0f);
        this.f27756b = AndroidUtilities.dp(2.25f);
        this.f27757c = -1L;
        this.d = new float[2];
        Paint paint = new Paint();
        this.f27758e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f27760g = new RectF();
        b(i10);
    }

    public static void a(float[] fArr, float f7) {
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
        this.f27758e.setColor(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f27757c < 0) {
            this.f27757c = SystemClock.elapsedRealtime();
        }
        float[] fArr = this.d;
        a(fArr, (float) ((SystemClock.elapsedRealtime() - this.f27757c) % 5400));
        float f7 = this.f27759f;
        float f10 = fArr[0];
        Paint paint = this.f27758e;
        canvas.drawArc(this.f27760g, f7 + f10, fArr[1] - f10, false, paint);
        invalidateSelf();
    }

    @Override
    public int getIntrinsicHeight() {
        return (int) (this.f27755a + this.f27756b);
    }

    @Override
    public int getIntrinsicWidth() {
        return (int) (this.f27755a + this.f27756b);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27758e.setAlpha(i10);
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        float f7 = i10;
        float f10 = i12 - i10;
        float f11 = this.f27756b;
        float f12 = this.f27755a;
        float f13 = i11;
        float f14 = i13 - i11;
        this.f27760g.set(com.google.android.gms.internal.vision.e2.z(f10 - (f11 / 2.0f), f12, 2.0f, f7), (((f14 - (f11 / 2.0f)) - f12) / 2.0f) + f13, ((((f11 / 2.0f) + f10) + f12) / 2.0f) + f7, ((((f11 / 2.0f) + f14) + f12) / 2.0f) + f13);
        super.setBounds(i10, i11, i12, i13);
        this.f27758e.setStrokeWidth(f11);
    }

    public jq(float f7, float f10, int i10) {
        this.f27755a = AndroidUtilities.dp(18.0f);
        this.f27756b = AndroidUtilities.dp(2.25f);
        this.f27757c = -1L;
        this.d = new float[2];
        Paint paint = new Paint();
        this.f27758e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f27760g = new RectF();
        this.f27755a = f7;
        this.f27756b = f10;
        b(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
