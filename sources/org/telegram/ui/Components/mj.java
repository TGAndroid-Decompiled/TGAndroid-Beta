package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.kj1;
import org.telegram.ui.lj1;
import org.telegram.ui.xd1;
public final class mj extends org.telegram.ui.Cells.cb {
    public final int f28821w;
    public final qm0 f28822x;

    public mj(qm0 qm0Var, Context context, int i10) {
        super(context, 5);
        this.f28821w = i10;
        this.f28822x = qm0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f28821w) {
            case 0:
                q0.a aVar = ((nj) ((cb) this.f28822x).f25262f).f29132x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((kj1) this.f28822x).d, this, obj, i10);
                return;
            default:
                ((lj1) this.f28822x).E.presentFragment(new xd1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f28821w) {
            case 1:
                return WallpapersListActivity.s0(((kj1) this.f28822x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public mj(cb cbVar, Context context) {
        super(context, 1);
        this.f28821w = 0;
        this.f28822x = cbVar;
    }
}
