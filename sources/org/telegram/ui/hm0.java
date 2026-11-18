package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class hm0 {
    public boolean f48440f;
    public boolean f48441g;
    public boolean h;
    public Path f48442i;
    public Paint f48443j;
    public Drawable f48444k;
    public final org.telegram.ui.Components.mc f48445l;
    public boolean f48446m;
    public final org.telegram.ui.Components.c6 f48447n;
    public int f48448o;
    public final im0 f48451r;
    public final Paint f48436a = new Paint(1);
    public final Paint f48437b = new Paint(1);
    public final Paint f48438c = new Paint(1);
    public final Path d = new Path();
    public final Path f48439e = new Path();
    public final RectF f48449p = new RectF();
    public final RectF f48450q = new RectF();

    public hm0(im0 im0Var) {
        this.f48451r = im0Var;
        this.f48445l = new org.telegram.ui.Components.mc(im0Var);
        this.f48447n = new org.telegram.ui.Components.c6(im0Var, 0L, 320L, org.telegram.ui.Components.lr.h);
    }

    public final void a(org.telegram.messenger.bp bpVar) {
        boolean d;
        int e10;
        int[] iArr;
        boolean z10;
        im0 im0Var = this.f48451r;
        org.telegram.ui.ActionBar.i6 i6Var = im0Var.f48754a;
        if (bpVar == null) {
            return;
        }
        int[] iArr2 = bpVar.f23116g;
        int[] iArr3 = bpVar.h;
        if (i6Var == null) {
            d = org.telegram.ui.ActionBar.n6.I.q();
        } else {
            d = i6Var.d();
        }
        int i7 = im0Var.f48756c;
        Paint paint = this.f48437b;
        Paint paint2 = this.f48436a;
        boolean z11 = true;
        if (i7 == 1) {
            if (d && bpVar.g() != bpVar.f() && bpVar.i() == bpVar.f()) {
                paint2.setColor(bpVar.e(1, i6Var));
                paint.setColor(bpVar.e(0, i6Var));
            } else {
                paint2.setColor(bpVar.e(0, i6Var));
                paint.setColor(bpVar.e(1, i6Var));
            }
            this.f48438c.setColor(bpVar.e(2, i6Var));
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
            this.f48440f = z10;
            int j3 = bpVar.j(d);
            if (d) {
                iArr2 = iArr3;
            }
            if (j3 == iArr2[0]) {
                z11 = false;
            }
            this.f48441g = z11;
            return;
        }
        paint2.setColor(bpVar.e(0, i6Var));
        if (bpVar.o(d)) {
            e10 = bpVar.e(1, i6Var);
        } else {
            e10 = bpVar.e(0, i6Var);
        }
        paint.setColor(e10);
        this.f48440f = bpVar.o(d);
        this.f48441g = false;
    }
}
