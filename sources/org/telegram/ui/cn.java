package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class cn extends af.f {
    public final int d;
    public final org.telegram.ui.Cells.a0 f35828e;
    public final Object f35829f;

    public cn(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f35829f = obj;
        this.f35828e = a0Var;
    }

    @Override
    public final void c(boolean z4) {
        switch (this.d) {
            case 0:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.f35829f).f38085a, 2), 250L);
                    return;
                }
                return;
            case 1:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.f35829f).f38085a, 3), 250L);
                    return;
                }
                return;
            case 2:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.f35829f).f38085a, 4), 250L);
                    return;
                }
                return;
            case 3:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.f35829f).f38085a, 5), 250L);
                    return;
                }
                return;
            case 4:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.f35829f).f38085a, 6), 250L);
                    return;
                }
                return;
            case 5:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.f35829f).f38085a, 7), 250L);
                    return;
                }
                return;
            default:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new xc(21, this, (org.telegram.ui.Cells.v0) this.f35828e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                jn jnVar = (jn) this.f35829f;
                xn xnVar = jnVar.f38085a;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f35828e;
                xnVar.f43338tb = t1Var.getMessageObject().getId();
                xn xnVar2 = jnVar.f38085a;
                xnVar2.f43351ub = 2;
                xnVar2.f43364vb = null;
                t1Var.invalidate();
                return;
            case 1:
                jn jnVar2 = (jn) this.f35829f;
                xn xnVar3 = jnVar2.f38085a;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.f35828e;
                xnVar3.f43338tb = t1Var2.getMessageObject().getId();
                xn xnVar4 = jnVar2.f38085a;
                xnVar4.f43351ub = 2;
                xnVar4.f43364vb = null;
                t1Var2.invalidate();
                return;
            case 2:
                jn jnVar3 = (jn) this.f35829f;
                xn xnVar5 = jnVar3.f38085a;
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) this.f35828e;
                xnVar5.f43338tb = t1Var3.getMessageObject().getId();
                xn xnVar6 = jnVar3.f38085a;
                xnVar6.f43351ub = 2;
                xnVar6.f43364vb = null;
                t1Var3.invalidate();
                return;
            case 3:
                jn jnVar4 = (jn) this.f35829f;
                xn xnVar7 = jnVar4.f38085a;
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) this.f35828e;
                xnVar7.f43338tb = t1Var4.getMessageObject().getId();
                xn xnVar8 = jnVar4.f38085a;
                xnVar8.f43351ub = 2;
                xnVar8.f43364vb = null;
                t1Var4.invalidate();
                return;
            case 4:
                jn jnVar5 = (jn) this.f35829f;
                xn xnVar9 = jnVar5.f38085a;
                org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) this.f35828e;
                xnVar9.f43338tb = t1Var5.getMessageObject().getId();
                xn xnVar10 = jnVar5.f38085a;
                xnVar10.f43351ub = 2;
                xnVar10.f43364vb = null;
                t1Var5.invalidate();
                return;
            case 5:
                jn jnVar6 = (jn) this.f35829f;
                xn xnVar11 = jnVar6.f38085a;
                org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) this.f35828e;
                xnVar11.f43338tb = t1Var6.getMessageObject().getId();
                xn xnVar12 = jnVar6.f38085a;
                xnVar12.f43351ub = 2;
                xnVar12.f43364vb = null;
                t1Var6.invalidate();
                return;
            default:
                bm bmVar = (bm) this.f35829f;
                xn xnVar13 = bmVar.f35565a.N;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.f35828e;
                xnVar13.f43338tb = v0Var.getMessageObject().getId();
                xn xnVar14 = bmVar.f35565a.N;
                xnVar14.f43351ub = 4;
                xnVar14.f43364vb = null;
                v0Var.getMessageObject().flickerLoading = true;
                v0Var.invalidate();
                return;
        }
    }
}
