package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

public final class n50 extends Drawable {

    public final Paint f40665a;

    public final Paint f40666b;

    public long f40667c;
    public float d;

    public int f40668e;

    public boolean f40669f;

    public View f40670g;

    public n50() {
        Paint paint = new Paint(1);
        this.f40665a = paint;
        this.f40666b = new Paint(1);
        this.d = 1.0f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
    }

    public final void a(ImageView imageView) {
        this.f40670g = imageView;
    }

    @Override
    public final void draw(Canvas canvas) {
        float fCenterX = getBounds().centerX();
        float fCenterY = getBounds().centerY();
        canvas.drawCircle(fCenterX, fCenterY, AndroidUtilities.dp(10.0f), this.f40665a);
        int i10 = this.f40669f ? -1147527 : -1;
        Paint paint = this.f40666b;
        paint.setColor(i10);
        paint.setAlpha((int) (this.d * 255.0f));
        canvas.drawCircle(fCenterX, fCenterY, AndroidUtilities.dp(5.0f), paint);
        if (this.f40669f) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f40667c;
            if (j10 > 17) {
                j10 = 17;
            }
            this.f40667c = jElapsedRealtime;
            int i11 = this.f40668e;
            if (i11 == 0) {
                float f10 = (j10 / 2000.0f) + this.d;
                this.d = f10;
                if (f10 >= 1.0f) {
                    this.d = 1.0f;
                    this.f40668e = 1;
                }
            } else if (i11 == 1) {
                float f11 = this.d - (j10 / 2000.0f);
                this.d = f11;
                if (f11 < 0.5f) {
                    this.d = 0.5f;
                    this.f40668e = 0;
                }
            }
            this.f40670g.invalidate();
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
