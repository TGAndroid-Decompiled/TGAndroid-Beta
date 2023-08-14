package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import androidx.core.content.ContextCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.ActionBar.Theme;
public class ColoredImageSpan extends ReplacementSpan {
    private float alpha;
    private Runnable checkColorDelegate;
    int colorKey;
    Drawable drawable;
    int drawableColor;
    private int overrideColor;
    private float scaleX;
    private float scaleY;
    private int size;
    private int sizeWidth;
    private int topOffset;
    private float translateX;
    private float translateY;
    boolean usePaintColor;
    private final int verticalAlignment;

    public ColoredImageSpan(int i) {
        this(i, 0);
    }

    public ColoredImageSpan(Drawable drawable) {
        this(drawable, 0);
    }

    public ColoredImageSpan(int i, int i2) {
        this(ContextCompat.getDrawable(ApplicationLoader.applicationContext, i).mutate(), i2);
    }

    public ColoredImageSpan(Drawable drawable, int i) {
        this.usePaintColor = true;
        this.topOffset = 0;
        this.alpha = 1.0f;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.drawable = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        this.verticalAlignment = i;
    }

    public void setSize(int i) {
        this.size = i;
        this.drawable.setBounds(0, 0, i, i);
    }

    public void setTranslateX(float f) {
        this.translateX = f;
    }

    public void translate(float f, float f2) {
        this.translateX = f;
        this.translateY = f2;
    }

    public void setWidth(int i) {
        this.sizeWidth = i;
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float abs;
        int i3;
        if (this.sizeWidth != 0) {
            abs = Math.abs(this.scaleX);
            i3 = this.sizeWidth;
        } else {
            abs = Math.abs(this.scaleX);
            i3 = this.size;
            if (i3 == 0) {
                i3 = this.drawable.getIntrinsicWidth();
            }
        }
        return (int) (abs * i3);
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Runnable runnable = this.checkColorDelegate;
        if (runnable != null) {
            runnable.run();
        } else {
            int i6 = this.overrideColor;
            if (i6 == 0) {
                if (this.usePaintColor) {
                    i6 = paint.getColor();
                } else {
                    i6 = Theme.getColor(this.colorKey);
                }
            }
            if (this.drawableColor != i6) {
                this.drawableColor = i6;
                this.drawable.setColorFilter(new PorterDuffColorFilter(this.drawableColor, PorterDuff.Mode.MULTIPLY));
            }
        }
        canvas.save();
        Drawable drawable = this.drawable;
        int i7 = i5 - (drawable != null ? drawable.getBounds().bottom : i5);
        int i8 = this.verticalAlignment;
        if (i8 != 1) {
            if (i8 == 2) {
                int i9 = i3 + ((i5 - i3) / 2);
                Drawable drawable2 = this.drawable;
                i7 = i9 - (drawable2 != null ? drawable2.getBounds().height() / 2 : 0);
            } else if (i8 == 0) {
                int i10 = i5 - i3;
                int i11 = this.size;
                if (i11 == 0) {
                    i11 = this.drawable.getIntrinsicHeight();
                }
                i7 = AndroidUtilities.dp(this.topOffset) + i3 + ((i10 - i11) / 2);
            }
        }
        canvas.translate(f + this.translateX, i7 + this.translateY);
        Drawable drawable3 = this.drawable;
        if (drawable3 != null) {
            float f2 = this.scaleX;
            if (f2 != 1.0f || this.scaleY != 1.0f) {
                canvas.scale(f2, this.scaleY, 0.0f, drawable3.getBounds().centerY());
            }
            float f3 = this.alpha;
            if (f3 != 1.0f) {
                this.drawable.setAlpha((int) (f3 * 255.0f));
            }
            this.drawable.draw(canvas);
        }
        canvas.restore();
    }

    public void setColorKey(int i) {
        this.colorKey = i;
        this.usePaintColor = i < 0;
    }

    public void setTopOffset(int i) {
        this.topOffset = i;
    }

    public void setScale(float f) {
        this.scaleX = f;
    }

    public void setScale(float f, float f2) {
        this.scaleX = f;
        this.scaleY = f2;
    }

    public void setOverrideColor(int i) {
        this.overrideColor = i;
    }

    public void setAlpha(float f) {
        this.alpha = f;
    }
}
