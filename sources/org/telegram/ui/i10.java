package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
public final class i10 extends org.telegram.ui.Components.fh0 {
    public final x30 f46034r;

    public i10(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f46034r = x30Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        x30 x30Var = this.f46034r;
        int i3 = x30Var.f51816x3;
        if (i3 != 0 && i3 != 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (x30Var.f51816x3 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.bd.M0(2131743303, null)));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x30 x30Var = this.f46034r;
        p00 p00Var = x30Var.f51785q4;
        ArrayList arrayList = x30Var.R3;
        if (x30Var.t1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && x30Var.f51816x3 == 0 && x30Var.S2 != null) {
            org.telegram.messenger.g0.i3(p00Var, 300L);
            x30Var.J3 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (x30Var.J3) {
                org.telegram.messenger.g0.r(p00Var);
                x30Var.J3 = false;
            } else if (x30Var.K3) {
                org.telegram.messenger.g0.r(x30Var.f51780p4);
                x30Var.M1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        x30Var.f51796t1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(x30Var.Q3);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((org.telegram.ui.Components.voip.r) arrayList.get(i3)).j(true);
                }
                x30Var.K3 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
