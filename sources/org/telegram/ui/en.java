package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class en extends of.e {
    public final int d;
    public final org.telegram.ui.Cells.a0 f37341e;
    public final Object f37342f;

    public en(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f37342f = obj;
        this.f37341e = a0Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f37342f).f39680a, 3), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f37342f).f39680a, 4), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f37342f).f39680a, 5), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f37342f).f39680a, 6), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f37342f).f39680a, 7), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f37342f).f39680a, 8), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new sg(13, this, (org.telegram.ui.Cells.w0) this.f37341e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                ln lnVar = (ln) this.f37342f;
                zn znVar = lnVar.f39680a;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f37341e;
                znVar.f45031wb = u1Var.getMessageObject().getId();
                zn znVar2 = lnVar.f39680a;
                znVar2.f45045xb = 2;
                znVar2.f45057yb = null;
                u1Var.invalidate();
                return;
            case 1:
                ln lnVar2 = (ln) this.f37342f;
                zn znVar3 = lnVar2.f39680a;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.f37341e;
                znVar3.f45031wb = u1Var2.getMessageObject().getId();
                zn znVar4 = lnVar2.f39680a;
                znVar4.f45045xb = 2;
                znVar4.f45057yb = null;
                u1Var2.invalidate();
                return;
            case 2:
                ln lnVar3 = (ln) this.f37342f;
                zn znVar5 = lnVar3.f39680a;
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) this.f37341e;
                znVar5.f45031wb = u1Var3.getMessageObject().getId();
                zn znVar6 = lnVar3.f39680a;
                znVar6.f45045xb = 2;
                znVar6.f45057yb = null;
                u1Var3.invalidate();
                return;
            case 3:
                ln lnVar4 = (ln) this.f37342f;
                zn znVar7 = lnVar4.f39680a;
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) this.f37341e;
                znVar7.f45031wb = u1Var4.getMessageObject().getId();
                zn znVar8 = lnVar4.f39680a;
                znVar8.f45045xb = 2;
                znVar8.f45057yb = null;
                u1Var4.invalidate();
                return;
            case 4:
                ln lnVar5 = (ln) this.f37342f;
                zn znVar9 = lnVar5.f39680a;
                org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) this.f37341e;
                znVar9.f45031wb = u1Var5.getMessageObject().getId();
                zn znVar10 = lnVar5.f39680a;
                znVar10.f45045xb = 2;
                znVar10.f45057yb = null;
                u1Var5.invalidate();
                return;
            case 5:
                ln lnVar6 = (ln) this.f37342f;
                zn znVar11 = lnVar6.f39680a;
                org.telegram.ui.Cells.u1 u1Var6 = (org.telegram.ui.Cells.u1) this.f37341e;
                znVar11.f45031wb = u1Var6.getMessageObject().getId();
                zn znVar12 = lnVar6.f39680a;
                znVar12.f45045xb = 2;
                znVar12.f45057yb = null;
                u1Var6.invalidate();
                return;
            default:
                dm dmVar = (dm) this.f37342f;
                zn znVar13 = dmVar.f37094a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.f37341e;
                znVar13.f45031wb = w0Var.getMessageObject().getId();
                zn znVar14 = dmVar.f37094a.Q;
                znVar14.f45045xb = 4;
                znVar14.f45057yb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                return;
        }
    }
}
