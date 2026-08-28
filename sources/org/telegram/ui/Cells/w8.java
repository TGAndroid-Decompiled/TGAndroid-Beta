package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ll;
public final class w8 extends FrameLayout {
    public static Paint d;
    public final TextView f25911a;
    public int f25912b;
    public float f25913c;

    public w8(Context context) {
        super(context);
        int i9;
        int i10;
        this.f25913c = 1.0f;
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.f25911a = textView;
        ll.s(textView, -14606047, 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        textView.setGravity(i9 | 16);
        textView.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
        boolean z10 = LocaleController.isRTL;
        int i11 = (z10 ? 5 : 3) | 48;
        if (z10) {
            i10 = 21;
        } else {
            i10 = 57;
        }
        addView(textView, g7.e6.d(-1, -1.0f, i11, i10, 0.0f, z10 ? 57 : 21, 0.0f));
    }

    @Override
    public float getAlpha() {
        return this.f25913c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredWidth;
        int i9 = this.f25912b;
        if (i9 != 0) {
            d.setColor(i9);
            d.setAlpha((int) (this.f25913c * 255.0f));
            if (!LocaleController.isRTL) {
                measuredWidth = AndroidUtilities.dp(28.0f);
            } else {
                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(28.0f);
            }
            canvas.drawCircle(measuredWidth, getMeasuredHeight() / 2, AndroidUtilities.dp(10.0f), d);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f10) {
        this.f25913c = f10;
        invalidate();
    }
}
