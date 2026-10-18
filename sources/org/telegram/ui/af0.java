package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class af0 implements Runnable {
    public final int f35393a;
    public final if0 f35394b;
    public final int f35395c;

    public af0(if0 if0Var, int i10, int i11) {
        this.f35393a = i11;
        this.f35394b = if0Var;
        this.f35395c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35393a) {
            case 0:
                AndroidUtilities.runOnUIThread(new af0(this.f35394b, this.f35395c, 1));
                return;
            case 1:
                this.f35394b.A(this.f35395c);
                return;
            default:
                this.f35394b.f37861f.f41477f[this.f35395c].l(1.0f);
                return;
        }
    }
}
