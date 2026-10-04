package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class gz implements bz {
    public String f26954a;
    public int f26955b;
    public final ArrayList f26956c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f26957e = new HashMap();
    public final HashMap f26958f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f26959n = new ArrayList();
    public final ArrayList f26960r = new ArrayList(0);
    public final ArrayList f26961s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final iz f26962w;

    public gz(iz izVar) {
        this.f26962w = izVar;
    }

    public final boolean a() {
        return this.f26962w.Q.G0.F;
    }

    public final void b(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f26962w.Q.f29097c1).searchStickers(false, str, this.f26954a, new ci.dd(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        if (a()) {
            return;
        }
        this.f26962w.Q.G0.e(true);
        Utilities.raceCallbacks(new aq(this, 16), new fz(this, 0));
    }

    @Override
    public final void run() {
        iz izVar = this.f26962w;
        nz nzVar = izVar.Q;
        if (TextUtils.isEmpty(izVar.N)) {
            s4.h0 adapter = nzVar.D0.getAdapter();
            ez ezVar = nzVar.f29168y0;
            if (adapter != ezVar) {
                nzVar.D0.setAdapter(ezVar);
            }
            izVar.l();
            return;
        }
        int i10 = izVar.M + 1;
        izVar.M = i10;
        this.f26955b = i10;
        this.f26954a = izVar.N;
        izVar.f27529y = false;
        this.f26956c.clear();
        this.d.clear();
        this.f26957e.clear();
        this.f26958f.clear();
        this.h.clear();
        this.f26960r.clear();
        this.f26961s.clear();
        this.v.clear();
        nzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f26954a)) {
            Utilities.raceCallbacks(new aq(this, 16), new fz(this, 1));
        } else {
            Utilities.raceCallbacks(new aq(this, 16), new fz(this, 2), new fz(this, 3), new fz(this, 4), new fz(this, 5), new fz(this, 6), new fz(this, 7));
        }
    }
}
