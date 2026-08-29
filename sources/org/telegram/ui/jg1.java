package org.telegram.ui;
public final class jg1 implements Runnable {
    public final int f39546a;
    public final kg1 f39547b;

    public jg1(kg1 kg1Var, int i10) {
        this.f39546a = i10;
        this.f39547b = kg1Var;
    }

    @Override
    public final void run() {
        switch (this.f39546a) {
            case 0:
                org.telegram.ui.Components.o51 o51Var = this.f39547b.f31601a;
                if (o51Var != null) {
                    o51Var.U2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.o51 o51Var2 = this.f39547b.f31601a;
                if (o51Var2 != null) {
                    o51Var2.U2.N(true);
                    return;
                }
                return;
        }
    }
}
