package org.telegram.ui.Cells;

import android.widget.FrameLayout;
public final class d7 extends org.telegram.ui.Components.f9 {
    public final int D;
    public final FrameLayout E;

    public d7(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(e6Var);
        this.D = i10;
        this.E = frameLayout;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.D) {
            case 0:
                super.invalidateSelf();
                ((f7) this.E).f20071a.invalidate();
                return;
            default:
                super.invalidateSelf();
                ((g7) this.E).f20133a.invalidate();
                return;
        }
    }
}
