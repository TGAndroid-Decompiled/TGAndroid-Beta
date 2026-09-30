package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.od1;
public final class bm extends org.telegram.ui.ActionBar.u0 {
    public final int f22970v0;
    public final Object f22971w0;

    public bm(pi piVar, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, yVar, 0, 0, false, d6Var);
        this.f22970v0 = i10;
        this.f22971w0 = piVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f22970v0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.f22971w0).f22188x.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((tm) this.f22971w0).f28605x.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((od1) this.f22971w0).h.getText());
                return;
        }
    }

    public bm(od1 od1Var, Context context, org.telegram.ui.ActionBar.y yVar) {
        super(context, yVar, 0, 0);
        this.f22970v0 = 2;
        this.f22971w0 = od1Var;
    }
}
