package org.telegram.ui.Components;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import android.view.View;
import java.util.Iterator;
public final class lf0 {
    public static final float[] f36766m = new ColorMatrix().getArray();
    public static final float[] f36767n;
    public static final sa.d f36768o;
    public final ri.d f36769a;
    public final ri.c f36770b;
    public final dh.c f36771c;
    public final dh.c d;
    public final dh.c f36772e;
    public final ui.d f36773f;
    public final xe.b f36774g;
    public final xe.b h;
    public int f36775i;
    public boolean f36776j;
    public float f36777k;
    public float f36778l;

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.65f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.5f);
        f36767n = colorMatrix.getArray();
        f36768o = new sa.d(18);
    }

    public lf0(ri.q qVar, ri.a aVar) {
        ri.c cVar;
        xe.b bVar = new xe.b();
        this.f36774g = bVar;
        xe.b bVar2 = new xe.b();
        this.h = bVar2;
        if (Build.VERSION.SDK_INT >= 31) {
            aVar.f56049l = true;
            ri.d dVar = aVar.f56045g;
            this.f36769a = dVar;
            if (dVar != null) {
                cVar = dVar.d(4);
            } else {
                cVar = null;
            }
            this.f36770b = cVar;
        } else {
            this.f36769a = null;
            this.f36770b = null;
        }
        kf0 kf0Var = new kf0(this, null);
        kf0 kf0Var2 = new kf0(this, new jf0(aVar.f56042c));
        dh.c cVar2 = new dh.c(kf0Var, kf0Var, kf0Var);
        cVar2.f8099j = qVar;
        cVar2.f8097g = bVar;
        cVar2.f8096f = bVar2;
        this.f36771c = cVar2;
        dh.c cVar3 = new dh.c(kf0Var2, kf0Var2, kf0Var2);
        cVar3.f8099j = qVar;
        cVar3.f8097g = bVar;
        cVar3.f8096f = bVar2;
        this.d = cVar3;
        cVar3.f8100k = true;
        ui.d dVar2 = new ui.d(kf0Var2, new jf0(aVar.f56044f));
        this.f36773f = dVar2;
        dh.c cVar4 = new dh.c(dVar2, dVar2, dVar2);
        cVar4.f8099j = qVar;
        cVar4.f8097g = bVar;
        cVar4.f8096f = bVar2;
        this.f36772e = cVar4;
        cVar4.f8100k = true;
    }

    public final void a() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((fh.g) it.next()).updateColors();
        }
        Iterator it2 = this.f36774g.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void b(float f10) {
        ri.d dVar;
        ColorMatrixColorFilter colorMatrixColorFilter;
        if (this.f36777k != f10) {
            this.f36777k = f10;
            if (Build.VERSION.SDK_INT >= 31 && (dVar = this.f36769a) != null) {
                if (f10 > 0.0f) {
                    float[] fArr = f36766m;
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        fArr2[i7] = org.telegram.messenger.g0.T1(fArr[i7], f36767n[i7], f10);
                    }
                    colorMatrixColorFilter = new ColorMatrixColorFilter(fArr2);
                } else {
                    colorMatrixColorFilter = null;
                }
                if (dVar.f56084k != colorMatrixColorFilter) {
                    dVar.f56084k = colorMatrixColorFilter;
                    for (int i10 = 0; i10 < dVar.f56077b; i10++) {
                        ((ri.b) dVar.f56076a.get(i10)).c(colorMatrixColorFilter);
                    }
                }
            }
            a();
        }
    }
}
