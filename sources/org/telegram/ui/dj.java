package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class dj extends of.e {
    public final int d;
    public final int f36835e;
    public final org.telegram.ui.Cells.u1 f36836f;
    public final eo f36837g;
    public final Object h;

    public dj(eo eoVar, int i10, Object obj, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f36837g = eoVar;
        this.f36835e = i10;
        this.h = obj;
        this.f36836f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f36835e, 19), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f36835e, 22), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f36835e;
                eo eoVar = this.f36837g;
                eoVar.f37475wb = i10;
                eoVar.f37489xb = 1;
                eoVar.f37501yb = (CharacterStyle) this.h;
                this.f36836f.invalidate();
                return;
            default:
                int i11 = this.f36835e;
                eo eoVar2 = this.f36837g;
                eoVar2.f37475wb = i11;
                eoVar2.f37489xb = 3;
                eoVar2.f37513zb = (String) this.h;
                this.f36836f.invalidate();
                return;
        }
    }
}
