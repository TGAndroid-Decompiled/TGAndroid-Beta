package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class fz implements az {
    public String f24362a;
    public int f24363b;
    public final ArrayList f24364c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f24365f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f24366n = new ArrayList();
    public final ArrayList f24367r = new ArrayList(0);
    public final ArrayList f24368s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final hz f24369w;

    public fz(hz hzVar) {
        this.f24369w = hzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f24369w.Q.f26532c1).searchStickers(false, str, this.f24362a, new ci.ed(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        yw ywVar = this.f24369w.Q.G0;
        if (ywVar.F) {
            return;
        }
        ywVar.e(true);
        Utilities.raceCallbacks(new zp(this, 16), new ez(this, 0));
    }

    @Override
    public final void run() {
        hz hzVar = this.f24369w;
        mz mzVar = hzVar.Q;
        if (TextUtils.isEmpty(hzVar.N)) {
            s4.h0 adapter = mzVar.D0.getAdapter();
            dz dzVar = mzVar.f26602y0;
            if (adapter != dzVar) {
                mzVar.D0.setAdapter(dzVar);
            }
            hzVar.l();
            return;
        }
        int i10 = hzVar.M + 1;
        hzVar.M = i10;
        this.f24363b = i10;
        this.f24362a = hzVar.N;
        hzVar.f24951y = false;
        this.f24364c.clear();
        this.d.clear();
        this.e.clear();
        this.f24365f.clear();
        this.h.clear();
        this.f24367r.clear();
        this.f24368s.clear();
        this.v.clear();
        mzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f24362a)) {
            Utilities.raceCallbacks(new zp(this, 16), new ez(this, 1));
        } else {
            Utilities.raceCallbacks(new zp(this, 16), new ez(this, 2), new ez(this, 3), new ez(this, 4), new ez(this, 5), new ez(this, 6), new ez(this, 7));
        }
    }
}
