package org.telegram.ui.Cells;

import android.widget.FrameLayout;

public final class z6 extends org.telegram.ui.Components.y8 {
    public final int D;
    public final FrameLayout E;

    public z6(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(c6Var);
        this.D = i10;
        this.E = frameLayout;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.D) {
            case 0:
                super.invalidateSelf();
                ((b7) this.E).f24115a.invalidate();
                break;
            default:
                super.invalidateSelf();
                ((c7) this.E).f24162a.invalidate();
                break;
        }
    }
}
