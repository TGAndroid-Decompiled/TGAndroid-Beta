package org.telegram.ui;
public final class fm extends vf.b {
    public final int d;
    public final org.telegram.ui.Cells.z f47691e;
    public final Object f47692f;

    public fm(Object obj, org.telegram.ui.Cells.z zVar, int i7) {
        this.d = i7;
        this.f47692f = obj;
        this.f47691e = zVar;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f47692f).f49896a, 3), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f47692f).f49896a, 4), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f47692f).f49896a, 5), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f47692f).f49896a, 6), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f47692f).f49896a, 7), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f47692f).f49896a, 8), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ci(1, this, (org.telegram.ui.Cells.v0) this.f47691e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                mm mmVar = (mm) this.f47692f;
                bn bnVar = mmVar.f49896a;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f47691e;
                bnVar.f45935ac = r1Var.getMessageObject().e1();
                bn bnVar2 = mmVar.f49896a;
                bnVar2.f45950bc = 2;
                bnVar2.f45964cc = null;
                r1Var.invalidate();
                return;
            case 1:
                mm mmVar2 = (mm) this.f47692f;
                bn bnVar3 = mmVar2.f49896a;
                org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) this.f47691e;
                bnVar3.f45935ac = r1Var2.getMessageObject().e1();
                bn bnVar4 = mmVar2.f49896a;
                bnVar4.f45950bc = 2;
                bnVar4.f45964cc = null;
                r1Var2.invalidate();
                return;
            case 2:
                mm mmVar3 = (mm) this.f47692f;
                bn bnVar5 = mmVar3.f49896a;
                org.telegram.ui.Cells.r1 r1Var3 = (org.telegram.ui.Cells.r1) this.f47691e;
                bnVar5.f45935ac = r1Var3.getMessageObject().e1();
                bn bnVar6 = mmVar3.f49896a;
                bnVar6.f45950bc = 2;
                bnVar6.f45964cc = null;
                r1Var3.invalidate();
                return;
            case 3:
                mm mmVar4 = (mm) this.f47692f;
                bn bnVar7 = mmVar4.f49896a;
                org.telegram.ui.Cells.r1 r1Var4 = (org.telegram.ui.Cells.r1) this.f47691e;
                bnVar7.f45935ac = r1Var4.getMessageObject().e1();
                bn bnVar8 = mmVar4.f49896a;
                bnVar8.f45950bc = 2;
                bnVar8.f45964cc = null;
                r1Var4.invalidate();
                return;
            case 4:
                mm mmVar5 = (mm) this.f47692f;
                bn bnVar9 = mmVar5.f49896a;
                org.telegram.ui.Cells.r1 r1Var5 = (org.telegram.ui.Cells.r1) this.f47691e;
                bnVar9.f45935ac = r1Var5.getMessageObject().e1();
                bn bnVar10 = mmVar5.f49896a;
                bnVar10.f45950bc = 2;
                bnVar10.f45964cc = null;
                r1Var5.invalidate();
                return;
            case 5:
                mm mmVar6 = (mm) this.f47692f;
                bn bnVar11 = mmVar6.f49896a;
                org.telegram.ui.Cells.r1 r1Var6 = (org.telegram.ui.Cells.r1) this.f47691e;
                bnVar11.f45935ac = r1Var6.getMessageObject().e1();
                bn bnVar12 = mmVar6.f49896a;
                bnVar12.f45950bc = 2;
                bnVar12.f45964cc = null;
                r1Var6.invalidate();
                return;
            default:
                fl flVar = (fl) this.f47692f;
                bn bnVar13 = flVar.f47687a.R;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.f47691e;
                bnVar13.f45935ac = v0Var.getMessageObject().e1();
                bn bnVar14 = flVar.f47687a.R;
                bnVar14.f45950bc = 4;
                bnVar14.f45964cc = null;
                v0Var.getMessageObject().f23992r = true;
                v0Var.invalidate();
                return;
        }
    }
}
