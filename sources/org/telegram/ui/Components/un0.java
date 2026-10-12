package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class un0 extends FrameLayout {
    public org.telegram.ui.Cells.k7 f29739a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f29739a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
