package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class a0 implements Runnable {
    public final int f37605a;
    public final j4 f37606b;

    public a0(j4 j4Var, int i10) {
        this.f37605a = i10;
        this.f37606b = j4Var;
    }

    @Override
    public final void run() {
        float f7;
        switch (this.f37605a) {
            case 0:
                j4 j4Var = this.f37606b;
                j4Var.getClass();
                try {
                    if (j4Var.f40432f0.getParent() != null) {
                        ((WindowManager) j4Var.L.getSystemService("window")).removeView(j4Var.f40432f0);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                j4 j4Var2 = this.f37606b;
                k0 k0Var = j4Var2.f40433g0;
                if (k0Var != null && j4Var2.f40432f0 != null) {
                    k0Var.setLayerType(0, null);
                    j4Var2.Z = 0;
                    AndroidUtilities.hideKeyboard(j4Var2.L.getCurrentFocus());
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a0(this.f37606b, 11));
                return;
            case 3:
                j4 j4Var3 = this.f37606b;
                float currentProgress = 0.7f - j4Var3.f40434h0.f45395d0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f7 = 0.01f;
                    } else {
                        f7 = 0.02f;
                    }
                    org.telegram.ui.Components.i90 i90Var = j4Var3.f40434h0.f45395d0;
                    i90Var.a(i90Var.getCurrentProgress() + f7, true);
                    AndroidUtilities.runOnUIThread(j4Var3.f40436j0, 100L);
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new a0(this.f37606b, 11));
                return;
            case 5:
                this.f37606b.K.dismiss(true);
                return;
            case 6:
                this.f37606b.K.dismiss(true);
                return;
            case 7:
                j4 j4Var4 = this.f37606b;
                k0 k0Var2 = j4Var4.f40433g0;
                if (k0Var2 != null) {
                    k0Var2.setLayerType(0, null);
                    j4Var4.Z = 0;
                    j4Var4.M();
                    return;
                }
                return;
            case 8:
                this.f37606b.c0();
                return;
            case 9:
                this.f37606b.h0();
                return;
            case 10:
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != 0) {
                    ?? obj = new Object();
                    obj.f22926a = true;
                    U.showAsSheet(new org.telegram.ui.web.y1(new q(this.f37606b, 3)), obj);
                    return;
                }
                return;
            default:
                this.f37606b.f0();
                return;
        }
    }
}
