package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class fm0 {
    public boolean f47146f;
    public boolean f47147g;
    public boolean h;
    public Path f47148i;
    public Paint f47149j;
    public Drawable f47150k;
    public final org.telegram.ui.Components.dc f47151l;
    public boolean f47152m;
    public final org.telegram.ui.Components.u5 f47153n;
    public int f47154o;
    public final gm0 f47157r;
    public final Paint f47142a = new Paint(1);
    public final Paint f47143b = new Paint(1);
    public final Paint f47144c = new Paint(1);
    public final Path d = new Path();
    public final Path f47145e = new Path();
    public final RectF f47155p = new RectF();
    public final RectF f47156q = new RectF();

    public fm0(gm0 gm0Var) {
        this.f47157r = gm0Var;
        this.f47151l = new org.telegram.ui.Components.dc(gm0Var);
        this.f47153n = new org.telegram.ui.Components.u5(gm0Var, 0L, 320L, org.telegram.ui.Components.er.h);
    }

    public final void a(org.telegram.messenger.cp cpVar) {
        boolean a10;
        int e10;
        int[] iArr;
        boolean z10;
        gm0 gm0Var = this.f47157r;
        org.telegram.ui.ActionBar.e6 e6Var = gm0Var.f47469a;
        if (cpVar == null) {
            return;
        }
        int[] iArr2 = cpVar.f22922g;
        int[] iArr3 = cpVar.h;
        if (e6Var == null) {
            a10 = org.telegram.ui.ActionBar.j6.I.q();
        } else {
            a10 = e6Var.a();
        }
        int i7 = gm0Var.f47471c;
        Paint paint = this.f47143b;
        Paint paint2 = this.f47142a;
        boolean z11 = true;
        if (i7 == 1) {
            if (a10 && cpVar.g() != cpVar.f() && cpVar.i() == cpVar.f()) {
                paint2.setColor(cpVar.e(1, e6Var));
                paint.setColor(cpVar.e(0, e6Var));
            } else {
                paint2.setColor(cpVar.e(0, e6Var));
                paint.setColor(cpVar.e(1, e6Var));
            }
            this.f47144c.setColor(cpVar.e(2, e6Var));
            int h = cpVar.h(a10);
            if (a10) {
                iArr = iArr3;
            } else {
                iArr = iArr2;
            }
            if (h != iArr[0]) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f47146f = z10;
            int j3 = cpVar.j(a10);
            if (a10) {
                iArr2 = iArr3;
            }
            if (j3 == iArr2[0]) {
                z11 = false;
            }
            this.f47147g = z11;
            return;
        }
        paint2.setColor(cpVar.e(0, e6Var));
        if (cpVar.o(a10)) {
            e10 = cpVar.e(1, e6Var);
        } else {
            e10 = cpVar.e(0, e6Var);
        }
        paint.setColor(e10);
        this.f47146f = cpVar.o(a10);
        this.f47147g = false;
    }
}
