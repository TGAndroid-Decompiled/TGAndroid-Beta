package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.uc;
import org.telegram.ui.h01;
public final class l0 extends uc {
    public final int f24619j;
    public final Object f24620k;

    public l0(s1 s1Var, s1 s1Var2, int i10) {
        super(s1Var);
        this.f24619j = i10;
        this.f24620k = s1Var2;
    }

    @Override
    public final void b() {
        switch (this.f24619j) {
            case 0:
                ((s1) this.f24620k).a3();
                return;
            case 1:
                ((s1) this.f24620k).a3();
                return;
            default:
                ((h01) this.f24620k).invalidateSelf();
                return;
        }
    }

    public l0(h01 h01Var) {
        super((View) null);
        this.f24619j = 2;
        this.f24620k = h01Var;
    }
}
