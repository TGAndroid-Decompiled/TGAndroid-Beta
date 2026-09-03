package org.telegram.ui.ActionBar;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.n51;
public final class m0 extends cq {
    public final int h;
    public final Object f20421i;

    public m0(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f20421i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return ((w0) this.f20421i).f20626c.f20748b.f20312o0;
            case 1:
                return j6.v0(j6.Je, ((wy) this.f20421i).D.W1);
            case 2:
                return j6.v0(j6.Q5, ((dn0) this.f20421i).f24328f);
            case 3:
                return j6.v0(j6.Je, ((n51) this.f20421i).f35664y.W0);
            default:
                return j6.v0(j6.Je, (f6) this.f20421i);
        }
    }

    public m0(wy wyVar) {
        super(1.25f);
        this.h = 1;
        this.f20421i = wyVar;
        this.f24014f = AndroidUtilities.dp(7.0f);
    }

    public m0(f6 f6Var) {
        super(1.25f);
        this.h = 4;
        this.f20421i = f6Var;
        this.f24014f = AndroidUtilities.dp(7.0f);
    }

    public m0(n51 n51Var) {
        super(1.25f);
        this.h = 3;
        this.f20421i = n51Var;
        this.f24014f = AndroidUtilities.dp(7.0f);
    }
}
