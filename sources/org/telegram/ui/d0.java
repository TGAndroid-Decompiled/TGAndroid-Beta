package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class d0 implements Runnable {
    public final int f37248a;
    public final m4 f37249b;

    public d0(m4 m4Var, int i10) {
        this.f37248a = i10;
        this.f37249b = m4Var;
    }

    @Override
    public final void run() {
        float f9;
        switch (this.f37248a) {
            case 0:
                m4 m4Var = this.f37249b;
                m4Var.getClass();
                try {
                    if (m4Var.f40390b0.getParent() != null) {
                        ((WindowManager) m4Var.H.getSystemService("window")).removeView(m4Var.f40390b0);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                m4 m4Var2 = this.f37249b;
                n0 n0Var = m4Var2.f40391c0;
                if (n0Var != null && m4Var2.f40390b0 != null) {
                    n0Var.setLayerType(0, null);
                    m4Var2.V = 0;
                    AndroidUtilities.hideKeyboard(m4Var2.H.getCurrentFocus());
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new d0(this.f37249b, 11));
                return;
            case 3:
                m4 m4Var3 = this.f37249b;
                float currentProgress = 0.7f - m4Var3.f40392d0.W.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    if (currentProgress < 0.25f) {
                        f9 = 0.01f;
                    } else {
                        f9 = 0.02f;
                    }
                    org.telegram.ui.Components.i80 i80Var = m4Var3.f40392d0.W;
                    i80Var.a(i80Var.getCurrentProgress() + f9, true);
                    AndroidUtilities.runOnUIThread(m4Var3.f40394f0, 100L);
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new d0(this.f37249b, 11));
                return;
            case 5:
                this.f37249b.G.dismiss(true);
                return;
            case 6:
                this.f37249b.G.dismiss(true);
                return;
            case 7:
                m4 m4Var4 = this.f37249b;
                n0 n0Var2 = m4Var4.f40391c0;
                if (n0Var2 != null) {
                    n0Var2.setLayerType(0, null);
                    m4Var4.V = 0;
                    m4Var4.M();
                    return;
                }
                return;
            case 8:
                this.f37249b.c0();
                return;
            case 9:
                this.f37249b.h0();
                return;
            case 10:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != 0) {
                    ?? obj = new Object();
                    obj.f23673a = true;
                    U.showAsSheet(new org.telegram.ui.web.w1(new t(this.f37249b, 3)), obj);
                    return;
                }
                return;
            default:
                this.f37249b.f0();
                return;
        }
    }
}
