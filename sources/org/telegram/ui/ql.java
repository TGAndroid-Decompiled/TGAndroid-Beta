package org.telegram.ui;

import android.view.accessibility.AccessibilityNodeInfo;
public final class ql extends org.telegram.ui.Cells.w0 {
    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(true);
    }
}
