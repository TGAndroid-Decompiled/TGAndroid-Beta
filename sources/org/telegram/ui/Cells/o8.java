package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.CheckBoxSquare;
public final class o8 extends FrameLayout {
    public TextView f31182a;
    public CheckBoxSquare f31183b;
    public boolean f31184c;

    public final void a(String str, boolean z10, boolean z11) {
        this.f31182a.setText(str);
        this.f31183b.a(z10, false);
        this.f31184c = z11;
        setWillNotDraw(!z11);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f31183b.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.f31184c) {
            if (gd.f24213a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (gd.f24213a0) {
                i7 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29517k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f31183b.h);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.f31184c ? 1 : 0), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.f31183b.a(z10, true);
    }
}
