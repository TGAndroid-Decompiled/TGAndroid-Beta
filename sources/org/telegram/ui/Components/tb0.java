package org.telegram.ui.Components;
public final class tb0 implements Runnable {
    public final int f32957a;
    public final hc0 f32958b;

    public tb0(hc0 hc0Var, int i10) {
        this.f32957a = i10;
        this.f32958b = hc0Var;
    }

    @Override
    public final void run() {
        switch (this.f32957a) {
            case 0:
                hc0 hc0Var = this.f32958b;
                ac0 ac0Var = hc0Var.f28918f;
                if (hc0Var.f28917c0.d.webpageTop) {
                    ac0Var.x0(-ac0Var.computeVerticalScrollOffset(), 250, mi.m.V);
                    return;
                }
                ac0Var.x0(ac0Var.computeVerticalScrollRange() - (ac0Var.computeVerticalScrollExtent() + ac0Var.computeVerticalScrollOffset()), 250, mi.m.V);
                return;
            default:
                this.f32958b.h(true, false);
                return;
        }
    }
}
