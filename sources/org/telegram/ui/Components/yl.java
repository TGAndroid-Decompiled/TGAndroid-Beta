package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.xd1;
public final class yl extends org.telegram.ui.ActionBar.v0 {
    public final int f30673v0;
    public final Object f30674w0;

    public yl(ni niVar, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, zVar, 0, 0, false, f6Var);
        this.f30673v0 = i10;
        this.f30674w0 = niVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f30673v0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f30674w0).f22181x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((qm) this.f30674w0).f27607x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((xd1) this.f30674w0).h.getText());
                return;
        }
    }

    public yl(xd1 xd1Var, Context context, org.telegram.ui.ActionBar.z zVar) {
        super(context, zVar, 0, 0);
        this.f30673v0 = 2;
        this.f30674w0 = xd1Var;
    }
}
