package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class mz implements hz {
    public String f28783a;
    public int f28784b;
    public final ArrayList f28785c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f28786f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f28787n = new ArrayList();
    public final ArrayList f28788r = new ArrayList(0);
    public final ArrayList f28789s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final oz f28790w;

    public mz(oz ozVar) {
        this.f28790w = ozVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f28790w.Q.f30966c1).searchStickers(false, str, this.f28783a, new ei.oc(this, z10, runnable, 2), z10);
    }

    @Override
    public final void e() {
        dx dxVar = this.f28790w.Q.G0;
        if (dxVar.F) {
            return;
        }
        dxVar.e(true);
        Utilities.raceCallbacks(new zp(this, 17), new lz(this, 0));
    }

    @Override
    public final void run() {
        oz ozVar = this.f28790w;
        tz tzVar = ozVar.Q;
        if (TextUtils.isEmpty(ozVar.N)) {
            s4.g0 adapter = tzVar.D0.getAdapter();
            kz kzVar = tzVar.f31036y0;
            if (adapter != kzVar) {
                tzVar.D0.setAdapter(kzVar);
            }
            ozVar.l();
            return;
        }
        int i10 = ozVar.M + 1;
        ozVar.M = i10;
        this.f28784b = i10;
        this.f28783a = ozVar.N;
        ozVar.f29367y = false;
        this.f28785c.clear();
        this.d.clear();
        this.e.clear();
        this.f28786f.clear();
        this.h.clear();
        this.f28788r.clear();
        this.f28789s.clear();
        this.v.clear();
        tzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f28783a)) {
            Utilities.raceCallbacks(new zp(this, 17), new lz(this, 1));
        } else {
            Utilities.raceCallbacks(new zp(this, 17), new lz(this, 2), new lz(this, 3), new lz(this, 4), new lz(this, 5), new lz(this, 6), new lz(this, 7));
        }
    }
}
