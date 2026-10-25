package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.tc1;
public final class km extends org.telegram.ui.ActionBar.w0 {
    public final int f29938x0;
    public final Object f29939y0;

    public km(li liVar, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, zVar, 0, 0, false, u6Var);
        this.f29938x0 = i10;
        this.f29939y0 = liVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f29938x0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f29939y0).f26059x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((cn) this.f29939y0).f27202x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((tc1) this.f29939y0).h.getText());
                return;
        }
    }

    public km(tc1 tc1Var, Context context, org.telegram.ui.ActionBar.z zVar) {
        super(context, zVar, 0);
        this.f29938x0 = 2;
        this.f29939y0 = tc1Var;
    }
}
