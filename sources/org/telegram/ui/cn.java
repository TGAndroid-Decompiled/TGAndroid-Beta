package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class cn extends nf.e {
    public final int d;
    public final org.telegram.ui.Cells.a0 e;
    public final Object f32761f;

    public cn(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f32761f = obj;
        this.e = a0Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new zj(((jn) this.f32761f).f34766a, 2), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new zj(((jn) this.f32761f).f34766a, 3), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new zj(((jn) this.f32761f).f34766a, 4), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new zj(((jn) this.f32761f).f34766a, 5), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new zj(((jn) this.f32761f).f34766a, 6), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new zj(((jn) this.f32761f).f34766a, 7), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new qh(8, this, (org.telegram.ui.Cells.w0) this.e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                jn jnVar = (jn) this.f32761f;
                xn xnVar = jnVar.f34766a;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.e;
                xnVar.f39961vb = u1Var.getMessageObject().getId();
                xn xnVar2 = jnVar.f34766a;
                xnVar2.f39975wb = 2;
                xnVar2.f39988xb = null;
                u1Var.invalidate();
                return;
            case 1:
                jn jnVar2 = (jn) this.f32761f;
                xn xnVar3 = jnVar2.f34766a;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.e;
                xnVar3.f39961vb = u1Var2.getMessageObject().getId();
                xn xnVar4 = jnVar2.f34766a;
                xnVar4.f39975wb = 2;
                xnVar4.f39988xb = null;
                u1Var2.invalidate();
                return;
            case 2:
                jn jnVar3 = (jn) this.f32761f;
                xn xnVar5 = jnVar3.f34766a;
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) this.e;
                xnVar5.f39961vb = u1Var3.getMessageObject().getId();
                xn xnVar6 = jnVar3.f34766a;
                xnVar6.f39975wb = 2;
                xnVar6.f39988xb = null;
                u1Var3.invalidate();
                return;
            case 3:
                jn jnVar4 = (jn) this.f32761f;
                xn xnVar7 = jnVar4.f34766a;
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) this.e;
                xnVar7.f39961vb = u1Var4.getMessageObject().getId();
                xn xnVar8 = jnVar4.f34766a;
                xnVar8.f39975wb = 2;
                xnVar8.f39988xb = null;
                u1Var4.invalidate();
                return;
            case 4:
                jn jnVar5 = (jn) this.f32761f;
                xn xnVar9 = jnVar5.f34766a;
                org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) this.e;
                xnVar9.f39961vb = u1Var5.getMessageObject().getId();
                xn xnVar10 = jnVar5.f34766a;
                xnVar10.f39975wb = 2;
                xnVar10.f39988xb = null;
                u1Var5.invalidate();
                return;
            case 5:
                jn jnVar6 = (jn) this.f32761f;
                xn xnVar11 = jnVar6.f34766a;
                org.telegram.ui.Cells.u1 u1Var6 = (org.telegram.ui.Cells.u1) this.e;
                xnVar11.f39961vb = u1Var6.getMessageObject().getId();
                xn xnVar12 = jnVar6.f34766a;
                xnVar12.f39975wb = 2;
                xnVar12.f39988xb = null;
                u1Var6.invalidate();
                return;
            default:
                bm bmVar = (bm) this.f32761f;
                xn xnVar13 = bmVar.f32390a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                xnVar13.f39961vb = w0Var.getMessageObject().getId();
                xn xnVar14 = bmVar.f32390a.Q;
                xnVar14.f39975wb = 4;
                xnVar14.f39988xb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                return;
        }
    }
}
