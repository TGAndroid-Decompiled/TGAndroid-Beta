package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class d0 implements Runnable {
    public final int f33277a;
    public final n4 f33278b;

    public d0(n4 n4Var, int i10) {
        this.f33277a = i10;
        this.f33278b = n4Var;
    }

    @Override
    public final void run() {
        float f10;
        switch (this.f33277a) {
            case 0:
                n4 n4Var = this.f33278b;
                n4Var.getClass();
                try {
                    if (n4Var.f36361c0.getParent() != null) {
                        ((WindowManager) n4Var.I.getSystemService("window")).removeView(n4Var.f36361c0);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                n4 n4Var2 = this.f33278b;
                n0 n0Var = n4Var2.f36362d0;
                if (n0Var != null && n4Var2.f36361c0 != null) {
                    n0Var.setLayerType(0, null);
                    n4Var2.W = 0;
                    AndroidUtilities.hideKeyboard(n4Var2.I.getCurrentFocus());
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new d0(this.f33278b, 11));
                return;
            case 3:
                n4 n4Var3 = this.f33278b;
                float currentProgress = 0.7f - n4Var3.f36363e0.f39594a0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f10 = 0.01f;
                    } else {
                        f10 = 0.02f;
                    }
                    org.telegram.ui.Components.o80 o80Var = n4Var3.f36363e0.f39594a0;
                    o80Var.a(o80Var.getCurrentProgress() + f10, true);
                    AndroidUtilities.runOnUIThread(n4Var3.f36365g0, 100L);
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new d0(this.f33278b, 11));
                return;
            case 5:
                this.f33278b.H.dismiss(true);
                return;
            case 6:
                this.f33278b.H.dismiss(true);
                return;
            case 7:
                n4 n4Var4 = this.f33278b;
                n0 n0Var2 = n4Var4.f36362d0;
                if (n0Var2 != null) {
                    n0Var2.setLayerType(0, null);
                    n4Var4.W = 0;
                    n4Var4.M();
                    return;
                }
                return;
            case 8:
                this.f33278b.c0();
                return;
            case 9:
                this.f33278b.h0();
                return;
            case 10:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != 0) {
                    ?? obj = new Object();
                    obj.f20453a = true;
                    U.showAsSheet(new org.telegram.ui.web.y1(new t(this.f33278b, 3)), obj);
                    return;
                }
                return;
            default:
                this.f33278b.f0();
                return;
        }
    }
}
