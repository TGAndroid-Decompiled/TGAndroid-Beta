package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class xn0 extends FrameLayout {
    public org.telegram.ui.Cells.k7 f32983a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f32983a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
