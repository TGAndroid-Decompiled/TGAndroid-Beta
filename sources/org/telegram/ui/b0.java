package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class b0 implements Runnable {
    public final int f31912a;
    public final i4 f31913b;

    public b0(i4 i4Var, int i10) {
        this.f31912a = i10;
        this.f31913b = i4Var;
    }

    @Override
    public final void run() {
        float f7;
        switch (this.f31912a) {
            case 0:
                i4 i4Var = this.f31913b;
                i4Var.getClass();
                try {
                    if (i4Var.f34007f0.getParent() != null) {
                        ((WindowManager) i4Var.L.getSystemService("window")).removeView(i4Var.f34007f0);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                i4 i4Var2 = this.f31913b;
                k0 k0Var = i4Var2.f34008g0;
                if (k0Var != null && i4Var2.f34007f0 != null) {
                    k0Var.setLayerType(0, null);
                    i4Var2.Z = 0;
                    AndroidUtilities.hideKeyboard(i4Var2.L.getCurrentFocus());
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new b0(this.f31913b, 11));
                return;
            case 3:
                i4 i4Var3 = this.f31913b;
                float currentProgress = 0.7f - i4Var3.f34009h0.f38851d0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f7 = 0.01f;
                    } else {
                        f7 = 0.02f;
                    }
                    org.telegram.ui.Components.n80 n80Var = i4Var3.f34009h0.f38851d0;
                    n80Var.a(n80Var.getCurrentProgress() + f7, true);
                    AndroidUtilities.runOnUIThread(i4Var3.f34011j0, 100L);
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new b0(this.f31913b, 11));
                return;
            case 5:
                this.f31913b.K.dismiss(true);
                return;
            case 6:
                this.f31913b.K.dismiss(true);
                return;
            case 7:
                i4 i4Var4 = this.f31913b;
                k0 k0Var2 = i4Var4.f34008g0;
                if (k0Var2 != null) {
                    k0Var2.setLayerType(0, null);
                    i4Var4.Z = 0;
                    i4Var4.M();
                    return;
                }
                return;
            case 8:
                this.f31913b.c0();
                return;
            case 9:
                this.f31913b.h0();
                return;
            case 10:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != 0) {
                    ?? obj = new Object();
                    obj.f19352a = true;
                    U.showAsSheet(new org.telegram.ui.web.y1(new r(this.f31913b, 3)), obj);
                    return;
                }
                return;
            default:
                this.f31913b.f0();
                return;
        }
    }
}
