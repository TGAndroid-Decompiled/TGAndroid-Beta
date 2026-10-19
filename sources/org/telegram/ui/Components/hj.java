package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.kc1;
import org.telegram.ui.uh1;
import org.telegram.ui.vh1;
public final class hj extends org.telegram.ui.Cells.ab {
    public final int f26882w;
    public final hm0 f26883x;

    public hj(hm0 hm0Var, Context context, int i10) {
        super(context, 5);
        this.f26882w = i10;
        this.f26883x = hm0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f26882w) {
            case 0:
                q0.a aVar = ((ij) ((za) this.f26883x).f32893f).f27258x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((uh1) this.f26883x).d, this, obj, i10);
                return;
            default:
                ((vh1) this.f26883x).E.presentFragment(new kc1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f26882w) {
            case 1:
                return WallpapersListActivity.s0(((uh1) this.f26883x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public hj(za zaVar, Context context) {
        super(context, 1);
        this.f26882w = 0;
        this.f26883x = zaVar;
    }
}
