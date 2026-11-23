package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.tc1;
import org.telegram.ui.uc1;
public final class gj extends org.telegram.ui.Cells.va {
    public final int f35550x;
    public final dk0 f35551y;

    public gj(dk0 dk0Var, Context context, int i7) {
        super(context, 5);
        this.f35550x = i7;
        this.f35551y = dk0Var;
    }

    @Override
    public final void a(int i7, Object obj) {
        switch (this.f35550x) {
            case 0:
                q0.a aVar = ((hj) ((qa) this.f35551y).f38804f).f35872y;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.w0(((tc1) this.f35551y).d, this, obj, i7);
                return;
            default:
                ((uc1) this.f35551y).F.presentFragment(new org.telegram.ui.x71(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i7) {
        switch (this.f35550x) {
            case 1:
                return WallpapersListActivity.x0(((tc1) this.f35551y).d, this, obj, i7);
            default:
                return super.b(obj, i7);
        }
    }

    public gj(qa qaVar, Context context) {
        super(context, 1);
        this.f35550x = 0;
        this.f35551y = qaVar;
    }
}
