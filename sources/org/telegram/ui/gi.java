package org.telegram.ui;

import android.text.style.CharacterStyle;
public final class gi extends vf.b {
    public final int d;
    public final int f47447e;
    public final org.telegram.ui.Cells.q1 f47448f;
    public final an f47449g;
    public final Object h;

    public gi(an anVar, int i7, Object obj, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.d = i10;
        this.f47449g = anVar;
        this.f47447e = i7;
        this.h = obj;
        this.f47448f = q1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ai.w0(this, this.f47447e, 22), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ai.w0(this, this.f47447e, 25), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.f47447e;
                an anVar = this.f47449g;
                anVar.Zb = i7;
                anVar.f45129ac = 1;
                anVar.f45144bc = (CharacterStyle) this.h;
                this.f47448f.invalidate();
                return;
            default:
                int i10 = this.f47447e;
                an anVar2 = this.f47449g;
                anVar2.Zb = i10;
                anVar2.f45129ac = 3;
                anVar2.f45158cc = (String) this.h;
                this.f47448f.invalidate();
                return;
        }
    }
}
