package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class bn0 extends FrameLayout {
    public org.telegram.ui.Cells.l7 f21863a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f21863a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
