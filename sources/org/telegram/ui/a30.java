package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class a30 extends org.telegram.ui.Components.ak0 {
    public final v50 f37635r;

    public a30(v50 v50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f37635r = v50Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        v50 v50Var = this.f37635r;
        int i10 = v50Var.F1;
        if (i10 != 0 && i10 != 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (v50Var.F1 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        v50 v50Var = this.f37635r;
        h20 h20Var = v50Var.f44710y2;
        ArrayList arrayList = v50Var.Z1;
        if (v50Var.r1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && v50Var.F1 == 0 && v50Var.f44607a1 != null) {
            AndroidUtilities.runOnUIThread(h20Var, 300L);
            v50Var.R1 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (v50Var.R1) {
                AndroidUtilities.cancelRunOnUIThread(h20Var);
                v50Var.R1 = false;
            } else if (v50Var.S1) {
                AndroidUtilities.cancelRunOnUIThread(v50Var.f44705x2);
                v50Var.K1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        v50Var.f44697w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(v50Var.Y1);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
                }
                v50Var.S1 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
