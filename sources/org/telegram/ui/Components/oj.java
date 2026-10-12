package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.lj1;
import org.telegram.ui.mj1;
import org.telegram.ui.zd1;
public final class oj extends org.telegram.ui.Cells.cb {
    public final int f29219w;
    public final vm0 f29220x;

    public oj(vm0 vm0Var, Context context, int i10) {
        super(context, 5);
        this.f29219w = i10;
        this.f29220x = vm0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f29219w) {
            case 0:
                q0.a aVar = ((pj) ((bb) this.f29220x).f24609f).f29508x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((lj1) this.f29220x).d, this, obj, i10);
                return;
            default:
                ((mj1) this.f29220x).E.presentFragment(new zd1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f29219w) {
            case 1:
                return WallpapersListActivity.s0(((lj1) this.f29220x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public oj(bb bbVar, Context context) {
        super(context, 1);
        this.f29219w = 0;
        this.f29220x = bbVar;
    }
}
