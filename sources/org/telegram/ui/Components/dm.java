package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.ae1;
public final class dm extends org.telegram.ui.ActionBar.w0 {
    public final int f22444v0;
    public final Object f22445w0;

    public dm(qi qiVar, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, zVar, 0, 0, false, f6Var);
        this.f22444v0 = i10;
        this.f22445w0 = qiVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f22444v0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f22445w0).f21029x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((xm) this.f22445w0).f29083x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ae1) this.f22445w0).h.getText());
                return;
        }
    }

    public dm(ae1 ae1Var, Context context, org.telegram.ui.ActionBar.z zVar) {
        super(context, zVar, 0, 0);
        this.f22444v0 = 2;
        this.f22445w0 = ae1Var;
    }
}
