package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class hn0 extends FrameLayout {
    public org.telegram.ui.Cells.k7 f24893a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f24893a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
