package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.qc1;
import org.telegram.ui.rc1;
import org.telegram.ui.t71;
public final class xi extends org.telegram.ui.Cells.ta {
    public final int f41695x;
    public final tj0 f41696y;

    public xi(tj0 tj0Var, Context context, int i7) {
        super(context, 5);
        this.f41695x = i7;
        this.f41696y = tj0Var;
    }

    @Override
    public final void a(int i7, Object obj) {
        switch (this.f41695x) {
            case 0:
                q0.a aVar = ((yi) ((ha) this.f41696y).f35204f).f42008y;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.w0(((qc1) this.f41696y).d, this, obj, i7);
                return;
            default:
                ((rc1) this.f41696y).F.presentFragment(new t71(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i7) {
        switch (this.f41695x) {
            case 1:
                return WallpapersListActivity.x0(((qc1) this.f41696y).d, this, obj, i7);
            default:
                return super.b(obj, i7);
        }
    }

    public xi(ha haVar, Context context) {
        super(context, 1);
        this.f41695x = 0;
        this.f41696y = haVar;
    }
}
