package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class l30 extends org.telegram.ui.Components.jj0 {
    public final e60 f35637r;

    public l30(e60 e60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f35637r = e60Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z4;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        e60 e60Var = this.f35637r;
        int i10 = e60Var.C1;
        if (i10 != 0 && i10 != 1) {
            z4 = false;
        } else {
            z4 = true;
        }
        accessibilityNodeInfo.setEnabled(z4);
        if (e60Var.C1 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e60 e60Var = this.f35637r;
        r20 r20Var = e60Var.f33705v2;
        ArrayList arrayList = e60Var.W1;
        if (e60Var.r1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && e60Var.C1 == 0 && e60Var.X0 != null) {
            AndroidUtilities.runOnUIThread(r20Var, 300L);
            e60Var.O1 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (e60Var.O1) {
                AndroidUtilities.cancelRunOnUIThread(r20Var);
                e60Var.O1 = false;
            } else if (e60Var.P1) {
                AndroidUtilities.cancelRunOnUIThread(e60Var.f33701u2);
                e60Var.J1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        e60Var.f33707w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(e60Var.V1);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
                }
                e60Var.P1 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
