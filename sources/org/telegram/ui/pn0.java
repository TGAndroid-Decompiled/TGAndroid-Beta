package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class pn0 {
    public boolean f40694f;
    public boolean f40695g;
    public boolean h;
    public Path f40696i;
    public Paint f40697j;
    public Drawable f40698k;
    public final org.telegram.ui.Components.dc f40699l;
    public boolean f40700m;
    public final org.telegram.ui.Components.t5 f40701n;
    public int f40702o;
    public final qn0 f40705r;
    public final Paint f40691a = new Paint(1);
    public final Paint f40692b = new Paint(1);
    public final Paint f40693c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f40703p = new RectF();
    public final RectF f40704q = new RectF();

    public pn0(qn0 qn0Var) {
        this.f40705r = qn0Var;
        this.f40699l = new org.telegram.ui.Components.dc(qn0Var);
        this.f40701n = new org.telegram.ui.Components.t5(qn0Var, 0L, 320L, org.telegram.ui.Components.gr.h);
    }

    public final void a(org.telegram.messenger.kp kpVar) {
        boolean a2;
        int e;
        int[] iArr;
        boolean z10;
        qn0 qn0Var = this.f40705r;
        org.telegram.ui.ActionBar.p6 p6Var = qn0Var.f41007a;
        if (kpVar == null) {
            return;
        }
        int[] iArr2 = kpVar.f16623g;
        int[] iArr3 = kpVar.h;
        if (p6Var == null) {
            a2 = org.telegram.ui.ActionBar.t6.I.q();
        } else {
            a2 = p6Var.a();
        }
        int i10 = qn0Var.f41009c;
        Paint paint = this.f40692b;
        Paint paint2 = this.f40691a;
        boolean z11 = true;
        if (i10 == 1) {
            if (a2 && kpVar.g() != kpVar.f() && kpVar.i() == kpVar.f()) {
                paint2.setColor(kpVar.e(1, p6Var));
                paint.setColor(kpVar.e(0, p6Var));
            } else {
                paint2.setColor(kpVar.e(0, p6Var));
                paint.setColor(kpVar.e(1, p6Var));
            }
            this.f40693c.setColor(kpVar.e(2, p6Var));
            int h = kpVar.h(a2);
            if (a2) {
                iArr = iArr3;
            } else {
                iArr = iArr2;
            }
            if (h != iArr[0]) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f40694f = z10;
            int j10 = kpVar.j(a2);
            if (a2) {
                iArr2 = iArr3;
            }
            if (j10 == iArr2[0]) {
                z11 = false;
            }
            this.f40695g = z11;
            return;
        }
        paint2.setColor(kpVar.e(0, p6Var));
        if (kpVar.o(a2)) {
            e = kpVar.e(1, p6Var);
        } else {
            e = kpVar.e(0, p6Var);
        }
        paint.setColor(e);
        this.f40694f = kpVar.o(a2);
        this.f40695g = false;
    }
}
