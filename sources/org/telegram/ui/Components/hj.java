package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.mc1;
import org.telegram.ui.wh1;
import org.telegram.ui.xh1;
public final class hj extends org.telegram.ui.Cells.ab {
    public final int f26896w;
    public final hm0 f26897x;

    public hj(hm0 hm0Var, Context context, int i10) {
        super(context, 5);
        this.f26896w = i10;
        this.f26897x = hm0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f26896w) {
            case 0:
                q0.a aVar = ((ij) ((za) this.f26897x).f32878f).f27250x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((wh1) this.f26897x).d, this, obj, i10);
                return;
            default:
                ((xh1) this.f26897x).E.presentFragment(new mc1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f26896w) {
            case 1:
                return WallpapersListActivity.s0(((wh1) this.f26897x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public hj(za zaVar, Context context) {
        super(context, 1);
        this.f26896w = 0;
        this.f26897x = zaVar;
    }
}
