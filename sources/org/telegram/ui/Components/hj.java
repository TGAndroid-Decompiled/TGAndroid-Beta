package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.kc1;
import org.telegram.ui.uh1;
import org.telegram.ui.vh1;
public final class hj extends org.telegram.ui.Cells.ab {
    public final int f26900w;
    public final im0 f26901x;

    public hj(im0 im0Var, Context context, int i10) {
        super(context, 5);
        this.f26900w = i10;
        this.f26901x = im0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f26900w) {
            case 0:
                q0.a aVar = ((ij) ((za) this.f26901x).f32864f).f27283x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((uh1) this.f26901x).d, this, obj, i10);
                return;
            default:
                ((vh1) this.f26901x).E.presentFragment(new kc1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f26900w) {
            case 1:
                return WallpapersListActivity.s0(((uh1) this.f26901x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public hj(za zaVar, Context context) {
        super(context, 1);
        this.f26900w = 0;
        this.f26901x = zaVar;
    }
}
