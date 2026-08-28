package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class j50 extends Drawable {
    public final Paint f39374a;
    public final Paint f39375b;
    public long f39376c;
    public float d;
    public int f39377e;
    public boolean f39378f;
    public View f39379g;

    public j50() {
        Paint paint = new Paint(1);
        this.f39374a = paint;
        this.f39375b = new Paint(1);
        this.d = 1.0f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
    }

    public final void a(ImageView imageView) {
        this.f39379g = imageView;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i9;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f), this.f39374a);
        if (this.f39378f) {
            i9 = -1147527;
        } else {
            i9 = -1;
        }
        Paint paint = this.f39375b;
        paint.setColor(i9);
        paint.setAlpha((int) (this.d * 255.0f));
        canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(5.0f), paint);
        if (this.f39378f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f39376c;
            if (j10 > 17) {
                j10 = 17;
            }
            this.f39376c = elapsedRealtime;
            int i10 = this.f39377e;
            if (i10 == 0) {
                float f10 = (((float) j10) / 2000.0f) + this.d;
                this.d = f10;
                if (f10 >= 1.0f) {
                    this.d = 1.0f;
                    this.f39377e = 1;
                }
            } else if (i10 == 1) {
                float f11 = this.d - (((float) j10) / 2000.0f);
                this.d = f11;
                if (f11 < 0.5f) {
                    this.d = 0.5f;
                    this.f39377e = 0;
                }
            }
            this.f39379g.invalidate();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
