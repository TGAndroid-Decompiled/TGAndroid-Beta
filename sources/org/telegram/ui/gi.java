package org.telegram.ui;

import android.text.style.CharacterStyle;
public final class gi extends vf.b {
    public final int d;
    public final int f48040e;
    public final org.telegram.ui.Cells.r1 f48041f;
    public final bn f48042g;
    public final Object h;

    public gi(bn bnVar, int i7, Object obj, org.telegram.ui.Cells.r1 r1Var, int i10) {
        this.d = i10;
        this.f48042g = bnVar;
        this.f48040e = i7;
        this.h = obj;
        this.f48041f = r1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ai.w0(this, this.f48040e, 25), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ai.w0(this, this.f48040e, 28), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.f48040e;
                bn bnVar = this.f48042g;
                bnVar.f45935ac = i7;
                bnVar.f45950bc = 1;
                bnVar.f45964cc = (CharacterStyle) this.h;
                this.f48041f.invalidate();
                return;
            default:
                int i10 = this.f48040e;
                bn bnVar2 = this.f48042g;
                bnVar2.f45935ac = i10;
                bnVar2.f45950bc = 3;
                bnVar2.dc = (String) this.h;
                this.f48041f.invalidate();
                return;
        }
    }
}
