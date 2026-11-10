package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
public class ColorPicker$RadioButton extends View {
    public final Paint f31310a;
    public ObjectAnimator f31311b;
    public float f31312c;
    public boolean d;
    public int f31313e;

    public ColorPicker$RadioButton(Context context) {
        super(context);
        this.f31310a = new Paint(1);
    }

    public final void a(int i7) {
        this.f31313e = i7;
        invalidate();
    }

    public final void b(boolean z9) {
        ObjectAnimator objectAnimator = this.f31311b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        float f10 = 0.0f;
        if (z9) {
            if (this.d) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", f10);
            this.f31311b = ofFloat;
            ofFloat.setDuration(200L);
            this.f31311b.start();
            return;
        }
        if (this.d) {
            f10 = 1.0f;
        }
        setCheckedState(f10);
    }

    public float getCheckedState() {
        return this.f31312c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L = org.telegram.messenger.g0.L(15.0f);
        float measuredWidth = getMeasuredWidth() * 0.5f;
        float measuredHeight = getMeasuredHeight() * 0.5f;
        int i7 = this.f31313e;
        Paint paint = this.f31310a;
        paint.setColor(i7);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setAlpha(Math.round(this.f31312c * 255.0f));
        canvas.drawCircle(measuredWidth, measuredHeight, L - (paint.getStrokeWidth() * 0.5f), paint);
        paint.setAlpha(255);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(measuredWidth, measuredHeight, L - (org.telegram.messenger.g0.L(5.0f) * this.f31312c), paint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(org.telegram.messenger.id.M0(2131752015, null));
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setChecked(this.d);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
    }

    public void setCheckedState(float f10) {
        this.f31312c = f10;
        invalidate();
    }
}
