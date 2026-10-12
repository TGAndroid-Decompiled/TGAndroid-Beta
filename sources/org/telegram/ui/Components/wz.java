package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class wz implements qz {
    public String f32581a;
    public int f32582b;
    public final ArrayList f32583c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f32584e = new HashMap();
    public final HashMap f32585f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f32586n = new ArrayList();
    public final ArrayList f32587r = new ArrayList(0);
    public final ArrayList f32588s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final yz f32589w;

    public wz(yz yzVar) {
        this.f32589w = yzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f32589w.Q.f25072c1).searchStickers(false, str, this.f32581a, new ci.ed(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        ox oxVar = this.f32589w.Q.G0;
        if (oxVar.F) {
            return;
        }
        oxVar.e(true);
        Utilities.raceCallbacks(new pq(this, 16), new vz(this, 0));
    }

    @Override
    public final void run() {
        yz yzVar = this.f32589w;
        d00 d00Var = yzVar.Q;
        if (TextUtils.isEmpty(yzVar.N)) {
            s4.i0 adapter = d00Var.D0.getAdapter();
            tz tzVar = d00Var.f25143y0;
            if (adapter != tzVar) {
                d00Var.D0.setAdapter(tzVar);
            }
            yzVar.l();
            return;
        }
        int i10 = yzVar.M + 1;
        yzVar.M = i10;
        this.f32582b = i10;
        this.f32581a = yzVar.N;
        yzVar.f33236y = false;
        this.f32583c.clear();
        this.d.clear();
        this.f32584e.clear();
        this.f32585f.clear();
        this.h.clear();
        this.f32587r.clear();
        this.f32588s.clear();
        this.v.clear();
        d00Var.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f32581a)) {
            Utilities.raceCallbacks(new pq(this, 16), new vz(this, 1));
        } else {
            Utilities.raceCallbacks(new pq(this, 16), new vz(this, 2), new vz(this, 3), new vz(this, 4), new vz(this, 5), new vz(this, 6), new vz(this, 7));
        }
    }
}
