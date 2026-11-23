package org.telegram.ui.Components;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import android.view.View;
import java.util.Iterator;
public final class wf0 {
    public static final float[] f41630m = new ColorMatrix().getArray();
    public static final float[] f41631n;
    public static final sa.d f41632o;
    public final ri.d f41633a;
    public final ri.c f41634b;
    public final dh.c f41635c;
    public final dh.c d;
    public final dh.c f41636e;
    public final ui.d f41637f;
    public final xe.b f41638g;
    public final xe.b h;
    public int f41639i;
    public boolean f41640j;
    public float f41641k;
    public float f41642l;

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.65f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.5f);
        f41631n = colorMatrix.getArray();
        f41632o = new sa.d(18);
    }

    public wf0(ri.q qVar, ri.a aVar) {
        ri.c cVar;
        xe.b bVar = new xe.b();
        this.f41638g = bVar;
        xe.b bVar2 = new xe.b();
        this.h = bVar2;
        if (Build.VERSION.SDK_INT >= 31) {
            aVar.f56746l = true;
            ri.d dVar = aVar.f56742g;
            this.f41633a = dVar;
            if (dVar != null) {
                cVar = dVar.d(4);
            } else {
                cVar = null;
            }
            this.f41634b = cVar;
        } else {
            this.f41633a = null;
            this.f41634b = null;
        }
        vf0 vf0Var = new vf0(this, null);
        vf0 vf0Var2 = new vf0(this, new uf0(aVar.f56739c));
        dh.c cVar2 = new dh.c(vf0Var, vf0Var, vf0Var);
        cVar2.f8372j = qVar;
        cVar2.f8370g = bVar;
        cVar2.f8369f = bVar2;
        this.f41635c = cVar2;
        dh.c cVar3 = new dh.c(vf0Var2, vf0Var2, vf0Var2);
        cVar3.f8372j = qVar;
        cVar3.f8370g = bVar;
        cVar3.f8369f = bVar2;
        this.d = cVar3;
        cVar3.f8373k = true;
        ui.d dVar2 = new ui.d(vf0Var2, new uf0(aVar.f56741f));
        this.f41637f = dVar2;
        dh.c cVar4 = new dh.c(dVar2, dVar2, dVar2);
        cVar4.f8372j = qVar;
        cVar4.f8370g = bVar;
        cVar4.f8369f = bVar2;
        this.f41636e = cVar4;
        cVar4.f8373k = true;
    }

    public final void a() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((fh.g) it.next()).updateColors();
        }
        Iterator it2 = this.f41638g.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void b(float f10) {
        ri.d dVar;
        ColorMatrixColorFilter colorMatrixColorFilter;
        if (this.f41641k != f10) {
            this.f41641k = f10;
            if (Build.VERSION.SDK_INT >= 31 && (dVar = this.f41633a) != null) {
                if (f10 > 0.0f) {
                    float[] fArr = f41630m;
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        fArr2[i7] = org.telegram.messenger.g0.T1(fArr[i7], f41631n[i7], f10);
                    }
                    colorMatrixColorFilter = new ColorMatrixColorFilter(fArr2);
                } else {
                    colorMatrixColorFilter = null;
                }
                if (dVar.f56781k != colorMatrixColorFilter) {
                    dVar.f56781k = colorMatrixColorFilter;
                    for (int i10 = 0; i10 < dVar.f56774b; i10++) {
                        ((ri.b) dVar.f56773a.get(i10)).c(colorMatrixColorFilter);
                    }
                }
            }
            a();
        }
    }
}
