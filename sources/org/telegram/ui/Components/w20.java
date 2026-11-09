package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.TypedValue;
public class w20 extends EditTextBoldCursor {
    public final TextPaint G1;
    public String H1;
    public final Rect I1;

    public w20(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.G1 = textPaint;
        this.I1 = new Rect();
        textPaint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.H6, false));
    }

    public String getHintText() {
        return this.H1;
    }

    @Override
    public void onDraw(Canvas canvas) {
        float measureText;
        Rect rect;
        Canvas canvas2;
        if (this.H1 != null && length() < this.H1.length()) {
            int i7 = 0;
            float f10 = 0.0f;
            while (i7 < this.H1.length()) {
                int length = length();
                TextPaint textPaint = this.G1;
                if (i7 < length) {
                    measureText = getPaint().measureText(getText(), i7, i7 + 1);
                } else {
                    measureText = textPaint.measureText(this.H1, i7, i7 + 1);
                }
                if (i7 < length()) {
                    f10 += measureText;
                    canvas2 = canvas;
                } else {
                    int color = textPaint.getColor();
                    canvas.save();
                    String str = this.H1;
                    textPaint.getTextBounds(str, 0, str.length(), this.I1);
                    z(i7);
                    canvas2 = canvas;
                    canvas2.drawText(this.H1, i7, i7 + 1, f10, (rect.height() + getHeight()) / 2.0f, (Paint) textPaint);
                    f10 += measureText;
                    canvas2.restore();
                    textPaint.setColor(color);
                }
                i7++;
                canvas = canvas2;
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        invalidate();
    }

    public void setHintText(String str) {
        this.H1 = str;
        invalidate();
        setText(getText());
    }

    @Override
    public void setTextSize(int i7, float f10) {
        super.setTextSize(i7, f10);
        this.G1.setTextSize(TypedValue.applyDimension(i7, f10, getResources().getDisplayMetrics()));
    }

    public void z(int i7) {
    }
}
