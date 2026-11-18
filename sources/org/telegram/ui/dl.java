package org.telegram.ui;

import android.view.accessibility.AccessibilityNodeInfo;
public final class dl extends org.telegram.ui.Cells.u0 {
    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(true);
    }
}
