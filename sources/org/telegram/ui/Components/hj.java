package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.di1;
import org.telegram.ui.ei1;
import org.telegram.ui.tc1;
public final class hj extends org.telegram.ui.Cells.fb {
    public final int f28971w;
    public final lm0 f28972x;

    public hj(lm0 lm0Var, Context context, int i10) {
        super(context, 5);
        this.f28971w = i10;
        this.f28972x = lm0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f28971w) {
            case 0:
                q0.a aVar = ((ij) ((za) this.f28972x).f35278f).f29299x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.s0(((di1) this.f28972x).d, this, obj, i10);
                return;
            default:
                ((ei1) this.f28972x).E.presentFragment(new tc1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f28971w) {
            case 1:
                return WallpapersListActivity.t0(((di1) this.f28972x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public hj(za zaVar, Context context) {
        super(context, 1);
        this.f28971w = 0;
        this.f28972x = zaVar;
    }
}
