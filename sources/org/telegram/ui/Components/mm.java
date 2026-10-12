package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.ce1;
public final class mm extends org.telegram.ui.ActionBar.u0 {
    public final int f27412v0;
    public final Object f27413w0;

    public mm(ni niVar, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, yVar, 0, 0, false, c6Var);
        this.f27412v0 = i10;
        this.f27413w0 = niVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f27412v0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f27413w0).f23064x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((en) this.f27413w0).f24749x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ce1) this.f27413w0).h.getText());
                return;
        }
    }

    public mm(ce1 ce1Var, Context context, org.telegram.ui.ActionBar.y yVar) {
        super(context, yVar, 0, 0);
        this.f27412v0 = 2;
        this.f27413w0 = ce1Var;
    }
}
