package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class nl0 extends FrameLayout {
    public org.telegram.ui.Cells.i7 f37805a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f37805a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
