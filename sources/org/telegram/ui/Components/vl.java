package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.cd1;
public final class vl extends org.telegram.ui.ActionBar.w0 {
    public final int f29506s0;
    public final Object f29507t0;

    public vl(di diVar, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, zVar, 0, 0, false, f6Var);
        this.f29506s0 = i10;
        this.f29507t0 = diVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f29506s0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f29507t0).f22937x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((om) this.f29507t0).f27594x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((cd1) this.f29507t0).h.getText());
                return;
        }
    }

    public vl(cd1 cd1Var, Context context, org.telegram.ui.ActionBar.z zVar) {
        super(context, zVar, 0, 0);
        this.f29506s0 = 2;
        this.f29507t0 = cd1Var;
    }
}
