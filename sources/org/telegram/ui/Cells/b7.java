package org.telegram.ui.Cells;

import android.widget.FrameLayout;
public final class b7 extends org.telegram.ui.Components.z8 {
    public final int D;
    public final FrameLayout E;

    public b7(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(f6Var);
        this.D = i10;
        this.E = frameLayout;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.D) {
            case 0:
                super.invalidateSelf();
                ((d7) this.E).f20937a.invalidate();
                return;
            default:
                super.invalidateSelf();
                ((e7) this.E).f21000a.invalidate();
                return;
        }
    }
}
