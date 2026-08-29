package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class gb0 implements Runnable {
    public final int f38547a;
    public final mb0 f38548b;

    public gb0(mb0 mb0Var, int i10) {
        this.f38547a = i10;
        this.f38548b = mb0Var;
    }

    @Override
    public final void run() {
        switch (this.f38547a) {
            case 0:
                mb0 mb0Var = this.f38548b;
                if (mb0Var.h >= 0) {
                    ConnectionsManager.getInstance(mb0Var.f40514b).cancelRequest(mb0Var.h, true);
                    mb0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f38548b.a();
                return;
        }
    }
}
