package org.telegram.ui;
public final class fm extends vf.b {
    public final int d;
    public final org.telegram.ui.Cells.z f47727e;
    public final Object f47728f;

    public fm(Object obj, org.telegram.ui.Cells.z zVar, int i7) {
        this.d = i7;
        this.f47728f = obj;
        this.f47727e = zVar;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f47728f).f49922a, 3), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f47728f).f49922a, 4), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f47728f).f49922a, 5), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f47728f).f49922a, 6), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f47728f).f49922a, 7), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.f47728f).f49922a, 8), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ci(1, this, (org.telegram.ui.Cells.u0) this.f47727e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                mm mmVar = (mm) this.f47728f;
                bn bnVar = mmVar.f49922a;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f47727e;
                bnVar.f45944ac = q1Var.getMessageObject().e1();
                bn bnVar2 = mmVar.f49922a;
                bnVar2.f45959bc = 2;
                bnVar2.f45973cc = null;
                q1Var.invalidate();
                return;
            case 1:
                mm mmVar2 = (mm) this.f47728f;
                bn bnVar3 = mmVar2.f49922a;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.f47727e;
                bnVar3.f45944ac = q1Var2.getMessageObject().e1();
                bn bnVar4 = mmVar2.f49922a;
                bnVar4.f45959bc = 2;
                bnVar4.f45973cc = null;
                q1Var2.invalidate();
                return;
            case 2:
                mm mmVar3 = (mm) this.f47728f;
                bn bnVar5 = mmVar3.f49922a;
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) this.f47727e;
                bnVar5.f45944ac = q1Var3.getMessageObject().e1();
                bn bnVar6 = mmVar3.f49922a;
                bnVar6.f45959bc = 2;
                bnVar6.f45973cc = null;
                q1Var3.invalidate();
                return;
            case 3:
                mm mmVar4 = (mm) this.f47728f;
                bn bnVar7 = mmVar4.f49922a;
                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) this.f47727e;
                bnVar7.f45944ac = q1Var4.getMessageObject().e1();
                bn bnVar8 = mmVar4.f49922a;
                bnVar8.f45959bc = 2;
                bnVar8.f45973cc = null;
                q1Var4.invalidate();
                return;
            case 4:
                mm mmVar5 = (mm) this.f47728f;
                bn bnVar9 = mmVar5.f49922a;
                org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) this.f47727e;
                bnVar9.f45944ac = q1Var5.getMessageObject().e1();
                bn bnVar10 = mmVar5.f49922a;
                bnVar10.f45959bc = 2;
                bnVar10.f45973cc = null;
                q1Var5.invalidate();
                return;
            case 5:
                mm mmVar6 = (mm) this.f47728f;
                bn bnVar11 = mmVar6.f49922a;
                org.telegram.ui.Cells.q1 q1Var6 = (org.telegram.ui.Cells.q1) this.f47727e;
                bnVar11.f45944ac = q1Var6.getMessageObject().e1();
                bn bnVar12 = mmVar6.f49922a;
                bnVar12.f45959bc = 2;
                bnVar12.f45973cc = null;
                q1Var6.invalidate();
                return;
            default:
                fl flVar = (fl) this.f47728f;
                bn bnVar13 = flVar.f47723a.R;
                org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) this.f47727e;
                bnVar13.f45944ac = u0Var.getMessageObject().e1();
                bn bnVar14 = flVar.f47723a.R;
                bnVar14.f45959bc = 4;
                bnVar14.f45973cc = null;
                u0Var.getMessageObject().f23995r = true;
                u0Var.invalidate();
                return;
        }
    }
}
