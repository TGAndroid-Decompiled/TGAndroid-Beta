package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class b0 implements Runnable {
    public final int f34386a;
    public final k4 f34387b;

    public b0(k4 k4Var, int i10) {
        this.f34386a = i10;
        this.f34387b = k4Var;
    }

    @Override
    public final void run() {
        float f7;
        switch (this.f34386a) {
            case 0:
                k4 k4Var = this.f34387b;
                k4Var.getClass();
                try {
                    if (k4Var.f37543f0.getParent() != null) {
                        ((WindowManager) k4Var.L.getSystemService("window")).removeView(k4Var.f37543f0);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                k4 k4Var2 = this.f34387b;
                l0 l0Var = k4Var2.f37544g0;
                if (l0Var != null && k4Var2.f37543f0 != null) {
                    l0Var.setLayerType(0, null);
                    k4Var2.Z = 0;
                    AndroidUtilities.hideKeyboard(k4Var2.L.getCurrentFocus());
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new b0(this.f34387b, 11));
                return;
            case 3:
                k4 k4Var3 = this.f34387b;
                float currentProgress = 0.7f - k4Var3.f37545h0.f41506d0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f7 = 0.01f;
                    } else {
                        f7 = 0.02f;
                    }
                    org.telegram.ui.Components.n90 n90Var = k4Var3.f37545h0.f41506d0;
                    n90Var.a(n90Var.getCurrentProgress() + f7, true);
                    AndroidUtilities.runOnUIThread(k4Var3.f37547j0, 100L);
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new b0(this.f34387b, 11));
                return;
            case 5:
                this.f34387b.K.dismiss(true);
                return;
            case 6:
                this.f34387b.K.dismiss(true);
                return;
            case 7:
                k4 k4Var4 = this.f34387b;
                l0 l0Var2 = k4Var4.f37544g0;
                if (l0Var2 != null) {
                    l0Var2.setLayerType(0, null);
                    k4Var4.Z = 0;
                    k4Var4.M();
                    return;
                }
                return;
            case 8:
                this.f34387b.c0();
                return;
            case 9:
                this.f34387b.h0();
                return;
            case 10:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != 0) {
                    ?? obj = new Object();
                    obj.f20469a = true;
                    U.showAsSheet(new org.telegram.ui.web.y1(new r(this.f34387b, 3)), obj);
                    return;
                }
                return;
            default:
                this.f34387b.f0();
                return;
        }
    }
}
