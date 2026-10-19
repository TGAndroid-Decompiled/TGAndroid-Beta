package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class qi extends pf.c {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.u1 f40588f;
    public final qn f40589g;
    public final Object h;

    public qi(qn qnVar, int i10, Object obj, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f40589g = qnVar;
        this.e = i10;
        this.h = obj;
        this.f40588f = u1Var;
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
                qn qnVar = this.f40589g;
                qnVar.f40900wb = i10;
                qnVar.f40914xb = 1;
                qnVar.f40927yb = (CharacterStyle) this.h;
                this.f40588f.invalidate();
                return;
            default:
                int i11 = this.e;
                qn qnVar2 = this.f40589g;
                qnVar2.f40900wb = i11;
                qnVar2.f40914xb = 3;
                qnVar2.f40939zb = (String) this.h;
                this.f40588f.invalidate();
                return;
        }
    }
}
