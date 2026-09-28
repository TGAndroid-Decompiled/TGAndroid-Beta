package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bn extends nf.e {
    public final int d;
    public final org.telegram.ui.Cells.a0 e;
    public final Object f32454f;

    public bn(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f32454f = obj;
        this.e = a0Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((in) this.f32454f).f34558a, 2), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((in) this.f32454f).f34558a, 3), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((in) this.f32454f).f34558a, 4), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((in) this.f32454f).f34558a, 5), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((in) this.f32454f).f34558a, 6), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((in) this.f32454f).f34558a, 7), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new fh(10, this, (org.telegram.ui.Cells.w0) this.e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                in inVar = (in) this.f32454f;
                wn wnVar = inVar.f34558a;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.e;
                wnVar.f39680vb = u1Var.getMessageObject().getId();
                wn wnVar2 = inVar.f34558a;
                wnVar2.f39694wb = 2;
                wnVar2.f39707xb = null;
                u1Var.invalidate();
                return;
            case 1:
                in inVar2 = (in) this.f32454f;
                wn wnVar3 = inVar2.f34558a;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.e;
                wnVar3.f39680vb = u1Var2.getMessageObject().getId();
                wn wnVar4 = inVar2.f34558a;
                wnVar4.f39694wb = 2;
                wnVar4.f39707xb = null;
                u1Var2.invalidate();
                return;
            case 2:
                in inVar3 = (in) this.f32454f;
                wn wnVar5 = inVar3.f34558a;
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) this.e;
                wnVar5.f39680vb = u1Var3.getMessageObject().getId();
                wn wnVar6 = inVar3.f34558a;
                wnVar6.f39694wb = 2;
                wnVar6.f39707xb = null;
                u1Var3.invalidate();
                return;
            case 3:
                in inVar4 = (in) this.f32454f;
                wn wnVar7 = inVar4.f34558a;
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) this.e;
                wnVar7.f39680vb = u1Var4.getMessageObject().getId();
                wn wnVar8 = inVar4.f34558a;
                wnVar8.f39694wb = 2;
                wnVar8.f39707xb = null;
                u1Var4.invalidate();
                return;
            case 4:
                in inVar5 = (in) this.f32454f;
                wn wnVar9 = inVar5.f34558a;
                org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) this.e;
                wnVar9.f39680vb = u1Var5.getMessageObject().getId();
                wn wnVar10 = inVar5.f34558a;
                wnVar10.f39694wb = 2;
                wnVar10.f39707xb = null;
                u1Var5.invalidate();
                return;
            case 5:
                in inVar6 = (in) this.f32454f;
                wn wnVar11 = inVar6.f34558a;
                org.telegram.ui.Cells.u1 u1Var6 = (org.telegram.ui.Cells.u1) this.e;
                wnVar11.f39680vb = u1Var6.getMessageObject().getId();
                wn wnVar12 = inVar6.f34558a;
                wnVar12.f39694wb = 2;
                wnVar12.f39707xb = null;
                u1Var6.invalidate();
                return;
            default:
                am amVar = (am) this.f32454f;
                wn wnVar13 = amVar.f32198a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                wnVar13.f39680vb = w0Var.getMessageObject().getId();
                wn wnVar14 = amVar.f32198a.Q;
                wnVar14.f39694wb = 4;
                wnVar14.f39707xb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                return;
        }
    }
}
