package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.zd1;
public final class rm extends org.telegram.ui.ActionBar.u0 {
    public final int f30189v0;
    public final Object f30190w0;

    public rm(si siVar, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, yVar, 0, 0, false, c6Var);
        this.f30189v0 = i10;
        this.f30190w0 = siVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f30189v0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f30190w0).f23844x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((jn) this.f30190w0).f27562x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((zd1) this.f30190w0).h.getText());
                return;
        }
    }

    public rm(zd1 zd1Var, Context context, org.telegram.ui.ActionBar.y yVar) {
        super(context, yVar, 0, 0);
        this.f30189v0 = 2;
        this.f30190w0 = zd1Var;
    }
}
