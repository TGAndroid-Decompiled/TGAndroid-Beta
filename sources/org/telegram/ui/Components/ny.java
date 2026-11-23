package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class ny implements hy {
    public String f38006a;
    public int f38007b;
    public final ArrayList f38008c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f38009e = new HashMap();
    public final HashMap f38010f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f38011n = new ArrayList();
    public final ArrayList f38012r = new ArrayList(0);
    public final ArrayList f38013s = new ArrayList(0);
    public final LongSparseArray f38014w = new LongSparseArray(0);
    public final oy f38015x;

    public ny(oy oyVar) {
        this.f38015x = oyVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] G0 = org.telegram.messenger.g0.G0();
        if (G0.length == 0) {
            str = "";
        } else {
            str = G0[0];
        }
        org.telegram.messenger.si.d0(this.f38015x.R.f40091d1).e2(false, str, this.f38006a, new hi.kb(this, z10, runnable, 2), z10);
    }

    @Override
    public final void e() {
        gw gwVar = this.f38015x.R.H0;
        if (gwVar.G) {
            return;
        }
        gwVar.e(true);
        Utilities.B(new oo(this, 17), new my(this, 0));
    }

    @Override
    public final void run() {
        oy oyVar = this.f38015x;
        ty tyVar = oyVar.R;
        if (TextUtils.isEmpty(oyVar.O)) {
            v4.i0 adapter = tyVar.E0.getAdapter();
            ly lyVar = tyVar.f40160z0;
            if (adapter != lyVar) {
                tyVar.E0.setAdapter(lyVar);
            }
            oyVar.f();
            return;
        }
        int i7 = oyVar.N + 1;
        oyVar.N = i7;
        this.f38007b = i7;
        this.f38006a = oyVar.O;
        oyVar.E = false;
        this.f38008c.clear();
        this.d.clear();
        this.f38009e.clear();
        this.f38010f.clear();
        this.h.clear();
        this.f38012r.clear();
        this.f38013s.clear();
        this.f38014w.clear();
        tyVar.H0.e(true);
        if ("premium".equalsIgnoreCase(this.f38006a)) {
            Utilities.B(new oo(this, 17), new my(this, 1));
        } else {
            Utilities.B(new oo(this, 17), new my(this, 2), new my(this, 3), new my(this, 4), new my(this, 5), new my(this, 6), new my(this, 7));
        }
    }
}
