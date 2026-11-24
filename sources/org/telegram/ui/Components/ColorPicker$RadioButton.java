package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
public class ColorPicker$RadioButton extends View {
    public final Paint a;
    public ObjectAnimator b;
    public float c;
    public boolean d;
    public int e;

    public ColorPicker$RadioButton(Context context) {
        super(context);
        this.a = new Paint(1);
    }

    public final void a(int i) {
        this.e = i;
        invalidate();
    }

    public final void b(boolean z) {
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        boolean z2 = this.d;
        float f = 0.0f;
        if (z) {
            if (z2) {
                f = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", f);
            this.b = ofFloat;
            ofFloat.setDuration(200L);
            this.b.start();
            return;
        }
        if (z2) {
            f = 1.0f;
        }
        setCheckedState(f);
    }

    public float getCheckedState() {
        return this.c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L = gl.L(15.0f);
        float measuredWidth = getMeasuredWidth() * 0.5f;
        float measuredHeight = getMeasuredHeight() * 0.5f;
        int i = this.e;
        Paint paint = this.a;
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.L(3.0f));
        paint.setAlpha(Math.round(this.c * 255.0f));
        canvas.drawCircle(measuredWidth, measuredHeight, L - (paint.getStrokeWidth() * 0.5f), paint);
        paint.setAlpha(255);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(measuredWidth, measuredHeight, L - (gl.L(5.0f) * this.c), paint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(k96.M0(2131752003, null));
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setChecked(this.d);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(30.0f), 1073741824));
    }

    public void setCheckedState(float f) {
        this.c = f;
        invalidate();
    }
}
