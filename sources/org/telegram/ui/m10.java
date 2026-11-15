package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
public final class m10 extends org.telegram.ui.Components.fh0 {
    public final c40 f49087r;

    public m10(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f49087r = c40Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        c40 c40Var = this.f49087r;
        int i7 = c40Var.E3;
        if (i7 != 0 && i7 != 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (c40Var.E3 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.hd.M0(2131743293, null)));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c40 c40Var = this.f49087r;
        s00 s00Var = c40Var.f45986x4;
        ArrayList arrayList = c40Var.Y3;
        if (c40Var.u1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && c40Var.E3 == 0 && c40Var.V2 != null) {
            org.telegram.messenger.g0.i3(s00Var, 300L);
            c40Var.Q3 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (c40Var.Q3) {
                org.telegram.messenger.g0.r(s00Var);
                c40Var.Q3 = false;
            } else if (c40Var.R3) {
                org.telegram.messenger.g0.r(c40Var.f45981w4);
                c40Var.R1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        c40Var.f45978w1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(c40Var.X3);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((org.telegram.ui.Components.voip.z) arrayList.get(i7)).j(true);
                }
                c40Var.R3 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
