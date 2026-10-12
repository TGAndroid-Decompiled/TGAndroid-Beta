package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class in extends of.e {
    public final int d;
    public final org.telegram.ui.Cells.a0 f38950e;
    public final Object f38951f;

    public in(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f38951f = obj;
        this.f38950e = a0Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gk(((pn) this.f38951f).f40998a, 3), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gk(((pn) this.f38951f).f40998a, 4), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gk(((pn) this.f38951f).f40998a, 5), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gk(((pn) this.f38951f).f40998a, 6), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gk(((pn) this.f38951f).f40998a, 7), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gk(((pn) this.f38951f).f40998a, 8), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new nh(10, this, (org.telegram.ui.Cells.w0) this.f38950e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                pn pnVar = (pn) this.f38951f;
                eo eoVar = pnVar.f40998a;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f38950e;
                eoVar.f37475wb = u1Var.getMessageObject().getId();
                eo eoVar2 = pnVar.f40998a;
                eoVar2.f37489xb = 2;
                eoVar2.f37501yb = null;
                u1Var.invalidate();
                return;
            case 1:
                pn pnVar2 = (pn) this.f38951f;
                eo eoVar3 = pnVar2.f40998a;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.f38950e;
                eoVar3.f37475wb = u1Var2.getMessageObject().getId();
                eo eoVar4 = pnVar2.f40998a;
                eoVar4.f37489xb = 2;
                eoVar4.f37501yb = null;
                u1Var2.invalidate();
                return;
            case 2:
                pn pnVar3 = (pn) this.f38951f;
                eo eoVar5 = pnVar3.f40998a;
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) this.f38950e;
                eoVar5.f37475wb = u1Var3.getMessageObject().getId();
                eo eoVar6 = pnVar3.f40998a;
                eoVar6.f37489xb = 2;
                eoVar6.f37501yb = null;
                u1Var3.invalidate();
                return;
            case 3:
                pn pnVar4 = (pn) this.f38951f;
                eo eoVar7 = pnVar4.f40998a;
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) this.f38950e;
                eoVar7.f37475wb = u1Var4.getMessageObject().getId();
                eo eoVar8 = pnVar4.f40998a;
                eoVar8.f37489xb = 2;
                eoVar8.f37501yb = null;
                u1Var4.invalidate();
                return;
            case 4:
                pn pnVar5 = (pn) this.f38951f;
                eo eoVar9 = pnVar5.f40998a;
                org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) this.f38950e;
                eoVar9.f37475wb = u1Var5.getMessageObject().getId();
                eo eoVar10 = pnVar5.f40998a;
                eoVar10.f37489xb = 2;
                eoVar10.f37501yb = null;
                u1Var5.invalidate();
                return;
            case 5:
                pn pnVar6 = (pn) this.f38951f;
                eo eoVar11 = pnVar6.f40998a;
                org.telegram.ui.Cells.u1 u1Var6 = (org.telegram.ui.Cells.u1) this.f38950e;
                eoVar11.f37475wb = u1Var6.getMessageObject().getId();
                eo eoVar12 = pnVar6.f40998a;
                eoVar12.f37489xb = 2;
                eoVar12.f37501yb = null;
                u1Var6.invalidate();
                return;
            default:
                hm hmVar = (hm) this.f38951f;
                eo eoVar13 = hmVar.f38467a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.f38950e;
                eoVar13.f37475wb = w0Var.getMessageObject().getId();
                eo eoVar14 = hmVar.f38467a.Q;
                eoVar14.f37489xb = 4;
                eoVar14.f37501yb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                return;
        }
    }
}
