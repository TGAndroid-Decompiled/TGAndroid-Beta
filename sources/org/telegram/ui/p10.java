package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
public final class p10 extends org.telegram.ui.Components.rh0 {
    public final f40 f50677r;

    public p10(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f50677r = f40Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        f40 f40Var = this.f50677r;
        int i7 = f40Var.E3;
        if (i7 != 0 && i7 != 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (f40Var.E3 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.hd.N0(2131743050, null)));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f40 f40Var = this.f50677r;
        v00 v00Var = f40Var.f47534x4;
        ArrayList arrayList = f40Var.Y3;
        if (f40Var.v1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && f40Var.E3 == 0 && f40Var.V2 != null) {
            org.telegram.messenger.g0.h3(v00Var, 300L);
            f40Var.Q3 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (f40Var.Q3) {
                org.telegram.messenger.g0.r(v00Var);
                f40Var.Q3 = false;
            } else if (f40Var.R3) {
                org.telegram.messenger.g0.r(f40Var.f47529w4);
                f40Var.S1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        f40Var.f47526w1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(f40Var.X3);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(true);
                }
                f40Var.R3 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
