package org.telegram.ui.Components;
public final class ap0 implements o1.f {
    public final int f22728a;
    public final ip0 f22729b;
    public final o1.k f22730c;

    public ap0(ip0 ip0Var, o1.k kVar, int i10) {
        this.f22728a = i10;
        this.f22729b = ip0Var;
        this.f22730c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f22728a) {
            case 0:
                if (!z10) {
                    this.f22729b.f25120z.remove(this.f22730c);
                    hVar.c();
                    return;
                }
                return;
            default:
                ip0 ip0Var = this.f22729b;
                if (!z10) {
                    ip0Var.f25120z.remove(this.f22730c);
                    hVar.c();
                    return;
                }
                ip0Var.getClass();
                return;
        }
    }
}
