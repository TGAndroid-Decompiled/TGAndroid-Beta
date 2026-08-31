package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class fz implements zy {
    public String f27040a;
    public int f27041b;
    public final ArrayList f27042c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f27043e = new HashMap();
    public final HashMap f27044f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f27045n = new ArrayList();
    public final ArrayList f27046r = new ArrayList(0);
    public final ArrayList f27047s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final hz f27048w;

    public fz(hz hzVar) {
        this.f27048w = hzVar;
    }

    public final void a(Runnable runnable, boolean z4) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f27048w.N.Z0).searchStickers(false, str, this.f27040a, new ml(this, z4, runnable, 1), z4);
    }

    @Override
    public final void d() {
        uw uwVar = this.f27048w.N.D0;
        if (uwVar.C) {
            return;
        }
        uwVar.e(true);
        Utilities.raceCallbacks(new xp(this, 16), new ez(this, 0));
    }

    @Override
    public final void run() {
        hz hzVar = this.f27048w;
        mz mzVar = hzVar.N;
        if (TextUtils.isEmpty(hzVar.K)) {
            f2.p0 adapter = mzVar.A0.getAdapter();
            dz dzVar = mzVar.f29331v0;
            if (adapter != dzVar) {
                mzVar.A0.setAdapter(dzVar);
            }
            hzVar.l();
            return;
        }
        int i10 = hzVar.J + 1;
        hzVar.J = i10;
        this.f27041b = i10;
        this.f27040a = hzVar.K;
        hzVar.f27611y = false;
        this.f27042c.clear();
        this.d.clear();
        this.f27043e.clear();
        this.f27044f.clear();
        this.h.clear();
        this.f27046r.clear();
        this.f27047s.clear();
        this.v.clear();
        mzVar.D0.e(true);
        if ("premium".equalsIgnoreCase(this.f27040a)) {
            Utilities.raceCallbacks(new xp(this, 16), new ez(this, 1));
        } else {
            Utilities.raceCallbacks(new xp(this, 16), new ez(this, 2), new ez(this, 3), new ez(this, 4), new ez(this, 5), new ez(this, 6), new ez(this, 7));
        }
    }
}
