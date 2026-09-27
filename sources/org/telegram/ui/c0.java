package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class c0 implements Runnable {
    public final int f32466a;
    public final j4 f32467b;

    public c0(j4 j4Var, int i10) {
        this.f32466a = i10;
        this.f32467b = j4Var;
    }

    @Override
    public final void run() {
        float f7;
        switch (this.f32466a) {
            case 0:
                j4 j4Var = this.f32467b;
                j4Var.getClass();
                try {
                    if (j4Var.f34613f0.getParent() != null) {
                        ((WindowManager) j4Var.L.getSystemService("window")).removeView(j4Var.f34613f0);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                j4 j4Var2 = this.f32467b;
                l0 l0Var = j4Var2.f34614g0;
                if (l0Var != null && j4Var2.f34613f0 != null) {
                    l0Var.setLayerType(0, null);
                    j4Var2.Z = 0;
                    AndroidUtilities.hideKeyboard(j4Var2.L.getCurrentFocus());
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new c0(this.f32467b, 11));
                return;
            case 3:
                j4 j4Var3 = this.f32467b;
                float currentProgress = 0.7f - j4Var3.f34615h0.f39187d0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f7 = 0.01f;
                    } else {
                        f7 = 0.02f;
                    }
                    org.telegram.ui.Components.z80 z80Var = j4Var3.f34615h0.f39187d0;
                    z80Var.a(z80Var.getCurrentProgress() + f7, true);
                    AndroidUtilities.runOnUIThread(j4Var3.f34617j0, 100L);
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new c0(this.f32467b, 11));
                return;
            case 5:
                this.f32467b.K.dismiss(true);
                return;
            case 6:
                this.f32467b.K.dismiss(true);
                return;
            case 7:
                j4 j4Var4 = this.f32467b;
                l0 l0Var2 = j4Var4.f34614g0;
                if (l0Var2 != null) {
                    l0Var2.setLayerType(0, null);
                    j4Var4.Z = 0;
                    j4Var4.M();
                    return;
                }
                return;
            case 8:
                this.f32467b.c0();
                return;
            case 9:
                this.f32467b.h0();
                return;
            case 10:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != 0) {
                    ?? obj = new Object();
                    obj.f19631a = true;
                    U.showAsSheet(new org.telegram.ui.web.z1(new t(this.f32467b, 3)), obj);
                    return;
                }
                return;
            default:
                this.f32467b.f0();
                return;
        }
    }
}
