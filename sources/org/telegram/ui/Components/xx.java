package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class xx implements sx {
    public String f40539a;
    public int f40540b;
    public final ArrayList f40541c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f40542e = new HashMap();
    public final HashMap f40543f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f40544n = new ArrayList();
    public final ArrayList f40545r = new ArrayList(0);
    public final ArrayList f40546s = new ArrayList(0);
    public final LongSparseArray f40547w = new LongSparseArray(0);
    public final yx f40548x;

    public xx(yx yxVar) {
        this.f40548x = yxVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] G0 = org.telegram.messenger.g0.G0();
        if (G0.length == 0) {
            str = "";
        } else {
            str = G0[0];
        }
        org.telegram.messenger.li.b0(this.f40548x.R.f33529d1).Z1(false, str, this.f40539a, new gi.nb(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        rv rvVar = this.f40548x.R.H0;
        if (rvVar.G) {
            return;
        }
        rvVar.e(true);
        Utilities.B(new gp(this, 15), new wx(this, 0));
    }

    @Override
    public final void run() {
        yx yxVar = this.f40548x;
        ey eyVar = yxVar.R;
        if (TextUtils.isEmpty(yxVar.O)) {
            u4.h0 adapter = eyVar.E0.getAdapter();
            vx vxVar = eyVar.f33599z0;
            if (adapter != vxVar) {
                eyVar.E0.setAdapter(vxVar);
            }
            yxVar.f();
            return;
        }
        int i3 = yxVar.N + 1;
        yxVar.N = i3;
        this.f40540b = i3;
        this.f40539a = yxVar.O;
        yxVar.E = false;
        this.f40541c.clear();
        this.d.clear();
        this.f40542e.clear();
        this.f40543f.clear();
        this.h.clear();
        this.f40545r.clear();
        this.f40546s.clear();
        this.f40547w.clear();
        eyVar.H0.e(true);
        if ("premium".equalsIgnoreCase(this.f40539a)) {
            Utilities.B(new gp(this, 15), new wx(this, 1));
        } else {
            Utilities.B(new gp(this, 15), new wx(this, 2), new wx(this, 3), new wx(this, 4), new wx(this, 5), new wx(this, 6), new wx(this, 7));
        }
    }
}
