package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.TypedValue;
public class q40 extends EditTextBoldCursor {
    public final TextPaint f31796b;
    public String f31797c;
    public final Rect d;

    public q40(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f31796b = textPaint;
        this.d = new Rect();
        textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.H6, false));
    }

    public String getHintText() {
        return this.f31797c;
    }

    @Override
    public void onDraw(Canvas canvas) {
        float measureText;
        Rect rect;
        Canvas canvas2;
        if (this.f31797c != null && length() < this.f31797c.length()) {
            int i10 = 0;
            float f7 = 0.0f;
            while (i10 < this.f31797c.length()) {
                int length = length();
                TextPaint textPaint = this.f31796b;
                if (i10 < length) {
                    measureText = getPaint().measureText(getText(), i10, i10 + 1);
                } else {
                    measureText = textPaint.measureText(this.f31797c, i10, i10 + 1);
                }
                if (i10 < length()) {
                    f7 += measureText;
                    canvas2 = canvas;
                } else {
                    int color = textPaint.getColor();
                    canvas.save();
                    String str = this.f31797c;
                    textPaint.getTextBounds(str, 0, str.length(), this.d);
                    i(i10);
                    canvas2 = canvas;
                    canvas2.drawText(this.f31797c, i10, i10 + 1, f7, (rect.height() + getHeight()) / 2.0f, (Paint) textPaint);
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
        this.f31797c = str;
        invalidate();
        setText(getText());
    }

    @Override
    public void setTextSize(int i10, float f7) {
        super.setTextSize(i10, f7);
        this.f31796b.setTextSize(TypedValue.applyDimension(i10, f7, getResources().getDisplayMetrics()));
    }

    public void i(int i10) {
    }
}
