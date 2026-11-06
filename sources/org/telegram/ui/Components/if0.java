package org.telegram.ui.Components;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import android.view.View;
import java.util.Iterator;
public final class if0 {
    public static final float[] f34601m = new ColorMatrix().getArray();
    public static final float[] f34602n;
    public static final nb.a f34603o;
    public final oi.d f34604a;
    public final oi.c f34605b;
    public final dh.c f34606c;
    public final dh.c d;
    public final dh.c f34607e;
    public final ri.d f34608f;
    public final xe.b f34609g;
    public final xe.b h;
    public int f34610i;
    public boolean f34611j;
    public float f34612k;
    public float f34613l;

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.65f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.5f);
        f34602n = colorMatrix.getArray();
        f34603o = new nb.a(18);
    }

    public if0(oi.q qVar, oi.a aVar) {
        oi.c cVar;
        xe.b bVar = new xe.b();
        this.f34609g = bVar;
        xe.b bVar2 = new xe.b();
        this.h = bVar2;
        if (Build.VERSION.SDK_INT >= 31) {
            aVar.f21025l = true;
            oi.d dVar = aVar.f21021g;
            this.f34604a = dVar;
            if (dVar != null) {
                cVar = dVar.d(4);
            } else {
                cVar = null;
            }
            this.f34605b = cVar;
        } else {
            this.f34604a = null;
            this.f34605b = null;
        }
        hf0 hf0Var = new hf0(this, null);
        hf0 hf0Var2 = new hf0(this, new gf0(aVar.f21018c));
        dh.c cVar2 = new dh.c(hf0Var, hf0Var, hf0Var);
        cVar2.f8709j = qVar;
        cVar2.f8707g = bVar;
        cVar2.f8706f = bVar2;
        this.f34606c = cVar2;
        dh.c cVar3 = new dh.c(hf0Var2, hf0Var2, hf0Var2);
        cVar3.f8709j = qVar;
        cVar3.f8707g = bVar;
        cVar3.f8706f = bVar2;
        this.d = cVar3;
        cVar3.f8710k = true;
        ri.d dVar2 = new ri.d(hf0Var2, new gf0(aVar.f21020f));
        this.f34608f = dVar2;
        dh.c cVar4 = new dh.c(dVar2, dVar2, dVar2);
        cVar4.f8709j = qVar;
        cVar4.f8707g = bVar;
        cVar4.f8706f = bVar2;
        this.f34607e = cVar4;
        cVar4.f8710k = true;
    }

    public final void a() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((fh.g) it.next()).updateColors();
        }
        Iterator it2 = this.f34609g.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void b(float f10) {
        oi.d dVar;
        ColorMatrixColorFilter colorMatrixColorFilter;
        if (this.f34612k != f10) {
            this.f34612k = f10;
            if (Build.VERSION.SDK_INT >= 31 && (dVar = this.f34604a) != null) {
                if (f10 > 0.0f) {
                    float[] fArr = f34601m;
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        fArr2[i7] = org.telegram.messenger.g0.T1(fArr[i7], f34602n[i7], f10);
                    }
                    colorMatrixColorFilter = new ColorMatrixColorFilter(fArr2);
                } else {
                    colorMatrixColorFilter = null;
                }
                if (dVar.f21060k != colorMatrixColorFilter) {
                    dVar.f21060k = colorMatrixColorFilter;
                    for (int i10 = 0; i10 < dVar.f21053b; i10++) {
                        ((oi.b) dVar.f21052a.get(i10)).c(colorMatrixColorFilter);
                    }
                }
            }
            a();
        }
    }
}
