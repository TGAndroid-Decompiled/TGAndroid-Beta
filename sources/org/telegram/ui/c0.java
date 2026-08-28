package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class c0 implements Runnable {
    public final int f37019a;
    public final l4 f37020b;

    public c0(l4 l4Var, int i9) {
        this.f37019a = i9;
        this.f37020b = l4Var;
    }

    @Override
    public final void run() {
        float f10;
        switch (this.f37019a) {
            case 0:
                l4 l4Var = this.f37020b;
                l4Var.getClass();
                try {
                    if (l4Var.f40012b0.getParent() != null) {
                        ((WindowManager) l4Var.H.getSystemService("window")).removeView(l4Var.f40012b0);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                l4 l4Var2 = this.f37020b;
                m0 m0Var = l4Var2.f40013c0;
                if (m0Var != null && l4Var2.f40012b0 != null) {
                    m0Var.setLayerType(0, null);
                    l4Var2.V = 0;
                    AndroidUtilities.hideKeyboard(l4Var2.H.getCurrentFocus());
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new c0(this.f37020b, 11));
                return;
            case 3:
                l4 l4Var3 = this.f37020b;
                float currentProgress = 0.7f - l4Var3.f40014d0.W.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f10 = 0.01f;
                    } else {
                        f10 = 0.02f;
                    }
                    org.telegram.ui.Components.v70 v70Var = l4Var3.f40014d0.W;
                    v70Var.a(v70Var.getCurrentProgress() + f10, true);
                    AndroidUtilities.runOnUIThread(l4Var3.f40016f0, 100L);
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new c0(this.f37020b, 11));
                return;
            case 5:
                this.f37020b.G.dismiss(true);
                return;
            case 6:
                this.f37020b.G.dismiss(true);
                return;
            case 7:
                l4 l4Var4 = this.f37020b;
                m0 m0Var2 = l4Var4.f40013c0;
                if (m0Var2 != null) {
                    m0Var2.setLayerType(0, null);
                    l4Var4.V = 0;
                    l4Var4.M();
                    return;
                }
                return;
            case 8:
                this.f37020b.c0();
                return;
            case 9:
                this.f37020b.h0();
                return;
            case 10:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != 0) {
                    ?? obj = new Object();
                    obj.f23653a = true;
                    U.showAsSheet(new org.telegram.ui.web.u1(new r(this.f37020b, 3)), obj);
                    return;
                }
                return;
            default:
                this.f37020b.f0();
                return;
        }
    }
}
