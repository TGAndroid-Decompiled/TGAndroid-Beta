package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
public final class a40 extends Drawable {
    public final Paint f43553a;
    public final Paint f43554b;
    public long f43555c;
    public float d;
    public int f43556e;
    public boolean f43557f;
    public View f43558g;

    public a40() {
        Paint paint = new Paint(1);
        this.f43553a = paint;
        this.f43554b = new Paint(1);
        this.d = 1.0f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
    }

    public final void a(ImageView imageView) {
        this.f43558g = imageView;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        canvas.drawCircle(centerX, centerY, org.telegram.messenger.g0.L(10.0f), this.f43553a);
        if (this.f43557f) {
            i7 = -1147527;
        } else {
            i7 = -1;
        }
        Paint paint = this.f43554b;
        paint.setColor(i7);
        paint.setAlpha((int) (this.d * 255.0f));
        canvas.drawCircle(centerX, centerY, org.telegram.messenger.g0.L(5.0f), paint);
        if (this.f43557f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f43555c;
            if (j3 > 17) {
                j3 = 17;
            }
            this.f43555c = elapsedRealtime;
            int i10 = this.f43556e;
            if (i10 == 0) {
                float f10 = (((float) j3) / 2000.0f) + this.d;
                this.d = f10;
                if (f10 >= 1.0f) {
                    this.d = 1.0f;
                    this.f43556e = 1;
                }
            } else if (i10 == 1) {
                float f11 = this.d - (((float) j3) / 2000.0f);
                this.d = f11;
                if (f11 < 0.5f) {
                    this.d = 0.5f;
                    this.f43556e = 0;
                }
            }
            this.f43558g.invalidate();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
