package org.telegram.p009ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import androidx.core.content.ContextCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.p009ui.ActionBar.Theme;

public class ColoredImageSpan extends ReplacementSpan {
    String colorKey;
    Drawable drawable;
    int drawableColor;
    private int size;
    private int topOffset;
    boolean usePaintColor;
    private final int verticalAlignment;

    public ColoredImageSpan(int i) {
        this(i, 0);
    }

    public ColoredImageSpan(Drawable drawable) {
        this(drawable, 0);
    }

    public ColoredImageSpan(int i, int i2) {
        this(ContextCompat.getDrawable(ApplicationLoader.applicationContext, i), i2);
    }

    public ColoredImageSpan(Drawable drawable, int i) {
        this.usePaintColor = true;
        this.topOffset = 0;
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

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3 = this.size;
        return i3 != 0 ? i3 : this.drawable.getIntrinsicWidth();
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int color;
        if (this.usePaintColor) {
            color = paint.getColor();
        } else {
            color = Theme.getColor(this.colorKey);
        }
        if (this.drawableColor != color) {
            this.drawableColor = color;
            this.drawable.setColorFilter(new PorterDuffColorFilter(this.drawableColor, PorterDuff.Mode.MULTIPLY));
        }
        canvas.save();
        Drawable drawable = this.drawable;
        int i6 = i5 - (drawable != null ? drawable.getBounds().bottom : i5);
        int i7 = this.verticalAlignment;
        if (i7 == 1) {
            i6 -= paint.getFontMetricsInt().descent;
        } else if (i7 == 2) {
            int i8 = i3 + ((i5 - i3) / 2);
            Drawable drawable2 = this.drawable;
            i6 = i8 - (drawable2 != null ? drawable2.getBounds().height() / 2 : 0);
        } else if (i7 == 0) {
            int i9 = i5 - i3;
            int i10 = this.size;
            if (i10 == 0) {
                i10 = this.drawable.getIntrinsicHeight();
            }
            i6 = AndroidUtilities.m35dp(this.topOffset) + i3 + ((i9 - i10) / 2);
        }
        canvas.translate(f, i6);
        Drawable drawable3 = this.drawable;
        if (drawable3 != null) {
            drawable3.draw(canvas);
        }
        canvas.restore();
    }

    public void setColorKey(String str) {
        this.colorKey = str;
        this.usePaintColor = str == null;
    }

    public void setTopOffset(int i) {
        this.topOffset = i;
    }
}
