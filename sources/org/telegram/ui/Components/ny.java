package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class ny implements hy {
    public String f37973a;
    public int f37974b;
    public final ArrayList f37975c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f37976e = new HashMap();
    public final HashMap f37977f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f37978n = new ArrayList();
    public final ArrayList f37979r = new ArrayList(0);
    public final ArrayList f37980s = new ArrayList(0);
    public final LongSparseArray f37981w = new LongSparseArray(0);
    public final oy f37982x;

    public ny(oy oyVar) {
        this.f37982x = oyVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] G0 = org.telegram.messenger.g0.G0();
        if (G0.length == 0) {
            str = "";
        } else {
            str = G0[0];
        }
        org.telegram.messenger.si.d0(this.f37982x.R.f40074d1).e2(false, str, this.f37973a, new hi.lb(this, z10, runnable, 2), z10);
    }

    @Override
    public final void e() {
        gw gwVar = this.f37982x.R.H0;
        if (gwVar.G) {
            return;
        }
        gwVar.e(true);
        Utilities.B(new oo(this, 17), new my(this, 0));
    }

    @Override
    public final void run() {
        oy oyVar = this.f37982x;
        ty tyVar = oyVar.R;
        if (TextUtils.isEmpty(oyVar.O)) {
            v4.h0 adapter = tyVar.E0.getAdapter();
            ly lyVar = tyVar.f40143z0;
            if (adapter != lyVar) {
                tyVar.E0.setAdapter(lyVar);
            }
            oyVar.f();
            return;
        }
        int i7 = oyVar.N + 1;
        oyVar.N = i7;
        this.f37974b = i7;
        this.f37973a = oyVar.O;
        oyVar.E = false;
        this.f37975c.clear();
        this.d.clear();
        this.f37976e.clear();
        this.f37977f.clear();
        this.h.clear();
        this.f37979r.clear();
        this.f37980s.clear();
        this.f37981w.clear();
        tyVar.H0.e(true);
        if ("premium".equalsIgnoreCase(this.f37973a)) {
            Utilities.B(new oo(this, 17), new my(this, 1));
        } else {
            Utilities.B(new oo(this, 17), new my(this, 2), new my(this, 3), new my(this, 4), new my(this, 5), new my(this, 6), new my(this, 7));
        }
    }
}
