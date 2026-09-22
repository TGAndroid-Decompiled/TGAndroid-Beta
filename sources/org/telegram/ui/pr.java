package org.telegram.ui;
public final class pr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.sv0 {
    public final int f36670a;
    public final qr f36671b;

    public pr(qr qrVar, int i10) {
        this.f36670a = i10;
        this.f36671b = qrVar;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        ur urVar = this.f36671b.d;
        return urVar.h0(urVar.f38107a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override
    public void g(int i10) {
        boolean z10;
        switch (this.f36670a) {
            case 1:
                ur urVar = this.f36671b.d;
                if (urVar.f38147s != null) {
                    int i11 = urVar.f38141p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    urVar.f38141p1 = i10;
                    if (z10) {
                        or w02 = urVar.w0();
                        urVar.B0();
                        urVar.A0(w02);
                    }
                    urVar.f38107a.m(urVar.P0);
                    return;
                }
                return;
            default:
                this.f36671b.d.f38149s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void l() {
        int i10 = this.f36670a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
