package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class py implements jy {
    public String f29563a;
    public int f29564b;
    public final ArrayList f29565c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f29566f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f29567n = new ArrayList();
    public final ArrayList f29568r = new ArrayList(0);
    public final ArrayList f29569s = new ArrayList(0);
    public final LongSparseArray f29570w = new LongSparseArray(0);
    public final qy f29571x;

    public py(qy qyVar) {
        this.f29571x = qyVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] G0 = org.telegram.messenger.i0.G0();
        if (G0.length == 0) {
            str = "";
        } else {
            str = G0[0];
        }
        org.telegram.messenger.vi.b0(this.f29571x.Q.f31943c1).Z1(false, str, this.f29563a, new ll(this, z10, runnable, 1), z10);
    }

    @Override
    public final void e() {
        fw fwVar = this.f29571x.Q.G0;
        if (fwVar.F) {
            return;
        }
        fwVar.e(true);
        Utilities.B(new ho(this, 17), new oy(this, 0));
    }

    @Override
    public final void run() {
        qy qyVar = this.f29571x;
        vy vyVar = qyVar.Q;
        if (TextUtils.isEmpty(qyVar.N)) {
            s4.g0 adapter = vyVar.D0.getAdapter();
            ny nyVar = vyVar.f32013y0;
            if (adapter != nyVar) {
                vyVar.D0.setAdapter(nyVar);
            }
            qyVar.f();
            return;
        }
        int i10 = qyVar.M + 1;
        qyVar.M = i10;
        this.f29564b = i10;
        this.f29563a = qyVar.N;
        qyVar.D = false;
        this.f29565c.clear();
        this.d.clear();
        this.e.clear();
        this.f29566f.clear();
        this.h.clear();
        this.f29568r.clear();
        this.f29569s.clear();
        this.f29570w.clear();
        vyVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f29563a)) {
            Utilities.B(new ho(this, 17), new oy(this, 1));
        } else {
            Utilities.B(new ho(this, 17), new oy(this, 2), new oy(this, 3), new oy(this, 4), new oy(this, 5), new oy(this, 6), new oy(this, 7));
        }
    }
}
