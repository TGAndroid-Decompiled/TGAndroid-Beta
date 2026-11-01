package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.dd;
public final class w8 extends FrameLayout {
    public static Paint d;
    public final TextView f23410a;
    public int f23411b;
    public float f23412c;

    public w8(Context context) {
        super(context);
        int i10;
        int i11;
        this.f23412c = 1.0f;
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.f23410a = textView;
        textView.setTextColor(-14606047);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setPadding(0, 0, 0, org.telegram.messenger.i0.L(3.0f));
        boolean z10 = dd.X;
        int i12 = (z10 ? 5 : 3) | 48;
        if (z10) {
            i11 = 21;
        } else {
            i11 = 57;
        }
        addView(textView, w7.b6.d(-1, -1.0f, i12, i11, 0.0f, z10 ? 57 : 21, 0.0f));
    }

    @Override
    public float getAlpha() {
        return this.f23412c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredWidth;
        int i10 = this.f23411b;
        if (i10 != 0) {
            d.setColor(i10);
            d.setAlpha((int) (this.f23412c * 255.0f));
            if (!dd.X) {
                measuredWidth = org.telegram.messenger.i0.L(28.0f);
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(28.0f);
            }
            canvas.drawCircle(measuredWidth, getMeasuredHeight() / 2, org.telegram.messenger.i0.L(10.0f), d);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f7) {
        this.f23412c = f7;
        invalidate();
    }
}
