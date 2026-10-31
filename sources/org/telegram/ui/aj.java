package org.telegram.ui;

import android.text.style.CharacterStyle;
public final class aj extends gf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.q1 f35659f;
    public final un f35660g;
    public final Object h;

    public aj(un unVar, int i10, Object obj, org.telegram.ui.Cells.q1 q1Var, int i11) {
        this.d = i11;
        this.f35660g = unVar;
        this.e = i10;
        this.h = obj;
        this.f35659f = q1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new ag.d3(this, this.e, 17), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new ag.d3(this, this.e, 19), 240L);
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
                un unVar = this.f35660g;
                unVar.Rb = i10;
                unVar.Sb = 1;
                unVar.Tb = (CharacterStyle) this.h;
                this.f35659f.invalidate();
                return;
            default:
                int i11 = this.e;
                un unVar2 = this.f35660g;
                unVar2.Rb = i11;
                unVar2.Sb = 3;
                unVar2.Ub = (String) this.h;
                this.f35659f.invalidate();
                return;
        }
    }
}
