package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.xc;
import org.telegram.ui.v01;
public final class k0 extends xc {
    public final int f24303k;
    public final Object f24304l;

    public k0(s1 s1Var, s1 s1Var2, int i10) {
        super(s1Var);
        this.f24303k = i10;
        this.f24304l = s1Var2;
    }

    @Override
    public final void b() {
        switch (this.f24303k) {
            case 0:
                ((s1) this.f24304l).a3();
                return;
            case 1:
                ((s1) this.f24304l).a3();
                return;
            default:
                ((v01) this.f24304l).invalidateSelf();
                return;
        }
    }

    public k0(v01 v01Var) {
        super((View) null);
        this.f24303k = 2;
        this.f24304l = v01Var;
    }
}
