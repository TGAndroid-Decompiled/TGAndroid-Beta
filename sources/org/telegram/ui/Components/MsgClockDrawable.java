package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;

public final class MsgClockDrawable extends Drawable {
    public int alpha;
    public int color;
    public int colorAlpha;
    public AnonymousClass1 constantState;
    public final Paint paint;
    public final long startTime;

    public final class AnonymousClass1 extends Drawable.ConstantState {
        @Override
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override
        public final Drawable newDrawable() {
            return new MsgClockDrawable();
        }
    }

    public MsgClockDrawable() {
        Paint paint = new Paint(1);
        this.paint = paint;
        this.alpha = 255;
        this.colorAlpha = 255;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.startTime = System.currentTimeMillis();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int iMin = Math.min(bounds.width(), bounds.height());
        float fCenterX = bounds.centerX();
        float fCenterY = bounds.centerY();
        float fDp = (iMin >> 1) - AndroidUtilities.dp(0.5f);
        Paint paint = this.paint;
        canvas.drawCircle(fCenterX, fCenterY, fDp, paint);
        long jCurrentTimeMillis = System.currentTimeMillis();
        canvas.save();
        long j = this.startTime;
        canvas.rotate((((jCurrentTimeMillis - j) % 1500.0f) * 360.0f) / 1500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), bounds.centerX(), bounds.centerY() - AndroidUtilities.dp(3.0f), paint);
        canvas.restore();
        canvas.save();
        canvas.rotate((((jCurrentTimeMillis - j) % 4500.0f) * 360.0f) / 4500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), AndroidUtilities.dp(2.3f) + bounds.centerX(), bounds.centerY(), paint);
        canvas.restore();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (this.constantState == null) {
            this.constantState = new AnonymousClass1();
        }
        return this.constantState;
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        if (this.alpha != i) {
            this.alpha = i;
            this.paint.setAlpha((int) ((this.colorAlpha / 255.0f) * i));
        }
    }

    public final void setColor(int i) {
        if (i != this.color) {
            int iAlpha = Color.alpha(i);
            this.colorAlpha = iAlpha;
            this.paint.setColor(ColorUtils.setAlphaComponent(i, (int) ((iAlpha / 255.0f) * this.alpha)));
        }
        this.color = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
