package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class dz implements yy {
    public String f23704a;
    public int f23705b;
    public final ArrayList f23706c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f23707f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f23708n = new ArrayList();
    public final ArrayList f23709r = new ArrayList(0);
    public final ArrayList f23710s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final fz f23711w;

    public dz(fz fzVar) {
        this.f23711w = fzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f23711w.Q.f25892c1).searchStickers(false, str, this.f23704a, new ci.hd(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        ww wwVar = this.f23711w.Q.G0;
        if (wwVar.F) {
            return;
        }
        wwVar.e(true);
        Utilities.raceCallbacks(new xp(this, 16), new cz(this, 0));
    }

    @Override
    public final void run() {
        fz fzVar = this.f23711w;
        kz kzVar = fzVar.Q;
        if (TextUtils.isEmpty(fzVar.N)) {
            s4.h0 adapter = kzVar.D0.getAdapter();
            bz bzVar = kzVar.f25962y0;
            if (adapter != bzVar) {
                kzVar.D0.setAdapter(bzVar);
            }
            fzVar.l();
            return;
        }
        int i10 = fzVar.M + 1;
        fzVar.M = i10;
        this.f23705b = i10;
        this.f23704a = fzVar.N;
        fzVar.f24259y = false;
        this.f23706c.clear();
        this.d.clear();
        this.e.clear();
        this.f23707f.clear();
        this.h.clear();
        this.f23709r.clear();
        this.f23710s.clear();
        this.v.clear();
        kzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f23704a)) {
            Utilities.raceCallbacks(new xp(this, 16), new cz(this, 1));
        } else {
            Utilities.raceCallbacks(new xp(this, 16), new cz(this, 2), new cz(this, 3), new cz(this, 4), new cz(this, 5), new cz(this, 6), new cz(this, 7));
        }
    }
}
