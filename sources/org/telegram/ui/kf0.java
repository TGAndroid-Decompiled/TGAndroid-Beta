package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class kf0 implements Runnable {
    public final int f35664a;
    public final rf0 f35665b;
    public final int f35666c;

    public kf0(rf0 rf0Var, int i10, int i11) {
        this.f35664a = i11;
        this.f35665b = rf0Var;
        this.f35666c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35664a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kf0(this.f35665b, this.f35666c, 1));
                return;
            case 1:
                this.f35665b.A(this.f35666c);
                return;
            default:
                this.f35665b.f38023f.f40565f[this.f35666c].l(1.0f);
                return;
        }
    }
}
