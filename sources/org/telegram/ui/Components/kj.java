package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.aj1;
import org.telegram.ui.bj1;
import org.telegram.ui.od1;
public final class kj extends org.telegram.ui.Cells.eb {
    public final int f25742w;
    public final wl0 f25743x;

    public kj(wl0 wl0Var, Context context, int i10) {
        super(context, 5);
        this.f25742w = i10;
        this.f25743x = wl0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f25742w) {
            case 0:
                q0.a aVar = ((lj) ((za) this.f25743x).f30858f).f26091x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((aj1) this.f25743x).d, this, obj, i10);
                return;
            default:
                ((bj1) this.f25743x).E.presentFragment(new od1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f25742w) {
            case 1:
                return WallpapersListActivity.s0(((aj1) this.f25743x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public kj(za zaVar, Context context) {
        super(context, 1);
        this.f25742w = 0;
        this.f25743x = zaVar;
    }
}
