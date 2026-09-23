package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.aj1;
import org.telegram.ui.bj1;
import org.telegram.ui.od1;
public final class jj extends org.telegram.ui.Cells.gb {
    public final int f25334w;
    public final ll0 f25335x;

    public jj(ll0 ll0Var, Context context, int i10) {
        super(context, 5);
        this.f25334w = i10;
        this.f25335x = ll0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f25334w) {
            case 0:
                q0.a aVar = ((kj) ((za) this.f25335x).f30551f).f25611x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((aj1) this.f25335x).d, this, obj, i10);
                return;
            default:
                ((bj1) this.f25335x).E.presentFragment(new od1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f25334w) {
            case 1:
                return WallpapersListActivity.s0(((aj1) this.f25335x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public jj(za zaVar, Context context) {
        super(context, 1);
        this.f25334w = 0;
        this.f25335x = zaVar;
    }
}
