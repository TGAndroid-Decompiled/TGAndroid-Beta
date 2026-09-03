package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.jd1;
import org.telegram.ui.xi1;
import org.telegram.ui.yi1;
public final class aj extends org.telegram.ui.Cells.za {
    public final int f25258w;
    public final rl0 f25259x;

    public aj(rl0 rl0Var, Context context, int i10) {
        super(context, 5);
        this.f25258w = i10;
        this.f25259x = rl0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f25258w) {
            case 0:
                q0.a aVar = ((bj) ((ra) this.f25259x).f30705f).f25616x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((xi1) this.f25259x).d, this, obj, i10);
                return;
            default:
                ((yi1) this.f25259x).B.presentFragment(new jd1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f25258w) {
            case 1:
                return WallpapersListActivity.s0(((xi1) this.f25259x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public aj(ra raVar, Context context) {
        super(context, 1);
        this.f25258w = 0;
        this.f25259x = raVar;
    }
}
