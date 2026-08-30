package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class zm0 extends FrameLayout {
    public org.telegram.ui.Cells.i7 f31383a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f31383a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
