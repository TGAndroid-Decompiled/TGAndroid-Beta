package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class py implements ky {
    public String f31770a;
    public int f31771b;
    public final ArrayList f31772c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap f31773e = new HashMap();
    public final HashMap f31774f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f31775n = new ArrayList();
    public final ArrayList f31776r = new ArrayList(0);
    public final ArrayList f31777s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final ry f31778w;

    public py(ry ryVar) {
        this.f31778w = ryVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f31778w.M.Y0).searchStickers(false, str, this.f31770a, new kh.oc(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        iw iwVar = this.f31778w.M.C0;
        if (iwVar.B) {
            return;
        }
        iwVar.e(true);
        Utilities.raceCallbacks(new np(this, 16), new oy(this, 0));
    }

    @Override
    public final void run() {
        ry ryVar = this.f31778w;
        wy wyVar = ryVar.M;
        if (TextUtils.isEmpty(ryVar.J)) {
            f2.r0 adapter = wyVar.f34466z0.getAdapter();
            ny nyVar = wyVar.f34448u0;
            if (adapter != nyVar) {
                wyVar.f34466z0.setAdapter(nyVar);
            }
            ryVar.l();
            return;
        }
        int i9 = ryVar.I + 1;
        ryVar.I = i9;
        this.f31771b = i9;
        this.f31770a = ryVar.J;
        ryVar.f32309y = false;
        this.f31772c.clear();
        this.d.clear();
        this.f31773e.clear();
        this.f31774f.clear();
        this.h.clear();
        this.f31776r.clear();
        this.f31777s.clear();
        this.v.clear();
        wyVar.C0.e(true);
        if ("premium".equalsIgnoreCase(this.f31770a)) {
            Utilities.raceCallbacks(new np(this, 16), new oy(this, 1));
        } else {
            Utilities.raceCallbacks(new np(this, 16), new oy(this, 2), new oy(this, 3), new oy(this, 4), new oy(this, 5), new oy(this, 6), new oy(this, 7));
        }
    }
}
