package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class g3 implements Runnable {
    public final int f31941a;
    public final l3 f31942b;
    public final int f31943c;

    public g3(l3 l3Var, int i10, int i11) {
        this.f31941a = i11;
        this.f31942b = l3Var;
        this.f31943c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31941a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.f31942b, this.f31943c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.f31942b, this.f31943c, 3));
                return;
            case 2:
                this.f31942b.c(this.f31943c);
                return;
            default:
                this.f31942b.a(this.f31943c);
                return;
        }
    }
}
