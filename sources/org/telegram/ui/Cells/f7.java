package org.telegram.ui.Cells;

import android.widget.FrameLayout;
public final class f7 extends org.telegram.ui.Components.g9 {
    public final int D;
    public final FrameLayout E;

    public f7(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(f6Var);
        this.D = i10;
        this.E = frameLayout;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.D) {
            case 0:
                super.invalidateSelf();
                ((h7) this.E).f19266a.invalidate();
                return;
            default:
                super.invalidateSelf();
                ((i7) this.E).f19312a.invalidate();
                return;
        }
    }
}
