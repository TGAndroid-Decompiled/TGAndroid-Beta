package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class fy implements zx {
    public String f34739a;
    public int f34740b;
    public final ArrayList f34741c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f34742e = new HashMap();
    public final HashMap f34743f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f34744n = new ArrayList();
    public final ArrayList f34745r = new ArrayList(0);
    public final ArrayList f34746s = new ArrayList(0);
    public final LongSparseArray f34747w = new LongSparseArray(0);
    public final gy f34748x;

    public fy(gy gyVar) {
        this.f34748x = gyVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] G0 = org.telegram.messenger.g0.G0();
        if (G0.length == 0) {
            str = "";
        } else {
            str = G0[0];
        }
        org.telegram.messenger.si.b0(this.f34748x.R.f36941d1).Z1(false, str, this.f34739a, new hi.kb(this, z10, runnable, 2), z10);
    }

    @Override
    public final void e() {
        yv yvVar = this.f34748x.R.H0;
        if (yvVar.G) {
            return;
        }
        yvVar.e(true);
        Utilities.B(new fo(this, 17), new ey(this, 0));
    }

    @Override
    public final void run() {
        gy gyVar = this.f34748x;
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
        this.f34740b = i7;
        this.f34739a = gyVar.O;
        gyVar.E = false;
        this.f34741c.clear();
        this.d.clear();
        this.f34742e.clear();
        this.f34743f.clear();
        this.h.clear();
        this.f34745r.clear();
        this.f34746s.clear();
        this.f34747w.clear();
        lyVar.H0.e(true);
        if ("premium".equalsIgnoreCase(this.f34739a)) {
            Utilities.B(new fo(this, 17), new ey(this, 1));
        } else {
            Utilities.B(new fo(this, 17), new ey(this, 2), new ey(this, 3), new ey(this, 4), new ey(this, 5), new ey(this, 6), new ey(this, 7));
        }
    }
}
