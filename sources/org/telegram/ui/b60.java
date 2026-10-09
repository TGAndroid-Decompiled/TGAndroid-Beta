package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class b60 extends Drawable {
    public final Paint f36143a;
    public final Paint f36144b;
    public long f36145c;
    public float d;
    public int f36146e;
    public boolean f36147f;
    public View f36148g;

    public b60() {
        Paint paint = new Paint(1);
        this.f36143a = paint;
        this.f36144b = new Paint(1);
        this.d = 1.0f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
    }

    public final void a(ImageView imageView) {
        this.f36148g = imageView;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f), this.f36143a);
        if (this.f36147f) {
            i10 = -1147527;
        } else {
            i10 = -1;
        }
        Paint paint = this.f36144b;
        paint.setColor(i10);
        paint.setAlpha((int) (this.d * 255.0f));
        canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(5.0f), paint);
        if (this.f36147f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f36145c;
            if (j3 > 17) {
                j3 = 17;
            }
            this.f36145c = elapsedRealtime;
            int i11 = this.f36146e;
            if (i11 == 0) {
                float f7 = (((float) j3) / 2000.0f) + this.d;
                this.d = f7;
                if (f7 >= 1.0f) {
                    this.d = 1.0f;
                    this.f36146e = 1;
                }
            } else if (i11 == 1) {
                float f10 = this.d - (((float) j3) / 2000.0f);
                this.d = f10;
                if (f10 < 0.5f) {
                    this.d = 0.5f;
                    this.f36146e = 0;
                }
            }
            this.f36148g.invalidate();
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
