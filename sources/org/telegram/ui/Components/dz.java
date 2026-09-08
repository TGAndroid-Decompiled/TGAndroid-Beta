package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class dz implements yy {
    public String f25509a;
    public int f25510b;
    public final ArrayList f25511c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f25512e = new HashMap();
    public final HashMap f25513f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f25514n = new ArrayList();
    public final ArrayList f25515r = new ArrayList(0);
    public final ArrayList f25516s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final fz f25517w;

    public dz(fz fzVar) {
        this.f25517w = fzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f25517w.Q.f27959c1).searchStickers(false, str, this.f25509a, new di.hd(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        ww wwVar = this.f25517w.Q.G0;
        if (wwVar.F) {
            return;
        }
        wwVar.e(true);
        Utilities.raceCallbacks(new wp(this, 16), new cz(this, 0));
    }

    @Override
    public final void run() {
        fz fzVar = this.f25517w;
        kz kzVar = fzVar.Q;
        if (TextUtils.isEmpty(fzVar.N)) {
            s4.h0 adapter = kzVar.D0.getAdapter();
            bz bzVar = kzVar.f28030y0;
            if (adapter != bzVar) {
                kzVar.D0.setAdapter(bzVar);
            }
            fzVar.l();
            return;
        }
        int i10 = fzVar.M + 1;
        fzVar.M = i10;
        this.f25510b = i10;
        this.f25509a = fzVar.N;
        fzVar.f26237y = false;
        this.f25511c.clear();
        this.d.clear();
        this.f25512e.clear();
        this.f25513f.clear();
        this.h.clear();
        this.f25515r.clear();
        this.f25516s.clear();
        this.v.clear();
        kzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f25509a)) {
            Utilities.raceCallbacks(new wp(this, 16), new cz(this, 1));
        } else {
            Utilities.raceCallbacks(new wp(this, 16), new cz(this, 2), new cz(this, 3), new cz(this, 4), new cz(this, 5), new cz(this, 6), new cz(this, 7));
        }
    }
}
