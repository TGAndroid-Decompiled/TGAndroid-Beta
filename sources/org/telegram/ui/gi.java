package org.telegram.ui;

import android.text.style.CharacterStyle;
public final class gi extends vf.b {
    public final int d;
    public final int f45982e;
    public final org.telegram.ui.Cells.q1 f45983f;
    public final an f45984g;
    public final Object h;

    public gi(an anVar, int i7, Object obj, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.d = i10;
        this.f45984g = anVar;
        this.f45982e = i7;
        this.h = obj;
        this.f45983f = q1Var;
    }

    @Override
    public final void c(boolean z9) {
        switch (this.d) {
            case 0:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.f45982e, 21), 240L);
                    return;
                }
                return;
            default:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.f45982e, 24), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.f45982e;
                an anVar = this.f45984g;
                anVar.Wb = i7;
                anVar.Xb = 1;
                anVar.Yb = (CharacterStyle) this.h;
                this.f45983f.invalidate();
                return;
            default:
                int i10 = this.f45982e;
                an anVar2 = this.f45984g;
                anVar2.Wb = i10;
                anVar2.Xb = 3;
                anVar2.Zb = (String) this.h;
                this.f45983f.invalidate();
                return;
        }
    }
}
