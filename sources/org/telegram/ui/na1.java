package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class na1 extends View {

    public static final int f40713c = 0;

    public final Paint f40714a;

    public int[] f40715b;

    public na1(Context context) {
        super(context);
        this.f40714a = new Paint(1);
        this.f40715b = new int[7];
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() * 0.5f;
        float measuredHeight = getMeasuredHeight() * 0.5f;
        float fDp = AndroidUtilities.dp(5.0f);
        float fDp2 = AndroidUtilities.dp(20.0f) - fDp;
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f40714a;
        paint.setStyle(style);
        int i10 = 0;
        paint.setColor(this.f40715b[0]);
        canvas.drawCircle(measuredWidth, measuredHeight, fDp, paint);
        double d = 0.0d;
        while (i10 < 6) {
            float fSin = (((float) Math.sin(d)) * fDp2) + measuredWidth;
            float fCos = measuredHeight - (((float) Math.cos(d)) * fDp2);
            i10++;
            paint.setColor(this.f40715b[i10]);
            canvas.drawCircle(fSin, fCos, fDp, paint);
            d += 1.0471975511965976d;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(LocaleController.getString("ColorPickerMainColor", R.string.ColorPickerMainColor));
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824));
    }
}
