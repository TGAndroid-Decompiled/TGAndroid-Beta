package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public final class d0 implements Runnable {

    public final int f37215a;

    public final m4 f37216b;

    public d0(m4 m4Var, int i10) {
        this.f37215a = i10;
        this.f37216b = m4Var;
    }

    @Override
    public final void run() {
        switch (this.f37215a) {
            case 0:
                m4 m4Var = this.f37216b;
                m4Var.getClass();
                try {
                    if (m4Var.f40333b0.getParent() != null) {
                        ((WindowManager) m4Var.H.getSystemService("window")).removeView(m4Var.f40333b0);
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            case 1:
                m4 m4Var2 = this.f37216b;
                n0 n0Var = m4Var2.f40334c0;
                if (n0Var != null && m4Var2.f40333b0 != null) {
                    n0Var.setLayerType(0, null);
                    m4Var2.V = 0;
                    AndroidUtilities.hideKeyboard(m4Var2.H.getCurrentFocus());
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new d0(this.f37216b, 11));
                break;
            case 3:
                m4 m4Var3 = this.f37216b;
                float currentProgress = 0.7f - m4Var3.f40335d0.W.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    float f10 = currentProgress < 0.25f ? 0.01f : 0.02f;
                    org.telegram.ui.Components.z70 z70Var = m4Var3.f40335d0.W;
                    z70Var.a(z70Var.getCurrentProgress() + f10, true);
                    AndroidUtilities.runOnUIThread(m4Var3.f40337f0, 100L);
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new d0(this.f37216b, 11));
                break;
            case 5:
                this.f37216b.G.dismiss(true);
                break;
            case 6:
                this.f37216b.G.dismiss(true);
                break;
            case 7:
                m4 m4Var4 = this.f37216b;
                n0 n0Var2 = m4Var4.f40334c0;
                if (n0Var2 != null) {
                    n0Var2.setLayerType(0, null);
                    m4Var4.V = 0;
                    m4Var4.M();
                    break;
                }
                break;
            case 8:
                this.f37216b.c0();
                break;
            case 9:
                this.f37216b.h0();
                break;
            case 10:
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null) {
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.f23619a = true;
                    n2VarU.showAsSheet(new org.telegram.ui.web.v1(new s(this.f37216b, 3)), l2Var);
                }
                break;
            default:
                this.f37216b.f0();
                break;
        }
    }
}
