package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class uz implements oz {
    public String f31611a;
    public int f31612b;
    public final ArrayList f31613c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f31614e = new HashMap();
    public final HashMap f31615f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f31616n = new ArrayList();
    public final ArrayList f31617r = new ArrayList(0);
    public final ArrayList f31618s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final wz f31619w;

    public uz(wz wzVar) {
        this.f31619w = wzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f31619w.Q.f24662c1).searchStickers(false, str, this.f31611a, new ci.ed(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        mx mxVar = this.f31619w.Q.G0;
        if (mxVar.F) {
            return;
        }
        mxVar.e(true);
        Utilities.raceCallbacks(new nq(this, 16), new tz(this, 0));
    }

    @Override
    public final void run() {
        wz wzVar = this.f31619w;
        b00 b00Var = wzVar.Q;
        if (TextUtils.isEmpty(wzVar.N)) {
            s4.i0 adapter = b00Var.D0.getAdapter();
            rz rzVar = b00Var.f24733y0;
            if (adapter != rzVar) {
                b00Var.D0.setAdapter(rzVar);
            }
            wzVar.l();
            return;
        }
        int i10 = wzVar.M + 1;
        wzVar.M = i10;
        this.f31612b = i10;
        this.f31611a = wzVar.N;
        wzVar.f32770y = false;
        this.f31613c.clear();
        this.d.clear();
        this.f31614e.clear();
        this.f31615f.clear();
        this.h.clear();
        this.f31617r.clear();
        this.f31618s.clear();
        this.v.clear();
        b00Var.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f31611a)) {
            Utilities.raceCallbacks(new nq(this, 16), new tz(this, 1));
        } else {
            Utilities.raceCallbacks(new nq(this, 16), new tz(this, 2), new tz(this, 3), new tz(this, 4), new tz(this, 5), new tz(this, 6), new tz(this, 7));
        }
    }
}
