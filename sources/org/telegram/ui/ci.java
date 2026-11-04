package org.telegram.ui;

import android.text.style.CharacterStyle;
public final class ci extends sf.b {
    public final int d;
    public final int f44358e;
    public final org.telegram.ui.Cells.q1 f44359f;
    public final wm f44360g;
    public final Object h;

    public ci(wm wmVar, int i3, Object obj, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.d = i10;
        this.f44360g = wmVar;
        this.f44358e = i3;
        this.h = obj;
        this.f44359f = q1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new cg.l0(this, this.f44358e, 21), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new cg.l0(this, this.f44358e, 24), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i3 = this.f44358e;
                wm wmVar = this.f44360g;
                wmVar.Xb = i3;
                wmVar.Yb = 1;
                wmVar.Zb = (CharacterStyle) this.h;
                this.f44359f.invalidate();
                return;
            default:
                int i10 = this.f44358e;
                wm wmVar2 = this.f44360g;
                wmVar2.Xb = i10;
                wmVar2.Yb = 3;
                wmVar2.ac = (String) this.h;
                this.f44359f.invalidate();
                return;
        }
    }
}
