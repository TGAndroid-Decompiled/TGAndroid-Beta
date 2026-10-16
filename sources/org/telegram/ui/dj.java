package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class dj extends pf.c {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.u1 f35062f;
    public final fo f35063g;
    public final Object h;

    public dj(fo foVar, int i10, Object obj, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f35063g = foVar;
        this.e = i10;
        this.h = obj;
        this.f35062f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 20), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 23), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                fo foVar = this.f35063g;
                foVar.f35858wb = i10;
                foVar.f35872xb = 1;
                foVar.f35885yb = (CharacterStyle) this.h;
                this.f35062f.invalidate();
                return;
            default:
                int i11 = this.e;
                fo foVar2 = this.f35063g;
                foVar2.f35858wb = i11;
                foVar2.f35872xb = 3;
                foVar2.f35897zb = (String) this.h;
                this.f35062f.invalidate();
                return;
        }
    }
}
