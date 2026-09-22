package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class gn extends nf.e {
    public final int d;
    public final org.telegram.ui.Cells.a0 e;
    public final Object f33896f;

    public gn(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f33896f = obj;
        this.e = a0Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((nn) this.f33896f).f36017a, 2), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((nn) this.f33896f).f36017a, 3), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((nn) this.f33896f).f36017a, 4), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((nn) this.f33896f).f36017a, 5), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((nn) this.f33896f).f36017a, 6), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((nn) this.f33896f).f36017a, 7), 250L);
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
                nn nnVar = (nn) this.f33896f;
                bo boVar = nnVar.f36017a;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.e;
                boVar.f32503vb = t1Var.getMessageObject().getId();
                bo boVar2 = nnVar.f36017a;
                boVar2.f32517wb = 2;
                boVar2.f32530xb = null;
                t1Var.invalidate();
                return;
            case 1:
                nn nnVar2 = (nn) this.f33896f;
                bo boVar3 = nnVar2.f36017a;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.e;
                boVar3.f32503vb = t1Var2.getMessageObject().getId();
                bo boVar4 = nnVar2.f36017a;
                boVar4.f32517wb = 2;
                boVar4.f32530xb = null;
                t1Var2.invalidate();
                return;
            case 2:
                nn nnVar3 = (nn) this.f33896f;
                bo boVar5 = nnVar3.f36017a;
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) this.e;
                boVar5.f32503vb = t1Var3.getMessageObject().getId();
                bo boVar6 = nnVar3.f36017a;
                boVar6.f32517wb = 2;
                boVar6.f32530xb = null;
                t1Var3.invalidate();
                return;
            case 3:
                nn nnVar4 = (nn) this.f33896f;
                bo boVar7 = nnVar4.f36017a;
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) this.e;
                boVar7.f32503vb = t1Var4.getMessageObject().getId();
                bo boVar8 = nnVar4.f36017a;
                boVar8.f32517wb = 2;
                boVar8.f32530xb = null;
                t1Var4.invalidate();
                return;
            case 4:
                nn nnVar5 = (nn) this.f33896f;
                bo boVar9 = nnVar5.f36017a;
                org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) this.e;
                boVar9.f32503vb = t1Var5.getMessageObject().getId();
                bo boVar10 = nnVar5.f36017a;
                boVar10.f32517wb = 2;
                boVar10.f32530xb = null;
                t1Var5.invalidate();
                return;
            case 5:
                nn nnVar6 = (nn) this.f33896f;
                bo boVar11 = nnVar6.f36017a;
                org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) this.e;
                boVar11.f32503vb = t1Var6.getMessageObject().getId();
                bo boVar12 = nnVar6.f36017a;
                boVar12.f32517wb = 2;
                boVar12.f32530xb = null;
                t1Var6.invalidate();
                return;
            default:
                em emVar = (em) this.f33896f;
                bo boVar13 = emVar.f33375a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                boVar13.f32503vb = w0Var.getMessageObject().getId();
                bo boVar14 = emVar.f33375a.Q;
                boVar14.f32517wb = 4;
                boVar14.f32530xb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                return;
        }
    }
}
