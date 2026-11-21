package org.telegram.ui.Components;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import android.view.View;
import java.util.Iterator;
public final class xf0 {
    public static final float[] f42076m = new ColorMatrix().getArray();
    public static final float[] f42077n;
    public static final sa.d f42078o;
    public final ri.d f42079a;
    public final ri.c f42080b;
    public final dh.c f42081c;
    public final dh.c d;
    public final dh.c f42082e;
    public final ui.d f42083f;
    public final xe.b f42084g;
    public final xe.b h;
    public int f42085i;
    public boolean f42086j;
    public float f42087k;
    public float f42088l;

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.65f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.5f);
        f42077n = colorMatrix.getArray();
        f42078o = new sa.d(18);
    }

    public xf0(ri.q qVar, ri.a aVar) {
        ri.c cVar;
        xe.b bVar = new xe.b();
        this.f42084g = bVar;
        xe.b bVar2 = new xe.b();
        this.h = bVar2;
        if (Build.VERSION.SDK_INT >= 31) {
            aVar.f56664l = true;
            ri.d dVar = aVar.f56660g;
            this.f42079a = dVar;
            if (dVar != null) {
                cVar = dVar.d(4);
            } else {
                cVar = null;
            }
            this.f42080b = cVar;
        } else {
            this.f42079a = null;
            this.f42080b = null;
        }
        wf0 wf0Var = new wf0(this, null);
        wf0 wf0Var2 = new wf0(this, new vf0(aVar.f56657c));
        dh.c cVar2 = new dh.c(wf0Var, wf0Var, wf0Var);
        cVar2.f8407j = qVar;
        cVar2.f8405g = bVar;
        cVar2.f8404f = bVar2;
        this.f42081c = cVar2;
        dh.c cVar3 = new dh.c(wf0Var2, wf0Var2, wf0Var2);
        cVar3.f8407j = qVar;
        cVar3.f8405g = bVar;
        cVar3.f8404f = bVar2;
        this.d = cVar3;
        cVar3.f8408k = true;
        ui.d dVar2 = new ui.d(wf0Var2, new vf0(aVar.f56659f));
        this.f42083f = dVar2;
        dh.c cVar4 = new dh.c(dVar2, dVar2, dVar2);
        cVar4.f8407j = qVar;
        cVar4.f8405g = bVar;
        cVar4.f8404f = bVar2;
        this.f42082e = cVar4;
        cVar4.f8408k = true;
    }

    public final void a() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((fh.g) it.next()).updateColors();
        }
        Iterator it2 = this.f42084g.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void b(float f10) {
        ri.d dVar;
        ColorMatrixColorFilter colorMatrixColorFilter;
        if (this.f42087k != f10) {
            this.f42087k = f10;
            if (Build.VERSION.SDK_INT >= 31 && (dVar = this.f42079a) != null) {
                if (f10 > 0.0f) {
                    float[] fArr = f42076m;
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        fArr2[i7] = org.telegram.messenger.g0.T1(fArr[i7], f42077n[i7], f10);
                    }
                    colorMatrixColorFilter = new ColorMatrixColorFilter(fArr2);
                } else {
                    colorMatrixColorFilter = null;
                }
                if (dVar.f56699k != colorMatrixColorFilter) {
                    dVar.f56699k = colorMatrixColorFilter;
                    for (int i10 = 0; i10 < dVar.f56692b; i10++) {
                        ((ri.b) dVar.f56691a.get(i10)).c(colorMatrixColorFilter);
                    }
                }
            }
            a();
        }
    }
}
