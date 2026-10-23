package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ef0 implements Runnable {
    public final int f36957a;
    public final mf0 f36958b;
    public final int f36959c;

    public ef0(mf0 mf0Var, int i10, int i11) {
        this.f36957a = i11;
        this.f36958b = mf0Var;
        this.f36959c = i10;
    }

    @Override
    public final void run() {
        switch (this.f36957a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ef0(this.f36958b, this.f36959c, 1));
                return;
            case 1:
                this.f36958b.z(this.f36959c);
                return;
            default:
                this.f36958b.f39544f.f41793f[this.f36959c].l(1.0f);
                return;
        }
    }
}
