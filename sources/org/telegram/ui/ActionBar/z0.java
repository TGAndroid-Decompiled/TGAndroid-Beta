package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.n10;
public final class z0 extends n10 {
    public final a1 f21483e;

    public z0(a1 a1Var) {
        super(false);
        this.f21483e = a1Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(gd.a(this.f21483e.getSpeed()));
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
        return this.f21483e.getSpeed();
    }

    @Override
    public final void l(float f7) {
        this.f21483e.d(f7, true);
    }
}
