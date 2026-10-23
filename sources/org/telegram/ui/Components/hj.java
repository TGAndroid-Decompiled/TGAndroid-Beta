package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bi1;
import org.telegram.ui.ci1;
import org.telegram.ui.qc1;
public final class hj extends org.telegram.ui.Cells.bb {
    public final int f26960w;
    public final lm0 f26961x;

    public hj(lm0 lm0Var, Context context, int i10) {
        super(context, 5);
        this.f26960w = i10;
        this.f26961x = lm0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f26960w) {
            case 0:
                q0.a aVar = ((ij) ((za) this.f26961x).f33198f).f27328x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((bi1) this.f26961x).d, this, obj, i10);
                return;
            default:
                ((ci1) this.f26961x).E.presentFragment(new qc1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f26960w) {
            case 1:
                return WallpapersListActivity.s0(((bi1) this.f26961x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public hj(za zaVar, Context context) {
        super(context, 1);
        this.f26960w = 0;
        this.f26961x = zaVar;
    }
}
