package org.telegram.p009ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;

public class MsgClockDrawable extends Drawable {
    private int color;
    private Drawable.ConstantState constantState;
    private Paint paint;
    private int alpha = 255;
    private int colorAlpha = 255;
    private long startTime = System.currentTimeMillis();

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public MsgClockDrawable() {
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.paint.setStrokeWidth(AndroidUtilities.m34dp(1.0f));
    }

    @Override
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), (Math.min(bounds.width(), bounds.height()) >> 1) - AndroidUtilities.m34dp(0.5f), this.paint);
        long currentTimeMillis = System.currentTimeMillis();
        canvas.save();
        canvas.rotate(((((float) (currentTimeMillis - this.startTime)) % 1500.0f) * 360.0f) / 1500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), bounds.centerX(), bounds.centerY() - AndroidUtilities.m34dp(3.0f), this.paint);
        canvas.restore();
        canvas.save();
        canvas.rotate(((((float) (currentTimeMillis - this.startTime)) % 4500.0f) * 360.0f) / 4500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), bounds.centerX() + AndroidUtilities.m34dp(2.3f), bounds.centerY(), this.paint);
        canvas.restore();
    }

    public void setColor(int i) {
        if (i != this.color) {
            int alpha = Color.alpha(i);
            this.colorAlpha = alpha;
            this.paint.setColor(ColorUtils.setAlphaComponent(i, (int) (this.alpha * (alpha / 255.0f))));
        }
        this.color = i;
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.m34dp(12.0f);
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.m34dp(12.0f);
    }

    @Override
    public void setAlpha(int i) {
        if (this.alpha != i) {
            this.alpha = i;
            this.paint.setAlpha((int) (i * (this.colorAlpha / 255.0f)));
        }
    }

    @Override
    public Drawable.ConstantState getConstantState() {
        if (this.constantState == null) {
            this.constantState = new Drawable.ConstantState(this) {
                @Override
                public int getChangingConfigurations() {
                    return 0;
                }

                @Override
                public Drawable newDrawable() {
                    return new MsgClockDrawable();
                }
            };
        }
        return this.constantState;
    }
}
