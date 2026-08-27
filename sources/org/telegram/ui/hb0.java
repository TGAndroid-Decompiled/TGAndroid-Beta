package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

public final class hb0 implements Runnable {

    public final int f38770a;

    public final ob0 f38771b;

    public hb0(ob0 ob0Var, int i10) {
        this.f38770a = i10;
        this.f38771b = ob0Var;
    }

    @Override
    public final void run() {
        switch (this.f38770a) {
            case 0:
                ob0 ob0Var = this.f38771b;
                if (ob0Var.h >= 0) {
                    ConnectionsManager.getInstance(ob0Var.f41051b).cancelRequest(ob0Var.h, true);
                    ob0Var.h = -1;
                }
                break;
            default:
                this.f38771b.a();
                break;
        }
    }
}
