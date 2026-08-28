package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.vc;
public final class b1 extends f00 {
    public final c1 f22745e;

    public b1(c1 c1Var) {
        super(false);
        this.f22745e = c1Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(vc.a(this.f22745e.getSpeed()));
        sb2.append("x  ");
        return org.telegram.messenger.l0.h(R.string.AccDescrSpeedSlider, sb2);
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
        return this.f22745e.getSpeed();
    }

    @Override
    public final void l(float f10) {
        this.f22745e.d(f10, true);
    }
}
