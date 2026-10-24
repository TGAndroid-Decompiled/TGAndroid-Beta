package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.pc1;
public final class hm extends org.telegram.ui.ActionBar.u0 {
    public final int f27078x0;
    public final Object f27079y0;

    public hm(ji jiVar, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, yVar, 0, 0, false, g6Var);
        this.f27078x0 = i10;
        this.f27079y0 = jiVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f27078x0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f27079y0).f24269x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((zm) this.f27079y0).f33295x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((pc1) this.f27079y0).h.getText());
                return;
        }
    }

    public hm(pc1 pc1Var, Context context, org.telegram.ui.ActionBar.y yVar) {
        super(context, yVar, 0, 0);
        this.f27078x0 = 2;
        this.f27079y0 = pc1Var;
    }
}
