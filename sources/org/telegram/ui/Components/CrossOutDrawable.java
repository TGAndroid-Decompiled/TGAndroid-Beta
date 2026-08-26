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

public final class CrossOutDrawable extends Drawable {
    public int color;
    public final int colorKey;
    public boolean cross;
    public final Drawable iconDrawable;
    public float lenOffsetBottom;
    public float lenOffsetTop;
    public final Paint paint;
    public float progress;
    public final RectF rectF = new RectF();
    public float xOffset;
    public final Paint xRefPaint;

    public CrossOutDrawable(Context context, int i, int i2) {
        Paint paint = new Paint(1);
        this.paint = paint;
        Paint paint2 = new Paint(1);
        this.xRefPaint = paint2;
        this.iconDrawable = context.getDrawable(i);
        this.colorKey = i2;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(2.5f));
    }

    @Override
    public final void draw(Canvas canvas) {
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
        int i2 = this.color;
        Drawable drawable = this.iconDrawable;
        Paint paint = this.paint;
        if (i2 != color) {
            this.color = color;
            paint.setColor(color);
            drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
        }
        if (this.progress == 0.0f) {
            drawable.draw(canvas);
            return;
        }
        RectF rectF = this.rectF;
        rectF.set(drawable.getBounds());
        canvas.saveLayerAlpha(rectF, 255, 31);
        drawable.draw(canvas);
        float fDpf2 = AndroidUtilities.dpf2(4.5f) + rectF.left + this.xOffset + this.lenOffsetTop;
        float fDpf3 = ((AndroidUtilities.dpf2(4.5f) + rectF.top) - AndroidUtilities.dp(1.0f)) + this.lenOffsetTop;
        float fDp = ((rectF.right - AndroidUtilities.dp(3.0f)) + this.xOffset) - this.lenOffsetBottom;
        float fDp2 = ((rectF.bottom - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(3.0f)) - this.lenOffsetBottom;
        if (this.cross) {
            float f3 = this.progress;
            fDp = ((fDp - fDpf2) * f3) + fDpf2;
            fDp2 = DiffUtil.m(fDp2, fDpf3, f3, fDpf3);
        } else {
            float f4 = this.progress;
            fDpf2 = DiffUtil.m(1.0f, f4, fDp - fDpf2, fDpf2);
            fDpf3 = DiffUtil.m(1.0f, f4, fDp2 - fDpf3, fDpf3);
        }
        float f5 = fDp2;
        float f6 = fDpf3;
        float f7 = fDpf2;
        float f8 = fDp;
        float strokeWidth = f6 - paint.getStrokeWidth();
        float strokeWidth2 = f5 - paint.getStrokeWidth();
        Paint paint2 = this.xRefPaint;
        canvas.drawLine(f7, strokeWidth, f8, strokeWidth2, paint2);
        float strokeWidth3 = ((paint2.getStrokeWidth() - paint.getStrokeWidth()) / 2.0f) + 1.0f;
        canvas.drawLine(f7, f6 - strokeWidth3, f8, f5 - strokeWidth3, paint2);
        canvas.drawLine(f7, f6, f8, f5, paint);
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.iconDrawable.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.iconDrawable.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.iconDrawable.setBounds(i, i2, i3, i4);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setCrossOut(boolean z, boolean z2) {
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
}
