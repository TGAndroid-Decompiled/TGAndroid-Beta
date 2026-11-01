package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
public final class o71 extends View {
    public static final int f40071c = 0;
    public final Paint f40072a;
    public int[] f40073b;

    public o71(Context context) {
        super(context);
        this.f40072a = new Paint(1);
        this.f40073b = new int[7];
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() * 0.5f;
        float measuredHeight = getMeasuredHeight() * 0.5f;
        float L = org.telegram.messenger.i0.L(5.0f);
        float L2 = org.telegram.messenger.i0.L(20.0f) - L;
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f40072a;
        paint.setStyle(style);
        int i10 = 0;
        paint.setColor(this.f40073b[0]);
        canvas.drawCircle(measuredWidth, measuredHeight, L, paint);
        double d = 0.0d;
        while (i10 < 6) {
            i10++;
            paint.setColor(this.f40073b[i10]);
            canvas.drawCircle((((float) Math.sin(d)) * L2) + measuredWidth, measuredHeight - (((float) Math.cos(d)) * L2), L, paint);
            d += 1.0471975511965976d;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(org.telegram.messenger.dd.L0(2131752015, "ColorPickerMainColor"));
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(62.0f), 1073741824));
    }
}
