package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.j21;

public final class s6 extends ImageSpan {

    public static j21 f25637b;

    public final int f25638a = 1;

    public s6(Drawable drawable) {
        super(drawable);
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        switch (this.f25638a) {
            case 0:
                Drawable drawable = getDrawable();
                canvas.save();
                Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                int i15 = fontMetricsInt.descent;
                canvas.translate(f10, ((i13 + i15) - ((i15 - fontMetricsInt.ascent) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2));
                if (LocaleController.isRTL) {
                    canvas.scale(-1.0f, 1.0f, drawable.getIntrinsicWidth() / 2, drawable.getIntrinsicHeight() / 2);
                }
                drawable.draw(canvas);
                canvas.restore();
                break;
            default:
                super.draw(canvas, charSequence, i10, i11, f10, i12, i13, i14, paint);
                break;
        }
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f25638a) {
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
        switch (this.f25638a) {
            case 1:
                float textSize = textPaint.getTextSize() * 0.89f;
                int i10 = (int) (0.02f * textSize);
                getDrawable().setBounds(0, i10, (int) textSize, ((int) (textSize * 1.25f)) + i10);
                super.updateDrawState(textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public s6() {
        j21 j21Var = f25637b;
        if (j21Var == null) {
            j21Var = new j21(org.telegram.ui.ActionBar.g6.f23247o2);
            f25637b = j21Var;
        }
        super(j21Var, 0);
        float textSize = org.telegram.ui.ActionBar.g6.f23247o2.getTextSize() * 0.89f;
        int i10 = (int) (0.02f * textSize);
        getDrawable().setBounds(0, i10, (int) textSize, ((int) (textSize * 1.25f)) + i10);
    }
}
