package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class sm0 extends FrameLayout {
    public org.telegram.ui.Cells.j7 f27890a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f27890a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
