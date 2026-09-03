package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.v00;
public final class b1 extends v00 {
    public final c1 e;

    public b1(c1 c1Var) {
        super(false);
        this.e = c1Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb = new StringBuilder();
        sb.append(df.f.a(this.e.getSpeed()));
        sb.append("x  ");
        return org.telegram.messenger.y3.h(R.string.AccDescrSpeedSlider, sb);
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
    public final void l(float f10) {
        this.e.d(f10, true);
    }
}
