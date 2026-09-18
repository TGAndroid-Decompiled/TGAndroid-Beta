package org.telegram.ui.Cells;

import android.widget.FrameLayout;
public final class e7 extends org.telegram.ui.Components.h9 {
    public final int D;
    public final FrameLayout E;

    public e7(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(e6Var);
        this.D = i10;
        this.E = frameLayout;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.D) {
            case 0:
                super.invalidateSelf();
                ((g7) this.E).f20318a.invalidate();
                return;
            default:
                super.invalidateSelf();
                ((h7) this.E).f20367a.invalidate();
                return;
        }
    }
}
