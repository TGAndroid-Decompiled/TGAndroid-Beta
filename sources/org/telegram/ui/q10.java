package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
public final class q10 extends org.telegram.ui.Components.ch0 {
    public final f40 f48913r;

    public q10(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f48913r = f40Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        f40 f40Var = this.f48913r;
        int i7 = f40Var.f45612z3;
        if (i7 != 0 && i7 != 1) {
            z9 = false;
        } else {
            z9 = true;
        }
        accessibilityNodeInfo.setEnabled(z9);
        if (f40Var.f45612z3 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.id.M0(2131743293, null)));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f40 f40Var = this.f48913r;
        v00 v00Var = f40Var.f45581s4;
        ArrayList arrayList = f40Var.T3;
        if (f40Var.u1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && f40Var.f45612z3 == 0 && f40Var.U2 != null) {
            org.telegram.messenger.g0.i3(v00Var, 300L);
            f40Var.L3 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (f40Var.L3) {
                org.telegram.messenger.g0.r(v00Var);
                f40Var.L3 = false;
            } else if (f40Var.M3) {
                org.telegram.messenger.g0.r(f40Var.f45576r4);
                f40Var.P1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        f40Var.f45592v1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(f40Var.S3);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(true);
                }
                f40Var.M3 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
