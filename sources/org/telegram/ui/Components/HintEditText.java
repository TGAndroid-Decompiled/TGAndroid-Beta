package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.TypedValue;
import org.telegram.ui.ActionBar.Theme;

public class HintEditText extends EditTextBoldCursor {
    protected TextPaint hintPaint;
    private String hintText;
    private Rect rect;

    public HintEditText(Context context) {
        super(context);
        this.hintPaint = new TextPaint(1);
        this.rect = new Rect();
        this.hintPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
    }

    public String getHintText() {
        return this.hintText;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.hintText != null && length() < this.hintText.length()) {
            int i = 0;
            float f = 0.0f;
            while (i < this.hintText.length()) {
                float fMeasureText = i < length() ? getPaint().measureText(getText(), i, i + 1) : this.hintPaint.measureText(this.hintText, i, i + 1);
                if (shouldDrawBehindText(i) || i >= length()) {
                    int color = this.hintPaint.getColor();
                    canvas.save();
                    TextPaint textPaint = this.hintPaint;
                    String str = this.hintText;
                    textPaint.getTextBounds(str, 0, str.length(), this.rect);
                    float fHeight = (this.rect.height() + getHeight()) / 2.0f;
                    onPreDrawHintCharacter(i, canvas, f, fHeight);
                    canvas2 = canvas;
                    canvas2.drawText(this.hintText, i, i + 1, f, fHeight, (Paint) this.hintPaint);
                    f += fMeasureText;
                    canvas2.restore();
                    this.hintPaint.setColor(color);
                } else {
                    f += fMeasureText;
                    canvas2 = canvas;
                }
                i++;
                canvas = canvas2;
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        onTextChange();
    }

    public void onPreDrawHintCharacter(int i, Canvas canvas, float f, float f2) {
    }

    public void onTextChange() {
        invalidate();
    }

    public void setHintText(String str) {
        this.hintText = str;
        onTextChange();
        setText(getText());
    }

    @Override
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.hintPaint.setTextSize(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
    }

    public boolean shouldDrawBehindText(int i) {
        return false;
    }
}
