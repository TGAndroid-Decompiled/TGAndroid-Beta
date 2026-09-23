package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
public final class ez implements zy {
    public String f23768a;
    public int f23769b;
    public final ArrayList f23770c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f23771f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f23772n = new ArrayList();
    public final ArrayList f23773r = new ArrayList(0);
    public final ArrayList f23774s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);
    public final gz f23775w;

    public ez(gz gzVar) {
        this.f23775w = gzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String str;
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        if (currentKeyboardLanguage != null && currentKeyboardLanguage.length != 0) {
            str = currentKeyboardLanguage[0];
        } else {
            str = "";
        }
        MediaDataController.getInstance(this.f23775w.Q.f25968c1).searchStickers(false, str, this.f23768a, new ci.ed(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        ww wwVar = this.f23775w.Q.G0;
        if (wwVar.F) {
            return;
        }
        wwVar.e(true);
        Utilities.raceCallbacks(new yp(this, 16), new dz(this, 0));
    }

    @Override
    public final void run() {
        gz gzVar = this.f23775w;
        lz lzVar = gzVar.Q;
        if (TextUtils.isEmpty(gzVar.N)) {
            s4.h0 adapter = lzVar.D0.getAdapter();
            cz czVar = lzVar.f26038y0;
            if (adapter != czVar) {
                lzVar.D0.setAdapter(czVar);
            }
            gzVar.l();
            return;
        }
        int i10 = gzVar.M + 1;
        gzVar.M = i10;
        this.f23769b = i10;
        this.f23768a = gzVar.N;
        gzVar.f24459y = false;
        this.f23770c.clear();
        this.d.clear();
        this.e.clear();
        this.f23771f.clear();
        this.h.clear();
        this.f23773r.clear();
        this.f23774s.clear();
        this.v.clear();
        lzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.f23768a)) {
            Utilities.raceCallbacks(new yp(this, 16), new dz(this, 1));
        } else {
            Utilities.raceCallbacks(new yp(this, 16), new dz(this, 2), new dz(this, 3), new dz(this, 4), new dz(this, 5), new dz(this, 6), new dz(this, 7));
        }
    }
}
