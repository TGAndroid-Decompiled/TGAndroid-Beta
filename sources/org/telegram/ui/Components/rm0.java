package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class rm0 extends FrameLayout {
    public org.telegram.ui.Cells.j7 f30079a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f30079a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
