package org.telegram.ui;

import android.text.style.CharacterStyle;
public final class gi extends vf.b {
    public final int d;
    public final int f48303e;
    public final org.telegram.ui.Cells.r1 f48304f;
    public final bn f48305g;
    public final Object h;

    public gi(bn bnVar, int i7, Object obj, org.telegram.ui.Cells.r1 r1Var, int i10) {
        this.d = i10;
        this.f48305g = bnVar;
        this.f48303e = i7;
        this.h = obj;
        this.f48304f = r1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ai.u0(this, this.f48303e, 27), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ii(this, this.f48303e, 0), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.f48303e;
                bn bnVar = this.f48305g;
                bnVar.f46130ac = i7;
                bnVar.f46145bc = 1;
                bnVar.f46159cc = (CharacterStyle) this.h;
                this.f48304f.invalidate();
                return;
            default:
                int i10 = this.f48303e;
                bn bnVar2 = this.f48305g;
                bnVar2.f46130ac = i10;
                bnVar2.f46145bc = 3;
                bnVar2.dc = (String) this.h;
                this.f48304f.invalidate();
                return;
        }
    }
}
