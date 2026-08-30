package org.telegram.ui.Cells;

import android.widget.FrameLayout;
public final class c7 extends org.telegram.ui.Components.z8 {
    public final int D;
    public final FrameLayout E;

    public c7(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(f6Var);
        this.D = i10;
        this.E = frameLayout;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.D) {
            case 0:
                super.invalidateSelf();
                ((e7) this.E).f21020a.invalidate();
                return;
            default:
                super.invalidateSelf();
                ((f7) this.E).f21064a.invalidate();
                return;
        }
    }
}
