package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.oc1;
public final class pl extends org.telegram.ui.ActionBar.w0 {
    public final int f31686r0;
    public final Object f31687s0;

    public pl(ci ciVar, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, zVar, 0, 0, false, b6Var);
        this.f31686r0 = i9;
        this.f31687s0 = ciVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f31686r0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f31687s0).f26283x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((hm) this.f31687s0).f29127x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((oc1) this.f31687s0).h.getText());
                return;
        }
    }

    public pl(oc1 oc1Var, Context context, org.telegram.ui.ActionBar.z zVar) {
        super(context, zVar, 0, 0);
        this.f31686r0 = 2;
        this.f31687s0 = oc1Var;
    }
}
