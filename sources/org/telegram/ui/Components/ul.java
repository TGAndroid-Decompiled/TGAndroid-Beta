package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.jd1;
public final class ul extends org.telegram.ui.ActionBar.w0 {
    public final int f29232s0;
    public final Object f29233t0;

    public ul(di diVar, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, zVar, 0, 0, false, f6Var);
        this.f29232s0 = i10;
        this.f29233t0 = diVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f29232s0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f29233t0).f22910x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((nm) this.f29233t0).f27302x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((jd1) this.f29233t0).h.getText());
                return;
        }
    }

    public ul(jd1 jd1Var, Context context, org.telegram.ui.ActionBar.z zVar) {
        super(context, zVar, 0, 0);
        this.f29232s0 = 2;
        this.f29233t0 = jd1Var;
    }
}
