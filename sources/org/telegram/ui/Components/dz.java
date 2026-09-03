package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class dz implements xy {
    public String f24397a;
    public int f24398b;
    public final ArrayList f24399c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f24400f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f24401n = new ArrayList();
    public final ArrayList f24402r = new ArrayList(0);
    public final ArrayList f24403s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final fz f24404w;

    public dz(fz fzVar) {
        this.f24404w = fzVar;
    }

    public final void a(Runnable runnable, boolean z4) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f24404w.N.Z0).searchStickers(false, str, this.f24397a, new kl(this, z4, runnable, 1), z4);
    }

    @Override
    public final void d() {
        sw swVar = this.f24404w.N.D0;
        if (swVar.C) {
            return;
        }
        swVar.e(true);
        Utilities.raceCallbacks(new up(this, 16), new cz(this, 0));
    }

    @Override
    public final void run() {
        fz fzVar = this.f24404w;
        kz kzVar = fzVar.N;
        if (TextUtils.isEmpty(fzVar.K)) {
            f2.o0 adapter = kzVar.A0.getAdapter();
            bz bzVar = kzVar.f26488v0;
            if (adapter != bzVar) {
                kzVar.A0.setAdapter(bzVar);
            }
            fzVar.l();
            return;
        }
        int i10 = fzVar.J + 1;
        fzVar.J = i10;
        this.f24398b = i10;
        this.f24397a = fzVar.K;
        fzVar.f25005y = false;
        this.f24399c.clear();
        this.d.clear();
        this.e.clear();
        this.f24400f.clear();
        this.h.clear();
        this.f24402r.clear();
        this.f24403s.clear();
        this.v.clear();
        kzVar.D0.e(true);
        if ("premium".equalsIgnoreCase(this.f24397a)) {
            Utilities.raceCallbacks(new up(this, 16), new cz(this, 1));
        } else {
            Utilities.raceCallbacks(new up(this, 16), new cz(this, 2), new cz(this, 3), new cz(this, 4), new cz(this, 5), new cz(this, 6), new cz(this, 7));
        }
    }
}
