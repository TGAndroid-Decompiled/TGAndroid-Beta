package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.w00;
public final class b1 extends w00 {
    public final c1 e;

    public b1(c1 c1Var) {
        super(false);
        this.e = c1Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ed.a(this.e.getSpeed()));
        sb2.append("x  ");
        return org.telegram.messenger.l0.g(R.string.AccDescrSpeedSlider, sb2);
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
        this.e.d(f7, true);
    }
}
