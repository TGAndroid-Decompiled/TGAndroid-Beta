package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class fl0 extends FrameLayout {
    public org.telegram.ui.Cells.g7 f34623a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f34623a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
