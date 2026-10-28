package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class s2 implements Runnable {
    public final int f23071a;
    public final k3 f23072b;

    public s2(k3 k3Var, int i10) {
        this.f23071a = i10;
        this.f23072b = k3Var;
    }

    @Override
    public final void run() {
        switch (this.f23071a) {
            case 0:
                k3 k3Var = this.f23072b;
                k3Var.getClass();
                try {
                    k3Var.dismissInternal();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                k3 k3Var2 = this.f23072b;
                AndroidUtilities.removeFromParent(k3Var2.container);
                k3Var2.attachedFragment.getLayoutContainer().addView(k3Var2.container);
                return;
            default:
                this.f23072b.dismiss();
                return;
        }
    }
}
