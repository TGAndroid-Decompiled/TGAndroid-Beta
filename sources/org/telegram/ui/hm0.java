package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class hm0 {
    public boolean f48487f;
    public boolean f48488g;
    public boolean h;
    public Path f48489i;
    public Paint f48490j;
    public Drawable f48491k;
    public final org.telegram.ui.Components.mc f48492l;
    public boolean f48493m;
    public final org.telegram.ui.Components.d6 f48494n;
    public int f48495o;
    public final im0 f48498r;
    public final Paint f48483a = new Paint(1);
    public final Paint f48484b = new Paint(1);
    public final Paint f48485c = new Paint(1);
    public final Path d = new Path();
    public final Path f48486e = new Path();
    public final RectF f48496p = new RectF();
    public final RectF f48497q = new RectF();

    public hm0(im0 im0Var) {
        this.f48498r = im0Var;
        this.f48492l = new org.telegram.ui.Components.mc(im0Var);
        this.f48494n = new org.telegram.ui.Components.d6(im0Var, 0L, 320L, org.telegram.ui.Components.nr.h);
    }

    public final void a(org.telegram.messenger.cp cpVar) {
        boolean d;
        int e10;
        int[] iArr;
        boolean z10;
        im0 im0Var = this.f48498r;
        org.telegram.ui.ActionBar.h6 h6Var = im0Var.f48780a;
        if (cpVar == null) {
            return;
        }
        int[] iArr2 = cpVar.f23358g;
        int[] iArr3 = cpVar.h;
        if (h6Var == null) {
            d = org.telegram.ui.ActionBar.m6.I.q();
        } else {
            d = h6Var.d();
        }
        int i7 = im0Var.f48782c;
        Paint paint = this.f48484b;
        Paint paint2 = this.f48483a;
        boolean z11 = true;
        if (i7 == 1) {
            if (d && cpVar.g() != cpVar.f() && cpVar.i() == cpVar.f()) {
                paint2.setColor(cpVar.e(1, h6Var));
                paint.setColor(cpVar.e(0, h6Var));
            } else {
                paint2.setColor(cpVar.e(0, h6Var));
                paint.setColor(cpVar.e(1, h6Var));
            }
            this.f48485c.setColor(cpVar.e(2, h6Var));
            int h = cpVar.h(d);
            if (d) {
                iArr = iArr3;
            } else {
                iArr = iArr2;
            }
            if (h != iArr[0]) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f48487f = z10;
            int j3 = cpVar.j(d);
            if (d) {
                iArr2 = iArr3;
            }
            if (j3 == iArr2[0]) {
                z11 = false;
            }
            this.f48488g = z11;
            return;
        }
        paint2.setColor(cpVar.e(0, h6Var));
        if (cpVar.o(d)) {
            e10 = cpVar.e(1, h6Var);
        } else {
            e10 = cpVar.e(0, h6Var);
        }
        paint.setColor(e10);
        this.f48487f = cpVar.o(d);
        this.f48488g = false;
    }
}
