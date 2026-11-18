package org.telegram.ui.Cells;

import android.widget.FrameLayout;
public final class b7 extends org.telegram.ui.Components.b9 {
    public final int M;
    public final FrameLayout N;

    public b7(FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(i6Var);
        this.M = i7;
        this.N = frameLayout;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.M) {
            case 0:
                super.invalidateSelf();
                ((d7) this.N).f30528a.invalidate();
                return;
            default:
                super.invalidateSelf();
                ((e7) this.N).f30567a.invalidate();
                return;
        }
    }
}
