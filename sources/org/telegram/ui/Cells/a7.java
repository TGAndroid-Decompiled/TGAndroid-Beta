package org.telegram.ui.Cells;

import android.widget.FrameLayout;
public final class a7 extends org.telegram.ui.Components.t8 {
    public final int M;
    public final FrameLayout N;

    public a7(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(e6Var);
        this.M = i7;
        this.N = frameLayout;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.M) {
            case 0:
                super.invalidateSelf();
                ((c7) this.N).f30109a.invalidate();
                return;
            default:
                super.invalidateSelf();
                ((d7) this.N).f30146a.invalidate();
                return;
        }
    }
}
