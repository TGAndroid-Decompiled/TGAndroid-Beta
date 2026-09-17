package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class aj extends nf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.t1 f31905f;
    public final bo f31906g;
    public final Object h;

    public aj(bo boVar, int i10, Object obj, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.f31906g = boVar;
        this.e = i10;
        this.h = obj;
        this.f31905f = t1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.n8(this, this.e, 20), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.n8(this, this.e, 22), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                bo boVar = this.f31906g;
                boVar.f32500wb = i10;
                boVar.f32513xb = 1;
                boVar.f32525yb = (CharacterStyle) this.h;
                this.f31905f.invalidate();
                return;
            default:
                int i11 = this.e;
                bo boVar2 = this.f31906g;
                boVar2.f32500wb = i11;
                boVar2.f32513xb = 3;
                boVar2.f32538zb = (String) this.h;
                this.f31905f.invalidate();
                return;
        }
    }
}
