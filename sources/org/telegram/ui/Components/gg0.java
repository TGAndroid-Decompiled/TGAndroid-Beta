package org.telegram.ui.Components;
public final class gg0 implements Runnable {
    public final int f28769a;
    public final kg0 f28770b;

    public gg0(kg0 kg0Var, int i9) {
        this.f28769a = i9;
        this.f28770b = kg0Var;
    }

    @Override
    public final void run() {
        switch (this.f28769a) {
            case 0:
                this.f28770b.a(true);
                return;
            default:
                this.f28770b.d();
                return;
        }
    }
}
