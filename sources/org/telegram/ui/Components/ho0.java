package org.telegram.ui.Components;
public final class ho0 implements o1.g {
    public final int f29208a;
    public final po0 f29209b;
    public final o1.k f29210c;

    public ho0(po0 po0Var, o1.k kVar, int i10) {
        this.f29208a = i10;
        this.f29209b = po0Var;
        this.f29210c = kVar;
    }

    @Override
    public final void a(o1.i iVar, boolean z10, float f9, float f10) {
        switch (this.f29208a) {
            case 0:
                if (!z10) {
                    this.f29209b.f31729z.remove(this.f29210c);
                    iVar.c();
                    return;
                }
                return;
            default:
                po0 po0Var = this.f29209b;
                if (!z10) {
                    po0Var.f31729z.remove(this.f29210c);
                    iVar.c();
                    return;
                }
                po0Var.getClass();
                return;
        }
    }
}
