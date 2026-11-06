package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class zx implements ux {
    public String f41126a;
    public int f41127b;
    public final ArrayList f41128c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f41129e = new HashMap();
    public final HashMap f41130f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f41131n = new ArrayList();
    public final ArrayList f41132r = new ArrayList(0);
    public final ArrayList f41133s = new ArrayList(0);
    public final LongSparseArray f41134w = new LongSparseArray(0);
    public final ay f41135x;

    public zx(ay ayVar) {
        this.f41135x = ayVar;
    }

    public final void a(Runnable runnable, boolean z9) {
        String str;
        String[] G0 = org.telegram.messenger.g0.G0();
        if (G0.length == 0) {
            str = "";
        } else {
            str = G0[0];
        }
        org.telegram.messenger.ui.b0(this.f41135x.Q.f34024c1).Z1(false, str, this.f41126a, new fi.nb(this, z9, runnable, 2), z9);
    }

    @Override
    public final void e() {
        sv svVar = this.f41135x.Q.G0;
        if (svVar.F) {
            return;
        }
        svVar.e(true);
        Utilities.B(new gp(this, 15), new yx(this, 0));
    }

    @Override
    public final void run() {
        ay ayVar = this.f41135x;
        gy gyVar = ayVar.Q;
        if (TextUtils.isEmpty(ayVar.N)) {
            v4.g0 adapter = gyVar.D0.getAdapter();
            xx xxVar = gyVar.f34093y0;
            if (adapter != xxVar) {
                gyVar.D0.setAdapter(xxVar);
            }
            ayVar.f();
            return;
        }
        int i7 = ayVar.M + 1;
        ayVar.M = i7;
        this.f41127b = i7;
        this.f41126a = ayVar.N;
        ayVar.D = false;
        this.f41128c.clear();
        this.d.clear();
        this.f41129e.clear();
        this.f41130f.clear();
        this.h.clear();
        this.f41132r.clear();
        this.f41133s.clear();
        this.f41134w.clear();
        gyVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f41126a)) {
            Utilities.B(new gp(this, 15), new yx(this, 1));
        } else {
            Utilities.B(new gp(this, 15), new yx(this, 2), new yx(this, 3), new yx(this, 4), new yx(this, 5), new yx(this, 6), new yx(this, 7));
        }
    }
}
