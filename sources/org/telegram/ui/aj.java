package org.telegram.ui;

import android.text.style.CharacterStyle;
public final class aj extends gf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.q1 f35792f;
    public final un f35793g;
    public final Object h;

    public aj(un unVar, int i10, Object obj, org.telegram.ui.Cells.q1 q1Var, int i11) {
        this.d = i11;
        this.f35793g = unVar;
        this.e = i10;
        this.h = obj;
        this.f35792f = q1Var;
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
                un unVar = this.f35793g;
                unVar.Sb = i10;
                unVar.Tb = 1;
                unVar.Ub = (CharacterStyle) this.h;
                this.f35792f.invalidate();
                return;
            default:
                int i11 = this.e;
                un unVar2 = this.f35793g;
                unVar2.Sb = i11;
                unVar2.Tb = 3;
                unVar2.Vb = (String) this.h;
                this.f35792f.invalidate();
                return;
        }
    }
}
