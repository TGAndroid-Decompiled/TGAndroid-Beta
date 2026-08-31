package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.rc;
import org.telegram.ui.t01;
public final class l0 extends rc {
    public final int f23091j;
    public final Object f23092k;

    public l0(t1 t1Var, t1 t1Var2, int i10) {
        super(t1Var);
        this.f23091j = i10;
        this.f23092k = t1Var2;
    }

    @Override
    public final void b() {
        switch (this.f23091j) {
            case 0:
                ((t1) this.f23092k).a3();
                return;
            case 1:
                ((t1) this.f23092k).a3();
                return;
            default:
                ((t01) this.f23092k).invalidateSelf();
                return;
        }
    }

    public l0(t01 t01Var) {
        super((View) null);
        this.f23091j = 2;
        this.f23092k = t01Var;
    }
}
