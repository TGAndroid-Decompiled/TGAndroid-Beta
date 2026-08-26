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
import androidx.recyclerview.widget.DiffUtil;
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

    public CrossOutDrawable(Context context, int i, int i2) {
        Paint paint = new Paint(1);
        this.xRefPaint = paint;
        this.iconDrawable = context.getDrawable(i);
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
        int color = i < 0 ? -1 : Theme.getColor(null, i, false);
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
        float fDpf2 = AndroidUtilities.dpf2(4.5f) + this.rectF.left + this.xOffset + this.lenOffsetTop;
        float fDpf3 = ((AndroidUtilities.dpf2(4.5f) + this.rectF.top) - AndroidUtilities.dp(1.0f)) + this.lenOffsetTop;
        float fDp = ((this.rectF.right - AndroidUtilities.dp(3.0f)) + this.xOffset) - this.lenOffsetBottom;
        float fDp2 = ((this.rectF.bottom - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(3.0f)) - this.lenOffsetBottom;
        if (this.cross) {
            float f3 = this.progress;
            fDp = ((fDp - fDpf2) * f3) + fDpf2;
            fDp2 = DiffUtil.m(fDp2, fDpf3, f3, fDpf3);
        } else {
            float f4 = this.progress;
            fDpf2 = DiffUtil.m(1.0f, f4, fDp - fDpf2, fDpf2);
            fDpf3 = DiffUtil.m(1.0f, f4, fDp2 - fDpf3, fDpf3);
        }
        float f5 = fDp;
        float f6 = fDpf2;
        canvas.drawLine(f6, fDpf3 - this.paint.getStrokeWidth(), f5, fDp2 - this.paint.getStrokeWidth(), this.xRefPaint);
        float strokeWidth = ((this.xRefPaint.getStrokeWidth() - this.paint.getStrokeWidth()) / 2.0f) + 1.0f;
        canvas.drawLine(f6, fDpf3 - strokeWidth, f5, fDp2 - strokeWidth, this.xRefPaint);
        canvas.drawLine(f6, fDpf3, f5, fDp2, this.paint);
        canvas.restore();
    }

    @Override
    public int getIntrinsicHeight() {
        return this.iconDrawable.getIntrinsicHeight();
    }

    @Override
    public int getIntrinsicWidth() {
        return this.iconDrawable.getIntrinsicWidth();
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    public float getProgress() {
        return this.progress;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.iconDrawable.setBounds(i, i2, i3, i4);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setColorKey(int i) {
        this.colorKey = i;
    }

    public void setCrossOut(boolean z, boolean z2) {
        if (this.cross != z) {
            this.cross = z;
            if (z2) {
                this.progress = z ? 0.0f : 1.0f;
            } else {
                this.progress = z ? 1.0f : 0.0f;
            }
            invalidateSelf();
        }
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
}
