package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.hj1;
import org.telegram.ui.ij1;
import org.telegram.ui.xd1;
public final class ij extends org.telegram.ui.Cells.fb {
    public final int f24944w;
    public final ll0 f24945x;

    public ij(ll0 ll0Var, Context context, int i10) {
        super(context, 5);
        this.f24944w = i10;
        this.f24945x = ll0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f24944w) {
            case 0:
                q0.a aVar = ((jj) ((xa) this.f24945x).f29888f).f25307x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((hj1) this.f24945x).d, this, obj, i10);
                return;
            default:
                ((ij1) this.f24945x).E.presentFragment(new xd1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f24944w) {
            case 1:
                return WallpapersListActivity.s0(((hj1) this.f24945x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public ij(xa xaVar, Context context) {
        super(context, 1);
        this.f24944w = 0;
        this.f24945x = xaVar;
    }
}
