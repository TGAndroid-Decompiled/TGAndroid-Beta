package org.telegram.ui.Components;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import android.view.View;
import java.util.Iterator;
public final class vf0 {
    public static final float[] f40605m = new ColorMatrix().getArray();
    public static final float[] f40606n;
    public static final sa.d f40607o;
    public final ri.d f40608a;
    public final ri.c f40609b;
    public final dh.c f40610c;
    public final dh.c d;
    public final dh.c f40611e;
    public final ui.d f40612f;
    public final xe.b f40613g;
    public final xe.b h;
    public int f40614i;
    public boolean f40615j;
    public float f40616k;
    public float f40617l;

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.65f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.5f);
        f40606n = colorMatrix.getArray();
        f40607o = new sa.d(18);
    }

    public vf0(ri.q qVar, ri.a aVar) {
        ri.c cVar;
        xe.b bVar = new xe.b();
        this.f40613g = bVar;
        xe.b bVar2 = new xe.b();
        this.h = bVar2;
        if (Build.VERSION.SDK_INT >= 31) {
            aVar.f56623l = true;
            ri.d dVar = aVar.f56619g;
            this.f40608a = dVar;
            if (dVar != null) {
                cVar = dVar.d(4);
            } else {
                cVar = null;
            }
            this.f40609b = cVar;
        } else {
            this.f40608a = null;
            this.f40609b = null;
        }
        uf0 uf0Var = new uf0(this, null);
        uf0 uf0Var2 = new uf0(this, new tf0(aVar.f56616c));
        dh.c cVar2 = new dh.c(uf0Var, uf0Var, uf0Var);
        cVar2.f8378j = qVar;
        cVar2.f8376g = bVar;
        cVar2.f8375f = bVar2;
        this.f40610c = cVar2;
        dh.c cVar3 = new dh.c(uf0Var2, uf0Var2, uf0Var2);
        cVar3.f8378j = qVar;
        cVar3.f8376g = bVar;
        cVar3.f8375f = bVar2;
        this.d = cVar3;
        cVar3.f8379k = true;
        ui.d dVar2 = new ui.d(uf0Var2, new tf0(aVar.f56618f));
        this.f40612f = dVar2;
        dh.c cVar4 = new dh.c(dVar2, dVar2, dVar2);
        cVar4.f8378j = qVar;
        cVar4.f8376g = bVar;
        cVar4.f8375f = bVar2;
        this.f40611e = cVar4;
        cVar4.f8379k = true;
    }

    public final void a() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((fh.g) it.next()).updateColors();
        }
        Iterator it2 = this.f40613g.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void b(float f10) {
        ri.d dVar;
        ColorMatrixColorFilter colorMatrixColorFilter;
        if (this.f40616k != f10) {
            this.f40616k = f10;
            if (Build.VERSION.SDK_INT >= 31 && (dVar = this.f40608a) != null) {
                if (f10 > 0.0f) {
                    float[] fArr = f40605m;
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        fArr2[i7] = org.telegram.messenger.g0.T1(fArr[i7], f40606n[i7], f10);
                    }
                    colorMatrixColorFilter = new ColorMatrixColorFilter(fArr2);
                } else {
                    colorMatrixColorFilter = null;
                }
                if (dVar.f56658k != colorMatrixColorFilter) {
                    dVar.f56658k = colorMatrixColorFilter;
                    for (int i10 = 0; i10 < dVar.f56651b; i10++) {
                        ((ri.b) dVar.f56650a.get(i10)).c(colorMatrixColorFilter);
                    }
                }
            }
            a();
        }
    }
}
