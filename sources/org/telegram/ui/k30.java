package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class k30 extends org.telegram.ui.Components.kj0 {
    public final d60 f38181r;

    public k30(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f38181r = d60Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z4;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        d60 d60Var = this.f38181r;
        int i10 = d60Var.C1;
        if (i10 != 0 && i10 != 1) {
            z4 = false;
        } else {
            z4 = true;
        }
        accessibilityNodeInfo.setEnabled(z4);
        if (d60Var.C1 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d60 d60Var = this.f38181r;
        q20 q20Var = d60Var.f36079v2;
        ArrayList arrayList = d60Var.W1;
        if (d60Var.r1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && d60Var.C1 == 0 && d60Var.X0 != null) {
            AndroidUtilities.runOnUIThread(q20Var, 300L);
            d60Var.O1 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (d60Var.O1) {
                AndroidUtilities.cancelRunOnUIThread(q20Var);
                d60Var.O1 = false;
            } else if (d60Var.P1) {
                AndroidUtilities.cancelRunOnUIThread(d60Var.f36075u2);
                d60Var.J1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        d60Var.f36081w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(d60Var.V1);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).j(true);
                }
                d60Var.P1 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
