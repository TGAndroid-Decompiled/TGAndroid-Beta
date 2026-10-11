package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ij1;
import org.telegram.ui.jj1;
import org.telegram.ui.wd1;
public final class mj extends org.telegram.ui.Cells.cb {
    public final int f28723w;
    public final rm0 f28724x;

    public mj(rm0 rm0Var, Context context, int i10) {
        super(context, 5);
        this.f28723w = i10;
        this.f28724x = rm0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f28723w) {
            case 0:
                q0.a aVar = ((nj) ((bb) this.f28724x).f24898f).f29064x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((ij1) this.f28724x).d, this, obj, i10);
                return;
            default:
                ((jj1) this.f28724x).E.presentFragment(new wd1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f28723w) {
            case 1:
                return WallpapersListActivity.s0(((ij1) this.f28724x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public mj(bb bbVar, Context context) {
        super(context, 1);
        this.f28723w = 0;
        this.f28724x = bbVar;
    }
}
