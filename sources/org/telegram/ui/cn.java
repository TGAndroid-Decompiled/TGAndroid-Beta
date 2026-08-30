package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class cn extends af.f {
    public final int d;
    public final org.telegram.ui.Cells.a0 e;
    public final Object f33392f;

    public cn(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f33392f = obj;
        this.e = a0Var;
    }

    @Override
    public final void c(boolean z4) {
        switch (this.d) {
            case 0:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.f33392f).f35381a, 2), 250L);
                    return;
                }
                return;
            case 1:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.f33392f).f35381a, 3), 250L);
                    return;
                }
                return;
            case 2:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.f33392f).f35381a, 4), 250L);
                    return;
                }
                return;
            case 3:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.f33392f).f35381a, 5), 250L);
                    return;
                }
                return;
            case 4:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.f33392f).f35381a, 6), 250L);
                    return;
                }
                return;
            case 5:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new wj(((jn) this.f33392f).f35381a, 7), 250L);
                    return;
                }
                return;
            default:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new yb(23, this, (org.telegram.ui.Cells.v0) this.e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                jn jnVar = (jn) this.f33392f;
                xn xnVar = jnVar.f35381a;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.e;
                xnVar.f40191tb = t1Var.getMessageObject().getId();
                xn xnVar2 = jnVar.f35381a;
                xnVar2.f40204ub = 2;
                xnVar2.f40217vb = null;
                t1Var.invalidate();
                return;
            case 1:
                jn jnVar2 = (jn) this.f33392f;
                xn xnVar3 = jnVar2.f35381a;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.e;
                xnVar3.f40191tb = t1Var2.getMessageObject().getId();
                xn xnVar4 = jnVar2.f35381a;
                xnVar4.f40204ub = 2;
                xnVar4.f40217vb = null;
                t1Var2.invalidate();
                return;
            case 2:
                jn jnVar3 = (jn) this.f33392f;
                xn xnVar5 = jnVar3.f35381a;
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) this.e;
                xnVar5.f40191tb = t1Var3.getMessageObject().getId();
                xn xnVar6 = jnVar3.f35381a;
                xnVar6.f40204ub = 2;
                xnVar6.f40217vb = null;
                t1Var3.invalidate();
                return;
            case 3:
                jn jnVar4 = (jn) this.f33392f;
                xn xnVar7 = jnVar4.f35381a;
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) this.e;
                xnVar7.f40191tb = t1Var4.getMessageObject().getId();
                xn xnVar8 = jnVar4.f35381a;
                xnVar8.f40204ub = 2;
                xnVar8.f40217vb = null;
                t1Var4.invalidate();
                return;
            case 4:
                jn jnVar5 = (jn) this.f33392f;
                xn xnVar9 = jnVar5.f35381a;
                org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) this.e;
                xnVar9.f40191tb = t1Var5.getMessageObject().getId();
                xn xnVar10 = jnVar5.f35381a;
                xnVar10.f40204ub = 2;
                xnVar10.f40217vb = null;
                t1Var5.invalidate();
                return;
            case 5:
                jn jnVar6 = (jn) this.f33392f;
                xn xnVar11 = jnVar6.f35381a;
                org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) this.e;
                xnVar11.f40191tb = t1Var6.getMessageObject().getId();
                xn xnVar12 = jnVar6.f35381a;
                xnVar12.f40204ub = 2;
                xnVar12.f40217vb = null;
                t1Var6.invalidate();
                return;
            default:
                bm bmVar = (bm) this.f33392f;
                xn xnVar13 = bmVar.f32984a.N;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.e;
                xnVar13.f40191tb = v0Var.getMessageObject().getId();
                xn xnVar14 = bmVar.f32984a.N;
                xnVar14.f40204ub = 4;
                xnVar14.f40217vb = null;
                v0Var.getMessageObject().flickerLoading = true;
                v0Var.invalidate();
                return;
        }
    }
}
