package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.od1;
public final class zl extends org.telegram.ui.ActionBar.v0 {
    public final int f30616v0;
    public final Object f30617w0;

    public zl(oi oiVar, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, zVar, 0, 0, false, d6Var);
        this.f30616v0 = i10;
        this.f30617w0 = oiVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f30616v0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f30617w0).f21915x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((rm) this.f30617w0).f27674x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((od1) this.f30617w0).h.getText());
                return;
        }
    }

    public zl(od1 od1Var, Context context, org.telegram.ui.ActionBar.z zVar) {
        super(context, zVar, 0, 0);
        this.f30616v0 = 2;
        this.f30617w0 = od1Var;
    }
}
