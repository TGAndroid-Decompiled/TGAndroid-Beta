package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class mz implements hz {
    public String f28633a;
    public int f28634b;
    public final ArrayList f28635c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f28636f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f28637n = new ArrayList();
    public final ArrayList f28638r = new ArrayList(0);
    public final ArrayList f28639s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final oz f28640w;

    public mz(oz ozVar) {
        this.f28640w = ozVar;
    }

    public final boolean a() {
        return this.f28640w.Q.G0.F;
    }

    public final void b(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f28640w.Q.f30727c1).searchStickers(false, str, this.f28633a, new ei.oc(this, z10, runnable, 2), z10);
    }

    @Override
    public final void e() {
        if (a()) {
            return;
        }
        this.f28640w.Q.G0.e(true);
        Utilities.raceCallbacks(new hq(this, 16), new lz(this, 0));
    }

    @Override
    public final void run() {
        oz ozVar = this.f28640w;
        tz tzVar = ozVar.Q;
        if (TextUtils.isEmpty(ozVar.N)) {
            s4.g0 adapter = tzVar.D0.getAdapter();
            kz kzVar = tzVar.f30797y0;
            if (adapter != kzVar) {
                tzVar.D0.setAdapter(kzVar);
            }
            ozVar.l();
            return;
        }
        int i10 = ozVar.M + 1;
        ozVar.M = i10;
        this.f28634b = i10;
        this.f28633a = ozVar.N;
        ozVar.f29166y = false;
        this.f28635c.clear();
        this.d.clear();
        this.e.clear();
        this.f28636f.clear();
        this.h.clear();
        this.f28638r.clear();
        this.f28639s.clear();
        this.v.clear();
        tzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f28633a)) {
            Utilities.raceCallbacks(new hq(this, 16), new lz(this, 1));
        } else {
            Utilities.raceCallbacks(new hq(this, 16), new lz(this, 2), new lz(this, 3), new lz(this, 4), new lz(this, 5), new lz(this, 6), new lz(this, 7));
        }
    }
}
