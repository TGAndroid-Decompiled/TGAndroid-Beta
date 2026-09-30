package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.aj1;
import org.telegram.ui.bj1;
import org.telegram.ui.od1;
public final class lj extends org.telegram.ui.Cells.eb {
    public final int f26005w;
    public final yl0 f26006x;

    public lj(yl0 yl0Var, Context context, int i10) {
        super(context, 5);
        this.f26005w = i10;
        this.f26006x = yl0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f26005w) {
            case 0:
                q0.a aVar = ((mj) ((ab) this.f26006x).f22607f).f26308x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((aj1) this.f26006x).d, this, obj, i10);
                return;
            default:
                ((bj1) this.f26006x).E.presentFragment(new od1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f26005w) {
            case 1:
                return WallpapersListActivity.s0(((aj1) this.f26006x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public lj(ab abVar, Context context) {
        super(context, 1);
        this.f26005w = 0;
        this.f26006x = abVar;
    }
}
