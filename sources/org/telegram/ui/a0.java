package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class a0 implements Runnable {
    public final int f31947a;
    public final h4 f31948b;

    public a0(h4 h4Var, int i10) {
        this.f31947a = i10;
        this.f31948b = h4Var;
    }

    @Override
    public final void run() {
        float f7;
        switch (this.f31947a) {
            case 0:
                h4 h4Var = this.f31948b;
                h4Var.getClass();
                try {
                    if (h4Var.f34116f0.getParent() != null) {
                        ((WindowManager) h4Var.L.getSystemService("window")).removeView(h4Var.f34116f0);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                h4 h4Var2 = this.f31948b;
                j0 j0Var = h4Var2.f34117g0;
                if (j0Var != null && h4Var2.f34116f0 != null) {
                    j0Var.setLayerType(0, null);
                    h4Var2.Z = 0;
                    AndroidUtilities.hideKeyboard(h4Var2.L.getCurrentFocus());
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a0(this.f31948b, 11));
                return;
            case 3:
                h4 h4Var3 = this.f31948b;
                float currentProgress = 0.7f - h4Var3.f34118h0.f39101d0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f7 = 0.01f;
                    } else {
                        f7 = 0.02f;
                    }
                    org.telegram.ui.Components.x80 x80Var = h4Var3.f34118h0.f39101d0;
                    x80Var.a(x80Var.getCurrentProgress() + f7, true);
                    AndroidUtilities.runOnUIThread(h4Var3.f34120j0, 100L);
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new a0(this.f31948b, 11));
                return;
            case 5:
                this.f31948b.K.dismiss(true);
                return;
            case 6:
                this.f31948b.K.dismiss(true);
                return;
            case 7:
                h4 h4Var4 = this.f31948b;
                j0 j0Var2 = h4Var4.f34117g0;
                if (j0Var2 != null) {
                    j0Var2.setLayerType(0, null);
                    h4Var4.Z = 0;
                    h4Var4.M();
                    return;
                }
                return;
            case 8:
                this.f31948b.c0();
                return;
            case 9:
                this.f31948b.h0();
                return;
            case 10:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != 0) {
                    ?? obj = new Object();
                    obj.f19592a = true;
                    U.showAsSheet(new org.telegram.ui.web.a2(new r(this.f31948b, 3)), obj);
                    return;
                }
                return;
            default:
                this.f31948b.f0();
                return;
        }
    }
}
