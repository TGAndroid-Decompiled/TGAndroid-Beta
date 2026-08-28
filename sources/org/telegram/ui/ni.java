package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class ni extends ve.d {
    public final int d;
    public final int f40742e;
    public final org.telegram.ui.Cells.t1 f40743f;
    public final qn f40744g;
    public final Object h;

    public ni(qn qnVar, int i9, Object obj, org.telegram.ui.Cells.t1 t1Var, int i10) {
        this.d = i10;
        this.f40744g = qnVar;
        this.f40742e = i9;
        this.h = obj;
        this.f40743f = t1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bg.c2(this, this.f40742e, 19), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bg.c2(this, this.f40742e, 21), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i9 = this.f40742e;
                qn qnVar = this.f40744g;
                qnVar.f42075sb = i9;
                qnVar.f42088tb = 1;
                qnVar.f42101ub = (CharacterStyle) this.h;
                this.f40743f.invalidate();
                return;
            default:
                int i10 = this.f40742e;
                qn qnVar2 = this.f40744g;
                qnVar2.f42075sb = i10;
                qnVar2.f42088tb = 3;
                qnVar2.vb = (String) this.h;
                this.f40743f.invalidate();
                return;
        }
    }
}
