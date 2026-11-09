package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class fm0 {
    public boolean f45747f;
    public boolean f45748g;
    public boolean h;
    public Path f45749i;
    public Paint f45750j;
    public Drawable f45751k;
    public final org.telegram.ui.Components.ic f45752l;
    public boolean f45753m;
    public final org.telegram.ui.Components.w5 f45754n;
    public int f45755o;
    public final gm0 f45758r;
    public final Paint f45743a = new Paint(1);
    public final Paint f45744b = new Paint(1);
    public final Paint f45745c = new Paint(1);
    public final Path d = new Path();
    public final Path f45746e = new Path();
    public final RectF f45756p = new RectF();
    public final RectF f45757q = new RectF();

    public fm0(gm0 gm0Var) {
        this.f45758r = gm0Var;
        this.f45752l = new org.telegram.ui.Components.ic(gm0Var);
        this.f45754n = new org.telegram.ui.Components.w5(gm0Var, 0L, 320L, org.telegram.ui.Components.xq.h);
    }

    public final void a(org.telegram.messenger.fp fpVar) {
        boolean a10;
        int e10;
        int[] iArr;
        boolean z9;
        gm0 gm0Var = this.f45758r;
        org.telegram.ui.ActionBar.g6 g6Var = gm0Var.f46035a;
        if (fpVar == null) {
            return;
        }
        int[] iArr2 = fpVar.f22454g;
        int[] iArr3 = fpVar.h;
        if (g6Var == null) {
            a10 = org.telegram.ui.ActionBar.l6.I.q();
        } else {
            a10 = g6Var.a();
        }
        int i7 = gm0Var.f46037c;
        Paint paint = this.f45744b;
        Paint paint2 = this.f45743a;
        boolean z10 = true;
        if (i7 == 1) {
            if (a10 && fpVar.g() != fpVar.f() && fpVar.i() == fpVar.f()) {
                paint2.setColor(fpVar.e(1, g6Var));
                paint.setColor(fpVar.e(0, g6Var));
            } else {
                paint2.setColor(fpVar.e(0, g6Var));
                paint.setColor(fpVar.e(1, g6Var));
            }
            this.f45745c.setColor(fpVar.e(2, g6Var));
            int h = fpVar.h(a10);
            if (a10) {
                iArr = iArr3;
            } else {
                iArr = iArr2;
            }
            if (h != iArr[0]) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f45747f = z9;
            int j3 = fpVar.j(a10);
            if (a10) {
                iArr2 = iArr3;
            }
            if (j3 == iArr2[0]) {
                z10 = false;
            }
            this.f45748g = z10;
            return;
        }
        paint2.setColor(fpVar.e(0, g6Var));
        if (fpVar.o(a10)) {
            e10 = fpVar.e(1, g6Var);
        } else {
            e10 = fpVar.e(0, g6Var);
        }
        paint.setColor(e10);
        this.f45747f = fpVar.o(a10);
        this.f45748g = false;
    }
}
