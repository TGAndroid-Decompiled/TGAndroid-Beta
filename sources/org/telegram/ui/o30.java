package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class o30 extends org.telegram.ui.Components.ik0 {
    public final i60 f40553r;

    public o30(i60 i60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f40553r = i60Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        i60 i60Var = this.f40553r;
        int i10 = i60Var.F1;
        if (i10 != 0 && i10 != 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (i60Var.F1 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        i60 i60Var = this.f40553r;
        v20 v20Var = i60Var.f38784y2;
        ArrayList arrayList = i60Var.Z1;
        if (i60Var.s1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && i60Var.F1 == 0 && i60Var.f38681a1 != null) {
            AndroidUtilities.runOnUIThread(v20Var, 300L);
            i60Var.R1 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (i60Var.R1) {
                AndroidUtilities.cancelRunOnUIThread(v20Var);
                i60Var.R1 = false;
            } else if (i60Var.S1) {
                AndroidUtilities.cancelRunOnUIThread(i60Var.f38779x2);
                i60Var.K1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        i60Var.f38771w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(i60Var.Y1);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Components.voip.v) arrayList.get(i10)).j(true);
                }
                i60Var.S1 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
