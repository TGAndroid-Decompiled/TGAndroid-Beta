package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ij1;
import org.telegram.ui.jj1;
import org.telegram.ui.wd1;
public final class ij extends org.telegram.ui.Cells.eb {
    public final int f27173w;
    public final kl0 f27174x;

    public ij(kl0 kl0Var, Context context, int i10) {
        super(context, 5);
        this.f27173w = i10;
        this.f27174x = kl0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f27173w) {
            case 0:
                q0.a aVar = ((jj) ((za) this.f27174x).f33141f).f27544x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((ij1) this.f27174x).d, this, obj, i10);
                return;
            default:
                ((jj1) this.f27174x).E.presentFragment(new wd1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f27173w) {
            case 1:
                return WallpapersListActivity.s0(((ij1) this.f27174x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public ij(za zaVar, Context context) {
        super(context, 1);
        this.f27173w = 0;
        this.f27174x = zaVar;
    }
}
