package org.telegram.ui.Components;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import android.view.View;
import java.util.Iterator;
public final class kg0 {
    public static final float[] f27748m = new ColorMatrix().getArray();
    public static final float[] f27749n;
    public static final t7.u f27750o;
    public final ei.e f27751a;
    public final ei.d f27752b;
    public final tg.b f27753c;
    public final tg.b d;
    public final tg.b e;
    public final hi.d f27754f;
    public final je.b f27755g;
    public final je.b h;
    public int f27756i;
    public boolean f27757j;
    public float f27758k;
    public float f27759l;

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.i0.i(colorMatrix, 0.65f);
        org.telegram.messenger.i0.n2(colorMatrix, 0.5f);
        f27749n = colorMatrix.getArray();
        f27750o = new t7.u(14);
    }

    public kg0(ei.r rVar, ei.b bVar) {
        ei.d dVar;
        je.b bVar2 = new je.b();
        this.f27755g = bVar2;
        je.b bVar3 = new je.b();
        this.h = bVar3;
        if (Build.VERSION.SDK_INT >= 31) {
            ei.e eVar = bVar.f6601g;
            this.f27751a = eVar;
            if (eVar != null) {
                dVar = eVar.d(4);
            } else {
                dVar = null;
            }
            this.f27752b = dVar;
        } else {
            this.f27751a = null;
            this.f27752b = null;
        }
        jg0 jg0Var = new jg0(this, null);
        jg0 jg0Var2 = new jg0(this, bVar.f6599c.f48697a);
        tg.b bVar4 = new tg.b(jg0Var);
        bVar4.h = rVar;
        bVar4.e = bVar2;
        bVar4.d = bVar3;
        this.f27753c = bVar4;
        tg.b bVar5 = new tg.b(jg0Var2);
        bVar5.h = rVar;
        bVar5.e = bVar2;
        bVar5.d = bVar3;
        this.d = bVar5;
        bVar5.f48702i = true;
        hi.d dVar2 = new hi.d(jg0Var2, bVar.f6600f.f48697a);
        this.f27754f = dVar2;
        tg.b bVar6 = new tg.b(dVar2);
        bVar6.h = rVar;
        bVar6.e = bVar2;
        bVar6.d = bVar3;
        this.e = bVar6;
        bVar6.f48702i = true;
    }

    public final void a() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((vg.f) it.next()).updateColors();
        }
        Iterator it2 = this.f27755g.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void b(float f7) {
        ei.e eVar;
        ColorMatrixColorFilter colorMatrixColorFilter;
        if (this.f27758k != f7) {
            this.f27758k = f7;
            if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f27751a) != null) {
                if (f7 > 0.0f) {
                    float[] fArr = f27748m;
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    for (int i10 = 0; i10 < length; i10++) {
                        fArr2[i10] = org.telegram.messenger.i0.T1(fArr[i10], f27749n[i10], f7);
                    }
                    colorMatrixColorFilter = new ColorMatrixColorFilter(fArr2);
                } else {
                    colorMatrixColorFilter = null;
                }
                if (eVar.f6636k != colorMatrixColorFilter) {
                    eVar.f6636k = colorMatrixColorFilter;
                    for (int i11 = 0; i11 < eVar.f6630b; i11++) {
                        ((ei.c) eVar.f6629a.get(i11)).c(colorMatrixColorFilter);
                    }
                }
            }
            a();
        }
    }
}
