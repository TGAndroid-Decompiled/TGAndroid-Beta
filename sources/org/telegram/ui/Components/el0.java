package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class el0 extends FrameLayout {
    public org.telegram.ui.Cells.g7 f33416a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f33416a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
