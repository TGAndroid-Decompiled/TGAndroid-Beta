package org.telegram.ui.ActionBar;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.g51;
public final class m0 extends dq {
    public final int h;
    public final Object f20446i;

    public m0(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f20446i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return ((w0) this.f20446i).f20651c.f20773b.f20337o0;
            case 1:
                return j6.v0(j6.Je, ((wy) this.f20446i).D.W1);
            case 2:
                return j6.v0(j6.Q5, ((en0) this.f20446i).f24619f);
            case 3:
                return j6.v0(j6.Je, ((g51) this.f20446i).f33911y.W0);
            default:
                return j6.v0(j6.Je, (f6) this.f20446i);
        }
    }

    public m0(wy wyVar) {
        super(1.25f);
        this.h = 1;
        this.f20446i = wyVar;
        this.f24348f = AndroidUtilities.dp(7.0f);
    }

    public m0(f6 f6Var) {
        super(1.25f);
        this.h = 4;
        this.f20446i = f6Var;
        this.f24348f = AndroidUtilities.dp(7.0f);
    }

    public m0(g51 g51Var) {
        super(1.25f);
        this.h = 3;
        this.f20446i = g51Var;
        this.f24348f = AndroidUtilities.dp(7.0f);
    }
}
