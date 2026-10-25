package org.telegram.ui;
public final class lr implements Runnable {
    public final int f41341a;
    public final mr f41342b;

    public lr(mr mrVar, int i10) {
        this.f41341a = i10;
        this.f41342b = mrVar;
    }

    @Override
    public final void run() {
        switch (this.f41341a) {
            case 0:
                org.telegram.ui.Components.l71 l71Var = this.f41342b.f30417a;
                if (l71Var != null) {
                    l71Var.f32150g3.O(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.l71 l71Var2 = this.f41342b.f30417a;
                if (l71Var2 != null) {
                    l71Var2.f32150g3.O(true);
                    return;
                }
                return;
        }
    }
}
