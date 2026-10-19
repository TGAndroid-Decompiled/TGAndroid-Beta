package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class qi extends pf.c {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.u1 f40579f;
    public final qn f40580g;
    public final Object h;

    public qi(qn qnVar, int i10, Object obj, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f40580g = qnVar;
        this.e = i10;
        this.h = obj;
        this.f40579f = u1Var;
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
                qn qnVar = this.f40580g;
                qnVar.f40892wb = i10;
                qnVar.f40906xb = 1;
                qnVar.f40919yb = (CharacterStyle) this.h;
                this.f40579f.invalidate();
                return;
            default:
                int i11 = this.e;
                qn qnVar2 = this.f40580g;
                qnVar2.f40892wb = i11;
                qnVar2.f40906xb = 3;
                qnVar2.f40931zb = (String) this.h;
                this.f40579f.invalidate();
                return;
        }
    }
}
