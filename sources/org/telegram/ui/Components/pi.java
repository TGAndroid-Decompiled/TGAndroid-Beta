package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.l71;
import org.telegram.ui.mc1;
import org.telegram.ui.nc1;
public final class pi extends org.telegram.ui.Cells.ta {
    public final int f37154x;
    public final sj0 f37155y;

    public pi(sj0 sj0Var, Context context, int i3) {
        super(context, 5);
        this.f37154x = i3;
        this.f37155y = sj0Var;
    }

    @Override
    public final void a(int i3, Object obj) {
        switch (this.f37154x) {
            case 0:
                q0.a aVar = ((qi) ((ka) this.f37155y).f35357f).f37469y;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.w0(((mc1) this.f37155y).d, this, obj, i3);
                return;
            default:
                ((nc1) this.f37155y).F.presentFragment(new l71(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i3) {
        switch (this.f37154x) {
            case 1:
                return WallpapersListActivity.x0(((mc1) this.f37155y).d, this, obj, i3);
            default:
                return super.b(obj, i3);
        }
    }

    public pi(ka kaVar, Context context) {
        super(context, 1);
        this.f37154x = 0;
        this.f37155y = kaVar;
    }
}
