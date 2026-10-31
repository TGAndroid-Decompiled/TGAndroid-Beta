package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
public class ColorPicker$RadioButton extends View {
    public final Paint f23948a;
    public ObjectAnimator f23949b;
    public float f23950c;
    public boolean d;
    public int e;

    public ColorPicker$RadioButton(Context context) {
        super(context);
        this.f23948a = new Paint(1);
    }

    public final void a(int i10) {
        this.e = i10;
        invalidate();
    }

    public final void b(boolean z10) {
        ObjectAnimator objectAnimator = this.f23949b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        float f7 = 0.0f;
        if (z10) {
            if (this.d) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", f7);
            this.f23949b = ofFloat;
            ofFloat.setDuration(200L);
            this.f23949b.start();
            return;
        }
        if (this.d) {
            f7 = 1.0f;
        }
        setCheckedState(f7);
    }

    public float getCheckedState() {
        return this.f23950c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L = org.telegram.messenger.i0.L(15.0f);
        float measuredWidth = getMeasuredWidth() * 0.5f;
        float measuredHeight = getMeasuredHeight() * 0.5f;
        int i10 = this.e;
        Paint paint = this.f23948a;
        paint.setColor(i10);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
        paint.setAlpha(Math.round(this.f23950c * 255.0f));
        canvas.drawCircle(measuredWidth, measuredHeight, L - (paint.getStrokeWidth() * 0.5f), paint);
        paint.setAlpha(255);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(measuredWidth, measuredHeight, L - (org.telegram.messenger.i0.L(5.0f) * this.f23950c), paint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(org.telegram.messenger.cd.L0(2131752015, null));
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setChecked(this.d);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(30.0f), 1073741824));
    }

    public void setCheckedState(float f7) {
        this.f23950c = f7;
        invalidate();
    }
}
