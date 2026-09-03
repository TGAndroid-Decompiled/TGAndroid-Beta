package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.TypedValue;
public class i40 extends EditTextBoldCursor {
    public final TextPaint f25572b;
    public String f25573c;
    public final Rect d;

    public i40(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f25572b = textPaint;
        this.d = new Rect();
        textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
    }

    public String getHintText() {
        return this.f25573c;
    }

    @Override
    public void onDraw(Canvas canvas) {
        float measureText;
        Canvas canvas2;
        if (this.f25573c != null && length() < this.f25573c.length()) {
            int i10 = 0;
            float f10 = 0.0f;
            while (i10 < this.f25573c.length()) {
                int length = length();
                TextPaint textPaint = this.f25572b;
                if (i10 < length) {
                    measureText = getPaint().measureText(getText(), i10, i10 + 1);
                } else {
                    measureText = textPaint.measureText(this.f25573c, i10, i10 + 1);
                }
                if (i10 < length()) {
                    f10 += measureText;
                    canvas2 = canvas;
                } else {
                    int color = textPaint.getColor();
                    canvas.save();
                    String str = this.f25573c;
                    int length2 = str.length();
                    Rect rect = this.d;
                    textPaint.getTextBounds(str, 0, length2, rect);
                    float height = (rect.height() + getHeight()) / 2.0f;
                    i(i10);
                    canvas2 = canvas;
                    canvas2.drawText(this.f25573c, i10, i10 + 1, f10, height, (Paint) textPaint);
                    f10 += measureText;
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        invalidate();
    }

    public void setHintText(String str) {
        this.f25573c = str;
        invalidate();
        setText(getText());
    }

    @Override
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        this.f25572b.setTextSize(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
    }

    public void i(int i10) {
    }
}
