package org.telegram.ui.Cells;

import android.widget.FrameLayout;
public final class i7 extends org.telegram.ui.Components.j9 {
    public final int M;
    public final FrameLayout N;

    public i7(FrameLayout frameLayout, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(u6Var);
        this.M = i10;
        this.N = frameLayout;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.M) {
            case 0:
                super.invalidateSelf();
                ((k7) this.N).f24342a.invalidate();
                return;
            default:
                super.invalidateSelf();
                ((l7) this.N).f24393a.invalidate();
                return;
        }
    }
}
