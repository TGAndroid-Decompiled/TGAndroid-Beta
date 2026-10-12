package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ce1;
import org.telegram.ui.rj1;
import org.telegram.ui.sj1;
public final class jj extends org.telegram.ui.Cells.cb {
    public final int f26367w;
    public final lm0 f26368x;

    public jj(lm0 lm0Var, Context context, int i10) {
        super(context, 5);
        this.f26367w = i10;
        this.f26368x = lm0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f26367w) {
            case 0:
                q0.a aVar = ((kj) ((bb) this.f26368x).f23735f).f26712x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((rj1) this.f26368x).d, this, obj, i10);
                return;
            default:
                ((sj1) this.f26368x).E.presentFragment(new ce1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f26367w) {
            case 1:
                return WallpapersListActivity.s0(((rj1) this.f26368x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public jj(bb bbVar, Context context) {
        super(context, 1);
        this.f26367w = 0;
        this.f26368x = bbVar;
    }
}
