package org.telegram.ui;
public final class hr implements org.telegram.ui.Cells.e5, org.telegram.ui.Components.zw0 {
    public final int f39953a;
    public final ir f39954b;

    public hr(ir irVar, int i10) {
        this.f39953a = i10;
        this.f39954b = irVar;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.f5 f5Var, boolean z10) {
        mr mrVar = this.f39954b.d;
        return mrVar.i0(mrVar.f41502a.E(((Integer) f5Var.getTag()).intValue()), !z10, f5Var);
    }

    @Override
    public void j(int i10) {
        boolean z10;
        switch (this.f39953a) {
            case 1:
                mr mrVar = this.f39954b.d;
                if (mrVar.f41539r != null) {
                    int i11 = mrVar.f41534o1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    mrVar.f41534o1 = i10;
                    if (z10) {
                        gr x02 = mrVar.x0();
                        mrVar.C0();
                        mrVar.B0(x02);
                    }
                    mrVar.f41502a.m(mrVar.O0);
                    return;
                }
                return;
            default:
                this.f39954b.d.f41541r1 = i10 + 1;
                return;
        }
    }

    @Override
    public void m() {
        int i10 = this.f39953a;
    }

    private final void a() {
    }

    private final void c() {
    }
}
