package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class in extends nf.e {
    public final int d;
    public final org.telegram.ui.Cells.a0 e;
    public final Object f33766f;

    public in(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f33766f = obj;
        this.e = a0Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((pn) this.f33766f).f35881a, 2), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((pn) this.f33766f).f35881a, 3), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((pn) this.f33766f).f35881a, 4), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((pn) this.f33766f).f35881a, 5), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((pn) this.f33766f).f35881a, 6), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ck(((pn) this.f33766f).f35881a, 7), 250L);
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
                pn pnVar = (pn) this.f33766f;
                eo eoVar = pnVar.f35881a;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.e;
                eoVar.f32540wb = t1Var.getMessageObject().getId();
                eo eoVar2 = pnVar.f35881a;
                eoVar2.f32553xb = 2;
                eoVar2.f32565yb = null;
                t1Var.invalidate();
                return;
            case 1:
                pn pnVar2 = (pn) this.f33766f;
                eo eoVar3 = pnVar2.f35881a;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.e;
                eoVar3.f32540wb = t1Var2.getMessageObject().getId();
                eo eoVar4 = pnVar2.f35881a;
                eoVar4.f32553xb = 2;
                eoVar4.f32565yb = null;
                t1Var2.invalidate();
                return;
            case 2:
                pn pnVar3 = (pn) this.f33766f;
                eo eoVar5 = pnVar3.f35881a;
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) this.e;
                eoVar5.f32540wb = t1Var3.getMessageObject().getId();
                eo eoVar6 = pnVar3.f35881a;
                eoVar6.f32553xb = 2;
                eoVar6.f32565yb = null;
                t1Var3.invalidate();
                return;
            case 3:
                pn pnVar4 = (pn) this.f33766f;
                eo eoVar7 = pnVar4.f35881a;
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) this.e;
                eoVar7.f32540wb = t1Var4.getMessageObject().getId();
                eo eoVar8 = pnVar4.f35881a;
                eoVar8.f32553xb = 2;
                eoVar8.f32565yb = null;
                t1Var4.invalidate();
                return;
            case 4:
                pn pnVar5 = (pn) this.f33766f;
                eo eoVar9 = pnVar5.f35881a;
                org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) this.e;
                eoVar9.f32540wb = t1Var5.getMessageObject().getId();
                eo eoVar10 = pnVar5.f35881a;
                eoVar10.f32553xb = 2;
                eoVar10.f32565yb = null;
                t1Var5.invalidate();
                return;
            case 5:
                pn pnVar6 = (pn) this.f33766f;
                eo eoVar11 = pnVar6.f35881a;
                org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) this.e;
                eoVar11.f32540wb = t1Var6.getMessageObject().getId();
                eo eoVar12 = pnVar6.f35881a;
                eoVar12.f32553xb = 2;
                eoVar12.f32565yb = null;
                t1Var6.invalidate();
                return;
            default:
                gm gmVar = (gm) this.f33766f;
                eo eoVar13 = gmVar.f33136a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                eoVar13.f32540wb = w0Var.getMessageObject().getId();
                eo eoVar14 = gmVar.f33136a.Q;
                eoVar14.f32553xb = 4;
                eoVar14.f32565yb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                return;
        }
    }
}
