package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class fz implements az {
    public String f24363a;
    public int f24364b;
    public final ArrayList f24365c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f24366f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f24367n = new ArrayList();
    public final ArrayList f24368r = new ArrayList(0);
    public final ArrayList f24369s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final hz f24370w;

    public fz(hz hzVar) {
        this.f24370w = hzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f24370w.Q.f26533c1).searchStickers(false, str, this.f24363a, new ci.ed(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        yw ywVar = this.f24370w.Q.G0;
        if (ywVar.F) {
            return;
        }
        ywVar.e(true);
        Utilities.raceCallbacks(new zp(this, 16), new ez(this, 0));
    }

    @Override
    public final void run() {
        hz hzVar = this.f24370w;
        mz mzVar = hzVar.Q;
        if (TextUtils.isEmpty(hzVar.N)) {
            s4.h0 adapter = mzVar.D0.getAdapter();
            dz dzVar = mzVar.f26603y0;
            if (adapter != dzVar) {
                mzVar.D0.setAdapter(dzVar);
            }
            hzVar.l();
            return;
        }
        int i10 = hzVar.M + 1;
        hzVar.M = i10;
        this.f24364b = i10;
        this.f24363a = hzVar.N;
        hzVar.f24952y = false;
        this.f24365c.clear();
        this.d.clear();
        this.e.clear();
        this.f24366f.clear();
        this.h.clear();
        this.f24368r.clear();
        this.f24369s.clear();
        this.v.clear();
        mzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f24363a)) {
            Utilities.raceCallbacks(new zp(this, 16), new ez(this, 1));
        } else {
            Utilities.raceCallbacks(new zp(this, 16), new ez(this, 2), new ez(this, 3), new ez(this, 4), new ez(this, 5), new ez(this, 6), new ez(this, 7));
        }
    }
}
