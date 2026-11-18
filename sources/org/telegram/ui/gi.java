package org.telegram.ui;

import android.text.style.CharacterStyle;
public final class gi extends vf.b {
    public final int d;
    public final int f48112e;
    public final org.telegram.ui.Cells.q1 f48113f;
    public final bn f48114g;
    public final Object h;

    public gi(bn bnVar, int i7, Object obj, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.d = i10;
        this.f48114g = bnVar;
        this.f48112e = i7;
        this.h = obj;
        this.f48113f = q1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ai.w0(this, this.f48112e, 25), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ai.w0(this, this.f48112e, 28), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.f48112e;
                bn bnVar = this.f48114g;
                bnVar.f45944ac = i7;
                bnVar.f45959bc = 1;
                bnVar.f45973cc = (CharacterStyle) this.h;
                this.f48113f.invalidate();
                return;
            default:
                int i10 = this.f48112e;
                bn bnVar2 = this.f48114g;
                bnVar2.f45944ac = i10;
                bnVar2.f45959bc = 3;
                bnVar2.dc = (String) this.h;
                this.f48113f.invalidate();
                return;
        }
    }
}
