package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.qc1;
public final class jm extends org.telegram.ui.ActionBar.u0 {
    public final int f27709x0;
    public final Object f27710y0;

    public jm(li liVar, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, yVar, 0, 0, false, g6Var);
        this.f27709x0 = i10;
        this.f27710y0 = liVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f27709x0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f27710y0).f24268x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((bn) this.f27710y0).f25105x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((qc1) this.f27710y0).h.getText());
                return;
        }
    }

    public jm(qc1 qc1Var, Context context, org.telegram.ui.ActionBar.y yVar) {
        super(context, yVar, 0, 0);
        this.f27709x0 = 2;
        this.f27710y0 = qc1Var;
    }
}
