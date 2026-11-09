package org.telegram.ui;
public final class gm extends vf.b {
    public final int d;
    public final org.telegram.ui.Cells.z f46033e;
    public final Object f46034f;

    public gm(Object obj, org.telegram.ui.Cells.z zVar, int i7) {
        this.d = i7;
        this.f46034f = obj;
        this.f46033e = zVar;
    }

    @Override
    public final void c(boolean z9) {
        switch (this.d) {
            case 0:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new gj(((nm) this.f46034f).f48207a, 3), 250L);
                    return;
                }
                return;
            case 1:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new gj(((nm) this.f46034f).f48207a, 4), 250L);
                    return;
                }
                return;
            case 2:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new gj(((nm) this.f46034f).f48207a, 5), 250L);
                    return;
                }
                return;
            case 3:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new gj(((nm) this.f46034f).f48207a, 6), 250L);
                    return;
                }
                return;
            case 4:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new gj(((nm) this.f46034f).f48207a, 7), 250L);
                    return;
                }
                return;
            case 5:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new gj(((nm) this.f46034f).f48207a, 8), 250L);
                    return;
                }
                return;
            default:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new rf(16, this, (org.telegram.ui.Cells.t0) this.f46033e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                nm nmVar = (nm) this.f46034f;
                cn cnVar = nmVar.f48207a;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f46033e;
                cnVar.Yb = q1Var.getMessageObject().e1();
                cn cnVar2 = nmVar.f48207a;
                cnVar2.Zb = 2;
                cnVar2.f44389ac = null;
                q1Var.invalidate();
                return;
            case 1:
                nm nmVar2 = (nm) this.f46034f;
                cn cnVar3 = nmVar2.f48207a;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.f46033e;
                cnVar3.Yb = q1Var2.getMessageObject().e1();
                cn cnVar4 = nmVar2.f48207a;
                cnVar4.Zb = 2;
                cnVar4.f44389ac = null;
                q1Var2.invalidate();
                return;
            case 2:
                nm nmVar3 = (nm) this.f46034f;
                cn cnVar5 = nmVar3.f48207a;
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) this.f46033e;
                cnVar5.Yb = q1Var3.getMessageObject().e1();
                cn cnVar6 = nmVar3.f48207a;
                cnVar6.Zb = 2;
                cnVar6.f44389ac = null;
                q1Var3.invalidate();
                return;
            case 3:
                nm nmVar4 = (nm) this.f46034f;
                cn cnVar7 = nmVar4.f48207a;
                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) this.f46033e;
                cnVar7.Yb = q1Var4.getMessageObject().e1();
                cn cnVar8 = nmVar4.f48207a;
                cnVar8.Zb = 2;
                cnVar8.f44389ac = null;
                q1Var4.invalidate();
                return;
            case 4:
                nm nmVar5 = (nm) this.f46034f;
                cn cnVar9 = nmVar5.f48207a;
                org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) this.f46033e;
                cnVar9.Yb = q1Var5.getMessageObject().e1();
                cn cnVar10 = nmVar5.f48207a;
                cnVar10.Zb = 2;
                cnVar10.f44389ac = null;
                q1Var5.invalidate();
                return;
            case 5:
                nm nmVar6 = (nm) this.f46034f;
                cn cnVar11 = nmVar6.f48207a;
                org.telegram.ui.Cells.q1 q1Var6 = (org.telegram.ui.Cells.q1) this.f46033e;
                cnVar11.Yb = q1Var6.getMessageObject().e1();
                cn cnVar12 = nmVar6.f48207a;
                cnVar12.Zb = 2;
                cnVar12.f44389ac = null;
                q1Var6.invalidate();
                return;
            default:
                gl glVar = (gl) this.f46034f;
                cn cnVar13 = glVar.f46031a.Q;
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) this.f46033e;
                cnVar13.Yb = t0Var.getMessageObject().e1();
                cn cnVar14 = glVar.f46031a.Q;
                cnVar14.Zb = 4;
                cnVar14.f44389ac = null;
                t0Var.getMessageObject().f23287r = true;
                t0Var.invalidate();
                return;
        }
    }
}
