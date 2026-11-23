package org.telegram.ui;

import android.text.style.CharacterStyle;
public final class gi extends vf.b {
    public final int d;
    public final int f48057e;
    public final org.telegram.ui.Cells.r1 f48058f;
    public final bn f48059g;
    public final Object h;

    public gi(bn bnVar, int i7, Object obj, org.telegram.ui.Cells.r1 r1Var, int i10) {
        this.d = i10;
        this.f48059g = bnVar;
        this.f48057e = i7;
        this.h = obj;
        this.f48058f = r1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ai.t0(this, this.f48057e, 27), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ii(this, this.f48057e, 0), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.f48057e;
                bn bnVar = this.f48059g;
                bnVar.f45915ac = i7;
                bnVar.f45930bc = 1;
                bnVar.f45944cc = (CharacterStyle) this.h;
                this.f48058f.invalidate();
                return;
            default:
                int i10 = this.f48057e;
                bn bnVar2 = this.f48059g;
                bnVar2.f45915ac = i10;
                bnVar2.f45930bc = 3;
                bnVar2.dc = (String) this.h;
                this.f48058f.invalidate();
                return;
        }
    }
}
