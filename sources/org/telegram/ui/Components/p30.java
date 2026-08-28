package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.TypedValue;
public class p30 extends EditTextBoldCursor {
    public final TextPaint f31530b;
    public String f31531c;
    public final Rect d;

    public p30(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f31530b = textPaint;
        this.d = new Rect();
        textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H6, false));
    }

    public String getHintText() {
        return this.f31531c;
    }

    @Override
    public void onDraw(Canvas canvas) {
        float measureText;
        Canvas canvas2;
        if (this.f31531c != null && length() < this.f31531c.length()) {
            int i9 = 0;
            float f10 = 0.0f;
            while (i9 < this.f31531c.length()) {
                int length = length();
                TextPaint textPaint = this.f31530b;
                if (i9 < length) {
                    measureText = getPaint().measureText(getText(), i9, i9 + 1);
                } else {
                    measureText = textPaint.measureText(this.f31531c, i9, i9 + 1);
                }
                if (i9 < length()) {
                    f10 += measureText;
                    canvas2 = canvas;
                } else {
                    int color = textPaint.getColor();
                    canvas.save();
                    String str = this.f31531c;
                    int length2 = str.length();
                    Rect rect = this.d;
                    textPaint.getTextBounds(str, 0, length2, rect);
                    float height = (rect.height() + getHeight()) / 2.0f;
                    i(i9);
                    canvas2 = canvas;
                    canvas2.drawText(this.f31531c, i9, i9 + 1, f10, height, (Paint) textPaint);
                    f10 += measureText;
                    canvas2.restore();
                    textPaint.setColor(color);
                }
                i9++;
                canvas = canvas2;
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        invalidate();
    }

    public void setHintText(String str) {
        this.f31531c = str;
        invalidate();
        setText(getText());
    }

    @Override
    public void setTextSize(int i9, float f10) {
        super.setTextSize(i9, f10);
        this.f31530b.setTextSize(TypedValue.applyDimension(i9, f10, getResources().getDisplayMetrics()));
    }

    public void i(int i9) {
    }
}
