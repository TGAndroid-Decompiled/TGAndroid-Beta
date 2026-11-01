package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
public final class l20 extends org.telegram.ui.Components.fi0 {
    public final a50 f39058r;

    public l20(a50 a50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f39058r = a50Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        a50 a50Var = this.f39058r;
        int i10 = a50Var.f35677w3;
        if (i10 != 0 && i10 != 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (a50Var.f35677w3 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.dd.L0(2131743319, null)));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a50 a50Var = this.f39058r;
        s10 s10Var = a50Var.f35646p4;
        ArrayList arrayList = a50Var.Q3;
        if (a50Var.t1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && a50Var.f35677w3 == 0 && a50Var.R2 != null) {
            org.telegram.messenger.i0.h3(s10Var, 300L);
            a50Var.I3 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (a50Var.I3) {
                org.telegram.messenger.i0.r(s10Var);
                a50Var.I3 = false;
            } else if (a50Var.J3) {
                org.telegram.messenger.i0.r(a50Var.f35641o4);
                a50Var.M1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        a50Var.f35657s1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(a50Var.P3);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Components.voip.r) arrayList.get(i10)).j(true);
                }
                a50Var.J3 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
