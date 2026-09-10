package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class kz implements fz {
    public String f24828a;
    public int f24829b;
    public final ArrayList f24830c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f24831f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f24832n = new ArrayList();
    public final ArrayList f24833r = new ArrayList(0);
    public final ArrayList f24834s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final mz f24835w;

    public kz(mz mzVar) {
        this.f24835w = mzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f24835w.Q.f26805c1).searchStickers(false, str, this.f24828a, new bi.we(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        bx bxVar = this.f24835w.Q.G0;
        if (bxVar.F) {
            return;
        }
        bxVar.e(true);
        Utilities.raceCallbacks(new dq(this, 16), new jz(this, 0));
    }

    @Override
    public final void run() {
        mz mzVar = this.f24835w;
        rz rzVar = mzVar.Q;
        if (TextUtils.isEmpty(mzVar.N)) {
            s4.h0 adapter = rzVar.D0.getAdapter();
            iz izVar = rzVar.f26875y0;
            if (adapter != izVar) {
                rzVar.D0.setAdapter(izVar);
            }
            mzVar.l();
            return;
        }
        int i10 = mzVar.M + 1;
        mzVar.M = i10;
        this.f24829b = i10;
        this.f24828a = mzVar.N;
        mzVar.f25325y = false;
        this.f24830c.clear();
        this.d.clear();
        this.e.clear();
        this.f24831f.clear();
        this.h.clear();
        this.f24833r.clear();
        this.f24834s.clear();
        this.v.clear();
        rzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f24828a)) {
            Utilities.raceCallbacks(new dq(this, 16), new jz(this, 1));
        } else {
            Utilities.raceCallbacks(new dq(this, 16), new jz(this, 2), new jz(this, 3), new jz(this, 4), new jz(this, 5), new jz(this, 6), new jz(this, 7));
        }
    }
}
