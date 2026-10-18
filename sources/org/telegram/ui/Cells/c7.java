package org.telegram.ui.Cells;

import android.widget.FrameLayout;
public final class c7 extends org.telegram.ui.Components.h9 {
    public final int D;
    public final FrameLayout E;

    public c7(FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(d6Var);
        this.D = i10;
        this.E = frameLayout;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.D) {
            case 0:
                super.invalidateSelf();
                ((e7) this.E).f22183a.invalidate();
                return;
            default:
                super.invalidateSelf();
                ((f7) this.E).f22251a.invalidate();
                return;
        }
    }
}
