package org.telegram.ui;

import android.text.style.CharacterStyle;
public final class ii extends vf.b {
    public final int d;
    public final int f46634e;
    public final org.telegram.ui.Cells.q1 f46635f;
    public final cn f46636g;
    public final Object h;

    public ii(cn cnVar, int i7, Object obj, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.d = i10;
        this.f46636g = cnVar;
        this.f46634e = i7;
        this.h = obj;
        this.f46635f = q1Var;
    }

    @Override
    public final void c(boolean z9) {
        switch (this.d) {
            case 0:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.f46634e, 21), 240L);
                    return;
                }
                return;
            default:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.f46634e, 24), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.f46634e;
                cn cnVar = this.f46636g;
                cnVar.Yb = i7;
                cnVar.Zb = 1;
                cnVar.f44430ac = (CharacterStyle) this.h;
                this.f46635f.invalidate();
                return;
            default:
                int i10 = this.f46634e;
                cn cnVar2 = this.f46636g;
                cnVar2.Yb = i10;
                cnVar2.Zb = 3;
                cnVar2.f44445bc = (String) this.h;
                this.f46635f.invalidate();
                return;
        }
    }
}
