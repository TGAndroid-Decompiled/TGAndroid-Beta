package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.kc1;
public final class jm extends org.telegram.ui.ActionBar.u0 {
    public final int f27555v0;
    public final Object f27556w0;

    public jm(li liVar, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, yVar, 0, 0, false, d6Var);
        this.f27555v0 = i10;
        this.f27556w0 = liVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f27555v0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f27556w0).f24126x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((bn) this.f27556w0).f24997x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((kc1) this.f27556w0).h.getText());
                return;
        }
    }

    public jm(kc1 kc1Var, Context context, org.telegram.ui.ActionBar.y yVar) {
        super(context, yVar, 0, 0);
        this.f27555v0 = 2;
        this.f27556w0 = kc1Var;
    }
}
