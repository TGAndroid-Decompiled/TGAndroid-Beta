package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class s2 implements Runnable {
    public final int f23070a;
    public final k3 f23071b;

    public s2(k3 k3Var, int i10) {
        this.f23070a = i10;
        this.f23071b = k3Var;
    }

    @Override
    public final void run() {
        switch (this.f23070a) {
            case 0:
                k3 k3Var = this.f23071b;
                k3Var.getClass();
                try {
                    k3Var.dismissInternal();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                k3 k3Var2 = this.f23071b;
                AndroidUtilities.removeFromParent(k3Var2.container);
                k3Var2.attachedFragment.getLayoutContainer().addView(k3Var2.container);
                return;
            default:
                this.f23071b.dismiss();
                return;
        }
    }
}
