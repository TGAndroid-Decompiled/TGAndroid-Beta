package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class aj extends nf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.t1 f31909f;
    public final bo f31910g;
    public final Object h;

    public aj(bo boVar, int i10, Object obj, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.f31910g = boVar;
        this.e = i10;
        this.h = obj;
        this.f31909f = t1Var;
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
                bo boVar = this.f31910g;
                boVar.f32490vb = i10;
                boVar.f32504wb = 1;
                boVar.f32517xb = (CharacterStyle) this.h;
                this.f31909f.invalidate();
                return;
            default:
                int i11 = this.e;
                bo boVar2 = this.f31910g;
                boVar2.f32490vb = i11;
                boVar2.f32504wb = 3;
                boVar2.f32529yb = (String) this.h;
                this.f31909f.invalidate();
                return;
        }
    }
}
