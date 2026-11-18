package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class ly implements fy {
    public String f37259a;
    public int f37260b;
    public final ArrayList f37261c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f37262e = new HashMap();
    public final HashMap f37263f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f37264n = new ArrayList();
    public final ArrayList f37265r = new ArrayList(0);
    public final ArrayList f37266s = new ArrayList(0);
    public final LongSparseArray f37267w = new LongSparseArray(0);
    public final my f37268x;

    public ly(my myVar) {
        this.f37268x = myVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] G0 = org.telegram.messenger.g0.G0();
        if (G0.length == 0) {
            str = "";
        } else {
            str = G0[0];
        }
        org.telegram.messenger.ri.d0(this.f37268x.R.f39345d1).e2(false, str, this.f37259a, new hi.lb(this, z10, runnable, 2), z10);
    }

    @Override
    public final void e() {
        ew ewVar = this.f37268x.R.H0;
        if (ewVar.G) {
            return;
        }
        ewVar.e(true);
        Utilities.B(new mo(this, 17), new ky(this, 0));
    }

    @Override
    public final void run() {
        my myVar = this.f37268x;
        ry ryVar = myVar.R;
        if (TextUtils.isEmpty(myVar.O)) {
            v4.i0 adapter = ryVar.E0.getAdapter();
            jy jyVar = ryVar.f39414z0;
            if (adapter != jyVar) {
                ryVar.E0.setAdapter(jyVar);
            }
            myVar.f();
            return;
        }
        int i7 = myVar.N + 1;
        myVar.N = i7;
        this.f37260b = i7;
        this.f37259a = myVar.O;
        myVar.E = false;
        this.f37261c.clear();
        this.d.clear();
        this.f37262e.clear();
        this.f37263f.clear();
        this.h.clear();
        this.f37265r.clear();
        this.f37266s.clear();
        this.f37267w.clear();
        ryVar.H0.e(true);
        if ("premium".equalsIgnoreCase(this.f37259a)) {
            Utilities.B(new mo(this, 17), new ky(this, 1));
        } else {
            Utilities.B(new mo(this, 17), new ky(this, 2), new ky(this, 3), new ky(this, 4), new ky(this, 5), new ky(this, 6), new ky(this, 7));
        }
    }
}
