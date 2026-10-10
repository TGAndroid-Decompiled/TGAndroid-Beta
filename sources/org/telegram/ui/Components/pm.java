package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.xd1;
public final class pm extends org.telegram.ui.ActionBar.v0 {
    public final int f29789v0;
    public final Object f29790w0;

    public pm(qi qiVar, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, zVar, 0, 0, false, e6Var);
        this.f29789v0 = i10;
        this.f29790w0 = qiVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f29789v0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f29790w0).f24071x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((hn) this.f29790w0).f27083x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((xd1) this.f29790w0).h.getText());
                return;
        }
    }

    public pm(xd1 xd1Var, Context context, org.telegram.ui.ActionBar.z zVar) {
        super(context, zVar, 0, 0);
        this.f29789v0 = 2;
        this.f29790w0 = xd1Var;
    }
}
