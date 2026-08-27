package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;

public final class ry implements ly {

    public String f32269a;

    public int f32270b;

    public final ArrayList f32271c = new ArrayList();
    public final HashMap d = new HashMap();

    public final HashMap f32272e = new HashMap();

    public final HashMap f32273f = new HashMap();
    public final ArrayList h = new ArrayList();

    public final ArrayList f32274n = new ArrayList();

    public final ArrayList f32275r = new ArrayList(0);

    public final ArrayList f32276s = new ArrayList(0);
    public final LongSparseArray v = new LongSparseArray(0);

    public final ty f32277w;

    public ry(ty tyVar) {
        this.f32277w = tyVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        MediaDataController.getInstance(this.f32277w.M.Y0).searchStickers(false, (currentKeyboardLanguage == null || currentKeyboardLanguage.length == 0) ? "" : currentKeyboardLanguage[0], this.f32269a, new lh.kc(this, z10, runnable, 2), z10);
    }

    @Override
    public final void d() {
        hw hwVar = this.f32277w.M.C0;
        if (hwVar.B) {
            return;
        }
        hwVar.e(true);
        Utilities.raceCallbacks(new lp(this, 16), new qy(this, 0));
    }

    @Override
    public final void run() {
        ty tyVar = this.f32277w;
        yy yyVar = tyVar.M;
        if (TextUtils.isEmpty(tyVar.J)) {
            f2.q0 adapter = yyVar.f35059z0.getAdapter();
            py pyVar = yyVar.f35041u0;
            if (adapter != pyVar) {
                yyVar.f35059z0.setAdapter(pyVar);
            }
            tyVar.l();
            return;
        }
        int i10 = 1;
        int i11 = tyVar.I + 1;
        tyVar.I = i11;
        this.f32270b = i11;
        this.f32269a = tyVar.J;
        tyVar.f32914y = false;
        this.f32271c.clear();
        this.d.clear();
        this.f32272e.clear();
        this.f32273f.clear();
        this.h.clear();
        this.f32275r.clear();
        this.f32276s.clear();
        this.v.clear();
        yyVar.C0.e(true);
        if ("premium".equalsIgnoreCase(this.f32269a)) {
            Utilities.raceCallbacks(new lp(this, 16), new qy(this, i10));
        } else {
            Utilities.raceCallbacks(new lp(this, 16), new qy(this, 2), new qy(this, 3), new qy(this, 4), new qy(this, 5), new qy(this, 6), new qy(this, 7));
        }
    }
}
