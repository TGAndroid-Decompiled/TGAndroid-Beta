package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
public final class jw0 extends jx0 {
    public jw0(Context context) {
        super(context);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ag.c2 c2Var;
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.f5 f5Var = this.e;
        if (f5Var != null && (c2Var = f5Var.f25975k) != null) {
            c2Var.P0(false);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (getImageReceiver().L()) {
            accessibilityNodeInfo.setText(org.telegram.messenger.cd.L0(2131754798, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.cd.L0(2131747833, null)));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, org.telegram.messenger.cd.L0(2131754818, null)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }
}
