package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class fl0 extends FrameLayout {
    public org.telegram.ui.Cells.g7 f34627a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f34627a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
