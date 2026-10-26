package org.telegram.ui.Components;
public final class tb0 implements Runnable {
    public final int f32960a;
    public final hc0 f32961b;

    public tb0(hc0 hc0Var, int i10) {
        this.f32960a = i10;
        this.f32961b = hc0Var;
    }

    @Override
    public final void run() {
        switch (this.f32960a) {
            case 0:
                hc0 hc0Var = this.f32961b;
                ac0 ac0Var = hc0Var.f28920f;
                if (hc0Var.f28919c0.d.webpageTop) {
                    ac0Var.x0(-ac0Var.computeVerticalScrollOffset(), 250, mi.m.V);
                    return;
                }
                ac0Var.x0(ac0Var.computeVerticalScrollRange() - (ac0Var.computeVerticalScrollExtent() + ac0Var.computeVerticalScrollOffset()), 250, mi.m.V);
                return;
            default:
                this.f32961b.h(true, false);
                return;
        }
    }
}
