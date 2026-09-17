package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class dz implements yy {
    public String f25483a;
    public int f25484b;
    public final ArrayList f25485c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f25486e = new HashMap();
    public final HashMap f25487f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f25488n = new ArrayList();
    public final ArrayList f25489r = new ArrayList(0);
    public final ArrayList f25490s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final fz f25491w;

    public dz(fz fzVar) {
        this.f25491w = fzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f25491w.Q.f27933c1).searchStickers(false, str, this.f25483a, new di.hd(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        ww wwVar = this.f25491w.Q.G0;
        if (wwVar.F) {
            return;
        }
        wwVar.e(true);
        Utilities.raceCallbacks(new wp(this, 16), new cz(this, 0));
    }

    @Override
    public final void run() {
        fz fzVar = this.f25491w;
        kz kzVar = fzVar.Q;
        if (TextUtils.isEmpty(fzVar.N)) {
            s4.h0 adapter = kzVar.D0.getAdapter();
            bz bzVar = kzVar.f28004y0;
            if (adapter != bzVar) {
                kzVar.D0.setAdapter(bzVar);
            }
            fzVar.l();
            return;
        }
        int i10 = fzVar.M + 1;
        fzVar.M = i10;
        this.f25484b = i10;
        this.f25483a = fzVar.N;
        fzVar.f26211y = false;
        this.f25485c.clear();
        this.d.clear();
        this.f25486e.clear();
        this.f25487f.clear();
        this.h.clear();
        this.f25489r.clear();
        this.f25490s.clear();
        this.v.clear();
        kzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f25483a)) {
            Utilities.raceCallbacks(new wp(this, 16), new cz(this, 1));
        } else {
            Utilities.raceCallbacks(new wp(this, 16), new cz(this, 2), new cz(this, 3), new cz(this, 4), new cz(this, 5), new cz(this, 6), new cz(this, 7));
        }
    }
}
