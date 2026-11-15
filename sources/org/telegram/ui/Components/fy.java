package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class fy implements zx {
    public String f34735a;
    public int f34736b;
    public final ArrayList f34737c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f34738e = new HashMap();
    public final HashMap f34739f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f34740n = new ArrayList();
    public final ArrayList f34741r = new ArrayList(0);
    public final ArrayList f34742s = new ArrayList(0);
    public final LongSparseArray f34743w = new LongSparseArray(0);
    public final gy f34744x;

    public fy(gy gyVar) {
        this.f34744x = gyVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] G0 = org.telegram.messenger.g0.G0();
        if (G0.length == 0) {
            str = "";
        } else {
            str = G0[0];
        }
        org.telegram.messenger.si.b0(this.f34744x.R.f36941d1).Z1(false, str, this.f34735a, new hi.kb(this, z10, runnable, 2), z10);
    }

    @Override
    public final void e() {
        yv yvVar = this.f34744x.R.H0;
        if (yvVar.G) {
            return;
        }
        yvVar.e(true);
        Utilities.B(new fo(this, 17), new ey(this, 0));
    }

    @Override
    public final void run() {
        gy gyVar = this.f34744x;
        ly lyVar = gyVar.R;
        if (TextUtils.isEmpty(gyVar.O)) {
            v4.h0 adapter = lyVar.E0.getAdapter();
            dy dyVar = lyVar.f37010z0;
            if (adapter != dyVar) {
                lyVar.E0.setAdapter(dyVar);
            }
            gyVar.f();
            return;
        }
        int i7 = gyVar.N + 1;
        gyVar.N = i7;
        this.f34736b = i7;
        this.f34735a = gyVar.O;
        gyVar.E = false;
        this.f34737c.clear();
        this.d.clear();
        this.f34738e.clear();
        this.f34739f.clear();
        this.h.clear();
        this.f34741r.clear();
        this.f34742s.clear();
        this.f34743w.clear();
        lyVar.H0.e(true);
        if ("premium".equalsIgnoreCase(this.f34735a)) {
            Utilities.B(new fo(this, 17), new ey(this, 1));
        } else {
            Utilities.B(new fo(this, 17), new ey(this, 2), new ey(this, 3), new ey(this, 4), new ey(this, 5), new ey(this, 6), new ey(this, 7));
        }
    }
}
