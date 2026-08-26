package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.TypedValue;
import org.telegram.ui.ActionBar.Theme;

public class HintEditText extends EditTextBoldCursor {
    public final TextPaint hintPaint;
    public String hintText;
    public final Rect rect;

    public HintEditText(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.hintPaint = textPaint;
        this.rect = new Rect();
        textPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
    }

    public String getHintText() {
        return this.hintText;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.hintText != null && length() < this.hintText.length()) {
            int i = 0;
            float f = 0.0f;
            while (i < this.hintText.length()) {
                int length = length();
                TextPaint textPaint = this.hintPaint;
                float fMeasureText = i < length ? getPaint().measureText(getText(), i, i + 1) : textPaint.measureText(this.hintText, i, i + 1);
                if (i < length()) {
                    f += fMeasureText;
                    canvas2 = canvas;
                } else {
                    int color = textPaint.getColor();
                    canvas.save();
                    String str = this.hintText;
                    int length2 = str.length();
                    Rect rect = this.rect;
                    textPaint.getTextBounds(str, 0, length2, rect);
                    float fHeight = (rect.height() + getHeight()) / 2.0f;
                    onPreDrawHintCharacter(i);
                    canvas2 = canvas;
                    canvas2.drawText(this.hintText, i, i + 1, f, fHeight, (Paint) textPaint);
                    f += fMeasureText;
                    canvas2.restore();
                    textPaint.setColor(color);
                }
                i++;
                canvas = canvas2;
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        invalidate();
    }

    public void onPreDrawHintCharacter(int i) {
    }

    public void setHintText(String str) {
        this.hintText = str;
        invalidate();
        setText(getText());
    }

    @Override
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.hintPaint.setTextSize(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
    }
}
