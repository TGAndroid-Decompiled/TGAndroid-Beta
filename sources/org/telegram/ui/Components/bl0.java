package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class bl0 extends FrameLayout {
    public org.telegram.ui.Cells.h7 f32275a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f32275a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
