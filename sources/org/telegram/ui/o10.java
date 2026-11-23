package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
public final class o10 extends org.telegram.ui.Components.qh0 {
    public final e40 f50478r;

    public o10(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f50478r = e40Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        e40 e40Var = this.f50478r;
        int i7 = e40Var.E3;
        if (i7 != 0 && i7 != 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (e40Var.E3 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.gd.N0(2131743043, null)));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e40 e40Var = this.f50478r;
        u00 u00Var = e40Var.f47422x4;
        ArrayList arrayList = e40Var.Y3;
        if (e40Var.v1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && e40Var.E3 == 0 && e40Var.V2 != null) {
            org.telegram.messenger.g0.h3(u00Var, 300L);
            e40Var.Q3 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (e40Var.Q3) {
                org.telegram.messenger.g0.r(u00Var);
                e40Var.Q3 = false;
            } else if (e40Var.R3) {
                org.telegram.messenger.g0.r(e40Var.f47417w4);
                e40Var.R1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        e40Var.f47414w1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(e40Var.X3);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((org.telegram.ui.Components.voip.z) arrayList.get(i7)).j(true);
                }
                e40Var.R3 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
