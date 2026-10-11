package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class a0 implements Runnable {
    public final int f35859a;
    public final h4 f35860b;

    public a0(h4 h4Var, int i10) {
        this.f35859a = i10;
        this.f35860b = h4Var;
    }

    @Override
    public final void run() {
        float f7;
        switch (this.f35859a) {
            case 0:
                h4 h4Var = this.f35860b;
                h4Var.getClass();
                try {
                    if (h4Var.f38305f0.getParent() != null) {
                        ((WindowManager) h4Var.L.getSystemService("window")).removeView(h4Var.f38305f0);
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                h4 h4Var2 = this.f35860b;
                j0 j0Var = h4Var2.f38306g0;
                if (j0Var != null && h4Var2.f38305f0 != null) {
                    j0Var.setLayerType(0, null);
                    h4Var2.Z = 0;
                    AndroidUtilities.hideKeyboard(h4Var2.L.getCurrentFocus());
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a0(this.f35860b, 11));
                return;
            case 3:
                h4 h4Var3 = this.f35860b;
                float currentProgress = 0.7f - h4Var3.f38307h0.f43704d0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f7 = 0.01f;
                    } else {
                        f7 = 0.02f;
                    }
                    org.telegram.ui.Components.o90 o90Var = h4Var3.f38307h0.f43704d0;
                    o90Var.a(o90Var.getCurrentProgress() + f7, true);
                    AndroidUtilities.runOnUIThread(h4Var3.f38309j0, 100L);
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new a0(this.f35860b, 11));
                return;
            case 5:
                this.f35860b.K.dismiss(true);
                return;
            case 6:
                this.f35860b.K.dismiss(true);
                return;
            case 7:
                h4 h4Var4 = this.f35860b;
                j0 j0Var2 = h4Var4.f38306g0;
                if (j0Var2 != null) {
                    j0Var2.setLayerType(0, null);
                    h4Var4.Z = 0;
                    h4Var4.M();
                    return;
                }
                return;
            case 8:
                this.f35860b.c0();
                return;
            case 9:
                this.f35860b.h0();
                return;
            case 10:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != 0) {
                    ?? obj = new Object();
                    obj.f21349a = true;
                    U.showAsSheet(new org.telegram.ui.web.y1(new r(this.f35860b, 3)), obj);
                    return;
                }
                return;
            default:
                this.f35860b.f0();
                return;
        }
    }
}
