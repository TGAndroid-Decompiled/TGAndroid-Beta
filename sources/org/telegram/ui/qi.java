package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class qi extends we.d {
    public final int d;

    public final int f41675e;

    public final org.telegram.ui.Cells.s1 f41676f;

    public final rn f41677g;

    public qi(rn rnVar, int i10, org.telegram.ui.Cells.s1 s1Var, int i11) {
        this.d = i11;
        this.f41677g = rnVar;
        this.f41675e = i10;
        this.f41676f = s1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new cg.w1(this, this.f41675e, 19), 240L);
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new cg.w1(this, this.f41675e, 21), 240L);
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new cg.w1(this, this.f41675e, 22), 240L);
                }
                break;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f41675e;
                rn rnVar = this.f41677g;
                rnVar.f42211sb = i10;
                rnVar.f42224tb = 6;
                this.f41676f.invalidate();
                break;
            case 1:
                int i11 = this.f41675e;
                rn rnVar2 = this.f41677g;
                rnVar2.f42211sb = i11;
                rnVar2.f42224tb = 5;
                rnVar2.f42249vb = null;
                this.f41676f.invalidate();
                break;
            default:
                int i12 = this.f41675e;
                rn rnVar3 = this.f41677g;
                rnVar3.f42211sb = i12;
                rnVar3.f42224tb = 7;
                this.f41676f.invalidate();
                break;
        }
    }
}
