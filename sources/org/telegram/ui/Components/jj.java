package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ce1;
import org.telegram.ui.qj1;
import org.telegram.ui.rj1;
public final class jj extends org.telegram.ui.Cells.cb {
    public final int f26037w;
    public final lm0 f26038x;

    public jj(lm0 lm0Var, Context context, int i10) {
        super(context, 5);
        this.f26037w = i10;
        this.f26038x = lm0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f26037w) {
            case 0:
                q0.a aVar = ((kj) ((bb) this.f26038x).f23429f).f26398x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((qj1) this.f26038x).d, this, obj, i10);
                return;
            default:
                ((rj1) this.f26038x).E.presentFragment(new ce1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f26037w) {
            case 1:
                return WallpapersListActivity.s0(((qj1) this.f26038x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public jj(bb bbVar, Context context) {
        super(context, 1);
        this.f26037w = 0;
        this.f26038x = bbVar;
    }
}
