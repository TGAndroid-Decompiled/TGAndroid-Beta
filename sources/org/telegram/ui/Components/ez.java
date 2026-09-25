package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class ez implements zy {
    public String f24015a;
    public int f24016b;
    public final ArrayList f24017c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f24018f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f24019n = new ArrayList();
    public final ArrayList f24020r = new ArrayList(0);
    public final ArrayList f24021s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final gz f24022w;

    public ez(gz gzVar) {
        this.f24022w = gzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f24022w.Q.f26237c1).searchStickers(false, str, this.f24015a, new ci.ed(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        xw xwVar = this.f24022w.Q.G0;
        if (xwVar.F) {
            return;
        }
        xwVar.e(true);
        Utilities.raceCallbacks(new yp(this, 16), new dz(this, 0));
    }

    @Override
    public final void run() {
        gz gzVar = this.f24022w;
        lz lzVar = gzVar.Q;
        if (TextUtils.isEmpty(gzVar.N)) {
            s4.h0 adapter = lzVar.D0.getAdapter();
            cz czVar = lzVar.f26307y0;
            if (adapter != czVar) {
                lzVar.D0.setAdapter(czVar);
            }
            gzVar.l();
            return;
        }
        int i10 = gzVar.M + 1;
        gzVar.M = i10;
        this.f24016b = i10;
        this.f24015a = gzVar.N;
        gzVar.f24577y = false;
        this.f24017c.clear();
        this.d.clear();
        this.e.clear();
        this.f24018f.clear();
        this.h.clear();
        this.f24020r.clear();
        this.f24021s.clear();
        this.v.clear();
        lzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f24015a)) {
            Utilities.raceCallbacks(new yp(this, 16), new dz(this, 1));
        } else {
            Utilities.raceCallbacks(new yp(this, 16), new dz(this, 2), new dz(this, 3), new dz(this, 4), new dz(this, 5), new dz(this, 6), new dz(this, 7));
        }
    }
}
