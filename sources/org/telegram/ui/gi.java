package org.telegram.ui;

import android.text.style.CharacterStyle;
public final class gi extends vf.b {
    public final int d;
    public final int f48117e;
    public final org.telegram.ui.Cells.r1 f48118f;
    public final bn f48119g;
    public final Object h;

    public gi(bn bnVar, int i7, Object obj, org.telegram.ui.Cells.r1 r1Var, int i10) {
        this.d = i10;
        this.f48119g = bnVar;
        this.f48117e = i7;
        this.h = obj;
        this.f48118f = r1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ai.y0(this, this.f48117e, 25), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ai.y0(this, this.f48117e, 28), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.f48117e;
                bn bnVar = this.f48119g;
                bnVar.f45958ac = i7;
                bnVar.f45973bc = 1;
                bnVar.f45987cc = (CharacterStyle) this.h;
                this.f48118f.invalidate();
                return;
            default:
                int i10 = this.f48117e;
                bn bnVar2 = this.f48119g;
                bnVar2.f45958ac = i10;
                bnVar2.f45973bc = 3;
                bnVar2.dc = (String) this.h;
                this.f48118f.invalidate();
                return;
        }
    }
}
