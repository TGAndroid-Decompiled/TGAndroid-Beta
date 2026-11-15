package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class em0 {
    public boolean f46872f;
    public boolean f46873g;
    public boolean h;
    public Path f46874i;
    public Paint f46875j;
    public Drawable f46876k;
    public final org.telegram.ui.Components.dc f46877l;
    public boolean f46878m;
    public final org.telegram.ui.Components.u5 f46879n;
    public int f46880o;
    public final fm0 f46883r;
    public final Paint f46868a = new Paint(1);
    public final Paint f46869b = new Paint(1);
    public final Paint f46870c = new Paint(1);
    public final Path d = new Path();
    public final Path f46871e = new Path();
    public final RectF f46881p = new RectF();
    public final RectF f46882q = new RectF();

    public em0(fm0 fm0Var) {
        this.f46883r = fm0Var;
        this.f46877l = new org.telegram.ui.Components.dc(fm0Var);
        this.f46879n = new org.telegram.ui.Components.u5(fm0Var, 0L, 320L, org.telegram.ui.Components.er.h);
    }

    public final void a(org.telegram.messenger.cp cpVar) {
        boolean a10;
        int e10;
        int[] iArr;
        boolean z10;
        fm0 fm0Var = this.f46883r;
        org.telegram.ui.ActionBar.e6 e6Var = fm0Var.f47158a;
        if (cpVar == null) {
            return;
        }
        int[] iArr2 = cpVar.f22918g;
        int[] iArr3 = cpVar.h;
        if (e6Var == null) {
            a10 = org.telegram.ui.ActionBar.j6.I.q();
        } else {
            a10 = e6Var.a();
        }
        int i7 = fm0Var.f47160c;
        Paint paint = this.f46869b;
        Paint paint2 = this.f46868a;
        boolean z11 = true;
        if (i7 == 1) {
            if (a10 && cpVar.g() != cpVar.f() && cpVar.i() == cpVar.f()) {
                paint2.setColor(cpVar.e(1, e6Var));
                paint.setColor(cpVar.e(0, e6Var));
            } else {
                paint2.setColor(cpVar.e(0, e6Var));
                paint.setColor(cpVar.e(1, e6Var));
            }
            this.f46870c.setColor(cpVar.e(2, e6Var));
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
            this.f46872f = z10;
            int j3 = cpVar.j(a10);
            if (a10) {
                iArr2 = iArr3;
            }
            if (j3 == iArr2[0]) {
                z11 = false;
            }
            this.f46873g = z11;
            return;
        }
        paint2.setColor(cpVar.e(0, e6Var));
        if (cpVar.o(a10)) {
            e10 = cpVar.e(1, e6Var);
        } else {
            e10 = cpVar.e(0, e6Var);
        }
        paint.setColor(e10);
        this.f46872f = cpVar.o(a10);
        this.f46873g = false;
    }
}
