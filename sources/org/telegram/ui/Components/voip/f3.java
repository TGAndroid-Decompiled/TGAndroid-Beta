package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class f3 implements Runnable {
    public final int f28125a;
    public final k3 f28126b;
    public final int f28127c;

    public f3(k3 k3Var, int i10, int i11) {
        this.f28125a = i11;
        this.f28126b = k3Var;
        this.f28127c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28125a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f3(this.f28126b, this.f28127c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new f3(this.f28126b, this.f28127c, 3));
                return;
            case 2:
                this.f28126b.c(this.f28127c);
                return;
            default:
                this.f28126b.a(this.f28127c);
                return;
        }
    }
}
