package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class py implements jy {
    public String f29452a;
    public int f29453b;
    public final ArrayList f29454c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f29455f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f29456n = new ArrayList();
    public final ArrayList f29457r = new ArrayList(0);
    public final ArrayList f29458s = new ArrayList(0);
    public final LongSparseArray f29459w = new LongSparseArray(0);
    public final qy f29460x;

    public py(qy qyVar) {
        this.f29460x = qyVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] G0 = org.telegram.messenger.i0.G0();
        if (G0.length == 0) {
            str = "";
        } else {
            str = G0[0];
        }
        org.telegram.messenger.ui.b0(this.f29460x.Q.f31865c1).Z1(false, str, this.f29452a, new ll(this, z10, runnable, 1), z10);
    }

    @Override
    public final void e() {
        fw fwVar = this.f29460x.Q.G0;
        if (fwVar.F) {
            return;
        }
        fwVar.e(true);
        Utilities.B(new ho(this, 17), new oy(this, 0));
    }

    @Override
    public final void run() {
        qy qyVar = this.f29460x;
        vy vyVar = qyVar.Q;
        if (TextUtils.isEmpty(qyVar.N)) {
            s4.g0 adapter = vyVar.D0.getAdapter();
            ny nyVar = vyVar.f31935y0;
            if (adapter != nyVar) {
                vyVar.D0.setAdapter(nyVar);
            }
            qyVar.f();
            return;
        }
        int i10 = qyVar.M + 1;
        qyVar.M = i10;
        this.f29453b = i10;
        this.f29452a = qyVar.N;
        qyVar.D = false;
        this.f29454c.clear();
        this.d.clear();
        this.e.clear();
        this.f29455f.clear();
        this.h.clear();
        this.f29457r.clear();
        this.f29458s.clear();
        this.f29459w.clear();
        vyVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f29452a)) {
            Utilities.B(new ho(this, 17), new oy(this, 1));
        } else {
            Utilities.B(new ho(this, 17), new oy(this, 2), new oy(this, 3), new oy(this, 4), new oy(this, 5), new oy(this, 6), new oy(this, 7));
        }
    }
}
