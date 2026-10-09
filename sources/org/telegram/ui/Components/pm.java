package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.xd1;
public final class pm extends org.telegram.ui.ActionBar.v0 {
    public final int f29889v0;
    public final Object f29890w0;

    public pm(qi qiVar, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, zVar, 0, 0, false, e6Var);
        this.f29889v0 = i10;
        this.f29890w0 = qiVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f29889v0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f29890w0).f24067x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((hn) this.f29890w0).f27093x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((xd1) this.f29890w0).h.getText());
                return;
        }
    }

    public pm(xd1 xd1Var, Context context, org.telegram.ui.ActionBar.z zVar) {
        super(context, zVar, 0, 0);
        this.f29889v0 = 2;
        this.f29890w0 = xd1Var;
    }
}
