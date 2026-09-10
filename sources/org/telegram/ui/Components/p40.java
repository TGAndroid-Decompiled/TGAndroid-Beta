package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.TypedValue;
public class p40 extends EditTextBoldCursor {
    public final TextPaint f26018b;
    public String f26019c;
    public final Rect d;

    public p40(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f26018b = textPaint;
        this.d = new Rect();
        textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
    }

    public String getHintText() {
        return this.f26019c;
    }

    @Override
    public void onDraw(Canvas canvas) {
        float measureText;
        Canvas canvas2;
        if (this.f26019c != null && length() < this.f26019c.length()) {
            int i10 = 0;
            float f7 = 0.0f;
            while (i10 < this.f26019c.length()) {
                int length = length();
                TextPaint textPaint = this.f26018b;
                if (i10 < length) {
                    measureText = getPaint().measureText(getText(), i10, i10 + 1);
                } else {
                    measureText = textPaint.measureText(this.f26019c, i10, i10 + 1);
                }
                if (i10 < length()) {
                    f7 += measureText;
                    canvas2 = canvas;
                } else {
                    int color = textPaint.getColor();
                    canvas.save();
                    String str = this.f26019c;
                    int length2 = str.length();
                    Rect rect = this.d;
                    textPaint.getTextBounds(str, 0, length2, rect);
                    float height = (rect.height() + getHeight()) / 2.0f;
                    i(i10);
                    canvas2 = canvas;
                    canvas2.drawText(this.f26019c, i10, i10 + 1, f7, height, (Paint) textPaint);
                    f7 += measureText;
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
        this.f26019c = str;
        invalidate();
        setText(getText());
    }

    @Override
    public void setTextSize(int i10, float f7) {
        super.setTextSize(i10, f7);
        this.f26018b.setTextSize(TypedValue.applyDimension(i10, f7, getResources().getDisplayMetrics()));
    }

    public void i(int i10) {
    }
}
