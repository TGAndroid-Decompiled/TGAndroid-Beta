package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.p009ui.ActionBar.Theme;

public class ProxyDrawable extends Drawable {
    private boolean connected;
    private float connectedAnimationProgress;
    private Drawable emptyDrawable;
    private Drawable fullDrawable;
    private boolean isEnabled;
    private long lastUpdateTime;
    private Paint outerPaint = new Paint(1);
    private RectF cicleRect = new RectF();
    private int radOffset = 0;

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i) {
    }

    public ProxyDrawable(Context context) {
        this.emptyDrawable = context.getResources().getDrawable(C1072R.C1073drawable.proxy_off);
        this.fullDrawable = context.getResources().getDrawable(C1072R.C1073drawable.proxy_on);
        this.outerPaint.setStyle(Paint.Style.STROKE);
        this.outerPaint.setStrokeWidth(AndroidUtilities.m35dp(2.0f));
        this.outerPaint.setStrokeCap(Paint.Cap.ROUND);
        this.lastUpdateTime = SystemClock.elapsedRealtime();
    }

    public void setConnected(boolean z, boolean z2, boolean z3) {
        this.isEnabled = z;
        this.connected = z2;
        this.lastUpdateTime = SystemClock.elapsedRealtime();
        if (!z3) {
            this.connectedAnimationProgress = this.connected ? 1.0f : 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public void draw(Canvas canvas) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.lastUpdateTime;
        this.lastUpdateTime = elapsedRealtime;
        if (!this.isEnabled) {
            this.emptyDrawable.setBounds(getBounds());
            this.emptyDrawable.draw(canvas);
        } else if (!this.connected || this.connectedAnimationProgress != 1.0f) {
            this.emptyDrawable.setBounds(getBounds());
            this.emptyDrawable.draw(canvas);
            this.outerPaint.setColor(Theme.getColor("contextProgressOuter2"));
            this.outerPaint.setAlpha((int) ((1.0f - this.connectedAnimationProgress) * 255.0f));
            this.radOffset = (int) (this.radOffset + (((float) (360 * j)) / 1000.0f));
            int width = getBounds().width();
            int height = getBounds().height();
            int m35dp = (width / 2) - AndroidUtilities.m35dp(3.0f);
            int m35dp2 = (height / 2) - AndroidUtilities.m35dp(3.0f);
            this.cicleRect.set(m35dp, m35dp2, m35dp + AndroidUtilities.m35dp(6.0f), m35dp2 + AndroidUtilities.m35dp(6.0f));
            canvas.drawArc(this.cicleRect, this.radOffset - 90, 90.0f, false, this.outerPaint);
            invalidateSelf();
        }
        if (this.isEnabled && (this.connected || this.connectedAnimationProgress != 0.0f)) {
            this.fullDrawable.setAlpha((int) (this.connectedAnimationProgress * 255.0f));
            this.fullDrawable.setBounds(getBounds());
            this.fullDrawable.draw(canvas);
        }
        boolean z = this.connected;
        if (z) {
            float f = this.connectedAnimationProgress;
            if (f != 1.0f) {
                float f2 = f + (((float) j) / 300.0f);
                this.connectedAnimationProgress = f2;
                if (f2 > 1.0f) {
                    this.connectedAnimationProgress = 1.0f;
                }
                invalidateSelf();
                return;
            }
        }
        if (z) {
            return;
        }
        float f3 = this.connectedAnimationProgress;
        if (f3 != 0.0f) {
            float f4 = f3 - (((float) j) / 300.0f);
            this.connectedAnimationProgress = f4;
            if (f4 < 0.0f) {
                this.connectedAnimationProgress = 0.0f;
            }
            invalidateSelf();
        }
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.emptyDrawable.setColorFilter(colorFilter);
        this.fullDrawable.setColorFilter(colorFilter);
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.m35dp(24.0f);
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.m35dp(24.0f);
    }
}
