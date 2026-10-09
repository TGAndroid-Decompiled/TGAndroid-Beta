package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class tz implements nz {
    public String f31310a;
    public int f31311b;
    public final ArrayList f31312c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f31313e = new HashMap();
    public final HashMap f31314f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f31315n = new ArrayList();
    public final ArrayList f31316r = new ArrayList(0);
    public final ArrayList f31317s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final vz f31318w;

    public tz(vz vzVar) {
        this.f31318w = vzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f31318w.Q.f24401c1).searchStickers(false, str, this.f31310a, new ci.ed(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        lx lxVar = this.f31318w.Q.G0;
        if (lxVar.F) {
            return;
        }
        lxVar.e(true);
        Utilities.raceCallbacks(new nq(this, 16), new sz(this, 0));
    }

    @Override
    public final void run() {
        vz vzVar = this.f31318w;
        a00 a00Var = vzVar.Q;
        if (TextUtils.isEmpty(vzVar.N)) {
            s4.i0 adapter = a00Var.D0.getAdapter();
            qz qzVar = a00Var.f24472y0;
            if (adapter != qzVar) {
                a00Var.D0.setAdapter(qzVar);
            }
            vzVar.l();
            return;
        }
        int i10 = vzVar.M + 1;
        vzVar.M = i10;
        this.f31311b = i10;
        this.f31310a = vzVar.N;
        vzVar.f32485y = false;
        this.f31312c.clear();
        this.d.clear();
        this.f31313e.clear();
        this.f31314f.clear();
        this.h.clear();
        this.f31316r.clear();
        this.f31317s.clear();
        this.v.clear();
        a00Var.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f31310a)) {
            Utilities.raceCallbacks(new nq(this, 16), new sz(this, 1));
        } else {
            Utilities.raceCallbacks(new nq(this, 16), new sz(this, 2), new sz(this, 3), new sz(this, 4), new sz(this, 5), new sz(this, 6), new sz(this, 7));
        }
    }
}
