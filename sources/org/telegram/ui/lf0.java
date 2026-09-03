package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class lf0 implements Runnable {
    public final int f38628a;
    public final sf0 f38629b;
    public final int f38630c;

    public lf0(sf0 sf0Var, int i10, int i11) {
        this.f38628a = i11;
        this.f38629b = sf0Var;
        this.f38630c = i10;
    }

    @Override
    public final void run() {
        switch (this.f38628a) {
            case 0:
                AndroidUtilities.runOnUIThread(new lf0(this.f38629b, this.f38630c, 1));
                return;
            case 1:
                this.f38629b.A(this.f38630c);
                return;
            default:
                this.f38629b.f41170f.f44011f[this.f38630c].l(1.0f);
                return;
        }
    }
}
