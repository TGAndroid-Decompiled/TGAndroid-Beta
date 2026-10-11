package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class en extends of.e {
    public final int d;
    public final org.telegram.ui.Cells.a0 f37439e;
    public final Object f37440f;

    public en(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f37440f = obj;
        this.f37439e = a0Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f37440f).f39735a, 3), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f37440f).f39735a, 4), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f37440f).f39735a, 5), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f37440f).f39735a, 6), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f37440f).f39735a, 7), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f37440f).f39735a, 8), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ug(12, this, (org.telegram.ui.Cells.w0) this.f37439e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                ln lnVar = (ln) this.f37440f;
                zn znVar = lnVar.f39735a;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f37439e;
                znVar.f45020wb = u1Var.getMessageObject().getId();
                zn znVar2 = lnVar.f39735a;
                znVar2.f45034xb = 2;
                znVar2.f45046yb = null;
                u1Var.invalidate();
                return;
            case 1:
                ln lnVar2 = (ln) this.f37440f;
                zn znVar3 = lnVar2.f39735a;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.f37439e;
                znVar3.f45020wb = u1Var2.getMessageObject().getId();
                zn znVar4 = lnVar2.f39735a;
                znVar4.f45034xb = 2;
                znVar4.f45046yb = null;
                u1Var2.invalidate();
                return;
            case 2:
                ln lnVar3 = (ln) this.f37440f;
                zn znVar5 = lnVar3.f39735a;
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) this.f37439e;
                znVar5.f45020wb = u1Var3.getMessageObject().getId();
                zn znVar6 = lnVar3.f39735a;
                znVar6.f45034xb = 2;
                znVar6.f45046yb = null;
                u1Var3.invalidate();
                return;
            case 3:
                ln lnVar4 = (ln) this.f37440f;
                zn znVar7 = lnVar4.f39735a;
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) this.f37439e;
                znVar7.f45020wb = u1Var4.getMessageObject().getId();
                zn znVar8 = lnVar4.f39735a;
                znVar8.f45034xb = 2;
                znVar8.f45046yb = null;
                u1Var4.invalidate();
                return;
            case 4:
                ln lnVar5 = (ln) this.f37440f;
                zn znVar9 = lnVar5.f39735a;
                org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) this.f37439e;
                znVar9.f45020wb = u1Var5.getMessageObject().getId();
                zn znVar10 = lnVar5.f39735a;
                znVar10.f45034xb = 2;
                znVar10.f45046yb = null;
                u1Var5.invalidate();
                return;
            case 5:
                ln lnVar6 = (ln) this.f37440f;
                zn znVar11 = lnVar6.f39735a;
                org.telegram.ui.Cells.u1 u1Var6 = (org.telegram.ui.Cells.u1) this.f37439e;
                znVar11.f45020wb = u1Var6.getMessageObject().getId();
                zn znVar12 = lnVar6.f39735a;
                znVar12.f45034xb = 2;
                znVar12.f45046yb = null;
                u1Var6.invalidate();
                return;
            default:
                dm dmVar = (dm) this.f37440f;
                zn znVar13 = dmVar.f37084a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.f37439e;
                znVar13.f45020wb = w0Var.getMessageObject().getId();
                zn znVar14 = dmVar.f37084a.Q;
                znVar14.f45034xb = 4;
                znVar14.f45046yb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                return;
        }
    }
}
