package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class qi extends ye.c {
    public final int d;
    public final int f41734e;
    public final org.telegram.ui.Cells.s1 f41735f;
    public final tn f41736g;
    public final Object h;

    public qi(tn tnVar, int i10, Object obj, org.telegram.ui.Cells.s1 s1Var, int i11) {
        this.d = i11;
        this.f41736g = tnVar;
        this.f41734e = i10;
        this.h = obj;
        this.f41735f = s1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bg.f(this, this.f41734e, 21), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bg.f(this, this.f41734e, 23), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f41734e;
                tn tnVar = this.f41736g;
                tnVar.f42971sb = i10;
                tnVar.f42984tb = 1;
                tnVar.f42997ub = (CharacterStyle) this.h;
                this.f41735f.invalidate();
                return;
            default:
                int i11 = this.f41734e;
                tn tnVar2 = this.f41736g;
                tnVar2.f42971sb = i11;
                tnVar2.f42984tb = 3;
                tnVar2.f43010vb = (String) this.h;
                this.f41735f.invalidate();
                return;
        }
    }
}
