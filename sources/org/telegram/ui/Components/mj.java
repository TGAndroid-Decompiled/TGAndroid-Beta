package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.kj1;
import org.telegram.ui.lj1;
import org.telegram.ui.xd1;
public final class mj extends org.telegram.ui.Cells.cb {
    public final int f28841w;
    public final pm0 f28842x;

    public mj(pm0 pm0Var, Context context, int i10) {
        super(context, 5);
        this.f28841w = i10;
        this.f28842x = pm0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f28841w) {
            case 0:
                q0.a aVar = ((nj) ((cb) this.f28842x).f25320f).f29167x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((kj1) this.f28842x).d, this, obj, i10);
                return;
            default:
                ((lj1) this.f28842x).E.presentFragment(new xd1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f28841w) {
            case 1:
                return WallpapersListActivity.s0(((kj1) this.f28842x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public mj(cb cbVar, Context context) {
        super(context, 1);
        this.f28841w = 0;
        this.f28842x = cbVar;
    }
}
