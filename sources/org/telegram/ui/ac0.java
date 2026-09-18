package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class ac0 implements Runnable {
    public final int f32002a;
    public final gc0 f32003b;

    public ac0(gc0 gc0Var, int i10) {
        this.f32002a = i10;
        this.f32003b = gc0Var;
    }

    @Override
    public final void run() {
        switch (this.f32002a) {
            case 0:
                gc0 gc0Var = this.f32003b;
                if (gc0Var.h >= 0) {
                    ConnectionsManager.getInstance(gc0Var.f33804b).cancelRequest(gc0Var.h, true);
                    gc0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f32003b.a();
                return;
        }
    }
}
