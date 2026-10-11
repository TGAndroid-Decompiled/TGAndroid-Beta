package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.l10;
public final class z0 extends l10 {
    public final a1 f21709e;

    public z0(a1 a1Var) {
        super(false);
        this.f21709e = a1Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hd.a(this.f21709e.getSpeed()));
        sb2.append("x  ");
        return org.telegram.messenger.q.g(R.string.AccDescrSpeedSlider, sb2);
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
        return this.f21709e.getSpeed();
    }

    @Override
    public final void l(float f7) {
        this.f21709e.d(f7, true);
    }
}
