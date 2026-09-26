package org.telegram.ui.Components;
public final class ap0 implements o1.f {
    public final int f22746a;
    public final ip0 f22747b;
    public final o1.k f22748c;

    public ap0(ip0 ip0Var, o1.k kVar, int i10) {
        this.f22746a = i10;
        this.f22747b = ip0Var;
        this.f22748c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f22746a) {
            case 0:
                if (!z10) {
                    this.f22747b.f25146z.remove(this.f22748c);
                    hVar.c();
                    return;
                }
                return;
            default:
                ip0 ip0Var = this.f22747b;
                if (!z10) {
                    ip0Var.f25146z.remove(this.f22748c);
                    hVar.c();
                    return;
                }
                ip0Var.getClass();
                return;
        }
    }
}
