package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class dj extends of.e {
    public final int d;
    public final int f36838e;
    public final org.telegram.ui.Cells.u1 f36839f;
    public final eo f36840g;
    public final Object h;

    public dj(eo eoVar, int i10, Object obj, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f36840g = eoVar;
        this.f36838e = i10;
        this.h = obj;
        this.f36839f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f36838e, 19), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f36838e, 22), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f36838e;
                eo eoVar = this.f36840g;
                eoVar.f37480wb = i10;
                eoVar.f37494xb = 1;
                eoVar.f37506yb = (CharacterStyle) this.h;
                this.f36839f.invalidate();
                return;
            default:
                int i11 = this.f36838e;
                eo eoVar2 = this.f36840g;
                eoVar2.f37480wb = i11;
                eoVar2.f37494xb = 3;
                eoVar2.f37518zb = (String) this.h;
                this.f36839f.invalidate();
                return;
        }
    }
}
