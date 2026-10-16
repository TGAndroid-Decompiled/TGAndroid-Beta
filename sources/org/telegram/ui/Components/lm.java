package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.ce1;
public final class lm extends org.telegram.ui.ActionBar.u0 {
    public final int f26769v0;
    public final Object f26770w0;

    public lm(ni niVar, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, yVar, 0, 0, false, c6Var);
        this.f26769v0 = i10;
        this.f26770w0 = niVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f26769v0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f26770w0).f22764x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((en) this.f26770w0).f24436x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ce1) this.f26770w0).h.getText());
                return;
        }
    }

    public lm(ce1 ce1Var, Context context, org.telegram.ui.ActionBar.y yVar) {
        super(context, yVar, 0, 0);
        this.f26769v0 = 2;
        this.f26770w0 = ce1Var;
    }
}
