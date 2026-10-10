package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class uz implements oz {
    public String f31669a;
    public int f31670b;
    public final ArrayList f31671c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f31672e = new HashMap();
    public final HashMap f31673f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f31674n = new ArrayList();
    public final ArrayList f31675r = new ArrayList(0);
    public final ArrayList f31676s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final wz f31677w;

    public uz(wz wzVar) {
        this.f31677w = wzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f31677w.Q.f24689c1).searchStickers(false, str, this.f31669a, new ci.ed(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        mx mxVar = this.f31677w.Q.G0;
        if (mxVar.F) {
            return;
        }
        mxVar.e(true);
        Utilities.raceCallbacks(new nq(this, 16), new tz(this, 0));
    }

    @Override
    public final void run() {
        wz wzVar = this.f31677w;
        b00 b00Var = wzVar.Q;
        if (TextUtils.isEmpty(wzVar.N)) {
            s4.i0 adapter = b00Var.D0.getAdapter();
            rz rzVar = b00Var.f24760y0;
            if (adapter != rzVar) {
                b00Var.D0.setAdapter(rzVar);
            }
            wzVar.l();
            return;
        }
        int i10 = wzVar.M + 1;
        wzVar.M = i10;
        this.f31670b = i10;
        this.f31669a = wzVar.N;
        wzVar.f32789y = false;
        this.f31671c.clear();
        this.d.clear();
        this.f31672e.clear();
        this.f31673f.clear();
        this.h.clear();
        this.f31675r.clear();
        this.f31676s.clear();
        this.v.clear();
        b00Var.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f31669a)) {
            Utilities.raceCallbacks(new nq(this, 16), new tz(this, 1));
        } else {
            Utilities.raceCallbacks(new nq(this, 16), new tz(this, 2), new tz(this, 3), new tz(this, 4), new tz(this, 5), new tz(this, 6), new tz(this, 7));
        }
    }
}
