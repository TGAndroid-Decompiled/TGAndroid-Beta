package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.zc;
import org.telegram.ui.b11;
public final class l0 extends zc {
    public final int f20618j;
    public final Object f20619k;

    public l0(u1 u1Var, u1 u1Var2, int i10) {
        super(u1Var);
        this.f20618j = i10;
        this.f20619k = u1Var2;
    }

    @Override
    public final void b() {
        switch (this.f20618j) {
            case 0:
                ((u1) this.f20619k).a3();
                return;
            case 1:
                ((u1) this.f20619k).a3();
                return;
            default:
                ((b11) this.f20619k).invalidateSelf();
                return;
        }
    }

    public l0(b11 b11Var) {
        super((View) null);
        this.f20618j = 2;
        this.f20619k = b11Var;
    }
}
