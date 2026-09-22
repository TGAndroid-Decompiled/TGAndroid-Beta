package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.hj1;
import org.telegram.ui.ij1;
import org.telegram.ui.xd1;
public final class ij extends org.telegram.ui.Cells.fb {
    public final int f25144w;
    public final xl0 f25145x;

    public ij(xl0 xl0Var, Context context, int i10) {
        super(context, 5);
        this.f25144w = i10;
        this.f25145x = xl0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f25144w) {
            case 0:
                q0.a aVar = ((jj) ((ya) this.f25145x).f30614f).f25388x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((hj1) this.f25145x).d, this, obj, i10);
                return;
            default:
                ((ij1) this.f25145x).E.presentFragment(new xd1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f25144w) {
            case 1:
                return WallpapersListActivity.s0(((hj1) this.f25145x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public ij(ya yaVar, Context context) {
        super(context, 1);
        this.f25144w = 0;
        this.f25145x = yaVar;
    }
}
