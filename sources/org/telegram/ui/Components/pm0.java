package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class pm0 extends FrameLayout {
    public org.telegram.ui.Cells.g7 f31712a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f31712a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
