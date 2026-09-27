package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.pd1;
public final class am extends org.telegram.ui.ActionBar.w0 {
    public final int f22708v0;
    public final Object f22709w0;

    public am(oi oiVar, Context context, org.telegram.ui.ActionBar.a0 a0Var, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, a0Var, 0, 0, false, e6Var);
        this.f22708v0 = i10;
        this.f22709w0 = oiVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f22708v0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f22709w0).f22169x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((sm) this.f22709w0).f28335x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((pd1) this.f22709w0).h.getText());
                return;
        }
    }

    public am(pd1 pd1Var, Context context, org.telegram.ui.ActionBar.a0 a0Var) {
        super(context, a0Var, 0, 0);
        this.f22708v0 = 2;
        this.f22709w0 = pd1Var;
    }
}
