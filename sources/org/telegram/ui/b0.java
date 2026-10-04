package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class b0 implements Runnable {
    public final int f34942a;
    public final i4 f34943b;

    public b0(i4 i4Var, int i10) {
        this.f34942a = i10;
        this.f34943b = i4Var;
    }

    @Override
    public final void run() {
        float f7;
        switch (this.f34942a) {
            case 0:
                i4 i4Var = this.f34943b;
                i4Var.getClass();
                try {
                    if (i4Var.f37261f0.getParent() != null) {
                        ((WindowManager) i4Var.L.getSystemService("window")).removeView(i4Var.f37261f0);
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                i4 i4Var2 = this.f34943b;
                k0 k0Var = i4Var2.f37262g0;
                if (k0Var != null && i4Var2.f37261f0 != null) {
                    k0Var.setLayerType(0, null);
                    i4Var2.Z = 0;
                    AndroidUtilities.hideKeyboard(i4Var2.L.getCurrentFocus());
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new b0(this.f34943b, 11));
                return;
            case 3:
                i4 i4Var3 = this.f34943b;
                float currentProgress = 0.7f - i4Var3.f37263h0.f42371d0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f7 = 0.01f;
                    } else {
                        f7 = 0.02f;
                    }
                    org.telegram.ui.Components.a90 a90Var = i4Var3.f37263h0.f42371d0;
                    a90Var.a(a90Var.getCurrentProgress() + f7, true);
                    AndroidUtilities.runOnUIThread(i4Var3.f37265j0, 100L);
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new b0(this.f34943b, 11));
                return;
            case 5:
                this.f34943b.K.dismiss(true);
                return;
            case 6:
                this.f34943b.K.dismiss(true);
                return;
            case 7:
                i4 i4Var4 = this.f34943b;
                k0 k0Var2 = i4Var4.f37262g0;
                if (k0Var2 != null) {
                    k0Var2.setLayerType(0, null);
                    i4Var4.Z = 0;
                    i4Var4.M();
                    return;
                }
                return;
            case 8:
                this.f34943b.c0();
                return;
            case 9:
                this.f34943b.h0();
                return;
            case 10:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != 0) {
                    ?? obj = new Object();
                    obj.f21350a = true;
                    U.showAsSheet(new org.telegram.ui.web.a2(new s(this.f34943b, 3)), obj);
                    return;
                }
                return;
            default:
                this.f34943b.f0();
                return;
        }
    }
}
