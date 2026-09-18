package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class gn extends nf.e {
    public final int d;
    public final org.telegram.ui.Cells.a0 e;
    public final Object f34021f;

    public gn(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f34021f = obj;
        this.e = a0Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bk(((nn) this.f34021f).f36139a, 2), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bk(((nn) this.f34021f).f36139a, 3), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bk(((nn) this.f34021f).f36139a, 4), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bk(((nn) this.f34021f).f36139a, 5), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bk(((nn) this.f34021f).f36139a, 6), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bk(((nn) this.f34021f).f36139a, 7), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new wh(5, this, (org.telegram.ui.Cells.w0) this.e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                nn nnVar = (nn) this.f34021f;
                bo boVar = nnVar.f36139a;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.e;
                boVar.f32490vb = t1Var.getMessageObject().getId();
                bo boVar2 = nnVar.f36139a;
                boVar2.f32504wb = 2;
                boVar2.f32517xb = null;
                t1Var.invalidate();
                return;
            case 1:
                nn nnVar2 = (nn) this.f34021f;
                bo boVar3 = nnVar2.f36139a;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.e;
                boVar3.f32490vb = t1Var2.getMessageObject().getId();
                bo boVar4 = nnVar2.f36139a;
                boVar4.f32504wb = 2;
                boVar4.f32517xb = null;
                t1Var2.invalidate();
                return;
            case 2:
                nn nnVar3 = (nn) this.f34021f;
                bo boVar5 = nnVar3.f36139a;
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) this.e;
                boVar5.f32490vb = t1Var3.getMessageObject().getId();
                bo boVar6 = nnVar3.f36139a;
                boVar6.f32504wb = 2;
                boVar6.f32517xb = null;
                t1Var3.invalidate();
                return;
            case 3:
                nn nnVar4 = (nn) this.f34021f;
                bo boVar7 = nnVar4.f36139a;
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) this.e;
                boVar7.f32490vb = t1Var4.getMessageObject().getId();
                bo boVar8 = nnVar4.f36139a;
                boVar8.f32504wb = 2;
                boVar8.f32517xb = null;
                t1Var4.invalidate();
                return;
            case 4:
                nn nnVar5 = (nn) this.f34021f;
                bo boVar9 = nnVar5.f36139a;
                org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) this.e;
                boVar9.f32490vb = t1Var5.getMessageObject().getId();
                bo boVar10 = nnVar5.f36139a;
                boVar10.f32504wb = 2;
                boVar10.f32517xb = null;
                t1Var5.invalidate();
                return;
            case 5:
                nn nnVar6 = (nn) this.f34021f;
                bo boVar11 = nnVar6.f36139a;
                org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) this.e;
                boVar11.f32490vb = t1Var6.getMessageObject().getId();
                bo boVar12 = nnVar6.f36139a;
                boVar12.f32504wb = 2;
                boVar12.f32517xb = null;
                t1Var6.invalidate();
                return;
            default:
                em emVar = (em) this.f34021f;
                bo boVar13 = emVar.f33445a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                boVar13.f32490vb = w0Var.getMessageObject().getId();
                bo boVar14 = emVar.f33445a.Q;
                boVar14.f32504wb = 4;
                boVar14.f32517xb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                return;
        }
    }
}
