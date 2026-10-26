package org.telegram.ui;
public final class lr implements Runnable {
    public final int f41344a;
    public final mr f41345b;

    public lr(mr mrVar, int i10) {
        this.f41344a = i10;
        this.f41345b = mrVar;
    }

    @Override
    public final void run() {
        switch (this.f41344a) {
            case 0:
                org.telegram.ui.Components.l71 l71Var = this.f41345b.f30419a;
                if (l71Var != null) {
                    l71Var.f32152g3.O(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.l71 l71Var2 = this.f41345b.f30419a;
                if (l71Var2 != null) {
                    l71Var2.f32152g3.O(true);
                    return;
                }
                return;
        }
    }
}
