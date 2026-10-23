package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class qi extends pf.c {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.t1 f40816f;
    public final sn f40817g;
    public final Object h;

    public qi(sn snVar, int i10, Object obj, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.f40817g = snVar;
        this.e = i10;
        this.h = obj;
        this.f40816f = t1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 22), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 25), 240L);
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
                sn snVar = this.f40817g;
                snVar.Jb = i10;
                snVar.Kb = 1;
                snVar.Lb = (CharacterStyle) this.h;
                this.f40816f.invalidate();
                return;
            default:
                int i11 = this.e;
                sn snVar2 = this.f40817g;
                snVar2.Jb = i11;
                snVar2.Kb = 3;
                snVar2.Mb = (String) this.h;
                this.f40816f.invalidate();
                return;
        }
    }
}
