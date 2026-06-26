package org.telegram.ui.iv;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.FileLog;
import ru.noties.jlatexmath.JLatexMathDrawable;

public class MathSpan extends ReplacementSpan {
    private final Bitmap bitmap;
    private final int depth;
    private final int height;
    private final Paint paint;
    public final String source;
    private final int width;

    private MathSpan(String str, Bitmap bitmap, int i, int i2, int i3, int i4) {
        Paint paint = new Paint(3);
        this.paint = paint;
        this.source = str;
        this.bitmap = bitmap;
        this.width = i;
        this.height = i2;
        this.depth = i4;
        paint.setColor(i3);
    }

    public static MathSpan create(String str, int i, float f) {
        int iconDepth;
        if (str != null && !str.isEmpty()) {
            try {
                JLatexMathDrawable jLatexMathDrawableBuild = JLatexMathDrawable.builder(str).textSize(f).build();
                int intrinsicWidth = jLatexMathDrawableBuild.getIntrinsicWidth();
                int intrinsicHeight = jLatexMathDrawableBuild.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                    jLatexMathDrawableBuild.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    jLatexMathDrawableBuild.draw(new Canvas(bitmapCreateBitmap));
                    try {
                        iconDepth = jLatexMathDrawableBuild.icon().getIconDepth();
                    } catch (Throwable th) {
                        FileLog.e(th);
                        iconDepth = 0;
                    }
                    return new MathSpan(str, bitmapCreateBitmap, intrinsicWidth, intrinsicHeight, i, iconDepth);
                }
                return null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return null;
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i3 = this.height;
            int i4 = this.depth;
            int i5 = -(i3 - i4);
            fontMetricsInt.ascent = i5;
            fontMetricsInt.top = i5;
            fontMetricsInt.descent = i4;
            fontMetricsInt.bottom = i4;
        }
        return this.width;
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.bitmap == null) {
            return;
        }
        this.paint.setColor(paint.getColor());
        canvas.drawBitmap(this.bitmap, f, i4 - (this.height - this.depth), this.paint);
    }

    public static String sourceAt(CharSequence charSequence, int i, int i2) {
        if (!(charSequence instanceof Spanned)) {
            return null;
        }
        MathSpan[] mathSpanArr = (MathSpan[]) ((Spanned) charSequence).getSpans(i, i2, MathSpan.class);
        if (mathSpanArr.length > 0) {
            return mathSpanArr[0].source;
        }
        return null;
    }
}
