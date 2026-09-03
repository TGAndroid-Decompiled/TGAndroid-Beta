package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class en extends ze.c {
    public final int d;
    public final org.telegram.ui.Cells.a0 e;
    public final Object f33829f;

    public en(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f33829f = obj;
        this.e = a0Var;
    }

    @Override
    public final void c(boolean z4) {
        switch (this.d) {
            case 0:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new yj(((ln) this.f33829f).f35808a, 2), 250L);
                    return;
                }
                return;
            case 1:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new yj(((ln) this.f33829f).f35808a, 3), 250L);
                    return;
                }
                return;
            case 2:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new yj(((ln) this.f33829f).f35808a, 4), 250L);
                    return;
                }
                return;
            case 3:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new yj(((ln) this.f33829f).f35808a, 5), 250L);
                    return;
                }
                return;
            case 4:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new yj(((ln) this.f33829f).f35808a, 6), 250L);
                    return;
                }
                return;
            case 5:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new yj(((ln) this.f33829f).f35808a, 7), 250L);
                    return;
                }
                return;
            default:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new hc(22, this, (org.telegram.ui.Cells.v0) this.e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                ln lnVar = (ln) this.f33829f;
                zn znVar = lnVar.f35808a;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.e;
                znVar.f40757tb = s1Var.getMessageObject().getId();
                zn znVar2 = lnVar.f35808a;
                znVar2.f40770ub = 2;
                znVar2.f40783vb = null;
                s1Var.invalidate();
                return;
            case 1:
                ln lnVar2 = (ln) this.f33829f;
                zn znVar3 = lnVar2.f35808a;
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) this.e;
                znVar3.f40757tb = s1Var2.getMessageObject().getId();
                zn znVar4 = lnVar2.f35808a;
                znVar4.f40770ub = 2;
                znVar4.f40783vb = null;
                s1Var2.invalidate();
                return;
            case 2:
                ln lnVar3 = (ln) this.f33829f;
                zn znVar5 = lnVar3.f35808a;
                org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) this.e;
                znVar5.f40757tb = s1Var3.getMessageObject().getId();
                zn znVar6 = lnVar3.f35808a;
                znVar6.f40770ub = 2;
                znVar6.f40783vb = null;
                s1Var3.invalidate();
                return;
            case 3:
                ln lnVar4 = (ln) this.f33829f;
                zn znVar7 = lnVar4.f35808a;
                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) this.e;
                znVar7.f40757tb = s1Var4.getMessageObject().getId();
                zn znVar8 = lnVar4.f35808a;
                znVar8.f40770ub = 2;
                znVar8.f40783vb = null;
                s1Var4.invalidate();
                return;
            case 4:
                ln lnVar5 = (ln) this.f33829f;
                zn znVar9 = lnVar5.f35808a;
                org.telegram.ui.Cells.s1 s1Var5 = (org.telegram.ui.Cells.s1) this.e;
                znVar9.f40757tb = s1Var5.getMessageObject().getId();
                zn znVar10 = lnVar5.f35808a;
                znVar10.f40770ub = 2;
                znVar10.f40783vb = null;
                s1Var5.invalidate();
                return;
            case 5:
                ln lnVar6 = (ln) this.f33829f;
                zn znVar11 = lnVar6.f35808a;
                org.telegram.ui.Cells.s1 s1Var6 = (org.telegram.ui.Cells.s1) this.e;
                znVar11.f40757tb = s1Var6.getMessageObject().getId();
                zn znVar12 = lnVar6.f35808a;
                znVar12.f40770ub = 2;
                znVar12.f40783vb = null;
                s1Var6.invalidate();
                return;
            default:
                dm dmVar = (dm) this.f33829f;
                zn znVar13 = dmVar.f33499a.N;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.e;
                znVar13.f40757tb = v0Var.getMessageObject().getId();
                zn znVar14 = dmVar.f33499a.N;
                znVar14.f40770ub = 4;
                znVar14.f40783vb = null;
                v0Var.getMessageObject().flickerLoading = true;
                v0Var.invalidate();
                return;
        }
    }
}
