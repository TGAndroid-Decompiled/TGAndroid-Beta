package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.jd1;
import org.telegram.ui.wi1;
import org.telegram.ui.xi1;
public final class yi extends org.telegram.ui.Cells.ya {
    public final int f31028w;
    public final ql0 f31029x;

    public yi(ql0 ql0Var, Context context, int i10) {
        super(context, 5);
        this.f31028w = i10;
        this.f31029x = ql0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f31028w) {
            case 0:
                q0.a aVar = ((zi) ((ra) this.f31029x).f28434f).f31390x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((wi1) this.f31029x).d, this, obj, i10);
                return;
            default:
                ((xi1) this.f31029x).B.presentFragment(new jd1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f31028w) {
            case 1:
                return WallpapersListActivity.s0(((wi1) this.f31029x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public yi(ra raVar, Context context) {
        super(context, 1);
        this.f31028w = 0;
        this.f31029x = raVar;
    }
}
