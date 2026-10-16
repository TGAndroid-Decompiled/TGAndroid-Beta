package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class pz implements jz {
    public String f28133a;
    public int f28134b;
    public final ArrayList f28135c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f28136f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f28137n = new ArrayList();
    public final ArrayList f28138r = new ArrayList(0);
    public final ArrayList f28139s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final rz f28140w;

    public pz(rz rzVar) {
        this.f28140w = rzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f28140w.Q.f30707c1).searchStickers(false, str, this.f28133a, new di.cd(this, z10, runnable, 2), z10);
    }

    @Override
    public final void e() {
        hx hxVar = this.f28140w.Q.G0;
        if (hxVar.F) {
            return;
        }
        hxVar.e(true);
        Utilities.raceCallbacks(new kq(this, 16), new oz(this, 0));
    }

    @Override
    public final void run() {
        rz rzVar = this.f28140w;
        wz wzVar = rzVar.Q;
        if (TextUtils.isEmpty(rzVar.N)) {
            s4.g0 adapter = wzVar.D0.getAdapter();
            mz mzVar = wzVar.f30777y0;
            if (adapter != mzVar) {
                wzVar.D0.setAdapter(mzVar);
            }
            rzVar.l();
            return;
        }
        int i10 = rzVar.M + 1;
        rzVar.M = i10;
        this.f28134b = i10;
        this.f28133a = rzVar.N;
        rzVar.f28671y = false;
        this.f28135c.clear();
        this.d.clear();
        this.e.clear();
        this.f28136f.clear();
        this.h.clear();
        this.f28138r.clear();
        this.f28139s.clear();
        this.v.clear();
        wzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f28133a)) {
            Utilities.raceCallbacks(new kq(this, 16), new oz(this, 1));
        } else {
            Utilities.raceCallbacks(new kq(this, 16), new oz(this, 2), new oz(this, 3), new oz(this, 4), new oz(this, 5), new oz(this, 6), new oz(this, 7));
        }
    }
}
