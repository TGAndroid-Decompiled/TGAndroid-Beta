package org.telegram.ui;

import android.view.accessibility.AccessibilityNodeInfo;
public final class fm extends org.telegram.ui.Cells.x0 {
    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(true);
    }
}
