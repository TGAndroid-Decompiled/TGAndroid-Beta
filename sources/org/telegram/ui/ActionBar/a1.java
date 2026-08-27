package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.i00;

public final class a1 extends i00 {

    public final b1 f22707e;

    public a1(b1 b1Var) {
        super(false);
        this.f22707e = b1Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(af.g.a(this.f22707e.getSpeed()));
        sb2.append("x  ");
        return org.telegram.messenger.y1.i(R.string.AccDescrSpeedSlider, sb2);
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
        return this.f22707e.getSpeed();
    }

    @Override
    public final void l(float f10) {
        this.f22707e.d(f10, true);
    }
}
