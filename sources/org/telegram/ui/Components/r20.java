package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.TypedValue;
public class r20 extends EditTextBoldCursor {
    public final TextPaint H1;
    public String I1;
    public final Rect J1;

    public r20(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.H1 = textPaint;
        this.J1 = new Rect();
        textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.H6, false));
    }

    public String getHintText() {
        return this.I1;
    }

    @Override
    public void onDraw(Canvas canvas) {
        float measureText;
        Rect rect;
        Canvas canvas2;
        if (this.I1 != null && length() < this.I1.length()) {
            int i3 = 0;
            float f10 = 0.0f;
            while (i3 < this.I1.length()) {
                int length = length();
                TextPaint textPaint = this.H1;
                if (i3 < length) {
                    measureText = getPaint().measureText(getText(), i3, i3 + 1);
                } else {
                    measureText = textPaint.measureText(this.I1, i3, i3 + 1);
                }
                if (i3 < length()) {
                    f10 += measureText;
                    canvas2 = canvas;
                } else {
                    int color = textPaint.getColor();
                    canvas.save();
                    String str = this.I1;
                    textPaint.getTextBounds(str, 0, str.length(), this.J1);
                    z(i3);
                    canvas2 = canvas;
                    canvas2.drawText(this.I1, i3, i3 + 1, f10, (rect.height() + getHeight()) / 2.0f, (Paint) textPaint);
                    f10 += measureText;
                    canvas2.restore();
                    textPaint.setColor(color);
                }
                i3++;
                canvas = canvas2;
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        invalidate();
    }

    public void setHintText(String str) {
        this.I1 = str;
        invalidate();
        setText(getText());
    }

    @Override
    public void setTextSize(int i3, float f10) {
        super.setTextSize(i3, f10);
        this.H1.setTextSize(TypedValue.applyDimension(i3, f10, getResources().getDisplayMetrics()));
    }

    public void z(int i3) {
    }
}
