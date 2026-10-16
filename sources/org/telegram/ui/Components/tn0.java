package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class tn0 extends FrameLayout {
    public org.telegram.ui.Cells.j7 f29172a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f29172a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
