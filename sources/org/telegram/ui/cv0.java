package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
public final class cv0 extends zv0 {
    public cv0(Context context) {
        super(context);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        di.z2 z2Var;
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.h5 h5Var = this.f35252e;
        if (h5Var != null && (z2Var = h5Var.f34176k) != null) {
            z2Var.P0(false);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (getImageReceiver().L()) {
            accessibilityNodeInfo.setText(org.telegram.messenger.id.M0(2131754798, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.id.M0(2131747817, null)));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, org.telegram.messenger.id.M0(2131754818, null)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }
}
