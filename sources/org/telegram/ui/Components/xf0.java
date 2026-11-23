package org.telegram.ui.Components;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import android.view.View;
import java.util.Iterator;
public final class xf0 {
    public static final float[] f42069m = new ColorMatrix().getArray();
    public static final float[] f42070n;
    public static final sa.d f42071o;
    public final ri.d f42072a;
    public final ri.c f42073b;
    public final dh.c f42074c;
    public final dh.c d;
    public final dh.c f42075e;
    public final ui.d f42076f;
    public final xe.b f42077g;
    public final xe.b h;
    public int f42078i;
    public boolean f42079j;
    public float f42080k;
    public float f42081l;

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.65f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.5f);
        f42070n = colorMatrix.getArray();
        f42071o = new sa.d(18);
    }

    public xf0(ri.q qVar, ri.a aVar) {
        ri.c cVar;
        xe.b bVar = new xe.b();
        this.f42077g = bVar;
        xe.b bVar2 = new xe.b();
        this.h = bVar2;
        if (Build.VERSION.SDK_INT >= 31) {
            aVar.f56668l = true;
            ri.d dVar = aVar.f56664g;
            this.f42072a = dVar;
            if (dVar != null) {
                cVar = dVar.d(4);
            } else {
                cVar = null;
            }
            this.f42073b = cVar;
        } else {
            this.f42072a = null;
            this.f42073b = null;
        }
        wf0 wf0Var = new wf0(this, null);
        wf0 wf0Var2 = new wf0(this, new vf0(aVar.f56661c));
        dh.c cVar2 = new dh.c(wf0Var, wf0Var, wf0Var);
        cVar2.f8410j = qVar;
        cVar2.f8408g = bVar;
        cVar2.f8407f = bVar2;
        this.f42074c = cVar2;
        dh.c cVar3 = new dh.c(wf0Var2, wf0Var2, wf0Var2);
        cVar3.f8410j = qVar;
        cVar3.f8408g = bVar;
        cVar3.f8407f = bVar2;
        this.d = cVar3;
        cVar3.f8411k = true;
        ui.d dVar2 = new ui.d(wf0Var2, new vf0(aVar.f56663f));
        this.f42076f = dVar2;
        dh.c cVar4 = new dh.c(dVar2, dVar2, dVar2);
        cVar4.f8410j = qVar;
        cVar4.f8408g = bVar;
        cVar4.f8407f = bVar2;
        this.f42075e = cVar4;
        cVar4.f8411k = true;
    }

    public final void a() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((fh.g) it.next()).updateColors();
        }
        Iterator it2 = this.f42077g.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void b(float f10) {
        ri.d dVar;
        ColorMatrixColorFilter colorMatrixColorFilter;
        if (this.f42080k != f10) {
            this.f42080k = f10;
            if (Build.VERSION.SDK_INT >= 31 && (dVar = this.f42072a) != null) {
                if (f10 > 0.0f) {
                    float[] fArr = f42069m;
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        fArr2[i7] = org.telegram.messenger.g0.T1(fArr[i7], f42070n[i7], f10);
                    }
                    colorMatrixColorFilter = new ColorMatrixColorFilter(fArr2);
                } else {
                    colorMatrixColorFilter = null;
                }
                if (dVar.f56703k != colorMatrixColorFilter) {
                    dVar.f56703k = colorMatrixColorFilter;
                    for (int i10 = 0; i10 < dVar.f56696b; i10++) {
                        ((ri.b) dVar.f56695a.get(i10)).c(colorMatrixColorFilter);
                    }
                }
            }
            a();
        }
    }
}
