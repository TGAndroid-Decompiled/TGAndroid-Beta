package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class m50 extends Drawable {
    public final Paint f40420a;
    public final Paint f40421b;
    public long f40422c;
    public float d;
    public int f40423e;
    public boolean f40424f;
    public View f40425g;

    public m50() {
        Paint paint = new Paint(1);
        this.f40420a = paint;
        this.f40421b = new Paint(1);
        this.d = 1.0f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
    }

    public final void a(ImageView imageView) {
        this.f40425g = imageView;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f), this.f40420a);
        if (this.f40424f) {
            i10 = -1147527;
        } else {
            i10 = -1;
        }
        Paint paint = this.f40421b;
        paint.setColor(i10);
        paint.setAlpha((int) (this.d * 255.0f));
        canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(5.0f), paint);
        if (this.f40424f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f40422c;
            if (j10 > 17) {
                j10 = 17;
            }
            this.f40422c = elapsedRealtime;
            int i11 = this.f40423e;
            if (i11 == 0) {
                float f9 = (((float) j10) / 2000.0f) + this.d;
                this.d = f9;
                if (f9 >= 1.0f) {
                    this.d = 1.0f;
                    this.f40423e = 1;
                }
            } else if (i11 == 1) {
                float f10 = this.d - (((float) j10) / 2000.0f);
                this.d = f10;
                if (f10 < 0.5f) {
                    this.d = 0.5f;
                    this.f40423e = 0;
                }
            }
            this.f40425g.invalidate();
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
