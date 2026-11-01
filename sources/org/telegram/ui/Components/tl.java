package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.ui.k91;
public final class tl extends org.telegram.ui.ActionBar.t0 {
    public final Object A0;
    public final int f30677z0;

    public tl(FrameLayout frameLayout, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, yVar, 0, 0, false, p6Var);
        this.f30677z0 = i10;
        this.A0 = frameLayout;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f30677z0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.A0).f23894y.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((jm) this.A0).f27459y.getText());
                return;
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((k91) this.A0).h.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((vh.k2) this.A0).D.getText());
                return;
        }
    }

    public tl(k91 k91Var, Context context, org.telegram.ui.ActionBar.y yVar) {
        super(context, yVar, 0);
        this.f30677z0 = 2;
        this.A0 = k91Var;
    }
}
