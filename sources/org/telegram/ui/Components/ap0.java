package org.telegram.ui.Components;
public final class ap0 implements o1.f {
    public final int f22734a;
    public final ip0 f22735b;
    public final o1.k f22736c;

    public ap0(ip0 ip0Var, o1.k kVar, int i10) {
        this.f22734a = i10;
        this.f22735b = ip0Var;
        this.f22736c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f22734a) {
            case 0:
                if (!z10) {
                    this.f22735b.f25110z.remove(this.f22736c);
                    hVar.c();
                    return;
                }
                return;
            default:
                ip0 ip0Var = this.f22735b;
                if (!z10) {
                    ip0Var.f25110z.remove(this.f22736c);
                    hVar.c();
                    return;
                }
                ip0Var.getClass();
                return;
        }
    }
}
