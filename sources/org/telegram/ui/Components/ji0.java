package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ji0 implements Runnable {
    public final int f29746a;
    public final mi0 f29747b;

    public ji0(mi0 mi0Var, int i9) {
        this.f29746a = i9;
        this.f29747b = mi0Var;
    }

    @Override
    public final void run() {
        switch (this.f29746a) {
            case 0:
                mi0 mi0Var = this.f29747b;
                mi0Var.getClass();
                try {
                    ff.h hVar = mi0Var.f30875z0;
                    if (hVar != null) {
                        hVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(mi0Var.f30872x0);
                return;
            case 1:
                mi0 mi0Var2 = this.f29747b;
                mi0Var2.M = null;
                mi0Var2.n();
                return;
            case 2:
                mi0.h(this.f29747b);
                return;
            case 3:
                mi0.e(this.f29747b);
                return;
            case 4:
                mi0.d(this.f29747b);
                return;
            case 5:
                mi0.f(this.f29747b);
                return;
            default:
                this.f29747b.k();
                return;
        }
    }
}
