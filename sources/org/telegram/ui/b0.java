package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class b0 implements Runnable {
    public final int f35455a;
    public final l4 f35456b;

    public b0(l4 l4Var, int i10) {
        this.f35455a = i10;
        this.f35456b = l4Var;
    }

    @Override
    public final void run() {
        float f7;
        switch (this.f35455a) {
            case 0:
                l4 l4Var = this.f35456b;
                l4Var.getClass();
                try {
                    if (l4Var.f38758f0.getParent() != null) {
                        ((WindowManager) l4Var.L.getSystemService("window")).removeView(l4Var.f38758f0);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                l4 l4Var2 = this.f35456b;
                m0 m0Var = l4Var2.f38759g0;
                if (m0Var != null && l4Var2.f38758f0 != null) {
                    m0Var.setLayerType(0, null);
                    l4Var2.Z = 0;
                    AndroidUtilities.hideKeyboard(l4Var2.L.getCurrentFocus());
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new b0(this.f35456b, 11));
                return;
            case 3:
                l4 l4Var3 = this.f35456b;
                float currentProgress = 0.7f - l4Var3.f38760h0.f42785d0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f7 = 0.01f;
                    } else {
                        f7 = 0.02f;
                    }
                    org.telegram.ui.Components.g90 g90Var = l4Var3.f38760h0.f42785d0;
                    g90Var.a(g90Var.getCurrentProgress() + f7, true);
                    AndroidUtilities.runOnUIThread(l4Var3.f38762j0, 100L);
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new b0(this.f35456b, 11));
                return;
            case 5:
                this.f35456b.K.dismiss(true);
                return;
            case 6:
                this.f35456b.K.dismiss(true);
                return;
            case 7:
                l4 l4Var4 = this.f35456b;
                m0 m0Var2 = l4Var4.f38759g0;
                if (m0Var2 != null) {
                    m0Var2.setLayerType(0, null);
                    l4Var4.Z = 0;
                    l4Var4.M();
                    return;
                }
                return;
            case 8:
                this.f35456b.c0();
                return;
            case 9:
                this.f35456b.h0();
                return;
            case 10:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != 0) {
                    ?? obj = new Object();
                    obj.f21553a = true;
                    U.showAsSheet(new org.telegram.ui.web.x1(new r(this.f35456b, 3)), obj);
                    return;
                }
                return;
            default:
                this.f35456b.f0();
                return;
        }
    }
}
