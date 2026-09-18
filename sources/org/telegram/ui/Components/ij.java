package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.gj1;
import org.telegram.ui.hj1;
import org.telegram.ui.vd1;
public final class ij extends org.telegram.ui.Cells.eb {
    public final int f24969w;
    public final vl0 f24970x;

    public ij(vl0 vl0Var, Context context, int i10) {
        super(context, 5);
        this.f24969w = i10;
        this.f24970x = vl0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f24969w) {
            case 0:
                q0.a aVar = ((jj) ((za) this.f24970x).f30762f).f25352x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((gj1) this.f24970x).d, this, obj, i10);
                return;
            default:
                ((hj1) this.f24970x).E.presentFragment(new vd1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f24969w) {
            case 1:
                return WallpapersListActivity.s0(((gj1) this.f24970x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public ij(za zaVar, Context context) {
        super(context, 1);
        this.f24969w = 0;
        this.f24970x = zaVar;
    }
}
