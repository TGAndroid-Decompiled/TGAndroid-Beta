package org.telegram.ui.Components;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import android.view.View;
import java.util.Iterator;
public final class xf0 {
    public static final float[] f42023m = new ColorMatrix().getArray();
    public static final float[] f42024n;
    public static final sa.d f42025o;
    public final ri.d f42026a;
    public final ri.c f42027b;
    public final dh.c f42028c;
    public final dh.c d;
    public final dh.c f42029e;
    public final ui.d f42030f;
    public final xe.b f42031g;
    public final xe.b h;
    public int f42032i;
    public boolean f42033j;
    public float f42034k;
    public float f42035l;

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.65f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.5f);
        f42024n = colorMatrix.getArray();
        f42025o = new sa.d(18);
    }

    public xf0(ri.q qVar, ri.a aVar) {
        ri.c cVar;
        xe.b bVar = new xe.b();
        this.f42031g = bVar;
        xe.b bVar2 = new xe.b();
        this.h = bVar2;
        if (Build.VERSION.SDK_INT >= 31) {
            aVar.f56633l = true;
            ri.d dVar = aVar.f56629g;
            this.f42026a = dVar;
            if (dVar != null) {
                cVar = dVar.d(4);
            } else {
                cVar = null;
            }
            this.f42027b = cVar;
        } else {
            this.f42026a = null;
            this.f42027b = null;
        }
        wf0 wf0Var = new wf0(this, null);
        wf0 wf0Var2 = new wf0(this, new vf0(aVar.f56626c));
        dh.c cVar2 = new dh.c(wf0Var, wf0Var, wf0Var);
        cVar2.f8373j = qVar;
        cVar2.f8371g = bVar;
        cVar2.f8370f = bVar2;
        this.f42028c = cVar2;
        dh.c cVar3 = new dh.c(wf0Var2, wf0Var2, wf0Var2);
        cVar3.f8373j = qVar;
        cVar3.f8371g = bVar;
        cVar3.f8370f = bVar2;
        this.d = cVar3;
        cVar3.f8374k = true;
        ui.d dVar2 = new ui.d(wf0Var2, new vf0(aVar.f56628f));
        this.f42030f = dVar2;
        dh.c cVar4 = new dh.c(dVar2, dVar2, dVar2);
        cVar4.f8373j = qVar;
        cVar4.f8371g = bVar;
        cVar4.f8370f = bVar2;
        this.f42029e = cVar4;
        cVar4.f8374k = true;
    }

    public final void a() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((fh.g) it.next()).updateColors();
        }
        Iterator it2 = this.f42031g.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void b(float f10) {
        ri.d dVar;
        ColorMatrixColorFilter colorMatrixColorFilter;
        if (this.f42034k != f10) {
            this.f42034k = f10;
            if (Build.VERSION.SDK_INT >= 31 && (dVar = this.f42026a) != null) {
                if (f10 > 0.0f) {
                    float[] fArr = f42023m;
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        fArr2[i7] = org.telegram.messenger.g0.T1(fArr[i7], f42024n[i7], f10);
                    }
                    colorMatrixColorFilter = new ColorMatrixColorFilter(fArr2);
                } else {
                    colorMatrixColorFilter = null;
                }
                if (dVar.f56668k != colorMatrixColorFilter) {
                    dVar.f56668k = colorMatrixColorFilter;
                    for (int i10 = 0; i10 < dVar.f56661b; i10++) {
                        ((ri.b) dVar.f56660a.get(i10)).c(colorMatrixColorFilter);
                    }
                }
            }
            a();
        }
    }
}
