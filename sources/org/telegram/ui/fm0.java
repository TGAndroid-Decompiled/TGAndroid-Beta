package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class fm0 {
    public boolean f47921f;
    public boolean f47922g;
    public boolean h;
    public Path f47923i;
    public Paint f47924j;
    public Drawable f47925k;
    public final org.telegram.ui.Components.lc f47926l;
    public boolean f47927m;
    public final org.telegram.ui.Components.c6 f47928n;
    public int f47929o;
    public final gm0 f47932r;
    public final Paint f47917a = new Paint(1);
    public final Paint f47918b = new Paint(1);
    public final Paint f47919c = new Paint(1);
    public final Path d = new Path();
    public final Path f47920e = new Path();
    public final RectF f47930p = new RectF();
    public final RectF f47931q = new RectF();

    public fm0(gm0 gm0Var) {
        this.f47932r = gm0Var;
        this.f47926l = new org.telegram.ui.Components.lc(gm0Var);
        this.f47928n = new org.telegram.ui.Components.c6(gm0Var, 0L, 320L, org.telegram.ui.Components.kr.h);
    }

    public final void a(org.telegram.messenger.bp bpVar) {
        boolean b10;
        int e10;
        int[] iArr;
        boolean z10;
        gm0 gm0Var = this.f47932r;
        org.telegram.ui.ActionBar.i6 i6Var = gm0Var.f48319a;
        if (bpVar == null) {
            return;
        }
        int[] iArr2 = bpVar.f23241g;
        int[] iArr3 = bpVar.h;
        if (i6Var == null) {
            b10 = org.telegram.ui.ActionBar.n6.I.q();
        } else {
            b10 = i6Var.b();
        }
        int i7 = gm0Var.f48321c;
        Paint paint = this.f47918b;
        Paint paint2 = this.f47917a;
        boolean z11 = true;
        if (i7 == 1) {
            if (b10 && bpVar.g() != bpVar.f() && bpVar.i() == bpVar.f()) {
                paint2.setColor(bpVar.e(1, i6Var));
                paint.setColor(bpVar.e(0, i6Var));
            } else {
                paint2.setColor(bpVar.e(0, i6Var));
                paint.setColor(bpVar.e(1, i6Var));
            }
            this.f47919c.setColor(bpVar.e(2, i6Var));
            int h = bpVar.h(b10);
            if (b10) {
                iArr = iArr3;
            } else {
                iArr = iArr2;
            }
            if (h != iArr[0]) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f47921f = z10;
            int j3 = bpVar.j(b10);
            if (b10) {
                iArr2 = iArr3;
            }
            if (j3 == iArr2[0]) {
                z11 = false;
            }
            this.f47922g = z11;
            return;
        }
        paint2.setColor(bpVar.e(0, i6Var));
        if (bpVar.o(b10)) {
            e10 = bpVar.e(1, i6Var);
        } else {
            e10 = bpVar.e(0, i6Var);
        }
        paint.setColor(e10);
        this.f47921f = bpVar.o(b10);
        this.f47922g = false;
    }
}
