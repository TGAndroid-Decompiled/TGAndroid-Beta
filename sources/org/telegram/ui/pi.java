package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;

public final class pi extends we.d {
    public final int d;

    public final int f41366e;

    public final org.telegram.ui.Cells.s1 f41367f;

    public final rn f41368g;
    public final Object h;

    public pi(rn rnVar, int i10, Object obj, org.telegram.ui.Cells.s1 s1Var, int i11) {
        this.d = i11;
        this.f41368g = rnVar;
        this.f41366e = i10;
        this.h = obj;
        this.f41367f = s1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new cg.w1(this, this.f41366e, 18), 240L);
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new cg.w1(this, this.f41366e, 20), 240L);
                }
                break;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f41366e;
                rn rnVar = this.f41368g;
                rnVar.f42211sb = i10;
                rnVar.f42224tb = 1;
                rnVar.f42237ub = (CharacterStyle) this.h;
                this.f41367f.invalidate();
                break;
            default:
                int i11 = this.f41366e;
                rn rnVar2 = this.f41368g;
                rnVar2.f42211sb = i11;
                rnVar2.f42224tb = 3;
                rnVar2.f42249vb = (String) this.h;
                this.f41367f.invalidate();
                break;
        }
    }
}
