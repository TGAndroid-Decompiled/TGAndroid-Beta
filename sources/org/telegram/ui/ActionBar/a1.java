package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.k10;
public final class a1 extends k10 {
    public final b1 f20379e;

    public a1(b1 b1Var) {
        super(false);
        this.f20379e = b1Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hd.a(this.f20379e.getSpeed()));
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
        return this.f20379e.getSpeed();
    }

    @Override
    public final void l(float f7) {
        this.f20379e.d(f7, true);
    }
}
