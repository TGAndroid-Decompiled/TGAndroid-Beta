package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.TypedValue;

public class u30 extends EditTextBoldCursor {

    public final TextPaint f32955b;

    public String f32956c;
    public final Rect d;

    public u30(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f32955b = textPaint;
        this.d = new Rect();
        textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
    }

    public String getHintText() {
        return this.f32956c;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f32956c != null && length() < this.f32956c.length()) {
            int i10 = 0;
            float f10 = 0.0f;
            while (i10 < this.f32956c.length()) {
                int length = length();
                TextPaint textPaint = this.f32955b;
                float fMeasureText = i10 < length ? getPaint().measureText(getText(), i10, i10 + 1) : textPaint.measureText(this.f32956c, i10, i10 + 1);
                if (i10 < length()) {
                    f10 += fMeasureText;
                    canvas2 = canvas;
                } else {
                    int color = textPaint.getColor();
                    canvas.save();
                    String str = this.f32956c;
                    int length2 = str.length();
                    Rect rect = this.d;
                    textPaint.getTextBounds(str, 0, length2, rect);
                    float fHeight = (rect.height() + getHeight()) / 2.0f;
                    i(i10);
                    canvas2 = canvas;
                    canvas2.drawText(this.f32956c, i10, i10 + 1, f10, fHeight, (Paint) textPaint);
                    f10 += fMeasureText;
                    canvas2.restore();
                    textPaint.setColor(color);
                }
                i10++;
                canvas = canvas2;
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        invalidate();
    }

    public void setHintText(String str) {
        this.f32956c = str;
        invalidate();
        setText(getText());
    }

    @Override
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        this.f32955b.setTextSize(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
    }

    public void i(int i10) {
    }
}
