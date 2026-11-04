package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
public final class t8 extends FrameLayout {
    public static Paint d;
    public final TextView f30605a;
    public int f30606b;
    public float f30607c;

    public t8(Context context) {
        super(context);
        int i3;
        int i10;
        this.f30607c = 1.0f;
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.f30605a = textView;
        textView.setTextColor(-14606047);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 16);
        textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
        boolean z10 = bd.f21784a0;
        int i11 = (z10 ? 5 : 3) | 48;
        if (z10) {
            i10 = 21;
        } else {
            i10 = 57;
        }
        addView(textView, mf.d(-1, -1.0f, i11, i10, 0.0f, z10 ? 57 : 21, 0.0f));
    }

    @Override
    public float getAlpha() {
        return this.f30607c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredWidth;
        int i3 = this.f30606b;
        if (i3 != 0) {
            d.setColor(i3);
            d.setAlpha((int) (this.f30607c * 255.0f));
            if (!bd.f21784a0) {
                measuredWidth = org.telegram.messenger.g0.L(28.0f);
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(28.0f);
            }
            canvas.drawCircle(measuredWidth, getMeasuredHeight() / 2, org.telegram.messenger.g0.L(10.0f), d);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f10) {
        this.f30607c = f10;
        invalidate();
    }
}
