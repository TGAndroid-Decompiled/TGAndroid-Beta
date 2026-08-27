package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;

public final class fm0 extends FrameLayout {

    public org.telegram.ui.Cells.f7 f28409a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f28409a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
