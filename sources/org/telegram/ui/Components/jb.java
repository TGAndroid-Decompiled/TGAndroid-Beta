package org.telegram.ui.Components;
public final class jb implements o1.f {
    public final int f27662a;
    public final Object f27663b;

    public jb(Object obj, int i10) {
        this.f27662a = i10;
        this.f27663b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f27662a) {
            case 0:
                sc scVar = (sc) this.f27663b;
                if (scVar.d == hVar) {
                    scVar.d = null;
                    return;
                }
                return;
            case 1:
                fb fbVar = (fb) this.f27663b;
                if (!z10) {
                    fbVar.run();
                    return;
                }
                return;
            case 2:
                gl glVar = (gl) this.f27663b;
                glVar.f26742i0 = null;
                glVar.f26743j0 = 1.0f;
                glVar.k0();
                return;
            case 3:
                cq0 cq0Var = (cq0) this.f27663b;
                cq0Var.f25281q = false;
                cq0Var.dismiss();
                return;
            case 4:
                dq0 dq0Var = (dq0) this.f27663b;
                dq0Var.f25666s = false;
                dq0Var.f25665r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == dq0Var.f25663f) {
                    dq0Var.f25663f = null;
                    return;
                }
                return;
            case 5:
                or0 or0Var = (or0) this.f27663b;
                or0Var.E.setVisibility(8);
                or0Var.f29509z0.setVisibility(8);
                lr0 lr0Var = or0Var.L;
                lr0Var.f28445f = null;
                lr0Var.l();
                or0Var.B0 = null;
                or0Var.M0 = false;
                return;
            default:
                or0 or0Var2 = ((vq0) this.f27663b).d;
                or0Var2.F.setVisibility(8);
                or0Var2.G.setVisibility(8);
                or0Var2.f29508y0.setVisibility(8);
                or0Var2.B0 = null;
                return;
        }
    }
}
