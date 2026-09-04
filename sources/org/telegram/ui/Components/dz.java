package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class dz implements yy {
    public String f25482a;
    public int f25483b;
    public final ArrayList f25484c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f25485e = new HashMap();
    public final HashMap f25486f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f25487n = new ArrayList();
    public final ArrayList f25488r = new ArrayList(0);
    public final ArrayList f25489s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final fz f25490w;

    public dz(fz fzVar) {
        this.f25490w = fzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f25490w.Q.f27932c1).searchStickers(false, str, this.f25482a, new di.hd(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        ww wwVar = this.f25490w.Q.G0;
        if (wwVar.F) {
            return;
        }
        wwVar.e(true);
        Utilities.raceCallbacks(new wp(this, 16), new cz(this, 0));
    }

    @Override
    public final void run() {
        fz fzVar = this.f25490w;
        kz kzVar = fzVar.Q;
        if (TextUtils.isEmpty(fzVar.N)) {
            s4.h0 adapter = kzVar.D0.getAdapter();
            bz bzVar = kzVar.f28003y0;
            if (adapter != bzVar) {
                kzVar.D0.setAdapter(bzVar);
            }
            fzVar.l();
            return;
        }
        int i10 = fzVar.M + 1;
        fzVar.M = i10;
        this.f25483b = i10;
        this.f25482a = fzVar.N;
        fzVar.f26210y = false;
        this.f25484c.clear();
        this.d.clear();
        this.f25485e.clear();
        this.f25486f.clear();
        this.h.clear();
        this.f25488r.clear();
        this.f25489s.clear();
        this.v.clear();
        kzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f25482a)) {
            Utilities.raceCallbacks(new wp(this, 16), new cz(this, 1));
        } else {
            Utilities.raceCallbacks(new wp(this, 16), new cz(this, 2), new cz(this, 3), new cz(this, 4), new cz(this, 5), new cz(this, 6), new cz(this, 7));
        }
    }
}
