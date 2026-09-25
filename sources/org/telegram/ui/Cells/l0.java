package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.yc;
import org.telegram.ui.b11;
public final class l0 extends yc {
    public final int f20602j;
    public final Object f20603k;

    public l0(u1 u1Var, u1 u1Var2, int i10) {
        super(u1Var);
        this.f20602j = i10;
        this.f20603k = u1Var2;
    }

    @Override
    public final void b() {
        switch (this.f20602j) {
            case 0:
                ((u1) this.f20603k).a3();
                return;
            case 1:
                ((u1) this.f20603k).a3();
                return;
            default:
                ((b11) this.f20603k).invalidateSelf();
                return;
        }
    }

    public l0(b11 b11Var) {
        super((View) null);
        this.f20602j = 2;
        this.f20603k = b11Var;
    }
}
