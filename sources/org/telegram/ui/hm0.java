package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class hm0 {
    public boolean f48483f;
    public boolean f48484g;
    public boolean h;
    public Path f48485i;
    public Paint f48486j;
    public Drawable f48487k;
    public final org.telegram.ui.Components.mc f48488l;
    public boolean f48489m;
    public final org.telegram.ui.Components.d6 f48490n;
    public int f48491o;
    public final im0 f48494r;
    public final Paint f48479a = new Paint(1);
    public final Paint f48480b = new Paint(1);
    public final Paint f48481c = new Paint(1);
    public final Path d = new Path();
    public final Path f48482e = new Path();
    public final RectF f48492p = new RectF();
    public final RectF f48493q = new RectF();

    public hm0(im0 im0Var) {
        this.f48494r = im0Var;
        this.f48488l = new org.telegram.ui.Components.mc(im0Var);
        this.f48490n = new org.telegram.ui.Components.d6(im0Var, 0L, 320L, org.telegram.ui.Components.nr.h);
    }

    public final void a(org.telegram.messenger.bp bpVar) {
        boolean d;
        int e10;
        int[] iArr;
        boolean z10;
        im0 im0Var = this.f48494r;
        org.telegram.ui.ActionBar.h6 h6Var = im0Var.f48776a;
        if (bpVar == null) {
            return;
        }
        int[] iArr2 = bpVar.f23144g;
        int[] iArr3 = bpVar.h;
        if (h6Var == null) {
            d = org.telegram.ui.ActionBar.m6.I.q();
        } else {
            d = h6Var.d();
        }
        int i7 = im0Var.f48778c;
        Paint paint = this.f48480b;
        Paint paint2 = this.f48479a;
        boolean z11 = true;
        if (i7 == 1) {
            if (d && bpVar.g() != bpVar.f() && bpVar.i() == bpVar.f()) {
                paint2.setColor(bpVar.e(1, h6Var));
                paint.setColor(bpVar.e(0, h6Var));
            } else {
                paint2.setColor(bpVar.e(0, h6Var));
                paint.setColor(bpVar.e(1, h6Var));
            }
            this.f48481c.setColor(bpVar.e(2, h6Var));
            int h = bpVar.h(d);
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
            this.f48483f = z10;
            int j3 = bpVar.j(d);
            if (d) {
                iArr2 = iArr3;
            }
            if (j3 == iArr2[0]) {
                z11 = false;
            }
            this.f48484g = z11;
            return;
        }
        paint2.setColor(bpVar.e(0, h6Var));
        if (bpVar.o(d)) {
            e10 = bpVar.e(1, h6Var);
        } else {
            e10 = bpVar.e(0, h6Var);
        }
        paint.setColor(e10);
        this.f48483f = bpVar.o(d);
        this.f48484g = false;
    }
}
