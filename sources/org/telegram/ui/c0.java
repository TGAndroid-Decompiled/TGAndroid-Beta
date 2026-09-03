package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class c0 implements Runnable {
    public final int f35644a;
    public final l4 f35645b;

    public c0(l4 l4Var, int i10) {
        this.f35644a = i10;
        this.f35645b = l4Var;
    }

    @Override
    public final void run() {
        float f10;
        switch (this.f35644a) {
            case 0:
                l4 l4Var = this.f35645b;
                l4Var.getClass();
                try {
                    if (l4Var.f38510c0.getParent() != null) {
                        ((WindowManager) l4Var.I.getSystemService("window")).removeView(l4Var.f38510c0);
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 1:
                l4 l4Var2 = this.f35645b;
                l0 l0Var = l4Var2.f38511d0;
                if (l0Var != null && l4Var2.f38510c0 != null) {
                    l0Var.setLayerType(0, null);
                    l4Var2.W = 0;
                    AndroidUtilities.hideKeyboard(l4Var2.I.getCurrentFocus());
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new c0(this.f35645b, 11));
                return;
            case 3:
                l4 l4Var3 = this.f35645b;
                float currentProgress = 0.7f - l4Var3.f38512e0.f42663a0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f10 = 0.01f;
                    } else {
                        f10 = 0.02f;
                    }
                    org.telegram.ui.Components.p80 p80Var = l4Var3.f38512e0.f42663a0;
                    p80Var.a(p80Var.getCurrentProgress() + f10, true);
                    AndroidUtilities.runOnUIThread(l4Var3.f38514g0, 100L);
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new c0(this.f35645b, 11));
                return;
            case 5:
                this.f35645b.H.dismiss(true);
                return;
            case 6:
                this.f35645b.H.dismiss(true);
                return;
            case 7:
                l4 l4Var4 = this.f35645b;
                l0 l0Var2 = l4Var4.f38511d0;
                if (l0Var2 != null) {
                    l0Var2.setLayerType(0, null);
                    l4Var4.W = 0;
                    l4Var4.M();
                    return;
                }
                return;
            case 8:
                this.f35645b.c0();
                return;
            case 9:
                this.f35645b.h0();
                return;
            case 10:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != 0) {
                    ?? obj = new Object();
                    obj.f22158a = true;
                    U.showAsSheet(new org.telegram.ui.web.x1(new t(this.f35645b, 3)), obj);
                    return;
                }
                return;
            default:
                this.f35645b.f0();
                return;
        }
    }
}
