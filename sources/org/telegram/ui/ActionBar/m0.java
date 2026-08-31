package org.telegram.ui.ActionBar;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.yy;
import org.telegram.ui.i51;
public final class m0 extends fq {
    public final int h;
    public final Object f22127i;

    public m0(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.f22127i = frameLayout;
    }

    @Override
    public final int a() {
        switch (this.h) {
            case 0:
                return ((w0) this.f22127i).f22346c.f22473b.f21553o0;
            case 1:
                return k6.v0(k6.Je, ((yy) this.f22127i).D.W1);
            case 2:
                return k6.v0(k6.Q5, ((fn0) this.f22127i).f26967f);
            case 3:
                return k6.v0(k6.Je, ((i51) this.f22127i).f37104y.W0);
            default:
                return k6.v0(k6.Je, (g6) this.f22127i);
        }
    }

    public m0(yy yyVar) {
        super(1.25f);
        this.h = 1;
        this.f22127i = yyVar;
        this.f26983f = AndroidUtilities.dp(7.0f);
    }

    public m0(g6 g6Var) {
        super(1.25f);
        this.h = 4;
        this.f22127i = g6Var;
        this.f26983f = AndroidUtilities.dp(7.0f);
    }

    public m0(i51 i51Var) {
        super(1.25f);
        this.h = 3;
        this.f22127i = i51Var;
        this.f26983f = AndroidUtilities.dp(7.0f);
    }
}
