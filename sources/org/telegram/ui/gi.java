package org.telegram.ui;

import android.text.style.CharacterStyle;
public final class gi extends vf.b {
    public final int d;
    public final int f47457e;
    public final org.telegram.ui.Cells.q1 f47458f;
    public final an f47459g;
    public final Object h;

    public gi(an anVar, int i7, Object obj, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.d = i10;
        this.f47459g = anVar;
        this.f47457e = i7;
        this.h = obj;
        this.f47458f = q1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ai.v0(this, this.f47457e, 22), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ai.v0(this, this.f47457e, 25), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.f47457e;
                an anVar = this.f47459g;
                anVar.Zb = i7;
                anVar.f45130ac = 1;
                anVar.f45145bc = (CharacterStyle) this.h;
                this.f47458f.invalidate();
                return;
            default:
                int i10 = this.f47457e;
                an anVar2 = this.f47459g;
                anVar2.Zb = i10;
                anVar2.f45130ac = 3;
                anVar2.f45159cc = (String) this.h;
                this.f47458f.invalidate();
                return;
        }
    }
}
