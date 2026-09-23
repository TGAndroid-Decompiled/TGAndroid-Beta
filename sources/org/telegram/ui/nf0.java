package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class nf0 implements Runnable {
    public final int f35515a;
    public final uf0 f35516b;
    public final int f35517c;

    public nf0(uf0 uf0Var, int i10, int i11) {
        this.f35515a = i11;
        this.f35516b = uf0Var;
        this.f35517c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35515a) {
            case 0:
                AndroidUtilities.runOnUIThread(new nf0(this.f35516b, this.f35517c, 1));
                return;
            case 1:
                this.f35516b.A(this.f35517c);
                return;
            default:
                this.f35516b.f38077f.f40230f[this.f35517c].l(1.0f);
                return;
        }
    }
}
