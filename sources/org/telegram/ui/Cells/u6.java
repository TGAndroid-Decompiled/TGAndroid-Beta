package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.r11;
public final class u6 extends ImageSpan {
    public static r11 f30577b;
    public final int f30578a = 1;

    public u6(Drawable drawable) {
        super(drawable);
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        switch (this.f30578a) {
            case 0:
                Drawable drawable = getDrawable();
                canvas.save();
                Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                int i14 = fontMetricsInt.descent;
                canvas.translate(f10, ((i12 + i14) - ((i14 - fontMetricsInt.ascent) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2));
                if (hd.f22878a0) {
                    canvas.scale(-1.0f, 1.0f, drawable.getIntrinsicWidth() / 2, drawable.getIntrinsicHeight() / 2);
                }
                drawable.draw(canvas);
                canvas.restore();
                return;
            default:
                super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
                return;
        }
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f30578a) {
            case 0:
                Rect bounds = getDrawable().getBounds();
                if (fontMetricsInt != null) {
                    Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                    int i11 = fontMetricsInt2.descent;
                    int i12 = fontMetricsInt2.ascent;
                    int i13 = ((i11 - i12) / 2) + i12;
                    int i14 = (bounds.bottom - bounds.top) / 2;
                    int i15 = i13 - i14;
                    fontMetricsInt.ascent = i15;
                    fontMetricsInt.top = i15;
                    int i16 = i13 + i14;
                    fontMetricsInt.bottom = i16;
                    fontMetricsInt.descent = i16;
                }
                return bounds.right;
            default:
                return super.getSize(paint, charSequence, i7, i10, fontMetricsInt);
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f30578a) {
            case 1:
                float textSize = textPaint.getTextSize() * 0.89f;
                int i7 = (int) (0.02f * textSize);
                getDrawable().setBounds(0, i7, (int) textSize, ((int) (textSize * 1.25f)) + i7);
                super.updateDrawState(textPaint);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }

    public u6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u6.<init>():void");
    }
}
