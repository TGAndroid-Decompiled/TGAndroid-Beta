package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class db0 implements Runnable {
    public final int f37493a;
    public final kb0 f37494b;

    public db0(kb0 kb0Var, int i9) {
        this.f37493a = i9;
        this.f37494b = kb0Var;
    }

    @Override
    public final void run() {
        switch (this.f37493a) {
            case 0:
                kb0 kb0Var = this.f37494b;
                if (kb0Var.h >= 0) {
                    ConnectionsManager.getInstance(kb0Var.f39791b).cancelRequest(kb0Var.h, true);
                    kb0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f37494b.a();
                return;
        }
    }
}
