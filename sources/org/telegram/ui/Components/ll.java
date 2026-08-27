package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.nc1;

public final class ll extends org.telegram.ui.ActionBar.v0 {

    public final int f30404r0;

    public final Object f30405s0;

    public ll(yh yhVar, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, zVar, 0, 0, false, c6Var);
        this.f30404r0 = i10;
        this.f30405s0 = yhVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f30404r0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f30405s0).f26279x.getText());
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((em) this.f30405s0).f28090x.getText());
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((nc1) this.f30405s0).h.getText());
                break;
        }
    }

    public ll(nc1 nc1Var, Context context, org.telegram.ui.ActionBar.z zVar) {
        super(context, zVar, 0, 0);
        this.f30404r0 = 2;
        this.f30405s0 = nc1Var;
    }
}
