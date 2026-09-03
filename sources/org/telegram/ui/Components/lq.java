package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public class lq extends ReplacementSpan {
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

    public lq(int i10) {
        this(i10, 0);
    }

    @Override
    public void draw(android.graphics.Canvas r4, java.lang.CharSequence r5, int r6, int r7, float r8, int r9, int r10, int r11, android.graphics.Paint r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lq.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (this.isRelativeSize && this.fontMetrics != null) {
            if (fontMetricsInt == null) {
                fontMetricsInt = new Paint.FontMetricsInt();
            }
            Paint.FontMetricsInt fontMetricsInt2 = this.fontMetrics;
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
            return (int) (Math.abs(this.spaceScaleX) * Math.abs(this.scaleX) * this.size);
        } else if (this.sizeWidth != 0) {
            return (int) (Math.abs(this.scaleX) * this.sizeWidth);
        } else {
            float abs = Math.abs(this.spaceScaleX) * Math.abs(this.scaleX);
            int i12 = this.size;
            if (i12 == 0) {
                i12 = this.drawable.getIntrinsicWidth();
            }
            return (int) (abs * i12);
        }
    }

    public void rotate(float f10) {
        this.rotate = f10;
    }

    public void setAlpha(float f10) {
        this.alpha = f10;
    }

    public void setCheckColorDelegate(Runnable runnable) {
        this.checkColorDelegate = runnable;
    }

    public void setColorKey(int i10) {
        boolean z4;
        this.colorKey = i10;
        if (i10 < 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.usePaintColor = z4;
    }

    public void setOverrideColor(int i10) {
        this.overrideColor = i10;
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

    public void setScale(float f10) {
        this.scaleX = f10;
    }

    public void setSize(int i10) {
        this.size = i10;
        this.drawable.setBounds(0, 0, i10, i10);
    }

    public void setTopOffset(int i10) {
        this.topOffset = i10;
    }

    public void setTranslateX(float f10) {
        this.translateX = f10;
    }

    public void setTranslateY(float f10) {
        this.translateY = f10;
    }

    public void setWidth(int i10) {
        this.sizeWidth = i10;
    }

    public void translate(float f10, float f11) {
        this.translateX = f10;
        this.translateY = f11;
    }

    public lq(Drawable drawable) {
        this(0, drawable);
    }

    public void setScale(float f10, float f11) {
        this.scaleX = f10;
        this.scaleY = f11;
    }

    public lq(int i10, int i11) {
        this(i11, ApplicationLoader.applicationContext.getDrawable(i10).mutate());
    }

    public lq(int i10, Drawable drawable) {
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
        this.verticalAlignment = i10;
    }
}
