package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class fn0 extends FrameLayout {
    public org.telegram.ui.Cells.k7 f24299a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f24299a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
