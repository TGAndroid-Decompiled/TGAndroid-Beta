package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.pc;
import org.telegram.ui.g01;
public final class l0 extends pc {
    public final int f24637j;
    public final Object f24638k;

    public l0(t1 t1Var, t1 t1Var2, int i9) {
        super(t1Var);
        this.f24637j = i9;
        this.f24638k = t1Var2;
    }

    @Override
    public final void b() {
        switch (this.f24637j) {
            case 0:
                ((t1) this.f24638k).a3();
                return;
            case 1:
                ((t1) this.f24638k).a3();
                return;
            default:
                ((g01) this.f24638k).invalidateSelf();
                return;
        }
    }

    public l0(g01 g01Var) {
        super((View) null);
        this.f24637j = 2;
        this.f24638k = g01Var;
    }
}
