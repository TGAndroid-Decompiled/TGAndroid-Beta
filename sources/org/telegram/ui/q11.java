package org.telegram.ui;
public final class q11 implements Runnable {
    public final int f39575a;
    public final t11 f39576b;
    public final int f39577c;

    public q11(t11 t11Var, int i10, int i11) {
        this.f39575a = i11;
        this.f39576b = t11Var;
        this.f39577c = i10;
    }

    @Override
    public final void run() {
        switch (this.f39575a) {
            case 0:
                t11 t11Var = this.f39576b;
                org.telegram.ui.Components.f91 f91Var = t11Var.f40668n;
                s11 s11Var = t11Var.f40670s;
                int i10 = this.f39577c;
                f91Var.d(i10, s11Var.i(i10));
                return;
            default:
                t11 t11Var2 = this.f39576b;
                org.telegram.ui.Components.f91 f91Var2 = t11Var2.f40668n;
                s11 s11Var2 = t11Var2.f40670s;
                int i11 = this.f39577c;
                f91Var2.d(i11, s11Var2.i(i11));
                return;
        }
    }
}
