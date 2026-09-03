package org.telegram.ui.ActionBar;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.yy;
import org.telegram.ui.n51;
public final class m0 extends fq {
    public final int h;
    public final Object f22129i;

    public m0(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f22129i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return ((w0) this.f22129i).f22348c.f22475b.f21555o0;
            case 1:
                return k6.v0(k6.Je, ((yy) this.f22129i).D.W1);
            case 2:
                return k6.v0(k6.Q5, ((en0) this.f22129i).f26636f);
            case 3:
                return k6.v0(k6.Je, ((n51) this.f22129i).f38561y.W0);
            default:
                return k6.v0(k6.Je, (g6) this.f22129i);
        }
    }

    public m0(yy yyVar) {
        super(1.25f);
        this.h = 1;
        this.f22129i = yyVar;
        this.f26978f = AndroidUtilities.dp(7.0f);
    }

    public m0(g6 g6Var) {
        super(1.25f);
        this.h = 4;
        this.f22129i = g6Var;
        this.f26978f = AndroidUtilities.dp(7.0f);
    }

    public m0(n51 n51Var) {
        super(1.25f);
        this.h = 3;
        this.f22129i = n51Var;
        this.f26978f = AndroidUtilities.dp(7.0f);
    }
}
