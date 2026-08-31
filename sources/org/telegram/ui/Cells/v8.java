package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class v8 extends FrameLayout {
    public static Paint d;
    public final TextView f24320a;
    public int f24321b;
    public float f24322c;

    public v8(Context context) {
        super(context);
        int i10;
        int i11;
        this.f24322c = 1.0f;
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.f24320a = textView;
        org.telegram.ui.b.q(textView, -14606047, 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
        boolean z4 = LocaleController.isRTL;
        int i12 = (z4 ? 5 : 3) | 48;
        if (z4) {
            i11 = 21;
        } else {
            i11 = 57;
        }
        addView(textView, k7.c6.d(-1, -1.0f, i12, i11, 0.0f, z4 ? 57 : 21, 0.0f));
    }

    @Override
    public float getAlpha() {
        return this.f24322c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredWidth;
        int i10 = this.f24321b;
        if (i10 != 0) {
            d.setColor(i10);
            d.setAlpha((int) (this.f24322c * 255.0f));
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
    public void setAlpha(float f10) {
        this.f24322c = f10;
        invalidate();
    }
}
