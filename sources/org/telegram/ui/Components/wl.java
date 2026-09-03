package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.jd1;
public final class wl extends org.telegram.ui.ActionBar.w0 {
    public final int f32788s0;
    public final Object f32789t0;

    public wl(ei eiVar, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, zVar, 0, 0, false, g6Var);
        this.f32788s0 = i10;
        this.f32789t0 = eiVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f32788s0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f32789t0).f24781x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((pm) this.f32789t0).f30125x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((jd1) this.f32789t0).h.getText());
                return;
        }
    }

    public wl(jd1 jd1Var, Context context, org.telegram.ui.ActionBar.z zVar) {
        super(context, zVar, 0, 0);
        this.f32788s0 = 2;
        this.f32789t0 = jd1Var;
    }
}
