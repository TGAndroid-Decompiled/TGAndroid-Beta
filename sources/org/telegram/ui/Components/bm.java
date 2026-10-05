package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.pd1;
public final class bm extends org.telegram.ui.ActionBar.v0 {
    public final int f25023v0;
    public final Object f25024w0;

    public bm(pi piVar, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, zVar, 0, 0, false, d6Var);
        this.f25023v0 = i10;
        this.f25024w0 = piVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f25023v0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f25024w0).f24071x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((tm) this.f25024w0).f31188x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((pd1) this.f25024w0).h.getText());
                return;
        }
    }

    public bm(pd1 pd1Var, Context context, org.telegram.ui.ActionBar.z zVar) {
        super(context, zVar, 0, 0);
        this.f25023v0 = 2;
        this.f25024w0 = pd1Var;
    }
}
