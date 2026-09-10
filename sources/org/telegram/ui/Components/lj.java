package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ae1;
import org.telegram.ui.mj1;
import org.telegram.ui.nj1;
public final class lj extends org.telegram.ui.Cells.gb {
    public final int f24997w;
    public final ul0 f24998x;

    public lj(ul0 ul0Var, Context context, int i10) {
        super(context, 5);
        this.f24997w = i10;
        this.f24998x = ul0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f24997w) {
            case 0:
                q0.a aVar = ((mj) ((ya) this.f24998x).f29285f).f25243x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((mj1) this.f24998x).d, this, obj, i10);
                return;
            default:
                ((nj1) this.f24998x).E.presentFragment(new ae1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f24997w) {
            case 1:
                return WallpapersListActivity.s0(((mj1) this.f24998x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public lj(ya yaVar, Context context) {
        super(context, 1);
        this.f24997w = 0;
        this.f24998x = yaVar;
    }
}
