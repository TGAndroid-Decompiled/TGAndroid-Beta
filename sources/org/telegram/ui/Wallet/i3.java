package org.telegram.ui.Wallet;

import android.view.View;
public final class i3 implements Runnable {
    public final int f36695a;
    public final m3 f36696b;

    public i3(m3 m3Var, int i10) {
        this.f36695a = i10;
        this.f36696b = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f36695a) {
            case 0:
                org.telegram.ui.Cells.v0 v0Var = this.f36696b.f36892a;
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                this.f36696b.p();
                return;
        }
    }
}
