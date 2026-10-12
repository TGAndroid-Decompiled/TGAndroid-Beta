package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class do0 extends FrameLayout {
    public org.telegram.ui.Cells.j7 f25445a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f25445a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
