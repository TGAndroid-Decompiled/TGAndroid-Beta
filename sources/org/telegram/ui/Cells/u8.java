package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
public final class u8 extends FrameLayout {
    public static Paint d;
    public final TextView f30583a;
    public int f30584b;
    public float f30585c;

    public u8(Context context) {
        super(context);
        int i7;
        int i10;
        this.f30585c = 1.0f;
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.f30583a = textView;
        textView.setTextColor(-14606047);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
        boolean z9 = id.f23157a0;
        int i11 = (z9 ? 5 : 3) | 48;
        if (z9) {
            i10 = 21;
        } else {
            i10 = 57;
        }
        addView(textView, c8.ha.d(-1, -1.0f, i11, i10, 0.0f, z9 ? 57 : 21, 0.0f));
    }

    @Override
    public float getAlpha() {
        return this.f30585c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredWidth;
        int i7 = this.f30584b;
        if (i7 != 0) {
            d.setColor(i7);
            d.setAlpha((int) (this.f30585c * 255.0f));
            if (!id.f23157a0) {
                measuredWidth = org.telegram.messenger.g0.L(28.0f);
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(28.0f);
            }
            canvas.drawCircle(measuredWidth, getMeasuredHeight() / 2, org.telegram.messenger.g0.L(10.0f), d);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f10) {
        this.f30585c = f10;
        invalidate();
    }
}
