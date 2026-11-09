package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class ay implements vx {
    public String f32008a;
    public int f32009b;
    public final ArrayList f32010c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f32011e = new HashMap();
    public final HashMap f32012f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f32013n = new ArrayList();
    public final ArrayList f32014r = new ArrayList(0);
    public final ArrayList f32015s = new ArrayList(0);
    public final LongSparseArray f32016w = new LongSparseArray(0);
    public final cy f32017x;

    public ay(cy cyVar) {
        this.f32017x = cyVar;
    }

    public final void a(Runnable runnable, boolean z9) {
        String str;
        String[] G0 = org.telegram.messenger.g0.G0();
        if (G0.length == 0) {
            str = "";
        } else {
            str = G0[0];
        }
        org.telegram.messenger.ui.b0(this.f32017x.Q.f34415c1).Z1(false, str, this.f32008a, new fi.nb(this, z9, runnable, 2), z9);
    }

    @Override
    public final void e() {
        tv tvVar = this.f32017x.Q.G0;
        if (tvVar.F) {
            return;
        }
        tvVar.e(true);
        Utilities.B(new gp(this, 15), new zx(this, 0));
    }

    @Override
    public final void run() {
        cy cyVar = this.f32017x;
        hy hyVar = cyVar.Q;
        if (TextUtils.isEmpty(cyVar.N)) {
            v4.g0 adapter = hyVar.D0.getAdapter();
            yx yxVar = hyVar.f34484y0;
            if (adapter != yxVar) {
                hyVar.D0.setAdapter(yxVar);
            }
            cyVar.f();
            return;
        }
        int i7 = cyVar.M + 1;
        cyVar.M = i7;
        this.f32009b = i7;
        this.f32008a = cyVar.N;
        cyVar.D = false;
        this.f32010c.clear();
        this.d.clear();
        this.f32011e.clear();
        this.f32012f.clear();
        this.h.clear();
        this.f32014r.clear();
        this.f32015s.clear();
        this.f32016w.clear();
        hyVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f32008a)) {
            Utilities.B(new gp(this, 15), new zx(this, 1));
        } else {
            Utilities.B(new gp(this, 15), new zx(this, 2), new zx(this, 3), new zx(this, 4), new zx(this, 5), new zx(this, 6), new zx(this, 7));
        }
    }
}
