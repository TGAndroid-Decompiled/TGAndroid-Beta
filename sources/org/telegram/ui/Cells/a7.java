package org.telegram.ui.Cells;

import android.widget.FrameLayout;
public final class a7 extends org.telegram.ui.Components.e9 {
    public final int D;
    public final FrameLayout E;

    public a7(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(c6Var);
        this.D = i10;
        this.E = frameLayout;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.D) {
            case 0:
                super.invalidateSelf();
                ((c7) this.E).f24172a.invalidate();
                return;
            default:
                super.invalidateSelf();
                ((d7) this.E).f24234a.invalidate();
                return;
        }
    }
}
