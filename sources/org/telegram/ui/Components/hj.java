package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.fi1;
import org.telegram.ui.gi1;
import org.telegram.ui.vc1;
public final class hj extends org.telegram.ui.Cells.fb {
    public final int f28999w;
    public final mm0 f29000x;

    public hj(mm0 mm0Var, Context context, int i10) {
        super(context, 5);
        this.f28999w = i10;
        this.f29000x = mm0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f28999w) {
            case 0:
                q0.a aVar = ((ij) ((za) this.f29000x).f35304f).f29344x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.s0(((fi1) this.f29000x).d, this, obj, i10);
                return;
            default:
                ((gi1) this.f29000x).E.presentFragment(new vc1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f28999w) {
            case 1:
                return WallpapersListActivity.t0(((fi1) this.f29000x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public hj(za zaVar, Context context) {
        super(context, 1);
        this.f28999w = 0;
        this.f29000x = zaVar;
    }
}
