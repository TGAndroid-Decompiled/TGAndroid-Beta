package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.vd1;
public final class yl extends org.telegram.ui.ActionBar.v0 {
    public final int f30608v0;
    public final Object f30609w0;

    public yl(ni niVar, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, zVar, 0, 0, false, e6Var);
        this.f30608v0 = i10;
        this.f30609w0 = niVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f30608v0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f30609w0).f22130x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((qm) this.f30609w0).f27687x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((vd1) this.f30609w0).h.getText());
                return;
        }
    }

    public yl(vd1 vd1Var, Context context, org.telegram.ui.ActionBar.z zVar) {
        super(context, zVar, 0, 0);
        this.f30608v0 = 2;
        this.f30609w0 = vd1Var;
    }
}
