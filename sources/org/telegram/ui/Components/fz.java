package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class fz implements az {
    public String f24396a;
    public int f24397b;
    public final ArrayList f24398c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f24399f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f24400n = new ArrayList();
    public final ArrayList f24401r = new ArrayList(0);
    public final ArrayList f24402s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final hz f24403w;

    public fz(hz hzVar) {
        this.f24403w = hzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f24403w.Q.f26574c1).searchStickers(false, str, this.f24396a, new ci.dd(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        xw xwVar = this.f24403w.Q.G0;
        if (xwVar.F) {
            return;
        }
        xwVar.e(true);
        Utilities.raceCallbacks(new zp(this, 16), new ez(this, 0));
    }

    @Override
    public final void run() {
        hz hzVar = this.f24403w;
        mz mzVar = hzVar.Q;
        if (TextUtils.isEmpty(hzVar.N)) {
            s4.h0 adapter = mzVar.D0.getAdapter();
            dz dzVar = mzVar.f26644y0;
            if (adapter != dzVar) {
                mzVar.D0.setAdapter(dzVar);
            }
            hzVar.l();
            return;
        }
        int i10 = hzVar.M + 1;
        hzVar.M = i10;
        this.f24397b = i10;
        this.f24396a = hzVar.N;
        hzVar.f24966y = false;
        this.f24398c.clear();
        this.d.clear();
        this.e.clear();
        this.f24399f.clear();
        this.h.clear();
        this.f24401r.clear();
        this.f24402s.clear();
        this.v.clear();
        mzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f24396a)) {
            Utilities.raceCallbacks(new zp(this, 16), new ez(this, 1));
        } else {
            Utilities.raceCallbacks(new zp(this, 16), new ez(this, 2), new ez(this, 3), new ez(this, 4), new ez(this, 5), new ez(this, 6), new ez(this, 7));
        }
    }
}
