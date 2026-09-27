package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.pd1;
import org.telegram.ui.yi1;
import org.telegram.ui.zi1;
public final class kj extends org.telegram.ui.Cells.eb {
    public final int f25743w;
    public final xl0 f25744x;

    public kj(xl0 xl0Var, Context context, int i10) {
        super(context, 5);
        this.f25743w = i10;
        this.f25744x = xl0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f25743w) {
            case 0:
                q0.a aVar = ((lj) ((za) this.f25744x).f30890f).f26070x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((yi1) this.f25744x).d, this, obj, i10);
                return;
            default:
                ((zi1) this.f25744x).E.presentFragment(new pd1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f25743w) {
            case 1:
                return WallpapersListActivity.s0(((yi1) this.f25744x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public kj(za zaVar, Context context) {
        super(context, 1);
        this.f25743w = 0;
        this.f25744x = zaVar;
    }
}
