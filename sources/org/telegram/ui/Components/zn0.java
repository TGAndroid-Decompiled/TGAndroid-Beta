package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class zn0 extends FrameLayout {
    public org.telegram.ui.Cells.k7 f33617a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f33617a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
