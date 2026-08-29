package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bi1;
import org.telegram.ui.ci1;
import org.telegram.ui.qc1;
public final class aj extends org.telegram.ui.Cells.wa {
    public final int f26785w;
    public final il0 f26786x;

    public aj(il0 il0Var, Context context, int i10) {
        super(context, 5);
        this.f26785w = i10;
        this.f26786x = il0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f26785w) {
            case 0:
                q0.a aVar = ((bj) ((wa) this.f26786x).f34358f).f27124x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.r0(((bi1) this.f26786x).d, this, obj, i10);
                return;
            default:
                ((ci1) this.f26786x).A.presentFragment(new qc1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f26785w) {
            case 1:
                return WallpapersListActivity.s0(((bi1) this.f26786x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public aj(wa waVar, Context context) {
        super(context, 1);
        this.f26785w = 0;
        this.f26786x = waVar;
    }
}
