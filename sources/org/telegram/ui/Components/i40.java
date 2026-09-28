package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.TypedValue;
public class i40 extends EditTextBoldCursor {
    public final TextPaint f25001b;
    public String f25002c;
    public final Rect d;

    public i40(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f25001b = textPaint;
        this.d = new Rect();
        textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.H6, false));
    }

    public String getHintText() {
        return this.f25002c;
    }

    @Override
    public void onDraw(Canvas canvas) {
        float measureText;
        Canvas canvas2;
        if (this.f25002c != null && length() < this.f25002c.length()) {
            int i10 = 0;
            float f7 = 0.0f;
            while (i10 < this.f25002c.length()) {
                int length = length();
                TextPaint textPaint = this.f25001b;
                if (i10 < length) {
                    measureText = getPaint().measureText(getText(), i10, i10 + 1);
                } else {
                    measureText = textPaint.measureText(this.f25002c, i10, i10 + 1);
                }
                if (i10 < length()) {
                    f7 += measureText;
                    canvas2 = canvas;
                } else {
                    int color = textPaint.getColor();
                    canvas.save();
                    String str = this.f25002c;
                    int length2 = str.length();
                    Rect rect = this.d;
                    textPaint.getTextBounds(str, 0, length2, rect);
                    float height = (rect.height() + getHeight()) / 2.0f;
                    i(i10);
                    canvas2 = canvas;
                    canvas2.drawText(this.f25002c, i10, i10 + 1, f7, height, (Paint) textPaint);
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
        this.f25002c = str;
        invalidate();
        setText(getText());
    }

    @Override
    public void setTextSize(int i10, float f7) {
        super.setTextSize(i10, f7);
        this.f25001b.setTextSize(TypedValue.applyDimension(i10, f7, getResources().getDisplayMetrics()));
    }

    public void i(int i10) {
    }
}
