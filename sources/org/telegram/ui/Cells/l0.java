package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.rc;
import org.telegram.ui.y01;
public final class l0 extends rc {
    public final int f21305j;
    public final Object f21306k;

    public l0(s1 s1Var, s1 s1Var2, int i10) {
        super(s1Var);
        this.f21305j = i10;
        this.f21306k = s1Var2;
    }

    @Override
    public final void b() {
        switch (this.f21305j) {
            case 0:
                ((s1) this.f21306k).a3();
                return;
            case 1:
                ((s1) this.f21306k).a3();
                return;
            default:
                ((y01) this.f21306k).invalidateSelf();
                return;
        }
    }

    public l0(y01 y01Var) {
        super((View) null);
        this.f21305j = 2;
        this.f21306k = y01Var;
    }
}
