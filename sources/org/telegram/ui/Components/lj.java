package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.pd1;
import org.telegram.ui.yi1;
import org.telegram.ui.zi1;
public final class lj extends org.telegram.ui.Cells.eb {
    public final int f28490w;
    public final yl0 f28491x;

    public lj(yl0 yl0Var, Context context, int i10) {
        super(context, 5);
        this.f28490w = i10;
        this.f28491x = yl0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f28490w) {
            case 0:
                q0.a aVar = ((mj) ((ab) this.f28491x).f24578f).f28717x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((yi1) this.f28491x).d, this, obj, i10);
                return;
            default:
                ((zi1) this.f28491x).E.presentFragment(new pd1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f28490w) {
            case 1:
                return WallpapersListActivity.s0(((yi1) this.f28491x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public lj(ab abVar, Context context) {
        super(context, 1);
        this.f28490w = 0;
        this.f28491x = abVar;
    }
}
