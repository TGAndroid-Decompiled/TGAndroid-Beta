package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.xd1;
public final class yl extends org.telegram.ui.ActionBar.w0 {
    public final int f30268v0;
    public final Object f30269w0;

    public yl(ni niVar, Context context, org.telegram.ui.ActionBar.a0 a0Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, a0Var, 0, 0, false, f6Var);
        this.f30268v0 = i10;
        this.f30269w0 = niVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f30268v0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f30269w0).f21957x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((qm) this.f30269w0).f27354x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((xd1) this.f30269w0).h.getText());
                return;
        }
    }

    public yl(xd1 xd1Var, Context context, org.telegram.ui.ActionBar.a0 a0Var) {
        super(context, a0Var, 0, 0);
        this.f30268v0 = 2;
        this.f30269w0 = xd1Var;
    }
}
