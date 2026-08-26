package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class ProxyDrawable extends Drawable {
    public final RectF circleRect;
    public boolean connected;
    public float connectedAnimationProgress;
    public final Drawable emptyDrawable;
    public final Drawable fullDrawable;
    public boolean isEnabled;
    public long lastUpdateTime;
    public final Paint outerPaint;
    public int radOffset;

    public ProxyDrawable(Context context) {
        Paint paint = new Paint(1);
        this.outerPaint = paint;
        this.circleRect = new RectF();
        this.radOffset = 0;
        this.emptyDrawable = context.getResources().getDrawable(R.drawable.outline_shield_plain_24).mutate();
        this.fullDrawable = context.getResources().getDrawable(R.drawable.outline_shield_check).mutate();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.lastUpdateTime = SystemClock.elapsedRealtime();
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.lastUpdateTime;
        this.lastUpdateTime = jElapsedRealtime;
        boolean z2 = this.isEnabled;
        Drawable drawable = this.emptyDrawable;
        if (z2) {
            if (!this.connected || this.connectedAnimationProgress != 1.0f) {
                setBounds(drawable);
                drawable.draw(canvas);
                Paint paint = this.outerPaint;
                paint.setAlpha((int) ((1.0f - this.connectedAnimationProgress) * 255.0f));
                this.radOffset += (int) ((360 * j) / 1000.0f);
                int iWidth = getBounds().width();
                int iHeight = getBounds().height();
                int iDp = AndroidUtilities.dp(4.0f);
                int i = (iWidth / 2) - iDp;
                int i2 = (iHeight / 2) - iDp;
                RectF rectF = this.circleRect;
                rectF.set(i, i2, i + iDp + iDp, i2 + iDp + iDp);
                canvas2 = canvas;
                canvas2.drawArc(rectF, this.radOffset - 90, 90.0f, false, paint);
                invalidateSelf();
            }
            if (this.isEnabled && (this.connected || this.connectedAnimationProgress != 0.0f)) {
                int i3 = (int) (this.connectedAnimationProgress * 255.0f);
                Drawable drawable2 = this.fullDrawable;
                drawable2.setAlpha(i3);
                setBounds(drawable2);
                drawable2.draw(canvas2);
            }
            z = this.connected;
            if (z) {
                f3 = this.connectedAnimationProgress;
                if (f3 != 1.0f) {
                    f4 = (j / 300.0f) + f3;
                    this.connectedAnimationProgress = f4;
                    if (f4 > 1.0f) {
                        this.connectedAnimationProgress = 1.0f;
                    }
                    invalidateSelf();
                    return;
                }
            }
            if (z) {
            }
            f = this.connectedAnimationProgress;
            if (f != 0.0f) {
                f2 = f - (j / 300.0f);
                this.connectedAnimationProgress = f2;
                if (f2 < 0.0f) {
                    this.connectedAnimationProgress = 0.0f;
                }
                invalidateSelf();
            }
        }
        setBounds(drawable);
        drawable.draw(canvas);
        canvas2 = canvas;
        if (this.isEnabled) {
            int i4 = (int) (this.connectedAnimationProgress * 255.0f);
            Drawable drawable3 = this.fullDrawable;
            drawable3.setAlpha(i4);
            setBounds(drawable3);
            drawable3.draw(canvas2);
        }
        z = this.connected;
        if (z) {
            f3 = this.connectedAnimationProgress;
            if (f3 != 1.0f) {
                f4 = (j / 300.0f) + f3;
                this.connectedAnimationProgress = f4;
                if (f4 > 1.0f) {
                    this.connectedAnimationProgress = 1.0f;
                }
                invalidateSelf();
                return;
            }
        }
        if (z) {
            f = this.connectedAnimationProgress;
            if (f != 0.0f) {
                f2 = f - (j / 300.0f);
                this.connectedAnimationProgress = f2;
                if (f2 < 0.0f) {
                    this.connectedAnimationProgress = 0.0f;
                }
                invalidateSelf();
            }
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
    public final void setAlpha(int i) {
    }

    public final void setBounds(Drawable drawable) {
        Rect bounds = getBounds();
        drawable.setBounds(zzle.m(bounds.centerX(), drawable), bounds.centerY() - (drawable.getIntrinsicHeight() / 2), (drawable.getIntrinsicWidth() / 2) + bounds.centerX(), (drawable.getIntrinsicHeight() / 2) + bounds.centerY());
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.emptyDrawable.setColorFilter(colorFilter);
        this.fullDrawable.setColorFilter(colorFilter);
        this.outerPaint.setColorFilter(colorFilter);
    }

    public final void setConnected(boolean z, boolean z2, boolean z3) {
        this.isEnabled = z;
        this.connected = z2;
        this.lastUpdateTime = SystemClock.elapsedRealtime();
        if (!z3) {
            this.connectedAnimationProgress = this.connected ? 1.0f : 0.0f;
        }
        invalidateSelf();
    }
}
