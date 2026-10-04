package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.aj1;
import org.telegram.ui.bj1;
import org.telegram.ui.rd1;
public final class lj extends org.telegram.ui.Cells.eb {
    public final int f28381w;
    public final yl0 f28382x;

    public lj(yl0 yl0Var, Context context, int i10) {
        super(context, 5);
        this.f28381w = i10;
        this.f28382x = yl0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f28381w) {
            case 0:
                q0.a aVar = ((mj) ((ab) this.f28382x).f24507f).f28632x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((aj1) this.f28382x).d, this, obj, i10);
                return;
            default:
                ((bj1) this.f28382x).E.presentFragment(new rd1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f28381w) {
            case 1:
                return WallpapersListActivity.s0(((aj1) this.f28382x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public lj(ab abVar, Context context) {
        super(context, 1);
        this.f28381w = 0;
        this.f28382x = abVar;
    }
}
