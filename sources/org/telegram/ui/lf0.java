package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class lf0 implements Runnable {
    public final int f38725a;
    public final sf0 f38726b;
    public final int f38727c;

    public lf0(sf0 sf0Var, int i10, int i11) {
        this.f38725a = i11;
        this.f38726b = sf0Var;
        this.f38727c = i10;
    }

    @Override
    public final void run() {
        switch (this.f38725a) {
            case 0:
                AndroidUtilities.runOnUIThread(new lf0(this.f38726b, this.f38727c, 1));
                return;
            case 1:
                this.f38726b.A(this.f38727c);
                return;
            default:
                this.f38726b.f41260f.f43982f[this.f38727c].l(1.0f);
                return;
        }
    }
}
