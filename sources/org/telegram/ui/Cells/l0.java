package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.wc;
import org.telegram.ui.m11;
public final class l0 extends wc {
    public final int f20387j;
    public final Object f20388k;

    public l0(t1 t1Var, t1 t1Var2, int i10) {
        super(t1Var);
        this.f20387j = i10;
        this.f20388k = t1Var2;
    }

    @Override
    public final void b() {
        switch (this.f20387j) {
            case 0:
                ((t1) this.f20388k).a3();
                return;
            case 1:
                ((t1) this.f20388k).a3();
                return;
            default:
                ((m11) this.f20388k).invalidateSelf();
                return;
        }
    }

    public l0(m11 m11Var) {
        super((View) null);
        this.f20387j = 2;
        this.f20388k = m11Var;
    }
}
