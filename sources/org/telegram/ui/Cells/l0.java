package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.yc;
import org.telegram.ui.d11;
public final class l0 extends yc {
    public final int f20357j;
    public final Object f20358k;

    public l0(t1 t1Var, t1 t1Var2, int i10) {
        super(t1Var);
        this.f20357j = i10;
        this.f20358k = t1Var2;
    }

    @Override
    public final void b() {
        switch (this.f20357j) {
            case 0:
                ((t1) this.f20358k).a3();
                return;
            case 1:
                ((t1) this.f20358k).a3();
                return;
            default:
                ((d11) this.f20358k).invalidateSelf();
                return;
        }
    }

    public l0(d11 d11Var) {
        super((View) null);
        this.f20357j = 2;
        this.f20358k = d11Var;
    }
}
