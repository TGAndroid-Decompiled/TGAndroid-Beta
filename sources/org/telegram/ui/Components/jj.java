package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.aj1;
import org.telegram.ui.bj1;
import org.telegram.ui.od1;
public final class jj extends org.telegram.ui.Cells.eb {
    public final int f25436w;
    public final vl0 f25437x;

    public jj(vl0 vl0Var, Context context, int i10) {
        super(context, 5);
        this.f25436w = i10;
        this.f25437x = vl0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f25436w) {
            case 0:
                q0.a aVar = ((kj) ((za) this.f25437x).f30823f).f25800x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((aj1) this.f25437x).d, this, obj, i10);
                return;
            default:
                ((bj1) this.f25437x).E.presentFragment(new od1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f25436w) {
            case 1:
                return WallpapersListActivity.s0(((aj1) this.f25437x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public jj(za zaVar, Context context) {
        super(context, 1);
        this.f25436w = 0;
        this.f25437x = zaVar;
    }
}
