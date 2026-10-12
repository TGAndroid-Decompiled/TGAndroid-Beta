package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ad;
import org.telegram.ui.l11;
public final class l0 extends ad {
    public final int f22177k;
    public final Object f22178l;

    public l0(u1 u1Var, u1 u1Var2, int i10) {
        super(u1Var);
        this.f22177k = i10;
        this.f22178l = u1Var2;
    }

    @Override
    public final void b() {
        switch (this.f22177k) {
            case 0:
                ((u1) this.f22178l).a3();
                return;
            case 1:
                ((u1) this.f22178l).a3();
                return;
            default:
                ((l11) this.f22178l).invalidateSelf();
                return;
        }
    }

    public l0(l11 l11Var) {
        super((View) null);
        this.f22177k = 2;
        this.f22178l = l11Var;
    }
}
