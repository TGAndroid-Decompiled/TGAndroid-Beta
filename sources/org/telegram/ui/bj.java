package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class bj extends nf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.t1 f31276f;
    public final eo f31277g;
    public final Object h;

    public bj(eo eoVar, int i10, Object obj, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.f31277g = eoVar;
        this.e = i10;
        this.h = obj;
        this.f31276f = t1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bi.s(this, this.e, 19), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bi.s(this, this.e, 21), 240L);
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
                eo eoVar = this.f31277g;
                eoVar.f32540wb = i10;
                eoVar.f32553xb = 1;
                eoVar.f32565yb = (CharacterStyle) this.h;
                this.f31276f.invalidate();
                return;
            default:
                int i11 = this.e;
                eo eoVar2 = this.f31277g;
                eoVar2.f32540wb = i11;
                eoVar2.f32553xb = 3;
                eoVar2.f32578zb = (String) this.h;
                this.f31276f.invalidate();
                return;
        }
    }
}
