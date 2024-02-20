package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.TypedValue;
import org.telegram.ui.ActionBar.Theme;
public class HintEditText extends EditTextBoldCursor {
    protected TextPaint hintPaint;
    private String hintText;
    private android.graphics.Rect rect;

    protected void onPreDrawHintCharacter(int i, Canvas canvas, float f, float f2) {
    }

    protected boolean shouldDrawBehindText(int i) {
        return false;
    }

    public HintEditText(Context context) {
        super(context);
        this.hintPaint = new TextPaint(1);
        this.rect = new android.graphics.Rect();
        this.hintPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
    }

    @Override
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.hintPaint.setTextSize(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
    }

    public String getHintText() {
        return this.hintText;
    }

    public void setHintText(String str) {
        this.hintText = str;
        onTextChange();
        setText(getText());
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        onTextChange();
    }

    public void onTextChange() {
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float measureText;
        if (this.hintText != null && length() < this.hintText.length()) {
            float f = 0.0f;
            for (int i = 0; i < this.hintText.length(); i++) {
                if (i < length()) {
                    measureText = getPaint().measureText(getText(), i, i + 1);
                } else {
                    measureText = this.hintPaint.measureText(this.hintText, i, i + 1);
                }
                float f2 = measureText;
                if (shouldDrawBehindText(i) || i >= length()) {
                    int color = this.hintPaint.getColor();
                    canvas.save();
                    TextPaint textPaint = this.hintPaint;
                    String str = this.hintText;
                    textPaint.getTextBounds(str, 0, str.length(), this.rect);
                    float height = (getHeight() + this.rect.height()) / 2.0f;
                    onPreDrawHintCharacter(i, canvas, f, height);
                    canvas.drawText(this.hintText, i, i + 1, f, height, (Paint) this.hintPaint);
                    f += f2;
                    canvas.restore();
                    this.hintPaint.setColor(color);
                } else {
                    f += f2;
                }
            }
        }
        super.onDraw(canvas);
    }
}
