package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class kz implements fz {
    public String f28097a;
    public int f28098b;
    public final ArrayList f28099c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f28100f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f28101n = new ArrayList();
    public final ArrayList f28102r = new ArrayList(0);
    public final ArrayList f28103s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final mz f28104w;

    public kz(mz mzVar) {
        this.f28104w = mzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f28104w.Q.f30310c1).searchStickers(false, str, this.f28097a, new ei.oc(this, z10, runnable, 2), z10);
    }

    @Override
    public final void e() {
        bx bxVar = this.f28104w.Q.G0;
        if (bxVar.F) {
            return;
        }
        bxVar.e(true);
        Utilities.raceCallbacks(new xp(this, 17), new jz(this, 0));
    }

    @Override
    public final void run() {
        mz mzVar = this.f28104w;
        rz rzVar = mzVar.Q;
        if (TextUtils.isEmpty(mzVar.N)) {
            s4.g0 adapter = rzVar.D0.getAdapter();
            iz izVar = rzVar.f30380y0;
            if (adapter != izVar) {
                rzVar.D0.setAdapter(izVar);
            }
            mzVar.l();
            return;
        }
        int i10 = mzVar.M + 1;
        mzVar.M = i10;
        this.f28098b = i10;
        this.f28097a = mzVar.N;
        mzVar.f28729y = false;
        this.f28099c.clear();
        this.d.clear();
        this.e.clear();
        this.f28100f.clear();
        this.h.clear();
        this.f28102r.clear();
        this.f28103s.clear();
        this.v.clear();
        rzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f28097a)) {
            Utilities.raceCallbacks(new xp(this, 17), new jz(this, 1));
        } else {
            Utilities.raceCallbacks(new xp(this, 17), new jz(this, 2), new jz(this, 3), new jz(this, 4), new jz(this, 5), new jz(this, 6), new jz(this, 7));
        }
    }
}
