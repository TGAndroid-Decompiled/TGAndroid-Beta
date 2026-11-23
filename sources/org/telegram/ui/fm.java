package org.telegram.ui;
public final class fm extends vf.b {
    public final int d;
    public final org.telegram.ui.Cells.z f47915e;
    public final Object f47916f;

    public fm(Object obj, org.telegram.ui.Cells.z zVar, int i7) {
        this.d = i7;
        this.f47916f = obj;
        this.f47915e = zVar;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f47916f).f50079a, 3), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f47916f).f50079a, 4), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f47916f).f50079a, 5), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f47916f).f50079a, 6), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f47916f).f50079a, 7), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f47916f).f50079a, 8), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ah(5, this, (org.telegram.ui.Cells.v0) this.f47915e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                mm mmVar = (mm) this.f47916f;
                bn bnVar = mmVar.f50079a;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f47915e;
                bnVar.f46130ac = r1Var.getMessageObject().e1();
                bn bnVar2 = mmVar.f50079a;
                bnVar2.f46145bc = 2;
                bnVar2.f46159cc = null;
                r1Var.invalidate();
                return;
            case 1:
                mm mmVar2 = (mm) this.f47916f;
                bn bnVar3 = mmVar2.f50079a;
                org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) this.f47915e;
                bnVar3.f46130ac = r1Var2.getMessageObject().e1();
                bn bnVar4 = mmVar2.f50079a;
                bnVar4.f46145bc = 2;
                bnVar4.f46159cc = null;
                r1Var2.invalidate();
                return;
            case 2:
                mm mmVar3 = (mm) this.f47916f;
                bn bnVar5 = mmVar3.f50079a;
                org.telegram.ui.Cells.r1 r1Var3 = (org.telegram.ui.Cells.r1) this.f47915e;
                bnVar5.f46130ac = r1Var3.getMessageObject().e1();
                bn bnVar6 = mmVar3.f50079a;
                bnVar6.f46145bc = 2;
                bnVar6.f46159cc = null;
                r1Var3.invalidate();
                return;
            case 3:
                mm mmVar4 = (mm) this.f47916f;
                bn bnVar7 = mmVar4.f50079a;
                org.telegram.ui.Cells.r1 r1Var4 = (org.telegram.ui.Cells.r1) this.f47915e;
                bnVar7.f46130ac = r1Var4.getMessageObject().e1();
                bn bnVar8 = mmVar4.f50079a;
                bnVar8.f46145bc = 2;
                bnVar8.f46159cc = null;
                r1Var4.invalidate();
                return;
            case 4:
                mm mmVar5 = (mm) this.f47916f;
                bn bnVar9 = mmVar5.f50079a;
                org.telegram.ui.Cells.r1 r1Var5 = (org.telegram.ui.Cells.r1) this.f47915e;
                bnVar9.f46130ac = r1Var5.getMessageObject().e1();
                bn bnVar10 = mmVar5.f50079a;
                bnVar10.f46145bc = 2;
                bnVar10.f46159cc = null;
                r1Var5.invalidate();
                return;
            case 5:
                mm mmVar6 = (mm) this.f47916f;
                bn bnVar11 = mmVar6.f50079a;
                org.telegram.ui.Cells.r1 r1Var6 = (org.telegram.ui.Cells.r1) this.f47915e;
                bnVar11.f46130ac = r1Var6.getMessageObject().e1();
                bn bnVar12 = mmVar6.f50079a;
                bnVar12.f46145bc = 2;
                bnVar12.f46159cc = null;
                r1Var6.invalidate();
                return;
            default:
                fl flVar = (fl) this.f47916f;
                bn bnVar13 = flVar.f47911a.R;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.f47915e;
                bnVar13.f46130ac = v0Var.getMessageObject().e1();
                bn bnVar14 = flVar.f47911a.R;
                bnVar14.f46145bc = 4;
                bnVar14.f46159cc = null;
                v0Var.getMessageObject().f24100r = true;
                v0Var.invalidate();
                return;
        }
    }
}
