package org.telegram.ui.Components;
public final class vn0 implements o1.f {
    public final int f31351a;
    public final do0 f31352b;
    public final o1.j f31353c;

    public vn0(do0 do0Var, o1.j jVar, int i10) {
        this.f31351a = i10;
        this.f31352b = do0Var;
        this.f31353c = jVar;
    }

    @Override
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.f31351a) {
            case 0:
                if (!z10) {
                    this.f31352b.f25536z.remove(this.f31353c);
                    jVar.d();
                    return;
                }
                return;
            default:
                do0 do0Var = this.f31352b;
                if (!z10) {
                    do0Var.f25536z.remove(this.f31353c);
                    jVar.d();
                    return;
                }
                do0Var.getClass();
                return;
        }
    }
}
