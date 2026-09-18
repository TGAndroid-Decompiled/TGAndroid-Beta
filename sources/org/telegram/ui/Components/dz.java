package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class dz implements yy {
    public String f23408a;
    public int f23409b;
    public final ArrayList f23410c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f23411f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f23412n = new ArrayList();
    public final ArrayList f23413r = new ArrayList(0);
    public final ArrayList f23414s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final fz f23415w;

    public dz(fz fzVar) {
        this.f23415w = fzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f23415w.Q.f25716c1).searchStickers(false, str, this.f23408a, new ci.hd(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        vw vwVar = this.f23415w.Q.G0;
        if (vwVar.F) {
            return;
        }
        vwVar.e(true);
        Utilities.raceCallbacks(new xp(this, 16), new cz(this, 0));
    }

    @Override
    public final void run() {
        fz fzVar = this.f23415w;
        kz kzVar = fzVar.Q;
        if (TextUtils.isEmpty(fzVar.N)) {
            s4.h0 adapter = kzVar.D0.getAdapter();
            bz bzVar = kzVar.f25786y0;
            if (adapter != bzVar) {
                kzVar.D0.setAdapter(bzVar);
            }
            fzVar.l();
            return;
        }
        int i10 = fzVar.M + 1;
        fzVar.M = i10;
        this.f23409b = i10;
        this.f23408a = fzVar.N;
        fzVar.f24041y = false;
        this.f23410c.clear();
        this.d.clear();
        this.e.clear();
        this.f23411f.clear();
        this.h.clear();
        this.f23413r.clear();
        this.f23414s.clear();
        this.v.clear();
        kzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f23408a)) {
            Utilities.raceCallbacks(new xp(this, 16), new cz(this, 1));
        } else {
            Utilities.raceCallbacks(new xp(this, 16), new cz(this, 2), new cz(this, 3), new cz(this, 4), new cz(this, 5), new cz(this, 6), new cz(this, 7));
        }
    }
}
