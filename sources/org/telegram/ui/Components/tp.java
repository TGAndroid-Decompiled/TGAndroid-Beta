package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public class tp extends Drawable {
    public static final u1.a h = new u1.a();
    public float f31427a;
    public final float f31428b;
    public long f31429c;
    public final float[] d;
    public final Paint f31430e;
    public float f31431f;
    public final RectF f31432g;

    public tp(int i10) {
        this.f31427a = AndroidUtilities.dp(18.0f);
        this.f31428b = AndroidUtilities.dp(2.25f);
        this.f31429c = -1L;
        this.d = new float[2];
        Paint paint = new Paint();
        this.f31430e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f31432g = new RectF();
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
        this.f31430e.setColor(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f31429c < 0) {
            this.f31429c = SystemClock.elapsedRealtime();
        }
        float[] fArr = this.d;
        a(fArr, (float) ((SystemClock.elapsedRealtime() - this.f31429c) % 5400));
        float f10 = this.f31431f;
        float f11 = fArr[0];
        Paint paint = this.f31430e;
        canvas.drawArc(this.f31432g, f10 + f11, fArr[1] - f11, false, paint);
        invalidateSelf();
    }

    @Override
    public int getIntrinsicHeight() {
        return (int) (this.f31427a + this.f31428b);
    }

    @Override
    public int getIntrinsicWidth() {
        return (int) (this.f31427a + this.f31428b);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f31430e.setAlpha(i10);
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        float f10 = i10;
        float f11 = i12 - i10;
        float f12 = this.f31428b;
        float f13 = this.f31427a;
        float f14 = i11;
        float f15 = i13 - i11;
        this.f31432g.set(e2.c.x(f11 - (f12 / 2.0f), f13, 2.0f, f10), (((f15 - (f12 / 2.0f)) - f13) / 2.0f) + f14, ((((f12 / 2.0f) + f11) + f13) / 2.0f) + f10, ((((f12 / 2.0f) + f15) + f13) / 2.0f) + f14);
        super.setBounds(i10, i11, i12, i13);
        this.f31430e.setStrokeWidth(f12);
    }

    public tp(float f10, float f11, int i10) {
        this.f31427a = AndroidUtilities.dp(18.0f);
        this.f31428b = AndroidUtilities.dp(2.25f);
        this.f31429c = -1L;
        this.d = new float[2];
        Paint paint = new Paint();
        this.f31430e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f31432g = new RectF();
        this.f31427a = f10;
        this.f31428b = f11;
        b(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
