package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class fe extends View.AccessibilityDelegate {
    public final int f24864a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f24864a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.ImageButton");
                accessibilityNodeInfo.setClickable(true);
                accessibilityNodeInfo.setLongClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (view.isEnabled()) {
                    accessibilityNodeInfo.addAction(16);
                    return;
                }
                return;
        }
    }
}
