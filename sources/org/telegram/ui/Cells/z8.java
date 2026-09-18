package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.wh;
public final class z8 extends FrameLayout {
    public static Paint d;
    public final TextView f21888a;
    public int f21889b;
    public float f21890c;

    public z8(Context context) {
        super(context);
        int i10;
        int i11;
        this.f21890c = 1.0f;
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.f21888a = textView;
        wh.s(textView, -14606047, 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
        boolean z10 = LocaleController.isRTL;
        int i12 = (z10 ? 5 : 3) | 48;
        if (z10) {
            i11 = 21;
        } else {
            i11 = 57;
        }
        addView(textView, w7.y5.d(-1, -1.0f, i12, i11, 0.0f, z10 ? 57 : 21, 0.0f));
    }

    @Override
    public float getAlpha() {
        return this.f21890c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredWidth;
        int i10 = this.f21889b;
        if (i10 != 0) {
            d.setColor(i10);
            d.setAlpha((int) (this.f21890c * 255.0f));
            if (!LocaleController.isRTL) {
                measuredWidth = AndroidUtilities.dp(28.0f);
            } else {
                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(28.0f);
            }
            canvas.drawCircle(measuredWidth, getMeasuredHeight() / 2, AndroidUtilities.dp(10.0f), d);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f7) {
        this.f21890c = f7;
        invalidate();
    }
}
