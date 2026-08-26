package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;

public final class SquigglyLinesSpan extends CharacterStyle {
    public final Paint paint;
    public final Path path;

    public SquigglyLinesSpan() {
        Paint paint = new Paint(1);
        this.paint = paint;
        this.path = new Path();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    public static void drawOnText(Canvas canvas, Layout layout) {
        CharSequence text;
        Layout layout2 = layout;
        if (layout2 == null || (text = layout2.getText()) == null || !(text instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) text;
        SquigglyLinesSpan[] squigglyLinesSpanArr = (SquigglyLinesSpan[]) spanned.getSpans(0, spanned.length(), SquigglyLinesSpan.class);
        if (squigglyLinesSpanArr == null || squigglyLinesSpanArr.length == 0) {
            return;
        }
        int i = 0;
        while (i < squigglyLinesSpanArr.length) {
            SquigglyLinesSpan squigglyLinesSpan = squigglyLinesSpanArr[i];
            int spanStart = spanned.getSpanStart(squigglyLinesSpan);
            int spanEnd = spanned.getSpanEnd(squigglyLinesSpan);
            int lineForOffset = layout2.getLineForOffset(spanStart);
            int lineForOffset2 = layout2.getLineForOffset(spanEnd);
            int i2 = lineForOffset;
            while (i2 <= lineForOffset2) {
                float lineBottom = layout2.getLineBottom(i2) - AndroidUtilities.dp(1.0f);
                float primaryHorizontal = layout2.getPrimaryHorizontal(i2 == lineForOffset ? spanStart : layout2.getLineStart(i2));
                float primaryHorizontal2 = layout2.getPrimaryHorizontal(i2 == lineForOffset2 ? spanEnd : layout2.getLineEnd(i2) - 1);
                squigglyLinesSpan.getClass();
                float fDp = AndroidUtilities.dp(1.33f);
                float fDp2 = AndroidUtilities.dp(10.0f);
                float fDp3 = AndroidUtilities.dp(2.0f);
                Paint paint = squigglyLinesSpan.paint;
                Spanned spanned2 = spanned;
                SquigglyLinesSpan[] squigglyLinesSpanArr2 = squigglyLinesSpanArr;
                int i3 = i;
                paint.setColor(Theme.getColor(null, Theme.key_featuredStickers_addButton, false));
                paint.setStrokeWidth(fDp);
                Path path = squigglyLinesSpan.path;
                path.rewind();
                path.moveTo(primaryHorizontal, lineBottom);
                float f = primaryHorizontal;
                while (f < primaryHorizontal2) {
                    path.quadTo((fDp2 / 4.0f) + f, lineBottom - fDp3, (fDp2 / 2.0f) + f, lineBottom);
                    f += fDp2;
                    path.quadTo(Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(fDp2, 3.0f, 4.0f, f), lineBottom + fDp3, f, lineBottom);
                    squigglyLinesSpan = squigglyLinesSpan;
                    spanStart = spanStart;
                }
                SquigglyLinesSpan squigglyLinesSpan2 = squigglyLinesSpan;
                int i4 = spanStart;
                if (f > primaryHorizontal2) {
                    canvas.save();
                    float f2 = fDp / 2.0f;
                    canvas.clipRect(primaryHorizontal - f2, (lineBottom - fDp3) - f2, primaryHorizontal2 + f2, lineBottom + fDp3 + f2);
                    canvas.drawPath(path, paint);
                    canvas.restore();
                } else {
                    canvas.drawPath(path, paint);
                }
                i2++;
                layout2 = layout;
                spanned = spanned2;
                squigglyLinesSpanArr = squigglyLinesSpanArr2;
                i = i3;
                squigglyLinesSpan = squigglyLinesSpan2;
                spanStart = i4;
            }
            i++;
            layout2 = layout;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
    }
}
