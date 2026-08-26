package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.RichMessageLayout$MediaCell$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;

public class ColoredImageSpan extends ReplacementSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_CENTER = 2;
    public static final int ALIGN_DEFAULT = 0;
    private float alpha;
    private Runnable checkColorDelegate;
    int colorKey;
    public boolean draw;
    public Drawable drawable;
    int drawableColor;
    private Paint.FontMetricsInt fontMetrics;
    private boolean isRelativeSize;
    private int overrideColor;
    public boolean recolorDrawable;
    public float rotate;
    private float scaleX;
    private float scaleY;
    private int size;
    private int sizeWidth;
    public float spaceScaleX;
    private int topOffset;
    public float translateX;
    public float translateY;
    public boolean useLinkPaintColor;
    boolean usePaintColor;
    private final int verticalAlignment;

    public ColoredImageSpan(int i) {
        this(i, 0);
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        boolean z;
        Drawable drawable;
        int i6;
        int iM;
        int i7;
        Drawable drawable2;
        float f2;
        float f3;
        int intrinsicHeight;
        if (this.draw) {
            Runnable runnable = this.checkColorDelegate;
            if (runnable == null) {
                if (this.recolorDrawable) {
                    int color = this.overrideColor;
                    if (color == 0) {
                        if (this.useLinkPaintColor && (paint instanceof TextPaint)) {
                            color = ((TextPaint) paint).linkColor;
                        } else if (this.usePaintColor) {
                            color = paint.getColor();
                            z = true;
                        } else {
                            color = Theme.getColor(null, this.colorKey, false);
                        }
                        z = false;
                    } else {
                        z = false;
                    }
                    if (this.drawableColor != color) {
                        this.drawableColor = color;
                        this.drawable.setColorFilter(new PorterDuffColorFilter(this.drawableColor, PorterDuff.Mode.SRC_IN));
                    }
                }
                canvas.save();
                drawable = this.drawable;
                if (drawable != null) {
                    i6 = drawable.getBounds().bottom;
                } else {
                    i6 = i5;
                }
                iM = i5 - i6;
                i7 = this.verticalAlignment;
                if (i7 != 1) {
                    if (i7 == 2) {
                        int iM2 = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(i5, i3, 2, i3);
                        Drawable drawable3 = this.drawable;
                        iM = iM2 - (drawable3 != null ? drawable3.getBounds().height() / 2 : 0);
                    } else if (i7 == 0) {
                        int i8 = i5 - i3;
                        intrinsicHeight = this.size;
                        if (intrinsicHeight == 0) {
                            intrinsicHeight = this.drawable.getIntrinsicHeight();
                        }
                        iM = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(i8, intrinsicHeight, 2, i3) + AndroidUtilities.dp(this.topOffset);
                    }
                }
                canvas.translate(f + this.translateX, iM + this.translateY);
                drawable2 = this.drawable;
                if (drawable2 != null) {
                    f2 = this.scaleX;
                    if (f2 == 1.0f || this.scaleY != 1.0f) {
                        canvas.scale(f2, this.scaleY, 0.0f, drawable2.getBounds().centerY());
                    }
                    f3 = this.rotate;
                    if (f3 != 1.0f) {
                        canvas.rotate(f3, this.drawable.getBounds().centerX(), this.drawable.getBounds().centerY());
                    }
                    if (z) {
                        this.drawable.setAlpha((int) ((paint.getAlpha() / Color.alpha(this.drawableColor)) * this.alpha * 255.0f));
                    } else {
                        this.drawable.setAlpha((int) (paint.getAlpha() * this.alpha));
                    }
                    this.drawable.draw(canvas);
                }
                canvas.restore();
            }
            runnable.run();
            z = false;
            canvas.save();
            drawable = this.drawable;
            if (drawable != null) {
                i6 = drawable.getBounds().bottom;
            } else {
                i6 = i5;
            }
            iM = i5 - i6;
            i7 = this.verticalAlignment;
            if (i7 != 1) {
                if (i7 == 2) {
                    int iM3 = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(i5, i3, 2, i3);
                    Drawable drawable4 = this.drawable;
                    iM = iM3 - (drawable4 != null ? drawable4.getBounds().height() / 2 : 0);
                } else if (i7 == 0) {
                    int i9 = i5 - i3;
                    intrinsicHeight = this.size;
                    if (intrinsicHeight == 0) {
                        intrinsicHeight = this.drawable.getIntrinsicHeight();
                    }
                    iM = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(i9, intrinsicHeight, 2, i3) + AndroidUtilities.dp(this.topOffset);
                }
            }
            canvas.translate(f + this.translateX, iM + this.translateY);
            drawable2 = this.drawable;
            if (drawable2 != null) {
                f2 = this.scaleX;
                if (f2 == 1.0f) {
                    canvas.scale(f2, this.scaleY, 0.0f, drawable2.getBounds().centerY());
                } else {
                    canvas.scale(f2, this.scaleY, 0.0f, drawable2.getBounds().centerY());
                }
                f3 = this.rotate;
                if (f3 != 1.0f) {
                    canvas.rotate(f3, this.drawable.getBounds().centerX(), this.drawable.getBounds().centerY());
                }
                if (z) {
                    this.drawable.setAlpha((int) ((paint.getAlpha() / Color.alpha(this.drawableColor)) * this.alpha * 255.0f));
                } else {
                    this.drawable.setAlpha((int) (paint.getAlpha() * this.alpha));
                }
                this.drawable.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (!this.isRelativeSize || this.fontMetrics == null) {
            if (this.sizeWidth != 0) {
                return (int) (Math.abs(this.scaleX) * this.sizeWidth);
            }
            float fAbs = Math.abs(this.spaceScaleX) * Math.abs(this.scaleX);
            int intrinsicWidth = this.size;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.drawable.getIntrinsicWidth();
            }
            return (int) (fAbs * intrinsicWidth);
        }
        if (fontMetricsInt == null) {
            fontMetricsInt = new Paint.FontMetricsInt();
        }
        Paint.FontMetricsInt fontMetricsInt2 = this.fontMetrics;
        fontMetricsInt.ascent = fontMetricsInt2.ascent;
        fontMetricsInt.descent = fontMetricsInt2.descent;
        fontMetricsInt.top = fontMetricsInt2.top;
        fontMetricsInt.bottom = fontMetricsInt2.bottom;
        return (int) (Math.abs(this.spaceScaleX) * Math.abs(this.scaleX) * this.size);
    }

    public void rotate(float f) {
        this.rotate = f;
    }

    public void setAlpha(float f) {
        this.alpha = f;
    }

    public void setCheckColorDelegate(Runnable runnable) {
        this.checkColorDelegate = runnable;
    }

    public void setColorKey(int i) {
        this.colorKey = i;
        this.usePaintColor = i < 0;
    }

    public void setOverrideColor(int i) {
        this.overrideColor = i;
    }

    public void setRelativeSize(Paint.FontMetricsInt fontMetricsInt) {
        this.isRelativeSize = true;
        this.fontMetrics = fontMetricsInt;
        if (fontMetricsInt != null) {
            setSize(Math.abs(this.fontMetrics.ascent) + Math.abs(fontMetricsInt.descent));
            if (this.size == 0) {
                setSize(AndroidUtilities.dp(20.0f));
            }
        }
    }

    public void setScale(float f) {
        this.scaleX = f;
    }

    public void setSize(int i) {
        this.size = i;
        this.drawable.setBounds(0, 0, i, i);
    }

    public void setTopOffset(int i) {
        this.topOffset = i;
    }

    public void setTranslateX(float f) {
        this.translateX = f;
    }

    public void setTranslateY(float f) {
        this.translateY = f;
    }

    public void setWidth(int i) {
        this.sizeWidth = i;
    }

    public void translate(float f, float f2) {
        this.translateX = f;
        this.translateY = f2;
    }

    public ColoredImageSpan(Drawable drawable) {
        this(drawable, 0);
    }

    public void setScale(float f, float f2) {
        this.scaleX = f;
        this.scaleY = f2;
    }

    public ColoredImageSpan(int i, int i2) {
        this(ApplicationLoader.applicationContext.getDrawable(i).mutate(), i2);
    }

    public ColoredImageSpan(Drawable drawable, int i) {
        this.draw = true;
        this.recolorDrawable = true;
        this.usePaintColor = true;
        this.useLinkPaintColor = false;
        this.topOffset = 0;
        this.alpha = 1.0f;
        this.spaceScaleX = 1.0f;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.drawable = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        this.verticalAlignment = i;
    }
}
