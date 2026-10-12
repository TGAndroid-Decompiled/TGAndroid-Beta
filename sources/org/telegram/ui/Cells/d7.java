package org.telegram.ui.Cells;

import android.widget.FrameLayout;
public final class d7 extends org.telegram.ui.Components.j9 {
    public final int D;
    public final FrameLayout E;

    public d7(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(c6Var);
        this.D = i10;
        this.E = frameLayout;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.D) {
            case 0:
                super.invalidateSelf();
                ((f7) this.E).f21850a.invalidate();
                return;
            default:
                super.invalidateSelf();
                ((g7) this.E).f21917a.invalidate();
                return;
        }
    }
}
