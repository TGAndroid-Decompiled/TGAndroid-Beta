package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.xc;
import org.telegram.ui.v01;
public final class k0 extends xc {
    public final int f24305k;
    public final Object f24306l;

    public k0(s1 s1Var, s1 s1Var2, int i10) {
        super(s1Var);
        this.f24305k = i10;
        this.f24306l = s1Var2;
    }

    @Override
    public final void b() {
        switch (this.f24305k) {
            case 0:
                ((s1) this.f24306l).a3();
                return;
            case 1:
                ((s1) this.f24306l).a3();
                return;
            default:
                ((v01) this.f24306l).invalidateSelf();
                return;
        }
    }

    public k0(v01 v01Var) {
        super((View) null);
        this.f24305k = 2;
        this.f24306l = v01Var;
    }
}
