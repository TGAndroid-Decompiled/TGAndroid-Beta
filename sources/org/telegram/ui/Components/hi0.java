package org.telegram.ui.Components;
public final class hi0 implements Runnable {
    public final int f35258a;
    public final ki0 f35259b;

    public hi0(ki0 ki0Var, int i7) {
        this.f35258a = i7;
        this.f35259b = ki0Var;
    }

    @Override
    public final void run() {
        switch (this.f35258a) {
            case 0:
                if (this.f35259b.f36512a.getImageReceiver().B() != null && !this.f35259b.f36512a.getImageReceiver().B().f33588l0 && !this.f35259b.f36512a.getImageReceiver().B().y()) {
                    this.f35259b.f36512a.getImageReceiver().B().start();
                }
                this.f35259b.F = false;
                return;
            default:
                ki0 ki0Var = this.f35259b;
                mi0 mi0Var = ki0Var.Q;
                try {
                    ki0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                mi0Var.f37284n0 = mi0Var.U.indexOf(ki0Var.f36515e);
                mi0Var.m0 = ki0Var.f36515e;
                mi0Var.invalidate();
                return;
        }
    }
}
