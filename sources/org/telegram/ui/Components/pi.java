package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.qc1;
import org.telegram.ui.rc1;
import org.telegram.ui.u71;
public final class pi extends org.telegram.ui.Cells.ua {
    public final int f37022x;
    public final oj0 f37023y;

    public pi(oj0 oj0Var, Context context, int i7) {
        super(context, 5);
        this.f37022x = i7;
        this.f37023y = oj0Var;
    }

    @Override
    public final void a(int i7, Object obj) {
        switch (this.f37022x) {
            case 0:
                q0.a aVar = ((qi) ((la) this.f37023y).f35581f).f37422y;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.w0(((qc1) this.f37023y).d, this, obj, i7);
                return;
            default:
                ((rc1) this.f37023y).E.presentFragment(new u71(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i7) {
        switch (this.f37022x) {
            case 1:
                return WallpapersListActivity.x0(((qc1) this.f37023y).d, this, obj, i7);
            default:
                return super.b(obj, i7);
        }
    }

    public pi(la laVar, Context context) {
        super(context, 1);
        this.f37022x = 0;
        this.f37023y = laVar;
    }
}
