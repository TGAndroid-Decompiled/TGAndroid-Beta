package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hn extends of.e {
    public final int d;
    public final org.telegram.ui.Cells.a0 f37069e;
    public final Object f37070f;

    public hn(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f37070f = obj;
        this.f37069e = a0Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((on) this.f37070f).f39283a, 2), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((on) this.f37070f).f39283a, 3), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((on) this.f37070f).f39283a, 4), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((on) this.f37070f).f39283a, 5), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((on) this.f37070f).f39283a, 6), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((on) this.f37070f).f39283a, 7), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new fh(11, this, (org.telegram.ui.Cells.w0) this.f37069e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                on onVar = (on) this.f37070f;
                co coVar = onVar.f39283a;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f37069e;
                coVar.f35471wb = t1Var.getMessageObject().getId();
                co coVar2 = onVar.f39283a;
                coVar2.f35484xb = 2;
                coVar2.f35496yb = null;
                t1Var.invalidate();
                return;
            case 1:
                on onVar2 = (on) this.f37070f;
                co coVar3 = onVar2.f39283a;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.f37069e;
                coVar3.f35471wb = t1Var2.getMessageObject().getId();
                co coVar4 = onVar2.f39283a;
                coVar4.f35484xb = 2;
                coVar4.f35496yb = null;
                t1Var2.invalidate();
                return;
            case 2:
                on onVar3 = (on) this.f37070f;
                co coVar5 = onVar3.f39283a;
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) this.f37069e;
                coVar5.f35471wb = t1Var3.getMessageObject().getId();
                co coVar6 = onVar3.f39283a;
                coVar6.f35484xb = 2;
                coVar6.f35496yb = null;
                t1Var3.invalidate();
                return;
            case 3:
                on onVar4 = (on) this.f37070f;
                co coVar7 = onVar4.f39283a;
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) this.f37069e;
                coVar7.f35471wb = t1Var4.getMessageObject().getId();
                co coVar8 = onVar4.f39283a;
                coVar8.f35484xb = 2;
                coVar8.f35496yb = null;
                t1Var4.invalidate();
                return;
            case 4:
                on onVar5 = (on) this.f37070f;
                co coVar9 = onVar5.f39283a;
                org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) this.f37069e;
                coVar9.f35471wb = t1Var5.getMessageObject().getId();
                co coVar10 = onVar5.f39283a;
                coVar10.f35484xb = 2;
                coVar10.f35496yb = null;
                t1Var5.invalidate();
                return;
            case 5:
                on onVar6 = (on) this.f37070f;
                co coVar11 = onVar6.f39283a;
                org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) this.f37069e;
                coVar11.f35471wb = t1Var6.getMessageObject().getId();
                co coVar12 = onVar6.f39283a;
                coVar12.f35484xb = 2;
                coVar12.f35496yb = null;
                t1Var6.invalidate();
                return;
            default:
                fm fmVar = (fm) this.f37070f;
                co coVar13 = fmVar.f36432a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.f37069e;
                coVar13.f35471wb = w0Var.getMessageObject().getId();
                co coVar14 = fmVar.f36432a.Q;
                coVar14.f35484xb = 4;
                coVar14.f35496yb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                return;
        }
    }
}
