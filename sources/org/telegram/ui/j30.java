package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class j30 extends org.telegram.ui.Components.jj0 {
    public final c60 f35215r;

    public j30(c60 c60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f35215r = c60Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z4;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        c60 c60Var = this.f35215r;
        int i10 = c60Var.C1;
        if (i10 != 0 && i10 != 1) {
            z4 = false;
        } else {
            z4 = true;
        }
        accessibilityNodeInfo.setEnabled(z4);
        if (c60Var.C1 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c60 c60Var = this.f35215r;
        p20 p20Var = c60Var.f33186v2;
        ArrayList arrayList = c60Var.W1;
        if (c60Var.r1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && c60Var.C1 == 0 && c60Var.X0 != null) {
            AndroidUtilities.runOnUIThread(p20Var, 300L);
            c60Var.O1 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (c60Var.O1) {
                AndroidUtilities.cancelRunOnUIThread(p20Var);
                c60Var.O1 = false;
            } else if (c60Var.P1) {
                AndroidUtilities.cancelRunOnUIThread(c60Var.f33182u2);
                c60Var.J1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        c60Var.f33188w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(c60Var.V1);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
                }
                c60Var.P1 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
