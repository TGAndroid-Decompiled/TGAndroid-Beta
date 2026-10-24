package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.cd;
public final class z0 extends a10 {
    public final a1 e;

    public z0(a1 a1Var) {
        super(false);
        this.e = a1Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cd.a(this.e.getSpeed()));
        sb2.append("x  ");
        return org.telegram.messenger.v0.h(R.string.AccDescrSpeedSlider, sb2);
    }

    @Override
    public final float h() {
        return 0.2f;
    }

    @Override
    public final float i() {
        return 3.0f;
    }

    @Override
    public final float j() {
        return 0.2f;
    }

    @Override
    public final float k() {
        return this.e.getSpeed();
    }

    @Override
    public final void l(float f7) {
        this.e.e(f7, true);
    }
}
