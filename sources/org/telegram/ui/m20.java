package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
public final class m20 extends org.telegram.ui.Components.ei0 {
    public final b50 f39458r;

    public m20(b50 b50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f39458r = b50Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        b50 b50Var = this.f39458r;
        int i10 = b50Var.f36093w3;
        if (i10 != 0 && i10 != 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (b50Var.f36093w3 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.cd.L0(2131743319, null)));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b50 b50Var = this.f39458r;
        t10 t10Var = b50Var.f36062p4;
        ArrayList arrayList = b50Var.Q3;
        if (b50Var.t1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && b50Var.f36093w3 == 0 && b50Var.R2 != null) {
            org.telegram.messenger.i0.h3(t10Var, 300L);
            b50Var.I3 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (b50Var.I3) {
                org.telegram.messenger.i0.r(t10Var);
                b50Var.I3 = false;
            } else if (b50Var.J3) {
                org.telegram.messenger.i0.r(b50Var.f36057o4);
                b50Var.M1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        b50Var.f36073s1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(b50Var.P3);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Components.voip.r) arrayList.get(i10)).j(true);
                }
                b50Var.J3 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
