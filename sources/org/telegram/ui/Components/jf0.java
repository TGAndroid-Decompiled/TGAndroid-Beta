package org.telegram.ui.Components;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import android.view.View;
import java.util.Iterator;
public final class jf0 {
    public static final float[] f34993m = new ColorMatrix().getArray();
    public static final float[] f34994n;
    public static final nb.a f34995o;
    public final oi.d f34996a;
    public final oi.c f34997b;
    public final dh.c f34998c;
    public final dh.c d;
    public final dh.c f34999e;
    public final ri.d f35000f;
    public final xe.b f35001g;
    public final xe.b h;
    public int f35002i;
    public boolean f35003j;
    public float f35004k;
    public float f35005l;

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.65f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.5f);
        f34994n = colorMatrix.getArray();
        f34995o = new nb.a(18);
    }

    public jf0(oi.q qVar, oi.a aVar) {
        oi.c cVar;
        xe.b bVar = new xe.b();
        this.f35001g = bVar;
        xe.b bVar2 = new xe.b();
        this.h = bVar2;
        if (Build.VERSION.SDK_INT >= 31) {
            aVar.f21028l = true;
            oi.d dVar = aVar.f21024g;
            this.f34996a = dVar;
            if (dVar != null) {
                cVar = dVar.d(4);
            } else {
                cVar = null;
            }
            this.f34997b = cVar;
        } else {
            this.f34996a = null;
            this.f34997b = null;
        }
        if0 if0Var = new if0(this, null);
        if0 if0Var2 = new if0(this, new hf0(aVar.f21021c));
        dh.c cVar2 = new dh.c(if0Var, if0Var, if0Var);
        cVar2.f8707j = qVar;
        cVar2.f8705g = bVar;
        cVar2.f8704f = bVar2;
        this.f34998c = cVar2;
        dh.c cVar3 = new dh.c(if0Var2, if0Var2, if0Var2);
        cVar3.f8707j = qVar;
        cVar3.f8705g = bVar;
        cVar3.f8704f = bVar2;
        this.d = cVar3;
        cVar3.f8708k = true;
        ri.d dVar2 = new ri.d(if0Var2, new hf0(aVar.f21023f));
        this.f35000f = dVar2;
        dh.c cVar4 = new dh.c(dVar2, dVar2, dVar2);
        cVar4.f8707j = qVar;
        cVar4.f8705g = bVar;
        cVar4.f8704f = bVar2;
        this.f34999e = cVar4;
        cVar4.f8708k = true;
    }

    public final void a() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((fh.g) it.next()).updateColors();
        }
        Iterator it2 = this.f35001g.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void b(float f10) {
        oi.d dVar;
        ColorMatrixColorFilter colorMatrixColorFilter;
        if (this.f35004k != f10) {
            this.f35004k = f10;
            if (Build.VERSION.SDK_INT >= 31 && (dVar = this.f34996a) != null) {
                if (f10 > 0.0f) {
                    float[] fArr = f34993m;
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        fArr2[i7] = org.telegram.messenger.g0.T1(fArr[i7], f34994n[i7], f10);
                    }
                    colorMatrixColorFilter = new ColorMatrixColorFilter(fArr2);
                } else {
                    colorMatrixColorFilter = null;
                }
                if (dVar.f21063k != colorMatrixColorFilter) {
                    dVar.f21063k = colorMatrixColorFilter;
                    for (int i10 = 0; i10 < dVar.f21056b; i10++) {
                        ((oi.b) dVar.f21055a.get(i10)).c(colorMatrixColorFilter);
                    }
                }
            }
            a();
        }
    }
}
