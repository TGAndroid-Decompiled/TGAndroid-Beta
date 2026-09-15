package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class gn extends nf.e {
    public final int d;
    public final org.telegram.ui.Cells.a0 e;
    public final Object f33963f;

    public gn(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f33963f = obj;
        this.e = a0Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((nn) this.f33963f).f36012a, 2), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((nn) this.f33963f).f36012a, 3), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((nn) this.f33963f).f36012a, 4), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((nn) this.f33963f).f36012a, 5), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((nn) this.f33963f).f36012a, 6), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((nn) this.f33963f).f36012a, 7), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new uh(5, this, (org.telegram.ui.Cells.w0) this.e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                nn nnVar = (nn) this.f33963f;
                bo boVar = nnVar.f36012a;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.e;
                boVar.f32522wb = t1Var.getMessageObject().getId();
                bo boVar2 = nnVar.f36012a;
                boVar2.f32535xb = 2;
                boVar2.f32547yb = null;
                t1Var.invalidate();
                return;
            case 1:
                nn nnVar2 = (nn) this.f33963f;
                bo boVar3 = nnVar2.f36012a;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.e;
                boVar3.f32522wb = t1Var2.getMessageObject().getId();
                bo boVar4 = nnVar2.f36012a;
                boVar4.f32535xb = 2;
                boVar4.f32547yb = null;
                t1Var2.invalidate();
                return;
            case 2:
                nn nnVar3 = (nn) this.f33963f;
                bo boVar5 = nnVar3.f36012a;
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) this.e;
                boVar5.f32522wb = t1Var3.getMessageObject().getId();
                bo boVar6 = nnVar3.f36012a;
                boVar6.f32535xb = 2;
                boVar6.f32547yb = null;
                t1Var3.invalidate();
                return;
            case 3:
                nn nnVar4 = (nn) this.f33963f;
                bo boVar7 = nnVar4.f36012a;
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) this.e;
                boVar7.f32522wb = t1Var4.getMessageObject().getId();
                bo boVar8 = nnVar4.f36012a;
                boVar8.f32535xb = 2;
                boVar8.f32547yb = null;
                t1Var4.invalidate();
                return;
            case 4:
                nn nnVar5 = (nn) this.f33963f;
                bo boVar9 = nnVar5.f36012a;
                org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) this.e;
                boVar9.f32522wb = t1Var5.getMessageObject().getId();
                bo boVar10 = nnVar5.f36012a;
                boVar10.f32535xb = 2;
                boVar10.f32547yb = null;
                t1Var5.invalidate();
                return;
            case 5:
                nn nnVar6 = (nn) this.f33963f;
                bo boVar11 = nnVar6.f36012a;
                org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) this.e;
                boVar11.f32522wb = t1Var6.getMessageObject().getId();
                bo boVar12 = nnVar6.f36012a;
                boVar12.f32535xb = 2;
                boVar12.f32547yb = null;
                t1Var6.invalidate();
                return;
            default:
                em emVar = (em) this.f33963f;
                bo boVar13 = emVar.f33371a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                boVar13.f32522wb = w0Var.getMessageObject().getId();
                bo boVar14 = emVar.f33371a.Q;
                boVar14.f32535xb = 4;
                boVar14.f32547yb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                return;
        }
    }
}
