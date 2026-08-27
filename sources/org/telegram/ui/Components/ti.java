package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ai1;
import org.telegram.ui.nc1;
import org.telegram.ui.yh1;

public final class ti extends org.telegram.ui.Cells.wa {

    public final int f32789w;

    public final yk0 f32790x;

    public ti(yk0 yk0Var, Context context, int i10) {
        super(context, 5);
        this.f32789w = i10;
        this.f32790x = yk0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f32789w) {
            case 0:
                q0.a aVar = ((ui) ((pa) this.f32790x).f31573f).f33090x;
                if (aVar != null) {
                    aVar.accept(obj);
                }
                break;
            case 1:
                WallpapersListActivity.r0(((yh1) this.f32790x).d, this, obj, i10);
                break;
            default:
                ((ai1) this.f32790x).A.presentFragment(new nc1(obj, null, true));
                break;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f32789w) {
            case 1:
                return WallpapersListActivity.s0(((yh1) this.f32790x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public ti(pa paVar, Context context) {
        super(context, 1);
        this.f32789w = 0;
        this.f32790x = paVar;
    }
}
