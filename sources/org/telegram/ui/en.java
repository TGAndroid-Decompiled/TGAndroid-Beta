package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class en extends nf.e {
    public final int d;
    public final org.telegram.ui.Cells.a0 e;
    public final Object f33375f;

    public en(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f33375f = obj;
        this.e = a0Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new zj(((ln) this.f33375f).f35482a, 2), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new zj(((ln) this.f33375f).f35482a, 3), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new zj(((ln) this.f33375f).f35482a, 4), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new zj(((ln) this.f33375f).f35482a, 5), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new zj(((ln) this.f33375f).f35482a, 6), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new zj(((ln) this.f33375f).f35482a, 7), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gh(11, this, (org.telegram.ui.Cells.w0) this.e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                ln lnVar = (ln) this.f33375f;
                zn znVar = lnVar.f35482a;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.e;
                znVar.f40514vb = u1Var.getMessageObject().getId();
                zn znVar2 = lnVar.f35482a;
                znVar2.f40528wb = 2;
                znVar2.f40541xb = null;
                u1Var.invalidate();
                return;
            case 1:
                ln lnVar2 = (ln) this.f33375f;
                zn znVar3 = lnVar2.f35482a;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.e;
                znVar3.f40514vb = u1Var2.getMessageObject().getId();
                zn znVar4 = lnVar2.f35482a;
                znVar4.f40528wb = 2;
                znVar4.f40541xb = null;
                u1Var2.invalidate();
                return;
            case 2:
                ln lnVar3 = (ln) this.f33375f;
                zn znVar5 = lnVar3.f35482a;
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) this.e;
                znVar5.f40514vb = u1Var3.getMessageObject().getId();
                zn znVar6 = lnVar3.f35482a;
                znVar6.f40528wb = 2;
                znVar6.f40541xb = null;
                u1Var3.invalidate();
                return;
            case 3:
                ln lnVar4 = (ln) this.f33375f;
                zn znVar7 = lnVar4.f35482a;
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) this.e;
                znVar7.f40514vb = u1Var4.getMessageObject().getId();
                zn znVar8 = lnVar4.f35482a;
                znVar8.f40528wb = 2;
                znVar8.f40541xb = null;
                u1Var4.invalidate();
                return;
            case 4:
                ln lnVar5 = (ln) this.f33375f;
                zn znVar9 = lnVar5.f35482a;
                org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) this.e;
                znVar9.f40514vb = u1Var5.getMessageObject().getId();
                zn znVar10 = lnVar5.f35482a;
                znVar10.f40528wb = 2;
                znVar10.f40541xb = null;
                u1Var5.invalidate();
                return;
            case 5:
                ln lnVar6 = (ln) this.f33375f;
                zn znVar11 = lnVar6.f35482a;
                org.telegram.ui.Cells.u1 u1Var6 = (org.telegram.ui.Cells.u1) this.e;
                znVar11.f40514vb = u1Var6.getMessageObject().getId();
                zn znVar12 = lnVar6.f35482a;
                znVar12.f40528wb = 2;
                znVar12.f40541xb = null;
                u1Var6.invalidate();
                return;
            default:
                cm cmVar = (cm) this.f33375f;
                zn znVar13 = cmVar.f32788a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                znVar13.f40514vb = w0Var.getMessageObject().getId();
                zn znVar14 = cmVar.f32788a.Q;
                znVar14.f40528wb = 4;
                znVar14.f40541xb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                return;
        }
    }
}
