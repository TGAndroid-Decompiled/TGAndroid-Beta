package org.telegram.ui.Components;
public final class op0 implements o1.f {
    public final int f29286a;
    public final wp0 f29287b;
    public final o1.k f29288c;

    public op0(wp0 wp0Var, o1.k kVar, int i10) {
        this.f29286a = i10;
        this.f29287b = wp0Var;
        this.f29288c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f29286a) {
            case 0:
                if (!z10) {
                    this.f29287b.f32313z.remove(this.f29288c);
                    hVar.c();
                    return;
                }
                return;
            default:
                wp0 wp0Var = this.f29287b;
                if (!z10) {
                    wp0Var.f32313z.remove(this.f29288c);
                    hVar.c();
                    return;
                }
                wp0Var.getClass();
                return;
        }
    }
}
