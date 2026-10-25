package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class yn0 extends FrameLayout {
    public org.telegram.ui.Cells.o7 f35081a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f35081a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
