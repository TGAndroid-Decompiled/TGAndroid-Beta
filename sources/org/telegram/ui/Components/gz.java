package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class gz implements bz {
    public String f24687a;
    public int f24688b;
    public final ArrayList f24689c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f24690f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f24691n = new ArrayList();
    public final ArrayList f24692r = new ArrayList(0);
    public final ArrayList f24693s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final iz f24694w;

    public gz(iz izVar) {
        this.f24694w = izVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f24694w.Q.f26818c1).searchStickers(false, str, this.f24687a, new ci.ed(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        zw zwVar = this.f24694w.Q.G0;
        if (zwVar.F) {
            return;
        }
        zwVar.e(true);
        Utilities.raceCallbacks(new aq(this, 16), new fz(this, 0));
    }

    @Override
    public final void run() {
        iz izVar = this.f24694w;
        nz nzVar = izVar.Q;
        if (TextUtils.isEmpty(izVar.N)) {
            s4.h0 adapter = nzVar.D0.getAdapter();
            ez ezVar = nzVar.f26888y0;
            if (adapter != ezVar) {
                nzVar.D0.setAdapter(ezVar);
            }
            izVar.l();
            return;
        }
        int i10 = izVar.M + 1;
        izVar.M = i10;
        this.f24688b = i10;
        this.f24687a = izVar.N;
        izVar.f25246y = false;
        this.f24689c.clear();
        this.d.clear();
        this.e.clear();
        this.f24690f.clear();
        this.h.clear();
        this.f24692r.clear();
        this.f24693s.clear();
        this.v.clear();
        nzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f24687a)) {
            Utilities.raceCallbacks(new aq(this, 16), new fz(this, 1));
        } else {
            Utilities.raceCallbacks(new aq(this, 16), new fz(this, 2), new fz(this, 3), new fz(this, 4), new fz(this, 5), new fz(this, 6), new fz(this, 7));
        }
    }
}
