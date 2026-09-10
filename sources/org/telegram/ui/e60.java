package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class e60 extends Drawable {
    public final Paint f32069a;
    public final Paint f32070b;
    public long f32071c;
    public float d;
    public int e;
    public boolean f32072f;
    public View f32073g;

    public e60() {
        Paint paint = new Paint(1);
        this.f32069a = paint;
        this.f32070b = new Paint(1);
        this.d = 1.0f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
    }

    public final void a(ImageView imageView) {
        this.f32073g = imageView;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f), this.f32069a);
        if (this.f32072f) {
            i10 = -1147527;
        } else {
            i10 = -1;
        }
        Paint paint = this.f32070b;
        paint.setColor(i10);
        paint.setAlpha((int) (this.d * 255.0f));
        canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(5.0f), paint);
        if (this.f32072f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f32071c;
            if (j3 > 17) {
                j3 = 17;
            }
            this.f32071c = elapsedRealtime;
            int i11 = this.e;
            if (i11 == 0) {
                float f7 = (((float) j3) / 2000.0f) + this.d;
                this.d = f7;
                if (f7 >= 1.0f) {
                    this.d = 1.0f;
                    this.e = 1;
                }
            } else if (i11 == 1) {
                float f10 = this.d - (((float) j3) / 2000.0f);
                this.d = f10;
                if (f10 < 0.5f) {
                    this.d = 0.5f;
                    this.e = 0;
                }
            }
            this.f32073g.invalidate();
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
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
