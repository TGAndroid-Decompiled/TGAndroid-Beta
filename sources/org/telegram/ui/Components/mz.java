package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class mz implements hz {
    public String f28628a;
    public int f28629b;
    public final ArrayList f28630c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f28631f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f28632n = new ArrayList();
    public final ArrayList f28633r = new ArrayList(0);
    public final ArrayList f28634s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final oz f28635w;

    public mz(oz ozVar) {
        this.f28635w = ozVar;
    }

    public final boolean a() {
        return this.f28635w.Q.G0.F;
    }

    public final void b(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f28635w.Q.f30722c1).searchStickers(false, str, this.f28628a, new ei.oc(this, z10, runnable, 2), z10);
    }

    @Override
    public final void e() {
        if (a()) {
            return;
        }
        this.f28635w.Q.G0.e(true);
        Utilities.raceCallbacks(new hq(this, 16), new lz(this, 0));
    }

    @Override
    public final void run() {
        oz ozVar = this.f28635w;
        tz tzVar = ozVar.Q;
        if (TextUtils.isEmpty(ozVar.N)) {
            s4.g0 adapter = tzVar.D0.getAdapter();
            kz kzVar = tzVar.f30792y0;
            if (adapter != kzVar) {
                tzVar.D0.setAdapter(kzVar);
            }
            ozVar.l();
            return;
        }
        int i10 = ozVar.M + 1;
        ozVar.M = i10;
        this.f28629b = i10;
        this.f28628a = ozVar.N;
        ozVar.f29161y = false;
        this.f28630c.clear();
        this.d.clear();
        this.e.clear();
        this.f28631f.clear();
        this.h.clear();
        this.f28633r.clear();
        this.f28634s.clear();
        this.v.clear();
        tzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f28628a)) {
            Utilities.raceCallbacks(new hq(this, 16), new lz(this, 1));
        } else {
            Utilities.raceCallbacks(new hq(this, 16), new lz(this, 2), new lz(this, 3), new lz(this, 4), new lz(this, 5), new lz(this, 6), new lz(this, 7));
        }
    }
}
