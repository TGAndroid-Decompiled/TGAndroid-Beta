package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class an0 extends FrameLayout {
    public org.telegram.ui.Cells.i7 f25298a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f25298a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
