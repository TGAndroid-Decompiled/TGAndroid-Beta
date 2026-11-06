package org.telegram.ui;

import android.view.accessibility.AccessibilityNodeInfo;
public final class fb extends org.telegram.ui.Cells.t0 {
    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(true);
    }
}
