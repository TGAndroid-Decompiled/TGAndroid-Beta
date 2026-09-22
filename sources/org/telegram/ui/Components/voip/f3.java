package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class f3 implements Runnable {
    public final int f29312a;
    public final k3 f29313b;
    public final int f29314c;

    public f3(k3 k3Var, int i10, int i11) {
        this.f29312a = i11;
        this.f29313b = k3Var;
        this.f29314c = i10;
    }

    @Override
    public final void run() {
        switch (this.f29312a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f3(this.f29313b, this.f29314c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new f3(this.f29313b, this.f29314c, 3));
                return;
            case 2:
                this.f29313b.c(this.f29314c);
                return;
            default:
                this.f29313b.a(this.f29314c);
                return;
        }
    }
}
