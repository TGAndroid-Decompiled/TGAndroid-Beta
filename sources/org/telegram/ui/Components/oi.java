package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.vc1;
import org.telegram.ui.wc1;
import org.telegram.ui.x71;
public final class oi extends org.telegram.ui.Cells.ua {
    public final int f36614x;
    public final oj0 f36615y;

    public oi(oj0 oj0Var, Context context, int i7) {
        super(context, 5);
        this.f36614x = i7;
        this.f36615y = oj0Var;
    }

    @Override
    public final void a(int i7, Object obj) {
        switch (this.f36614x) {
            case 0:
                q0.a aVar = ((pi) ((ka) this.f36615y).f35263f).f36941y;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.w0(((vc1) this.f36615y).d, this, obj, i7);
                return;
            default:
                ((wc1) this.f36615y).E.presentFragment(new x71(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i7) {
        switch (this.f36614x) {
            case 1:
                return WallpapersListActivity.x0(((vc1) this.f36615y).d, this, obj, i7);
            default:
                return super.b(obj, i7);
        }
    }

    public oi(ka kaVar, Context context) {
        super(context, 1);
        this.f36614x = 0;
        this.f36615y = kaVar;
    }
}
