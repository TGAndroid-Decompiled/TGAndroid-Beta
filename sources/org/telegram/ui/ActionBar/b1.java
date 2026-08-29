package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.q00;
public final class b1 extends q00 {
    public final c1 f22759e;

    public b1(c1 c1Var) {
        super(false);
        this.f22759e = c1Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cf.f.a(this.f22759e.getSpeed()));
        sb2.append("x  ");
        return org.telegram.messenger.x3.i(R.string.AccDescrSpeedSlider, sb2);
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
        return this.f22759e.getSpeed();
    }

    @Override
    public final void l(float f9) {
        this.f22759e.d(f9, true);
    }
}
