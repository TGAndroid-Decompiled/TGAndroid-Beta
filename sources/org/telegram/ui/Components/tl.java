package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.qc1;
public final class tl extends org.telegram.ui.ActionBar.w0 {
    public final int f32968r0;
    public final Object f32969s0;

    public tl(fi fiVar, Context context, org.telegram.ui.ActionBar.a0 a0Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, a0Var, 0, 0, false, c6Var);
        this.f32968r0 = i10;
        this.f32969s0 = fiVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f32968r0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f32969s0).f26294x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((lm) this.f32969s0).f30375x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((qc1) this.f32969s0).h.getText());
                return;
        }
    }

    public tl(qc1 qc1Var, Context context, org.telegram.ui.ActionBar.a0 a0Var) {
        super(context, a0Var, 0, 0);
        this.f32968r0 = 2;
        this.f32969s0 = qc1Var;
    }
}
