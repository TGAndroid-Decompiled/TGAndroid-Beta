package org.telegram.ui.Cells;

import android.widget.FrameLayout;
public final class f7 extends org.telegram.ui.Components.r8 {
    public final int M;
    public final FrameLayout N;

    public f7(FrameLayout frameLayout, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(p6Var);
        this.M = i10;
        this.N = frameLayout;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.M) {
            case 0:
                super.invalidateSelf();
                ((h7) this.N).f21991a.invalidate();
                return;
            default:
                super.invalidateSelf();
                ((i7) this.N).f22042a.invalidate();
                return;
        }
    }
}
