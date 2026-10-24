package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ai1;
import org.telegram.ui.bi1;
import org.telegram.ui.pc1;
public final class fj extends org.telegram.ui.Cells.bb {
    public final int f26328w;
    public final km0 f26329x;

    public fj(km0 km0Var, Context context, int i10) {
        super(context, 5);
        this.f26328w = i10;
        this.f26329x = km0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f26328w) {
            case 0:
                q0.a aVar = ((gj) ((xa) this.f26329x).f32558f).f26702x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((ai1) this.f26329x).d, this, obj, i10);
                return;
            default:
                ((bi1) this.f26329x).E.presentFragment(new pc1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f26328w) {
            case 1:
                return WallpapersListActivity.s0(((ai1) this.f26329x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public fj(xa xaVar, Context context) {
        super(context, 1);
        this.f26328w = 0;
        this.f26329x = xaVar;
    }
}
