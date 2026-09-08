package org.telegram.ui.Cells;

import android.widget.FrameLayout;
public final class d7 extends org.telegram.ui.Components.i9 {
    public final int D;
    public final FrameLayout E;

    public d7(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(f6Var);
        this.D = i10;
        this.E = frameLayout;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.D) {
            case 0:
                super.invalidateSelf();
                ((f7) this.E).f21957a.invalidate();
                return;
            default:
                super.invalidateSelf();
                ((g7) this.E).f22011a.invalidate();
                return;
        }
    }
}
