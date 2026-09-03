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
public final class kb1 extends View {
    public static final int f38244c = 0;
    public final Paint f38245a;
    public int[] f38246b;

    public kb1(Context context) {
        super(context);
        this.f38245a = new Paint(1);
        this.f38246b = new int[7];
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() * 0.5f;
        float measuredHeight = getMeasuredHeight() * 0.5f;
        float dp = AndroidUtilities.dp(5.0f);
        float dp2 = AndroidUtilities.dp(20.0f) - dp;
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f38245a;
        paint.setStyle(style);
        int i10 = 0;
        paint.setColor(this.f38246b[0]);
        canvas.drawCircle(measuredWidth, measuredHeight, dp, paint);
        double d = 0.0d;
        while (i10 < 6) {
            i10++;
            paint.setColor(this.f38246b[i10]);
            canvas.drawCircle((((float) Math.sin(d)) * dp2) + measuredWidth, measuredHeight - (((float) Math.cos(d)) * dp2), dp, paint);
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
