package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class ky implements ey {
    public String f36920a;
    public int f36921b;
    public final ArrayList f36922c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f36923e = new HashMap();
    public final HashMap f36924f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f36925n = new ArrayList();
    public final ArrayList f36926r = new ArrayList(0);
    public final ArrayList f36927s = new ArrayList(0);
    public final LongSparseArray f36928w = new LongSparseArray(0);
    public final ly f36929x;

    public ky(ly lyVar) {
        this.f36929x = lyVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] G0 = org.telegram.messenger.g0.G0();
        if (G0.length == 0) {
            str = "";
        } else {
            str = G0[0];
        }
        org.telegram.messenger.ri.d0(this.f36929x.R.f39047d1).e2(false, str, this.f36920a, new hi.fc(this, z10, runnable, 2), z10);
    }

    @Override
    public final void e() {
        dw dwVar = this.f36929x.R.H0;
        if (dwVar.G) {
            return;
        }
        dwVar.e(true);
        Utilities.B(new lo(this, 17), new jy(this, 0));
    }

    @Override
    public final void run() {
        ly lyVar = this.f36929x;
        qy qyVar = lyVar.R;
        if (TextUtils.isEmpty(lyVar.O)) {
            v4.i0 adapter = qyVar.E0.getAdapter();
            iy iyVar = qyVar.f39116z0;
            if (adapter != iyVar) {
                qyVar.E0.setAdapter(iyVar);
            }
            lyVar.f();
            return;
        }
        int i7 = lyVar.N + 1;
        lyVar.N = i7;
        this.f36921b = i7;
        this.f36920a = lyVar.O;
        lyVar.E = false;
        this.f36922c.clear();
        this.d.clear();
        this.f36923e.clear();
        this.f36924f.clear();
        this.h.clear();
        this.f36926r.clear();
        this.f36927s.clear();
        this.f36928w.clear();
        qyVar.H0.e(true);
        if ("premium".equalsIgnoreCase(this.f36920a)) {
            Utilities.B(new lo(this, 17), new jy(this, 1));
        } else {
            Utilities.B(new lo(this, 17), new jy(this, 2), new jy(this, 3), new jy(this, 4), new jy(this, 5), new jy(this, 6), new jy(this, 7));
        }
    }
}
