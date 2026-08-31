package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.ed1;
public final class wl extends org.telegram.ui.ActionBar.w0 {
    public final int f32785s0;
    public final Object f32786t0;

    public wl(ei eiVar, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, zVar, 0, 0, false, g6Var);
        this.f32785s0 = i10;
        this.f32786t0 = eiVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f32785s0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f32786t0).f24779x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((qm) this.f32786t0).f30419x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ed1) this.f32786t0).h.getText());
                return;
        }
    }

    public wl(ed1 ed1Var, Context context, org.telegram.ui.ActionBar.z zVar) {
        super(context, zVar, 0, 0);
        this.f32785s0 = 2;
        this.f32786t0 = ed1Var;
    }
}
