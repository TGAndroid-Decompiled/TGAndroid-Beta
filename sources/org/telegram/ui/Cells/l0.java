package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.rc;
import org.telegram.ui.y01;
public final class l0 extends rc {
    public final int f23093j;
    public final Object f23094k;

    public l0(t1 t1Var, t1 t1Var2, int i10) {
        super(t1Var);
        this.f23093j = i10;
        this.f23094k = t1Var2;
    }

    @Override
    public final void b() {
        switch (this.f23093j) {
            case 0:
                ((t1) this.f23094k).a3();
                return;
            case 1:
                ((t1) this.f23094k).a3();
                return;
            default:
                ((y01) this.f23094k).invalidateSelf();
                return;
        }
    }

    public l0(y01 y01Var) {
        super((View) null);
        this.f23093j = 2;
        this.f23094k = y01Var;
    }
}
