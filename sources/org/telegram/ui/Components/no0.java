package org.telegram.ui.Components;
public final class no0 implements o1.f {
    public final int f28871a;
    public final vo0 f28872b;
    public final o1.k f28873c;

    public no0(vo0 vo0Var, o1.k kVar, int i10) {
        this.f28871a = i10;
        this.f28872b = vo0Var;
        this.f28873c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f28871a) {
            case 0:
                if (!z10) {
                    this.f28872b.f31418z.remove(this.f28873c);
                    hVar.c();
                    return;
                }
                return;
            default:
                vo0 vo0Var = this.f28872b;
                if (!z10) {
                    vo0Var.f31418z.remove(this.f28873c);
                    hVar.c();
                    return;
                }
                vo0Var.getClass();
                return;
        }
    }
}
