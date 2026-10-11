package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.bd;
import org.telegram.ui.i11;
public final class l0 extends bd {
    public final int f22442k;
    public final Object f22443l;

    public l0(u1 u1Var, u1 u1Var2, int i10) {
        super(u1Var);
        this.f22442k = i10;
        this.f22443l = u1Var2;
    }

    @Override
    public final void b() {
        switch (this.f22442k) {
            case 0:
                ((u1) this.f22443l).a3();
                return;
            case 1:
                ((u1) this.f22443l).a3();
                return;
            default:
                ((i11) this.f22443l).invalidateSelf();
                return;
        }
    }

    public l0(i11 i11Var) {
        super((View) null);
        this.f22442k = 2;
        this.f22443l = i11Var;
    }
}
