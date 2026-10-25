package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class lz implements gz {
    public String f30326a;
    public int f30327b;
    public final ArrayList f30328c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f30329f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f30330n = new ArrayList();
    public final ArrayList f30331r = new ArrayList(0);
    public final ArrayList f30332s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final nz f30333w;

    public lz(nz nzVar) {
        this.f30333w = nzVar;
    }

    public final boolean a() {
        return this.f30333w.Q.G0.F;
    }

    public final void b(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f30333w.Q.f32716c1).searchStickers(false, str, this.f30326a, new fi.kc(this, z10, runnable, 2), z10);
    }

    @Override
    public final void e() {
        if (a()) {
            return;
        }
        this.f30333w.Q.G0.e(true);
        Utilities.raceCallbacks(new bq(this, 17), new kz(this, 0));
    }

    @Override
    public final void run() {
        nz nzVar = this.f30333w;
        sz szVar = nzVar.Q;
        if (TextUtils.isEmpty(nzVar.N)) {
            s4.h0 adapter = szVar.D0.getAdapter();
            jz jzVar = szVar.f32786y0;
            if (adapter != jzVar) {
                szVar.D0.setAdapter(jzVar);
            }
            nzVar.l();
            return;
        }
        int i10 = nzVar.M + 1;
        nzVar.M = i10;
        this.f30327b = i10;
        this.f30326a = nzVar.N;
        nzVar.f31099y = false;
        this.f30328c.clear();
        this.d.clear();
        this.e.clear();
        this.f30329f.clear();
        this.h.clear();
        this.f30331r.clear();
        this.f30332s.clear();
        this.v.clear();
        szVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f30326a)) {
            Utilities.raceCallbacks(new bq(this, 17), new kz(this, 1));
        } else {
            Utilities.raceCallbacks(new bq(this, 17), new kz(this, 2), new kz(this, 3), new kz(this, 4), new kz(this, 5), new kz(this, 6), new kz(this, 7));
        }
    }
}
