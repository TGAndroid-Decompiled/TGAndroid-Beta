package org.telegram.ui.Components;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
public final class j20 extends FrameLayout {
    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && org.telegram.messenger.w3.W(sharedInstance.getChat())) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.dd.L0(2131743493, null)));
        } else {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.dd.L0(2131743376, null)));
        }
    }
}
