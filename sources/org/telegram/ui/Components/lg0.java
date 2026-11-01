package org.telegram.ui.Components;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import android.view.View;
import java.util.Iterator;
public final class lg0 {
    public static final float[] f28154m = new ColorMatrix().getArray();
    public static final float[] f28155n;
    public static final t7.u f28156o;
    public final ei.e f28157a;
    public final ei.d f28158b;
    public final tg.b f28159c;
    public final tg.b d;
    public final tg.b e;
    public final hi.d f28160f;
    public final je.b f28161g;
    public final je.b h;
    public int f28162i;
    public boolean f28163j;
    public float f28164k;
    public float f28165l;

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.i0.i(colorMatrix, 0.65f);
        org.telegram.messenger.i0.n2(colorMatrix, 0.5f);
        f28155n = colorMatrix.getArray();
        f28156o = new t7.u(14);
    }

    public lg0(ei.r rVar, ei.b bVar) {
        ei.d dVar;
        je.b bVar2 = new je.b();
        this.f28161g = bVar2;
        je.b bVar3 = new je.b();
        this.h = bVar3;
        if (Build.VERSION.SDK_INT >= 31) {
            ei.e eVar = bVar.f6601g;
            this.f28157a = eVar;
            if (eVar != null) {
                dVar = eVar.d(4);
            } else {
                dVar = null;
            }
            this.f28158b = dVar;
        } else {
            this.f28157a = null;
            this.f28158b = null;
        }
        kg0 kg0Var = new kg0(this, null);
        kg0 kg0Var2 = new kg0(this, new jg0(bVar.f6599c));
        tg.b bVar4 = new tg.b(kg0Var, kg0Var, kg0Var);
        bVar4.f48714j = rVar;
        bVar4.f48712g = bVar2;
        bVar4.f48711f = bVar3;
        this.f28159c = bVar4;
        tg.b bVar5 = new tg.b(kg0Var2, kg0Var2, kg0Var2);
        bVar5.f48714j = rVar;
        bVar5.f48712g = bVar2;
        bVar5.f48711f = bVar3;
        this.d = bVar5;
        bVar5.f48715k = true;
        hi.d dVar2 = new hi.d(kg0Var2, new jg0(bVar.f6600f));
        this.f28160f = dVar2;
        tg.b bVar6 = new tg.b(dVar2, dVar2, dVar2);
        bVar6.f48714j = rVar;
        bVar6.f48712g = bVar2;
        bVar6.f48711f = bVar3;
        this.e = bVar6;
        bVar6.f48715k = true;
    }

    public final void a() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((vg.f) it.next()).updateColors();
        }
        Iterator it2 = this.f28161g.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void b(float f7) {
        ei.e eVar;
        ColorMatrixColorFilter colorMatrixColorFilter;
        if (this.f28164k != f7) {
            this.f28164k = f7;
            if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f28157a) != null) {
                if (f7 > 0.0f) {
                    float[] fArr = f28154m;
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    for (int i10 = 0; i10 < length; i10++) {
                        fArr2[i10] = org.telegram.messenger.i0.T1(fArr[i10], f28155n[i10], f7);
                    }
                    colorMatrixColorFilter = new ColorMatrixColorFilter(fArr2);
                } else {
                    colorMatrixColorFilter = null;
                }
                if (eVar.f6637k != colorMatrixColorFilter) {
                    eVar.f6637k = colorMatrixColorFilter;
                    for (int i11 = 0; i11 < eVar.f6631b; i11++) {
                        ((ei.c) eVar.f6630a.get(i11)).c(colorMatrixColorFilter);
                    }
                }
            }
            a();
        }
    }
}
