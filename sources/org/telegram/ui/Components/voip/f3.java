package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class f3 implements Runnable {
    public final int f28947a;
    public final k3 f28948b;
    public final int f28949c;

    public f3(k3 k3Var, int i10, int i11) {
        this.f28947a = i11;
        this.f28948b = k3Var;
        this.f28949c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28947a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f3(this.f28948b, this.f28949c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new f3(this.f28948b, this.f28949c, 3));
                return;
            case 2:
                this.f28948b.c(this.f28949c);
                return;
            default:
                this.f28948b.a(this.f28949c);
                return;
        }
    }
}
