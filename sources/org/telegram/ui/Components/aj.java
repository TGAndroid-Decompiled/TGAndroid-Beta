package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ed1;
import org.telegram.ui.ri1;
import org.telegram.ui.si1;
public final class aj extends org.telegram.ui.Cells.za {
    public final int f25266w;
    public final sl0 f25267x;

    public aj(sl0 sl0Var, Context context, int i10) {
        super(context, 5);
        this.f25266w = i10;
        this.f25267x = sl0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f25266w) {
            case 0:
                q0.a aVar = ((bj) ((ra) this.f25267x).f30658f).f25605x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((ri1) this.f25267x).d, this, obj, i10);
                return;
            default:
                ((si1) this.f25267x).B.presentFragment(new ed1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f25266w) {
            case 1:
                return WallpapersListActivity.s0(((ri1) this.f25267x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public aj(ra raVar, Context context) {
        super(context, 1);
        this.f25266w = 0;
        this.f25267x = raVar;
    }
}
