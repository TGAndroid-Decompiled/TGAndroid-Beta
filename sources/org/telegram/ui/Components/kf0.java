package org.telegram.ui.Components;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import android.view.View;
import java.util.Iterator;
public final class kf0 {
    public static final float[] f35382m = new ColorMatrix().getArray();
    public static final float[] f35383n;
    public static final mb.b f35384o;
    public final pi.d f35385a;
    public final pi.c f35386b;
    public final eh.c f35387c;
    public final eh.c d;
    public final eh.c f35388e;
    public final si.d f35389f;
    public final ue.b f35390g;
    public final ue.b h;
    public int f35391i;
    public boolean f35392j;
    public float f35393k;
    public float f35394l;

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.65f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.5f);
        f35383n = colorMatrix.getArray();
        f35384o = new mb.b(18);
    }

    public kf0(pi.q qVar, pi.a aVar) {
        pi.c cVar;
        ue.b bVar = new ue.b();
        this.f35390g = bVar;
        ue.b bVar2 = new ue.b();
        this.h = bVar2;
        if (Build.VERSION.SDK_INT >= 31) {
            pi.d dVar = aVar.f53528g;
            this.f35385a = dVar;
            if (dVar != null) {
                cVar = dVar.d(4);
            } else {
                cVar = null;
            }
            this.f35386b = cVar;
        } else {
            this.f35385a = null;
            this.f35386b = null;
        }
        jf0 jf0Var = new jf0(this, null);
        jf0 jf0Var2 = new jf0(this, new if0(aVar.f53525c));
        eh.c cVar2 = new eh.c(jf0Var, jf0Var, jf0Var);
        cVar2.f9987j = qVar;
        cVar2.f9985g = bVar;
        cVar2.f9984f = bVar2;
        this.f35387c = cVar2;
        eh.c cVar3 = new eh.c(jf0Var2, jf0Var2, jf0Var2);
        cVar3.f9987j = qVar;
        cVar3.f9985g = bVar;
        cVar3.f9984f = bVar2;
        this.d = cVar3;
        cVar3.f9988k = true;
        si.d dVar2 = new si.d(jf0Var2, new if0(aVar.f53527f));
        this.f35389f = dVar2;
        eh.c cVar4 = new eh.c(dVar2, dVar2, dVar2);
        cVar4.f9987j = qVar;
        cVar4.f9985g = bVar;
        cVar4.f9984f = bVar2;
        this.f35388e = cVar4;
        cVar4.f9988k = true;
    }

    public final void a() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((gh.g) it.next()).updateColors();
        }
        Iterator it2 = this.f35390g.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void b(float f10) {
        pi.d dVar;
        ColorMatrixColorFilter colorMatrixColorFilter;
        if (this.f35393k != f10) {
            this.f35393k = f10;
            if (Build.VERSION.SDK_INT >= 31 && (dVar = this.f35385a) != null) {
                if (f10 > 0.0f) {
                    float[] fArr = f35382m;
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        fArr2[i3] = org.telegram.messenger.g0.T1(fArr[i3], f35383n[i3], f10);
                    }
                    colorMatrixColorFilter = new ColorMatrixColorFilter(fArr2);
                } else {
                    colorMatrixColorFilter = null;
                }
                if (dVar.f53566k != colorMatrixColorFilter) {
                    dVar.f53566k = colorMatrixColorFilter;
                    for (int i10 = 0; i10 < dVar.f53559b; i10++) {
                        ((pi.b) dVar.f53558a.get(i10)).c(colorMatrixColorFilter);
                    }
                }
            }
            a();
        }
    }
}
