package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class cn extends nf.e {
    public final int d;
    public final org.telegram.ui.Cells.a0 e;
    public final Object f32373f;

    public cn(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f32373f = obj;
        this.e = a0Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((jn) this.f32373f).f34487a, 2), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((jn) this.f32373f).f34487a, 3), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((jn) this.f32373f).f34487a, 4), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((jn) this.f32373f).f34487a, 5), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((jn) this.f32373f).f34487a, 6), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((jn) this.f32373f).f34487a, 7), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new rh(5, this, (org.telegram.ui.Cells.w0) this.e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                jn jnVar = (jn) this.f32373f;
                xn xnVar = jnVar.f34487a;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.e;
                xnVar.f39580vb = t1Var.getMessageObject().getId();
                xn xnVar2 = jnVar.f34487a;
                xnVar2.f39594wb = 2;
                xnVar2.f39607xb = null;
                t1Var.invalidate();
                return;
            case 1:
                jn jnVar2 = (jn) this.f32373f;
                xn xnVar3 = jnVar2.f34487a;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.e;
                xnVar3.f39580vb = t1Var2.getMessageObject().getId();
                xn xnVar4 = jnVar2.f34487a;
                xnVar4.f39594wb = 2;
                xnVar4.f39607xb = null;
                t1Var2.invalidate();
                return;
            case 2:
                jn jnVar3 = (jn) this.f32373f;
                xn xnVar5 = jnVar3.f34487a;
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) this.e;
                xnVar5.f39580vb = t1Var3.getMessageObject().getId();
                xn xnVar6 = jnVar3.f34487a;
                xnVar6.f39594wb = 2;
                xnVar6.f39607xb = null;
                t1Var3.invalidate();
                return;
            case 3:
                jn jnVar4 = (jn) this.f32373f;
                xn xnVar7 = jnVar4.f34487a;
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) this.e;
                xnVar7.f39580vb = t1Var4.getMessageObject().getId();
                xn xnVar8 = jnVar4.f34487a;
                xnVar8.f39594wb = 2;
                xnVar8.f39607xb = null;
                t1Var4.invalidate();
                return;
            case 4:
                jn jnVar5 = (jn) this.f32373f;
                xn xnVar9 = jnVar5.f34487a;
                org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) this.e;
                xnVar9.f39580vb = t1Var5.getMessageObject().getId();
                xn xnVar10 = jnVar5.f34487a;
                xnVar10.f39594wb = 2;
                xnVar10.f39607xb = null;
                t1Var5.invalidate();
                return;
            case 5:
                jn jnVar6 = (jn) this.f32373f;
                xn xnVar11 = jnVar6.f34487a;
                org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) this.e;
                xnVar11.f39580vb = t1Var6.getMessageObject().getId();
                xn xnVar12 = jnVar6.f34487a;
                xnVar12.f39594wb = 2;
                xnVar12.f39607xb = null;
                t1Var6.invalidate();
                return;
            default:
                bm bmVar = (bm) this.f32373f;
                xn xnVar13 = bmVar.f32143a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                xnVar13.f39580vb = w0Var.getMessageObject().getId();
                xn xnVar14 = bmVar.f32143a.Q;
                xnVar14.f39594wb = 4;
                xnVar14.f39607xb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                return;
        }
    }
}
