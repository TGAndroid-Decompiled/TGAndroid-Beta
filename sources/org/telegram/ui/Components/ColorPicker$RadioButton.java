package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

class ColorPicker$RadioButton extends View {

    public final Paint f26339a;

    public ObjectAnimator f26340b;

    public float f26341c;
    public boolean d;

    public int f26342e;

    public ColorPicker$RadioButton(Context context) {
        super(context);
        this.f26339a = new Paint(1);
    }

    public final void a(int i10) {
        this.f26342e = i10;
        invalidate();
    }

    public final void b(boolean z10) {
        ObjectAnimator objectAnimator = this.f26340b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!z10) {
            setCheckedState(this.d ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "checkedState", this.d ? 1.0f : 0.0f);
        this.f26340b = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
        this.f26340b.start();
    }

    public float getCheckedState() {
        return this.f26341c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float fDp = AndroidUtilities.dp(15.0f);
        float measuredWidth = getMeasuredWidth() * 0.5f;
        float measuredHeight = getMeasuredHeight() * 0.5f;
        int i10 = this.f26342e;
        Paint paint = this.f26339a;
        paint.setColor(i10);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setAlpha(Math.round(this.f26341c * 255.0f));
        canvas.drawCircle(measuredWidth, measuredHeight, fDp - (paint.getStrokeWidth() * 0.5f), paint);
        paint.setAlpha(255);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(measuredWidth, measuredHeight, fDp - (AndroidUtilities.dp(5.0f) * this.f26341c), paint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(LocaleController.getString(R.string.ColorPickerMainColor));
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setChecked(this.d);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    public void setCheckedState(float f10) {
        this.f26341c = f10;
        invalidate();
    }
}
