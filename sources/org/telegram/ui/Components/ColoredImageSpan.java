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
    String colorKey;
    Drawable drawable;
    int drawableColor;
    private int size;
    private int topOffset;
    boolean usePaintColor;

    public ColoredImageSpan(int i) {
        this(ContextCompat.getDrawable(ApplicationLoader.applicationContext, i));
    }

    public ColoredImageSpan(Drawable drawable) {
        this.usePaintColor = true;
        this.topOffset = 0;
        this.drawable = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
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
        int i6;
        if (this.usePaintColor) {
            i6 = paint.getColor();
        } else {
            i6 = Theme.getColor(this.colorKey);
        }
        if (this.drawableColor != i6) {
            this.drawableColor = i6;
            this.drawable.setColorFilter(new PorterDuffColorFilter(this.drawableColor, PorterDuff.Mode.MULTIPLY));
        }
        int i7 = i5 - i3;
        int i8 = this.size;
        if (i8 == 0) {
            i8 = this.drawable.getIntrinsicHeight();
        }
        canvas.save();
        canvas.translate(f, i3 + ((i7 - i8) / 2) + AndroidUtilities.dp(this.topOffset));
        this.drawable.draw(canvas);
        canvas.restore();
    }

    public void setTopOffset(int i) {
        this.topOffset = i;
    }
}
