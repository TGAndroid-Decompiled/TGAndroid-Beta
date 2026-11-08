package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.rc1;
import org.telegram.ui.sc1;
import org.telegram.ui.v71;
public final class pi extends org.telegram.ui.Cells.ua {
    public final int f36943x;
    public final oj0 f36944y;

    public pi(oj0 oj0Var, Context context, int i7) {
        super(context, 5);
        this.f36943x = i7;
        this.f36944y = oj0Var;
    }

    @Override
    public final void a(int i7, Object obj) {
        switch (this.f36943x) {
            case 0:
                q0.a aVar = ((qi) ((la) this.f36944y).f35624f).f37337y;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.w0(((rc1) this.f36944y).d, this, obj, i7);
                return;
            default:
                ((sc1) this.f36944y).E.presentFragment(new v71(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i7) {
        switch (this.f36943x) {
            case 1:
                return WallpapersListActivity.x0(((rc1) this.f36944y).d, this, obj, i7);
            default:
                return super.b(obj, i7);
        }
    }

    public pi(la laVar, Context context) {
        super(context, 1);
        this.f36943x = 0;
        this.f36944y = laVar;
    }
}
