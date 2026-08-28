package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.CheckBoxSquare;
public final class q8 extends FrameLayout {
    public TextView f24916a;
    public CheckBoxSquare f24917b;
    public boolean f24918c;

    public final void a(String str, boolean z10, boolean z11) {
        this.f24916a.setText(str);
        this.f24917b.a(z10, false);
        this.f24918c = z11;
        setWillNotDraw(!z11);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f24917b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i9;
        if (this.f24918c) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(20.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i9 = AndroidUtilities.dp(20.0f);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f24917b.h);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.f24918c ? 1 : 0), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.f24917b.a(z10, true);
    }
}
