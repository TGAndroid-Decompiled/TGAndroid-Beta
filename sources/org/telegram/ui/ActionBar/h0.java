package org.telegram.ui.ActionBar;

import android.widget.FrameLayout;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.vp;
import org.telegram.ui.y11;
public final class h0 extends vp {
    public final int h;
    public final Object f20353i;

    public h0(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f20353i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return ((t0) this.f20353i).f20829c.f21535b.f20507r0;
            case 1:
                return t6.w0(t6.f21321yf, ((iy) this.f20353i).G.Z1);
            case 2:
                return t6.w0(t6.Q5, ((im0) this.f20353i).e);
            case 3:
                return t6.w0(t6.f21321yf, ((y11) this.f20353i).F.Z0);
            default:
                return t6.w0(t6.f21321yf, (p6) this.f20353i);
        }
    }

    public h0(iy iyVar) {
        super(1.25f);
        this.h = 1;
        this.f20353i = iyVar;
        this.f31866f = org.telegram.messenger.i0.L(7.0f);
    }

    public h0(p6 p6Var) {
        super(1.25f);
        this.h = 4;
        this.f20353i = p6Var;
        this.f31866f = org.telegram.messenger.i0.L(7.0f);
    }

    public h0(y11 y11Var) {
        super(1.25f);
        this.h = 3;
        this.f20353i = y11Var;
        this.f31866f = org.telegram.messenger.i0.L(7.0f);
    }
}
