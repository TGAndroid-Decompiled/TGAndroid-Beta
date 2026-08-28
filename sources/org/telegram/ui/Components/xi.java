package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bi1;
import org.telegram.ui.oc1;
import org.telegram.ui.zh1;
public final class xi extends org.telegram.ui.Cells.za {
    public final int f34681w;
    public final vk0 f34682x;

    public xi(vk0 vk0Var, Context context, int i9) {
        super(context, 5);
        this.f34681w = i9;
        this.f34682x = vk0Var;
    }

    @Override
    public final void a(int i9, Object obj) {
        switch (this.f34681w) {
            case 0:
                q0.a aVar = ((yi) ((ra) this.f34682x).f32122f).f34977x;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.q0(((zh1) this.f34682x).d, this, obj, i9);
                return;
            default:
                ((bi1) this.f34682x).A.presentFragment(new oc1(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i9) {
        switch (this.f34681w) {
            case 1:
                return WallpapersListActivity.r0(((zh1) this.f34682x).d, this, obj, i9);
            default:
                return super.b(obj, i9);
        }
    }

    public xi(ra raVar, Context context) {
        super(context, 1);
        this.f34681w = 0;
        this.f34682x = raVar;
    }
}
