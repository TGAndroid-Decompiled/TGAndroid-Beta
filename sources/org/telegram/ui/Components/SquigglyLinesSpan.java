package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public class SquigglyLinesSpan extends CharacterStyle {
    private final Paint paint;
    private final Path path;

    @Override
    public void updateDrawState(TextPaint textPaint) {
    }

    public SquigglyLinesSpan() {
        Paint paint = new Paint(1);
        this.paint = paint;
        this.path = new Path();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    public void draw(Canvas canvas, float f, float f2, float f3) {
        float fDp = AndroidUtilities.dp(1.33f);
        float fDp2 = AndroidUtilities.dp(10.0f);
        float fDp3 = AndroidUtilities.dp(2.0f);
        this.paint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton));
        this.paint.setStrokeWidth(fDp);
        this.path.rewind();
        this.path.moveTo(f2, f);
        float f4 = f2;
        while (f4 < f3) {
            this.path.quadTo((fDp2 / 4.0f) + f4, f - fDp3, (fDp2 / 2.0f) + f4, f);
            f4 += fDp2;
            this.path.quadTo(((3.0f * fDp2) / 4.0f) + f4, f + fDp3, f4, f);
        }
        if (f4 > f3) {
            canvas.save();
            float f5 = fDp / 2.0f;
            canvas.clipRect(f2 - f5, (f - fDp3) - f5, f3 + f5, f + fDp3 + f5);
            canvas.drawPath(this.path, this.paint);
            canvas.restore();
            return;
        }
        canvas.drawPath(this.path, this.paint);
    }

    public static void drawOnText(Canvas canvas, Layout layout) {
        CharSequence text;
        if (layout == null || (text = layout.getText()) == null || !(text instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) text;
        SquigglyLinesSpan[] squigglyLinesSpanArr = (SquigglyLinesSpan[]) spanned.getSpans(0, spanned.length(), SquigglyLinesSpan.class);
        if (squigglyLinesSpanArr == null || squigglyLinesSpanArr.length == 0) {
            return;
        }
        for (SquigglyLinesSpan squigglyLinesSpan : squigglyLinesSpanArr) {
            int spanStart = spanned.getSpanStart(squigglyLinesSpan);
            int spanEnd = spanned.getSpanEnd(squigglyLinesSpan);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            int i = lineForOffset;
            while (i <= lineForOffset2) {
                squigglyLinesSpan.draw(canvas, layout.getLineBottom(i) - AndroidUtilities.dp(1.0f), layout.getPrimaryHorizontal(i == lineForOffset ? spanStart : layout.getLineStart(i)), layout.getPrimaryHorizontal(i == lineForOffset2 ? spanEnd : layout.getLineEnd(i) - 1));
                i++;
            }
        }
    }
}
