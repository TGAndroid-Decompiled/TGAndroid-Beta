package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.hj1;
import org.telegram.ui.ij1;
import org.telegram.ui.vd1;
public final class ij extends org.telegram.ui.Cells.fb {
    public final int f25038w;
    public final kl0 f25039x;

    public ij(kl0 kl0Var, Context context, int i10) {
        super(context, 5);
        this.f25038w = i10;
        this.f25039x = kl0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f25038w) {
            case 0:
                q0.a aVar = ((jj) ((xa) this.f25039x).f29912f).f25358x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((hj1) this.f25039x).d, this, obj, i10);
                return;
            default:
                ((ij1) this.f25039x).E.presentFragment(new vd1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f25038w) {
            case 1:
                return WallpapersListActivity.s0(((hj1) this.f25039x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public ij(xa xaVar, Context context) {
        super(context, 1);
        this.f25038w = 0;
        this.f25039x = xaVar;
    }
}
