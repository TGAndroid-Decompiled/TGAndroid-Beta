package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class en extends of.e {
    public final int d;
    public final org.telegram.ui.Cells.a0 f37297e;
    public final Object f37298f;

    public en(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f37298f = obj;
        this.f37297e = a0Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f37298f).f39636a, 3), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f37298f).f39636a, 4), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f37298f).f39636a, 5), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f37298f).f39636a, 6), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f37298f).f39636a, 7), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f37298f).f39636a, 8), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new sg(13, this, (org.telegram.ui.Cells.w0) this.f37297e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                ln lnVar = (ln) this.f37298f;
                zn znVar = lnVar.f39636a;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f37297e;
                znVar.f44987wb = u1Var.getMessageObject().getId();
                zn znVar2 = lnVar.f39636a;
                znVar2.f45001xb = 2;
                znVar2.f45013yb = null;
                u1Var.invalidate();
                return;
            case 1:
                ln lnVar2 = (ln) this.f37298f;
                zn znVar3 = lnVar2.f39636a;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.f37297e;
                znVar3.f44987wb = u1Var2.getMessageObject().getId();
                zn znVar4 = lnVar2.f39636a;
                znVar4.f45001xb = 2;
                znVar4.f45013yb = null;
                u1Var2.invalidate();
                return;
            case 2:
                ln lnVar3 = (ln) this.f37298f;
                zn znVar5 = lnVar3.f39636a;
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) this.f37297e;
                znVar5.f44987wb = u1Var3.getMessageObject().getId();
                zn znVar6 = lnVar3.f39636a;
                znVar6.f45001xb = 2;
                znVar6.f45013yb = null;
                u1Var3.invalidate();
                return;
            case 3:
                ln lnVar4 = (ln) this.f37298f;
                zn znVar7 = lnVar4.f39636a;
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) this.f37297e;
                znVar7.f44987wb = u1Var4.getMessageObject().getId();
                zn znVar8 = lnVar4.f39636a;
                znVar8.f45001xb = 2;
                znVar8.f45013yb = null;
                u1Var4.invalidate();
                return;
            case 4:
                ln lnVar5 = (ln) this.f37298f;
                zn znVar9 = lnVar5.f39636a;
                org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) this.f37297e;
                znVar9.f44987wb = u1Var5.getMessageObject().getId();
                zn znVar10 = lnVar5.f39636a;
                znVar10.f45001xb = 2;
                znVar10.f45013yb = null;
                u1Var5.invalidate();
                return;
            case 5:
                ln lnVar6 = (ln) this.f37298f;
                zn znVar11 = lnVar6.f39636a;
                org.telegram.ui.Cells.u1 u1Var6 = (org.telegram.ui.Cells.u1) this.f37297e;
                znVar11.f44987wb = u1Var6.getMessageObject().getId();
                zn znVar12 = lnVar6.f39636a;
                znVar12.f45001xb = 2;
                znVar12.f45013yb = null;
                u1Var6.invalidate();
                return;
            default:
                dm dmVar = (dm) this.f37298f;
                zn znVar13 = dmVar.f37050a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.f37297e;
                znVar13.f44987wb = w0Var.getMessageObject().getId();
                zn znVar14 = dmVar.f37050a.Q;
                znVar14.f45001xb = 4;
                znVar14.f45013yb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                return;
        }
    }
}
