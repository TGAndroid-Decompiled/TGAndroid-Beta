package org.telegram.ui.Cells;

import android.widget.FrameLayout;
public final class e7 extends org.telegram.ui.Components.h9 {
    public final int M;
    public final FrameLayout N;

    public e7(FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(g6Var);
        this.M = i10;
        this.N = frameLayout;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.M) {
            case 0:
                super.invalidateSelf();
                ((g7) this.N).f22415a.invalidate();
                return;
            default:
                super.invalidateSelf();
                ((h7) this.N).f22472a.invalidate();
                return;
        }
    }
}
