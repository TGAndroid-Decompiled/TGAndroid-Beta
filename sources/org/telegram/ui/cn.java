package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class cn extends nf.e {
    public final int d;
    public final org.telegram.ui.Cells.a0 f35513e;
    public final Object f35514f;

    public cn(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f35514f = obj;
        this.f35513e = a0Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ug(((kn) this.f35514f).f38008a, 29), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new dn(((kn) this.f35514f).f38008a, 0), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new dn(((kn) this.f35514f).f38008a, 1), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new dn(((kn) this.f35514f).f38008a, 2), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new dn(((kn) this.f35514f).f38008a, 3), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new dn(((kn) this.f35514f).f38008a, 4), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new oh(9, this, (org.telegram.ui.Cells.w0) this.f35513e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                kn knVar = (kn) this.f35514f;
                yn ynVar = knVar.f38008a;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f35513e;
                ynVar.f43518tb = u1Var.getMessageObject().getId();
                yn ynVar2 = knVar.f38008a;
                ynVar2.f43531ub = 2;
                ynVar2.f43543vb = null;
                u1Var.invalidate();
                return;
            case 1:
                kn knVar2 = (kn) this.f35514f;
                yn ynVar3 = knVar2.f38008a;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.f35513e;
                ynVar3.f43518tb = u1Var2.getMessageObject().getId();
                yn ynVar4 = knVar2.f38008a;
                ynVar4.f43531ub = 2;
                ynVar4.f43543vb = null;
                u1Var2.invalidate();
                return;
            case 2:
                kn knVar3 = (kn) this.f35514f;
                yn ynVar5 = knVar3.f38008a;
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) this.f35513e;
                ynVar5.f43518tb = u1Var3.getMessageObject().getId();
                yn ynVar6 = knVar3.f38008a;
                ynVar6.f43531ub = 2;
                ynVar6.f43543vb = null;
                u1Var3.invalidate();
                return;
            case 3:
                kn knVar4 = (kn) this.f35514f;
                yn ynVar7 = knVar4.f38008a;
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) this.f35513e;
                ynVar7.f43518tb = u1Var4.getMessageObject().getId();
                yn ynVar8 = knVar4.f38008a;
                ynVar8.f43531ub = 2;
                ynVar8.f43543vb = null;
                u1Var4.invalidate();
                return;
            case 4:
                kn knVar5 = (kn) this.f35514f;
                yn ynVar9 = knVar5.f38008a;
                org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) this.f35513e;
                ynVar9.f43518tb = u1Var5.getMessageObject().getId();
                yn ynVar10 = knVar5.f38008a;
                ynVar10.f43531ub = 2;
                ynVar10.f43543vb = null;
                u1Var5.invalidate();
                return;
            case 5:
                kn knVar6 = (kn) this.f35514f;
                yn ynVar11 = knVar6.f38008a;
                org.telegram.ui.Cells.u1 u1Var6 = (org.telegram.ui.Cells.u1) this.f35513e;
                ynVar11.f43518tb = u1Var6.getMessageObject().getId();
                yn ynVar12 = knVar6.f38008a;
                ynVar12.f43531ub = 2;
                ynVar12.f43543vb = null;
                u1Var6.invalidate();
                return;
            default:
                am amVar = (am) this.f35514f;
                yn ynVar13 = amVar.f34867a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.f35513e;
                ynVar13.f43518tb = w0Var.getMessageObject().getId();
                yn ynVar14 = amVar.f34867a.Q;
                ynVar14.f43531ub = 4;
                ynVar14.f43543vb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                return;
        }
    }
}
