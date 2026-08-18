package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public class CrossOutDrawable extends Drawable {
    int color;
    int colorKey;
    boolean cross;
    Drawable iconDrawable;
    private float lenOffsetBottom;
    private float lenOffsetTop;
    float progress;
    private float xOffset;
    final Paint xRefPaint;
    RectF rectF = new RectF();
    Paint paint = new Paint(1);

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public CrossOutDrawable(Context context, int i, int i2) {
        Paint paint = new Paint(1);
        this.xRefPaint = paint;
        this.iconDrawable = ContextCompat.getDrawable(context, i);
        this.colorKey = i2;
        Paint paint2 = this.paint;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.paint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.5f));
    }

    public void setCrossOut(boolean z, boolean z2) {
        if (this.cross != z) {
            this.cross = z;
            if (!z2) {
                this.progress = z ? 1.0f : 0.0f;
            } else {
                this.progress = z ? 0.0f : 1.0f;
            }
            invalidateSelf();
        }
    }

    @Override
    public void draw(Canvas canvas) {
        float f;
        boolean z = this.cross;
        if (z) {
            float f2 = this.progress;
            if (f2 != 1.0f) {
                this.progress = f2 + 0.10666667f;
                invalidateSelf();
                if (this.progress > 1.0f) {
                    this.progress = 1.0f;
                }
            } else if (!z) {
                f = this.progress;
                if (f != 0.0f) {
                    this.progress = f - 0.10666667f;
                    invalidateSelf();
                    if (this.progress < 0.0f) {
                        this.progress = 0.0f;
                    }
                }
            }
        } else if (!z) {
            f = this.progress;
            if (f != 0.0f) {
                this.progress = f - 0.10666667f;
                invalidateSelf();
                if (this.progress < 0.0f) {
                    this.progress = 0.0f;
                }
            }
        }
        int i = this.colorKey;
        int color = i < 0 ? -1 : Theme.getColor(i);
        if (this.color != color) {
            this.color = color;
            this.paint.setColor(color);
            this.iconDrawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
        }
        if (this.progress == 0.0f) {
            this.iconDrawable.draw(canvas);
            return;
        }
        this.rectF.set(this.iconDrawable.getBounds());
        canvas.saveLayerAlpha(this.rectF, 255, 31);
        this.iconDrawable.draw(canvas);
        float fDpf2 = this.rectF.left + AndroidUtilities.dpf2(4.5f) + this.xOffset + this.lenOffsetTop;
        float fDpf3 = ((this.rectF.top + AndroidUtilities.dpf2(4.5f)) - AndroidUtilities.dp(1.0f)) + this.lenOffsetTop;
        float fDp = ((this.rectF.right - AndroidUtilities.dp(3.0f)) + this.xOffset) - this.lenOffsetBottom;
        float fDp2 = ((this.rectF.bottom - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(3.0f)) - this.lenOffsetBottom;
        if (this.cross) {
            float f3 = this.progress;
            fDp = ((fDp - fDpf2) * f3) + fDpf2;
            fDp2 = ((fDp2 - fDpf3) * f3) + fDpf3;
        } else {
            float f4 = 1.0f - this.progress;
            fDpf2 += (fDp - fDpf2) * f4;
            fDpf3 += (fDp2 - fDpf3) * f4;
        }
        float f5 = fDpf2;
        float f6 = fDp;
        canvas.drawLine(f5, fDpf3 - this.paint.getStrokeWidth(), f6, fDp2 - this.paint.getStrokeWidth(), this.xRefPaint);
        float strokeWidth = ((this.xRefPaint.getStrokeWidth() - this.paint.getStrokeWidth()) / 2.0f) + 1.0f;
        canvas.drawLine(f5, fDpf3 - strokeWidth, f6, fDp2 - strokeWidth, this.xRefPaint);
        canvas.drawLine(f5, fDpf3, f6, fDp2, this.paint);
        canvas.restore();
    }

    @Override
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.iconDrawable.setBounds(i, i2, i3, i4);
    }

    @Override
    public int getIntrinsicHeight() {
        return this.iconDrawable.getIntrinsicHeight();
    }

    @Override
    public int getIntrinsicWidth() {
        return this.iconDrawable.getIntrinsicWidth();
    }

    public void setOffsets(float f, float f2, float f3) {
        this.xOffset = f;
        this.lenOffsetTop = f2;
        this.lenOffsetBottom = f3;
        invalidateSelf();
    }

    public void setStrokeWidth(float f) {
        this.paint.setStrokeWidth(f);
        this.xRefPaint.setStrokeWidth(f * 1.47f);
    }

    public float getProgress() {
        return this.progress;
    }
}
