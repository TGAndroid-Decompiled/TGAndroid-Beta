package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class yy implements sy {
    public String f35149a;
    public int f35150b;
    public final ArrayList f35151c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f35152e = new HashMap();
    public final HashMap f35153f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f35154n = new ArrayList();
    public final ArrayList f35155r = new ArrayList(0);
    public final ArrayList f35156s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final az f35157w;

    public yy(az azVar) {
        this.f35157w = azVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f35157w.M.Y0).searchStickers(false, str, this.f35149a, new nh.yb(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        ow owVar = this.f35157w.M.C0;
        if (owVar.B) {
            return;
        }
        owVar.e(true);
        Utilities.raceCallbacks(new rp(this, 16), new xy(this, 0));
    }

    @Override
    public final void run() {
        az azVar = this.f35157w;
        fz fzVar = azVar.M;
        if (TextUtils.isEmpty(azVar.J)) {
            f2.p0 adapter = fzVar.f28657z0.getAdapter();
            wy wyVar = fzVar.f28639u0;
            if (adapter != wyVar) {
                fzVar.f28657z0.setAdapter(wyVar);
            }
            azVar.l();
            return;
        }
        int i10 = azVar.I + 1;
        azVar.I = i10;
        this.f35150b = i10;
        this.f35149a = azVar.J;
        azVar.f26921y = false;
        this.f35151c.clear();
        this.d.clear();
        this.f35152e.clear();
        this.f35153f.clear();
        this.h.clear();
        this.f35155r.clear();
        this.f35156s.clear();
        this.v.clear();
        fzVar.C0.e(true);
        if ("premium".equalsIgnoreCase(this.f35149a)) {
            Utilities.raceCallbacks(new rp(this, 16), new xy(this, 1));
        } else {
            Utilities.raceCallbacks(new rp(this, 16), new xy(this, 2), new xy(this, 3), new xy(this, 4), new xy(this, 5), new xy(this, 6), new xy(this, 7));
        }
    }
}
