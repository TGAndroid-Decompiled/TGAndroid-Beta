package org.telegram.ui.Components;
public final class ap0 implements o1.f {
    public final int f22747a;
    public final ip0 f22748b;
    public final o1.k f22749c;

    public ap0(ip0 ip0Var, o1.k kVar, int i10) {
        this.f22747a = i10;
        this.f22748b = ip0Var;
        this.f22749c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f22747a) {
            case 0:
                if (!z10) {
                    this.f22748b.f25147z.remove(this.f22749c);
                    hVar.c();
                    return;
                }
                return;
            default:
                ip0 ip0Var = this.f22748b;
                if (!z10) {
                    ip0Var.f25147z.remove(this.f22749c);
                    hVar.c();
                    return;
                }
                ip0Var.getClass();
                return;
        }
    }
}
