package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class zx implements ux {
    public String f41143a;
    public int f41144b;
    public final ArrayList f41145c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f41146e = new HashMap();
    public final HashMap f41147f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f41148n = new ArrayList();
    public final ArrayList f41149r = new ArrayList(0);
    public final ArrayList f41150s = new ArrayList(0);
    public final LongSparseArray f41151w = new LongSparseArray(0);
    public final ay f41152x;

    public zx(ay ayVar) {
        this.f41152x = ayVar;
    }

    public final void a(Runnable runnable, boolean z9) {
        String str;
        String[] G0 = org.telegram.messenger.g0.G0();
        if (G0.length == 0) {
            str = "";
        } else {
            str = G0[0];
        }
        org.telegram.messenger.ui.b0(this.f41152x.Q.f34032c1).Z1(false, str, this.f41143a, new fi.nb(this, z9, runnable, 2), z9);
    }

    @Override
    public final void e() {
        sv svVar = this.f41152x.Q.G0;
        if (svVar.F) {
            return;
        }
        svVar.e(true);
        Utilities.B(new gp(this, 15), new yx(this, 0));
    }

    @Override
    public final void run() {
        ay ayVar = this.f41152x;
        gy gyVar = ayVar.Q;
        if (TextUtils.isEmpty(ayVar.N)) {
            v4.g0 adapter = gyVar.D0.getAdapter();
            xx xxVar = gyVar.f34101y0;
            if (adapter != xxVar) {
                gyVar.D0.setAdapter(xxVar);
            }
            ayVar.f();
            return;
        }
        int i7 = ayVar.M + 1;
        ayVar.M = i7;
        this.f41144b = i7;
        this.f41143a = ayVar.N;
        ayVar.D = false;
        this.f41145c.clear();
        this.d.clear();
        this.f41146e.clear();
        this.f41147f.clear();
        this.h.clear();
        this.f41149r.clear();
        this.f41150s.clear();
        this.f41151w.clear();
        gyVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f41143a)) {
            Utilities.B(new gp(this, 15), new yx(this, 1));
        } else {
            Utilities.B(new gp(this, 15), new yx(this, 2), new yx(this, 3), new yx(this, 4), new yx(this, 5), new yx(this, 6), new yx(this, 7));
        }
    }
}
