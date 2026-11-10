package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class al0 extends FrameLayout {
    public org.telegram.ui.Cells.h7 f31878a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f31878a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
