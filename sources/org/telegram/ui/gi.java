package org.telegram.ui;

import android.text.style.CharacterStyle;
public final class gi extends vf.b {
    public final int d;
    public final int f46010e;
    public final org.telegram.ui.Cells.q1 f46011f;
    public final an f46012g;
    public final Object h;

    public gi(an anVar, int i7, Object obj, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.d = i10;
        this.f46012g = anVar;
        this.f46010e = i7;
        this.h = obj;
        this.f46011f = q1Var;
    }

    @Override
    public final void c(boolean z9) {
        switch (this.d) {
            case 0:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.f46010e, 21), 240L);
                    return;
                }
                return;
            default:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.f46010e, 24), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.f46010e;
                an anVar = this.f46012g;
                anVar.Wb = i7;
                anVar.Xb = 1;
                anVar.Yb = (CharacterStyle) this.h;
                this.f46011f.invalidate();
                return;
            default:
                int i10 = this.f46010e;
                an anVar2 = this.f46012g;
                anVar2.Wb = i10;
                anVar2.Xb = 3;
                anVar2.Zb = (String) this.h;
                this.f46011f.invalidate();
                return;
        }
    }
}
