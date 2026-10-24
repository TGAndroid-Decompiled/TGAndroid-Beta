package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class sn0 extends FrameLayout {
    public org.telegram.ui.Cells.k7 f30597a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f30597a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
