package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class ay implements vx {
    public String f31941a;
    public int f31942b;
    public final ArrayList f31943c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f31944e = new HashMap();
    public final HashMap f31945f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f31946n = new ArrayList();
    public final ArrayList f31947r = new ArrayList(0);
    public final ArrayList f31948s = new ArrayList(0);
    public final LongSparseArray f31949w = new LongSparseArray(0);
    public final cy f31950x;

    public ay(cy cyVar) {
        this.f31950x = cyVar;
    }

    public final void a(Runnable runnable, boolean z9) {
        String str;
        String[] G0 = org.telegram.messenger.g0.G0();
        if (G0.length == 0) {
            str = "";
        } else {
            str = G0[0];
        }
        org.telegram.messenger.ui.b0(this.f31950x.Q.f34400c1).Z1(false, str, this.f31941a, new fi.nb(this, z9, runnable, 2), z9);
    }

    @Override
    public final void e() {
        tv tvVar = this.f31950x.Q.G0;
        if (tvVar.F) {
            return;
        }
        tvVar.e(true);
        Utilities.B(new gp(this, 15), new zx(this, 0));
    }

    @Override
    public final void run() {
        cy cyVar = this.f31950x;
        hy hyVar = cyVar.Q;
        if (TextUtils.isEmpty(cyVar.N)) {
            v4.g0 adapter = hyVar.D0.getAdapter();
            yx yxVar = hyVar.f34469y0;
            if (adapter != yxVar) {
                hyVar.D0.setAdapter(yxVar);
            }
            cyVar.f();
            return;
        }
        int i7 = cyVar.M + 1;
        cyVar.M = i7;
        this.f31942b = i7;
        this.f31941a = cyVar.N;
        cyVar.D = false;
        this.f31943c.clear();
        this.d.clear();
        this.f31944e.clear();
        this.f31945f.clear();
        this.h.clear();
        this.f31947r.clear();
        this.f31948s.clear();
        this.f31949w.clear();
        hyVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f31941a)) {
            Utilities.B(new gp(this, 15), new zx(this, 1));
        } else {
            Utilities.B(new gp(this, 15), new zx(this, 2), new zx(this, 3), new zx(this, 4), new zx(this, 5), new zx(this, 6), new zx(this, 7));
        }
    }
}
