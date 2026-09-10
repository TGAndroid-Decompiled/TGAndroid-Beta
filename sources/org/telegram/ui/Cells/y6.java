package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.q31;
public final class y6 extends ImageSpan {
    public static q31 f20752b;
    public final int f20753a = 1;

    public y6(Drawable drawable) {
        super(drawable);
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        switch (this.f20753a) {
            case 0:
                Drawable drawable = getDrawable();
                canvas.save();
                Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                int i15 = fontMetricsInt.descent;
                canvas.translate(f7, ((i13 + i15) - ((i15 - fontMetricsInt.ascent) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2));
                if (LocaleController.isRTL) {
                    canvas.scale(-1.0f, 1.0f, drawable.getIntrinsicWidth() / 2, drawable.getIntrinsicHeight() / 2);
                }
                drawable.draw(canvas);
                canvas.restore();
                return;
            default:
                super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
                return;
        }
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f20753a) {
            case 0:
                Rect bounds = getDrawable().getBounds();
                if (fontMetricsInt != null) {
                    Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                    int i12 = fontMetricsInt2.descent;
                    int i13 = fontMetricsInt2.ascent;
                    int i14 = ((i12 - i13) / 2) + i13;
                    int i15 = (bounds.bottom - bounds.top) / 2;
                    int i16 = i14 - i15;
                    fontMetricsInt.ascent = i16;
                    fontMetricsInt.top = i16;
                    int i17 = i14 + i15;
                    fontMetricsInt.bottom = i17;
                    fontMetricsInt.descent = i17;
                }
                return bounds.right;
            default:
                return super.getSize(paint, charSequence, i10, i11, fontMetricsInt);
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f20753a) {
            case 1:
                float textSize = textPaint.getTextSize() * 0.89f;
                int i10 = (int) (0.02f * textSize);
                getDrawable().setBounds(0, i10, (int) textSize, ((int) (textSize * 1.25f)) + i10);
                super.updateDrawState(textPaint);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }

    public y6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.y6.<init>():void");
    }
}
