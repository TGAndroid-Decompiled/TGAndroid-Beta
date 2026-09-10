package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class b0 implements Runnable {
    public final int f31112a;
    public final j4 f31113b;

    public b0(j4 j4Var, int i10) {
        this.f31112a = i10;
        this.f31113b = j4Var;
    }

    @Override
    public final void run() {
        float f7;
        switch (this.f31112a) {
            case 0:
                j4 j4Var = this.f31113b;
                j4Var.getClass();
                try {
                    if (j4Var.f33906f0.getParent() != null) {
                        ((WindowManager) j4Var.L.getSystemService("window")).removeView(j4Var.f33906f0);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                j4 j4Var2 = this.f31113b;
                k0 k0Var = j4Var2.f33907g0;
                if (k0Var != null && j4Var2.f33906f0 != null) {
                    k0Var.setLayerType(0, null);
                    j4Var2.Z = 0;
                    AndroidUtilities.hideKeyboard(j4Var2.L.getCurrentFocus());
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new b0(this.f31113b, 11));
                return;
            case 3:
                j4 j4Var3 = this.f31113b;
                float currentProgress = 0.7f - j4Var3.f33908h0.f38106d0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f7 = 0.01f;
                    } else {
                        f7 = 0.02f;
                    }
                    org.telegram.ui.Components.w80 w80Var = j4Var3.f33908h0.f38106d0;
                    w80Var.a(w80Var.getCurrentProgress() + f7, true);
                    AndroidUtilities.runOnUIThread(j4Var3.f33910j0, 100L);
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new b0(this.f31113b, 11));
                return;
            case 5:
                this.f31113b.K.dismiss(true);
                return;
            case 6:
                this.f31113b.K.dismiss(true);
                return;
            case 7:
                j4 j4Var4 = this.f31113b;
                k0 k0Var2 = j4Var4.f33907g0;
                if (k0Var2 != null) {
                    k0Var2.setLayerType(0, null);
                    j4Var4.Z = 0;
                    j4Var4.M();
                    return;
                }
                return;
            case 8:
                this.f31113b.c0();
                return;
            case 9:
                this.f31113b.h0();
                return;
            case 10:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != 0) {
                    ?? obj = new Object();
                    obj.f18485a = true;
                    U.showAsSheet(new org.telegram.ui.web.b2(new s(this.f31113b, 3)), obj);
                    return;
                }
                return;
            default:
                this.f31113b.f0();
                return;
        }
    }
}
