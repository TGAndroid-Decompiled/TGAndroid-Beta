package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.RadioButton;
public final class fk0 extends FrameLayout {
    public TextView f38203a;
    public RadioButton f38204b;
    public org.telegram.ui.Components.hp f38205c;
    public boolean d;
    public ek0 f38206e;

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        if (this.d) {
            float f10 = 60.0f;
            if (LocaleController.isRTL) {
                f9 = 0.0f;
            } else {
                f9 = 60.0f;
            }
            float dp = AndroidUtilities.dp(f9);
            float height = getHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!LocaleController.isRTL) {
                f10 = 0.0f;
            }
            canvas.drawLine(dp, height, measuredWidth - AndroidUtilities.dp(f10), getHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f38204b.f26519f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
