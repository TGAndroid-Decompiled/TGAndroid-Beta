package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class zm0 extends FrameLayout {
    public org.telegram.ui.Cells.i7 f33977a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f33977a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
