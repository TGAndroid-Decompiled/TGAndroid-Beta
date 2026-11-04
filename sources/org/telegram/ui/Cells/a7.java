package org.telegram.ui.Cells;

import android.widget.FrameLayout;
public final class a7 extends org.telegram.ui.Components.u8 {
    public final int M;
    public final FrameLayout N;

    public a7(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(e6Var);
        this.M = i3;
        this.N = frameLayout;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.M) {
            case 0:
                super.invalidateSelf();
                ((c7) this.N).f29052a.invalidate();
                return;
            default:
                super.invalidateSelf();
                ((d7) this.N).f29088a.invalidate();
                return;
        }
    }
}
