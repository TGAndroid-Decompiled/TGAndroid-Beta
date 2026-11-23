package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class pl0 extends FrameLayout {
    public org.telegram.ui.Cells.i7 f38614a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f38614a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
