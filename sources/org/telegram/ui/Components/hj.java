package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.kc1;
import org.telegram.ui.uh1;
import org.telegram.ui.vh1;
public final class hj extends org.telegram.ui.Cells.ab {
    public final int f26884w;
    public final hm0 f26885x;

    public hj(hm0 hm0Var, Context context, int i10) {
        super(context, 5);
        this.f26884w = i10;
        this.f26885x = hm0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f26884w) {
            case 0:
                q0.a aVar = ((ij) ((za) this.f26885x).f32895f).f27260x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((uh1) this.f26885x).d, this, obj, i10);
                return;
            default:
                ((vh1) this.f26885x).E.presentFragment(new kc1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f26884w) {
            case 1:
                return WallpapersListActivity.s0(((uh1) this.f26885x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public hj(za zaVar, Context context) {
        super(context, 1);
        this.f26884w = 0;
        this.f26885x = zaVar;
    }
}
