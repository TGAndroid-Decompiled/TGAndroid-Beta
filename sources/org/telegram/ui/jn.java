package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class jn extends pf.c {
    public final int d;
    public final org.telegram.ui.Cells.a0 e;
    public final Object f37102f;

    public jn(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f37102f = obj;
        this.e = a0Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gk(((qn) this.f37102f).f39190a, 3), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gk(((qn) this.f37102f).f39190a, 4), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gk(((qn) this.f37102f).f39190a, 5), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gk(((qn) this.f37102f).f39190a, 6), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gk(((qn) this.f37102f).f39190a, 7), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gk(((qn) this.f37102f).f39190a, 8), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new jd(19, this, (org.telegram.ui.Cells.w0) this.e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                qn qnVar = (qn) this.f37102f;
                fo foVar = qnVar.f39190a;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.e;
                foVar.f35858wb = u1Var.getMessageObject().getId();
                fo foVar2 = qnVar.f39190a;
                foVar2.f35872xb = 2;
                foVar2.f35885yb = null;
                u1Var.invalidate();
                return;
            case 1:
                qn qnVar2 = (qn) this.f37102f;
                fo foVar3 = qnVar2.f39190a;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.e;
                foVar3.f35858wb = u1Var2.getMessageObject().getId();
                fo foVar4 = qnVar2.f39190a;
                foVar4.f35872xb = 2;
                foVar4.f35885yb = null;
                u1Var2.invalidate();
                return;
            case 2:
                qn qnVar3 = (qn) this.f37102f;
                fo foVar5 = qnVar3.f39190a;
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) this.e;
                foVar5.f35858wb = u1Var3.getMessageObject().getId();
                fo foVar6 = qnVar3.f39190a;
                foVar6.f35872xb = 2;
                foVar6.f35885yb = null;
                u1Var3.invalidate();
                return;
            case 3:
                qn qnVar4 = (qn) this.f37102f;
                fo foVar7 = qnVar4.f39190a;
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) this.e;
                foVar7.f35858wb = u1Var4.getMessageObject().getId();
                fo foVar8 = qnVar4.f39190a;
                foVar8.f35872xb = 2;
                foVar8.f35885yb = null;
                u1Var4.invalidate();
                return;
            case 4:
                qn qnVar5 = (qn) this.f37102f;
                fo foVar9 = qnVar5.f39190a;
                org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) this.e;
                foVar9.f35858wb = u1Var5.getMessageObject().getId();
                fo foVar10 = qnVar5.f39190a;
                foVar10.f35872xb = 2;
                foVar10.f35885yb = null;
                u1Var5.invalidate();
                return;
            case 5:
                qn qnVar6 = (qn) this.f37102f;
                fo foVar11 = qnVar6.f39190a;
                org.telegram.ui.Cells.u1 u1Var6 = (org.telegram.ui.Cells.u1) this.e;
                foVar11.f35858wb = u1Var6.getMessageObject().getId();
                fo foVar12 = qnVar6.f39190a;
                foVar12.f35872xb = 2;
                foVar12.f35885yb = null;
                u1Var6.invalidate();
                return;
            default:
                im imVar = (im) this.f37102f;
                fo foVar13 = imVar.f36836a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                foVar13.f35858wb = w0Var.getMessageObject().getId();
                fo foVar14 = imVar.f36836a.Q;
                foVar14.f35872xb = 4;
                foVar14.f35885yb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                return;
        }
    }
}
