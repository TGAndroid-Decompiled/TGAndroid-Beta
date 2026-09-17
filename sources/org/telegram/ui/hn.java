package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hn extends of.e {
    public final int d;
    public final org.telegram.ui.Cells.a0 f37097e;
    public final Object f37098f;

    public hn(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f37098f = obj;
        this.f37097e = a0Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((on) this.f37098f).f39311a, 2), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((on) this.f37098f).f39311a, 3), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((on) this.f37098f).f39311a, 4), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((on) this.f37098f).f39311a, 5), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((on) this.f37098f).f39311a, 6), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((on) this.f37098f).f39311a, 7), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new fh(11, this, (org.telegram.ui.Cells.w0) this.f37097e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                on onVar = (on) this.f37098f;
                co coVar = onVar.f39311a;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f37097e;
                coVar.f35499wb = t1Var.getMessageObject().getId();
                co coVar2 = onVar.f39311a;
                coVar2.f35512xb = 2;
                coVar2.f35524yb = null;
                t1Var.invalidate();
                return;
            case 1:
                on onVar2 = (on) this.f37098f;
                co coVar3 = onVar2.f39311a;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.f37097e;
                coVar3.f35499wb = t1Var2.getMessageObject().getId();
                co coVar4 = onVar2.f39311a;
                coVar4.f35512xb = 2;
                coVar4.f35524yb = null;
                t1Var2.invalidate();
                return;
            case 2:
                on onVar3 = (on) this.f37098f;
                co coVar5 = onVar3.f39311a;
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) this.f37097e;
                coVar5.f35499wb = t1Var3.getMessageObject().getId();
                co coVar6 = onVar3.f39311a;
                coVar6.f35512xb = 2;
                coVar6.f35524yb = null;
                t1Var3.invalidate();
                return;
            case 3:
                on onVar4 = (on) this.f37098f;
                co coVar7 = onVar4.f39311a;
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) this.f37097e;
                coVar7.f35499wb = t1Var4.getMessageObject().getId();
                co coVar8 = onVar4.f39311a;
                coVar8.f35512xb = 2;
                coVar8.f35524yb = null;
                t1Var4.invalidate();
                return;
            case 4:
                on onVar5 = (on) this.f37098f;
                co coVar9 = onVar5.f39311a;
                org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) this.f37097e;
                coVar9.f35499wb = t1Var5.getMessageObject().getId();
                co coVar10 = onVar5.f39311a;
                coVar10.f35512xb = 2;
                coVar10.f35524yb = null;
                t1Var5.invalidate();
                return;
            case 5:
                on onVar6 = (on) this.f37098f;
                co coVar11 = onVar6.f39311a;
                org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) this.f37097e;
                coVar11.f35499wb = t1Var6.getMessageObject().getId();
                co coVar12 = onVar6.f39311a;
                coVar12.f35512xb = 2;
                coVar12.f35524yb = null;
                t1Var6.invalidate();
                return;
            default:
                fm fmVar = (fm) this.f37098f;
                co coVar13 = fmVar.f36460a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.f37097e;
                coVar13.f35499wb = w0Var.getMessageObject().getId();
                co coVar14 = fmVar.f36460a.Q;
                coVar14.f35512xb = 4;
                coVar14.f35524yb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                return;
        }
    }
}
