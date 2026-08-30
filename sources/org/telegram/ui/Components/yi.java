package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.cd1;
import org.telegram.ui.oi1;
import org.telegram.ui.pi1;
public final class yi extends org.telegram.ui.Cells.za {
    public final int f31023w;
    public final rl0 f31024x;

    public yi(rl0 rl0Var, Context context, int i10) {
        super(context, 5);
        this.f31023w = i10;
        this.f31024x = rl0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f31023w) {
            case 0:
                q0.a aVar = ((zi) ((ra) this.f31024x).f28424f).f31351x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((oi1) this.f31024x).d, this, obj, i10);
                return;
            default:
                ((pi1) this.f31024x).B.presentFragment(new cd1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f31023w) {
            case 1:
                return WallpapersListActivity.s0(((oi1) this.f31024x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public yi(ra raVar, Context context) {
        super(context, 1);
        this.f31023w = 0;
        this.f31024x = raVar;
    }
}
