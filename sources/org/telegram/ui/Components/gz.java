package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class gz implements bz {
    public String f27011a;
    public int f27012b;
    public final ArrayList f27013c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f27014e = new HashMap();
    public final HashMap f27015f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f27016n = new ArrayList();
    public final ArrayList f27017r = new ArrayList(0);
    public final ArrayList f27018s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final iz f27019w;

    public gz(iz izVar) {
        this.f27019w = izVar;
    }

    public final boolean a() {
        return this.f27019w.Q.G0.F;
    }

    public final void b(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f27019w.Q.f29194c1).searchStickers(false, str, this.f27011a, new ci.dd(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        if (a()) {
            return;
        }
        this.f27019w.Q.G0.e(true);
        Utilities.raceCallbacks(new aq(this, 16), new fz(this, 0));
    }

    @Override
    public final void run() {
        iz izVar = this.f27019w;
        nz nzVar = izVar.Q;
        if (TextUtils.isEmpty(izVar.N)) {
            s4.h0 adapter = nzVar.D0.getAdapter();
            ez ezVar = nzVar.f29265y0;
            if (adapter != ezVar) {
                nzVar.D0.setAdapter(ezVar);
            }
            izVar.l();
            return;
        }
        int i10 = izVar.M + 1;
        izVar.M = i10;
        this.f27012b = i10;
        this.f27011a = izVar.N;
        izVar.f27627y = false;
        this.f27013c.clear();
        this.d.clear();
        this.f27014e.clear();
        this.f27015f.clear();
        this.h.clear();
        this.f27017r.clear();
        this.f27018s.clear();
        this.v.clear();
        nzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f27011a)) {
            Utilities.raceCallbacks(new aq(this, 16), new fz(this, 1));
        } else {
            Utilities.raceCallbacks(new aq(this, 16), new fz(this, 2), new fz(this, 3), new fz(this, 4), new fz(this, 5), new fz(this, 6), new fz(this, 7));
        }
    }
}
