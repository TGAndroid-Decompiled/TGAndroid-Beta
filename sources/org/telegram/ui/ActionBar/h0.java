package org.telegram.ui.ActionBar;

import android.widget.FrameLayout;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.vp;
import org.telegram.ui.a21;
public final class h0 extends vp {
    public final int h;
    public final Object f20352i;

    public h0(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f20352i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return ((t0) this.f20352i).f20828c.f21534b.f20506r0;
            case 1:
                return t6.w0(t6.f21320yf, ((iy) this.f20352i).G.Z1);
            case 2:
                return t6.w0(t6.Q5, ((hm0) this.f20352i).e);
            case 3:
                return t6.w0(t6.f21320yf, ((a21) this.f20352i).F.Z0);
            default:
                return t6.w0(t6.f21320yf, (p6) this.f20352i);
        }
    }

    public h0(iy iyVar) {
        super(1.25f);
        this.h = 1;
        this.f20352i = iyVar;
        this.f31806f = org.telegram.messenger.i0.L(7.0f);
    }

    public h0(p6 p6Var) {
        super(1.25f);
        this.h = 4;
        this.f20352i = p6Var;
        this.f31806f = org.telegram.messenger.i0.L(7.0f);
    }

    public h0(a21 a21Var) {
        super(1.25f);
        this.h = 3;
        this.f20352i = a21Var;
        this.f31806f = org.telegram.messenger.i0.L(7.0f);
    }
}
