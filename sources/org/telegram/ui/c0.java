package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class c0 implements Runnable {
    public final int f33059a;
    public final l4 f33060b;

    public c0(l4 l4Var, int i10) {
        this.f33059a = i10;
        this.f33060b = l4Var;
    }

    @Override
    public final void run() {
        float f10;
        switch (this.f33059a) {
            case 0:
                l4 l4Var = this.f33060b;
                l4Var.getClass();
                try {
                    if (l4Var.f35931c0.getParent() != null) {
                        ((WindowManager) l4Var.I.getSystemService("window")).removeView(l4Var.f35931c0);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                l4 l4Var2 = this.f33060b;
                l0 l0Var = l4Var2.f35932d0;
                if (l0Var != null && l4Var2.f35931c0 != null) {
                    l0Var.setLayerType(0, null);
                    l4Var2.W = 0;
                    AndroidUtilities.hideKeyboard(l4Var2.I.getCurrentFocus());
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new c0(this.f33060b, 11));
                return;
            case 3:
                l4 l4Var3 = this.f33060b;
                float currentProgress = 0.7f - l4Var3.f35933e0.f39628a0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f10 = 0.01f;
                    } else {
                        f10 = 0.02f;
                    }
                    org.telegram.ui.Components.o80 o80Var = l4Var3.f35933e0.f39628a0;
                    o80Var.a(o80Var.getCurrentProgress() + f10, true);
                    AndroidUtilities.runOnUIThread(l4Var3.f35935g0, 100L);
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new c0(this.f33060b, 11));
                return;
            case 5:
                this.f33060b.H.dismiss(true);
                return;
            case 6:
                this.f33060b.H.dismiss(true);
                return;
            case 7:
                l4 l4Var4 = this.f33060b;
                l0 l0Var2 = l4Var4.f35932d0;
                if (l0Var2 != null) {
                    l0Var2.setLayerType(0, null);
                    l4Var4.W = 0;
                    l4Var4.M();
                    return;
                }
                return;
            case 8:
                this.f33060b.c0();
                return;
            case 9:
                this.f33060b.h0();
                return;
            case 10:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != 0) {
                    ?? obj = new Object();
                    obj.f20478a = true;
                    U.showAsSheet(new org.telegram.ui.web.x1(new t(this.f33060b, 3)), obj);
                    return;
                }
                return;
            default:
                this.f33060b.f0();
                return;
        }
    }
}
