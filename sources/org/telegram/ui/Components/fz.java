package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class fz implements az {
    public String f24335a;
    public int f24336b;
    public final ArrayList f24337c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f24338f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f24339n = new ArrayList();
    public final ArrayList f24340r = new ArrayList(0);
    public final ArrayList f24341s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final hz f24342w;

    public fz(hz hzVar) {
        this.f24342w = hzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f24342w.Q.f26548c1).searchStickers(false, str, this.f24335a, new ci.ed(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        yw ywVar = this.f24342w.Q.G0;
        if (ywVar.F) {
            return;
        }
        ywVar.e(true);
        Utilities.raceCallbacks(new zp(this, 16), new ez(this, 0));
    }

    @Override
    public final void run() {
        hz hzVar = this.f24342w;
        mz mzVar = hzVar.Q;
        if (TextUtils.isEmpty(hzVar.N)) {
            s4.h0 adapter = mzVar.D0.getAdapter();
            dz dzVar = mzVar.f26618y0;
            if (adapter != dzVar) {
                mzVar.D0.setAdapter(dzVar);
            }
            hzVar.l();
            return;
        }
        int i10 = hzVar.M + 1;
        hzVar.M = i10;
        this.f24336b = i10;
        this.f24335a = hzVar.N;
        hzVar.f24915y = false;
        this.f24337c.clear();
        this.d.clear();
        this.e.clear();
        this.f24338f.clear();
        this.h.clear();
        this.f24340r.clear();
        this.f24341s.clear();
        this.v.clear();
        mzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f24335a)) {
            Utilities.raceCallbacks(new zp(this, 16), new ez(this, 1));
        } else {
            Utilities.raceCallbacks(new zp(this, 16), new ez(this, 2), new ez(this, 3), new ez(this, 4), new ez(this, 5), new ez(this, 6), new ez(this, 7));
        }
    }
}
