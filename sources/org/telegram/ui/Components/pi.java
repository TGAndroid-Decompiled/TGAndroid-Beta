package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.uc1;
import org.telegram.ui.vc1;
import org.telegram.ui.w71;
public final class pi extends org.telegram.ui.Cells.ua {
    public final int f37020x;
    public final pj0 f37021y;

    public pi(pj0 pj0Var, Context context, int i7) {
        super(context, 5);
        this.f37020x = i7;
        this.f37021y = pj0Var;
    }

    @Override
    public final void a(int i7, Object obj) {
        switch (this.f37020x) {
            case 0:
                q0.a aVar = ((qi) ((la) this.f37021y).f35661f).f37342y;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.w0(((uc1) this.f37021y).d, this, obj, i7);
                return;
            default:
                ((vc1) this.f37021y).E.presentFragment(new w71(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i7) {
        switch (this.f37020x) {
            case 1:
                return WallpapersListActivity.x0(((uc1) this.f37021y).d, this, obj, i7);
            default:
                return super.b(obj, i7);
        }
    }

    public pi(la laVar, Context context) {
        super(context, 1);
        this.f37020x = 0;
        this.f37021y = laVar;
    }
}
