package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class af0 implements Runnable {
    public final int f35441a;
    public final jf0 f35442b;
    public final int f35443c;

    public af0(jf0 jf0Var, int i10, int i11) {
        this.f35441a = i11;
        this.f35442b = jf0Var;
        this.f35443c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35441a) {
            case 0:
                AndroidUtilities.runOnUIThread(new af0(this.f35442b, this.f35443c, 1));
                return;
            case 1:
                this.f35442b.A(this.f35443c);
                return;
            default:
                this.f35442b.f38158f.f41512f[this.f35443c].l(1.0f);
                return;
        }
    }
}
