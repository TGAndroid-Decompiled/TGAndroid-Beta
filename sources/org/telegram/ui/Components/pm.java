package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.wd1;
public final class pm extends org.telegram.ui.ActionBar.u0 {
    public final int f29767v0;
    public final Object f29768w0;

    public pm(qi qiVar, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, yVar, 0, 0, false, d6Var);
        this.f29767v0 = i10;
        this.f29768w0 = qiVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f29767v0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f29768w0).f24059x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((hn) this.f29768w0).f27035x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((wd1) this.f29768w0).h.getText());
                return;
        }
    }

    public pm(wd1 wd1Var, Context context, org.telegram.ui.ActionBar.y yVar) {
        super(context, yVar, 0, 0);
        this.f29767v0 = 2;
        this.f29768w0 = wd1Var;
    }
}
