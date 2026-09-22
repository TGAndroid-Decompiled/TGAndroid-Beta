package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ij1;
import org.telegram.ui.jj1;
import org.telegram.ui.wd1;
public final class ij extends org.telegram.ui.Cells.fb {
    public final int f25044w;
    public final kl0 f25045x;

    public ij(kl0 kl0Var, Context context, int i10) {
        super(context, 5);
        this.f25044w = i10;
        this.f25045x = kl0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f25044w) {
            case 0:
                q0.a aVar = ((jj) ((xa) this.f25045x).f29909f).f25355x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((ij1) this.f25045x).d, this, obj, i10);
                return;
            default:
                ((jj1) this.f25045x).E.presentFragment(new wd1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f25044w) {
            case 1:
                return WallpapersListActivity.s0(((ij1) this.f25045x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public ij(xa xaVar, Context context) {
        super(context, 1);
        this.f25044w = 0;
        this.f25045x = xaVar;
    }
}
