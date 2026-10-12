package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class pz implements jz {
    public String f28451a;
    public int f28452b;
    public final ArrayList f28453c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f28454f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f28455n = new ArrayList();
    public final ArrayList f28456r = new ArrayList(0);
    public final ArrayList f28457s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final rz f28458w;

    public pz(rz rzVar) {
        this.f28458w = rzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f28458w.Q.f31014c1).searchStickers(false, str, this.f28451a, new di.cd(this, z10, runnable, 2), z10);
    }

    @Override
    public final void e() {
        hx hxVar = this.f28458w.Q.G0;
        if (hxVar.F) {
            return;
        }
        hxVar.e(true);
        Utilities.raceCallbacks(new kq(this, 16), new oz(this, 0));
    }

    @Override
    public final void run() {
        rz rzVar = this.f28458w;
        wz wzVar = rzVar.Q;
        if (TextUtils.isEmpty(rzVar.N)) {
            s4.g0 adapter = wzVar.D0.getAdapter();
            mz mzVar = wzVar.f31084y0;
            if (adapter != mzVar) {
                wzVar.D0.setAdapter(mzVar);
            }
            rzVar.l();
            return;
        }
        int i10 = rzVar.M + 1;
        rzVar.M = i10;
        this.f28452b = i10;
        this.f28451a = rzVar.N;
        rzVar.f28971y = false;
        this.f28453c.clear();
        this.d.clear();
        this.e.clear();
        this.f28454f.clear();
        this.h.clear();
        this.f28456r.clear();
        this.f28457s.clear();
        this.v.clear();
        wzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f28451a)) {
            Utilities.raceCallbacks(new kq(this, 16), new oz(this, 1));
        } else {
            Utilities.raceCallbacks(new kq(this, 16), new oz(this, 2), new oz(this, 3), new oz(this, 4), new oz(this, 5), new oz(this, 6), new oz(this, 7));
        }
    }
}
