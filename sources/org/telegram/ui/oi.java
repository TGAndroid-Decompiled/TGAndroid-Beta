package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class oi extends ve.d {
    public final int d;
    public final int f41168e;
    public final org.telegram.ui.Cells.t1 f41169f;
    public final qn f41170g;

    public oi(qn qnVar, int i9, org.telegram.ui.Cells.t1 t1Var, int i10) {
        this.d = i10;
        this.f41170g = qnVar;
        this.f41168e = i9;
        this.f41169f = t1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bg.c2(this, this.f41168e, 20), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bg.c2(this, this.f41168e, 22), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bg.c2(this, this.f41168e, 23), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i9 = this.f41168e;
                qn qnVar = this.f41170g;
                qnVar.f42075sb = i9;
                qnVar.f42088tb = 6;
                this.f41169f.invalidate();
                return;
            case 1:
                int i10 = this.f41168e;
                qn qnVar2 = this.f41170g;
                qnVar2.f42075sb = i10;
                qnVar2.f42088tb = 5;
                qnVar2.vb = null;
                this.f41169f.invalidate();
                return;
            default:
                int i11 = this.f41168e;
                qn qnVar3 = this.f41170g;
                qnVar3.f42075sb = i11;
                qnVar3.f42088tb = 7;
                this.f41169f.invalidate();
                return;
        }
    }
}
